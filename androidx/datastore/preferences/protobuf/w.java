/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u$a;
import androidx.datastore.preferences.protobuf.v;

public interface w {
    public v a();

    public v forMapData(Object var1);

    public u$a forMapMetadata(Object var1);

    public v forMutableMapData(Object var1);

    public int getSerializedSize(int var1, Object var2, Object var3);

    public boolean isImmutable(Object var1);

    public v mergeFrom(Object var1, Object var2);

    public Object toImmutable(Object var1);
}

