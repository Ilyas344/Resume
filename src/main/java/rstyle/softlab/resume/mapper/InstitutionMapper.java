package rstyle.softlab.resume.mapper;

import org.mapstruct.*;
import rstyle.softlab.resume.DTO.InstitutionDto;
import rstyle.softlab.resume.model.education.Institution;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface InstitutionMapper {
    Institution toEntity(InstitutionDto institutionDto);

    InstitutionDto toDto(Institution institution);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Institution partialUpdate(InstitutionDto institutionDto, @MappingTarget Institution institution);

    Institution updateWithNull(InstitutionDto institutionDto, @MappingTarget Institution institution);
}