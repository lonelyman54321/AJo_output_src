/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from wt1
 */
public final class wt1_2
extends Lambda
implements Function2 {
    public final /* synthetic */ rt1_0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int f;

    public wt1_2(rt1_0 rt1_02, Object object, u10 u102, int n3) {
        this.c = rt1_02;
        this.d = object;
        this.e = u102;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        rt1_0 rt1_02 = this.c;
        u10 u102 = (u10)this.e;
        Object object3 = this.d;
        rt1_02.c(object3, u102, (b30_0)object, n3);
        return Unit.a;
    }
}

