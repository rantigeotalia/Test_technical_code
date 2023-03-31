package com.example.testranti.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseOutputDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String outputSegitiga;

    private List<Integer> listBilangan;
}
