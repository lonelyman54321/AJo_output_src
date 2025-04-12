/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Login;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ABConfigSignUp {
    private String key;
    private Boolean visiblity;

    public ABConfigSignUp() {
        this(null, null, 3, null);
    }

    public ABConfigSignUp(String string2, Boolean bl2) {
        this.key = string2;
        this.visiblity = bl2;
    }

    public /* synthetic */ ABConfigSignUp(String string2, Boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            bl2 = null;
        }
        this(string2, bl2);
    }

    public static /* synthetic */ ABConfigSignUp copy$default(ABConfigSignUp aBConfigSignUp, String string2, Boolean bl2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = aBConfigSignUp.key;
        }
        if ((n3 &= 2) != 0) {
            bl2 = aBConfigSignUp.visiblity;
        }
        return aBConfigSignUp.copy(string2, bl2);
    }

    public final String component1() {
        return this.key;
    }

    public final Boolean component2() {
        return this.visiblity;
    }

    public final ABConfigSignUp copy(String string2, Boolean bl2) {
        ABConfigSignUp aBConfigSignUp = new ABConfigSignUp(string2, bl2);
        return aBConfigSignUp;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ABConfigSignUp;
        if (!bl3) {
            return false;
        }
        object = (ABConfigSignUp)object;
        Object object2 = this.key;
        String string2 = ((ABConfigSignUp)object).key;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.visiblity;
        object = ((ABConfigSignUp)object).visiblity;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getKey() {
        return this.key;
    }

    public final Boolean getVisiblity() {
        return this.visiblity;
    }

    public int hashCode() {
        int n3;
        String string2 = this.key;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        Boolean bl2 = this.visiblity;
        if (bl2 != null) {
            n4 = ((Object)bl2).hashCode();
        }
        return n3 + n4;
    }

    public final void setKey(String string2) {
        this.key = string2;
    }

    public final void setVisiblity(Boolean bl2) {
        this.visiblity = bl2;
    }

    public String toString() {
        String string2 = this.key;
        Boolean bl2 = this.visiblity;
        StringBuilder stringBuilder = new StringBuilder("ABConfigSignUp(key=");
        stringBuilder.append(string2);
        stringBuilder.append(", visiblity=");
        stringBuilder.append(bl2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

