package org.webppo.clubcommunity_backend.response.exception.common;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

@Getter
public enum ExceptionType {
    EXCEPTION(INTERNAL_SERVER_ERROR, "E001", "An unexpected error has occurred."),
    AUTHENTICATION_ENTRY_POINT_EXCEPTION(UNAUTHORIZED, "E002", "Authentication is required to access this resource."),
    ACCESS_DENIED_EXCEPTION(FORBIDDEN, "E003", "You do not have permission to access this resource."),
    BIND_EXCEPTION(BAD_REQUEST, "E004", "There was an error with the request binding."),
    OAUTH2_LOGIN_FAILURE_EXCEPTION(UNAUTHORIZED, "E005", "OAuth2 login failed. Please try again."),
    SESSION_EXPIRED_EXCEPTION(UNAUTHORIZED, "E006", "Your session has expired. Please log in again."),
    MEMBER_NOT_FOUND_EXCEPTION(NOT_FOUND, "E007", "The specified member could not be found."),
    UNSUPPORTED_OAUTH2_EXCEPTION(INTERNAL_SERVER_ERROR, "E008", "Unsupported OAuth2 provider."),
    UPDATE_AUTHENTICATION_FAILURE_EXCEPTION(INTERNAL_SERVER_ERROR,"E009", "Failed to update authentication information."),
    UNSUPPORTED_FILE_FORMAT_EXCEPTION(BAD_REQUEST, "E010", "Unsupported file format."),
    FILE_UPLOAD_FAILURE_EXCEPTION(INTERNAL_SERVER_ERROR, "E011", "Failed to upload file."),
    FILE_DELETE_FAILURE_EXCEPTION(INTERNAL_SERVER_ERROR, "E012", "Failed to delete file."),
    BOARD_NOT_FOUND_EXCEPTION(NOT_FOUND, "E013", "The specified board could not be found."),













































































    NOT_CLUB_MEMBER(BAD_REQUEST, "E197", "Member is not the member of this club."),
    NOT_CLUB_MASTER(BAD_REQUEST, "E198", "Member is not the master of this club."),
    CLUB_NOT_FOUND(NOT_FOUND,"E199", "The Club could not be found."),
    CLUB_FROM_NOT_FOUND(NOT_FOUND,"E100", "The ClubForm could not be found."),
    REJECT_REASON_IS_NULL(BAD_REQUEST,"E101", "Reject Reason is null"),
    CLUB_JOIN_FORM_NOT_FOUND(NOT_FOUND,"E102", "The ClubJoinForm could not be found."),


    ;
    private final HttpStatus status;
    private final String code;
    private final String message;

    ExceptionType(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
