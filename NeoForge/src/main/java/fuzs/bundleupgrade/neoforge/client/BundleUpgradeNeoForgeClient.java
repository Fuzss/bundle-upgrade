package fuzs.bundleupgrade.neoforge.client;

import fuzs.bundleupgrade.common.BundleUpgrade;
import fuzs.bundleupgrade.common.client.BundleUpgradeClient;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = BundleUpgrade.MOD_ID, dist = Dist.CLIENT)
public class BundleUpgradeNeoForgeClient {

    public BundleUpgradeNeoForgeClient() {
        ClientModConstructor.construct(BundleUpgrade.MOD_ID, BundleUpgradeClient::new);
    }
}
