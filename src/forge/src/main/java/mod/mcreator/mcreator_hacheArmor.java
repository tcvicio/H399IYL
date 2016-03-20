package mod.mcreator;
import net.minecraftforge.fml.client.registry.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.asm.*;
import net.minecraftforge.fml.common.asm.transformers.*;
import net.minecraftforge.fml.common.discovery.*;
import net.minecraftforge.fml.common.discovery.asm.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.functions.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.fml.common.toposort.*;
import net.minecraftforge.fml.common.versioning.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraftforge.fml.server.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.oredict.*;
import net.minecraft.init.*;
import java.util.Random;

import net.minecraftforge.common.util.*;import net.minecraft.client.resources.model.*;
public class mcreator_hacheArmor{

public mcreator_hacheArmor(){}

public static Item helmet;
public static Item body;
public static Item legs;
public static Item boots;
public Object instance;public void load(FMLInitializationEvent event){
if(event.getSide() == Side.CLIENT){
Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(helmet, 0, new ModelResourceLocation("TestEnvironmentMod:HacheArmor_head", "inventory"));
Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(body, 0, new ModelResourceLocation("TestEnvironmentMod:HacheArmor_body", "inventory"));
Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(legs, 0, new ModelResourceLocation("TestEnvironmentMod:HacheArmor_leggins", "inventory"));
Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(boots, 0, new ModelResourceLocation("TestEnvironmentMod:HacheArmor_boots", "inventory"));
}
GameRegistry.addRecipe(new ItemStack(helmet, 1), new Object[]{
	"012", "3X5", "XXX", Character.valueOf('0'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('1'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('2'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('3'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('5'), new ItemStack(mcreator_hacheGem.block, 1), 
});
GameRegistry.addRecipe(new ItemStack(body, 1), new Object[]{
	"0X2", "345", "678", Character.valueOf('0'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('2'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('3'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('4'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('5'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('6'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('7'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('8'), new ItemStack(mcreator_hacheGem.block, 1), 
});
GameRegistry.addRecipe(new ItemStack(legs, 1), new Object[]{
	"012", "3X5", "6X8", Character.valueOf('0'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('1'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('2'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('3'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('5'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('6'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('8'), new ItemStack(mcreator_hacheGem.block, 1), 
});
GameRegistry.addRecipe(new ItemStack(boots, 1), new Object[]{
	"XXX", "3X5", "6X8", Character.valueOf('3'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('5'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('6'), new ItemStack(mcreator_hacheGem.block, 1), Character.valueOf('8'), new ItemStack(mcreator_hacheGem.block, 1), 
});
helmet.setCreativeTab(mcreator_hacheTab.tab);
body.setCreativeTab(mcreator_hacheTab.tab);
legs.setCreativeTab(mcreator_hacheTab.tab);
boots.setCreativeTab(mcreator_hacheTab.tab);
}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){}


static{
ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("HACHEARMOR", "HacheArmor", 70, new int[] {5, 15, 10, 6}, 30);

int armorPreffix = 0;
helmet = (new ItemArmor(enuma, armorPreffix, 0){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){
int i = (int)entity.posX;
int j = (int)entity.posY;
int k = (int)entity.posZ;
}
}).setUnlocalizedName("HacheArmor_head");helmet.setMaxStackSize(1);
body = (new ItemArmor(enuma, armorPreffix, 1){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){
int i = (int)entity.posX;
int j = (int)entity.posY;
int k = (int)entity.posZ;
}
}).setUnlocalizedName("HacheArmor_body");body.setMaxStackSize(1);
legs = (new ItemArmor(enuma, armorPreffix, 2){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){
int i = (int)entity.posX;
int j = (int)entity.posY;
int k = (int)entity.posZ;
}
}).setUnlocalizedName("HacheArmor_leggins");legs.setMaxStackSize(1);
boots = (new ItemArmor(enuma, armorPreffix, 3){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){
int i = (int)entity.posX;
int j = (int)entity.posY;
int k = (int)entity.posZ;
}
}).setUnlocalizedName("HacheArmor_boots");boots.setMaxStackSize(1);

GameRegistry.registerItem(helmet, "HacheArmor_head");
GameRegistry.registerItem(body, "HacheArmor_body");
GameRegistry.registerItem(legs, "HacheArmor_leggins");
GameRegistry.registerItem(boots, "HacheArmor_boots");

}

}
