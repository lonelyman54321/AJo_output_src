/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$style;
import com.ril.ajio.services.data.Facet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from kF1
 */
public final class kf1_0
extends ii0_0 {
    public final GI0 e;
    public final TextView f;
    public final View g;
    public final TextView h;

    public kf1_0(View view, GI0 gI0) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(gI0, "facetNameClickListener");
        super(view, gI0);
        this.e = gI0;
        int n3 = R$id.facet_row_name_tv;
        gI0 = (TextView)view.findViewById(n3);
        this.f = gI0;
        n3 = R$id.facet_row_selected_iv;
        gI0 = view.findViewById(n3);
        this.g = gI0;
        n3 = R$id.facet_row_num_tv;
        view = (TextView)view.findViewById(n3);
        this.h = view;
    }

    public final void w(int n3) {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "filter_new_ux";
        boolean bl2 = ((ao0_0)object).a(string2);
        if (!bl2) {
            return;
        }
        object = this.g;
        int n4 = 8;
        object.setVisibility(n4);
        object = this.h;
        if (n3 != 0) {
            n4 = 9;
            String string3 = n3 > n4 ? "9+" : String.valueOf(n3);
            object.setText((CharSequence)string3);
            n3 = 0;
            string3 = null;
            object.setVisibility(0);
        } else {
            object.setVisibility(n4);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void x(Facet var1_1) {
        Intrinsics.checkNotNullParameter(var1_1, "facet");
        var2_2 = var1_1.getName();
        var3_3 /* !! */  = this.f;
        var3_3 /* !! */ .setText((CharSequence)var2_2);
        var2_2 = var1_1.getCode();
        var4_4 = this.e;
        var5_5 = 0;
        var6_6 = this.g;
        if (var2_2 == null) ** GOTO lbl-1000
        var2_2 = var1_1.getCode();
        Intrinsics.checkNotNull(var2_2);
        var7_7 = (int)var4_4.l9(var2_2);
        if (var7_7 != 0) {
            var6_6.setVisibility(0);
        } else lbl-1000:
        // 2 sources

        {
            var7_7 = 8;
            var6_6.setVisibility(var7_7);
        }
        var2_2 = var4_4.Q9();
        if (var2_2 == null && (var7_7 = this.getAdapterPosition()) == 0) {
            var2_2 = this.itemView;
            var4_4 = var2_2.getContext();
            var5_5 = R$color.accent_color_11;
            var8_8 = t70.getColor((Context)var4_4, var5_5);
            var2_2.setBackgroundColor(var8_8);
            var7_7 = R$style.muli_bold_12_accent_21;
            Hm3.f(var3_3 /* !! */ , var7_7);
        } else {
            var2_2 = var1_1.getCode();
            if (var2_2 != null && (var2_2 = var4_4.Q9()) != null && (var7_7 = (int)kotlin.text.b.i(var2_2 = var4_4.Q9(), (String)(var4_4 = var1_1.getCode()), false)) != 0) {
                var2_2 = this.itemView;
                var4_4 = var2_2.getContext();
                var5_5 = R$color.accent_color_11;
                var8_9 = t70.getColor((Context)var4_4, var5_5);
                var2_2.setBackgroundColor(var8_9);
                var7_7 = R$style.muli_bold_12_accent_21;
                Hm3.f(var3_3 /* !! */ , var7_7);
            } else {
                var2_2 = this.itemView;
                var4_4 = var2_2.getContext();
                var5_5 = R$color.new_accent_color_31;
                var8_10 = t70.getColor((Context)var4_4, var5_5);
                var2_2.setBackgroundColor(var8_10);
                var7_7 = R$style.muli_regular_12_accent_21;
                Hm3.f(var3_3 /* !! */ , var7_7);
            }
        }
        var2_2 = this.itemView;
        var3_3 /* !! */  = new jf1_0(var1_1, this);
        var2_2.setOnClickListener((View.OnClickListener)var3_3 /* !! */ );
    }
}

