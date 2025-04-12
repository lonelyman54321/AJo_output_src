/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class kj$a
extends Lambda
implements Function0 {
    public final /* synthetic */ ZD c;
    public final /* synthetic */ long d;

    public kj$a(ZD zD, long l2) {
        this.c = zD;
        this.d = l2;
        super(0);
    }

    public final Object invoke() {
        Z03 z03 = (Z03)this.c;
        long l2 = this.d;
        return z03.b(l2);
    }
}

