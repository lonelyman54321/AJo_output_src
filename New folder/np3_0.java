/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.ReturnRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Np3
 */
public final class np3_0
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ ReturnRequest b;
    public final /* synthetic */ int c;

    public /* synthetic */ np3_0(qz1_2 qz1_22, ReturnRequest returnRequest, int n3) {
        this.a = qz1_22;
        this.b = returnRequest;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        ReturnRequest returnRequest = this.b;
        Intrinsics.checkNotNullParameter(returnRequest, "$returnRequest");
        int n3 = Me3.b(this.c | 1);
        op3_0.a(qz1_22, returnRequest, (b30_0)object, n3);
        return Unit.a;
    }
}

