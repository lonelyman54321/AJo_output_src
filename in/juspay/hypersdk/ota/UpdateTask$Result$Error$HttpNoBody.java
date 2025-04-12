/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.UpdateTask$Result$Error;
import kotlin.jvm.internal.Intrinsics;

public final class UpdateTask$Result$Error$HttpNoBody
extends UpdateTask$Result$Error {
    private final cl2_2 response;

    public UpdateTask$Result$Error$HttpNoBody(cl2_2 cl2_22) {
        Intrinsics.checkNotNullParameter(cl2_22, "response");
        this.response = cl2_22;
    }

    public static /* synthetic */ UpdateTask$Result$Error$HttpNoBody copy$default(UpdateTask$Result$Error$HttpNoBody updateTask$Result$Error$HttpNoBody, cl2_2 cl2_22, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            cl2_22 = updateTask$Result$Error$HttpNoBody.response;
        }
        return updateTask$Result$Error$HttpNoBody.copy(cl2_22);
    }

    public final cl2_2 component1() {
        return this.response;
    }

    public final UpdateTask$Result$Error$HttpNoBody copy(cl2_2 cl2_22) {
        Intrinsics.checkNotNullParameter(cl2_22, "response");
        UpdateTask$Result$Error$HttpNoBody updateTask$Result$Error$HttpNoBody = new UpdateTask$Result$Error$HttpNoBody(cl2_22);
        return updateTask$Result$Error$HttpNoBody;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UpdateTask$Result$Error$HttpNoBody;
        if (!bl3) {
            return false;
        }
        object = (UpdateTask$Result$Error$HttpNoBody)object;
        cl2_2 cl2_22 = this.response;
        object = ((UpdateTask$Result$Error$HttpNoBody)object).response;
        boolean bl4 = Intrinsics.areEqual(cl2_22, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final cl2_2 getResponse() {
        return this.response;
    }

    public int hashCode() {
        return this.response.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpNoBody(response=");
        cl2_2 cl2_22 = this.response;
        stringBuilder.append(cl2_22);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

