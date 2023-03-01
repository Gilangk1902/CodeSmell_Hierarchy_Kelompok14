package missing_Hierarchy_Before;

public class Foe implements GameObject{
	float hp;
	
	public Foe(float hp) {
		this.hp = hp;
	}

	public void TakeDamage(float dmgVal, float dodgeChance) {
		hp-=dmgVal;
	}
	
	public void Heal(float healVal) {
		hp+=healVal;
	}

	@Override
	public void Description() {
		// TODO Auto-generated method stub
		
	}
}
