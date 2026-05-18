package fuzs.bundleupgrade.common;

import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BundleUpgrade implements ModConstructor {
    public static final String MOD_ID = "bundleupgrade";
    public static final String MOD_NAME = "Bundle Upgrade";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
