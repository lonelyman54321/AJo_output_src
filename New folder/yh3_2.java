/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yh3
 */
public final class yh3_2
implements Function2 {
    public final /* synthetic */ zh3_1 a;
    public final /* synthetic */ LP1 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ yh3_2(zh3_1 zh3_12, LP1 lP1, float f5, long l2, int n3, int n4) {
        this.a = zh3_12;
        this.b = lP1;
        this.c = f5;
        this.d = l2;
        this.e = n3;
        this.f = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        zh3_1 zh3_12 = this.a;
        Intrinsics.checkNotNullParameter(zh3_12, "$tmp0_rcvr");
        int n3 = Me3.b(this.e | 1);
        LP1 lP1 = this.b;
        float f5 = this.c;
        long l2 = this.d;
        int n4 = this.f;
        zh3_12.b(lP1, f5, l2, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

