package ru.practicum.main.comment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CommentCountDto {

    private Long eventId;

    private Long commentCount;
}
