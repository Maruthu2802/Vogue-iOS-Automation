package com.automate.customannotations;

import java.lang.annotation.*;

import com.automate.enums.CategoryType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface FrameworkAnnotation {
  String[] author();

  CategoryType[] category();
}
