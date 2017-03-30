package br.com.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by mauricio on 24/03/17.
 */
public class Data {

	private String data;
	private String diaDaSemana;
	private String hora;
	private Calendar dtCompleta = Calendar.getInstance();

	public Data(String  data){
		this.data = data;
	}

	public Data(String  data, String hora){
		this.data = data;
		this.hora = hora;
	}

	public Data(String dia, String diaDaSemana, String mes, int ano, String hora){
		this.data = data;
		this.diaDaSemana = diaDaSemana;
		this.hora = hora;
	}

	public String mostrarData(){
		return data;
	}

	public String mostrarDataHora(){
		return data + " " + hora + "h";
	}

	public String retornarDiaDaSemana(Data data) {
		try {
			String diaDaSemana = null;
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			calendar.setTime(simpleFormat.parse(data.mostrarData()));
			int semana = calendar.get(Calendar.DAY_OF_WEEK);
			if (semana == 1) {
				diaDaSemana = "Domingo";
			} else if (semana == 2) {
				diaDaSemana = "Segunda";
			} else if (semana == 3) {
				diaDaSemana = "Terça";
			} else if (semana == 4) {
				diaDaSemana = "Quarta";
			} else if (semana == 5) {
				diaDaSemana = "Quinta";
			} else if (semana == 6) {
				diaDaSemana = "Sexta";
			} else if (semana == 7) {
				diaDaSemana = "Sábado";
			}

			return diaDaSemana;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public int retornarNumeroDaSemana(Data data){
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			calendar.setTime(simpleFormat.parse(data.mostrarData()));
			int numeroSemana = calendar.get(Calendar.WEEK_OF_MONTH);
			return numeroSemana;

		}catch (ParseException e){
			e.printStackTrace();
			return 0;
		}

	}

	public int retornarNumeroDoDiaDoAno(Data data){
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			calendar.setTime(simpleFormat.parse(data.mostrarData()));
			int numeroDoDiaDoAno = calendar.get(Calendar.DAY_OF_YEAR);
			return numeroDoDiaDoAno;

		}catch (ParseException e){
			e.printStackTrace();
			return 0;
		}

	}

	public int retornarNumeroMes(Data data){
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			calendar.setTime(simpleFormat.parse(data.mostrarData()));
			int mes = calendar.get(Calendar.MONTH);
			return mes;

		}catch (ParseException e){
			e.printStackTrace();
			return 0;
		}

	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void repetirData(String escolhaDiaMesAno, int repeticao){
		int d=0, m=0, a=0;
		if(escolhaDiaMesAno == "DIA"){
			d=1;
		}
		if(escolhaDiaMesAno == "MES" || escolhaDiaMesAno == "MÊS"){
			m = 1;
		}
		if (escolhaDiaMesAno == "ANO"){
			a = 1;
		}
		if (escolhaDiaMesAno == "SEMANA"){
			d = 7;
		}

		this.dtCompleta.set(dtCompleta.get(Calendar.YEAR) + a, dtCompleta.get(Calendar.MONTH) + m,
				dtCompleta.get(Calendar.DAY_OF_MONTH)+ d);
	}
}
