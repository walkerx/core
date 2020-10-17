package com.walker.faye.core.house;

/**
 * @author walker
 */
public abstract class Leaf {

  public Node parent;

  public Node getParent() {
    return parent;
  }

  public void setParent(Node parent) {
    this.parent = parent;
  }
}
