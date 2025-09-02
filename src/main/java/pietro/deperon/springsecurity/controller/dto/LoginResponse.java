package pietro.deperon.springsecurity.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
