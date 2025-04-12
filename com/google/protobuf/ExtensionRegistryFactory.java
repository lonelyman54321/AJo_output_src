/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ExtensionRegistryLite;
import java.lang.reflect.Method;

final class ExtensionRegistryFactory {
    static final Class EXTENSION_REGISTRY_CLASS = ExtensionRegistryFactory.reflectExtensionRegistry();
    static final String FULL_REGISTRY_CLASS_NAME = "com.google.protobuf.ExtensionRegistry";

    public static ExtensionRegistryLite create() {
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryFactory.invokeSubclassFactory("newInstance");
        if (extensionRegistryLite == null) {
            extensionRegistryLite = new ExtensionRegistryLite();
        }
        return extensionRegistryLite;
    }

    public static ExtensionRegistryLite createEmpty() {
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryFactory.invokeSubclassFactory("getEmptyRegistry");
        if (extensionRegistryLite == null) {
            extensionRegistryLite = ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
        }
        return extensionRegistryLite;
    }

    private static final ExtensionRegistryLite invokeSubclassFactory(String object) {
        Class clazz = EXTENSION_REGISTRY_CLASS;
        if (clazz == null) {
            return null;
        }
        try {
            object = clazz.getDeclaredMethod((String)object, null);
        }
        catch (Exception exception) {
            return null;
        }
        object = ((Method)object).invoke(null, null);
        return (ExtensionRegistryLite)object;
    }

    public static boolean isFullRegistry(ExtensionRegistryLite object) {
        boolean bl2;
        Class clazz = EXTENSION_REGISTRY_CLASS;
        if (clazz != null && (bl2 = clazz.isAssignableFrom((Class<?>)(object = object.getClass())))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static Class reflectExtensionRegistry() {
        String string2 = FULL_REGISTRY_CLASS_NAME;
        try {
            return Class.forName(string2);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }
}

