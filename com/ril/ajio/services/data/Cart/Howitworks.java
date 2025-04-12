/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class Howitworks
implements Serializable {
    private final String desc;
    private final String title;

    public Howitworks(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "desc");
        Intrinsics.checkNotNullParameter(string3, "title");
        this.desc = string2;
        this.title = string3;
    }

    public static /* synthetic */ Howitworks copy$default(Howitworks howitworks, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = howitworks.desc;
        }
        if ((n3 &= 2) != 0) {
            string3 = howitworks.title;
        }
        return howitworks.copy(string2, string3);
    }

    public final String component1() {
        return this.desc;
    }

    public final String component2() {
        return this.title;
    }

    public final Howitworks copy(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "desc");
        Intrinsics.checkNotNullParameter(string3, "title");
        Howitworks howitworks = new Howitworks(string2, string3);
        return howitworks;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Howitworks;
        if (!bl3) {
            return false;
        }
        object = (Howitworks)object;
        String string2 = this.desc;
        String string3 = ((Howitworks)object).desc;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.title;
        object = ((Howitworks)object).title;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int n3 = this.desc.hashCode() * 31;
        return this.title.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.desc;
        String string3 = this.title;
        return uc0_0.a("Howitworks(desc=", string2, ", title=", string3, ")");
    }
}

