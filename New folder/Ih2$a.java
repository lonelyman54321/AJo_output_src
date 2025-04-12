/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.databinding.ItemRowAjiogramProductsPdpBinding;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class Ih2$a
extends RecyclerView$s {
    public final /* synthetic */ ih2_1 a;
    public final /* synthetic */ List b;

    public Ih2$a(ih2_1 ih2_12, List list) {
        this.a = ih2_12;
        this.b = list;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        Object object2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onScrollStateChanged((RecyclerView)object, n3);
        if (n3 == 0) {
            object = this.a;
            Object object3 = ((ih2_1)object).g;
            object2 = null;
            if (object3 != null && (object3 = ((ItemRowAjiogramProductsPdpBinding)object3).rvAjiogramProducts) != null) {
                object3 = ((RecyclerView)object3).getLayoutManager();
            } else {
                n3 = 0;
                object3 = null;
            }
            boolean bl2 = object3 instanceof LinearLayoutManager;
            if (bl2) {
                object2 = object3;
                object2 = (LinearLayoutManager)object3;
            }
            n3 = object2 != null ? ((LinearLayoutManager)object2).findLastCompletelyVisibleItemPosition() : -1;
            object2 = this.b;
            ((ih2_1)object).x(n3, (List)object2);
        }
    }
}

