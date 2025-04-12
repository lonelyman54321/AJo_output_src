/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class Xi2$b
extends RecyclerView$s {
    public final /* synthetic */ xi2_1 a;
    public final /* synthetic */ ArrayList b;

    public Xi2$b(xi2_1 xi2_12, ArrayList arrayList) {
        this.a = xi2_12;
        this.b = arrayList;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        if (n3 == 0) {
            object = this.a;
            ArrayList arrayList = this.b;
            ((xi2_1)object).w(arrayList);
        }
    }
}

