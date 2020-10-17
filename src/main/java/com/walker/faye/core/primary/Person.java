package com.walker.faye.core.primary;

import com.walker.faye.core.primary.value.Gender;
import com.walker.faye.core.primary.value.IdCard;
import com.walker.faye.core.primary.value.Name;

/**
 * @author walker
 */
public class Person {
  private Gender gender;
  private Name name;
  private int age;
  private IdCard idCard;
  private boolean verified;

  public Person(Name name) {
    this.name = name;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public IdCard getIdCard() {
    return idCard;
  }

  public void setIdCard(IdCard idCard) {
    this.idCard = idCard;
  }


}
