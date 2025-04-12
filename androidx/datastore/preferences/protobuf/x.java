/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.u$a;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import java.util.AbstractMap;
import java.util.Map;

public final class x
implements w {
    public final v a() {
        return v.b.g();
    }

    public final v forMapData(Object object) {
        return (v)object;
    }

    public final u$a forMapMetadata(Object object) {
        return ((u)object).a;
    }

    public final v forMutableMapData(Object object) {
        return (v)object;
    }

    public final int getSerializedSize(int n3, Object iterator, Object object) {
        iterator = (v)((Object)iterator);
        object = (u)object;
        boolean n4 = ((AbstractMap)((Object)iterator)).isEmpty();
        int n7 = 0;
        if (!n4) {
            int n8;
            iterator = ((v)((Object)iterator)).entrySet().iterator();
            while ((n8 = iterator.hasNext()) != 0) {
                Map.Entry entry = (Map.Entry)iterator.next();
                Object k2 = entry.getKey();
                entry = entry.getValue();
                object.getClass();
                int n10 = CodedOutputStream.x(n3);
                u$a u$a = ((u)object).a;
                n8 = u.a(u$a, k2, entry);
                n7 = VG1.a(n8, n8, n10, n7);
            }
        }
        return n7;
    }

    public final boolean isImmutable(Object object) {
        return ((v)object).a ^ true;
    }

    public final v mergeFrom(Object object, Object object2) {
        object = (v)object;
        boolean bl2 = ((AbstractMap)(object2 = (v)object2)).isEmpty();
        if (!bl2) {
            bl2 = ((v)object).a;
            if (!bl2) {
                object = ((v)object).g();
            }
            ((v)object).f();
            bl2 = ((AbstractMap)object2).isEmpty();
            if (!bl2) {
                ((v)object).putAll((Map)object2);
            }
        }
        return object;
    }

    public final Object toImmutable(Object object) {
        ((v)object).a = false;
        return object;
    }
}

