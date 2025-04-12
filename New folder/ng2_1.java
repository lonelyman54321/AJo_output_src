/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ng2
 */
public final class ng2_1
extends RecyclerView$B
implements View.OnClickListener {
    public final r82_0 a;
    public final String b;
    public final String c;
    public final LinearLayout d;
    public final ImageView e;
    public final View f;
    public final TextView g;
    public final TextView h;

    public ng2_1(View view, r82_0 r82_02, String string2, String string3) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = r82_02;
        this.b = string2;
        this.c = string3;
        int n3 = R$id.row_component_order;
        r82_02 = view.findViewById(n3);
        string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(r82_02, string2);
        r82_02 = (LinearLayout)r82_02;
        this.d = r82_02;
        n3 = R$id.row_component_order_imv_product;
        r82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(r82_02, string2);
        r82_02 = (ImageView)r82_02;
        this.e = r82_02;
        n3 = R$id.row_component_order_click;
        r82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(r82_02, string2);
        this.f = r82_02;
        int n4 = R$id.row_component_order_tv_status;
        string3 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(string3, string2);
        string3 = (TextView)string3;
        this.g = string3;
        n4 = R$id.row_component_order_tv_info;
        view = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.h = view;
        r82_02.setOnClickListener(this);
    }

    public final void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "v");
        Object object2 = object.getTag();
        boolean bl2 = object2 instanceof hp1_2;
        if (bl2) {
            object = object.getTag();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.home.landingpage.model.LandingItemInfo");
            object = (hp1_2)object;
            object2 = this.a;
            if (object2 != null) {
                Object object3 = object.g;
                boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
                if (!bl3) {
                    object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    String string2 = object.g;
                    String string3 = "landing screen";
                    String string4 = "Card on Home Page";
                    ((GTMEvents)object3).pushButtonTapEvent(string4, string2, string3);
                }
                object2.La((hp1_2)object);
            }
        }
    }
}

