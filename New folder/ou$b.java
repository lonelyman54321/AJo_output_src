/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.b;

public final class ou$b
implements b {
    public final ou$a[] a;

    public ou$b(ou$a[] ou$aArray) {
        this.a = ou$aArray;
    }

    public final void a() {
        ou$a[] ou$aArray = this.a;
        int n3 = ou$aArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            fr0_1 fr0_12 = ou$aArray[i3].f;
            if (fr0_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handle");
                fr0_12 = null;
            }
            fr0_12.dispose();
        }
    }

    public final void b(Throwable throwable) {
        this.a();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DisposeHandlersOnCancel[");
        ou$a[] ou$aArray = this.a;
        stringBuilder.append(ou$aArray);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

