package com.example.uberbackendspringboot.advices;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ApiError {
    private HttpStatus statusCode;
    private String message;
    private List<Map<String,String>> subError;
}
