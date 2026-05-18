package fuzs.bundleupgrade.neoforge;

import fuzs.bundleupgrade.common.BundleUpgrade;
import fuzs.bundleupgrade.common.data.ModItemStorageDefinitionsProvider;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v2.core.DataProviderHelper;
import net.neoforged.fml.common.Mod;

@Mod(BundleUpgrade.MOD_ID)
public class BundleUpgradeNeoForge {

    public BundleUpgradeNeoForge() {
        ModConstructor.construct(BundleUpgrade.MOD_ID, BundleUpgrade::new);
        DataProviderHelper.registerDataProviders(BundleUpgrade.MOD_ID, ModItemStorageDefinitionsProvider::new);
    }
}
