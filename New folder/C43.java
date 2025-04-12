/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class C43
implements Runnable {
    public final /* synthetic */ B43$b a;
    public final /* synthetic */ gH3 b;

    public /* synthetic */ C43(B43$b b43$b, gH3 gH32) {
        this.a = b43$b;
        this.b = gH32;
    }

    public final void run() {
        B43$b b43$b = this.a;
        Intrinsics.checkNotNullParameter(b43$b, "this$0");
        gH3 gH32 = this.b;
        Intrinsics.checkNotNullParameter(gH32, "$newLayoutInfo");
        b43$b.c.accept(gH32);
    }
}

