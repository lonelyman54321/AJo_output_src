/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KM
 */
public final class km_2
extends RecyclerView$B {
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final View c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final ImageView h;
    public final NewCustomEventsRevamp i;

    public km_2(View object) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        int n3 = R$id.id_cart_assured_gift_item;
        Object object2 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (ConstraintLayout)((Object)object2);
        this.a = object2;
        n3 = R$id.id_cart_assured_gift_product;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (LinearLayout)object2;
        this.b = object2;
        n3 = R$id.id_line;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.c = object2;
        n3 = R$id.id_cart_gift_item_title;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.d = object2;
        n3 = R$id.id_cart_gift_details;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.e = object2;
        n3 = R$id.id_cart_assured_gift_alert;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.f = object2;
        n3 = R$id.id_cart_gift_applicable;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.g = object2;
        n3 = R$id.id_cart_gift_down_arrow;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ImageView)object;
        this.h = object;
        object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.i = object;
    }
}

