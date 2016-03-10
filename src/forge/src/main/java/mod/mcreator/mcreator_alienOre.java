
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
import java.util.*;

import net.minecraftforge.common.util.*;
import net.minecraft.client.renderer.texture.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import net.minecraft.client.resources.model.*;
import net.minecraft.block.state.*;
public class mcreator_alienOre {

public mcreator_alienOre(){}

public static BlockAlienOre block;

public static Object instance;public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){
}
public void registerRenderers(){}
public void load(FMLInitializationEvent event){
if(event.getSide() == Side.CLIENT){
Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation("TestEnvironmentMod:AlienOre", "inventory"));}
}


static{

block = (BlockAlienOre)(new BlockAlienOre().setHardness(4.0F)
.setResistance(15.0F)
.setLightLevel(0.0F)
.setUnlocalizedName("AlienOre")
.setLightOpacity(0)
.setStepSound(Block.soundTypeStone)
.setCreativeTab(mcreator_hacheTab.tab)
);block.setBlockBounds(0.0F,0.0F,0.0F,1.0F,1.0F,1.0F);
block.setHarvestLevel("pickaxe", 1);
}


public void generateSurface(World world, java.util.Random rand, int chunkX, int chunkZ){
for(int i = 0; i < 12; i++){
int randPosX = chunkX + rand.nextInt(16);
int randPosY = rand.nextInt(108)+20;
int randPosZ = chunkZ + rand.nextInt(16);
(new WorldGenMinable(mcreator_alienOre.block.getDefaultState(), 16)).generate(world, rand, new BlockPos(randPosX, randPosY, randPosZ));
}
}

public void generateNether(World world, Random random, int chunkX, int chunkZ){}
static class BlockAlienOre extends Block
{

int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0,a6 = 0;

boolean red = false;





protected BlockAlienOre()
{
        super(Material.ground);

GameRegistry.registerBlock(this, "AlienOre");

}


public void onBlockAdded(World world, BlockPos pos, IBlockState state){
int i = pos.getX();int j = pos.getY();int k = pos.getZ();world.scheduleUpdate(new BlockPos(i, j, k), this, this.tickRate(world));

}
public int isProvidingStrongPower(IBlockAccess worldIn, BlockPos pos, IBlockState state, EnumFacing side){
return red?15:0;
}
public int isProvidingWeakPower(IBlockAccess worldIn, BlockPos pos, IBlockState state, EnumFacing side){
return red?15:0;
}
public void onBlockClicked(World world, BlockPos pos, EntityPlayer entity){
int i = pos.getX();int j = pos.getY();int k = pos.getZ();
if(true){
world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
}

}
@SideOnly(Side.CLIENT)
public EnumWorldBlockLayer getBlockLayer()
{
return EnumWorldBlockLayer.SOLID;
}

@Override
public int tickRate(World world)
{
    return 10;
}

public int quantityDropped(Random par1Random){
return 1;
}

}
}
