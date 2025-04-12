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
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$id;
import com.ril.ajio.R$style;
import com.ril.ajio.services.data.Facet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from II0
 */
public class ii0_0
extends RecyclerView$B {
    public final GI0 a;
    public final TextView b;
    public final View c;
    public final TextView d;

    public ii0_0(View view, GI0 gI0) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(gI0, "facetNameClickListener");
        super(view);
        this.a = gI0;
        int n3 = R$id.facet_row_name_tv;
        gI0 = (TextView)view.findViewById(n3);
        this.b = gI0;
        n3 = R$id.facet_row_selected_iv;
        gI0 = view.findViewById(n3);
        this.c = gI0;
        n3 = R$id.facet_row_num_tv;
        view = (TextView)view.findViewById(n3);
        this.d = view;
    }

    public void w(int n3) {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "filter_new_ux";
        boolean bl2 = ((ao0_0)object).a(string2);
        if (!bl2) {
            return;
        }
        object = this.c;
        int n4 = 8;
        object.setVisibility(n4);
        object = this.d;
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
    public void x(Facet var1_1) {
        Intrinsics.checkNotNullParameter(var1_1, "facet");
        var2_2 = var1_1.getName();
        var3_3 /* !! */  = this.b;
        var3_3 /* !! */ .setText((CharSequence)var2_2);
        var2_2 = var1_1.getCode();
        var4_4 = this.a;
        var5_5 /* !! */  = this.c;
        if (var2_2 == null) ** GOTO lbl-1000
        var2_2 = var1_1.getCode();
        Intrinsics.checkNotNull(var2_2);
        var6_6 = (int)var4_4.l9(var2_2);
        if (var6_6 != 0) {
            var5_5 /* !! */ .setVisibility(0);
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = 8;
            var5_5 /* !! */ .setVisibility(var6_6);
        }
        var2_2 = this.itemView.getContext();
        var5_5 /* !! */  = "getContext(...)";
        Intrinsics.checkNotNullExpressionValue(var2_2, (String)var5_5 /* !! */ );
        var7_7 = R$attr.plp_product_bg;
        var6_6 = tm3_0.a(var7_7, (Context)var2_2);
        var8_8 /* !! */  = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(var8_8 /* !! */ , (String)var5_5 /* !! */ );
        var9_9 = tm3_0.a(R$attr.bg_color_accent_2, var8_8 /* !! */ );
        var8_8 /* !! */  = var4_4.Q9();
        if (var8_8 /* !! */  == null && (var7_7 = this.getAdapterPosition()) == 0) {
            var4_4 = this.itemView;
            var4_4.setBackgroundColor(var6_6);
            var6_6 = R$style.muli_bold_12_accent_10_plp;
            Hm3.f(var3_3 /* !! */ , var6_6);
        } else {
            var8_8 /* !! */  = var1_1.getCode();
            if (var8_8 /* !! */  != null && (var8_8 /* !! */  = var4_4.Q9()) != null && (var10_10 = kotlin.text.b.i((String)(var4_4 = var4_4.Q9()), (String)(var8_8 /* !! */  = var1_1.getCode()), false))) {
                var4_4 = this.itemView;
                var4_4.setBackgroundColor(var6_6);
                var6_6 = R$style.muli_bold_12_accent_10_plp;
                Hm3.f(var3_3 /* !! */ , var6_6);
            } else {
                var2_2 = this.itemView;
                var2_2.setBackgroundColor(var9_9);
                var6_6 = R$style.facet_muli_regular_12_accent_10;
                Hm3.f(var3_3 /* !! */ , var6_6);
            }
        }
        var2_2 = this.itemView;
        var3_3 /* !! */  = new HI0(var1_1, this);
        var2_2.setOnClickListener((View.OnClickListener)var3_3 /* !! */ );
    }
}

