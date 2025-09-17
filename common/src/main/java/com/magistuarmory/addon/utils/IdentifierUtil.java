package com.magistuarmory.addon.utils;

import com.magistuarmory.addon.EpicKnightsAddon;
import net.minecraft.resources.ResourceLocation;

@SuppressWarnings("unused")
public final class IdentifierUtil {
    private IdentifierUtil() {
    }

    public static ResourceLocation of(String path) {
        return ResourceLocation.fromNamespaceAndPath(EpicKnightsAddon.ID, path);
    }

    public static ResourceLocation asResourceLocation(String namespace, String path) {
        return ResourceLocation.fromNamespaceAndPath(namespace, path);
    }
}
