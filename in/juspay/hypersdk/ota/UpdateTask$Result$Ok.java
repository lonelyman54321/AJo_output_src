/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.UpdateTask$Result;
import kotlin.jvm.internal.Intrinsics;

public final class UpdateTask$Result$Ok
implements UpdateTask$Result {
    private final Object v;

    public UpdateTask$Result$Ok(Object object) {
        this.v = object;
    }

    public static /* synthetic */ UpdateTask$Result$Ok copy$default(UpdateTask$Result$Ok updateTask$Result$Ok, Object object, int n3, Object object2) {
        if ((n3 &= 1) != 0) {
            object = updateTask$Result$Ok.v;
        }
        return updateTask$Result$Ok.copy(object);
    }

    public final Object component1() {
        return this.v;
    }

    public final UpdateTask$Result$Ok copy(Object object) {
        UpdateTask$Result$Ok updateTask$Result$Ok = new UpdateTask$Result$Ok(object);
        return updateTask$Result$Ok;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UpdateTask$Result$Ok;
        if (!bl3) {
            return false;
        }
        object = (UpdateTask$Result$Ok)object;
        Object object2 = this.v;
        object = ((UpdateTask$Result$Ok)object).v;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Object getV() {
        return this.v;
    }

    public int hashCode() {
        int n3;
        Object object = this.v;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        return n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Ok(v=");
        Object object = this.v;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

