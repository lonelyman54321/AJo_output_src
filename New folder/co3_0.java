/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Co3
 */
public final class co3_0
implements Function2 {
    public final /* synthetic */ hd2_0 a;
    public final /* synthetic */ yi2_1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ co3_0(int n3, yi2_1 yi2_12, hd2_0 hd2_02) {
        this.a = hd2_02;
        this.b = yi2_12;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        hd2_0 hd2_02 = this.a;
        Intrinsics.checkNotNullParameter(hd2_02, "$rateReviewClickListener");
        yi2_1 yi2_12 = this.b;
        Intrinsics.checkNotNullParameter(yi2_12, "$pdpInfoProvider");
        Ho3.c(Me3.b(this.c | 1), (b30_0)object, yi2_12, hd2_02);
        return Unit.a;
    }
}

