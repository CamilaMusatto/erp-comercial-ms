package br.com.erp.comercialms.entrypoint.mappers;

import br.com.erp.comercialms.core.entity.ClienteEntity;
import br.com.erp.comercialms.entrypoint.http.ClienteHttp;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-27T11:48:24-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class ClienteHttpMapperImpl implements ClienteHttpMapper {

    @Override
    public ClienteEntity clienteHttpToClienteEntity(ClienteHttp http) {
        if ( http == null ) {
            return null;
        }

        ClienteEntity.ClienteEntityBuilder clienteEntity = ClienteEntity.builder();

        clienteEntity.id( http.getId() );
        clienteEntity.nome( http.getNome() );
        clienteEntity.telefone( http.getTelefone() );
        clienteEntity.rg( http.getRg() );
        clienteEntity.cpf( http.getCpf() );
        clienteEntity.cnpj( http.getCnpj() );
        clienteEntity.endereco( http.getEndereco() );
        clienteEntity.email( http.getEmail() );
        clienteEntity.dataNasc( http.getDataNasc() );
        clienteEntity.sexo( http.getSexo() );

        return clienteEntity.build();
    }

    @Override
    public ClienteHttp clienteEntityToClienteHttp(ClienteEntity http) {
        if ( http == null ) {
            return null;
        }

        ClienteHttp.ClienteHttpBuilder clienteHttp = ClienteHttp.builder();

        clienteHttp.id( http.getId() );
        clienteHttp.nome( http.getNome() );
        clienteHttp.telefone( http.getTelefone() );
        clienteHttp.rg( http.getRg() );
        clienteHttp.cpf( http.getCpf() );
        clienteHttp.cnpj( http.getCnpj() );
        clienteHttp.endereco( http.getEndereco() );
        clienteHttp.email( http.getEmail() );
        clienteHttp.dataNasc( http.getDataNasc() );
        clienteHttp.sexo( http.getSexo() );

        return clienteHttp.build();
    }
}
