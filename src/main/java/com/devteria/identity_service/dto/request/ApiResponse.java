package com.devteria.identity_service.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

// Class này là một chuẩn hóa request nhập vào
@JsonInclude(JsonInclude.Include.NON_NULL) // Loại bỏ những field null
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApiResponse <T> {
    @Builder.Default
    int code = 1000;
    String message;
     T result;


}
