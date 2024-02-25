package ru.practicum.ewm.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CaseUpdatedStatusDto {
    private List<Long> idsFromUpdateStatus;
    private List<Long> processedIds;
}
