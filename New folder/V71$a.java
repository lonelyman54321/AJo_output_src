/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class V71$a
extends RecyclerView$s {
    public final /* synthetic */ v71_0 a;

    public V71$a(v71_0 v71_02) {
        this.a = v71_02;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        Object object2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onScrollStateChanged((RecyclerView)object, n3);
        if (n3 == 0) {
            object = this.a;
            object.getClass();
            c80 c802 = d.a(ir0_2.a);
            object2 = new w71_0((v71_0)object, null);
            int n4 = 3;
            Ae3.d(c802, null, null, (Function2)object2, n4);
        }
    }
}

