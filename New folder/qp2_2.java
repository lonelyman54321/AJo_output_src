/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qp2
 */
public final class qp2_2
implements Function2 {
    public final /* synthetic */ xp2_2 a;

    public /* synthetic */ qp2_2(xp2_2 xp2_22) {
        this.a = xp2_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (RecyclerView)object;
        object2 = (tt2_2)object2;
        xp2_2 xp2_22 = this.a;
        Intrinsics.checkNotNullParameter(xp2_22, "this$0");
        Intrinsics.checkNotNullParameter(object, "list");
        Intrinsics.checkNotNullParameter(object2, "scrollHolder");
        e00 e002 = xp2_22.E;
        if (e002 != null) {
            e002.p((RecyclerView)object, (tt2_2)object2);
            object = Unit.a;
        } else {
            object = null;
        }
        return object;
    }
}

