/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from TS1
 */
public final class ts1_0
extends Lambda
implements Function2 {
    public final /* synthetic */ bs2_1 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;

    public ts1_0(bs2_1 bs2_12, u10 u102, int n3) {
        this.c = bs2_12;
        this.d = u102;
        this.e = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.e | 1);
        u10 u102 = (u10)this.d;
        US1.b(this.c, u102, (b30_0)object, n3);
        return Unit.a;
    }
}

