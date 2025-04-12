/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from fS2
 */
public final class fs2_0
extends Lambda
implements Function2 {
    public final /* synthetic */ cs2_1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int f;

    public fs2_0(cs2_1 cs2_12, Object object, u10 u102, int n3) {
        this.c = cs2_12;
        this.d = object;
        this.e = u102;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        cs2_1 cs2_12 = this.c;
        u10 u102 = (u10)this.e;
        Object object3 = this.d;
        cs2_12.c(object3, u102, (b30_0)object, n3);
        return Unit.a;
    }
}

