package br.com.erp.comercialms.dataprovider.mapper;

import br.com.erp.comercialms.core.entity.ProdutoEntity;
import br.com.erp.comercialms.dataprovider.table.ProdutoTable;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);

    ProdutoEntity produtoTableToProdutoEntity(ProdutoTable table);

    ProdutoTable produtoEntityToProdutoTable(ProdutoEntity entity);



}
