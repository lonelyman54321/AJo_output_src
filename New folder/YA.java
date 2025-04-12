/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioEllipsisTextView;
import com.ril.ajio.customviews.widgets.AjioEllipsisTextView$EllipsisListener;
import kotlin.jvm.internal.Intrinsics;

public final class YA
extends RecyclerView$B
implements AjioEllipsisTextView$EllipsisListener {
    public final WA a;
    public final AjioEllipsisTextView b;
    public final TextView c;

    public YA(View view, WA object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(object, "listener");
        super(view);
        this.a = object;
        int n3 = R$id.plp_brand_desc_row_tv;
        this.b = object = (AjioEllipsisTextView)view.findViewById(n3);
        n3 = R$id.plp_desc_read_more_tv;
        view = (TextView)view.findViewById(n3);
        this.c = view;
    }

    public final void ellipsisStateChanged(boolean bl2) {
        TextView textView = this.c;
        if (bl2) {
            boolean bl3 = false;
            textView.setVisibility(0);
        } else {
            int n3 = 8;
            textView.setVisibility(n3);
        }
    }
}

