/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.Intrinsics;

public final class P70 {
    public final ParcelableSnapshotMutableState a;

    public P70() {
        this(0);
    }

    public P70(int n3) {
        Object object = P70$a$a.a;
        this.a = object = J83.g(object);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        boolean bl2 = object instanceof P70;
        if (!bl2) {
            return false;
        }
        object = (P70$a)((P70)object).a.getValue();
        P70$a p70$a = (P70$a)this.a.getValue();
        return Intrinsics.areEqual(object, p70$a);
    }

    public final int hashCode() {
        return ((P70$a)this.a.getValue()).hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContextMenuState(status=");
        P70$a p70$a = (P70$a)this.a.getValue();
        stringBuilder.append(p70$a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

