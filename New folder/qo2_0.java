/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 */
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qo2
 */
public final class qo2_0
extends RecyclerView$B {
    public final g82_0 a;
    public final Typeface b;
    public final Typeface c;
    public final int d;
    public final int e;
    public final View f;
    public final ImageView[] g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;

    public qo2_0(View view, if0_0 if0_02, Typeface typeface, Typeface imageViewArray) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = if0_02;
        this.b = typeface;
        this.c = imageViewArray;
        int n3 = hv3_0.F();
        int n4 = mz3_0.d(18);
        n3 -= n4;
        n4 = 5;
        this.d = n3 /= n4;
        int n7 = R$id.row_order_payment_layout_click;
        imageViewArray = view.findViewById(n7);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(imageViewArray, string2);
        this.f = imageViewArray;
        imageViewArray = new ImageView[n4];
        this.g = imageViewArray;
        int n8 = R$id.row_order_payment_tv_info;
        Object object = view.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.h = object;
        n8 = R$id.row_order_payment_tv_orderTotal;
        object = view.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.i = object;
        n8 = R$id.row_order_payment_tv_status;
        object = view.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.j = object;
        n8 = R$id.row_order_payment_tv_more;
        object = view.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.k = object;
        this.e = n3 = (int)((float)n3 * 1.2380953f);
        n3 = R$id.row_order_payment_imv_one;
        if0_02 = view.findViewById(n3);
        string2 = null;
        imageViewArray[0] = if0_02;
        n3 = R$id.row_order_payment_imv_two;
        if0_02 = view.findViewById(n3);
        imageViewArray[1] = if0_02;
        n3 = R$id.row_order_payment_imv_three;
        if0_02 = view.findViewById(n3);
        imageViewArray[2] = if0_02;
        n3 = R$id.row_order_payment_imv_four;
        if0_02 = view.findViewById(n3);
        n8 = 3;
        imageViewArray[n8] = if0_02;
        n3 = R$id.row_order_payment_imv_five;
        view = view.findViewById(n3);
        n3 = 4;
        imageViewArray[n3] = view;
        for (int i3 = 0; i3 < n4; ++i3) {
            view = imageViewArray[i3];
            Intrinsics.checkNotNull(view);
            if0_02 = view.getLayoutParams();
            object = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams";
            Intrinsics.checkNotNull(if0_02, (String)object);
            if0_02 = (RelativeLayout.LayoutParams)if0_02;
            ((RelativeLayout.LayoutParams)if0_02).height = n8 = this.e;
            ((RelativeLayout.LayoutParams)if0_02).width = n8 = this.d;
            view.setLayoutParams((ViewGroup.LayoutParams)if0_02);
        }
    }
}

