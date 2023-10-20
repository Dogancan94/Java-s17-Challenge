package com.workintech.sprint17challenge.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CourseExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CourseErrorResponse> handleException(CourseException courseException){
        CourseErrorResponse courseErrorResponse = new CourseErrorResponse(
                courseException.getStatus().value(), courseException.getMessage(),
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(courseErrorResponse, courseException.getStatus());
    }

    @ExceptionHandler
    public ResponseEntity<CourseErrorResponse> handleException(Exception exception){
        CourseErrorResponse courseErrorResponse = new CourseErrorResponse(
                HttpStatus.BAD_REQUEST.value(), exception.getMessage(),
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(courseErrorResponse, HttpStatus.BAD_REQUEST);
    }

}
