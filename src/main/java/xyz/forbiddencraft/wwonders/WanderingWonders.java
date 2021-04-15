package xyz.forbiddencraft.wwonders;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class WanderingWonders implements ModInitializer {

    public static final Item END_SWORD = new endSword(new Item.Settings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("wwonders", "end_sword"), END_SWORD);
        
    }
    
}
