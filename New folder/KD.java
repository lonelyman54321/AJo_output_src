/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class KD
extends Lambda
implements Function1 {
    public final /* synthetic */ LD c;
    public final /* synthetic */ G60$a d;

    public KD(LD lD, G60$a g60$a) {
        this.c = lD;
        this.d = g60$a;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = this.c.a;
        G60$a g60$a = this.d;
        ((WR1)object).m(g60$a);
        return Unit.a;
    }
}

