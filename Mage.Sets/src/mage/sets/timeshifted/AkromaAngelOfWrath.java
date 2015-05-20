/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets.timeshifted;

import java.util.UUID;
import mage.constants.CardType;
import mage.constants.Rarity;
import mage.MageInt;
import mage.ObjectColor;
import mage.abilities.keyword.*;
import mage.cards.CardImpl;
import mage.filter.FilterCard;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.mageobject.ColorPredicate;

/**
 *
 * @author Loki
 */
public class AkromaAngelOfWrath extends CardImpl {

    private static final FilterCard protectionFilter = new FilterCard("black and from red");

    static {
        protectionFilter.add(Predicates.or(new ColorPredicate(ObjectColor.BLACK),new ColorPredicate(ObjectColor.RED)));
    }

    public AkromaAngelOfWrath(UUID ownerId) {
        super(ownerId, 1, "Akroma, Angel of Wrath", Rarity.COMMON, new CardType[]{CardType.CREATURE}, "{5}{W}{W}{W}");
        this.expansionSetCode = "TSB";
        this.supertype.add("Legendary");
        this.subtype.add("Angel");

        this.power = new MageInt(6);
        this.toughness = new MageInt(6);

        this.addAbility(FlyingAbility.getInstance());
        this.addAbility(FirstStrikeAbility.getInstance());
        this.addAbility(VigilanceAbility.getInstance());
        this.addAbility(TrampleAbility.getInstance());
        this.addAbility(HasteAbility.getInstance());
        // protection from black and from red
        this.addAbility(new ProtectionAbility(protectionFilter));
    }

    public AkromaAngelOfWrath(final AkromaAngelOfWrath card) {
        super(card);
    }

    @Override
    public AkromaAngelOfWrath copy() {
        return new AkromaAngelOfWrath(this);
    }
}
