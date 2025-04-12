/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model;

import com.ril.ajio.kmm.shared.model.Status$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class Status {
    public static final Status$Companion Companion;
    private String errorCode;
    private String messageDescription;
    private Integer statusCode;

    static {
        Status$Companion status$Companion;
        Companion = status$Companion = new Status$Companion(null);
    }

    public Status() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ Status(int n3, String string2, String string3, Integer n4, a03_0 a03_02) {
        int n7 = n3 & 1;
        this.errorCode = n7 == 0 ? null : string2;
        int n8 = n3 & 2;
        this.messageDescription = n8 == 0 ? null : string3;
        this.statusCode = (n3 &= 4) == 0 ? null : n4;
    }

    public Status(String string2, String string3, Integer n3) {
        this.errorCode = string2;
        this.messageDescription = string3;
        this.statusCode = n3;
    }

    public /* synthetic */ Status(String string2, String string3, Integer n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = null;
        }
        if ((n7 = n4 & 2) != 0) {
            string3 = null;
        }
        if ((n4 &= 4) != 0) {
            n3 = null;
        }
        this(string2, string3, n3);
    }

    public static /* synthetic */ Status copy$default(Status status, String string2, String string3, Integer n3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = status.errorCode;
        }
        if ((n7 = n4 & 2) != 0) {
            string3 = status.messageDescription;
        }
        if ((n4 &= 4) != 0) {
            n3 = status.statusCode;
        }
        return status.copy(string2, string3, n3);
    }

    public static final /* synthetic */ void write$Self$shared_release(Status object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        String string2;
        Object object2;
        int n3 = 0;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object2 = ((Status)object).errorCode) != null) {
            object2 = pe3_2.a;
            string2 = ((Status)object).errorCode;
            u30_02.r(serialDescriptor, 0, (b03_0)object2, string2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 1)) || (object2 = ((Status)object).messageDescription) != null) {
            object2 = pe3_2.a;
            string2 = ((Status)object).messageDescription;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, string2);
        }
        if ((bl2 = u30_02.I(serialDescriptor, n3 = 2)) || (object2 = ((Status)object).statusCode) != null) {
            object2 = yi1_2.a;
            object = ((Status)object).statusCode;
            u30_02.r(serialDescriptor, n3, (b03_0)object2, object);
        }
    }

    public final String component1() {
        return this.errorCode;
    }

    public final String component2() {
        return this.messageDescription;
    }

    public final Integer component3() {
        return this.statusCode;
    }

    public final Status copy(String string2, String string3, Integer n3) {
        Status status = new Status(string2, string3, n3);
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
        Object object2 = this.errorCode;
        String string2 = ((Status)object).errorCode;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.messageDescription;
        string2 = ((Status)object).messageDescription;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.statusCode;
        object = ((Status)object).statusCode;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getMessageDescription() {
        return this.messageDescription;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.errorCode;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.messageDescription;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.statusCode;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setErrorCode(String string2) {
        this.errorCode = string2;
    }

    public final void setMessageDescription(String string2) {
        this.messageDescription = string2;
    }

    public final void setStatusCode(Integer n3) {
        this.statusCode = n3;
    }

    public String toString() {
        CharSequence charSequence = this.errorCode;
        String string2 = this.messageDescription;
        Integer n3 = this.statusCode;
        charSequence = og_1.a("Status(errorCode=", (String)charSequence, ", messageDescription=", string2, ", statusCode=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

