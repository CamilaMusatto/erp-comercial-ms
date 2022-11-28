package br.com.erp.comercialms.dataprovider.mapper;

import br.com.erp.comercialms.dataprovider.table.FuncionarioTable;
import org.mapstruct.Mapper;
import br.com.erp.comercialms.core.entity.FuncionarioEntity;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface FuncionarioMapper {

    FuncionarioMapper INSTANCE = Mappers.getMapper(FuncionarioMapper.class);

    FuncionarioEntity funcionarioTableToFuncionarioEntity(FuncionarioTable table);

    FuncionarioTable funcionarioEntityToFuncionarioTable(FuncionarioEntity entity);

}
