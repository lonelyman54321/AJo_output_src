/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.RelativeLayout
 */
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

public final class P43$a
extends RecyclerView$B {
    public final AjioTextView a;
    public final AjioTextView b;
    public final RelativeLayout c;
    public final RelativeLayout d;
    public final RelativeLayout e;
    public final /* synthetic */ p43_0 f;

    public P43$a(p43_0 object, View object2) {
        Intrinsics.checkNotNullParameter(object2, "rootView");
        this.f = object;
        super((View)object2);
        object = this.itemView;
        int n3 = R$id.sizeTv;
        object = object.findViewById(n3);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.a = object = (AjioTextView)object;
        object = this.itemView;
        int n4 = R$id.sizeTv_unselected;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.b = object = (AjioTextView)object;
        object = this.itemView;
        n4 = R$id.similar_to_size_item_container_rl;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (RelativeLayout)object;
        this.c = object;
        object = this.itemView;
        n4 = R$id.selected_view_rl;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (RelativeLayout)object;
        this.d = object;
        object = this.itemView;
        n4 = R$id.unselected_view_rl;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (RelativeLayout)object;
        this.e = object;
    }
}

