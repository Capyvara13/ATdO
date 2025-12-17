package com.atdo.toca_cms.application.dto.comment;

import com.atdo.toca_cms.domain.util.enums.ContentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommentResponseDto {

    /**
     * The unique identifier of the comment.
     */
    private Long idComment;

    /**
     * The ID of the Article entity to which the comment belongs.
     */
    private Long articleId;

    /**
     * The ID of the User who authored the comment.
     */
    private Long authorId;

    /**
     * The text content of the comment.
     */
    private String content;

    /**
     * The instant when the comment was created.
     */
    private Instant createdAt;

    /**
     * The instant when the comment was last updated.
     */
    private Instant updatedAt;

    /**
     * The ID of the parent comment, if this is a reply (null if it's a top-level comment).
     */
    private Long parentId;

    /**
     * The current status of the content (e.g., DRAFT, PENDING_REVIEW, PUBLISHED).
     */
    private ContentStatus status;
}