package br.com.erp.comercialms.dataprovider.mapper;

import br.com.erp.comercialms.core.entity.ClienteEntity;
import br.com.erp.comercialms.dataprovider.table.ClienteTable;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-03T21:29:41-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteEntity clienteTableToClienteEntity(ClienteTable table) {
        if ( table == null ) {
            return null;
        }

        ClienteEntity.ClienteEntityBuilder clienteEntity = ClienteEntity.builder();

        clienteEntity.id( table.getId() );
        clienteEntity.nome( table.getNome() );
        clienteEntity.telefone( table.getTelefone() );
        clienteEntity.rg( table.getRg() );
        clienteEntity.cpf( table.getCpf() );
        clienteEntity.cnpj( table.getCnpj() );
        clienteEntity.email( table.getEmail() );
        clienteEntity.dataNasc( table.getDataNasc() );
        clienteEntity.sexo( table.getSexo() );

        return clienteEntity.build();
    }

    @Override
    public ClienteTable clienteEntityToClienteTable(ClienteEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ClienteTable clienteTable = new ClienteTable();

        clienteTable.setId( entity.getId() );
        clienteTable.setNome( entity.getNome() );
        clienteTable.setTelefone( entity.getTelefone() );
        clienteTable.setRg( entity.getRg() );
        clienteTable.setCpf( entity.getCpf() );
        clienteTable.setCnpj( entity.getCnpj() );
        clienteTable.setEmail( entity.getEmail() );
        clienteTable.setDataNasc( entity.getDataNasc() );
        clienteTable.setSexo( entity.getSexo() );

        return clienteTable;
    }
}
