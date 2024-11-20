package com.example.boardproject.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ApiResponse { 
    private boolean success;
    private String message;
    private Object data;

    public ApiResponse(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }
    public ApiResponse(boolean success, String message) {
        this(success, message, null);
    }


}

