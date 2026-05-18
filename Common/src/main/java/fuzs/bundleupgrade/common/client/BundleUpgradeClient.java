package fuzs.bundleupgrade.common.client;

import fuzs.bundleupgrade.common.BundleUpgrade;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.common.api.config.v3.ConfigHolder;

public class BundleUpgradeClient implements ClientModConstructor {

    @Override
    public void onConstructMod() {
        ConfigHolder.registerConfigurationScreen(BundleUpgrade.MOD_ID, "iteminteractions");
    }
}
