package fuzs.bundleupgrade.common.data;

import fuzs.iteminteractions.common.api.v2.data.AbstractItemStorageDefinitionsProvider;
import fuzs.iteminteractions.common.api.v2.world.item.storage.BundleContentsStorage;
import fuzs.iteminteractions.common.api.v2.world.item.storage.StorageOptions;
import fuzs.puzzleslib.common.api.data.v2.core.DataProviderContext;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.ItemTags;

public class ModItemStorageDefinitionsProvider extends AbstractItemStorageDefinitionsProvider {

    public ModItemStorageDefinitionsProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addItemStorageDefinitions(HolderLookup.Provider registries) {
        this.add(registries.lookupOrThrow(Registries.ITEM),
                new BundleContentsStorage(StorageOptions.DEFAULT.setFilterContainerItems()),
                ItemTags.BUNDLES);
    }
}
