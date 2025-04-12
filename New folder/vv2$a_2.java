/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.d;

/*
 * Renamed from vv2$a
 */
public final class vv2$a_2
extends RecyclerView$s {
    public mb3_2 a;
    public final long b;
    public final /* synthetic */ vv2_1 c;

    public vv2$a_2(vv2_1 vv2_12) {
        this.c = vv2_12;
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
        vv2_1 vv2_12 = this.c;
        object2 = new vv2$a$a_0(this, (RecyclerView)object, vv2_12, null);
        this.a = object = Ae3.d((i90_0)object3, null, null, (Function2)object2, 3);
    }
}

