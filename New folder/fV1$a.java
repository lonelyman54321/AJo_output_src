/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class fV1$a
extends Lambda
implements Function0 {
    public final /* synthetic */ gv1_0 c;
    public final /* synthetic */ fV1$c d;

    public fV1$a(gv1_0 gv1_02, fV1$c fV1$c) {
        this.c = gv1_02;
        this.d = fV1$c;
        super(0);
    }

    public final Object invoke() {
        qx1 qx12 = qx1.a();
        qx12.getClass();
        qx12 = this.c.a;
        fV1$c fV1$c = this.d;
        qx12.unregisterNetworkCallback(fV1$c);
        return Unit.a;
    }
}

