/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.b;
import androidx.fragment.app.n$c;
import kotlin.jvm.internal.Intrinsics;

public final class Ym0
implements Runnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ n$c b;

    public /* synthetic */ Ym0(b b2, n$c n$c) {
        this.a = b2;
        this.b = n$c;
    }

    public final void run() {
        b b2 = this.a;
        Intrinsics.checkNotNullParameter(b2, "this$0");
        n$c n$c = this.b;
        Intrinsics.checkNotNullParameter(n$c, "$operation");
        b2.a(n$c);
    }
}

