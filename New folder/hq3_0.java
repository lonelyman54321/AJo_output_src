/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.chuckerteam.chucker.R$color;
import com.chuckerteam.chucker.R$drawable;
import com.chuckerteam.chucker.R$layout;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction$a;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from hq3
 */
public final class hq3_0
extends RecyclerView$f {
    public final hq3$a a;
    public List b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public hq3_0(Context context, hq3$a arrayList) {
        int n3;
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = arrayList;
        this.b = arrayList = new ArrayList();
        int n4 = R$color.chucker_status_default;
        this.c = n4 = t70.getColor(context, n4);
        n4 = R$color.chucker_status_requested;
        this.d = n4 = t70.getColor(context, n4);
        n4 = R$color.chucker_status_error;
        this.e = n4 = t70.getColor(context, n4);
        n4 = R$color.chucker_status_500;
        this.f = n4 = t70.getColor(context, n4);
        n4 = R$color.chucker_status_400;
        this.g = n4 = t70.getColor(context, n4);
        n4 = R$color.chucker_status_300;
        this.h = n3 = t70.getColor(context, n4);
    }

    public final int getItemCount() {
        return this.b.size();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block23: {
            var1_1 = (hq3$b_0)var1_1;
            Intrinsics.checkNotNullParameter(var1_1, "holder");
            var3_3 /* !! */  = (Mb1)this.b.get(var2_2);
            var1_1.getClass();
            Intrinsics.checkNotNullParameter(var3_3 /* !! */ , "transaction");
            var4_4 = var3_3 /* !! */ .a;
            var6_5 = var4_4;
            var1_1.b = var6_5;
            var6_5 = var1_1.a;
            var7_6 /* !! */  = var6_5.e;
            var8_7 /* !! */  = new StringBuilder();
            var9_8 = var3_3 /* !! */ .d;
            var8_7 /* !! */ .append(var9_8);
            var10_9 = 32;
            var8_7 /* !! */ .append((char)var10_9);
            var9_8 = var3_3 /* !! */ .f;
            var11_10 = null;
            var12_11 = "";
            if (var9_8 == null) lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_8 = var12_11;
                    break block23;
                    break;
                }
            }
            var9_8 = Intrinsics.stringPlus("https://www.example.com", var9_8);
            var13_12 = "<this>";
            Intrinsics.checkNotNullParameter(var9_8, (String)var13_12);
            Intrinsics.checkNotNullParameter(var9_8, (String)var13_12);
            var13_12 = new Ob1$a();
            try {
                var13_12.e(null, (String)var9_8);
                var9_8 = var13_12.b();
            }
            catch (IllegalArgumentException v0) {
                var10_9 = 0;
                var9_8 = null;
            }
            ** while (var9_8 == null)
lbl41:
            // 1 sources

            var13_12 = null;
            var9_8 = MV0$a.a((ob1_1)var9_8, false).a();
        }
        var8_7 /* !! */ .append((String)var9_8);
        var8_7 /* !! */  = var8_7 /* !! */ .toString();
        var7_6 /* !! */ .setText((CharSequence)var8_7 /* !! */ );
        var7_6 /* !! */  = var6_5.d;
        var8_7 /* !! */  = var3_3 /* !! */ .e;
        var7_6 /* !! */ .setText((CharSequence)var8_7 /* !! */ );
        var7_6 /* !! */  = DateFormat.getTimeInstance();
        var8_7 /* !! */  = var3_3 /* !! */ .b;
        var7_6 /* !! */  = var7_6 /* !! */ .format(var8_7 /* !! */ );
        var6_5.h.setText((CharSequence)var7_6 /* !! */ );
        var7_6 /* !! */  = var3_3 /* !! */ .g;
        var8_7 /* !! */  = "https";
        var10_9 = 1;
        var14_13 = kotlin.text.b.i((String)var7_6 /* !! */ , (String)var8_7 /* !! */ , (boolean)var10_9);
        if (var14_13 != 0) {
            var15_14 = R$drawable.chucker_ic_https;
            var10_9 = R$color.chucker_color_primary;
            var7_6 /* !! */  = new JB2(var15_14, var10_9);
        } else {
            var15_15 = R$drawable.chucker_ic_http;
            var10_9 = R$color.chucker_color_error;
            var7_6 /* !! */  = new JB2(var15_15, var10_9);
        }
        var8_7 /* !! */  = var1_1.itemView.getContext();
        var10_9 = var7_6 /* !! */ .a;
        var8_7 /* !! */  = xn.a((Context)var8_7 /* !! */ , var10_9);
        var9_8 = var6_5.g;
        var9_8.setImageDrawable((Drawable)var8_7 /* !! */ );
        var8_7 /* !! */  = var1_1.itemView.getContext();
        var14_13 = var7_6 /* !! */ .b;
        var14_13 = t70.getColor((Context)var8_7 /* !! */ , var14_13);
        var7_6 /* !! */  = ColorStateList.valueOf((int)var14_13);
        Me1.a((ImageView)var9_8, (ColorStateList)var7_6 /* !! */ );
        var7_6 /* !! */  = var3_3 /* !! */ .a();
        var8_7 /* !! */  = HttpTransaction$a.Complete;
        var9_8 = var3_3 /* !! */ .h;
        var13_12 = var6_5.b;
        var16_16 = var6_5.f;
        var17_17 = var6_5.c;
        if (var7_6 /* !! */  == var8_7 /* !! */ ) {
            var7_6 /* !! */  = String.valueOf(var9_8);
            var13_12.setText((CharSequence)var7_6 /* !! */ );
            var7_6 /* !! */  = var3_3 /* !! */ .c;
            if (var7_6 /* !! */  != null) {
                var18_18 = var7_6 /* !! */ .longValue();
                var11_10 = UX.b(var18_18, " ms");
            }
            var17_17.setText(var11_10);
            var7_6 /* !! */  = var3_3 /* !! */ .i;
            var20_19 = 0L;
            var18_18 = var7_6 /* !! */  == null ? var20_19 : var7_6 /* !! */ .longValue();
            var17_17 = var3_3 /* !! */ .j;
            if (var17_17 != null) {
                var20_19 = var17_17.longValue();
            }
            var7_6 /* !! */  = LV0.a(var18_18 += var20_19);
            var16_16.setText((CharSequence)var7_6 /* !! */ );
        } else {
            var13_12.setText((CharSequence)var12_11);
            var17_17.setText((CharSequence)var12_11);
            var16_16.setText((CharSequence)var12_11);
        }
        var7_6 /* !! */  = var3_3 /* !! */ .a();
        var8_7 /* !! */  = HttpTransaction$a.Failed;
        if (var7_6 /* !! */  == var8_7 /* !! */ ) {
            var7_6 /* !! */  = "!!!";
            var13_12.setText((CharSequence)var7_6 /* !! */ );
        }
        var7_6 /* !! */  = var3_3 /* !! */ .a();
        var1_1 = var1_1.c;
        if (var7_6 /* !! */  == var8_7 /* !! */ ) {
            var22_20 = var1_1.e;
        } else if ((var3_3 /* !! */  = var3_3 /* !! */ .a()) == (var7_6 /* !! */  = HttpTransaction$a.Requested)) {
            var22_20 = var1_1.d;
        } else if (var9_8 == null) {
            var22_20 = var1_1.c;
        } else {
            Intrinsics.checkNotNull(var9_8);
            var2_2 = var9_8.intValue();
            var14_13 = 500;
            if (var2_2 >= var14_13) {
                var22_20 = var1_1.f;
            } else {
                Intrinsics.checkNotNull(var9_8);
                var2_2 = var9_8.intValue();
                var14_13 = 400;
                if (var2_2 >= var14_13) {
                    var22_20 = var1_1.g;
                } else {
                    Intrinsics.checkNotNull(var9_8);
                    var2_2 = var9_8.intValue();
                    var14_13 = 300;
                    var22_20 = var2_2 >= var14_13 ? var1_1.h : var1_1.c;
                }
            }
        }
        var13_12.setTextColor(var22_20);
        var6_5.e.setTextColor(var22_20);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Object object2 = ck0.a(object, "parent");
        int n4 = R$layout.chucker_list_item_transaction;
        object = CU.bind(object2.inflate(n4, object, false));
        Intrinsics.checkNotNullExpressionValue(object, "inflate(LayoutInflater.from(parent.context), parent, false)");
        object2 = new hq3$b_0(this, (CU)object);
        return object2;
    }
}

