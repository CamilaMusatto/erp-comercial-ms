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
    private ClienteMapper clienteMapper;
    @Autowired
    public ClienteDataprovider(ClienteRepository clienteRepository, ClienteMapper clienteMapper) {
        this.clienteRepository = clienteRepository;
        this.clienteMapper = clienteMapper;
    }

    @Override
    public ClienteEntity buscarClienteById(Long id) {
        return clienteMapper.clienteTableToClienteEntity(clienteRepository.findById(id).get());
    }

    @Override
    public void salvarCliente(ClienteEntity entity) {

    }

}
