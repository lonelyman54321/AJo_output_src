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

/*
 * Renamed from tF1
 */
public final class tf1_0
extends RecyclerView$B
implements AjioEllipsisTextView$EllipsisListener {
    public final WA a;
    public final TextView b;
    public final TextView c;
    public final AjioEllipsisTextView d;
    public final TextView e;

    public tf1_0(View view, WA object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(object, "listener");
        super(view);
        this.a = object;
        int n3 = R$id.luxe_plp_header_row_title_tv;
        object = (TextView)view.findViewById(n3);
        this.b = object;
        n3 = R$id.luxe_plp_header_row_subtitle_tv;
        object = (TextView)view.findViewById(n3);
        this.c = object;
        n3 = R$id.luxe_plp_header_row_brand_desc_tv;
        this.d = object = (AjioEllipsisTextView)view.findViewById(n3);
        n3 = R$id.luxe_plp_header_row_desc_read_more_tv;
        view = (TextView)view.findViewById(n3);
        this.e = view;
    }

    public final void ellipsisStateChanged(boolean bl2) {
        TextView textView = this.e;
        if (bl2) {
            boolean bl3 = false;
            textView.setVisibility(0);
        } else {
            int n3 = 8;
            textView.setVisibility(n3);
        }
    }
}

