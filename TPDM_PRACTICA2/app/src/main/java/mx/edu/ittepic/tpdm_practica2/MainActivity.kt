package mx.edu.ittepic.tpdm_practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    var celdas: EditText? = null
    var renglones: EditText? = null
    var layoRenglones: LinearLayout? = null
    var vector: RadioButton? = null
    var matriz: RadioButton? = null
    var menulist: ListView? = null
    var layocampos: LinearLayout? = null
    var textren: TextView? = null
    var celda = 0
    var renglon = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        celdas = findViewById(R.id.celdas)
        layoRenglones = findViewById(R.id.layoRenglones)
        vector = findViewById(R.id.vector)
        matriz = findViewById(R.id.matriz)
        menulist = findViewById(R.id.menulist)
        layocampos = findViewById(R.id.layocampos)
        renglones = findViewById(R.id.renglones)
        textren = findViewById(R.id.textren)

        vector?.setOnClickListener {
            if (vector?.isChecked == true) {
                layoRenglones?.visibility = View.GONE
                textren?.visibility = View.GONE
                renglones?.visibility = View.GONE
            }
        }
        matriz?.setOnClickListener {
            if (matriz?.isChecked == true) {
                layoRenglones?.visibility = View.VISIBLE
                textren?.visibility = View.VISIBLE
                renglones?.visibility = View.VISIBLE
            }
        }
        menulist?.setOnItemClickListener { adapterView, view, i, l ->
            when (i) {
                1 -> mostrarValores()
                2 -> acercaDe()
                3 -> finish()
            }
        }
    }
    fun mostrarValores(){
        var otraActivity = Intent(this,Main3Activity::class.java)
        startActivity(otraActivity)
    }
    fun acercaDe(){
        val alerta = AlertDialog.Builder(this)
        alerta.setIcon(android.R.drawable.ic_dialog_alert).setTitle("Acerca de...").setMessage("(C) Roman Rivera Navarrete").setPositiveButton("Aceptar"){dialogInterface, i ->
        }.show()
    }
    }


