/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import kotlin.jvm.internal.Intrinsics;

public final class Ji2$a
extends RecyclerView$s {
    public final /* synthetic */ ji2_1 a;

    public Ji2$a(ji2_1 ji2_12) {
        this.a = ji2_12;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onScrollStateChanged((RecyclerView)object, n3);
        if (n3 == 0) {
            object = this.a;
            ji2_1.w((ji2_1)object);
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int n3, int n4) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, n3, n4);
    }
}

