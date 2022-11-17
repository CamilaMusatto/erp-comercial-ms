package br.com.erp.comercialms.entrypoint.mappers;

import br.com.erp.comercialms.core.entity.ClienteEntity;
import br.com.erp.comercialms.entrypoint.http.ClienteHttp;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClienteHttpMapper {

    ClienteHttpMapper INSTANCE = Mappers.getMapper( ClienteHttpMapper.class );

    ClienteEntity clienteHttpToClienteEntity(ClienteHttp http);
    ClienteHttp clienteEntityToClienteHttp(ClienteEntity http);
}
