/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

public final class Cy0$a
extends RecyclerView$B {
    public final TextView a;
    public final ImageView b;
    public final LinearLayout c;
    public final TextView d;
    public final RelativeLayout e;
    public final AjioTextView f;
    public final AjioTextView g;

    public Cy0$a(cy0_1 cy0_12, View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.item_bank_name;
        View view2 = view.findViewById(n3);
        Object object = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (TextView)view2;
        this.a = view2;
        n3 = R$id.item_bank_img;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (ImageView)view2;
        this.b = view2;
        n3 = R$id.emi_proceed_button;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (LinearLayout)view2;
        this.c = view2;
        int n4 = R$id.emi_proceed_button_tv;
        View view3 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object);
        view3 = (TextView)view3;
        this.d = view3;
        int n7 = R$id.emi_text_row;
        object = (RelativeLayout)view.findViewById(n7);
        this.e = object;
        n7 = R$id.emi_not_available;
        this.f = object = (AjioTextView)view.findViewById(n7);
        n7 = R$id.emi_message;
        this.g = object = (AjioTextView)view.findViewById(n7);
        object = new by0_1(cy0_12, view);
        view2.setOnClickListener((View.OnClickListener)object);
    }
}

