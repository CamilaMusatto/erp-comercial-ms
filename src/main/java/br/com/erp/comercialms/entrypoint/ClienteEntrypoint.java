package br.com.erp.comercialms.entrypoint;

import br.com.erp.comercialms.core.usecase.BuscarClienteUsecase;
import br.com.erp.comercialms.core.usecase.CadastrarClienteUsecase;
import br.com.erp.comercialms.entrypoint.http.ClienteHttp;
import br.com.erp.comercialms.entrypoint.mappers.ClienteHttpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteEntrypoint {

    private BuscarClienteUsecase buscarClienteUsecase;
    private CadastrarClienteUsecase cadastrarClienteUsecase;

    @Autowired
    public ClienteEntrypoint(BuscarClienteUsecase buscarClienteUsecase,
                             CadastrarClienteUsecase cadastrarClienteUsecase) {
        this.buscarClienteUsecase = buscarClienteUsecase;
        this.cadastrarClienteUsecase = cadastrarClienteUsecase;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteHttp> buscarCliente(@PathVariable Long id){
        return ResponseEntity.ok(
                ClienteHttpMapper.INSTANCE.clienteEntityToClienteHttp(buscarClienteUsecase.buscarClientePorId(id)));
    }

    @PostMapping("/")
    public ResponseEntity<?> cadastrarCliente(@RequestBody ClienteHttp clienteHttp){
        cadastrarClienteUsecase.cadastrarCliente(ClienteHttpMapper.INSTANCE.clienteHttpToClienteEntity(clienteHttp));
        return ResponseEntity.ok(clienteHttp);
    }


}
