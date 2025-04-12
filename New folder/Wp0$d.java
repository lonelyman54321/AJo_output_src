/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Wp0$d
extends Lambda
implements Function2 {
    public final /* synthetic */ fq0_0 c;
    public final /* synthetic */ int d;

    public Wp0$d(fq0_0 fq0_02, int n3) {
        this.c = fq0_02;
        this.d = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.d | 1);
        Wp0.a(this.c, (b30_0)object, n3);
        return Unit.a;
    }
}

