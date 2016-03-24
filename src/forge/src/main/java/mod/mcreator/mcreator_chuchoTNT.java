
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
import java.awt.event.ActionListener;

import net.minecraftforge.common.util.*;
import net.minecraft.client.renderer.texture.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import net.minecraft.client.resources.model.*;
import net.minecraft.block.state.*;
public class mcreator_chuchoTNT {

public mcreator_chuchoTNT(){}

public static BlockChuchoTNT block;

public static Object instance;public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){
}
public void registerRenderers(){}
public void load(FMLInitializationEvent event){
if(event.getSide() == Side.CLIENT){
Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation("TestEnvironmentMod:ChuchoTNT", "inventory"));}

GameRegistry.addRecipe(new ItemStack(block, 1), new Object[]{
	"012", "345", "678", Character.valueOf('0'), new ItemStack(mcreator_purifiedChuchoPoop.block, 1), Character.valueOf('1'), new ItemStack(Blocks.tnt, 1), Character.valueOf('2'), new ItemStack(mcreator_purifiedChuchoPoop.block, 1), Character.valueOf('3'), new ItemStack(mcreator_compressedObsidian.block, 1), Character.valueOf('4'), new ItemStack(mcreator_alienChip.block, 1), Character.valueOf('5'), new ItemStack(mcreator_compressedObsidian.block, 1), Character.valueOf('6'), new ItemStack(mcreator_purifiedChuchoPoop.block, 1), Character.valueOf('7'), new ItemStack(Blocks.tnt, 1), Character.valueOf('8'), new ItemStack(mcreator_purifiedChuchoPoop.block, 1), 
});
}


static{

block = (BlockChuchoTNT)(new BlockChuchoTNT().setHardness(12.0F)
.setResistance(100.0F)
.setLightLevel(0.0F)
.setUnlocalizedName("ChuchoTNT")
.setLightOpacity(0)
.setStepSound(Block.soundTypeMetal)
.setCreativeTab(mcreator_hacheTab.tab)
);block.setBlockBounds(0.0F,0.0F,0.0F,1.0F,1.0F,1.0F);
block.setHarvestLevel("pickaxe", 3);
}

public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
static class BlockChuchoTNT extends BlockFalling
{

int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0,a6 = 0;

boolean red = false;





protected BlockChuchoTNT()
{
        super(Material.ground);

GameRegistry.registerBlock(this, "ChuchoTNT");

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
public void onNeighborBlockChange(final World world, BlockPos pos, IBlockState state, Block neighborBlock){
final int i = pos.getX();final int j = pos.getY();final int k = pos.getZ();EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
if (world.isBlockIndirectlyGettingPowered(new BlockPos(i, j, k))>0){

if(true){
new java.util.Timer().schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                // your code here
                world.createExplosion((Entity)null, i, j, k, 50F, true);
                setLightLevel(20F);
            }
        }, 
        10000 
);
}

}
}
public void randomDisplayTick(World world, BlockPos pos, IBlockState state, Random random){
EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
int i = pos.getX();int j = pos.getY();int k = pos.getZ();		World par1World = world;
				int par2 = i;
				int par3 = j;
				int par4 = k;
		Random par5Random = random;
if(true)
        for (int l = 0; l < 4; ++l)
        {
            double d0 = (double)((float)par2 + par5Random.nextFloat());
            double d1 = (double)((float)par3 + par5Random.nextFloat());
            double d2 = (double)((float)par4 + par5Random.nextFloat());
            double d3 = 0.0D;
            double d4 = 0.0D;
            double d5 = 0.0D;
            int i1 = par5Random.nextInt(2) * 2 - 1;
            d3 = ((double)par5Random.nextFloat() - 0.5D) * 1.0D;
            d4 = ((double)par5Random.nextFloat() - 0.5D) * 1.0D;
            d5 = ((double)par5Random.nextFloat() - 0.5D) * 1.0D;
            par1World.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, d3, d4, d5);
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
