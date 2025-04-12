/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from SS1
 */
public final class ss1_0
extends Lambda
implements Function2 {
    public final /* synthetic */ d c;
    public final /* synthetic */ bs2_1 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int f;

    public ss1_0(d d2, bs2_1 bs2_12, u10 u102, int n3) {
        this.c = d2;
        this.d = bs2_12;
        this.e = u102;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        d d2 = this.c;
        u10 u102 = (u10)this.e;
        bs2_1 bs2_12 = this.d;
        US1.a(d2, bs2_12, u102, (b30_0)object, n3);
        return Unit.a;
    }
}

