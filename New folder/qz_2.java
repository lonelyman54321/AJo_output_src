/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QZ
 */
public final class qz_2
implements Function1 {
    public final /* synthetic */ e00 a;

    public /* synthetic */ qz_2(e00 e002) {
        this.a = e002;
    }

    public final Object invoke(Object object) {
        object = (Integer)object;
        e00 e002 = this.a;
        Intrinsics.checkNotNullParameter(e002, "this$0");
        Object object2 = e002.o;
        e00$a e00$a = e00$a.PDP;
        if (object2 == e00$a) {
            object = e002.v;
            if (object != null) {
                ((RecyclerView$f)object).notifyDataSetChanged();
            }
        } else {
            object2 = e002.v;
            if (object2 != null) {
                Intrinsics.checkNotNull(object);
                int n3 = (Integer)object;
                ((RecyclerView$f)object2).notifyItemChanged(n3);
            }
        }
        return Unit.a;
    }
}

