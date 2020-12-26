package chronosacaria.goldensteak;

import chronosacaria.goldensteak.foodcomponents.GSFoodComponents;
import net.fabricmc.api.ModInitializer;

public class Goldensteak implements ModInitializer {

    public static final String MOD_ID = "goldensteak";

    @Override
    public void onInitialize() {
        GSFoodComponents.registerFoods();
    }
}
