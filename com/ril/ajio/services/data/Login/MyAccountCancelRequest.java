/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Login;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class MyAccountCancelRequest
implements Serializable {
    private final String message;
    private final int statusCode;
    private final boolean success;

    public MyAccountCancelRequest(String string2, int n3, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        this.message = string2;
        this.statusCode = n3;
        this.success = bl2;
    }

    public static /* synthetic */ MyAccountCancelRequest copy$default(MyAccountCancelRequest myAccountCancelRequest, String string2, int n3, boolean bl2, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = myAccountCancelRequest.message;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = myAccountCancelRequest.statusCode;
        }
        if ((n4 &= 4) != 0) {
            bl2 = myAccountCancelRequest.success;
        }
        return myAccountCancelRequest.copy(string2, n3, bl2);
    }

    public final String component1() {
        return this.message;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final boolean component3() {
        return this.success;
    }

    public final MyAccountCancelRequest copy(String string2, int n3, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        MyAccountCancelRequest myAccountCancelRequest = new MyAccountCancelRequest(string2, n3, bl2);
        return myAccountCancelRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof MyAccountCancelRequest;
        if (n3 == 0) {
            return false;
        }
        object = (MyAccountCancelRequest)object;
        String string2 = this.message;
        String string3 = ((MyAccountCancelRequest)object).message;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.statusCode;
        int n4 = ((MyAccountCancelRequest)object).statusCode;
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.success ? 1 : 0);
        int n7 = ((MyAccountCancelRequest)object).success;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        String string2 = this.message;
        int n3 = string2.hashCode() * 31;
        int n4 = this.statusCode;
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.success ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public String toString() {
        CharSequence charSequence = this.message;
        int n3 = this.statusCode;
        boolean bl2 = this.success;
        charSequence = oe3_0.a(n3, "MyAccountCancelRequest(message=", charSequence, ", statusCode=", ", success=");
        return Vm.a(")", bl2, (StringBuilder)charSequence);
    }
}

