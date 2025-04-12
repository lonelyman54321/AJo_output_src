/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class u90
implements eK$c {
    public final /* synthetic */ vn0_2 a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u90(wn0_2 wn0_22, Object object) {
        this.a = wn0_22;
        this.b = object;
    }

    public final Object a(eK$a eK$a) {
        vn0_2 vn0_22 = this.a;
        Intrinsics.checkNotNullParameter(vn0_22, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(eK$a, "completer");
        v90 v902 = new v90(eK$a, vn0_22);
        vn0_22.G(v902);
        return this.b;
    }
}

