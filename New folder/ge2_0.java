/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.willy.ratingbar.BaseRatingBar;
import com.willy.ratingbar.ScaleRatingBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ge2
 */
public final class ge2_0
implements Function1 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;

    public /* synthetic */ ge2_0(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
    }

    public final Object invoke(Object object) {
        object = (ScaleRatingBar)((Object)object);
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        Intrinsics.checkNotNullParameter(object, "it");
        SelectedOrderItem selectedOrderItem = this.b;
        float f5 = qz1_22.r(selectedOrderItem);
        ((BaseRatingBar)((Object)object)).setRating(f5);
        return Unit.a;
    }
}

