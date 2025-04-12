/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.RatingBar
 *  android.widget.RatingBar$OnRatingBarChangeListener
 */
import android.widget.RatingBar;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ef2
 */
public final class ef2_0
implements RatingBar.OnRatingBarChangeListener {
    public final /* synthetic */ hf2_0 a;
    public final /* synthetic */ OrderItemLine b;
    public final /* synthetic */ int c;

    public /* synthetic */ ef2_0(hf2_0 hf2_02, OrderItemLine orderItemLine, int n3) {
        this.a = hf2_02;
        this.b = orderItemLine;
        this.c = n3;
    }

    public final void onRatingChanged(RatingBar object, float f5, boolean bl2) {
        hf2_0 hf2_02 = this.a;
        Intrinsics.checkNotNullParameter(hf2_02, "this$0");
        OrderItemLine orderItemLine = this.b;
        Intrinsics.checkNotNullParameter(orderItemLine, "$orderItemLine");
        object = null;
        float f6 = f5 - 0.0f;
        float f7 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (f7 != false && bl2 && (object = hf2_02.b) != null) {
            int n3 = this.c;
            object.a(f5, n3, orderItemLine);
        }
    }
}

