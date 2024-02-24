package ru.practicum.main.category.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.practicum.dto.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public final class CategoryDto {

    private Long id;

    @NotBlank(groups = {Validator.Create.class, Validator.Update.class})
    @Size(min = 1, max = 50, groups = {Validator.Create.class, Validator.Update.class})
    private String name;
}
