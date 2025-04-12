/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Config
implements Serializable {
    private final String c;
    private final String cid;

    public Config() {
        this(null, null, 3, null);
    }

    public Config(String string2, String string3) {
        this.cid = string2;
        this.c = string3;
    }

    public /* synthetic */ Config(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ Config copy$default(Config config, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = config.cid;
        }
        if ((n3 &= 2) != 0) {
            string3 = config.c;
        }
        return config.copy(string2, string3);
    }

    public final String component1() {
        return this.cid;
    }

    public final String component2() {
        return this.c;
    }

    public final Config copy(String string2, String string3) {
        Config config = new Config(string2, string3);
        return config;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Config;
        if (!bl3) {
            return false;
        }
        object = (Config)object;
        String string2 = this.cid;
        String string3 = ((Config)object).cid;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.c;
        object = ((Config)object).c;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getC() {
        return this.c;
    }

    public final String getCid() {
        return this.cid;
    }

    public int hashCode() {
        int n3;
        String string2 = this.cid;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.c;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.cid;
        String string3 = this.c;
        return uc0_0.a("Config(cid=", string2, ", c=", string3, ")");
    }
}

