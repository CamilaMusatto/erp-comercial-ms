package br.com.erp.comercialms.dataprovider.mapper;

import br.com.erp.comercialms.core.entity.ClienteEntity;
import br.com.erp.comercialms.dataprovider.table.ClienteTable;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-16T17:32:10-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteEntity clienteTableToClienteEntity(ClienteTable table) {
        if ( table == null ) {
            return null;
        }

        ClienteEntity clienteEntity = new ClienteEntity();

        return clienteEntity;
    }
}
