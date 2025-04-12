/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import com.ril.ajio.services.entity.Config;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Result {
    private Map asi;
    private Config config;

    public Result() {
        this(null, null, 3, null);
    }

    public Result(Map map2, Config config) {
        this.asi = map2;
        this.config = config;
    }

    public /* synthetic */ Result(Map map2, Config config, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            map2 = null;
        }
        if ((n3 &= 2) != 0) {
            int n7 = 31;
            config = new Config(null, null, null, null, null, n7, null);
        }
        this(map2, config);
    }

    public static /* synthetic */ Result copy$default(Result result2, Map map2, Config config, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            map2 = result2.asi;
        }
        if ((n3 &= 2) != 0) {
            config = result2.config;
        }
        return result2.copy(map2, config);
    }

    public final Map component1() {
        return this.asi;
    }

    public final Config component2() {
        return this.config;
    }

    public final Result copy(Map map2, Config config) {
        Result result2 = new Result(map2, config);
        return result2;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Result;
        if (!bl3) {
            return false;
        }
        object = (Result)object;
        Object object2 = this.asi;
        Map map2 = ((Result)object).asi;
        bl3 = Intrinsics.areEqual(object2, map2);
        if (!bl3) {
            return false;
        }
        object2 = this.config;
        object = ((Result)object).config;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Map getAsi() {
        return this.asi;
    }

    public final Config getConfig() {
        return this.config;
    }

    public int hashCode() {
        int n3;
        Map map2 = this.asi;
        int n4 = 0;
        if (map2 == null) {
            n3 = 0;
            map2 = null;
        } else {
            n3 = ((Object)map2).hashCode();
        }
        n3 *= 31;
        Config config = this.config;
        if (config != null) {
            n4 = config.hashCode();
        }
        return n3 + n4;
    }

    public final void setAsi(Map map2) {
        this.asi = map2;
    }

    public final void setConfig(Config config) {
        this.config = config;
    }

    public String toString() {
        Map map2 = this.asi;
        Config config = this.config;
        StringBuilder stringBuilder = new StringBuilder("Result(asi=");
        stringBuilder.append(map2);
        stringBuilder.append(", config=");
        stringBuilder.append(config);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

