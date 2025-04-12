/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.model;

import kotlin.jvm.internal.Intrinsics;

public final class CMSStore {
    public static final int $stable = 8;
    private String id;
    private String name;

    public CMSStore(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(string3, "id");
        this.name = string2;
        this.id = string3;
    }

    public static /* synthetic */ CMSStore copy$default(CMSStore cMSStore, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = cMSStore.name;
        }
        if ((n3 &= 2) != 0) {
            string3 = cMSStore.id;
        }
        return cMSStore.copy(string2, string3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.id;
    }

    public final CMSStore copy(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(string3, "id");
        CMSStore cMSStore = new CMSStore(string2, string3);
        return cMSStore;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CMSStore;
        if (!bl3) {
            return false;
        }
        object = (CMSStore)object;
        String string2 = this.name;
        String string3 = ((CMSStore)object).name;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.id;
        object = ((CMSStore)object).id;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int n3 = this.name.hashCode() * 31;
        return this.id.hashCode() + n3;
    }

    public final void setId(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.id = string2;
    }

    public final void setName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.name = string2;
    }

    public String toString() {
        String string2 = this.name;
        String string3 = this.id;
        return uc0_0.a("CMSStore(name=", string2, ", id=", string3, ")");
    }
}

