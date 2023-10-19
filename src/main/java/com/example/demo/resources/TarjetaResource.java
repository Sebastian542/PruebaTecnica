package com.example.demo.resources;

import com.example.demo.dts.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/tarjeta")

public class TarjetaResource {

    // Controlador para generar números de tarjeta
    @RestController
    @RequestMapping("/card")
    public class CardController {
        @GetMapping("/{productId}/number")
        public ResponseEntity<String> generateCardNumber(@PathVariable String productId) {
            // Implementa la lógica para generar números de tarjeta
            String cardNumber = "1234-5678-9012-3456"; // Ejemplo
            return ResponseEntity.ok(cardNumber);
        }
    }

    // Controlador para activar tarjetas
    @RestController
    @RequestMapping("/card")
    public class CardActivationController {
        @PostMapping("/enroll")
        public ResponseEntity<String> activateCard(@RequestBody Map<String, String> request) {
            String cardId = request.get("cardId");
            // Implementa la lógica para activar tarjetas y registra en la base de datos
            return ResponseEntity.ok("Tarjeta activada");
        }
    }

    // Controlador para bloquear tarjetas
    @RestController
    @RequestMapping("/card")
    public class CardBlockController {
        @DeleteMapping("/{cardId}")
        public ResponseEntity<String> blockCard(@PathVariable String cardId) {
            // Implementa la lógica para bloquear tarjetas y actualiza en la base de datos
            return ResponseEntity.ok("Tarjeta bloqueada");
        }
    }

    // Controlador para recargar saldo
    @RestController
    @RequestMapping("/card")
    public class CardBalanceController {
        @PostMapping("/balance")
        public ResponseEntity<String> reloadBalance(@RequestBody Map<String, String> request) {
            String cardId = request.get("cardId");
            String balance = request.get("balance");
            // Implementa la lógica para recargar saldo y actualiza en la base de datos
            return ResponseEntity.ok("Saldo recargado");
        }
    }



    @RestController
    @RequestMapping("/card")
    public class CardViewController {

        @GetMapping("/balance/{cardId}")
        public ResponseEntity<Double> getBalance(@PathVariable String cardId) {
            // Supongamos que tienes una lógica para obtener el saldo de una tarjeta en tu base de datos
            // Reemplaza esto con tu lógica real para acceder a la base de datos
            double saldo = obtenerSaldoDeLaBaseDeDatos(cardId);

            if (saldo >= 0) {
                return ResponseEntity.ok(saldo);
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        // Ejemplo de método ficticio para obtener el saldo desde la base de datos
        private double obtenerSaldoDeLaBaseDeDatos(String cardId) {
            // Debes implementar la lógica real para obtener el saldo de la tarjeta desde tu base de datos
            // Aquí proporciono un ejemplo ficticio:
            if (cardId.equals("1020301234567801")) {
                return 1000.0; // Saldo de ejemplo
            } else {
                return -1; // Retorna un valor negativo si la tarjeta no se encuentra
            }
        }
    }


















}
