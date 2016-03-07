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

import java.util.Random;

public class mcreator_beachPalm{

public Object instance;

public mcreator_beachPalm(){}

public void load(FMLInitializationEvent event){
}


	public void generateSurface(World world, Random random, int i2, int k2){

int i = i2 + random.nextInt(15);
int k = k2 + random.nextInt(15);

int chunkX = i >> 4;
int chunkZ = k >> 4;
int height = world.getChunkFromChunkCoords(chunkX, chunkZ).getHeight(new BlockPos(i & 15, 0, k & 15));

int j = height-1;
if(world.getBlockState(new BlockPos(i,j,k)).getBlock()==Blocks.sand){

if(world.getBiomeGenForCoords(new BlockPos(i, j, k)).biomeName.equals(BiomeGenBase.beach.biomeName)) {


if((random.nextInt(1000000)+1)<=1000000){
boolean place = true;

if(place){
world.setBlockState(new BlockPos(i+0, j+0, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+0, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+0, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+0, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+0, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+0, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+0, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+0, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+0, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+0, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+0, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+0, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+0, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+0, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+0, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+0, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+0, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+0, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+0, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+0, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+0, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+0, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+0, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+0, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+0, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+0, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+0, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+0, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+0, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+0, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+0, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+0, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+0, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+0, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+0, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+0, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+0, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+0, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+0, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+0, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+0, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+0, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+0, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+0, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+0, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+0, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+0, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+0, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+0, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+0, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+0, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+0, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+0, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+0, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+0, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+0, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+0, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+0, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+0, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+0, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+0, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+0, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+0, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+0, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+0, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+0, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+0, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+0, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+0, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+0, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+0, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+0, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+0, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+0, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+0, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+0, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+0, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+0, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+0, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+0, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+0, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+0, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+0, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+0, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+0, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+0, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+0, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+0, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+0, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+0, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+0, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+0, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+0, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+0, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+0, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+0, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+0, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+0, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+0, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+0, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+0, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+0, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+0, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+0, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+0, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+0, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+0, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+0, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+0, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+0, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+0, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+0, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+0, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+0, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+0, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+0, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+0, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+0, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+0, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+0, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+0, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+1, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+1, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+1, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+1, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+1, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+1, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+1, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+1, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+1, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+1, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+1, k+0), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+1, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+1, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+1, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+1, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+1, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+1, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+1, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+1, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+1, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+1, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+1, k+1), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+1, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+1, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+1, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+1, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+1, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+1, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+1, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+1, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+1, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+1, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+1, k+2), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+1, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+1, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+1, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+1, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+1, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+1, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+1, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+1, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+1, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+1, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+1, k+3), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+1, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+1, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+1, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+1, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+1, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+1, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+1, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+1, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+1, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+1, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+1, k+4), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+1, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+1, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+1, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+1, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+1, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+1, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+1, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+1, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+1, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+1, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+1, k+5), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+1, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+1, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+1, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+1, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+1, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+1, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+1, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+1, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+1, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+1, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+1, k+6), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+1, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+1, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+1, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+1, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+1, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+1, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+1, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+1, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+1, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+1, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+1, k+7), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+1, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+1, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+1, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+1, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+1, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+1, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+1, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+1, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+1, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+1, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+1, k+8), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+1, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+1, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+1, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+1, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+1, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+1, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+1, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+1, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+1, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+1, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+1, k+9), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+0, j+1, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+1, j+1, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+2, j+1, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+3, j+1, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+4, j+1, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+1, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+6, j+1, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+7, j+1, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+8, j+1, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+9, j+1, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+10, j+1, k+10), Block.getBlockById(12).getStateFromMeta(0), 3);
world.setBlockState(new BlockPos(i+5, j+2, k+5), Block.getBlockById(17).getStateFromMeta(3), 3);
world.setBlockState(new BlockPos(i+5, j+3, k+5), Block.getBlockById(17).getStateFromMeta(3), 3);
world.setBlockState(new BlockPos(i+5, j+4, k+5), Block.getBlockById(17).getStateFromMeta(3), 3);
world.setBlockState(new BlockPos(i+5, j+5, k+5), Block.getBlockById(17).getStateFromMeta(3), 3);
world.setBlockState(new BlockPos(i+5, j+6, k+5), Block.getBlockById(17).getStateFromMeta(3), 3);
world.setBlockState(new BlockPos(i+5, j+7, k+5), Block.getBlockById(17).getStateFromMeta(3), 3);
world.setBlockState(new BlockPos(i+5, j+8, k+0), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+0, j+8, k+5), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+5, j+8, k+5), Block.getBlockById(17).getStateFromMeta(3), 3);
world.setBlockState(new BlockPos(i+10, j+8, k+5), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+5, j+8, k+10), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+5, j+9, k+1), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+1, j+9, k+5), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+5, j+9, k+5), Block.getBlockById(17).getStateFromMeta(3), 3);
world.setBlockState(new BlockPos(i+9, j+9, k+5), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+5, j+9, k+9), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+5, j+10, k+2), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+5, j+10, k+3), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+4, j+10, k+4), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+5, j+10, k+4), Block.getBlockById(18).getStateFromMeta(7), 3);
world.setBlockState(new BlockPos(i+6, j+10, k+4), Block.getBlockById(18).getStateFromMeta(7), 3);
world.setBlockState(new BlockPos(i+2, j+10, k+5), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+3, j+10, k+5), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+4, j+10, k+5), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+5, j+10, k+5), Block.getBlockById(18).getStateFromMeta(7), 3);
world.setBlockState(new BlockPos(i+6, j+10, k+5), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+7, j+10, k+5), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+8, j+10, k+5), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+4, j+10, k+6), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+5, j+10, k+6), Block.getBlockById(18).getStateFromMeta(7), 3);
world.setBlockState(new BlockPos(i+6, j+10, k+6), Block.getBlockById(18).getStateFromMeta(15), 3);
world.setBlockState(new BlockPos(i+5, j+10, k+7), Block.getBlockById(18).getStateFromMeta(7), 3);
world.setBlockState(new BlockPos(i+5, j+10, k+8), Block.getBlockById(18).getStateFromMeta(15), 3);
}
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
