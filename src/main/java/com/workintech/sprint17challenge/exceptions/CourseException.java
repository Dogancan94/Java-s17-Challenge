package com.workintech.sprint17challenge.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class CourseException extends RuntimeException{
    private HttpStatus status;

    public CourseException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
