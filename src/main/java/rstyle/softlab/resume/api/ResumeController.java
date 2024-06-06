package rstyle.softlab.resume.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import rstyle.softlab.resume.DTO.ResumeDto;
import rstyle.softlab.resume.mapper.ResumeMapper;
import rstyle.softlab.resume.model.Resume;
import rstyle.softlab.resume.repository.ResumeRepository;

import java.io.IOException;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/resume")
@RequiredArgsConstructor
public class ResumeController {

    private final ResumeRepository resumeRepository;

    private final ResumeMapper resumeMapper;


    @GetMapping
    public Page<ResumeDto> getList(Pageable pageable) {
        Page<Resume> resumes = resumeRepository.findAll(pageable);
        return resumes.map(resumeMapper::toDto);
    }

    @GetMapping("/{id}")
    public ResumeDto getResume(@PathVariable Long id) {
        Optional<Resume> resumeOptional = resumeRepository.findById(id);
        return resumeMapper.toDto(resumeOptional.orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Entity not found  with id"+id)));
    }


    @PostMapping
    public ResponseEntity<ResumeDto> create(@RequestBody ResumeDto dto) {
        Resume resume = resumeMapper.toEntity(dto);
        Resume resultResume = resumeRepository.save(resume);
        return ResponseEntity.status(HttpStatus.CREATED).body(resumeMapper.toDto(resultResume));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Resume resume = resumeRepository.findById(id).orElse(null);
        if (resume != null) {
            resumeRepository.delete(resume);
        }
        return ResponseEntity.noContent().build();
    }


}
