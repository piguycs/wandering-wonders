package xyz.forbiddencraft.wwonders.gui;

import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WButton;


public class ExampleGui extends LightweightGuiDescription {
    public ExampleGui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(256, 240);

        // TOP THINGY
        WLabel skillDislay = new WLabel(new TranslatableText("skill.wwonders.heading"));
        root.add(skillDislay, 6, 0, 0, 0);

        // COMBAT SKILL
        WLabel combatSkillLbl = new WLabel(new TranslatableText("skill.wwonders.combat"));
        root.add(combatSkillLbl, 0, 1, 3, 0);
        WButton btnCmbt = new WButton(new TranslatableText("skill.wwonders.combat.button"));
        root.add(btnCmbt, 12, 1, 3, 0);


        // ADVENTURING SKILL
        WLabel AdvSkillLbl = new WLabel(new TranslatableText("skill.wwonders.adventuring"));
        root.add(AdvSkillLbl, 0, 3 , 3, 0);
        WButton btnAdv = new WButton(new TranslatableText("skill.wwonders.combat.button"));
        root.add(btnAdv, 12, 3, 3, 0);
        

        root.validate(this);

    }
}