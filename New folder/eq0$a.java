/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class eq0$a
extends Lambda
implements Function2 {
    public final /* synthetic */ eq0_0 c;
    public final /* synthetic */ int d;

    public eq0$a(eq0_0 eq0_02, int n3) {
        this.c = eq0_02;
        this.d = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.d | 1);
        this.c.a((b30_0)object, n3);
        return Unit.a;
    }
}

