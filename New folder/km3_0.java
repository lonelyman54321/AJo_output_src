/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Km3
 */
public final class km3_0
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ tv0_0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ RU0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ km3_0(LP1 lP1, String string2, long l2, tv0_0 tv0_02, long l3, RU0 rU0, long l4, int n3, int n4) {
        this.a = lP1;
        this.b = string2;
        this.c = l2;
        this.d = tv0_02;
        this.e = l3;
        this.f = rU0;
        this.g = l4;
        this.h = n3;
        this.i = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$value");
        int n3 = Me3.b(this.h | 1);
        LP1 lP1 = this.a;
        long l2 = this.c;
        tv0_0 tv0_02 = this.d;
        long l3 = this.e;
        RU0 rU0 = this.f;
        long l4 = this.g;
        int n4 = this.i;
        mm3_0.a(lP1, string2, l2, tv0_02, l3, rU0, l4, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

