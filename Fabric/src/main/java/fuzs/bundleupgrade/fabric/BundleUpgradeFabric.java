package fuzs.bundleupgrade.fabric;

import fuzs.bundleupgrade.common.BundleUpgrade;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import net.fabricmc.api.ModInitializer;

public class BundleUpgradeFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ModConstructor.construct(BundleUpgrade.MOD_ID, BundleUpgrade::new);
    }
}
