package com.workintech.sprint17challenge.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseErrorResponse {
    private Integer status;
    private String message;
    private Long timestamp;
}
