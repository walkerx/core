package com.walker.faye.core.house.entity;

import com.walker.faye.core.house.Leaf;
import com.walker.faye.core.house.value.Orientation;
import com.walker.faye.core.house.value.address.Address;

/**
 * 可租单元
 * @author walker
 */

public class Unit extends Leaf {
  private String name;
  private Address address;
//  private Money price;
//  private Money basePrice;
  private Float area;
  private Orientation orientation;
  private Banner banner;
}
