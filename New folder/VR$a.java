/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class VR$a
extends VR$b {
    public final Throwable a;

    public VR$a(Throwable throwable) {
        this.a = throwable;
    }

    public final boolean equals(Object object) {
        Throwable throwable;
        boolean bl2;
        boolean bl3 = object instanceof VR$a;
        if (bl3 && (bl2 = Intrinsics.areEqual(throwable = this.a, object = ((VR$a)object).a))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Throwable throwable = this.a;
        if (throwable != null) {
            n3 = throwable.hashCode();
        } else {
            n3 = 0;
            throwable = null;
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Closed(");
        Throwable throwable = this.a;
        stringBuilder.append(throwable);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

