package rstyle.softlab.resume.mapper;

import org.mapstruct.*;
import rstyle.softlab.resume.DTO.ResumeDto;
import rstyle.softlab.resume.model.Resume;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = { InstitutionMapper.class, ExperienceMapper.class, ProjectMapper.class})
public interface ResumeMapper {
    Resume toEntity(ResumeDto resumeDto);

    ResumeDto toDto(Resume resume);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Resume partialUpdate(ResumeDto resumeDto, @MappingTarget Resume resume);

    Resume updateWithNull(ResumeDto resumeDto, @MappingTarget Resume resume);
}