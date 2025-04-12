/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Cmps {
    private final Map dd;

    public Cmps() {
        this(null, 1, null);
    }

    public Cmps(Map map2) {
        this.dd = map2;
    }

    public /* synthetic */ Cmps(Map map2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            map2 = null;
        }
        this(map2);
    }

    public static /* synthetic */ Cmps copy$default(Cmps cmps, Map map2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            map2 = cmps.dd;
        }
        return cmps.copy(map2);
    }

    public final Map component1() {
        return this.dd;
    }

    public final Cmps copy(Map map2) {
        Cmps cmps = new Cmps(map2);
        return cmps;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Cmps;
        if (!bl3) {
            return false;
        }
        object = (Cmps)object;
        Map map2 = this.dd;
        object = ((Cmps)object).dd;
        boolean bl4 = Intrinsics.areEqual(map2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Map getDd() {
        return this.dd;
    }

    public int hashCode() {
        int n3;
        Map map2 = this.dd;
        if (map2 == null) {
            n3 = 0;
            map2 = null;
        } else {
            n3 = ((Object)map2).hashCode();
        }
        return n3;
    }

    public String toString() {
        Map map2 = this.dd;
        StringBuilder stringBuilder = new StringBuilder("Cmps(dd=");
        stringBuilder.append(map2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

