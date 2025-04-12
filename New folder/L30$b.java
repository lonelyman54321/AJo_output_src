/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class L30$b
extends Lambda
implements Function2 {
    public final /* synthetic */ MB2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;

    public L30$b(MB2 mB2, Function2 function2, int n3) {
        this.c = mB2;
        this.d = function2;
        this.e = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.e | 1);
        MB2 mB2 = this.c;
        Function2 function2 = this.d;
        L30.a(mB2, function2, (b30_0)object, n3);
        return Unit.a;
    }
}

