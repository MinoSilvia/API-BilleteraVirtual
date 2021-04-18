package ar.com.ada.api.billeteravirtual.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BilleteraController {

    /*
     * WEB METHOD 1 --> consultar saldo: GET Endpoint: /billeteras/{id}/saldos
     *
     * WEB METHOD 2 --> cargar saldo : POST Endpoint: /billetera/{id}/recargas
     * RequestBody: {"moneda": , "importe": }
     * 
     * WEB METHOD 3 --> enviar plata: POST Endpoint: /billetera/{id}/envios
     * RequestBody: {"moneda": , "importe":, "email":, "motivo": "detalleMotivo":}
     * 
     */
}
