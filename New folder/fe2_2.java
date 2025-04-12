/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.R$drawable;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.willy.ratingbar.ScaleRatingBar;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fe2
 */
public final class fe2_2
implements Function1 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;

    public /* synthetic */ fe2_2(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
    }

    public final Object invoke(Object object) {
        object = (Context)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$viewModel");
        Intrinsics.checkNotNullParameter(object, "ctx");
        ScaleRatingBar scaleRatingBar = new ScaleRatingBar((Context)object);
        int n3 = 5;
        scaleRatingBar.setNumStars(n3);
        scaleRatingBar.setStarPadding(n3);
        scaleRatingBar.setStepSize(1.0f);
        object = this.b;
        float f5 = ((qz1_2)object2).r((SelectedOrderItem)object);
        scaleRatingBar.setRating(f5);
        scaleRatingBar.setIsIndicator(true);
        scaleRatingBar.setClickable(false);
        scaleRatingBar.setClearRatingEnabled(false);
        n3 = R$drawable.empty_star_grey;
        scaleRatingBar.setEmptyDrawableRes(n3);
        n3 = R$drawable.gold_star_small;
        scaleRatingBar.setFilledDrawableRes(n3);
        n3 = (int)scaleRatingBar.getRating();
        object2 = -1;
        ai0_2.c(scaleRatingBar, n3, (Integer)object2);
        return scaleRatingBar;
    }
}

