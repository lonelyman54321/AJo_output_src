/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 */
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.FacetValue;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class sF1
extends YY0 {
    public final KI0 g;
    public final ImageView h;
    public final ImageView i;
    public final TextView j;
    public boolean k;

    public sF1(View view, KI0 kI0) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(kI0, "facetValueClickListener");
        super(view, kI0);
        this.g = kI0;
        int n3 = R$id.general_facet_row_selected_iv;
        kI0 = (ImageView)view.findViewById(n3);
        this.h = kI0;
        n3 = R$id.general_facet_row_color_iv;
        kI0 = (ImageView)view.findViewById(n3);
        this.i = kI0;
        n3 = R$id.general_facet_value_row_tv;
        view = (TextView)view.findViewById(n3);
        this.j = view;
    }

    public final void x(FacetValue facetValue, HashMap hashMap, HashMap object, int n3, int n4) {
        int n7;
        boolean bl2;
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(facetValue, "facetValue");
        Intrinsics.checkNotNullParameter(hashMap, "userSelectedFacetValues");
        Intrinsics.checkNotNullParameter(object, "userDeselectedFacetValues");
        String string4 = " products index ";
        String string5 = " ";
        String string6 = ")";
        String string7 = " (";
        TextView textView = this.j;
        int n8 = 1;
        if (n3 == n8) {
            CharSequence charSequence = facetValue.getDisplayName();
            int n10 = facetValue.getCount();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(string7);
            stringBuilder.append(n10);
            stringBuilder.append(string6);
            string6 = stringBuilder.toString();
            textView.setText((CharSequence)string6);
            string6 = facetValue.getDisplayName();
            int n14 = facetValue.getCount();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string6);
            ((StringBuilder)charSequence).append(string5);
            ((StringBuilder)charSequence).append(n14);
            ((StringBuilder)charSequence).append(string4);
            ((StringBuilder)charSequence).append(n4);
            string3 = ((StringBuilder)charSequence).toString();
            textView.setContentDescription((CharSequence)string3);
        } else {
            CharSequence charSequence = facetValue.getName();
            int n15 = facetValue.getCount();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(string7);
            stringBuilder.append(n15);
            stringBuilder.append(string6);
            string6 = stringBuilder.toString();
            textView.setText((CharSequence)string6);
            string6 = facetValue.getName();
            int n16 = facetValue.getCount();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string6);
            ((StringBuilder)charSequence).append(string5);
            ((StringBuilder)charSequence).append(n16);
            ((StringBuilder)charSequence).append(string4);
            ((StringBuilder)charSequence).append(n4);
            string3 = ((StringBuilder)charSequence).toString();
            textView.setContentDescription((CharSequence)string3);
        }
        n4 = 3;
        string4 = null;
        string5 = this.i;
        if (n3 == n4) {
            string5.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(string5, "colorIv");
            string2 = facetValue.getName();
            YY0.w((ImageView)string5, string2);
        } else {
            n3 = 8;
            string5.setVisibility(n3);
        }
        n3 = (int)(facetValue.getSelected() ? 1 : 0);
        string3 = this.h;
        if (n3 != 0 && !(bl2 = object.containsKey(string2 = facetValue.getCode())) || (n7 = hashMap.containsKey(object = facetValue.getCode())) != 0) {
            this.k = n8;
            n7 = R$color.accent_color_10;
            string3.setBackgroundResource(n7);
            n7 = R$drawable.ic_done;
            string3.setImageResource(n7);
        } else {
            this.k = false;
            n7 = R$drawable.rect_black_stroke_1dp;
            string3.setBackgroundResource(n7);
            n7 = R$color.accent_color_11;
            string3.setImageResource(n7);
        }
        hashMap = this.itemView;
        object = new rf1_0(this, facetValue);
        hashMap.setOnClickListener((View.OnClickListener)object);
    }

    public final void y(FacetValue facetValue, HashMap hashMap, HashMap hashMap2, int n3, DD2 dD2, qy0_1 qy0_12, int n4, Boolean bl2, Function2 function2) {
        Intrinsics.checkNotNullParameter(facetValue, "facetValue");
        Intrinsics.checkNotNullParameter(hashMap, "userSelectedFacetValues");
        Intrinsics.checkNotNullParameter(hashMap2, "userDeselectedFacetValues");
        String string2 = "generalFacetValueAdapter";
        Intrinsics.checkNotNullParameter(qy0_12, string2);
        super.y(facetValue, hashMap, hashMap2, n3, dD2, qy0_12, n4, bl2, function2);
        int n7 = 5;
        if (n3 == n7) {
            facetValue = this.h;
            hashMap = facetValue.getContext().getResources();
            int n8 = R$dimen.dimen_24;
            int n10 = hashMap.getDimensionPixelSize(n8);
            hashMap2 = facetValue.getLayoutParams();
            String string3 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
            Intrinsics.checkNotNull(hashMap2, string3);
            hashMap2 = (LinearLayout.LayoutParams)hashMap2;
            ((LinearLayout.LayoutParams)hashMap2).width = n10;
            ((LinearLayout.LayoutParams)hashMap2).height = n10;
            facetValue.setLayoutParams((ViewGroup.LayoutParams)hashMap2);
            n10 = this.getLayoutPosition();
            n8 = qy0_12.h;
            if (n10 == n8) {
                n10 = R$color.white;
                facetValue.setBackgroundResource(n10);
                n10 = R$drawable.ic_radio_button_on_small;
                facetValue.setImageResource(n10);
            } else {
                n10 = R$color.white;
                facetValue.setBackgroundResource(n10);
                n10 = R$drawable.ic_radio_button_small;
                facetValue.setImageResource(n10);
            }
        }
    }
}

