/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xu3
 */
public final class xu3_0
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ tv0_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ xm3 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ xu3_0(LP1 lP1, tv0_0 tv0_02, String string2, long l2, long l3, int n3, xm3 xm32, int n4, int n7) {
        this.a = lP1;
        this.b = tv0_02;
        this.c = string2;
        this.d = l2;
        this.e = l3;
        this.f = n3;
        this.g = xm32;
        this.h = n4;
        this.i = n7;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        LP1 lP1 = this.a;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        String string2 = this.c;
        Intrinsics.checkNotNullParameter(string2, "$title");
        int n3 = Me3.b(this.h | 1);
        tv0_0 tv0_02 = this.b;
        long l2 = this.d;
        long l3 = this.e;
        int n4 = this.f;
        xm3 xm32 = this.g;
        int n7 = this.i;
        ov3.c(lP1, tv0_02, string2, l2, l3, n4, xm32, (b30_0)object3, n3, n7);
        return Unit.a;
    }
}

