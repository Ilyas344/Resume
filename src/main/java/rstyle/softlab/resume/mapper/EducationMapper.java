package rstyle.softlab.resume.mapper;

import org.mapstruct.*;
import rstyle.softlab.resume.DTO.EducationDto;
import rstyle.softlab.resume.model.education.Education;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EducationMapper {
    Education toEntity(EducationDto educationDto);

    EducationDto toDto(Education education);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Education partialUpdate(EducationDto educationDto, @MappingTarget Education education);

    Education updateWithNull(EducationDto educationDto, @MappingTarget Education education);
}