package com.access.dto;

import jakarta.validation.constraints.*;
import java.util.List;
import static com.access.ConstraintConstants.*;
import static com.access.messages.ValidationErrorMessages.*;

//DTO for transferring data about attack attempt (authentication failures sequence which recognized as attack)
public record AttackAttemptDto(
        @NotEmpty(message = MISSING_SUBNET_MSG)
        @Pattern(regexp = IP_SUBNET_REGEXP, message = INVALID_SUBNET_FORMAT_MSG) String subnet,
        Long timestamp, List<String> services) {
}
