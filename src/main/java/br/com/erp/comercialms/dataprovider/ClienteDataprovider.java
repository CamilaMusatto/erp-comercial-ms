package br.com.erp.comercialms.dataprovider;

import br.com.erp.comercialms.core.entity.ClienteEntity;
import br.com.erp.comercialms.core.usecase.gateway.ClienteGateway;
import br.com.erp.comercialms.dataprovider.mapper.ClienteMapper;
import br.com.erp.comercialms.dataprovider.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteDataprovider implements ClienteGateway {

    private ClienteRepository clienteRepository;
    @Autowired
    public ClienteDataprovider(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public ClienteEntity buscarClienteById(Long id) {
        return ClienteMapper.INSTANCE.clienteTableToClienteEntity(clienteRepository.findById(id).get());
    }

    @Override
    public void salvarCliente(ClienteEntity entity) {
        clienteRepository.save(ClienteMapper.INSTANCE.clienteEntityToClienteTable(entity));
    }

}
