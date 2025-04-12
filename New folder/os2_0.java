/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from OS2
 */
public final class os2_0
extends Lambda
implements gx0_2 {
    public final /* synthetic */ zr1_0 c;
    public final /* synthetic */ lg3_0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ gx0_2 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ gx0_2 m;
    public final /* synthetic */ VS2 n;

    public os2_0(zr1_0 zr1_02, oO0 oO02, long l2, long l3, boolean bl2, int n3, Function2 function2, u10 u102, Function2 function22, Function2 function23, gx0_2 gx0_22, VS2 vS2) {
        this.c = zr1_02;
        this.d = oO02;
        this.e = l2;
        this.f = l3;
        this.g = bl2;
        this.h = n3;
        this.i = function2;
        this.j = u102;
        this.k = function22;
        this.l = function23;
        this.m = gx0_22;
        this.n = vS2;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        os2_0 os2_02 = this;
        Object object4 = object;
        object4 = (LP1)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        int n4 = n3 & 6;
        if (n4 == 0) {
            n4 = (int)(object5.J(object4) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n3 |= n4;
        }
        if ((n3 &= 0x13) == (n4 = 18) && (n3 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            Object object7;
            object6 = os2_02.c;
            n4 = (int)(object5.J(object6) ? 1 : 0);
            Object object8 = os2_02.d;
            int n7 = object5.J(object8);
            Object object9 = object5.v();
            if ((n4 |= n7) != 0 || object9 == (object7 = b30$a.a)) {
                object8 = (oO0)object8;
                object9 = new LS2((zr1_0)object6, (oO0)object8);
                object5.o(object9);
            }
            object9 = (Function1)object9;
            object6 = dh3_0.a;
            object6 = ji1.a;
            object7 = new eh3_0((Function1)object9);
            object6 = a30_0.a((LP1)object4, (Function1)object6, (gx0_2)object7);
            object7 = os2_02.n;
            Object object10 = object8 = os2_02.j;
            object10 = (u10)object8;
            int n8 = os2_02.g;
            int n10 = os2_02.h;
            Function2 function2 = os2_02.i;
            object8 = os2_02.k;
            object9 = os2_02.c;
            Function2 function22 = os2_02.l;
            gx0_2 gx0_22 = os2_02.m;
            object4 = new ns2_0(n8 != 0, n10, function2, (u10)object10, (Function2)object8, (zr1_0)object9, function22, gx0_22, (VS2)object7);
            u10 u102 = v10.c(1772955108, (fx0_2)object4, (b30_0)object5);
            int n14 = 0x180000;
            n8 = 50;
            n4 = 0;
            object7 = null;
            long l2 = os2_02.e;
            long l3 = os2_02.f;
            jg3_0.a((LP1)object6, null, l2, l3, null, 0.0f, u102, (b30_0)object5, n14, n8);
        }
        return Unit.a;
    }
}

