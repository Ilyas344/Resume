package rstyle.softlab.resume.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rstyle.softlab.resume.DTO.UserDto;
import rstyle.softlab.resume.mapper.UserMapper;
import rstyle.softlab.resume.model.User;
import rstyle.softlab.resume.repository.UserRepository;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    private final UserMapper userMapper;


    @PostMapping
    public ResponseEntity<UserDto> create(@RequestBody UserDto dto) {
        User user = userMapper.toEntity(dto);
        User resultUser = userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userMapper.toDto(resultUser));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            userRepository.delete(user);
        }
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
