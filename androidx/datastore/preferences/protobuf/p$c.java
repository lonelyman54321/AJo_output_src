/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.RandomAccess;

public interface p$c
extends List,
RandomAccess {
    public boolean isModifiable();

    public void makeImmutable();

    public p$c mutableCopyWithCapacity(int var1);
}

