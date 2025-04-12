/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class X80
extends Lambda
implements Function1 {
    public final /* synthetic */ Vt1 c;

    public X80(Vt1 vt1) {
        this.c = vt1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Boolean)object;
        ((Boolean)object).booleanValue();
        this.c.q.setValue(object);
        return Unit.a;
    }
}

