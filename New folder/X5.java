/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class X5
extends RecyclerView$B {
    public final ja2_1 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final View h;
    public final ImageView i;

    public X5(View view, ja2_1 ja2_12) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(ja2_12, "orderClickListener");
        super(view);
        this.a = ja2_12;
        int n3 = R$id.nt_header;
        ja2_12 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(ja2_12, string2);
        ja2_12 = (TextView)ja2_12;
        this.b = ja2_12;
        n3 = R$id.nt_order_id;
        ja2_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ja2_12, string2);
        ja2_12 = (TextView)ja2_12;
        this.c = ja2_12;
        n3 = R$id.nt_date_info_1;
        ja2_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ja2_12, string2);
        ja2_12 = (TextView)ja2_12;
        this.d = ja2_12;
        n3 = R$id.nt_date_info_2;
        ja2_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ja2_12, string2);
        ja2_12 = (TextView)ja2_12;
        this.e = ja2_12;
        n3 = R$id.nt_amnt;
        ja2_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ja2_12, string2);
        ja2_12 = (TextView)ja2_12;
        this.f = ja2_12;
        n3 = R$id.nt_referral_tv;
        ja2_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ja2_12, string2);
        ja2_12 = (TextView)ja2_12;
        this.g = ja2_12;
        n3 = R$id.nt_faded_layer;
        ja2_12 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ja2_12, string2);
        this.h = ja2_12;
        n3 = R$id.nt_IV;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (ImageView)view;
        this.i = view;
    }
}

