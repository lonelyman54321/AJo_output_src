/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.d;

public final class a32
extends RecyclerView$s {
    public mb3_2 a;
    public final long b;
    public final /* synthetic */ b32 c;

    public a32(b32 b322) {
        this.c = b322;
        this.b = 100;
    }

    public final void onScrolled(RecyclerView object, int n3, int n4) {
        Object object2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onScrolled((RecyclerView)object, n3, n4);
        Object object3 = this.a;
        n4 = 0;
        if (object3 != null) {
            ((JobSupport)object3).d(null);
        }
        object3 = ir0_2.a;
        object3 = d.a(bg1_1.a);
        b32 b322 = this.c;
        object2 = new a32$a(this, (RecyclerView)object, b322, null);
        this.a = object = Ae3.d((i90_0)object3, null, null, (Function2)object2, 3);
    }
}

