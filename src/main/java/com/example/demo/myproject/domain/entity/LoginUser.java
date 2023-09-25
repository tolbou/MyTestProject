package com.example.demo.myproject.domain.entity;

import java.util.List;

public record LoginUser(String email, String name, String password, List<String> roleList) {
}