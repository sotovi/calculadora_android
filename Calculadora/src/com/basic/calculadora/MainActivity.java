package com.basic.calculadora;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import java.math.*;


public class MainActivity extends Activity implements OnClickListener {

	boolean decimal = false;
	boolean suma = false;
	boolean resta = false;
	boolean mult = false;
	boolean div = false;
	boolean exp = false;
	Double[] numero = new Double[20] ;
	Double resultado;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button n0 = (Button)findViewById(R.id.btn0);
        n0.setOnClickListener(this);
        Button exp = (Button)findViewById(R.id.btnExp);
        exp.setOnClickListener(this);
        Button n7 = (Button)findViewById(R.id.btn7);
        n7.setOnClickListener(this);
        Button n4 = (Button)findViewById(R.id.btn4);
        n4.setOnClickListener(this);
        Button n1 = (Button)findViewById(R.id.btn1);
        n1.setOnClickListener(this);
        Button punto = (Button)findViewById(R.id.btnP);
        punto.setOnClickListener(this);
        Button n8 = (Button)findViewById(R.id.btn8);
        n8.setOnClickListener(this);
        Button n5 = (Button)findViewById(R.id.btn5);
        n5.setOnClickListener(this);
        Button n2 = (Button)findViewById(R.id.btn2);
        n2.setOnClickListener(this);
        Button n9 = (Button)findViewById(R.id.btn9);
        n9.setOnClickListener(this);
        Button n6 = (Button)findViewById(R.id.btn6);
        n6.setOnClickListener(this);
        Button n3 = (Button)findViewById(R.id.btn3);
        n3.setOnClickListener(this);
        Button igual = (Button)findViewById(R.id.btnIgual);
        igual.setOnClickListener(this);
        Button nAC = (Button)findViewById(R.id.btnAC);
        nAC.setOnClickListener(this);
        Button div = (Button)findViewById(R.id.btnDiv);
        div.setOnClickListener(this);
        Button mult = (Button)findViewById(R.id.btnMult);
        mult.setOnClickListener(this);
        Button resta = (Button)findViewById(R.id.btnResta);
        resta.setOnClickListener(this);
        Button suma = (Button)findViewById(R.id.btnSuma);
        suma.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		TextView pantalla = (TextView)findViewById(R.id.texto);
		int seleccion = v.getId();
		String a = pantalla.getText().toString();
		
		try{
		switch (seleccion)
		{
		case R.id.btn0:
		pantalla.setText(a+"0");
		break;
		case R.id.btn1:
			pantalla.setText(a+"1");
			break;
		case R.id.btn2:
			pantalla.setText(a+"2");
			break;
		case R.id.btn3:
			pantalla.setText(a+"3");
			break;
		case R.id.btn4:
			pantalla.setText(a+"4");
			break;
		case R.id.btn5:
			pantalla.setText(a+"5");
			break;
		case R.id.btn6:
			pantalla.setText(a+"6");
			break;
		case R.id.btn7:
			pantalla.setText(a+"7");
			break;
		case R.id.btn8:
			pantalla.setText(a+"8");
			break;
		case R.id.btn9:
			pantalla.setText(a+"9");
			break;
		case R.id.btnP:
			if(decimal==false){
			pantalla.setText(a+".");
			decimal = true;
			}else{return;}
			break;
		case R.id.btnSuma:
			suma =true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal =false;
			break;
		case R.id.btnResta:
			numero[0] = Double.parseDouble(a);
			resta =true;
			pantalla.setText("");
			decimal =false;
			break;
		case R.id.btnMult:
			numero[0] = Double.parseDouble(a);
			mult =true;
			pantalla.setText("");
			decimal =false;
			break;
		case R.id.btnDiv:
			numero[0] = Double.parseDouble(a);
			div = true;
			pantalla.setText("");
			decimal =false;
			break;
		case R.id.btnExp:
			numero[0] = Double.parseDouble(a);
			exp =true;
			pantalla.setText("");
			decimal =false;
			break;
		case R.id.btnIgual:
			numero[1] = Double.parseDouble(a);
			
			if(suma == true){
			resultado = numero[0] + numero[1];	
			    pantalla.setText(String.valueOf(resultado));	
			}else if(resta ==true){
				resultado = numero[0] - numero[1];	
				pantalla.setText(String.valueOf(resultado));	
			}else if(div ==true){
				resultado = numero[0] / numero[1];	
				pantalla.setText(String.valueOf(resultado));
			}else if(mult ==true){
				resultado = numero[0] * numero[1];	
				pantalla.setText(String.valueOf(resultado));
			}else if(div ==true){
				resultado = numero[0] / numero[1];	
				pantalla.setText(String.valueOf(resultado));
			}else if(exp ==true){
				resultado = numero[0] * numero[0];	
				pantalla.setText(String.valueOf(resultado));
			}
			decimal =false;
			suma =false;
			resta =false;
			mult =false;
			div =false;
			exp = false;
			break;
		case R.id.btnAC:
			pantalla.setText("");
			decimal = false;
			break;
		
		}
		}catch(Exception e){
			pantalla.setText("Error");
		};
}
}
