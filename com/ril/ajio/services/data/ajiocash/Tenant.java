/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Tenant {
    private final String code;

    public Tenant() {
        this(null, 1, null);
    }

    public Tenant(String string2) {
        this.code = string2;
    }

    public /* synthetic */ Tenant(String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            string2 = null;
        }
        this(string2);
    }

    public static /* synthetic */ Tenant copy$default(Tenant tenant, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = tenant.code;
        }
        return tenant.copy(string2);
    }

    public final String component1() {
        return this.code;
    }

    public final Tenant copy(String string2) {
        Tenant tenant = new Tenant(string2);
        return tenant;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Tenant;
        if (!bl3) {
            return false;
        }
        object = (Tenant)object;
        String string2 = this.code;
        object = ((Tenant)object).code;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        int n3;
        String string2 = this.code;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return n3;
    }

    public String toString() {
        String string2 = this.code;
        return cP.a("Tenant(code=", string2, ")");
    }
}

