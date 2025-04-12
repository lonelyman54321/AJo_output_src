/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VN2
 */
public final class vn2_1
extends vw_0 {
    public final HN2 a;
    public final LinearLayout b;

    public vn2_1(View view, HN2 hN2) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        this.a = hN2;
        view = this.itemView;
        int n3 = R$id.main_layout;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (LinearLayout)view;
        this.b = view;
    }

    public final void w(Object object, Object object2) {
        object = new un2_0(this, 0);
        this.b.setOnClickListener((View.OnClickListener)object);
    }
}

