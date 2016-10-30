package mcp.mobius.waila.overlay;

import mcp.mobius.waila.api.impl.ConfigHandler;
import mcp.mobius.waila.utils.Constants;
import net.minecraftforge.common.config.Configuration;

public class OverlayConfig {

    public static int posX;
    public static int posY;
    public static int alpha;
    public static int bgcolor;
    public static int gradient1;
    public static int gradient2;
    public static int fontcolor;
    public static float scale;

    public static void updateColors() {
        int alphaC = ConfigHandler.instance().getConfig(Configuration.CATEGORY_GENERAL, Constants.CFG_WAILA_ALPHA, 80);
        if (alphaC == 100)
            alphaC = 99;
        OverlayConfig.alpha = (int) (alphaC / 100.0f * 256) << 24;
        OverlayConfig.bgcolor = OverlayConfig.alpha + ConfigHandler.instance().getConfig(Configuration.CATEGORY_GENERAL, Constants.CFG_WAILA_BGCOLOR, 0x100010);
        OverlayConfig.gradient1 = OverlayConfig.alpha + ConfigHandler.instance().getConfig(Configuration.CATEGORY_GENERAL, Constants.CFG_WAILA_GRADIENT1, 0x5000ff);
        OverlayConfig.gradient2 = OverlayConfig.alpha + ConfigHandler.instance().getConfig(Configuration.CATEGORY_GENERAL, Constants.CFG_WAILA_GRADIENT2, 0x28007f);
        OverlayConfig.fontcolor = ConfigHandler.instance().getConfig(Configuration.CATEGORY_GENERAL, Constants.CFG_WAILA_FONTCOLOR, 0xA0A0A0);
    }
}
