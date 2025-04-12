/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tS1
 */
public final class ts1_2
extends RecyclerView$B {
    public final m82_0 a;
    public final ImageView b;
    public final AjioTextView c;
    public final AjioTextView d;
    public final FrameLayout e;
    public final LinearLayout f;

    public ts1_2(View view, m82_0 m82_02) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(m82_02, "onClickCouponListener");
        super(view);
        this.a = m82_02;
        int n3 = R$id.mycoupon_img;
        m82_02 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(m82_02, string2);
        m82_02 = (ImageView)m82_02;
        this.b = m82_02;
        int n4 = R$id.mycoupon_code;
        Object object = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioTextView)object;
        this.c = object;
        n4 = R$id.mycoupon_description;
        object = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioTextView)object;
        this.d = object;
        n4 = R$id.ll_coupon_used;
        object = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (FrameLayout)object;
        this.e = object;
        n4 = R$id.ll_mycoupon_data;
        view = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (LinearLayout)view;
        this.f = view;
        int n7 = hv3_0.F();
        int n8 = mz3_0.d(12);
        n7 = (n7 - n8) / 2;
        n8 = (int)((float)n7 * 0.85714287f);
        object = m82_02.getLayoutParams();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        object = (FrameLayout.LayoutParams)object;
        object.height = n8;
        object.width = n7;
        m82_02.setLayoutParams((ViewGroup.LayoutParams)object);
    }
}

