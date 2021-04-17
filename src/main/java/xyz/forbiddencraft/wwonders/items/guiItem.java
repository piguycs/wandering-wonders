package xyz.forbiddencraft.wwonders.items;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import xyz.forbiddencraft.wwonders.gui.ExampleScreen;
import xyz.forbiddencraft.wwonders.gui.ExampleGui;

public class guiItem extends Item {

    public guiItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        // GOOEY
        MinecraftClient.getInstance().openScreen(new ExampleScreen(new ExampleGui()));
        
        return super.use(world, user, hand);
    }
    
}
