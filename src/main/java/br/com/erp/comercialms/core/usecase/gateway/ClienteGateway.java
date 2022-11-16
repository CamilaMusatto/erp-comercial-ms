package br.com.erp.comercialms.core.usecase.gateway;

import br.com.erp.comercialms.core.entity.ClienteEntity;
import org.springframework.stereotype.Component;

@Component
public interface ClienteGateway {

    ClienteEntity buscarClienteById(Long id);

    void salvarCliente(ClienteEntity entity);
}
