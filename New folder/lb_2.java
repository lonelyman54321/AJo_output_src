/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lb
 */
public final class lb_2
implements Runnable {
    public final /* synthetic */ ob_2 a;

    public /* synthetic */ lb_2(ob_2 ob_22) {
        this.a = ob_22;
    }

    public final void run() {
        ob_2 ob_22 = this.a;
        Intrinsics.checkNotNullParameter(ob_22, "this$0");
        ob_22.p();
    }
}

