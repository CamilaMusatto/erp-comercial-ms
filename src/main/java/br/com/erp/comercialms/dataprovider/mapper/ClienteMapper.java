package br.com.erp.comercialms.dataprovider.mapper;

import br.com.erp.comercialms.core.entity.ClienteEntity;
import br.com.erp.comercialms.dataprovider.table.ClienteTable;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteEntity clienteTableToClienteEntity(ClienteTable table);

}
