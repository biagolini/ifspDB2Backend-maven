package com.bd2.ecommerce.repository;

import com.bd2.ecommerce.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> , JpaSpecificationExecutor<Game> {
}
