/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from NS2
 */
public final class ns2_0
extends Lambda
implements Function2 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ gx0_2 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ zr1_0 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ gx0_2 j;
    public final /* synthetic */ VS2 k;

    public ns2_0(boolean bl2, int n3, Function2 function2, u10 u102, Function2 function22, zr1_0 zr1_02, Function2 function23, gx0_2 gx0_22, VS2 vS2) {
        this.c = bl2;
        this.d = n3;
        this.e = function2;
        this.f = u102;
        this.g = function22;
        this.h = zr1_02;
        this.i = function23;
        this.j = gx0_22;
        this.k = vS2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object2 = this.j;
            VS2 vS2 = this.k;
            object = new ms2_0((gx0_2)object2, vS2);
            n3 = 433906483;
            u10 u102 = v10.c(n3, (fx0_2)object, (b30_0)object3);
            int n7 = 24576;
            Object object4 = object = this.f;
            object4 = (u10)object;
            boolean bl2 = this.c;
            int n8 = this.d;
            Function2 function2 = this.e;
            Function2 function22 = this.g;
            zr1_0 zr1_02 = this.h;
            Function2 function23 = this.i;
            HS2.c(bl2, n8, function2, (u10)object4, u102, function22, zr1_02, function23, (b30_0)object3, n7);
        }
        return Unit.a;
    }
}

