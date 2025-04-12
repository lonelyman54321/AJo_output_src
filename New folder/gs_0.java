/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.g;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GS
 */
public final class gs_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gs_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        object = (DataCallback)object;
        switch (n3) {
            default: {
                g g3 = (g)this.b;
                Intrinsics.checkNotNullParameter(g3, "this$0");
                Intrinsics.checkNotNullParameter(object, "uiListCallback");
                Object object2 = cp_1.Companion;
                int n4 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n4 != 0 && (n4 = ((DataCallback)object).getStatus()) == 0 && (object = (ArrayList)((DataCallback)object).getData()) != null && (object2 = g3.c) != null) {
                    op2_2 op2_22 = g3.Va();
                    object2.s8((ArrayList)object, g3, op2_22);
                }
                return Unit.a;
            }
            case 0: 
        }
        ps_0 ps_02 = (ps_0)this.b;
        Intrinsics.checkNotNullParameter(ps_02, "this$0");
        ps_02.b.k(object);
        return Unit.a;
    }
}

