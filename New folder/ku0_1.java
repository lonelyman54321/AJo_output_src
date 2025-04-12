/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ku0
 */
public final class ku0_1
extends Lambda
implements gx0_2 {
    public final /* synthetic */ yu0_0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ i90_0 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ i13 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ float j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ gx0_2 l;

    public ku0_1(yu0_0 yu0_02, boolean bl2, c80 c802, long l2, i13 i132, long l3, long l4, float f5, u10 u102, gx0_2 gx0_22) {
        this.c = yu0_02;
        this.d = bl2;
        this.e = c802;
        this.f = l2;
        this.g = i132;
        this.h = l3;
        this.i = l4;
        this.j = f5;
        this.k = u102;
        this.l = gx0_22;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4;
        block20: {
            block21: {
                block25: {
                    block19: {
                        float f5;
                        Object object5;
                        long l2;
                        int n3;
                        Object object6;
                        Object object7;
                        Object object8;
                        LP1 lP1;
                        float f6;
                        boolean bl2;
                        pg2_0 pg2_02;
                        Object object9;
                        b30$a$a b30$a$a;
                        Object object10;
                        yu0_0 yu0_02;
                        Object object11;
                        float f7;
                        int n7;
                        float f8;
                        int n8;
                        int n10;
                        Object object12;
                        Object object13;
                        Object object14;
                        float f11;
                        boolean n14;
                        ku0_1 ku0_12;
                        block23: {
                            int n4;
                            block24: {
                                long l3;
                                block22: {
                                    block18: {
                                        ku0_12 = this;
                                        n14 = false;
                                        f11 = 0.0f;
                                        object4 = null;
                                        object14 = object;
                                        object14 = (PA)object;
                                        object13 = object2;
                                        object13 = (b30_0)object2;
                                        object12 = object3;
                                        object12 = (Number)object3;
                                        n10 = ((Number)object12).intValue();
                                        n8 = n10 & 6;
                                        if (n8 == 0) {
                                            n8 = (int)(object13.J(object14) ? 1 : 0);
                                            if (n8 != 0) {
                                                n8 = 4;
                                                f8 = 5.6E-45f;
                                            } else {
                                                n8 = 2;
                                                f8 = 2.8E-45f;
                                            }
                                            n10 |= n8;
                                        }
                                        n8 = 18;
                                        f8 = 2.5E-44f;
                                        if ((n10 &= 0x13) != n8 || (n10 = (int)(object13.h() ? 1 : 0)) == 0) break block18;
                                        object13.D();
                                        break block19;
                                    }
                                    l3 = object14.b();
                                    n7 = c60.e(l3);
                                    if (n7 == 0) break block20;
                                    n7 = c60.i(l3);
                                    f7 = -((float)n7);
                                    object11 = O30.f;
                                    object12 = (Vo0)object13.j((H30)object11);
                                    yu0_02 = ku0_12.c;
                                    n8 = (int)(object13.J(yu0_02) ? 1 : 0);
                                    int n42 = object13.J(object12);
                                    n8 |= n42;
                                    int n15 = object13.b(f7);
                                    object10 = object13.v();
                                    b30$a$a = b30$a.a;
                                    if ((n8 |= n15) != 0 || object10 == b30$a$a) {
                                        object10 = new bu0_2(yu0_02, (Vo0)object12, f7);
                                        object13.o(object10);
                                    }
                                    object10 = (Function0)object10;
                                    object12 = ly0_0.a;
                                    object13.q((Function0)object10);
                                    object12 = O30.l;
                                    object12 = object13.j((H30)object12);
                                    object9 = bp1_0.Rtl;
                                    boolean bl3 = object12 == object9;
                                    object12 = yu0_02.a;
                                    pg2_02 = pg2_0.Horizontal;
                                    object9 = ((Re)object12).l.getValue();
                                    bl2 = object9 != null;
                                    object9 = new Ce((Re)object12, null);
                                    Zs0$a zs0$a = Zs0.a;
                                    n4 = ku0_12.d;
                                    f6 = 0.0f;
                                    object12 = ((Re)object12).f;
                                    Object object15 = lP1;
                                    object8 = object12;
                                    lP1 = new DraggableElement((at0)object12, pg2_02, n4 != 0, null, bl2, zs0$a, (gx0_2)object9, bl3);
                                    object12 = Nc$a.a;
                                    object9 = HA.e((Nc)object12, false);
                                    n4 = object13.F();
                                    object7 = object13.m();
                                    lP1 = a30_0.c((b30_0)object13, lP1);
                                    object15 = N20.W;
                                    object15.getClass();
                                    object10 = N20$a.b;
                                    object6 = object13.i();
                                    n3 = object6 instanceof mp;
                                    if (n3 == 0) break block21;
                                    object13.A();
                                    n3 = object13.e();
                                    if (n3 != 0) {
                                        object13.C((Function0)object10);
                                    } else {
                                        object13.n();
                                    }
                                    object6 = N20$a.e;
                                    Ow3.a((b30_0)object13, object9, (Function2)object6);
                                    object9 = N20$a.d;
                                    Ow3.a((b30_0)object13, object7, (Function2)object9);
                                    object7 = N20$a.f;
                                    boolean bl4 = object13.e();
                                    if (bl4) break block22;
                                    object4 = object13.v();
                                    l2 = l3;
                                    object5 = n4;
                                    n14 = Intrinsics.areEqual(object4, object5);
                                    if (n14) break block23;
                                    break block24;
                                }
                                l2 = l3;
                            }
                            re0_0.a(n4, (b30_0)object13, n4, (N20$a$a)object7);
                        }
                        object4 = N20$a.c;
                        Ow3.a((b30_0)object13, lP1, (Function2)object4);
                        object5 = LP1$a.b;
                        lP1 = null;
                        object12 = HA.e((Nc)object12, false);
                        int n16 = object13.F();
                        Object object16 = object13.m();
                        Object object17 = a30_0.c((b30_0)object13, (LP1)object5);
                        object3 = object5;
                        object5 = object13.i();
                        boolean bl5 = object5 instanceof mp;
                        if (!bl5) break block25;
                        object13.A();
                        bl5 = object13.e();
                        if (bl5) {
                            object13.C((Function0)object10);
                        } else {
                            object13.n();
                        }
                        Ow3.a((b30_0)object13, object12, (Function2)object6);
                        Ow3.a((b30_0)object13, object16, (Function2)object9);
                        n10 = (int)(object13.e() ? 1 : 0);
                        if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object12 = object13.v(), object9 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
                            re0_0.a(n16, (b30_0)object13, n16, (N20$a$a)object7);
                        }
                        Ow3.a((b30_0)object13, object17, (Function2)object4);
                        n14 = false;
                        f11 = 0.0f;
                        object12 = 0;
                        ku0_12.k.invoke(object13, object12);
                        object13.p();
                        object4 = (zu0_0)((Object)yu0_02.a.g.getValue());
                        object12 = zu0_0.Open;
                        if (object4 == object12) {
                            n10 = 1;
                            f5 = Float.MIN_VALUE;
                        } else {
                            n10 = 0;
                            f5 = 0.0f;
                            object12 = null;
                        }
                        n14 = ku0_12.d;
                        n8 = (int)(object13.a(n14) ? 1 : 0);
                        int n17 = object13.J(yu0_02);
                        n8 |= n17;
                        object5 = ku0_12.e;
                        int n18 = object13.x(object5);
                        object10 = object13.v();
                        if ((n8 |= n18) != 0 || object10 == b30$a$a) {
                            object9 = object5;
                            object9 = (c80)object5;
                            object10 = new du0_0(n14, yu0_02, (c80)object9);
                            object13.o(object10);
                        }
                        object9 = object10;
                        object9 = (Function0)object10;
                        n14 = object13.b(f7);
                        boolean bl6 = object13.J(yu0_02);
                        object10 = object13.v();
                        if ((n14 |= bl6) || object10 == b30$a$a) {
                            object10 = new eu0_0(f7, yu0_02);
                            object13.o(object10);
                        }
                        object10 = (Function0)object10;
                        object7 = null;
                        long l3 = ku0_12.f;
                        object16 = object13;
                        Tu0.b(n10 != 0, (Function0)object9, (Function0)object10, l3, (b30_0)object13, 0);
                        n14 = false;
                        object14 = Me3.a((b30_0)object13, 0);
                        object4 = (Vo0)object13.j((H30)object11);
                        n10 = c60.k(l2);
                        f5 = object4.D0(n10);
                        n8 = c60.j(l2);
                        f8 = object4.D0(n8);
                        int n19 = c60.i(l2);
                        float f12 = object4.D0(n19);
                        n3 = c60.h(l2);
                        f11 = object4.D0(n3);
                        object6 = object3;
                        object4 = androidx.compose.foundation.layout.j.j((LP1)object3, f5, f8, f12, f11);
                        n10 = (int)(object13.J(yu0_02) ? 1 : 0);
                        object9 = object13.v();
                        if (n10 != 0 || object9 == b30$a$a) {
                            n10 = 0;
                            f5 = 0.0f;
                            object12 = null;
                            object9 = new fu0_0(yu0_02, 0);
                            object13.o(object9);
                        }
                        object9 = (Function1)object9;
                        object8 = androidx.compose.foundation.layout.g.b((LP1)object4, (Function1)object9);
                        f6 = Tu0.a;
                        pg2_02 = null;
                        int n20 = 11;
                        bl2 = false;
                        object4 = androidx.compose.foundation.layout.h.i((LP1)object8, 0.0f, 0.0f, f6, 0.0f, n20);
                        n10 = (int)(object13.J(object14) ? 1 : 0);
                        n8 = (int)(object13.J(yu0_02) ? 1 : 0);
                        n10 |= n8;
                        n8 = (int)(object13.x(object5) ? 1 : 0);
                        object9 = object13.v();
                        if ((n10 |= n8) != 0 || object9 == b30$a$a) {
                            object5 = (c80)object5;
                            object9 = new iu0_1((String)object14, yu0_02, (c80)object5);
                            object13.o(object9);
                        }
                        object9 = (Function1)object9;
                        object12 = CY2.b((LP1)object4, false, (Function1)object9);
                        object14 = ku0_12.l;
                        object4 = new ju0_2((gx0_2)object14);
                        n7 = -1941234439;
                        f7 = -1.564727E-31f;
                        object17 = v10.c(n7, (fx0_2)object4, (b30_0)object13);
                        int n21 = 0x180000;
                        int n22 = 16;
                        object9 = ku0_12.g;
                        long l4 = ku0_12.h;
                        long l7 = ku0_12.i;
                        object7 = null;
                        float f14 = ku0_12.j;
                        object11 = object13;
                        jg3_0.a((LP1)object12, (i13)object9, l4, l7, null, f14, (u10)object17, (b30_0)object13, n21, n22);
                        object13.p();
                    }
                    return Unit.a;
                }
                s20.a();
                throw null;
            }
            s20.a();
            throw null;
        }
        object4 = new IllegalStateException("Drawer shouldn't have infinite width");
        throw object4;
    }
}

