package com.springboot.rest.controller;

import com.springboot.rest.dto.MemberDto;
import com.springboot.rest.service.RestTemplateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest-template")
public class RestTemplateController {

    private final RestTemplateService restTemplateService;

    public RestTemplateController(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }

    @GetMapping
    public String getName() {
        return this.restTemplateService.getName();
    }

    @GetMapping("/path-variable")
    public String getNameWithPathVariable() {
        return this.restTemplateService.getNameWithPathVariable();
    }

    @GetMapping("/parameter")
    public String getNameWithParameter() {
        return this.restTemplateService.getNameWithParameter();
    }

    @PostMapping
    public ResponseEntity<MemberDto> postDto() {
        return this.restTemplateService.postWithParamAndBody();
    }

    @PostMapping("/header")
    public ResponseEntity<MemberDto> postWithHeader() {
        return this.restTemplateService.postWithHeader();
    }
}
