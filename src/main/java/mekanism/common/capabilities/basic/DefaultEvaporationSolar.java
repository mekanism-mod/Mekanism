package mekanism.common.capabilities.basic;

import mekanism.api.IEvaporationSolar;
import mekanism.common.capabilities.basic.DefaultStorageHelper.NullStorage;
import net.minecraftforge.common.capabilities.CapabilityManager;

public class DefaultEvaporationSolar implements IEvaporationSolar {

    public static void register() {
        CapabilityManager.INSTANCE.register(IEvaporationSolar.class, new NullStorage<>(), DefaultEvaporationSolar::new);
    }

    @Override
    public boolean canSeeSun() {
        return false;
    }
}