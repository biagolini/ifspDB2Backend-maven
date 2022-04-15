package com.bd2.ecommerce.repository;

import com.bd2.ecommerce.dto.HighlightDto;
import com.bd2.ecommerce.entity.Customer;
import com.bd2.ecommerce.entity.Game;
import com.bd2.ecommerce.entity.Highlight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface HighlightRepository extends JpaRepository<Highlight,Long> , JpaSpecificationExecutor<Highlight> {




}
