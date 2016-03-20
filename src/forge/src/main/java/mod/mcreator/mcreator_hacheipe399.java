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

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.init.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class mcreator_hacheipe399 {

	public static int mobid = 0;
	public Object instance;

    public void load(FMLInitializationEvent event){
	
		RenderingRegistry.registerEntityRenderingHandler(mcreator_hacheipe399.Entityhacheipe399.class, new RenderBiped(Minecraft.getMinecraft().getRenderManager(), new ModelBiped(), 0, 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("hachemob.png");}});
	
	}

    public void generateNether(World world, Random random, int chunkX, int chunkZ){}
	public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
	public int addFuel(ItemStack fuel){
		return 0;
	}
	@SideOnly(Side.CLIENT)
	public void registerRenderers(){
		
	}
	public void serverLoad(FMLServerStartingEvent event){}
	public void preInit(FMLPreInitializationEvent event){
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		mobid = entityID;
		EntityRegistry.registerGlobalEntityID(mcreator_hacheipe399.Entityhacheipe399.class, "hacheipe399", entityID);
		EntityRegistry.registerModEntity(mcreator_hacheipe399.Entityhacheipe399.class, "hacheipe399", entityID, instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, (51 << 16) + (0 << 8) + 0, (51 << 16) + (51 << 8) + 255));
		EntityRegistry.addSpawn(mcreator_hacheipe399.Entityhacheipe399.class, 1, 1, 4, EnumCreatureType.MONSTER , clean(BiomeGenBase.getBiomeGenArray()));

        DungeonHooks.addDungeonMob("hacheipe399", 180);
	}
	
	public static BiomeGenBase[] clean(final BiomeGenBase[] v) {
		List<BiomeGenBase> list = new ArrayList<BiomeGenBase>(Arrays.asList(v));
		list.removeAll(Collections.singleton(null));
		return list.toArray(new BiomeGenBase[list.size()]);
	}

    /*public Entity spawnEntity(int var1, World var2, double var3, double var5, double var7)
    {
        if(var1==mobid)
                return new mcreator_hacheipe399.Entityhacheipe399(var2);
        else
                return null;
    }*/


   public static class Entityhacheipe399 extends EntityWolf 
	{
		World world = null;
	    public Entityhacheipe399(World var1)
	    {
	        super(var1);
	        world = var1;
	        experienceValue = 50;
	        this.isImmuneToFire = true;
	        addRandomArmor();
			setNoAI(!true);
        	
	    }

	    

	    public boolean hasCustomNameTag(){
return true;
}


	    
protected void addRandomArmor(){

}

protected void dropRareDrop(int par1){
this.dropItem(mcreator_secretRecord.block, 1);
}

		
		@Override
		protected Item getDropItem()
		{
			return new ItemStack(mcreator_hacheGem.block).getItem();
		}

	    @Override
	    protected String getLivingSound()
	    {
	        return "mob.blaze.breathe";
	    }

	    @Override
	    protected String getHurtSound()
	    {
	        return "game.neutral.hurt";
	    }
		
		@Override
	    protected String getDeathSound()
	    {
	        return "game.neutral.die";
	    }

		@Override
	    public void onStruckByLightning(EntityLightningBolt entityLightningBolt){
			super.onStruckByLightning(entityLightningBolt);
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			Entity entity = this;
			
		}

		@Override
		public void fall(float l, float d){
			super.fall(l,d);
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			super.fall(l,d);
			Entity entity = this;
			
		}

		@Override
		public void onDeath(DamageSource source){
			super.onDeath(source);
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			Entity entity = this;
			
			
		}

		@Override
		public boolean interact(EntityPlayer entity){
			super.interact(entity);
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			
			return true;
		}
		
		@Override
		protected float getSoundVolume()
		{
        return 1.0F;
		}
		
	}

	

}
