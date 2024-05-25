package com.access.dto;

import jakarta.validation.constraints.*;
import static com.access.messages.ValidationErrorMessages.*;

//DTO for transfering data about client service (adding or updating service data)
public record ServiceDto(
        @NotBlank(message = MISSING_SERVICE_NAME_MSG) String webserviceName,
        @NotBlank(message = MISSING_SERVICE_EMAIL_MSG) @Email(message = INVALID_EMAIL_FORMAT_MSG) String email) {
}
