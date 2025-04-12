/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tu3
 */
public final class tu3_0
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ tv0_0 e;
    public final /* synthetic */ RU0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Jj3 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ tu3_0(LP1 lP1, String string2, long l2, long l3, tv0_0 tv0_02, RU0 rU0, int n3, Jj3 jj3, int n4, int n7) {
        this.a = lP1;
        this.b = string2;
        this.c = l2;
        this.d = l3;
        this.e = tv0_02;
        this.f = rU0;
        this.g = n3;
        this.h = jj3;
        this.i = n4;
        this.j = n7;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$text");
        int n3 = Me3.b(this.i | 1);
        LP1 lP1 = this.a;
        long l2 = this.c;
        long l3 = this.d;
        tv0_0 tv0_02 = this.e;
        RU0 rU0 = this.f;
        int n4 = this.g;
        Jj3 jj3 = this.h;
        int n7 = this.j;
        ov3.j(lP1, string2, l2, l3, tv0_02, rU0, n4, jj3, (b30_0)object3, n3, n7);
        return Unit.a;
    }
}

