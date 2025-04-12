/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.databinding.PdpRatingReviewParentBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zg0
 */
public final class zg0_2
implements Function1 {
    public final /* synthetic */ yi2_1 a;
    public final /* synthetic */ hd2_0 b;

    public /* synthetic */ zg0_2(yi2_1 yi2_12, hd2_0 hd2_02) {
        this.a = yi2_12;
        this.b = hd2_02;
    }

    public final Object invoke(Object object) {
        object = (PdpRatingReviewParentBinding)object;
        hd2_0 hd2_02 = this.b;
        Intrinsics.checkNotNullParameter(hd2_02, "$rateReviewsClick");
        Intrinsics.checkNotNullParameter(object, "$this$AndroidViewBinding");
        ((PdpRatingReviewParentBinding)object).viewLine.setVisibility(8);
        rz3_0.Companion.getClass();
        Rz3$a.h(this.a, (PdpRatingReviewParentBinding)object, hd2_02);
        return Unit.a;
    }
}

