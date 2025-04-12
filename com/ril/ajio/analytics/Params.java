/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics;

import kotlin.jvm.internal.Intrinsics;

public final class Params {
    public static final int $stable;
    private final String event_name;
    private final String key;
    private final String screen_name;

    public Params(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "event_name");
        Intrinsics.checkNotNullParameter(string3, "key");
        Intrinsics.checkNotNullParameter(string4, "screen_name");
        this.event_name = string2;
        this.key = string3;
        this.screen_name = string4;
    }

    public static /* synthetic */ Params copy$default(Params params, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = params.event_name;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = params.key;
        }
        if ((n3 &= 4) != 0) {
            string4 = params.screen_name;
        }
        return params.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.event_name;
    }

    public final String component2() {
        return this.key;
    }

    public final String component3() {
        return this.screen_name;
    }

    public final Params copy(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "event_name");
        Intrinsics.checkNotNullParameter(string3, "key");
        Intrinsics.checkNotNullParameter(string4, "screen_name");
        Params params = new Params(string2, string3, string4);
        return params;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Params;
        if (!bl3) {
            return false;
        }
        object = (Params)object;
        String string2 = this.event_name;
        String string3 = ((Params)object).event_name;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.key;
        string3 = ((Params)object).key;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.screen_name;
        object = ((Params)object).screen_name;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getEvent_name() {
        return this.event_name;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getScreen_name() {
        return this.screen_name;
    }

    public int hashCode() {
        int n3 = this.event_name.hashCode() * 31;
        String string2 = this.key;
        n3 = zy_2.b(n3, 31, string2);
        return this.screen_name.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.event_name;
        String string3 = this.key;
        String string4 = this.screen_name;
        return h30_0.a(og_1.a("Params(event_name=", string2, ", key=", string3, ", screen_name="), string4, ")");
    }
}

