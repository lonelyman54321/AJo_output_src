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
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class j12
extends RecyclerView$B {
    public final ShimmerFrameLayout a;
    public final TextView b;

    public j12(View view) {
        ShimmerFrameLayout shimmerFrameLayout;
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.plp_row_shimmer_view;
        this.a = shimmerFrameLayout = (ShimmerFrameLayout)view.findViewById(n3);
        n3 = R$id.plp_row_quality_msg_tv;
        view = (TextView)view.findViewById(n3);
        this.b = view;
    }

    public final void w(boolean bl2) {
        String string2 = null;
        int n3 = 8;
        ShimmerFrameLayout shimmerFrameLayout = this.a;
        TextView textView = this.b;
        if (bl2) {
            shimmerFrameLayout.setVisibility(n3);
            textView.setVisibility(0);
            Object object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            string2 = "revamp_cart_qa_text";
            object = ((ao0_0)object).b(string2);
            textView.setText((CharSequence)object);
        } else {
            shimmerFrameLayout.setVisibility(0);
            textView.setVisibility(n3);
        }
    }
}

