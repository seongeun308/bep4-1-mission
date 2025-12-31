package com.back.shared.post.dto;

import com.back.standard.modelType.HasModelTypeCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class PostDto implements HasModelTypeCode {
    private int id;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private int authorId;
    private String authorName;
    private String title;
    private String content;

    @Override
    public String getModelTypeCode() {
        return "Post";
    }
}