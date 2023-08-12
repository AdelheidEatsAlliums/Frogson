package net.adelheideatsalliums.frogson.Item;

import net.adelheideatsalliums.frogson.Item.classes.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FrogsonFoods {
    public static final Item POISON_APPLE = new PoisonApple(new FabricItemSettings().food(FrogsonFoodComponents.POISON_APPLE));
    public static final Item FROZEN_APPLE = new FrozenApple(new FabricItemSettings().food(FrogsonFoodComponents.FROZEN_APPLE));
    public static final Item GREEN_APPLE = new GreenApple(new FabricItemSettings().food(FrogsonFoodComponents.GREEN_APPLE));
    public static final Item YELLOW_APPLE = new YellowApple(new FabricItemSettings().food(FrogsonFoodComponents.YELLOW_APPLE));
    public static final Item NIGHT_APPLE = new NightApple(new FabricItemSettings().food(FrogsonFoodComponents.NIGHT_APPLE));
    public static final Item XP_APPLE = new XPApple(new FabricItemSettings().food(FrogsonFoodComponents.XP_APPLE));
    public static final Item EQUINE = new Item(new FabricItemSettings().food(FrogsonFoodComponents.EQUINE));
    public static final Item COOKED_EQUINE = new Item(new FabricItemSettings().food(FrogsonFoodComponents.COOKED_EQUINE));

    public static void registerFrogsonFoods() {
        Registry.register(Registries.ITEM, new Identifier("frogson", "poison_apple"), POISON_APPLE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "frozen_apple"), FROZEN_APPLE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "green_apple"), GREEN_APPLE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "yellow_apple"), YELLOW_APPLE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "night_apple"),  NIGHT_APPLE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "xp_apple"), XP_APPLE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "equine"), EQUINE);
        Registry.register(Registries.ITEM, new Identifier("frogson", "cooked_equine"), COOKED_EQUINE);

    }
}
