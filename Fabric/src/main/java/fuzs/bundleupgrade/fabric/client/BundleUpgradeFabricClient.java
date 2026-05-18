package fuzs.bundleupgrade.fabric.client;

import fuzs.bundleupgrade.common.BundleUpgrade;
import fuzs.bundleupgrade.common.client.BundleUpgradeClient;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import net.fabricmc.api.ClientModInitializer;

public class BundleUpgradeFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientModConstructor.construct(BundleUpgrade.MOD_ID, BundleUpgradeClient::new);
    }
}
