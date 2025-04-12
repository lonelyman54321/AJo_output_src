/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioNonScrollableListView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Uf2
 */
public final class uf2_1
extends RecyclerView$B {
    public final Context a;
    public final AjioNonScrollableListView b;
    public final RelativeLayout c;
    public final ImageView d;
    public final TextView e;

    public uf2_1(Context object, View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = object;
        int n3 = R$id.order_confirm_item_listview;
        object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioNonScrollableListView)((Object)object);
        this.b = object;
        n3 = R$id.id_priority_delivery_layout;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (RelativeLayout)object;
        this.c = object;
        n3 = R$id.iv_pd_delivery_alert;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ImageView)object;
        this.d = object;
        n3 = R$id.id_pd_title;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.e = object;
    }
}

