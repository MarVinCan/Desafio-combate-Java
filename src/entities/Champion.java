package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public int getAttack() {
		return attack;
	}

	public int getLife() {
		return life;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void takeDamege(Champion championB) {
		if (this.armor >= championB.getAttack()) {
			this.life -= 1;
		} else {

			this.life = getLife() - (championB.getAttack() - getArmor());
		}
		if (this.life < 0) {
			this.life = 0;
		}
	}

	public String status() {
		StringBuffer bf = new StringBuffer();

		bf.append(getName() + ": ");

		if (getLife() == 0) {
			bf.append(+getLife() + " de vida (morreu)");
		} else {
			bf.append(+getLife() + " de vida");
		}
		return bf.toString();

	}

}
