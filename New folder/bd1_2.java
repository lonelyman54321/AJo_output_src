/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.widget.TextView
 */
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BD1
 */
public final class bd1_2
extends RecyclerView$B {
    public final TextView a;

    /*
     * WARNING - void declaration
     */
    public bd1_2(View view, String string2, boolean bl2, boolean bl3) {
        int n3;
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n4 = R$id.row_lux_brand_tv;
        view = view.findViewById(n4);
        String string3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view, string3);
        view = (TextView)view;
        this.a = view;
        if (string2 != null && (n3 = Intrinsics.areEqual(string2, string3 = "BRAND_PAGE")) != 0 && bl2) {
            void var4_6;
            string2 = view.getContext();
            n3 = QC3.a(R$color.luxe_color_202020, (Context)string2);
            view.setTextColor(n3);
            string2 = view.getContext();
            n3 = QC3.a(R$color.white, (Context)string2);
            view.setBackgroundColor(n3);
            string2 = view.getResources().getDisplayMetrics();
            int n7 = 1;
            float f5 = TypedValue.applyDimension((int)n7, (float)12.0f, (DisplayMetrics)string2);
            n3 = (int)f5;
            string3 = view.getResources().getDisplayMetrics();
            float f6 = 20.0f;
            float f7 = TypedValue.applyDimension((int)n7, (float)f6, (DisplayMetrics)string3);
            int n8 = (int)f7;
            n4 = 0;
            string3 = null;
            if (var4_6 != false) {
                view.setPadding(n8, n3, 0, n3);
            } else {
                view.setPadding(n3, n3, 0, n3);
            }
        }
    }
}

