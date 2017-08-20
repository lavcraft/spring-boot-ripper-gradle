package com.ironbank.moneyraven.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author tolkv
 * @since 8/20/2017
 */
@Data
@Entity
public class Bank {
  @Id long id;
  long totalAmount;

  public void credit(long amount){
    totalAmount -= amount;
  }

}
