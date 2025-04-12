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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ON
 */
public final class on_1
extends RecyclerView$B {
    public final nw_0 a;
    public final RecyclerView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public String f;
    public final j82_0 g;
    public final NewCustomEventsRevamp h;

    public on_1(View object, j82_0 object2, Context context, nw_0 object3) {
        String string2 = "itemView";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "onCartClickListener");
        String string3 = "context";
        Intrinsics.checkNotNullParameter(context, string3);
        super((View)object);
        this.a = object3;
        this.f = object3 = "";
        this.g = object2;
        this.h = object2 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = R$id.oosRv;
        this.b = object2 = (RecyclerView)object.findViewById(n3);
        n3 = R$id.oosHeaderTv;
        object2 = (TextView)object.findViewById(n3);
        this.c = object2;
        n3 = R$id.removeAllBtn;
        object2 = (TextView)object.findViewById(n3);
        this.d = object2;
        n3 = R$id.cart_bag_stock_items;
        object = (TextView)object.findViewById(n3);
        this.e = object;
        super(context);
        n3 = 1;
        ((LinearLayoutManager)object).setOrientation(n3);
        object2 = this.b;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void w(int var1_1, String var2_2, ArrayList var3_3) {
        block19: {
            block18: {
                var4_4 /* !! */  = this.e;
                var5_5 = this.d;
                Intrinsics.checkNotNullParameter(var2_2, "cartAge");
                Intrinsics.checkNotNull(var3_3, "null cannot be cast to non-null type kotlin.collections.List<com.ril.ajio.services.data.Cart.CartEntry>");
                var7_7 = this.g;
                var8_8 = this.a;
                var6_6 = new mn_2((j82_0)var7_7, var3_3, (nw_0)var8_8, false);
                var9_9 = var3_3.size();
                var10_10 = 1;
                if (var9_9 != var10_10) break block18;
                var11_11 = R$string.cart_sold_items_one;
                var7_7 = var9_9;
                var12_13 = new Object[var10_10];
                var12_13[0] = var7_7;
                this.f = var7_7 = hv3_0.L(var11_11, var12_13);
                if (var5_5 != null) {
                    ai0_2.i((View)var5_5);
                }
                break block19;
            }
            var11_12 = R$string.cart_sold_items_many;
            var7_7 = var9_9;
            var12_14 /* !! */  = new Object[var10_10];
            var12_14 /* !! */ [0] = var7_7;
            this.f = var7_7 = hv3_0.L(var11_12, var12_14 /* !! */ );
            var7_7 = cp_1.Companion;
            var7_7.getClass();
            var13_15 /* !! */  = cp$a.j();
            var12_14 /* !! */  = "master_flag";
            var11_12 = (int)var13_15 /* !! */ .has((String)var12_14 /* !! */ );
            if (var11_12 == 0 || (var11_12 = (int)(var13_15 /* !! */  = cp$a.j()).getBoolean((String)var12_14 /* !! */ )) == 0) ** GOTO lbl-1000
            var7_7.getClass();
            var7_7 = cp$a.j();
            var13_15 /* !! */  = "is_remove_all_enabled";
            var9_9 = (int)var7_7.has((String)var13_15 /* !! */ );
            if (var9_9 != 0 && (var9_9 = (int)(var7_7 = cp$a.j()).getBoolean((String)var13_15 /* !! */ )) != 0) {
                var9_9 = (int)og1_1.b();
                if (var9_9 != 0 && var5_5 != null) {
                    var5_5.getPaintFlags();
                    if (var5_5 != null) {
                        var7_7 = var5_5.getPaintFlags();
                        Intrinsics.checkNotNull(var7_7);
                        var9_9 = var7_7.intValue() | 8;
                        var5_5.setPaintFlags(var9_9);
                    }
                }
                if (var5_5 != null) {
                    ai0_2.B((View)var5_5);
                }
            } else if (var5_5 != null) {
                ai0_2.i((View)var5_5);
            }
        }
        if (var1_1 > 0) {
            if (var1_1 == var10_10) {
                if (var4_4 /* !! */  != null) {
                    var9_9 = R$string.cart_stock_items_one;
                    var14_16 = var1_1;
                    var8_8 = new Object[var10_10];
                    var8_8[0] = var14_16;
                    var14_16 = hv3_0.L(var9_9, var8_8);
                    var4_4 /* !! */ .setText((CharSequence)var14_16);
                }
            } else if (var4_4 /* !! */  != null) {
                var9_9 = R$string.cart_stock_items_many;
                var14_16 = var1_1;
                var8_8 = new Object[var10_10];
                var8_8[0] = var14_16;
                var14_16 = hv3_0.L(var9_9, var8_8);
                var4_4 /* !! */ .setText((CharSequence)var14_16);
            }
            if (var4_4 /* !! */  != null) {
                ai0_2.B((View)var4_4 /* !! */ );
            }
        } else if (var4_4 /* !! */  != null) {
            ai0_2.i((View)var4_4 /* !! */ );
        }
        if ((var14_16 = this.c) != null) {
            var4_4 /* !! */  = this.f;
            var14_16.setText((CharSequence)var4_4 /* !! */ );
        }
        if ((var14_16 = this.b) != null) {
            var14_16.setAdapter(var6_6);
        }
        if (var5_5 != null) {
            var14_16 = new nn_1(this, var3_3, var2_2);
            var5_5.setOnClickListener((View.OnClickListener)var14_16);
        }
    }
}

