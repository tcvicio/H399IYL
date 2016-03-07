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

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

@SuppressWarnings("unchecked")
public class mcreator_wreckedShipStory {

public static Object instance;

public static int GUIID = 1;

public mcreator_wreckedShipStory(){}

public void load(FMLInitializationEvent event){}

public void registerRenderers(){}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){
	return 0;
}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}


public static IInventory inherited;

public static class GuiContainerMod extends Container {
		
		World world = null;
		EntityPlayer entity = null;
		int i,j,k;
		
        public GuiContainerMod (World world, int i, int j, int k, EntityPlayer player){
			
			this.world = world;
			this.entity = player;
			this.i = i;
			this.j = j;
			this.k = k;
			
			
        }

        @Override
        public boolean canInteractWith(EntityPlayer player) {
                return true;
        }


        protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
			int i;
        	int j;
		
        	for (i = 0; i < 3; ++i){
				for (j = 0; j < 9; ++j){
					this.addSlotToContainer(new Slot(inventoryPlayer, j + (i + 1) * 9, 8 + j * 18, 84 + i * 18));
				}
        	}

        	for (i = 0; i < 9; ++i){
				this.addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
        	}
        }

        @Override
        public ItemStack transferStackInSlot(EntityPlayer playerIn, int index){
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()){
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index < 9){
                if (!this.mergeItemStack(itemstack1, 9, (45-9), true)){//fixes shiftclick error
                    return null;
                }
            }else if (!this.mergeItemStack(itemstack1, 0, 9, false)){
                return null;
            }

            if (itemstack1.stackSize == 0){
                slot.putStack((ItemStack)null);
            }else{
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize){
                return null;
            }

            slot.onPickupFromSlot(playerIn, itemstack1);
        }

        return itemstack;
    }
	
	public void onContainerClosed(EntityPlayer playerIn)
    {
        super.onContainerClosed(playerIn);

		
		
        
    }
}

public static class GuiWindow extends GuiContainer
{

	int i = 0;
	int j = 0;
	int k = 0;
	EntityPlayer entity = null;

	

public GuiWindow(World world, int i, int j, int k, EntityPlayer entity){
	super(new GuiContainerMod(world, i, j, k, entity));
	this.i = i;
	this.j = j;
	this.k = k;
	this.entity = entity;
	this.xSize=176;
	this.ySize=166;
}

private static final ResourceLocation texture = new ResourceLocation("WreckedShipStory.png");

protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
{
	int posX = (this.width) /2;
	int posY = (this.height) /2;
	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	
this.mc.renderEngine.bindTexture(texture);
int k = (this.width - this.xSize) / 2;
int l = (this.height - this.ySize) / 2;
this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);


    zLevel = 100.0F;
    

}

protected void mouseClicked(int par1, int par2, int par3) throws java.io.IOException
{
super.mouseClicked(par1, par2, par3);

}

public void updateScreen()
{
super.updateScreen();
int posX = (this.width) /2;
int posY = (this.height) /2;

}

protected void keyTyped(char par1, int par2)
{


if (par2 != 28 && par2 != 156){
	if (par2 == 1){
		this.mc.displayGuiScreen((GuiScreen)null);
	}
}

}

protected void drawGuiContainerForegroundLayer(int par1, int par2){
	int posX = (this.width) /2;
	int posY = (this.height) /2;
	this.fontRendererObj.drawString("§oFebruary the 24th, 1416", (24), (4), 0x000066);
this.fontRendererObj.drawString("§oWe saw under the deep ocean a", (4), (20), 0x333333);
this.fontRendererObj.drawString("§ostrange temple, which is huge.", (3), (38), 0x333333);
this.fontRendererObj.drawString("§oWe will investigate. But before we", (2), (57), 0x333333);
this.fontRendererObj.drawString("§owill store our treasure in the", (3), (77), 0x333333);
this.fontRendererObj.drawString("§obow of the ship.", (3), (94), 0x333333);
this.fontRendererObj.drawString("§o-Hero Brine, stern writer", (3), (142), 0x006600);

}

public void onGuiClosed()
{
super.onGuiClosed();
Keyboard.enableRepeatEvents(false);
}

public void initGui(){
super.initGui();
this.guiLeft = (this.width - 176) / 2;
this.guiTop = (this.height - 166) / 2;
Keyboard.enableRepeatEvents(true);
this.buttonList.clear();
int posX = (this.width) / 2;
int posY = (this.height) / 2;

}

protected void actionPerformed(GuiButton button)
{
MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
World world = server.worldServers[0];


}

public boolean doesGuiPauseGame()
{
    return false;
}

}

}
