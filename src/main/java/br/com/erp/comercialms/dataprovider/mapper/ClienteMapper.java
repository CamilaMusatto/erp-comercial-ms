package br.com.erp.comercialms.dataprovider.mapper;

import br.com.erp.comercialms.core.entity.ClienteEntity;
import br.com.erp.comercialms.dataprovider.table.ClienteTable;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteEntity clienteTableToClienteEntity(ClienteTable table);

}
