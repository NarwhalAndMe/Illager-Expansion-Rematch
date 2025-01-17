package me.sandbox.poly;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import org.jetbrains.annotations.Nullable;

public class SimplePolymerAutoItem extends Item implements PolymerAutoItem {
    private final Item polymerItem;

    public SimplePolymerAutoItem(Settings settings, Item polymerItem) {
        super(settings);
        this.polymerItem = polymerItem;
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return this.polymerItem;
    }
}
