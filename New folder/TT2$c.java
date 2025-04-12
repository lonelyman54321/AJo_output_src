/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

public final class TT2$c
extends RecyclerView$s {
    public final /* synthetic */ tt2_2 a;
    public final /* synthetic */ TT2$b b;

    public TT2$c(tt2_2 tt2_22, TT2$b tT2$b) {
        this.a = tt2_22;
        this.b = tT2$b;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        Object object2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onScrollStateChanged((RecyclerView)object, n3);
        if (n3 == 0) {
            boolean bl2;
            Object object3 = this.a;
            object3.getClass();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = this.b;
            Object object4 = "scrollKeyProvider";
            Intrinsics.checkNotNullParameter(object2, (String)object4);
            object2 = object2.k();
            if (object2 != null && (bl2 = (object4 = ((tt2_2)object3).b).contains(object2)) && (object = ((RecyclerView)object).getLayoutManager()) != null) {
                if ((object = ((RecyclerView$o)object).onSaveInstanceState()) != null) {
                    object3 = ((tt2_2)object3).a;
                    ((HashMap)object3).put(object2, object);
                }
                object4.remove(object2);
            }
        }
    }

    public final void onScrolled(RecyclerView object, int n3, int n4) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onScrolled((RecyclerView)object, n3, n4);
        object = this.b.k();
        if (object != null && n3 != 0) {
            LinkedHashSet linkedHashSet = this.a.b;
            linkedHashSet.add(object);
        }
    }
}

