package com.fiap.hungrypizza

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class DetalhePedidoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_pedido)
        //Recebendo o pedido enviado pela tela anterior
        val pedido = intent.getParcelableExtra<Pedido>("pedido")
    }
}
