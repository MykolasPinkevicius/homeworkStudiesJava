public enum MyCitties {
			ALYTUS(40), KAUNAS(100), VILNIUS(300), PANEVEZYS(50);
			
			public int miestuDydis;
			
			private MyCitties(int miestuDydis) {
				this.miestuDydis = miestuDydis;
			}
			public int getMiestuDydis() {
				return miestuDydis;
			}
			
}
		