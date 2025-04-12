/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.UpdateTask$Result$Error;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class UpdateTask$Result$Error$IOError
extends UpdateTask$Result$Error {
    private final IOException e;

    public UpdateTask$Result$Error$IOError(IOException iOException) {
        Intrinsics.checkNotNullParameter(iOException, "e");
        this.e = iOException;
    }

    public static /* synthetic */ UpdateTask$Result$Error$IOError copy$default(UpdateTask$Result$Error$IOError updateTask$Result$Error$IOError, IOException iOException, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            iOException = updateTask$Result$Error$IOError.e;
        }
        return updateTask$Result$Error$IOError.copy(iOException);
    }

    public final IOException component1() {
        return this.e;
    }

    public final UpdateTask$Result$Error$IOError copy(IOException iOException) {
        Intrinsics.checkNotNullParameter(iOException, "e");
        UpdateTask$Result$Error$IOError updateTask$Result$Error$IOError = new UpdateTask$Result$Error$IOError(iOException);
        return updateTask$Result$Error$IOError;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UpdateTask$Result$Error$IOError;
        if (!bl3) {
            return false;
        }
        object = (UpdateTask$Result$Error$IOError)object;
        IOException iOException = this.e;
        object = ((UpdateTask$Result$Error$IOError)object).e;
        boolean bl4 = Intrinsics.areEqual(iOException, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final IOException getE() {
        return this.e;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("IOError(e=");
        IOException iOException = this.e;
        stringBuilder.append(iOException);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

