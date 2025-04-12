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
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ee1
 */
public final class ee1_0
extends RecyclerView$B {
    public final FV2 a;
    public final LinearLayout b;
    public final LinearLayout c;

    public ee1_0(View view, FV2 fV2) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(fV2, "searchImageDelegate");
        super(view);
        this.a = fV2;
        int n3 = R$id.layout_click_photo;
        fV2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(fV2, string2);
        fV2 = (LinearLayout)fV2;
        this.b = fV2;
        n3 = R$id.layout_select_photo;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (LinearLayout)view;
        this.c = view;
    }

    public final void w() {
        Object object = new Ce1(this);
        this.b.setOnClickListener((View.OnClickListener)object);
        object = new De1(this);
        this.c.setOnClickListener((View.OnClickListener)object);
    }
}

