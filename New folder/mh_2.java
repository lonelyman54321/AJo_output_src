/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.NavImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mH
 */
public final class mh_2
extends ArrayAdapter {
    public String a;
    public kH$a b;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final View getView(int var1_1, View var2_2, ViewGroup var3_3) {
        var4_4 = "parent";
        Intrinsics.checkNotNullParameter(var3_3 /* !! */ , (String)var4_4);
        var5_5 = (NavImpl)this.getItem(var1_1);
        if (var2_2 == null) {
            var2_2 = LayoutInflater.from((Context)this.getContext());
            var6_6 = R$layout.row_sub_category_sub_child;
            var7_7 = 0;
            var8_8 = null;
            var2_2 = var2_2.inflate(var6_6, var3_3 /* !! */ , false);
            Intrinsics.checkNotNull(var2_2);
            var3_3 /* !! */  = new mH$a(var2_2);
            var2_2.setTag((Object)var3_3 /* !! */ );
        } else {
            var3_3 /* !! */  = var2_2.getTag();
            var4_4 = "null cannot be cast to non-null type com.ril.ajio.home.category.revamp.CMSSubCategoryChildAdapter.CategoryChildViewHolder";
            Intrinsics.checkNotNull(var3_3 /* !! */ , (String)var4_4);
            var3_3 /* !! */  = (mH$a)var3_3 /* !! */ ;
        }
        var4_4 = var3_3 /* !! */ .c;
        var7_7 = 8;
        var4_4.setVisibility(var7_7);
        var6_6 = var5_5 instanceof CMSNavigation;
        var8_8 = var3_3 /* !! */ .b;
        if (var6_6 == 0) ** GOTO lbl-1000
        var4_4 = var5_5;
        var4_4 = (CMSNavigation)var5_5;
        var9_9 = var4_4.getChildDetails();
        if (var9_9 == null || (var10_10 = var9_9.isEmpty())) {
            var5_5 = var4_4.getInactiveAltText();
            if (var5_5 != null) {
                var5_5 = var4_4.getInactiveAltText();
                var2_2.setContentDescription((CharSequence)var5_5);
            }
            px3.b((CMSNavigation)var4_4);
            var5_5 = var4_4.getName();
            if (var8_8 != null) {
                var9_9 = new lh_2(this, (String)var5_5, (CMSNavigation)var4_4);
                var8_8.setOnClickListener((View.OnClickListener)var9_9);
            }
        } else if (var5_5 != null && (var6_6 = var5_5 instanceof CMSNavigation) != 0) {
            var5_5 = ((CMSNavigation)var5_5).getName();
            var6_6 = 0;
            var4_4 = null;
            var8_8.setOnClickListener(null);
        } else {
            var5_5 = "";
        }
        var3_3 /* !! */ .a.setText((CharSequence)var5_5);
        return var2_2;
    }
}

