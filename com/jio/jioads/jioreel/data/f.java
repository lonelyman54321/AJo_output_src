/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.data;

import com.jio.jioads.jioreel.data.StreamType;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class f {
    public final String a;
    public final StreamType b;
    public final Map c;

    public f(String string2, StreamType streamType, Map map2) {
        Intrinsics.checkNotNullParameter(string2, "viewUrl");
        Intrinsics.checkNotNullParameter((Object)streamType, "type");
        this.a = string2;
        this.b = streamType;
        this.c = map2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof f;
        if (!bl3) {
            return false;
        }
        object = (f)object;
        Object object2 = this.a;
        Object object3 = ((f)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((f)object).b;
        if (object3 != object2) {
            return false;
        }
        object3 = this.c;
        object = ((f)object).c;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        StreamType streamType = this.b;
        int n4 = (((Object)((Object)streamType)).hashCode() + n3) * 31;
        Map map2 = this.c;
        if (map2 == null) {
            n3 = 0;
            map2 = null;
        } else {
            n3 = ((Object)map2).hashCode();
        }
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StreamDetails(viewUrl=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", type=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", metaData=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

