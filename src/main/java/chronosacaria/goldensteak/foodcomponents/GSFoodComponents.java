package chronosacaria.goldensteak.foodcomponents;

import chronosacaria.goldensteak.Goldensteak;
import chronosacaria.goldensteak.items.EnchantedGoldenSteak;
import chronosacaria.goldensteak.items.GoldenSteak;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GSFoodComponents {

    public static final Item GOLDEN_STEAK = new GoldenSteak(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(8)
                    .saturationModifier(1.2F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F)
                    .meat()
                    .alwaysEdible()
                    .build()
            )
    );

    public static final Item ENCHANTED_GOLDEN_STEAK = new EnchantedGoldenSteak(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
                    .hunger(4)
                    .saturationModifier(1.2F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3), 1.0F)
                    .meat()
                    .alwaysEdible()
                    .build()
            )
    );

    public static void registerFoods(){
        Registry.register(Registry.ITEM, new Identifier(Goldensteak.MOD_ID, "golden_steak"), GOLDEN_STEAK);
        Registry.register(Registry.ITEM, new Identifier(Goldensteak.MOD_ID, "enchanted_golden_steak"),ENCHANTED_GOLDEN_STEAK);

    }
}
