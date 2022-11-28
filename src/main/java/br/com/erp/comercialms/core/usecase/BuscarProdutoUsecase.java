package br.com.erp.comercialms.core.usecase;

import br.com.erp.comercialms.core.usecase.gateway.ProdutoGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.erp.comercialms.core.entity.ProdutoEntity;

@Component
public class BuscarProdutoUsecase {

    @Autowired
    private ProdutoGateway produtoGateway;

    public ProdutoEntity buscarProdutoPorId(Long id) {
        return produtoGateway.buscarProdutoById(id);
    }


}
