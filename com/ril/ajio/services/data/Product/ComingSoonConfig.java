/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ComingSoonConfig {
    private final boolean isEnabled;
    private final String message;

    public ComingSoonConfig() {
        this(false, null, 3, null);
    }

    public ComingSoonConfig(boolean bl2, String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        this.isEnabled = bl2;
        this.message = string2;
    }

    public /* synthetic */ ComingSoonConfig(boolean bl2, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = false;
        }
        if ((n3 &= 2) != 0) {
            string2 = "";
        }
        this(bl2, string2);
    }

    public static /* synthetic */ ComingSoonConfig copy$default(ComingSoonConfig comingSoonConfig, boolean bl2, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = comingSoonConfig.isEnabled;
        }
        if ((n3 &= 2) != 0) {
            string2 = comingSoonConfig.message;
        }
        return comingSoonConfig.copy(bl2, string2);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final String component2() {
        return this.message;
    }

    public final ComingSoonConfig copy(boolean bl2, String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        ComingSoonConfig comingSoonConfig = new ComingSoonConfig(bl2, string2);
        return comingSoonConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ComingSoonConfig;
        if (!bl3) {
            return false;
        }
        object = (ComingSoonConfig)object;
        bl3 = this.isEnabled;
        boolean bl4 = ((ComingSoonConfig)object).isEnabled;
        if (bl3 != bl4) {
            return false;
        }
        String string2 = this.message;
        object = ((ComingSoonConfig)object).message;
        boolean bl5 = Intrinsics.areEqual(string2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int n3 = this.isEnabled;
        n3 = n3 != 0 ? 1231 : 1237;
        return this.message.hashCode() + (n3 *= 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        boolean bl2 = this.isEnabled;
        String string2 = this.message;
        StringBuilder stringBuilder = new StringBuilder("ComingSoonConfig(isEnabled=");
        stringBuilder.append(bl2);
        stringBuilder.append(", message=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

