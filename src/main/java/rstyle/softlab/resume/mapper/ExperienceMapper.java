package rstyle.softlab.resume.mapper;

import org.mapstruct.*;
import rstyle.softlab.resume.DTO.ExperienceDto;
import rstyle.softlab.resume.model.experience.Experience;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {CompanyMapper.class})
public interface ExperienceMapper {
    Experience toEntity(ExperienceDto experienceDto);

    ExperienceDto toDto(Experience experience);

//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    Experience partialUpdate(ExperienceDto experienceDto, @MappingTarget Experience experience);
//
//    Experience updateWithNull(ExperienceDto experienceDto, @MappingTarget Experience experience);
}