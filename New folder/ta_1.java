/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ta
 */
public final class ta_1
implements Function2 {
    public final /* synthetic */ j7_0 a;
    public final /* synthetic */ lq_2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ta_1(j7_0 j7_02, lq_2 lq_22, int n3) {
        this.a = j7_02;
        this.b = lq_22;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        j7_0 j7_02 = this.a;
        Intrinsics.checkNotNullParameter(j7_02, "$viewModel");
        lq_2 lq_22 = this.b;
        Intrinsics.checkNotNullParameter(lq_22, "$subCategory");
        int n3 = Me3.b(this.c | 1);
        eb_0.d(j7_02, lq_22, (b30_0)object, n3);
        return Unit.a;
    }
}

