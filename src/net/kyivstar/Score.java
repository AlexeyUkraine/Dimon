package net.kyivstar;

import java.sql.Date;
import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



	@Entity
	@Table(name="SCORE")
	public class Score {

				
		private int         Igor;
		private int         Lexa;         
		private int		    Vova;         
		private int		    Sanya;
		private int		    Nazar;
		private int		    Taras;
		private int		    Sidor;
		private int		    Vetal;
		@Id
		private String	    Color;
		private  GregorianCalendar        date;


		public Score() {
			
		}


		public Score(int igor, int lexa, int vova, int sanya, int nazar,
				int taras, int sidor, int vetal, String color, GregorianCalendar date ) {
			super();
			Igor = igor;
			Lexa = lexa;
			Vova = vova;
			Sanya = sanya;
			Nazar = nazar;
			Taras = taras;
			Sidor = sidor;
			Vetal = vetal;
			Color = color;
			this.date = date;
		}


		public int getIgor() {
			return Igor;
		}


		public void setIgor(int igor) {
			Igor = igor;
		}


		public int getLexa() {
			return Lexa;
		}


		public void setLexa(int lexa) {
			Lexa = lexa;
		}


		public int getVova() {
			return Vova;
		}


		public void setVova(int vova) {
			Vova = vova;
		}


		public int getSanya() {
			return Sanya;
		}


		public void setSanya(int sanya) {
			Sanya = sanya;
		}


		public int getNazar() {
			return Nazar;
		}


		public void setNazar(int nazar) {
			Nazar = nazar;
		}


		public int getTaras() {
			return Taras;
		}


		public void setTaras(int taras) {
			Taras = taras;
		}


		public int getSidor() {
			return Sidor;
		}


		public void setSidor(int sidor) {
			Sidor = sidor;
		}


		public int getVetal() {
			return Vetal;
		}


		public void setVetal(int vetal) {
			Vetal = vetal;
		}


		public String getColor() {
			return Color;
		}


		public void setColor(String color) {
			Color = color;
		}


		public  GregorianCalendar getDate() {
			return date;
		}


		public void setDate( GregorianCalendar date) {
			this.date = date;
		}
		
		

	}
