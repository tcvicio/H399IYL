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
import java.util.*;

import net.minecraftforge.common.util.*;
import net.minecraft.client.renderer.texture.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import net.minecraft.client.resources.model.*;
import net.minecraft.block.state.*;
public class mcreator_machinePurifier {

public mcreator_machinePurifier(){}

public static BlockMachinePurifier block;

public static Object instance;public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){
}
public void registerRenderers(){}
public void load(FMLInitializationEvent event){
GameRegistry.registerTileEntity(mcreator_machinePurifier.TileEntityCustom.class , "TileEntitymachinePurifier");
if(event.getSide() == Side.CLIENT){
Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation("TestEnvironmentMod:MachinePurifier", "inventory"));}

GameRegistry.addRecipe(new ItemStack(block, 1), new Object[]{
	"012", "345", "678", Character.valueOf('0'), new ItemStack(Blocks.lapis_block, 1), Character.valueOf('1'), new ItemStack(mcreator_compressedEndStone.block, 1), Character.valueOf('2'), new ItemStack(Blocks.lapis_block, 1), Character.valueOf('3'), new ItemStack(mcreator_compressedEndStone.block, 1), Character.valueOf('4'), new ItemStack(mcreator_alienChip.block, 1), Character.valueOf('5'), new ItemStack(mcreator_compressedEndStone.block, 1), Character.valueOf('6'), new ItemStack(Blocks.lapis_block, 1), Character.valueOf('7'), new ItemStack(mcreator_compressedEndStone.block, 1), Character.valueOf('8'), new ItemStack(Blocks.lapis_block, 1), 
});
}


static{

block = (BlockMachinePurifier)(new BlockMachinePurifier().setHardness(12.0F)
.setResistance(60.0F)
.setLightLevel(0.0F)
.setUnlocalizedName("MachinePurifier")
.setLightOpacity(0)
.setStepSound(Block.soundTypeMetal)
.setCreativeTab(mcreator_hacheTab.tab)
);block.setBlockBounds(0.0F,0.0F,0.0F,1.0F,1.0F,1.0F);
block.setHarvestLevel("pickaxe", 3);
}

public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
static class BlockMachinePurifier extends Block
implements ITileEntityProvider{

int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0,a6 = 0;

boolean red = false;





protected BlockMachinePurifier()
{
        super(Material.ground);

GameRegistry.registerBlock(this, "MachinePurifier");

}


@Override
public TileEntity createNewTileEntity(World worldIn, int meta){
return new TileEntityCustom();
}

@Override
public void breakBlock(World world, BlockPos pos, IBlockState state) {
TileEntity tileentity = world.getTileEntity(pos);
InventoryHelper.dropInventoryItems(world, pos, (TileEntityCustom)tileentity);
world.removeTileEntity(pos);
super.breakBlock(world, pos, state);
}

@Override
public boolean onBlockEventReceived(World worldIn, BlockPos pos, IBlockState state, int eventID, int eventParam) {
super.onBlockEventReceived(worldIn, pos, state, eventID, eventParam);
TileEntity tileentity = worldIn.getTileEntity(pos);
return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
}

@Override
public int getRenderType(){
return 3;
}

@Override
public boolean hasComparatorInputOverride(){
return true;
}

@Override
public int getComparatorInputOverride(World worldIn, BlockPos pos){
TileEntity tileentity = worldIn.getTileEntity(pos);
if (tileentity instanceof mcreator_machinePurifier.TileEntityCustom)
return Container.calcRedstoneFromInventory((TileEntityCustom)tileentity);
else
return 0;
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
public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumFacing side, float hitX, float hitY, float hitZ){
int i = pos.getX();int j = pos.getY();int k = pos.getZ();
if(true){
if(entity instanceof EntityPlayer)((EntityPlayer)entity).openGui(instance, mcreator_purifierGUI.GUIID, world, i, j, k);
}

return true;}
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
public static class TileEntityCustom extends TileEntityLockable implements IInventory
{
    private static final Random RNG = new Random();
    private ItemStack[] stacks = new ItemStack[9];
    protected String customName;

    public int getSizeInventory()
    {
        return 9;
    }

    public ItemStack getStackInSlot(int index)
    {
        return this.stacks[index];
    }

    public ItemStack decrStackSize(int index, int count)
    {
        if (this.stacks[index] != null)
        {
            if (this.stacks[index].stackSize <= count)
            {
                ItemStack itemstack1 = this.stacks[index];
                this.stacks[index] = null;
                this.markDirty();
                return itemstack1;
            }
            else
            {
                ItemStack itemstack = this.stacks[index].splitStack(count);

                if (this.stacks[index].stackSize == 0)
                {
                    this.stacks[index] = null;
                }

                this.markDirty();
                return itemstack;
            }
        }
        else
        {
            return null;
        }
    }

    /**
     * Removes a stack from the given slot and returns it.
     */
    public ItemStack removeStackFromSlot(int index)
    {
        if (this.stacks[index] != null)
        {
            ItemStack itemstack = this.stacks[index];
            this.stacks[index] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

    public void setInventorySlotContents(int index, ItemStack stack)
    {
        this.stacks[index] = stack;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
        {
            stack.stackSize = this.getInventoryStackLimit();
        }

        this.markDirty();
    }

    public int addItemStack(ItemStack stack)
    {
        for (int i = 0; i < this.stacks.length; ++i)
        {
            if (this.stacks[i] == null || this.stacks[i].getItem() == null)
            {
                this.setInventorySlotContents(i, stack);
                return i;
            }
        }

        return -1;
    }

    public String getName()
    {
        return this.hasCustomName() ? this.customName : "container.dispenser";
    }

    public void setCustomName(String customName)
    {
        this.customName = customName;
    }

    public boolean hasCustomName()
    {
        return this.customName != null;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        NBTTagList nbttaglist = compound.getTagList("Items", 10);
        this.stacks = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound nbttagcompound = nbttaglist.getCompoundTagAt(i);
            int j = nbttagcompound.getByte("Slot") & 255;

            if (j >= 0 && j < this.stacks.length)
            {
                this.stacks[j] = ItemStack.loadItemStackFromNBT(nbttagcompound);
            }
        }
    }

	@Override
    public void writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);
        NBTTagList nbttaglist = new NBTTagList();

        for (int i = 0; i < this.stacks.length; ++i)
        {
            if (this.stacks[i] != null)
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                nbttagcompound.setByte("Slot", (byte)i);
                this.stacks[i].writeToNBT(nbttagcompound);
                nbttaglist.appendTag(nbttagcompound);
            }
        }

        compound.setTag("Items", nbttaglist);
    }

    public int getInventoryStackLimit()
    {
        return 64;
    }

    public boolean isUseableByPlayer(EntityPlayer player)
    {
        return this.worldObj.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
    }

    public void openInventory(EntityPlayer player)
    {
    }

    public void closeInventory(EntityPlayer player)
    {
    }

    /**
     * Returns true if automation is allowed to insert the given stack (ignoring stack size) into the given slot.
     */
    public boolean isItemValidForSlot(int index, ItemStack stack)
    {
        return true;
    }

    public String getGuiID()
    {
        return "minecraft:machinePurifier";
    }

	@Override
    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
    {
        throw new UnsupportedOperationException();
    }

    public int getField(int id)
    {
        return 0;
    }

    public void setField(int id, int value)
    {
    }

    public int getFieldCount()
    {
        return 0;
    }

    public void clear()
    {
        for (int i = 0; i < this.stacks.length; ++i)
        {
            this.stacks[i] = null;
        }
    }
}
}
