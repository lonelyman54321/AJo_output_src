/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class O30$u
extends Lambda
implements Function2 {
    public final /* synthetic */ sg2_0 c;
    public final /* synthetic */ Xw3 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int f;

    public O30$u(sg2_0 sg2_02, Xw3 xw3, Function2 function2, int n3) {
        this.c = sg2_02;
        this.d = xw3;
        this.e = function2;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        Xw3 xw3 = this.d;
        Function2 function2 = this.e;
        O30.a(this.c, xw3, function2, (b30_0)object, n3);
        return Unit.a;
    }
}

