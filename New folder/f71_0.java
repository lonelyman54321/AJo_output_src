/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from f71
 */
public final class f71_0
extends RecyclerView$B {
    public final View a;
    public final mf1_0 b;
    public final AjioTextView c;

    public f71_0(View object, mf1_0 mf1_02) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        this.a = object;
        this.b = mf1_02;
        int n3 = R$id.luxe_footer_title_tv;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (AjioTextView)object;
        this.c = object;
    }
}

