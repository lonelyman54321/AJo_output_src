/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

public final class c71
extends RecyclerView$B {
    public final View a;
    public final g71_0 b;
    public final String c;
    public final AjioTextView d;
    public final AjioTextView e;
    public final AjioTextView f;
    public final RecyclerView g;
    public final View h;
    public final View i;
    public boolean j;
    public final m9 k;

    public c71(View object, g71_0 object2, String string2) {
        Intrinsics.checkNotNullParameter(object, "parentView");
        Intrinsics.checkNotNullParameter(object2, "homeComponentClickListener");
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = string2;
        int n3 = R$id.lhc_tv_closet;
        object2 = object.findViewById(n3);
        string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.d = object2 = (AjioTextView)object2;
        n3 = R$id.lhc_tv_title;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.e = object2 = (AjioTextView)object2;
        n3 = R$id.lhc_tv_count;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.f = object2 = (AjioTextView)object2;
        n3 = R$id.lhrv_crv_closet;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.g = object2 = (RecyclerView)object2;
        n3 = R$id.sale_container;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.h = object2;
        this.i = object;
        super(this, 1);
        this.k = object;
    }
}

