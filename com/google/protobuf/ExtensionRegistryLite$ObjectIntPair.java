/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

final class ExtensionRegistryLite$ObjectIntPair {
    private final int number;
    private final Object object;

    public ExtensionRegistryLite$ObjectIntPair(Object object, int n3) {
        this.object = object;
        this.number = n3;
    }

    public boolean equals(Object object) {
        int n3;
        int n4 = object instanceof ExtensionRegistryLite$ObjectIntPair;
        boolean bl2 = false;
        if (n4 == 0) {
            return false;
        }
        object = (ExtensionRegistryLite$ObjectIntPair)object;
        Object object2 = this.object;
        Object object3 = ((ExtensionRegistryLite$ObjectIntPair)object).object;
        if (object2 == object3 && (n4 = this.number) == (n3 = ((ExtensionRegistryLite$ObjectIntPair)object).number)) {
            bl2 = true;
        }
        return bl2;
    }

    public int hashCode() {
        int n3 = System.identityHashCode(this.object) * (char)-1;
        int n4 = this.number;
        return n3 + n4;
    }
}

