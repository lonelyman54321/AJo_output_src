/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pO
 */
public final class po_1
extends RecyclerView$B {
    public final j82_0 a;

    public po_1(View view, j82_0 object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "onCartClickListener");
        super(view);
        this.a = object;
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushCartInteractionsEvent("priority delivery change alert impression", "", "bag_interaction", "bag screen", "bag interactions", null);
        Intrinsics.checkNotNullParameter(view, "itemView");
        int n3 = R$id.iv_pd_close;
        view = view.findViewById(n3);
        object = new oo_1(this, 0);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

