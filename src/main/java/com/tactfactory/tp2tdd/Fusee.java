package com.tactfactory.tp2tdd;

import java.util.List;

public class Fusee {
  List<Compartiment> compartiments;
  String name;

  /**
   * obj fusee.
   */
  public Fusee(List<Compartiment> compartiments, String name) {
    super();
    this.compartiments = compartiments;
    this.name = name;
  }

  /**
   * testNameStartWithMajOk.
   */
  public Fusee() {

  }

  public List<Compartiment> getCompartiments() {
    return compartiments;
  }

  public void setCompartiments(List<Compartiment> compartiments) {
    this.compartiments = compartiments;
  }

  public String getName() {
    return name;
  }

  public void setName(String string) {
    this.name = string;
  }


}
