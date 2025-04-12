/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qJ0
 */
public final class qj0_0
extends RecyclerView$s {
    public final /* synthetic */ pj0_2 a;

    public qj0_0(pj0_2 pj0_22) {
        this.a = pj0_22;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        if (n3 == 0) {
            object = this.a;
            ((pj0_2)object).Ta();
        }
    }
}

