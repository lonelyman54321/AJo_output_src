/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class JF2
extends Lambda
implements Function1 {
    public final /* synthetic */ k80 c;

    public JF2(k80 k802) {
        this.c = k802;
        super(1);
    }

    public final Object invoke(Object object) {
        this.c.b(object);
        return Unit.a;
    }
}

