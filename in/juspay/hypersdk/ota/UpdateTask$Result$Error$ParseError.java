/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.UpdateTask$Result$Error;
import kotlin.jvm.internal.Intrinsics;

public final class UpdateTask$Result$Error$ParseError
extends UpdateTask$Result$Error {
    private final Exception e;

    public UpdateTask$Result$Error$ParseError(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "e");
        this.e = exception;
    }

    public static /* synthetic */ UpdateTask$Result$Error$ParseError copy$default(UpdateTask$Result$Error$ParseError updateTask$Result$Error$ParseError, Exception exception, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            exception = updateTask$Result$Error$ParseError.e;
        }
        return updateTask$Result$Error$ParseError.copy(exception);
    }

    public final Exception component1() {
        return this.e;
    }

    public final UpdateTask$Result$Error$ParseError copy(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "e");
        UpdateTask$Result$Error$ParseError updateTask$Result$Error$ParseError = new UpdateTask$Result$Error$ParseError(exception);
        return updateTask$Result$Error$ParseError;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UpdateTask$Result$Error$ParseError;
        if (!bl3) {
            return false;
        }
        object = (UpdateTask$Result$Error$ParseError)object;
        Exception exception = this.e;
        object = ((UpdateTask$Result$Error$ParseError)object).e;
        boolean bl4 = Intrinsics.areEqual(exception, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Exception getE() {
        return this.e;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ParseError(e=");
        Exception exception = this.e;
        stringBuilder.append(exception);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

