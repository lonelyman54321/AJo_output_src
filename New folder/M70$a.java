/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class M70$a
extends Lambda
implements Function2 {
    public final /* synthetic */ M70 c;
    public final /* synthetic */ E70 d;
    public final /* synthetic */ int e;

    public M70$a(M70 m70, E70 e70, int n3) {
        this.c = m70;
        this.d = e70;
        this.e = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.e | 1);
        M70 m70 = this.c;
        E70 e70 = this.d;
        m70.a(e70, (b30_0)object, n3);
        return Unit.a;
    }
}

