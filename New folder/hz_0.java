/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Hz
 */
public final class hz_0
extends Lambda
implements Function2 {
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;

    public hz_0(u10 u102, u10 u103, float f5, int n3) {
        this.c = u102;
        this.d = u103;
        this.e = f5;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        u10 u102 = (u10)this.c;
        u10 u103 = (u10)this.d;
        float f5 = this.e;
        Mz.e(u102, u103, f5, (b30_0)object, n3);
        return Unit.a;
    }
}

