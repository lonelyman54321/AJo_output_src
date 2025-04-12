/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class I50$c
extends Lambda
implements Function1 {
    public final /* synthetic */ i50_0 c;

    public I50$c(i50_0 i50_02) {
        this.c = i50_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Unit)object;
        this.c.d = true;
        return Unit.a;
    }
}

