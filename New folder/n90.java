/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n90
extends Lambda
implements Function2 {
    public final /* synthetic */ Sk3 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    public n90(Sk3 sk3, boolean bl2, int n3) {
        this.c = sk3;
        this.d = bl2;
        this.e = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.e | 1);
        Sk3 sk3 = this.c;
        boolean bl2 = this.d;
        o90.d(sk3, bl2, (b30_0)object, n3);
        return Unit.a;
    }
}

