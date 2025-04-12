/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order.orderhistory;

import kotlin.jvm.internal.Intrinsics;

public final class CancelReturnRequest {
    private String returnCancelRequestPage;
    private String returnId;

    public CancelReturnRequest(String string2, String string3) {
        this.returnId = string2;
        this.returnCancelRequestPage = string3;
    }

    public static /* synthetic */ CancelReturnRequest copy$default(CancelReturnRequest cancelReturnRequest, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = cancelReturnRequest.returnId;
        }
        if ((n3 &= 2) != 0) {
            string3 = cancelReturnRequest.returnCancelRequestPage;
        }
        return cancelReturnRequest.copy(string2, string3);
    }

    public final String component1() {
        return this.returnId;
    }

    public final String component2() {
        return this.returnCancelRequestPage;
    }

    public final CancelReturnRequest copy(String string2, String string3) {
        CancelReturnRequest cancelReturnRequest = new CancelReturnRequest(string2, string3);
        return cancelReturnRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CancelReturnRequest;
        if (!bl3) {
            return false;
        }
        object = (CancelReturnRequest)object;
        String string2 = this.returnId;
        String string3 = ((CancelReturnRequest)object).returnId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.returnCancelRequestPage;
        object = ((CancelReturnRequest)object).returnCancelRequestPage;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getReturnCancelRequestPage() {
        return this.returnCancelRequestPage;
    }

    public final String getReturnId() {
        return this.returnId;
    }

    public int hashCode() {
        int n3;
        String string2 = this.returnId;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.returnCancelRequestPage;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setReturnCancelRequestPage(String string2) {
        this.returnCancelRequestPage = string2;
    }

    public final void setReturnId(String string2) {
        this.returnId = string2;
    }

    public String toString() {
        String string2 = this.returnId;
        String string3 = this.returnCancelRequestPage;
        return uc0_0.a("CancelReturnRequest(returnId=", string2, ", returnCancelRequestPage=", string3, ")");
    }
}

