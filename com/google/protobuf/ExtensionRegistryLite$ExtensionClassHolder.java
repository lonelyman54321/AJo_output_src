/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

class ExtensionRegistryLite$ExtensionClassHolder {
    static final Class INSTANCE = ExtensionRegistryLite$ExtensionClassHolder.resolveExtensionClass();

    private ExtensionRegistryLite$ExtensionClassHolder() {
    }

    public static Class resolveExtensionClass() {
        String string2 = "com.google.protobuf.Extension";
        try {
            return Class.forName(string2);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }
}

