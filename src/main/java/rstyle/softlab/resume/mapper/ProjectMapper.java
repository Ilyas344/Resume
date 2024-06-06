package rstyle.softlab.resume.mapper;

import org.mapstruct.*;
import rstyle.softlab.resume.DTO.ProjectDto;
import rstyle.softlab.resume.model.project.Project;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProjectMapper {
    Project toEntity(ProjectDto projectDto);

    ProjectDto toDto(Project project);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Project partialUpdate(ProjectDto projectDto, @MappingTarget Project project);

    Project updateWithNull(ProjectDto projectDto, @MappingTarget Project project);
}