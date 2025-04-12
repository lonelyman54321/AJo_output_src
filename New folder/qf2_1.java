/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qF2
 */
public final class qf2_1
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ tv0_0 e;
    public final /* synthetic */ RU0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ qf2_1(LP1 lP1, String string2, long l2, int n3, tv0_0 tv0_02, RU0 rU0, long l3, int n4, int n7, int n8, int n10) {
        this.a = lP1;
        this.b = string2;
        this.c = l2;
        this.d = n3;
        this.e = tv0_02;
        this.f = rU0;
        this.g = l3;
        this.h = n4;
        this.i = n7;
        this.j = n8;
        this.k = n10;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        ((Integer)object2).intValue();
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$text");
        int n3 = Me3.b(this.j | 1);
        object4 = this.a;
        long l2 = this.c;
        int n4 = this.d;
        tv0_0 tv0_02 = this.e;
        RU0 rU0 = this.f;
        long l3 = this.g;
        int n7 = this.h;
        int n8 = this.i;
        int n10 = this.k;
        AF2.c((LP1)object4, string2, l2, n4, tv0_02, rU0, l3, n7, n8, (b30_0)object3, n3, n10);
        return Unit.a;
    }
}

