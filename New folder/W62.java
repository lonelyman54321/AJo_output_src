/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Cart.CartPromotionClick;
import kotlin.jvm.internal.Intrinsics;

public final class W62
extends RecyclerView$B
implements View.OnClickListener {
    public final j82_0 a;
    public final String b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Group g;

    public W62(View view, j82_0 j82_02, String string2) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        this.a = j82_02;
        this.b = string2;
        int n3 = R$id.applied_label;
        j82_02 = view.findViewById(n3);
        string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(j82_02, string2);
        j82_02 = (TextView)j82_02;
        this.c = j82_02;
        n3 = R$id.voucher_text;
        j82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(j82_02, string2);
        j82_02 = (TextView)j82_02;
        this.d = j82_02;
        n3 = R$id.coupon_code;
        j82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(j82_02, string2);
        j82_02 = (TextView)j82_02;
        this.e = j82_02;
        n3 = R$id.link_clicked;
        j82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(j82_02, string2);
        j82_02 = (TextView)j82_02;
        this.f = j82_02;
        int n4 = R$id.coupon_group;
        view = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (Group)view;
        this.g = view;
        j82_02.setOnClickListener(this);
    }

    public final void onClick(View object) {
        Object object2 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.link_clicked;
        if (n3 == n4 && (n3 = (object2 = object.getTag()) instanceof CartPromotionClick) != 0 && (object2 = this.a) != null) {
            object = object.getTag();
            String string2 = "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartPromotionClick";
            Intrinsics.checkNotNull(object, string2);
            object = (CartPromotionClick)object;
            object2.Z((CartPromotionClick)object);
        }
    }
}

