package com.example.testranti.service;

import com.example.testranti.dto.BaseInputDto;
import com.example.testranti.dto.BaseOutputDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
@Slf4j
public class TestService {

    public BaseOutputDto generateGanjil(BaseInputDto request){
        log.info("Generate Bilangan Ganjil");
        List<Integer> listGanjil = new ArrayList<>();
        for(int i = 0; i <= request.getInputNumber(); i++){
            if(i%2 != 0){
                listGanjil.add(i);
            }
        }
        return BaseOutputDto.builder()
                .listBilangan(listGanjil)
                .build();
    }

    public BaseOutputDto generateGenap(BaseInputDto request){
        log.info("Generate Bilangan Genap");
        List<Integer> listGenap = new ArrayList<>();
        for(int i= 0; i <= request.getInputNumber(); i++){
            if(i%2 == 0){
                listGenap.add(i);
            }
        }

        return BaseOutputDto.builder()
                .listBilangan(listGenap)
                .build();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

    }
}


