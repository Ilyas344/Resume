package rstyle.softlab.resume.mapper;

import org.mapstruct.*;
import rstyle.softlab.resume.DTO.CompanyDto;
import rstyle.softlab.resume.model.experience.Company;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CompanyMapper {
    Company toEntity(CompanyDto companyDto);

    CompanyDto toDto(Company company);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Company partialUpdate(CompanyDto companyDto, @MappingTarget Company company);

    Company updateWithNull(CompanyDto companyDto, @MappingTarget Company company);
}