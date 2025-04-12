/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import kotlin.jvm.internal.Intrinsics;

public final class p71$a
extends RecyclerView$s {
    public final /* synthetic */ p71_0 a;

    public p71$a(p71_0 p71_02) {
        this.a = p71_02;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onScrollStateChanged((RecyclerView)object, n3);
        if (n3 == 0) {
            object = this.a;
            ((p71_0)object).w();
        }
    }
}

