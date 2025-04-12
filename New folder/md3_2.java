/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Md3
 */
public final class md3_2
extends RecyclerView$s {
    public final /* synthetic */ ld3_1 a;

    public md3_2(ld3_1 ld3_12) {
        this.a = ld3_12;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        if (n3 == 0) {
            object = this.a;
            ((ld3_1)object).Wa();
        }
    }
}

