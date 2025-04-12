/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Dz
 */
public final class dz_1
extends Lambda
implements gx0_2 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function2 e;

    public dz_1(boolean bl2, u10 u102, u10 u103) {
        this.c = bl2;
        this.d = u102;
        this.e = u103;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (Number)object;
        float f5 = ((Number)object).floatValue();
        object2 = (b30_0)object2;
        int n3 = ((Number)(object3 = (Number)object3)).intValue();
        int n4 = n3 & 6;
        if (n4 == 0) {
            n4 = (int)(object2.b(f5) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n3 |= n4;
        }
        if ((n3 &= 0x13) == (n4 = 18) && (n3 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            n3 = (int)(this.c ? 1 : 0);
            if (n3 != 0) {
                f5 = 1.0f;
            }
            object3 = (u10)this.d;
            u10 u102 = (u10)this.e;
            Mz.e((u10)object3, u102, f5, (b30_0)object2, 0);
        }
        return Unit.a;
    }
}

