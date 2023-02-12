package Task06.chars;

import java.util.List;

public class Wizard extends Base {
    public Wizard(List<Base> gang, int x, int y, int amount, String heroName) {
        super(17, 12, 5, new int[]{-5,-5}, 30, 30, 9, false, true, "Wizard", heroName);
        super.gang = gang;
        super.position = new Vector2(x, y);
        super.amount = amount;
    }

    @Override
    public void Step(List<Base> group) {
        if(this.status.equals("dead")) return;

        double totalDamage = getDamage()[0] * amount;
        for (Base npc: gang) {
            if(!npc.status.equals("dead") && !npc.getName().equals("Peasant") && checkHp(npc))
            {
                Base diyingNpc = null;
                double minHealth = Double.MAX_VALUE;

                for (Base hero: gang) {
                    var temp = hero.getMaxHealth() - hero.getCurrentHealth();
                    if(temp < minHealth)
                    {
                        minHealth = temp;
                        diyingNpc = hero;
                    }
                }

                diyingNpc.setCurrentHealth(diyingNpc.getCurrentHealth() - totalDamage);
                if(diyingNpc.getMaxHealth() < diyingNpc.getCurrentHealth())
                {
                    diyingNpc.setCurrentHealth(diyingNpc.getMaxHealth());
                }
                return;
            }
            else if(npc.getName().equals("Wizard") || npc.getName().equals("Sniper")
                    && npc.status.equals("dead"))
            {
                npc.amount = 1; npc.setCurrentHealth(1);
                npc.status = "stand";
                return;
            }
        }

        if(shoot > 0){
            Base aimNpc = group.get(findAim(group));
            aimNpc.getDamage(-totalDamage);
            shoot--;
        }
    }


}
