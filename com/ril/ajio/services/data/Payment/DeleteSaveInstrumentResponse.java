/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Error;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class DeleteSaveInstrumentResponse {
    private Error error;

    public DeleteSaveInstrumentResponse() {
        this(null, 1, null);
    }

    public DeleteSaveInstrumentResponse(Error error) {
        this.error = error;
    }

    public /* synthetic */ DeleteSaveInstrumentResponse(Error error, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            error = null;
        }
        this(error);
    }

    public static /* synthetic */ DeleteSaveInstrumentResponse copy$default(DeleteSaveInstrumentResponse deleteSaveInstrumentResponse, Error error, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            error = deleteSaveInstrumentResponse.error;
        }
        return deleteSaveInstrumentResponse.copy(error);
    }

    public final Error component1() {
        return this.error;
    }

    public final DeleteSaveInstrumentResponse copy(Error error) {
        DeleteSaveInstrumentResponse deleteSaveInstrumentResponse = new DeleteSaveInstrumentResponse(error);
        return deleteSaveInstrumentResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DeleteSaveInstrumentResponse;
        if (!bl3) {
            return false;
        }
        object = (DeleteSaveInstrumentResponse)object;
        Error error = this.error;
        object = ((DeleteSaveInstrumentResponse)object).error;
        boolean bl4 = Intrinsics.areEqual(error, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Error getError() {
        return this.error;
    }

    public int hashCode() {
        int n3;
        Error error = this.error;
        if (error == null) {
            n3 = 0;
            error = null;
        } else {
            n3 = error.hashCode();
        }
        return n3;
    }

    public final void setError(Error error) {
        this.error = error;
    }

    public String toString() {
        Error error = this.error;
        StringBuilder stringBuilder = new StringBuilder("DeleteSaveInstrumentResponse(error=");
        stringBuilder.append(error);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

