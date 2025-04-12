/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.analytics.events.PlpListViewEvents;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

public final class kG1$b
extends RecyclerView$s {
    public final /* synthetic */ kG1 a;
    public final /* synthetic */ Product b;

    public kG1$b(kG1 kG12, Product product) {
        this.a = kG12;
        this.b = product;
    }

    public final void onScrolled(RecyclerView recyclerView, int n3, int n4) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(recyclerView, string2);
        super.onScrolled(recyclerView, n3, n4);
        int n7 = ig2_2.a(recyclerView);
        n3 = -1;
        if (n7 != n3) {
            kG1 kG12 = this.a;
            n4 = kG12.B;
            if (n4 != n7) {
                PlpListViewEvents plpListViewEvents = PlpListViewEvents.Companion.getInstance();
                int n8 = kG12.B;
                Product product = this.b;
                plpListViewEvents.logImageInteractEvents(n7, n8, product);
                kG12.B = n7;
            }
        }
    }
}

