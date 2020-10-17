package com.walker.faye.core.primary.value;

import com.google.common.base.Objects;

/**
 * @author walker
 */
public class Name {
  private String firstName;
  private String lastName;
  private String fullName;

  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    setFullName();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
    setFullName();
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
    setFullName();
  }

  public String getFullName() {
    return fullName;
  }

  private void setFullName() {
    this.fullName = this.firstName + " " + this.lastName;
  }

  @Override
  public String toString() {
    return fullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equal(fullName, name.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(fullName);
  }
}
