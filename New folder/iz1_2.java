/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iZ1
 */
public final class iz1_2
extends t32_0 {
    public iz1_2(View view, c92 c922, oq2_0 object, yi2_1 yi2_12, boolean bl2, boolean bl3, vb2_1 vb2_12, boolean bl4) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(c922, "onSizeClickListener");
        Intrinsics.checkNotNullParameter(object, "rowWidthCallBack");
        String string2 = "pdpInfoProvider";
        Intrinsics.checkNotNullParameter(yi2_12, string2);
        super(view, c922, (oq2_0)object, yi2_12, bl2, bl3, vb2_12, bl4);
        int n3 = R$id.row_pdp_fixed_size_layout;
        c922 = view.findViewById(n3);
        Intrinsics.checkNotNull(c922, "null cannot be cast to non-null type android.widget.LinearLayout");
        c922 = (LinearLayout)c922;
        this.g = c922;
        n3 = R$id.row_pdp_fixed_size_tv;
        c922 = view.findViewById(n3);
        object = "null cannot be cast to non-null type android.widget.TextView";
        Intrinsics.checkNotNull(c922, (String)object);
        c922 = (TextView)c922;
        this.f = c922;
        n3 = R$id.similar_to_iv;
        c922 = view.findViewById(n3);
        boolean bl5 = c922 instanceof ImageView;
        yi2_12 = null;
        if (bl5) {
            c922 = (ImageView)c922;
        } else {
            n3 = 0;
            c922 = null;
        }
        this.h = c922;
        n3 = R$id.strike_iv;
        view = view.findViewById(n3);
        n3 = view instanceof ImageView;
        if (n3 != 0) {
            yi2_12 = view;
            yi2_12 = (ImageView)view;
        }
        this.i = yi2_12;
    }
}

