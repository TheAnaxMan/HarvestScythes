//package wraith.harvest_scythes.support;
//
//import com.github.theintfox.tools.PlatinumToolMaterial;
//import net.minecraft.util.Identifier;
//import wraith.harvest_scythes.util.HSUtils;
//import wraith.harvest_scythes.item.MacheteItem;
//import wraith.harvest_scythes.item.ScytheItem;
//import wraith.harvest_scythes.recipe.RecipesGenerator;
//import wraith.harvest_scythes.recipe.SmithingRecipeMaterials;
//import wraith.harvest_scythes.registry.ItemRegistry;
//
//public final class SimplyPlatinumSupport {
//
//    private SimplyPlatinumSupport() {}
//
//    public static void loadItems() {
//        PlatinumToolMaterial material = new PlatinumToolMaterial();
//        ItemRegistry.registerItem("platinum_scythe", () -> new ScytheItem(material, ItemRegistry.getScytheSettings()));
//
//        ItemRegistry.registerItem("platinum_machete", () -> new MacheteItem(material, ItemRegistry.getMacheteSettings()));
//    }
//
//}