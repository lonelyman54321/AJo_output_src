/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 */
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.Product;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ci2
 */
public final class ci2_2
extends RecyclerView$B {
    public final View a;
    public final yi2_1 b;
    public final View c;
    public final AjioTextView d;
    public final RecyclerView e;
    public boolean f;
    public final NewCustomEventsRevamp g;
    public final zi2_1 h;

    public ci2_2(View object, yi2_1 yi2_12) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        super((View)object);
        this.a = object;
        this.b = yi2_12;
        Object object2 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.g = object2;
        yi2_12 = yi2_12.Aa();
        this.h = yi2_12;
        Intrinsics.checkNotNullParameter(object, "itemView");
        this.c = object;
        yi2_12 = null;
        object2 = "parentView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        int n4 = R$id.know_the_product_header;
        object = (AjioTextView)object.findViewById(n4);
        this.d = object;
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            yi2_12 = object;
        }
        n3 = R$id.rv_image_video_item;
        object = (RecyclerView)yi2_12.findViewById(n3);
        this.e = object;
    }

    public final void w(List list, ma_2 ma_22) {
        Object object;
        Object object2;
        Object object3;
        ci2_2 ci2_22 = this;
        List list2 = list;
        ma_2 ma_23 = ma_22;
        Intrinsics.checkNotNullParameter(list, "kypList");
        Intrinsics.checkNotNullParameter(ma_22, "ajioVideoPlayer");
        yi2_1 yi2_12 = this.b;
        boolean bl2 = yi2_12.c9();
        boolean bl3 = true;
        Object object4 = null;
        if (bl2) {
            object3 = this.d;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerText");
                bl2 = false;
                object3 = null;
            }
            ((AppCompatTextView)object3).setAllCaps(bl3);
        }
        if (!(bl2 = ci2_22.f)) {
            Bundle bundle = new Bundle();
            object3 = yi2_12.l6();
            object2 = "product_id";
            bundle.putString((String)object2, (String)object3);
            object3 = yi2_12.x5();
            if (object3 != null) {
                object3 = ((Product)object3).getName();
            } else {
                bl2 = false;
                object3 = null;
            }
            bundle.putString("product_name", (String)object3);
            object3 = AnalyticsManager.Companion;
            String string2 = bv_0.a((AnalyticsManager$Companion)object3);
            String string3 = cv_0.a((AnalyticsManager$Companion)object3);
            int n3 = 1536;
            object2 = ci2_22.g;
            object = "product details interactions";
            String string4 = "know the product section view";
            String string5 = "";
            String string6 = "pdp_screen_interaction";
            String string7 = "pdp screen";
            String string8 = "pdp screen";
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, (String)object, string4, string5, string6, string7, string8, string2, bundle, string3, false, null, n3, null);
            ci2_22.f = bl3;
        }
        object3 = ci2_22.e;
        String string9 = "rvImageVideoItem";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string9);
            bl2 = false;
            object3 = null;
        }
        if ((object = ci2_22.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentView");
            object = null;
        }
        object = object.getContext();
        object2 = new LinearLayoutManager((Context)object);
        ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object2);
        object3 = ci2_22.e;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string9);
        } else {
            object4 = object3;
        }
        object3 = new bi2_0(list2, yi2_12, ma_23);
        ((RecyclerView)object4).setAdapter((RecyclerView$f)object3);
    }
}

