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
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pW
 */
public final class pw_0
extends RecyclerView$B {
    public final r82_0 a;
    public final g71_0 b;
    public final View c;
    public final View d;
    public final ImageView e;
    public final AjioTextView f;
    public final AjioTextView g;
    public final AjioTextView h;
    public final AjioTextView i;
    public final AjioTextView j;
    public final TextView k;
    public final View l;
    public final View m;

    public pw_0(View object, r82_0 r82_02, g71_0 object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super((View)object);
        this.a = r82_02;
        this.b = object2;
        int n3 = R$id.lhcciMainLayout;
        r82_02 = object.findViewById(n3);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(r82_02, (String)object2);
        this.c = r82_02;
        int n4 = R$id.lhcciPriceLayout;
        Object object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        this.d = object3;
        n4 = R$id.lhcciIvImage;
        object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (ImageView)object3;
        this.e = object3;
        n4 = R$id.lhcciTvPriceDropValue;
        object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (AjioTextView)object3;
        this.f = object3;
        n4 = R$id.lhcciTvBrand;
        object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (AjioTextView)object3;
        this.g = object3;
        n4 = R$id.lhcciTvName;
        object3 = (AjioTextView)object.findViewById(n4);
        this.h = object3;
        n4 = R$id.lhcciTvNewPrice;
        object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (AjioTextView)object3;
        this.i = object3;
        n4 = R$id.lhcciTvWasPrice;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (AjioTextView)object;
        this.j = object;
        object = this.itemView;
        int n7 = R$id.oosTv;
        object = (TextView)object.findViewById(n7);
        this.k = object;
        object = this.itemView;
        n7 = R$id.oosBg;
        this.l = object = object.findViewById(n7);
        object = this.itemView;
        n7 = R$id.sale_container;
        this.m = object = object.findViewById(n7);
        super(this, 0);
        r82_02.setOnClickListener((View.OnClickListener)object);
    }
}

