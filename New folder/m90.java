/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m90
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ Sk3 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int f;

    public m90(LP1 lP1, Sk3 sk3, u10 u102, int n3) {
        this.c = lP1;
        this.d = sk3;
        this.e = u102;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        LP1 lP1 = this.c;
        u10 u102 = (u10)this.e;
        Sk3 sk3 = this.d;
        o90.b(lP1, sk3, u102, (b30_0)object, n3);
        return Unit.a;
    }
}

