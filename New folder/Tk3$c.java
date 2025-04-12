/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Tk3$c
extends Lambda
implements Function2 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ uk2_0 d;
    public final /* synthetic */ Sk3 e;
    public final /* synthetic */ int f;

    public Tk3$c(boolean bl2, uk2_0 uk2_02, Sk3 sk3, int n3) {
        this.c = bl2;
        this.d = uk2_02;
        this.e = sk3;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        uk2_0 uk2_02 = this.d;
        Sk3 sk3 = this.e;
        Tk3.a(this.c, uk2_02, sk3, (b30_0)object, n3);
        return Unit.a;
    }
}

