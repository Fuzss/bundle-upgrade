package fuzs.bundleupgrade.common.data;

import fuzs.iteminteractions.common.api.v2.data.ItemStorageProvider;
import fuzs.iteminteractions.common.api.v2.world.item.storage.BundleContentsStorage;
import fuzs.iteminteractions.common.api.v2.world.item.storage.ItemStorage;
import fuzs.iteminteractions.common.api.v2.world.item.storage.StorageOptions;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.tags.ItemTags;

public class ModItemStorageDefinitionsProvider implements ItemStorageProvider {

    @Override
    public void run(BootstrapContext<ItemStorage.Definition> output) {
        this.add(output,
                new BundleContentsStorage(StorageOptions.DEFAULT),
                ItemTags.BUNDLES);
    }
}
