/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Hk$b$c
extends Lambda
implements Function1 {
    public final /* synthetic */ Hk c;

    public Hk$b$c(Hk hk) {
        this.c = hk;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2;
        nr1_1 nr1_12 = this.c.d;
        if ((object = (ib3_0)nr1_12.b(object)) != null) {
            object = (bj1)object.getValue();
            l2 = ((bj1)object).a;
        } else {
            l2 = 0L;
        }
        object = new bj1(l2);
        return object;
    }
}

