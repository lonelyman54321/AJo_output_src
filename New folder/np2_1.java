/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from np2
 */
public final class np2_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ np2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Boolean)object;
                Object object2 = "this$0";
                uq2_0 uq2_02 = (uq2_0)this.b;
                Intrinsics.checkNotNullParameter(uq2_02, (String)object2);
                boolean bl2 = (Boolean)object;
                if (bl2) {
                    object = WX0.SUCCESS_DIALOG_LOAD;
                    object2 = uq2_02.v;
                    if (object2 != null) {
                        n3 = ((ArrayList)object2).size();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    uq2_02.Sa((WX0)((Object)object), n3);
                    object = uq2_02.g;
                    if (object != null) {
                        ((jo_2)object).C(0);
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        op2_2 op2_22 = (op2_2)this.b;
        Intrinsics.checkNotNullParameter(op2_22, "this$0");
        op2_22.o.k(object);
        return Unit.a;
    }
}

