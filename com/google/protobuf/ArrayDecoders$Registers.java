/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ExtensionRegistryLite;

final class ArrayDecoders$Registers {
    public final ExtensionRegistryLite extensionRegistry;
    public int int1;
    public long long1;
    public Object object1;
    public int recursionDepth;

    public ArrayDecoders$Registers() {
        ExtensionRegistryLite extensionRegistryLite;
        this.extensionRegistry = extensionRegistryLite = ExtensionRegistryLite.getEmptyRegistry();
    }

    public ArrayDecoders$Registers(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        this.extensionRegistry = extensionRegistryLite;
    }
}

