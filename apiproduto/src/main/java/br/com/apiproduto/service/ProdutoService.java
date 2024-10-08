package br.com.apiproduto.service;

import br.com.apiproduto.entity.Produto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProdutoService {
    List<Produto> findAll();
    Produto save(Produto produto);
    void delete(Long id);
}
