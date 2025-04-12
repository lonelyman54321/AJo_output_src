/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.ReturnRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class Mp3
implements Function0 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ ReturnRequest b;

    public /* synthetic */ Mp3(qz1_2 qz1_22, ReturnRequest returnRequest) {
        this.a = qz1_22;
        this.b = returnRequest;
    }

    public final Object invoke() {
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        ReturnRequest returnRequest = this.b;
        Intrinsics.checkNotNullParameter(returnRequest, "$returnRequest");
        qz1_22.getClass();
        Intrinsics.checkNotNullParameter(returnRequest, "returnRequest");
        aW aW2 = md3_0.c(qz1_22);
        f02_0 f02_02 = new f02_0(qz1_22, returnRequest, null);
        Ae3.d(aW2, null, null, f02_02, 3);
        return Unit.a;
    }
}

