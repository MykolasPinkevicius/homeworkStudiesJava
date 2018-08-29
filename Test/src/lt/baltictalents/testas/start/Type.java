package lt.baltictalents.testas.start;

public enum Type {
		ACTION("Veiksmas"),
		ADVENTURE("Nuotykiai"),
		FANTASY("Fantastika"),
		DRAMA("Drama"),
		HORROR("Siaubo");
		
		
		
		
		
		public String knygosTipas;
		
		private Type(String knygosTipas) {
			this.knygosTipas = knygosTipas;
		}
		public String getKnygosTipas() {
			return knygosTipas;
		}	

}

