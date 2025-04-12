/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.text.SpannableString
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView$BufferType
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.user.AppliedFacetValue;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

public final class hZ1
extends RecyclerView$f {
    public static final hZ1$b Companion;
    public final hZ1$e a;
    public final ArrayList b;

    static {
        hZ1$b hZ1$b;
        Companion = hZ1$b = new Object();
    }

    public hZ1(ia_0 arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "onAppliedFilterItemClick");
        this.a = arrayList;
        this.b = arrayList = new ArrayList();
    }

    public final void g(ArrayList arrayList) {
        Object object = arrayList;
        Intrinsics.checkNotNullParameter(arrayList, "filteredList");
        ArrayList arrayList2 = this.b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        int n3 = arrayList2.size();
        int n4 = 1;
        if (n3 > n4) {
            int n7 = 8191;
            FacetValue facetValue = new FacetValue(null, null, false, false, 0, null, null, null, null, null, false, false, false, n7, null);
            int n8 = 4;
            String string2 = "clear";
            object = new AppliedFacetValue(string2, facetValue, 0, n8, null);
            arrayList2.add(object);
        }
        this.notifyDataSetChanged();
    }

    public final int getItemCount() {
        return this.b.size();
    }

    public final int getItemViewType(int n3) {
        boolean bl2;
        String string2;
        String string3 = ((AppliedFacetValue)this.b.get(n3)).getType();
        boolean bl3 = Intrinsics.areEqual(string3, string2 = "more");
        n3 = bl3 ? 4 : ((bl2 = Intrinsics.areEqual(string3, string2 = "clear")) ? 3 : super.getItemViewType(n3));
        return n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onBindViewHolder(RecyclerView$B var1_1, int var2_2) {
        block15: {
            block14: {
                var3_3 = 1;
                var4_4 = 0;
                var5_5 = null;
                Intrinsics.checkNotNullParameter(var1_1, "holder");
                var6_6 = this.b;
                var7_7 = var6_6.get(var2_2);
                var8_8 /* !! */  = "get(...)";
                Intrinsics.checkNotNullExpressionValue(var7_7, var8_8 /* !! */ );
                var7_7 = (AppliedFacetValue)var7_7;
                var9_9 = var1_1 instanceof hZ1$c;
                if (!var9_9) break block14;
                var6_6 = var7_7.getFacetValue();
                var9_9 = false;
                var8_8 /* !! */  = null;
                if (var6_6 == null) ** GOTO lbl-1000
                var6_6 = var7_7.getFacetValue();
                if (var6_6 != null) {
                    var6_6 = var6_6.getFacetCode();
                } else {
                    var10_10 = 0;
                    var6_6 = null;
                }
                if (var6_6 != null && (var6_6 = var7_7.getFacetValue()) != null && (var6_6 = var6_6.getFacetCode()) != null && (var10_10 = var6_6.equalsIgnoreCase((String)(var11_11 = "rating"))) == var3_3) {
                    var6_6 = he3_1.Companion;
                    var11_11 = var7_7.getFacetValue();
                    Intrinsics.checkNotNull(var11_11);
                    var11_11 = var11_11.getName();
                    var6_6.getClass();
                    var6_6 = he3$a_0.a((String)var11_11);
                    var12_12 = 2;
                    var13_14 = "";
                    var15_16 = var6_6 != null && (var14_15 = var6_6.size()) == var12_12 ? var6_6.get(var3_3) : var13_14;
                    var16_19 = var6_6;
                    var16_19 = (Collection)var6_6;
                    if (var16_19 != null && (var14_15 = (int)var16_19.isEmpty()) == 0) {
                        if (var6_6 != null) {
                            var5_5 = (String)var6_6.get(0);
                        } else {
                            var4_4 = 0;
                            var5_5 = null;
                        }
                        var6_6 = new StringBuilder();
                        var6_6.append((String)var5_5);
                        var5_5 = " ";
                        var6_6.append((String)var5_5);
                        var6_6.append(var15_16);
                        var13_14 = var6_6.toString();
                    }
                    var15_16 = new SpannableString((CharSequence)var13_14);
                    var5_5 = ((RecyclerView$B)var1_1).itemView.getContext();
                    var10_10 = R$drawable.ic_rating_star_small;
                    if ((var5_5 = xn.a((Context)var5_5, var10_10)) != null) {
                        var5_5 = bu0_0.a((Drawable)var5_5);
                    } else {
                        var4_4 = 0;
                        var5_5 = null;
                    }
                    if (var5_5 != null) {
                        var6_6 = ((RecyclerView$B)var1_1).itemView.getContext();
                        var13_14 = "getContext(...)";
                        Intrinsics.checkNotNullExpressionValue(var6_6, var13_14);
                        var8_8 /* !! */  = new lr_0((Context)var6_6, (Bitmap)var5_5);
                    }
                    var4_4 = 3;
                    var10_10 = 33;
                    var15_16.setSpan((Object)var8_8 /* !! */ , var12_12, var4_4, var10_10);
                    var5_5 = var1_1;
                    var5_5 = ((hZ1$c)var1_1).a;
                    var6_6 = TextView.BufferType.SPANNABLE;
                    var5_5.setText((CharSequence)var15_16, (TextView.BufferType)var6_6);
                } else lbl-1000:
                // 2 sources

                {
                    var15_16 = var1_1;
                    var15_16 = ((hZ1$c)var1_1).a;
                    var5_5 = var7_7.getFacetValue();
                    if (var5_5 != null) {
                        var8_8 /* !! */  = var5_5.getName();
                    }
                    var15_16.setText((CharSequence)var8_8 /* !! */ );
                }
                var1_1 = ((hZ1$c)var1_1).b;
                var15_16 = new eZ1((AppliedFacetValue)var7_7, this, var2_2);
                var1_1.setOnClickListener((View.OnClickListener)var15_16);
                break block15;
            }
            var17_20 = var1_1 instanceof hZ1$d;
            if (var17_20) {
                var7_7 = var1_1;
                var7_7 = (hZ1$d)var1_1;
                var8_8 /* !! */  = var7_7.a;
                var1_1 = var1_1.itemView.getContext();
                var12_13 = R$string.applied_filter_more_text;
                var2_2 = ((AppliedFacetValue)var6_6.get(var2_2)).getSize();
                var18_21 = var2_2;
                var15_17 = new Object[var3_3];
                var15_17[0] = var18_21;
                var1_1 = var1_1.getString(var12_13, var15_17);
                var8_8 /* !! */ .setText((CharSequence)var1_1);
                var1_1 = new fZ1(this, 0);
                var18_21 = var7_7.a;
                var18_21.setOnClickListener((View.OnClickListener)var1_1);
            } else {
                var3_3 = var1_1 instanceof hZ1$a;
                if (var3_3 != 0) {
                    var1_1 = ((hZ1$a)var1_1).a;
                    var15_18 = new gZ1(this, var2_2);
                    var1_1.setOnClickListener((View.OnClickListener)var15_18);
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        LayoutInflater layoutInflater = ck0.a(viewGroup, "parent");
        int n4 = 3;
        String string2 = "inflate(...)";
        if (n3 != n4) {
            n4 = 4;
            if (n3 != n4) {
                n4 = R$layout.filter_item_layout;
                viewGroup = layoutInflater.inflate(n4, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                recyclerView$B = new hZ1$c((View)viewGroup);
            } else {
                n4 = R$layout.applied_filter_size_exceed_layout;
                viewGroup = layoutInflater.inflate(n4, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                recyclerView$B = new hZ1$d((View)viewGroup);
            }
        } else {
            n4 = R$layout.applied_filters_clear_layout;
            viewGroup = layoutInflater.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            recyclerView$B = new hZ1$a((View)viewGroup);
        }
        return recyclerView$B;
    }
}

