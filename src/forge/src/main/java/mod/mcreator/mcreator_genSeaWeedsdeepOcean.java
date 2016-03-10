
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

import java.util.Random;

public class mcreator_genSeaWeedsdeepOcean{

public Object instance;

public mcreator_genSeaWeedsdeepOcean(){}

public void load(FMLInitializationEvent event){
}


	public void generateSurface(World world, Random random, int i2, int k2){

int i = i2 + random.nextInt(5);
int k = k2 + random.nextInt(5);

int chunkX = i >> 2;
int chunkZ = k >> 2;
int height = world.getChunkFromChunkCoords(chunkX, chunkZ).getHeight(new BlockPos(i & 15, 0, k & 15));

int j = height-20;
if(world.getBiomeGenForCoords(new BlockPos(i, j, k)).biomeName.equals(BiomeGenBase.deepOcean.biomeName)) {


if((random.nextInt(1000000))<=1000000){
boolean place = true;

if(place){
int addplacement = random.nextInt(20);
world.setBlockState(new BlockPos(i+addplacement, j+0, k+addplacement), mcreator_weedPlant.block.getDefaultState(), 3);
world.setBlockState(new BlockPos(i+addplacement, j+0, k+addplacement), mcreator_weedPlant.block.getDefaultState(), 3);
world.setBlockState(new BlockPos(i+addplacement, j+0, k+addplacement), mcreator_weedPlant.block.getDefaultState(), 3);
world.setBlockState(new BlockPos(i+addplacement, j+0, k+addplacement), mcreator_weedPlant.block.getDefaultState(), 3);
world.setBlockState(new BlockPos(i+addplacement, j+0, k+addplacement), mcreator_weedPlant.block.getDefaultState(), 3);
}
}
}
}

public void generateNether(World world, Random random, int chunkX, int chunkZ){}

	public int addFuel(ItemStack fuel){
		return 0;
	}
	public void serverLoad(FMLServerStartingEvent event){}
	public void preInit(FMLPreInitializationEvent event){}
	public void registerRenderers(){}


}
