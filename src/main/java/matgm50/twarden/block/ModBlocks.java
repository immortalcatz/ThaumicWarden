package matgm50.twarden.block;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.twarden.block.tile.TileWitor;
import matgm50.twarden.lib.BlockLib;
import net.minecraft.block.Block;

/**
 * Created by MasterAbdoTGM50 on 5/22/2014.
 */

public class ModBlocks {

    public static Block blockExubitura = new BlockExubitura();
    public static Block blockInfusedQuartzNormal = new BlockQuartzNormal();
    public static Block blockInfusedQuartzChiseled = new BlockQuartzChiseled();
    public static Block blockInfusedQuartzPillar = new BlockQuartzPillar();
    public static Block blockInfusedQuartzSlab = new BlockQuartzSlab();
    public static Block blockInfusedQuartzStair = new BlockQuartzStair();
    public static Block blockWitor = new BlockWitor();

    public static void init() {

        GameRegistry.registerBlock(blockExubitura, BlockLib.EXUBITURA_NAME);
        GameRegistry.registerBlock(blockInfusedQuartzNormal, BlockLib.QUARTZ_NORMAL_NAME);
        GameRegistry.registerBlock(blockInfusedQuartzChiseled, BlockLib.QUARTZ_CHISELED_NAME);
        GameRegistry.registerBlock(blockInfusedQuartzPillar, BlockLib.QUARTZ_PILLAR_NAME);
        GameRegistry.registerBlock(blockInfusedQuartzSlab, BlockLib.QUARTZ_SLAB_NAME);
        GameRegistry.registerBlock(blockInfusedQuartzStair, BlockLib.QUARTZ_STAIR_NAME);
        GameRegistry.registerBlock(blockWitor, BlockLib.BLOCK_WITOR_NAME);

        GameRegistry.registerTileEntity(TileWitor.class, BlockLib.TILE_WITOR_NAME);

    }

}
