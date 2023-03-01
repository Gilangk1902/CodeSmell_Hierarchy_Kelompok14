package missing_Hierarchy_Before;

public class Actions {
	
	public void Attack(GameObject target, float damage, float accuracy) {
		if(target instanceof Foe) {
			((Foe) target).TakeDamage(damage, accuracy);
		}
		else if(target instanceof Player) {
			((Player) target).TakeDamage(damage, accuracy);
		}
	}
	
	public void Heal(GameObject target, float value) {
		
	}
}
