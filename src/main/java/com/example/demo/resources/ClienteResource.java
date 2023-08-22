package com.example.demo.resources;

import com.example.demo.dts.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")

public class ClienteResource {

    @GetMapping("/consultarCliente")
    public ResponseEntity<Cliente> consultarCliente(
            @RequestParam String tipoDocumento,
            @RequestParam String numeroDocumento) {

        // Verificar tipo y número de documento
        if (!("C".equals(tipoDocumento) || "P".equals(tipoDocumento))) {

            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        }

        if (!"23445322".equals(numeroDocumento)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        // Crear y retornar el objeto Cliente mockeado
        Cliente cliente = new Cliente("Juan", "Carlos", "Pérez", "Gómez", "1234567890", "Calle 123", "Ciudad XYZ");
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }


}
