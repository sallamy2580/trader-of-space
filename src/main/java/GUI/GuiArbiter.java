package GUI;

import com.TableFlip.SpaceTrader.GameEntity.Gnat;
import com.TableFlip.SpaceTrader.GameEntity.Player;
import com.TableFlip.SpaceTrader.Model.Enums;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: ben
 * Date: 9/6/12
 * Time: 6:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class GuiArbiter {
    private static Player _player;
    public static void newCharacter(String name, int pilotSkill, int fighterSkill, int traderSkill, int engineerSkill){
        HashMap<Enums.Skill, Integer> stats=new HashMap<Enums.Skill, Integer>();
        stats.put(Enums.Skill.PILOT, pilotSkill);
        stats.put(Enums.Skill.FIGHTER, fighterSkill);
        stats.put(Enums.Skill.TRADER, traderSkill);
        stats.put(Enums.Skill.ENGINEER, engineerSkill);
        _player=new Player()
                .setName(name)
                .setCredits(1000)
                .setShip(new Gnat())
                .setStats(stats);
        System.out.println("Created character with name: "+_player.getName()+" and stats as follows:  fighter->"+_player.getStats().get(Enums.Skill.FIGHTER)+" pilot->"+_player.getStats().get(Enums.Skill.PILOT)+" trader->"+_player.getStats().get(Enums.Skill.TRADER)+" engineer->"+_player.getStats().get(Enums.Skill.ENGINEER)+".  This player has "+_player.getCredits()+" credits.");
        com.TableFlip.SpaceTrader.Bootstrap.Bootstrapper.generateGalaxy();
        //GetNamePopUp.main(new String[0]);
    }
}
