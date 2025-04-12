/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.CheckBox
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jt
 */
public final class jt_0
extends RecyclerView$B {
    public static final /* synthetic */ int h;
    public final m82_0 a;
    public final o82_0 b;
    public final CheckBox c;
    public final AjioTextView d;
    public final AjioTextView e;
    public final ImageView f;
    public final LinearLayout g;

    public jt_0(View view, m82_0 object, o82_0 object2) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(object, "onClickCouponListener");
        Intrinsics.checkNotNullParameter(object2, "onClickListener");
        super(view);
        this.a = object;
        this.b = object2;
        int n3 = R$id.avl_checkbox;
        object = view.findViewById(n3);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (CheckBox)object;
        this.c = object;
        n3 = R$id.avl_coupon_point;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.d = object = (AjioTextView)object;
        n3 = R$id.avl_coupon_description;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.e = object = (AjioTextView)object;
        n3 = R$id.avl_coupon_image;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ImageView)object;
        this.f = object;
        int n4 = R$id.ll_data;
        view = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        view = (LinearLayout)view;
        this.g = view;
        int n7 = hv3_0.F();
        int n8 = mz3_0.d(12);
        n7 = (n7 - n8) / 2;
        n8 = (int)((float)n7 * 0.85714287f);
        ViewGroup.LayoutParams layoutParams = object.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        layoutParams = (FrameLayout.LayoutParams)layoutParams;
        layoutParams.height = n8;
        layoutParams.width = n7;
        object.setLayoutParams(layoutParams);
    }
}

