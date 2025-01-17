package me.sandbox.item.custom;

import eu.pb4.polymer.api.item.PolymerItem;
import me.sandbox.poly.PolymerAutoItem;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import org.jetbrains.annotations.Nullable;

public class ModPickaxeItem extends PickaxeItem implements PolymerAutoItem {
    public ModPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return Items.NETHERITE_PICKAXE;
    }
}
