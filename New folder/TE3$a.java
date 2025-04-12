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
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;
import kotlin.jvm.internal.Intrinsics;

public final class TE3$a {
    public final TextView a;
    public final ImageView b;
    public final AjioTextView c;
    public final PesdkLoyaltyCardInfoView d;
    public final TextView e;
    public int f;

    public TE3$a(te3_2 te3_22, View object) {
        Intrinsics.checkNotNullParameter(object, "item");
        int n3 = R$id.tv_wallet;
        View view = object.findViewById(n3);
        Object object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        view = (TextView)view;
        this.a = view;
        n3 = R$id.img_wallet;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        view = (ImageView)view;
        this.b = view;
        n3 = R$id.pf_container;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        view = (TextView)view;
        this.e = view;
        int n4 = R$id.proceed_btn_txt;
        this.c = object2 = (AjioTextView)object.findViewById(n4);
        int n7 = R$id.layout_loyaltyCardInfo;
        object = (PesdkLoyaltyCardInfoView)object.findViewById(n7);
        this.d = object;
        int n8 = 8;
        view.setVisibility(n8);
        if (object2 != null) {
            super(te3_22, this);
            object2.setOnClickListener((View.OnClickListener)object);
        }
    }
}

