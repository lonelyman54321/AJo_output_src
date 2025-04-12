/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ai2$b
extends RecyclerView$s {
    public final /* synthetic */ ai2_2 a;
    public final /* synthetic */ ArrayList b;

    public ai2$b(ai2_2 ai2_22, ArrayList arrayList) {
        this.a = ai2_22;
        this.b = arrayList;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        if (n3 == 0) {
            object = this.a;
            ArrayList arrayList = this.b;
            ((ai2_2)object).x(arrayList);
        }
    }
}

