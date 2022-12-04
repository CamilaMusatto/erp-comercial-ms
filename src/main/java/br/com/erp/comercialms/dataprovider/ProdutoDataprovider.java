package br.com.erp.comercialms.dataprovider;

import br.com.erp.comercialms.core.usecase.gateway.ProdutoGateway;
import br.com.erp.comercialms.dataprovider.mapper.ProdutoMapper;
import br.com.erp.comercialms.dataprovider.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.erp.comercialms.core.entity.ProdutoEntity;

@Component
public class ProdutoDataprovider implements ProdutoGateway {

    private ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoDataprovider(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public ProdutoEntity buscarProdutoById(Long id) {
        return ProdutoMapper.INSTANCE.produtoTableToProdutoEntity(produtoRepository.findById(id).get());
    }

    @Override
    public void cadastrarProduto(ProdutoEntity entity) {
        produtoRepository.save(ProdutoMapper.INSTANCE.produtoEntityToProdutoTable(entity));
    }
}
