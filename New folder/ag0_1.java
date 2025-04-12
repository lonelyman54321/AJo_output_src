/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ag0
 */
public final class ag0_1
implements Function2 {
    public final /* synthetic */ yi2_1 a;
    public final /* synthetic */ hd2_0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ag0_1(int n3, yi2_1 yi2_12, hd2_0 hd2_02) {
        this.a = yi2_12;
        this.b = hd2_02;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        hd2_0 hd2_02 = this.b;
        Intrinsics.checkNotNullParameter(hd2_02, "$rateReviewsClick");
        int n3 = Me3.b(this.c | 1);
        yi2_1 yi2_12 = this.a;
        Rg0.a(n3, (b30_0)object, yi2_12, hd2_02);
        return Unit.a;
    }
}

