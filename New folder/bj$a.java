/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class bj$a
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;

    public bj$a(LP1 lP1, Function0 function0, boolean bl2, int n3) {
        this.c = lP1;
        this.d = function0;
        this.e = bl2;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        Function0 function0 = this.d;
        boolean bl2 = this.e;
        bj_0.c(this.c, function0, bl2, (b30_0)object, n3);
        return Unit.a;
    }
}

