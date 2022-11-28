package br.com.erp.comercialms.core.usecase.gateway;

import br.com.erp.comercialms.core.entity.ProdutoEntity;
import org.springframework.stereotype.Component;

@Component
public interface ProdutoGateway {

    ProdutoEntity buscarProdutoById(Long id);
    void salvarProduto(ProdutoEntity produtoEntity);
}
