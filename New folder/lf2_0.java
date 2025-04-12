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
 * Renamed from Lf2
 */
public final class lf2_0
implements RatingBar.OnRatingBarChangeListener {
    public final /* synthetic */ nf2_1 a;
    public final /* synthetic */ OrderItemLine b;
    public final /* synthetic */ int c;

    public /* synthetic */ lf2_0(nf2_1 nf2_12, OrderItemLine orderItemLine, int n3) {
        this.a = nf2_12;
        this.b = orderItemLine;
        this.c = n3;
    }

    public final void onRatingChanged(RatingBar object, float f5, boolean bl2) {
        nf2_1 nf2_12 = this.a;
        Intrinsics.checkNotNullParameter(nf2_12, "this$0");
        OrderItemLine orderItemLine = this.b;
        Intrinsics.checkNotNullParameter(orderItemLine, "$orderItemLine");
        object = null;
        float f6 = f5 - 0.0f;
        float f7 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (f7 != false && bl2 && (object = nf2_12.b) != null) {
            int n3 = this.c;
            object.a(f5, n3, orderItemLine);
        }
    }
}

