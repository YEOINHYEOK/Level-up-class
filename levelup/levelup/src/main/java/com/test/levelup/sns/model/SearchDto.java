package com.test.levelup.sns.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SearchDto {
    @Schema(description = "전 검색기록")
    private String searchHistory ;
}

