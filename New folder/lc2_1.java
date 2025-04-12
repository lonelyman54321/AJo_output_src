/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.ReturnRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Lc2
 */
public final class lc2_1
implements Function0 {
    public final /* synthetic */ ReturnRequest a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ Function0 c;

    public lc2_1(ReturnRequest returnRequest, qz1_2 qz1_22, Function0 function0) {
        this.a = returnRequest;
        this.b = qz1_22;
        this.c = function0;
    }

    public final Object invoke() {
        int n3;
        Object object = this.a;
        Object object2 = ((ReturnRequest)object).getExchangeOrderID();
        qz1_2 qz1_22 = this.b;
        if (object2 != null && (n3 = ((String)object2).length()) != 0) {
            boolean bl2;
            object2 = qz1_22.y;
            object = ((ReturnRequest)object).getExchangeOrderID();
            ((h83_0)object2).setValue(object);
            object = Boolean.TRUE;
            object2 = qz1_22.u;
            ((h83_0)object2).setValue(object);
            qz1_22.S = bl2 = true;
        } else {
            qz1_22.getClass();
            Intrinsics.checkNotNullParameter(object, "returnRequest");
            object2 = md3_0.c(qz1_22);
            f02_0 f02_02 = new f02_0(qz1_22, (ReturnRequest)object, null);
            int n4 = 3;
            Ae3.d((i90_0)object2, null, null, f02_02, n4);
        }
        this.c.invoke();
        return Unit.a;
    }
}

