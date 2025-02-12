package com.example.trabajosexpres.Adpater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.trabajosexpres.Model.RequestSent
import com.example.trabajosexpres.R

class AdapterRequest (contexto: Context, listRequest:List<RequestSent>) : BaseAdapter()  {
    private val contexto: Context
    private val listRequest: List<RequestSent>

    init {
        this.contexto = contexto;
        this.listRequest = listRequest
    }

    override fun getView(position: Int, p1: View?, viewGroup: ViewGroup?): View {
        val layoutInflater = LayoutInflater.from(contexto)
        val listRowLayout = layoutInflater.inflate(R.layout.row_request_client, viewGroup, false)
        val txtName = listRowLayout.findViewById<TextView>(R.id.TextViewService)
        val txtDate = listRowLayout.findViewById<TextView>(R.id.TextViewDate)
        val txtTime = listRowLayout.findViewById<TextView>(R.id.TextViewHour)
        val image = listRowLayout.findViewById<ImageView>(R.id.ImageViewService)
        txtName.text = listRequest.get(position).idService
        txtDate.text = "Fecha: "+listRequest.get(position).date
        txtTime.text = "Hora: "+listRequest.get(position).time
        val numberIndex:Int = position%2
        if(numberIndex!=0){
            image.setImageResource(R.drawable.carpintero_1)
        }else{
            image.setImageResource(R.drawable.plomero)
        }
        return listRowLayout
    }

    override fun getItem(position: Int): Any {
        return position.toLong()
    }

    //regresa el id de cada elemento de la lista
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    //cuantas filas hay
    override fun getCount(): Int {
        return listRequest.size
    }

}