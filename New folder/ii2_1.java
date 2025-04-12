/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ii2
 */
public final class ii2_1
extends RecyclerView$s {
    public final /* synthetic */ ji2_1 a;

    public ii2_1(ji2_1 ji2_12) {
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
}

