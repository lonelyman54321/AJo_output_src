/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ji2
 */
public final class ji2_0
implements Runnable {
    public final /* synthetic */ li2_2 a;

    public /* synthetic */ ji2_0(li2_2 li2_22) {
        this.a = li2_22;
    }

    public final void run() {
        li2_2 li2_22 = this.a;
        Intrinsics.checkNotNullParameter(li2_22, "this$0");
        li2_22.x(true);
    }
}

