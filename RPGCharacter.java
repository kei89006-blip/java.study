class RPGCharacter {
	
	int hp, mp;
	static int population =0;
	RPGCharacter(int hp ,int mp){
		this.hp =hp ;this.mp =mp ;
		population++;
	}
	
	void displayHpMp() {
		System.out.println("hp:"+mp+",mp:"+mp);
	}
	
	
	public static void main (String [] args ) {
		
		RPGCharacter knightJpMp=new RPGCharacter(100,30);
		RPGCharacter diplayHpMp=new RPGCharacter(60,100);
		
		knightJpMp.displayHpMp();
		diplayHpMp.displayHpMp();
		
	}
}