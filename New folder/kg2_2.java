/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioOrderSummaryView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kg2
 */
public final class kg2_2
extends RecyclerView$B {
    public final AjioOrderSummaryView a;

    public kg2_2(View object) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        int n3 = R$id.orderconfirm_billview;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (AjioOrderSummaryView)((Object)object);
        this.a = object;
    }
}

