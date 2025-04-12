/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.ajiocash.transform.AjioWalletTransform;
import kotlin.jvm.internal.Intrinsics;

public final class i0
extends RecyclerView$B {
    public static final /* synthetic */ int A;
    public final d0_0 a;
    public final mq3_0 b;
    public final View c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final View h;
    public final TextView i;
    public final View j;
    public final View k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final ImageView q;
    public final View r;
    public final ImageView s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final View w;
    public final TextView x;
    public final View y;
    public final View z;

    public i0(View view, d0_0 d0_02, mq3_0 object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(d0_02, "ajioCashListener");
        Intrinsics.checkNotNullParameter(object, "bankTransferClickListener");
        super(view);
        this.a = d0_02;
        this.b = object;
        int n3 = R$id.aw_info_cash;
        d0_02 = view.findViewById(n3);
        object = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(d0_02, (String)object);
        this.c = d0_02;
        int n4 = R$id.aw_cash_iv;
        View view2 = d0_02.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (ImageView)view2;
        this.d = view2;
        n4 = R$id.aw_cash_tv;
        view2 = d0_02.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (TextView)view2;
        this.e = view2;
        n4 = R$id.aw_info_tv;
        view2 = d0_02.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (TextView)view2;
        this.f = view2;
        n4 = R$id.aw_amount;
        view2 = d0_02.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (TextView)view2;
        this.g = view2;
        n4 = R$id.aw_point_bg;
        view2 = d0_02.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        this.h = view2;
        n4 = R$id.aw_point_amt;
        view2 = d0_02.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (TextView)view2;
        this.i = view2;
        n4 = R$id.aw_transferable_cash_card_view;
        view2 = d0_02.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        this.j = view2;
        int n7 = R$id.aw_non_transferable_cash_card_view;
        d0_02 = d0_02.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(d0_02, (String)object);
        this.k = d0_02;
        n7 = R$id.aw_transferable_cash_tv;
        View view3 = view2.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object);
        view3 = (TextView)view3;
        this.l = view3;
        n7 = R$id.aw_transferable_cash_balance_tv;
        view3 = view2.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object);
        view3 = (TextView)view3;
        this.m = view3;
        n7 = R$id.aw_transferable_cash_tv;
        view3 = d0_02.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object);
        view3 = (TextView)view3;
        this.n = view3;
        n7 = R$id.aw_transferable_cash_balance_tv;
        d0_02 = d0_02.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(d0_02, (String)object);
        d0_02 = (TextView)d0_02;
        this.o = d0_02;
        n3 = R$id.aw_transfer_bank_tv;
        d0_02 = view2.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(d0_02, (String)object);
        d0_02 = (TextView)d0_02;
        this.p = d0_02;
        n3 = R$id.aw_forward;
        d0_02 = view2.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(d0_02, (String)object);
        d0_02 = (ImageView)d0_02;
        this.q = d0_02;
        n3 = R$id.aw_info_point;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, (String)object);
        this.r = view;
        n3 = R$id.aw_cash_iv;
        d0_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(d0_02, (String)object);
        d0_02 = (ImageView)d0_02;
        this.s = d0_02;
        n3 = R$id.aw_cash_tv;
        d0_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(d0_02, (String)object);
        d0_02 = (TextView)d0_02;
        this.t = d0_02;
        n3 = R$id.aw_info_tv;
        d0_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(d0_02, (String)object);
        d0_02 = (TextView)d0_02;
        this.u = d0_02;
        n3 = R$id.aw_amount;
        d0_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(d0_02, (String)object);
        d0_02 = (TextView)d0_02;
        this.v = d0_02;
        n3 = R$id.aw_point_bg;
        d0_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(d0_02, (String)object);
        this.w = d0_02;
        n3 = R$id.aw_point_amt;
        d0_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(d0_02, (String)object);
        d0_02 = (TextView)d0_02;
        this.x = d0_02;
        n3 = R$id.aw_transferable_cash_card_view;
        d0_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(d0_02, (String)object);
        this.y = d0_02;
        n3 = R$id.aw_non_transferable_cash_card_view;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, (String)object);
        this.z = view;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void w(AjioWalletTransform object) {
        Object object2 = hv3_0.K(R$string.cash_transferable_text);
        this.l.setText((CharSequence)object2);
        object2 = qz2_0.x(Float.valueOf(((AjioWalletTransform)object).getTransferableCash()));
        TextView textView = this.m;
        textView.setText((CharSequence)object2);
        float f5 = ((AjioWalletTransform)object).getTransferableCash();
        float f6 = 1.0f;
        ImageView imageView = this.q;
        TextView textView2 = this.p;
        float f7 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
        if (f7 > 0) {
            object2 = h40_0.a;
            f7 = (float)h40_0.j1();
            if (f7 != false) {
                f7 = 0.0f;
                f5 = 0.0f;
                textView2.setVisibility(0);
                imageView.setVisibility(0);
                object2 = new g0(this, (AjioWalletTransform)object);
                textView2.setOnClickListener((View.OnClickListener)object2);
                return;
            }
        }
        int n3 = 4;
        textView2.setVisibility(n3);
        imageView.setVisibility(n3);
        object = new Object();
        textView2.setOnClickListener((View.OnClickListener)object);
    }
}

