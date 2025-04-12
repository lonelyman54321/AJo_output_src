/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Do3
 */
public final class do3_0
implements Function2 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ yi2_1 b;
    public final /* synthetic */ hd2_0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ do3_0(ArrayList arrayList, yi2_1 yi2_12, hd2_0 hd2_02, int n3) {
        this.a = arrayList;
        this.b = yi2_12;
        this.c = hd2_02;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        yi2_1 yi2_12 = this.b;
        Intrinsics.checkNotNullParameter(yi2_12, "$pdpInfoProvider");
        hd2_0 hd2_02 = this.c;
        Intrinsics.checkNotNullParameter(hd2_02, "$rateReviewClickListener");
        int n3 = Me3.b(this.d | 1);
        Ho3.a(this.a, yi2_12, hd2_02, (b30_0)object, n3);
        return Unit.a;
    }
}

