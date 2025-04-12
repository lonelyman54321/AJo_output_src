/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import kotlin.jvm.internal.Intrinsics;

public final class DeleteAccountRequest {
    private final String reason;

    public DeleteAccountRequest(String string2) {
        this.reason = string2;
    }

    public static /* synthetic */ DeleteAccountRequest copy$default(DeleteAccountRequest deleteAccountRequest, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = deleteAccountRequest.reason;
        }
        return deleteAccountRequest.copy(string2);
    }

    public final String component1() {
        return this.reason;
    }

    public final DeleteAccountRequest copy(String string2) {
        DeleteAccountRequest deleteAccountRequest = new DeleteAccountRequest(string2);
        return deleteAccountRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DeleteAccountRequest;
        if (!bl3) {
            return false;
        }
        object = (DeleteAccountRequest)object;
        String string2 = this.reason;
        object = ((DeleteAccountRequest)object).reason;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        int n3;
        String string2 = this.reason;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return n3;
    }

    public String toString() {
        String string2 = this.reason;
        return cP.a("DeleteAccountRequest(reason=", string2, ")");
    }
}

