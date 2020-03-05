package br.com.fiap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.web_mercado_livre.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        txtMercadoLivre.setOnClickListener { v: View? ->

            val intent = Intent(this, ML::class.java)
            intent.putExtra("urlMercadoLivre", "https://www.mercadolivre.com.br/")
            startActivity(intent)
        }

        txtBuscape.setOnClickListener { v: View? ->

            val intent = Intent(this, ML::class.java)
            intent.putExtra("urlBuscape", "https://www.buscape.com.br/")
            startActivity(intent)

        }

        txtEbay.setOnClickListener { v: View? ->

            val intent = Intent(this, webView::class.java)
            intent.putExtra("urlEbay", "https://www.ebay.com/")
            startActivity(intent)

        }

        txtWebmotors.setOnClickListener { v: View? ->

            val intent = Intent(this, webView::class.java)
            intent.putExtra("urlWebMotors", "https://www.webmotors.com.br/")
            startActivity(intent)

        }

        txtMagalu.setOnClickListener { v: View? ->

            val intent = Intent(this, webView::class.java)
            intent.putExtra("urlMagalu", "https://www.magazineluiza.com.br/")
            startActivity(intent)

        }

        txtNetshoes.setOnClickListener { v: View? ->

            val intent = Intent(this, webView::class.java)
            intent.putExtra("urlNetshoes", "https://www.netshoes.com.br/")
            startActivity(intent)

        }

        txtAmericanas.setOnClickListener { v: View? ->

            val intent = Intent(this, webView::class.java)
            intent.putExtra("urlAmericanas", "https://www.americanas.com.br/")
            startActivity(intent)

        }

        txtSubmarino.setOnClickListener { v: View? ->

            val intent = Intent(this, webView::class.java)
            intent.putExtra("urlSubmarino", "https://www.submarino.com.br/")
            startActivity(intent)

        }

    }
}
