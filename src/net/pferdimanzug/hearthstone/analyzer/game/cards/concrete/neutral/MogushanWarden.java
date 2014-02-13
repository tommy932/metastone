package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.neutral;

import net.pferdimanzug.hearthstone.analyzer.game.GameTag;
import net.pferdimanzug.hearthstone.analyzer.game.cards.MinionCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;

public class MogushanWarden extends MinionCard {

	public MogushanWarden() {
		super("Mogu'shan Warden", 1, 7, Rarity.COMMON, HeroClass.ANY, 4);
		setDescription("Taunt");
	}

	@Override
	public Minion summon() {
		return createMinion(GameTag.TAUNT);
	}

}