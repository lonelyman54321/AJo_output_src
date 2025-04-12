/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class kD1
extends RecyclerView$B {
    public final bd1_1 a;
    public final TextView b;
    public final ImageView c;
    public final View d;

    /*
     * WARNING - void declaration
     */
    public kD1(View view, bd1_1 bd1_12, String string2, boolean bl2, boolean bl3, int n3) {
        String string3;
        int n4;
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(bd1_12, "listener");
        super(view);
        this.a = bd1_12;
        int n7 = R$id.row_lux_brand_tv;
        bd1_12 = view.findViewById(n7);
        String string4 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(bd1_12, string4);
        bd1_12 = (TextView)bd1_12;
        this.b = bd1_12;
        int n8 = R$id.row_lux_brand_img_vw;
        View view2 = view.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(view2, string4);
        view2 = (ImageView)view2;
        this.c = view2;
        int n10 = R$id.separator_vw;
        view = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view, string4);
        this.d = view;
        string4 = bd1_12.getResources().getDisplayMetrics();
        float f5 = TypedValue.applyDimension((int)1, (float)12.0f, (DisplayMetrics)string4);
        int n14 = (int)f5;
        n10 = 8;
        if (string2 != null && (n4 = Intrinsics.areEqual(string2, string3 = "BRAND_PAGE")) != 0 && bl2) {
            void var5_10;
            int n15;
            void var6_11;
            double d2 = 0.25;
            double d5 = (double)var6_11 * d2;
            string2 = view2.getLayoutParams();
            ((ViewGroup.LayoutParams)string2).width = n15 = (int)d5;
            view2.requestLayout();
            string2 = bd1_12.getContext();
            int n16 = R$color.luxe_color_202020;
            n4 = t70.getColor((Context)string2, n16);
            bd1_12.setTextColor(n4);
            string2 = bd1_12.getContext();
            int n17 = R$color.white;
            n4 = t70.getColor((Context)string2, n17);
            bd1_12.setBackgroundColor(n4);
            if (var5_10 != false) {
                view2.setVisibility(0);
                view.setVisibility(0);
            } else {
                bd1_12.setPadding(0, n14, 0, n14);
                view2.setVisibility(n10);
                view.setVisibility(n10);
            }
        } else {
            string2 = bd1_12.getContext();
            int n18 = R$color.luxe_color_E0E0E0;
            n4 = t70.getColor((Context)string2, n18);
            bd1_12.setTextColor(n4);
            string2 = bd1_12.getContext();
            int n19 = R$color.luxe_color_121212;
            n4 = t70.getColor((Context)string2, n19);
            bd1_12.setBackgroundColor(n4);
            bd1_12.setPadding(0, n14, 0, n14);
            view2.setVisibility(n10);
            view.setVisibility(n10);
        }
    }
}

