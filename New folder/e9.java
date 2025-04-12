/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class e9
implements Runnable {
    public final /* synthetic */ q9_0 a;

    public /* synthetic */ e9(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final void run() {
        Object object = q9_0.Companion;
        q9_0 q9_02 = this.a;
        Intrinsics.checkNotNullParameter(q9_02, "this$0");
        object = q9_02.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeListener");
            object = null;
        }
        object.W();
    }
}

