/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Lm3
 */
public final class lm3_0
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ tv0_0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;

    public /* synthetic */ lm3_0(String string2, long l2, LP1 lP1, tv0_0 tv0_02, long l3, long l4, int n3) {
        this.a = string2;
        this.b = l2;
        this.c = lP1;
        this.d = tv0_02;
        this.e = l3;
        this.f = l4;
        this.g = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$value");
        LP1 lP1 = this.c;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        tv0_0 tv0_02 = this.d;
        Intrinsics.checkNotNullParameter(tv0_02, "$fontWeight");
        int n3 = Me3.b(this.g | 1);
        long l2 = this.b;
        long l3 = this.e;
        long l4 = this.f;
        LK1.a(string2, l2, lP1, tv0_02, l3, l4, (b30_0)object3, n3);
        return Unit.a;
    }
}

