package br.com.fiap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.web_mercado_livre.*

class ML : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.web_mercado_livre)

        webView.webViewClient = WebViewClient() //instanciando o objeto como no Java
        webView.settings.javaScriptEnabled = true
        webView.settings.displayZoomControls = true

        webView.loadUrl(intent.getStringExtra("urlMercadoLivre"))
        webView.loadUrl("https://www.buscape.com.br/")
        webView.loadUrl("https://www.ebay.com/")
        webView.loadUrl("https://www.webmotors.com.br/")
        webView.loadUrl("https://www.magazineluiza.com.br/")
        webView.loadUrl("https://www.netshoes.com.br/")
        webView.loadUrl("https://www.americanas.com.br/")
        webView.loadUrl("https://www.submarino.com.br/")

    }
}
