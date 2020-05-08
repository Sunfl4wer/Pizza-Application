package com.pycogroup.pizza.common;

import java.util.LinkedHashMap;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class MetaForCollection {

  @Getter
  @Setter
  private Pagination pagination;

  @Getter
  @Setter
  private LinkedHashMap<String , Object> sortedBy;
}
