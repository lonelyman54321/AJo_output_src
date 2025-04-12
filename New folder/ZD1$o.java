/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class ZD1$o
extends Lambda
implements Function0 {
    public final /* synthetic */ rq1_2 c;

    public ZD1$o(rq1_2 rq1_22) {
        this.c = rq1_22;
        super(0);
    }

    public final Object invoke() {
        return ((sD3)this.c.getValue()).getViewModelStore();
    }
}

