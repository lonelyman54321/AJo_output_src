/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class ft1$d
extends Lambda
implements Function1 {
    public final /* synthetic */ ft1_2 c;
    public final /* synthetic */ int d;

    public ft1$d(ft1_2 ft1_22, int n3) {
        this.c = ft1_22;
        this.d = n3;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (mu1_0)object;
        at1_0 at1_02 = this.c.a;
        v83_0 v83_02 = v83$a.a();
        Function1 function1 = v83_02 != null ? v83_02.f() : null;
        v83_0 v83_03 = v83$a.b(v83_02);
        v83$a.e(v83_02, v83_03, function1);
        int n3 = this.d;
        at1_02.a((mu1_0)object, n3);
        return Unit.a;
    }
}

