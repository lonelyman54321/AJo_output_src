/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Ls1$b
extends Lambda
implements Function2 {
    public final /* synthetic */ Ls1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;

    public Ls1$b(Ls1 ls1, int n3, Object object, int n4) {
        this.c = ls1;
        this.d = n3;
        this.e = object;
        this.f = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        int n4 = this.d;
        Object object3 = this.e;
        this.c.d(n4, object3, (b30_0)object, n3);
        return Unit.a;
    }
}

