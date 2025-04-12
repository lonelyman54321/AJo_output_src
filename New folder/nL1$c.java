/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class nL1$c
extends Lambda
implements Function2 {
    public final /* synthetic */ nl1_0 c;
    public final /* synthetic */ int d;

    public nL1$c(nl1_0 nl1_02, int n3) {
        this.c = nl1_02;
        this.d = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.d | 1);
        this.c.c((b30_0)object, n3);
        return Unit.a;
    }
}

