/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class AL$a
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public AL$a(LP1 lP1, Function1 function1, int n3) {
        this.c = lP1;
        this.d = function1;
        this.e = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.e | 1);
        LP1 lP1 = this.c;
        Function1 function1 = this.d;
        AL.a(lP1, function1, (b30_0)object, n3);
        return Unit.a;
    }
}

