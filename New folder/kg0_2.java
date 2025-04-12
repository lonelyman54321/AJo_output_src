/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kG0
 */
public final class kg0_2
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ tv0_0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ kg0_2(LP1 lP1, String string2, long l2, long l3, tv0_0 tv0_02, int n3, int n4) {
        this.a = lP1;
        this.b = string2;
        this.c = l2;
        this.d = l3;
        this.e = tv0_02;
        this.f = n3;
        this.g = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$text");
        int n3 = Me3.b(this.f | 1);
        LP1 lP1 = this.a;
        long l2 = this.c;
        long l3 = this.d;
        tv0_0 tv0_02 = this.e;
        int n4 = this.g;
        eg0_0.a(lP1, string2, l2, l3, tv0_02, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

