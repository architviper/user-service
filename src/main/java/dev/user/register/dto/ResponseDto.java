package dev.user.register.dto;

import org.springframework.http.HttpStatus;

public class ResponseDto<T> {

    private T data;

    private HttpStatus status;

    public ResponseDto(T data, HttpStatus status) {
        this.data = data;
        this.status = status;
    }

}
