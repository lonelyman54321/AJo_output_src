/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.plp.PLPExtras;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class ZU2
implements Function1 {
    public final /* synthetic */ vv2_2 a;

    public /* synthetic */ ZU2(vv2_2 vv2_22) {
        this.a = vv2_22;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        vv2_2 vv2_22 = this.a;
        Intrinsics.checkNotNullParameter(vv2_22, "this$0");
        Object object2 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n3 != 0 && (object = (PLPExtras)((DataCallback)object).getData()) != null) {
            ((PLPExtras)object).v = object2 = vv2_22.v;
            object2 = vv2_22.H;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchETVRefresh");
                n3 = 0;
                object2 = null;
            }
            ((PLPExtras)object).E = object2 = object2.getText().toString();
            if (object2 != null && (n3 = ((String)object2).length()) != 0 || (object2 = ((PLPExtras)object).l) != null && (n3 = ((String)object2).length()) != 0) {
                ((PLPExtras)object).G = object2 = Boolean.TRUE;
            }
            object2 = vv2_22.U;
            og1_1.c();
            vv2_22.bb((PLPExtras)object, (String)object2);
        }
        return Unit.a;
    }
}

