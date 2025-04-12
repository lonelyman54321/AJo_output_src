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
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.FacetValue;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from MC2
 */
public final class mc2_0
extends BottomSheetDialogFragment
implements yv2_1 {
    public RecyclerView a;
    public nj2_0 b;
    public List c;
    public HashMap d;
    public AjioTextView e;
    public AjioAspectRatioImageView f;
    public TextView g;
    public int h;
    public Sj2 i;

    public mc2_0() {
        Serializable serializable = mz0_2.a;
        this.c = serializable;
        this.d = serializable;
    }

    public final void L6(FacetValue object, int n3, int n4) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "facetValue");
        Iterator iterator = ((Iterable)this.c).iterator();
        while (bl2 = iterator.hasNext()) {
            boolean bl3;
            String string2;
            FacetValue facetValue = (FacetValue)iterator.next();
            String string3 = facetValue.getCode();
            boolean bl4 = kotlin.text.b.i(string3, string2 = ((FacetValue)object).getCode(), bl3 = true);
            if (!bl4) continue;
            bl4 = false;
            string3 = null;
            facetValue.setSelected(false);
        }
        object = this.b;
        if (object != null) {
            ((RecyclerView$f)object).notifyItemChanged(n4);
        }
    }

    public final void f7(int n3) {
        Object object;
        int n4;
        mc2_0 mc2_02 = this;
        Object object2 = ((Iterable)this.c).iterator();
        while ((n4 = object2.hasNext()) != 0) {
            object = (FacetValue)object2.next();
            ((FacetValue)object).setSelected(false);
        }
        object2 = AnalyticsManager.Companion;
        object = ((AnalyticsManager$Companion)object2).getInstance();
        NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager)object).getNewCustomEventsRevamp();
        String string2 = newCustomEventsRevamp.getEVENT_CATEGORY_QUICK_FILTER_INTERACTIONS();
        String string3 = newCustomEventsRevamp.getEVENT_NAME_QUICK_FILTER_INTERACTIONS();
        String string4 = o72_0.a;
        String string5 = bv_0.a((AnalyticsManager$Companion)object2);
        String string6 = cv_0.a((AnalyticsManager$Companion)object2);
        int n7 = 1664;
        String string7 = "clear all - popup";
        String string8 = "";
        String string9 = "plp screen";
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string7, string8, string3, string4, string9, string5, null, string6, false, null, n7, null);
        object2 = mc2_02.b;
        if (object2 != null) {
            object = mc2_02.c;
            n4 = object.size();
            ((RecyclerView$f)object2).notifyItemRangeChanged(0, n4);
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        LC2 lC2 = new LC2(this);
        object.setOnShowListener((DialogInterface.OnShowListener)lC2);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.quick_filter_bottom_sheet_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        int n3 = 1;
        Object object4 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        super.onViewCreated((View)object, (Bundle)object2);
        int n4 = R$id.selected_quick_filters_rv;
        object2 = (RecyclerView)object.findViewById(n4);
        this.a = object2;
        n4 = R$id.title_tv;
        object2 = (TextView)object.findViewById(n4);
        if (object2 != null) {
            object4 = h40_0.a;
            object4 = h40_0.h0().optString("quickFilterBottomSheetTitle");
            object3 = "optString(...)";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
            object2.setText((CharSequence)object4);
        }
        n4 = R$id.done_tv;
        object2 = (AjioTextView)object.findViewById(n4);
        this.e = object2;
        n4 = R$id.close_stl;
        object2 = (AjioAspectRatioImageView)object.findViewById(n4);
        this.f = object2;
        n4 = R$id.clear_all_tv;
        object = (TextView)object.findViewById(n4);
        this.g = object;
        object = this.e;
        if (object != null) {
            int n7 = 2;
            object2 = new XA(this, n7);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.f) != null) {
            object2 = new cq_0(this, n3);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.g) != null) {
            object2 = new dQ(this, n3);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        object2 = this.getContext();
        object = new FlexboxLayoutManager((Context)object2);
        ((FlexboxLayoutManager)object).setFlexWrap(n3);
        n4 = 0;
        ((FlexboxLayoutManager)object).setFlexDirection(0);
        ((FlexboxLayoutManager)object).setJustifyContent(0);
        ((FlexboxLayoutManager)object).setAlignItems(0);
        object2 = this.a;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
        object4 = this.c;
        HashMap hashMap = this.d;
        int n8 = this.h;
        boolean bl2 = true;
        int n10 = 8;
        object3 = this;
        this.b = object = new nj2_0((List)object4, this, bl2, null, hashMap, n8, n10);
        object2 = this.a;
        if (object2 != null) {
            ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
        }
    }

    public final void r8(int n3) {
    }

    public final void y3(FacetValue object, int n3, int n4) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "facetValue");
        Iterator iterator = ((Iterable)this.c).iterator();
        while (bl2 = iterator.hasNext()) {
            boolean bl3;
            String string2;
            FacetValue facetValue = (FacetValue)iterator.next();
            String string3 = facetValue.getCode();
            boolean bl4 = kotlin.text.b.i(string3, string2 = ((FacetValue)object).getCode(), bl3 = true);
            if (!bl4) continue;
            facetValue.setSelected(bl3);
        }
        object = this.b;
        if (object != null) {
            ((RecyclerView$f)object).notifyItemChanged(n4);
        }
    }
}

