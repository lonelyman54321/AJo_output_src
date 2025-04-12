/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jF2
 */
public final class jf2_1
implements Function1 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ i13 b;

    public /* synthetic */ jf2_1(LP1 lP1, rp2_0 rp2_02) {
        this.a = lP1;
        this.b = rp2_02;
    }

    public final Object invoke(Object object) {
        object = (LP1)object;
        LP1 lP1 = this.a;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        i13 i132 = this.b;
        Intrinsics.checkNotNullParameter(i132, "$shape");
        Intrinsics.checkNotNullParameter(object, "$this$conditional");
        return QV.a(lP1, i132);
    }
}

