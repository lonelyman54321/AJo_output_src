/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Eo3
 */
public final class eo3_0
implements Function1 {
    public final /* synthetic */ hd2_0 a;

    public /* synthetic */ eo3_0(hd2_0 hd2_02) {
        this.a = hd2_02;
    }

    public final Object invoke(Object object) {
        object = (Integer)object;
        ((Integer)object).intValue();
        hd2_0 hd2_02 = this.a;
        Intrinsics.checkNotNullParameter(hd2_02, "$rateReviewClickListener");
        hd2_02.V2((Integer)object);
        return Unit.a;
    }
}

