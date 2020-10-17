package com.walker.faye.core.primary.value;

/**
 * @author walker
 */
public class IdCard {
  private String number;
  private IdType idType;

  public IdCard(String number, IdType idType) {
    this.number = number;
    this.idType = idType;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public IdType getIdType() {
    return idType;
  }

  public void setIdType(IdType idType) {
    this.idType = idType;
  }
}

