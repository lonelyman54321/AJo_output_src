/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class tf3$b
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public tf3$b(LP1 lP1, Function2 function2, int n3, int n4) {
        this.c = lP1;
        this.d = function2;
        this.e = n3;
        this.f = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.e | 1);
        LP1 lP1 = this.c;
        Function2 function2 = this.d;
        int n4 = this.f;
        tf3.a(lP1, function2, (b30_0)object, n3, n4);
        return Unit.a;
    }
}

