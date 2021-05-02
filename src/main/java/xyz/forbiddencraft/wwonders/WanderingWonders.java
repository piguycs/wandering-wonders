package xyz.forbiddencraft.wwonders;

import org.lwjgl.glfw.GLFW;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.options.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.forbiddencraft.wwonders.items.endSword;
import xyz.forbiddencraft.wwonders.items.eris;
import xyz.forbiddencraft.wwonders.items.guiItem;


public class WanderingWonders implements ModInitializer {

    // ITEMS
    public static final Item END_SWORD = new endSword(new Item.Settings().group(ItemGroup.MISC));
    public static final Item ERIS = new eris(new Item.Settings().group(ItemGroup.MISC));
    public static Item GUI_ITEM = new guiItem(new Item.Settings().group(ItemGroup.MISC));


    // Keybinds lel
    private static KeyBinding lolKeybind = KeyBindingHelper.registerKeyBinding(new KeyBinding(
        "wwonders.keybind.halo",
        InputUtil.Type.KEYSYM,
        GLFW.GLFW_KEY_R,
        "wwonders.keybind.category"
    ));


    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("wwonders", "end_sword"), END_SWORD);
        Registry.register(Registry.ITEM, new Identifier("wwonders", "eris"), ERIS);
        Registry.register(Registry.ITEM, new Identifier("wwonders", "gui_item"), GUI_ITEM);

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (lolKeybind.wasPressed()) {
                client.player.sendMessage(new LiteralText("Key 1 was pressed!"), false);
            }
        });
        
    }
    
}
