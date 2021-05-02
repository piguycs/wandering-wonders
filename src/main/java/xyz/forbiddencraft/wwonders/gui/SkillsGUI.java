package xyz.forbiddencraft.wwonders.gui;

import xyz.forbiddencraft.wwonders.gui.widgets.skillBar;

import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.data.Texture;
import io.github.cottonmc.cotton.gui.widget.WBar;


public class SkillsGUI extends LightweightGuiDescription {
    public SkillsGUI() {
        
        final Identifier texture = new Identifier("wwonders", "textures/gui/progressbarbg.png");
        final Identifier texture1 = new Identifier("wwonders", "textures/gui/bar.png");
        final Texture barBG = new Texture(texture);
        final Texture barBG1 = new Texture(texture1);
        
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(256, 240);

        // TOP THINGY
        WLabel skillDislay = new WLabel(new TranslatableText("skill.wwonders.heading").formatted(Formatting.BOLD));
        root.add(skillDislay, 6, 0, 0, 0);

        // COMBAT SKILL
        WLabel combatSkillLbl = new WLabel(new TranslatableText("skill.wwonders.combat"));
        root.add(combatSkillLbl, 0, 1, 3, 0);
        skillBar bar = new skillBar();
        root.add(bar, 0, 1, 5, 3);
        WButton btnCmbt = new WButton(new TranslatableText("skill.wwonders.combat.button"));
        root.add(btnCmbt, 12, 1, 3, 0);


        // ADVENTURING SKILL
        WLabel AdvSkillLbl = new WLabel(new TranslatableText("skill.wwonders.adventuring"));
        root.add(AdvSkillLbl, 0, 3 , 3, 0);
        WBar advBar = new WBar(barBG, barBG1, 1, 10);
        root.add(advBar, 0, 3, 3, 0);
        WButton btnAdv = new WButton(new TranslatableText("skill.wwonders.combat.button"));
        root.add(btnAdv, 12, 3, 3, 0);
        

        root.validate(this);

    }
}