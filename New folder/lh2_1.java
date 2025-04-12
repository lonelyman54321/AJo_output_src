/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from LH2
 */
public final class lh2_1
extends RecyclerView$f {
    public final List a;

    public lh2_1(List list) {
        this.a = list;
    }

    public final int getItemCount() {
        int n3;
        List list = this.a;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block8: {
            var1_1 = (sh2_1)var1_1;
            Intrinsics.checkNotNullParameter(var1_1, "holder");
            var3_3 = this.a;
            if (var3_3 != null) {
                var4_4 = (OrderDetailLineItem)var3_3.get(var2_2);
            } else {
                var2_2 = 0;
                var5_5 = 0.0f;
                var4_4 = null;
            }
            var3_3 = var1_1.itemView;
            var6_6 = R$id.productIV;
            var3_3 = (ImageView)var3_3.findViewById(var6_6);
            var7_7 = var1_1.itemView;
            var8_8 = R$id.priceTV;
            var7_7 = (TextView)var7_7.findViewById(var8_8);
            var9_9 = var1_1.itemView;
            var10_10 = R$id.infoTV;
            var9_9 = (TextView)var9_9.findViewById(var10_10);
            var11_11 = var1_1.itemView;
            var12_12 = R$id.sizeTV;
            var11_11 = (TextView)var11_11.findViewById(var12_12);
            var1_1 = var1_1.itemView;
            var12_12 = R$id.brandTV;
            var1_1 = (TextView)var1_1.findViewById(var12_12);
            if (var4_4 == null) break block8;
            var13_13 = UH2.a((OrderDetailLineItem)var4_4);
            var14_14 = var13_13.a;
            if (var14_14 != null && (var15_15 = (int)b.k((CharSequence)var14_14)) == 0) {
                var14_14 = new da$a();
                var14_14.k = var16_16 = true;
                var14_14.a = var17_17 = R$drawable.component_placeholder;
                var14_14.b = var17_17;
                var14_14.c = var17_17;
                var14_14.s = var16_16;
                var17_17 = R$string.acc_icon_product_placeholder;
                var18_18 = hv3_0.K(var17_17);
                var14_14.b(var18_18);
                var18_18 = var13_13.a;
                var14_14.n = var18_18;
                var14_14.u = var3_3;
                var14_14.i = var16_16;
                var14_14.a();
            } else {
                var15_15 = R$drawable.item_dummy_noimg;
                var3_3.setImageResource(var15_15);
            }
            var3_3 = var4_4.getAmount();
            if (var3_3 == null || (var19_19 = var3_3.length()) == 0) ** GOTO lbl-1000
            var4_4 = var4_4.getAmount();
            var19_19 = 0;
            var3_3 = null;
            if (var4_4 != null) {
                var5_5 = Float.parseFloat((String)var4_4);
            } else {
                var2_2 = 0;
                var5_5 = 0.0f;
                var4_4 = null;
            }
            var2_2 = (int)((cfr_temp_0 = var5_5 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
            if (var2_2 > 0) {
                var4_4 = var13_13.b;
                var7_7.setText((CharSequence)var4_4);
                var2_2 = 0;
                var5_5 = 0.0f;
                var4_4 = null;
                var7_7.setVisibility(0);
            } else lbl-1000:
            // 2 sources

            {
                var2_2 = 4;
                var5_5 = 5.6E-45f;
                var7_7.setVisibility(var2_2);
            }
            var4_4 = var13_13.d;
            var9_9.setText((CharSequence)var4_4);
            var4_4 = var13_13.f;
            var11_11.setText((CharSequence)var4_4);
            var4_4 = var13_13.c;
            var1_1.setText((CharSequence)var4_4);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.row_order_refund_detail;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "view");
        object = new RecyclerView$B((View)viewGroup);
        return object;
    }
}

