/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class O83$a
extends Lambda
implements Function1 {
    public final /* synthetic */ pr1_1 c;

    public O83$a(pr1_1 pr1_12) {
        this.c = pr1_12;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2 = object instanceof qb3_0;
        if (bl2) {
            Object object2 = object;
            object2 = (qb3_0)object;
            int n3 = 4;
            ((qb3_0)object2).v(n3);
        }
        this.c.d(object);
        return Unit.a;
    }
}

