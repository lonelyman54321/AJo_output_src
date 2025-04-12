/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class N11$a
extends Lambda
implements Function1 {
    public final /* synthetic */ n11_0 c;

    public N11$a(n11_0 n11_02) {
        this.c = n11_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Uz3)object;
        Object object2 = this.c;
        ((n11_0)object2).g((Uz3)object);
        object2 = ((n11_0)object2).i;
        if (object2 != null) {
            object2.invoke(object);
        }
        return Unit.a;
    }
}

