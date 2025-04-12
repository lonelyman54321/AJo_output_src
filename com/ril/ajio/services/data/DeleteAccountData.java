/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class DeleteAccountData {
    private final List errors;

    public DeleteAccountData(List list) {
        Intrinsics.checkNotNullParameter(list, "errors");
        this.errors = list;
    }

    public static /* synthetic */ DeleteAccountData copy$default(DeleteAccountData deleteAccountData, List list, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            list = deleteAccountData.errors;
        }
        return deleteAccountData.copy(list);
    }

    public final List component1() {
        return this.errors;
    }

    public final DeleteAccountData copy(List list) {
        Intrinsics.checkNotNullParameter(list, "errors");
        DeleteAccountData deleteAccountData = new DeleteAccountData(list);
        return deleteAccountData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DeleteAccountData;
        if (!bl3) {
            return false;
        }
        object = (DeleteAccountData)object;
        List list = this.errors;
        object = ((DeleteAccountData)object).errors;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getErrors() {
        return this.errors;
    }

    public int hashCode() {
        return ((Object)this.errors).hashCode();
    }

    public String toString() {
        List list = this.errors;
        StringBuilder stringBuilder = new StringBuilder("DeleteAccountData(errors=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

