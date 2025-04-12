/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class o90$d
extends Lambda
implements Function2 {
    public final /* synthetic */ Sk3 c;
    public final /* synthetic */ int d;

    public o90$d(Sk3 sk3, int n3) {
        this.c = sk3;
        this.d = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.d | 1);
        o90.c(this.c, (b30_0)object, n3);
        return Unit.a;
    }
}

