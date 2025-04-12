/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wY2
 */
public final class wy2_1
extends s61_0
implements View.OnClickListener {
    public static final wY2$a Companion;

    static {
        wY2$a wY2$a;
        Companion = wY2$a = new Object();
    }

    public final void onClick(View view) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(view, string2);
        int n3 = view.getId();
        int n4 = R$id.close;
        if (n3 == n4) {
            this.dismiss();
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        vy2_2 vy2_22 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)vy2_22);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragement_selfship_bottom_view_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int n3;
        int n4;
        Object object = view;
        int n7 = 1;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object object2 = this.getView();
        if (object2 != null && (object2 = (AjioAspectRatioImageView)object2.findViewById(n4 = R$id.close)) != null) {
            object2.setOnClickListener((View.OnClickListener)this);
        }
        Object object3 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        Bundle bundle2 = E1.a("serviceability", "self_pickup");
        object2 = this.getArguments();
        Object object4 = null;
        Object[] objectArray = "product_id";
        if (object2 != null) {
            object2 = object2.getString((String)objectArray);
        } else {
            n3 = 0;
            object2 = null;
        }
        bundle2.putString((String)objectArray, (String)object2);
        object2 = this.getArguments();
        objectArray = "order_id";
        if (object2 != null) {
            object2 = object2.getString((String)objectArray);
        } else {
            n3 = 0;
            object2 = null;
        }
        bundle2.putString((String)objectArray, (String)object2);
        object2 = this.getArguments();
        objectArray = "order_status";
        if (object2 != null) {
            object4 = object2.getString((String)objectArray);
        }
        bundle2.putString((String)objectArray, (String)object4);
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, "", "", "", "screen_view", "self ship screen", null, null, bundle2, "", false, null, 1632, null);
        n3 = R$id.recycler_view;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (RecyclerView)object;
        object3 = hv3_0.K(R$string.packing_self_ship_new_1);
        object2 = new ro1_0("1.", (String)object3);
        object4 = hv3_0.K(R$string.packing_self_ship_new_2);
        object3 = new ro1_0("2.", (String)object4);
        objectArray = hv3_0.K(R$string.packing_self_ship_new_3);
        object4 = new ro1_0("3.", (String)objectArray);
        objectArray = new ro1_0[3];
        objectArray[0] = object2;
        objectArray[n7] = object3;
        objectArray[2] = object4;
        object2 = xx_2.i(objectArray);
        object4 = ye_0.SELF_SHIP_BOTTOM_SHEET_FRAGMENT;
        object3 = new ae_2((List)object2, (ye_0)((Object)object4));
        ((RecyclerView)object).setHasFixedSize(n7 != 0);
        object4 = object.getContext();
        object2 = new LinearLayoutManager((Context)object4, n7, false);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        ((RecyclerView)object).setAdapter((RecyclerView$f)object3);
    }
}

