package com.atdo.toca_cms.application.dto.comment;

import com.atdo.toca_cms.domain.util.enums.ContentStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommentInputDto {

    /**
     * The ID of the Article entity to which the comment belongs.
     * Mandatory field.
     */
    @NotNull(message = "The comment must have an article ID.")
    private Long articleId;

    /**
     * The ID of the User who authored the comment.
     * Mandatory field.
     */
    @NotNull(message = "The comment must have an author ID (User).")
    private Long authorId;

    /**
     * The text content of the comment.
     * Mandatory field.
     */
    @NotBlank(message = "The comment needs content.")
    private String content;

    /**
     * The ID of the parent comment, if this is a reply.
     * Optional field.
     */
    private Long parentId;

    /**
     * The status of the comment (e.g., DRAFT, PENDING_REVIEW, PUBLISHED).
     * If not provided, the default status (PENDING_REVIEW) is applied by the system/database.
     */
    private ContentStatus status;
}