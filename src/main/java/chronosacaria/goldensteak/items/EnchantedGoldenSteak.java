package chronosacaria.goldensteak.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantedGoldenSteak extends Item {
    public EnchantedGoldenSteak(Item.Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
