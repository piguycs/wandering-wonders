package xyz.forbiddencraft.wwonders.items;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class eris extends Item{

    public eris(Settings settings) {
        super(settings);
    }
    
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        // THE TOOLTIPS BEGAIN
        tooltip.add(new TranslatableText("item.wwonders.eris.info.line1").formatted(Formatting.GRAY));
        tooltip.add(new TranslatableText("item.wwonders.eris.info.line2").formatted(Formatting.GRAY));
        tooltip.add(new TranslatableText("item.wwonders.tooltip.linebreak"));
        tooltip.add(new TranslatableText("item.wwonders.eris.tooltip").formatted(Formatting.BOLD, Formatting.GOLD));
    }

}
