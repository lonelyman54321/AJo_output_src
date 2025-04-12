/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class wi
implements Uv2 {
    public final int b;

    public wi(int n3) {
        this.b = n3;
    }

    public final boolean equals(Object object) {
        int n3;
        Object object2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null) {
            object2 = object.getClass();
        } else {
            n3 = 0;
            object2 = null;
        }
        n3 = Intrinsics.areEqual(wi.class, object2);
        if (n3 == 0) {
            return false;
        }
        object2 = "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType";
        Intrinsics.checkNotNull(object, (String)object2);
        object = (wi)object;
        n3 = this.b;
        int n4 = ((wi)object).b;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AndroidPointerIcon(type=");
        int n3 = this.b;
        return tu.a(stringBuilder, n3, ')');
    }
}

