/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Payment.BannerInfo;
import com.ril.ajio.services.data.Payment.InstantDiscountInfo;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from jq2
 */
public final class jq2_2
extends rw_2 {
    public final dv_0 b;
    public final AjioTextView c;
    public final AjioTextView d;
    public final ImageView e;
    public final NewCustomEventsRevamp f;
    public int g;

    public jq2_2(View view, dv_0 object) {
        Intrinsics.checkNotNullParameter(view, "v");
        super(view);
        this.b = object;
        int n3 = R$id.row_offer_tv_more_offer;
        object = view.findViewById(n3);
        Object object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.c = object = (AjioTextView)object;
        n3 = R$id.row_offer_tv_offer_detail;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.d = object = (AjioTextView)object;
        n3 = R$id.row_offer_lbl_title;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        n3 = R$id.offers_parent_container;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ConstraintLayout)((Object)object);
        int n4 = R$id.row_offer_imv_bank_logo;
        View view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object2);
        view2 = (ImageView)view2;
        this.e = view2;
        this.f = object2 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        Intrinsics.checkNotNullExpressionValue(view.getContext(), "getContext(...)");
        ai0_2.t((View)object);
    }

    public final void w(List object) {
        Object object2 = null;
        int n3 = 1;
        if (object != null) {
            Object object3 = object;
            object3 = (Collection)object;
            int n4 = object3.isEmpty() ^ n3;
            if (n4 != 0) {
                object3 = object;
                object3 = (Iterable)object;
                Object object4 = new Object();
                Object[] objectArray = new iq2_2((hq2_2)object4);
                CollectionsKt.e0((Iterable)object3, (Comparator)objectArray);
                this.g = n4 = object.size();
                object4 = this.c;
                if (n4 > n3) {
                    n4 = (int)(og1_1.b() ? 1 : 0);
                    if (n4 != 0) {
                        ((AjioTextView)object4).underlineText();
                    }
                    object3 = StringCompanionObject.INSTANCE;
                    n4 = this.g - n3;
                    object3 = n4;
                    objectArray = new Object[n3];
                    objectArray[0] = object3;
                    object3 = "+ %s more offers";
                    String string2 = "format(...)";
                    n40_0.a(objectArray, n3, (String)object3, string2, (AjioTextView)object4);
                    object4.setVisibility(0);
                } else {
                    n4 = 8;
                    object4.setVisibility(n4);
                }
                object = (BannerInfo)object.get(0);
                if (object != null) {
                    object2 = ((BannerInfo)object).getLogo();
                    object3 = new da$a();
                    ((da$a)object3).k = n3;
                    ((da$a)object3).g = n3;
                    ((da$a)object3).n = object2;
                    object2 = this.e;
                    ((da$a)object3).u = object2;
                    ((da$a)object3).a();
                    object3 = ((BannerInfo)object).getDescription();
                    object = ((BannerInfo)object).getTncUrl();
                    object2 = new InstantDiscountInfo((String)object3, (String)object);
                    object = this.d;
                    object3 = this.b;
                    no2_0.a((InstantDiscountInfo)object2, (TextView)object, (dv_0)object3);
                    object = new rp1_2(this, n3);
                    object4.setOnClickListener((View.OnClickListener)object);
                }
            }
        }
    }
}

