package fuzs.bundleupgrade.neoforge;

import fuzs.bundleupgrade.common.BundleUpgrade;
import fuzs.bundleupgrade.common.data.ModItemStorageDefinitionsProvider;
import fuzs.iteminteractions.common.api.v2.world.item.storage.ItemStorage;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v3.core.DataProviderBuilder;
import net.neoforged.fml.common.Mod;

@Mod(BundleUpgrade.MOD_ID)
public class BundleUpgradeNeoForge {

    public BundleUpgradeNeoForge() {
        ModConstructor.construct(BundleUpgrade.MOD_ID, BundleUpgrade::new);
        DataProviderBuilder.of(BundleUpgrade.MOD_ID)
                .add(ItemStorage.Definition.REGISTRY_KEY, new ModItemStorageDefinitionsProvider());
    }
}
