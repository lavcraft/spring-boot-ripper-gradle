package com.ironbank.moneyraven.dao;

import com.ironbank.moneyraven.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tolkv
 * @since 8/20/2017
 */
public interface MoneyDao extends JpaRepository<Bank, String> {
}
