/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class DU0$b
extends Lambda
implements Function1 {
    public final /* synthetic */ wr1_1 c;
    public final /* synthetic */ kj1 d;

    public DU0$b(wr1_1 wr1_12, kj1 kj12) {
        this.c = wr1_12;
        this.d = kj12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = this.c;
        kj1 kj12 = this.d;
        object.c(kj12);
        return Unit.a;
    }
}

