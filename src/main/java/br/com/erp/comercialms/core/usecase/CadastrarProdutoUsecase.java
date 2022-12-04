package br.com.erp.comercialms.core.usecase;

import br.com.erp.comercialms.core.usecase.gateway.ProdutoGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.erp.comercialms.core.entity.ProdutoEntity;

@Component
public class CadastrarProdutoUsecase {

    private ProdutoGateway produtoGateway;

    @Autowired
    public CadastrarProdutoUsecase(ProdutoGateway produtoGateway) {
        this.produtoGateway = produtoGateway;

    }

    public void cadastrarProduto(ProdutoEntity produtoEntity) {
        produtoGateway.cadastrarProduto(produtoEntity);
    }


}
