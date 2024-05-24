package com.access.dto;

//DTO for transfering data about attack attempt (authentication failures sequence which recognized as attack)
public record AttackAttemptDto(String ip, Long timestamp, String[] services) {
}
