/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class RX2
extends Lambda
implements Function0 {
    public final /* synthetic */ KX2 c;
    public final /* synthetic */ int d;

    public RX2(KX2 kX2, int n3) {
        this.c = kX2;
        this.d = n3;
        super(0);
    }

    public final Object invoke() {
        Tl3 tl3 = this.c.f;
        int n3 = this.d;
        return tl3.f(n3);
    }
}

