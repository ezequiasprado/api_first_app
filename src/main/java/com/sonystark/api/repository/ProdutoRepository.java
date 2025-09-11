package com.sonystark.api.repository;

import com.sonystark.api.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends
        JpaRepository<Produto,Long> {
}
