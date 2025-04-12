/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Status {
    private String code;
    private String message;
    private String type;

    public Status() {
        this(null, null, null, 7, null);
    }

    public Status(String string2, String string3, String string4) {
        this.code = string2;
        this.message = string3;
        this.type = string4;
    }

    public /* synthetic */ Status(String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            string4 = null;
        }
        this(string2, string3, string4);
    }

    public static /* synthetic */ Status copy$default(Status status, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = status.code;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = status.message;
        }
        if ((n3 &= 4) != 0) {
            string4 = status.type;
        }
        return status.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.type;
    }

    public final Status copy(String string2, String string3, String string4) {
        Status status = new Status(string2, string3, string4);
        return status;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Status;
        if (!bl3) {
            return false;
        }
        object = (Status)object;
        String string2 = this.code;
        String string3 = ((Status)object).code;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.message;
        string3 = ((Status)object).message;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.type;
        object = ((Status)object).type;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.code;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.message;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.type;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public String toString() {
        String string2 = this.code;
        String string3 = this.message;
        String string4 = this.type;
        return h30_0.a(og_1.a("Status(code=", string2, ", message=", string3, ", type="), string4, ")");
    }
}

