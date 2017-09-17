package com.ironbank.moneyraven.service;

/**
 * @author tolkv
 * @since 8/20/2017
 */
public interface TransferMoneyService {

  long transfer(String addresseeName, long amount);

}
