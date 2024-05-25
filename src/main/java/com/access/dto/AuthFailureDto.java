package com.access.dto;

import jakarta.validation.constraints.*;
import static com.access.ConstraintConstants.IP_SUBNET_REGEXP;
import static com.access.messages.ValidationErrorMessages.*;

//DTO for transfering data about authentication failures (transfers for analyzing for attack possibility)
public record AuthFailureDto(
        @NotEmpty(message = MISSING_SUBNET_MSG)
        @Pattern(regexp = IP_SUBNET_REGEXP, message = INVALID_SUBNET_FORMAT_MSG) String subnet,
        Long timestamp,
        @NotBlank(message = MISSING_SERVICE_NAME_MSG) String webserviceName) {
}
