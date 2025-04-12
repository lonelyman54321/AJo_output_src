/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v53
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;

    public v53(LP1 lP1, u10 u102, int n3) {
        this.c = lP1;
        this.d = u102;
        this.e = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.e | 1);
        u10 u102 = (u10)this.d;
        w53.a(this.c, u102, (b30_0)object, n3);
        return Unit.a;
    }
}

