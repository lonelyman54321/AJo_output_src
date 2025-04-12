/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

import kotlin.jvm.internal.Intrinsics;

public final class ChangeEmail {
    private final String email;
    private final String password;

    public ChangeEmail(String string2, String string3) {
        this.email = string2;
        this.password = string3;
    }

    public static /* synthetic */ ChangeEmail copy$default(ChangeEmail changeEmail, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = changeEmail.email;
        }
        if ((n3 &= 2) != 0) {
            string3 = changeEmail.password;
        }
        return changeEmail.copy(string2, string3);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.password;
    }

    public final ChangeEmail copy(String string2, String string3) {
        ChangeEmail changeEmail = new ChangeEmail(string2, string3);
        return changeEmail;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ChangeEmail;
        if (!bl3) {
            return false;
        }
        object = (ChangeEmail)object;
        String string2 = this.email;
        String string3 = ((ChangeEmail)object).email;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.password;
        object = ((ChangeEmail)object).password;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        int n3;
        String string2 = this.email;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.password;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.email;
        String string3 = this.password;
        return uc0_0.a("ChangeEmail(email=", string2, ", password=", string3, ")");
    }
}

