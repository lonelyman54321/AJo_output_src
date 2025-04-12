/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Hm
 */
public final class hm_0
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ gx0_2 e;

    public hm_0(Function2 function2, u10 u102, gx0_2 gx0_22) {
        this.c = function2;
        this.d = u102;
        this.e = gx0_22;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block18: {
            block19: {
                block15: {
                    double d2;
                    double d5;
                    float f5;
                    double d7;
                    double d9;
                    int n3;
                    Object object4;
                    Object object5;
                    int n4;
                    Object object6;
                    double d12;
                    float f6;
                    int n7;
                    Object object7;
                    int n8;
                    int n10;
                    block17: {
                        double d13;
                        double d14;
                        double d15;
                        float f7;
                        double d16;
                        double d17;
                        double d18;
                        boolean bl2;
                        block16: {
                            block14: {
                                object = (lQ2)object;
                                object2 = (b30_0)object2;
                                n10 = ((Number)(object3 = (Number)object3)).intValue();
                                n8 = n10 & 6;
                                if (n8 == 0) {
                                    n8 = (int)(object2.J(object) ? 1 : 0);
                                    n8 = n8 != 0 ? 4 : 2;
                                    n10 |= n8;
                                }
                                if ((n10 &= 0x13) != (n8 = 18) || (n10 = (int)(object2.h() ? 1 : 0)) == 0) break block14;
                                object2.D();
                                break block15;
                            }
                            object3 = Nc$a.k;
                            n8 = 0;
                            object7 = null;
                            n7 = 1065353216;
                            f6 = 1.0f;
                            d12 = 0.5;
                            object6 = this.c;
                            n4 = 48;
                            if (object6 != null) break block16;
                            int n14 = 1108907693;
                            object2.K(n14);
                            object6 = Km.c;
                            Q93.b((b30_0)object2, (LP1)object6);
                            object2.E();
                            break block17;
                        }
                        int bl22 = 1108973289;
                        object2.K(bl22);
                        object5 = Km.d;
                        object4 = iQ2.a(zp.a, (Gx$b)object3, (b30_0)object2, n4);
                        int n14 = object2.F();
                        Object object8 = object2.m();
                        object5 = a30_0.c((b30_0)object2, (LP1)object5);
                        N20.W.getClass();
                        Serializable serializable = N20$a.b;
                        mp mp2 = object2.i();
                        boolean bl3 = mp2 instanceof mp;
                        if (!bl3) break block18;
                        object2.A();
                        bl3 = object2.e();
                        if (bl3) {
                            object2.C((Function0)((Object)serializable));
                        } else {
                            object2.n();
                        }
                        serializable = N20$a.e;
                        Ow3.a((b30_0)object2, object4, (Function2)((Object)serializable));
                        object4 = N20$a.d;
                        Ow3.a((b30_0)object2, object8, (Function2)object4);
                        object4 = N20$a.f;
                        boolean bl4 = object2.e();
                        if (bl4 || !(bl2 = Intrinsics.areEqual(object8 = object2.v(), serializable = Integer.valueOf(n14)))) {
                            re0_0.a(n14, (b30_0)object2, n14, (N20$a$a)object4);
                        }
                        object4 = N20$a.c;
                        Ow3.a((b30_0)object2, object5, (Function2)object4);
                        object5 = s60_0.a;
                        object4 = w60_0.a;
                        object4 = (OX)object2.j((H30)object4);
                        long l2 = ((OX)object4).a;
                        object8 = mz_0.a;
                        object8 = (lZ)object2.j((H30)object8);
                        boolean bl5 = ((lZ)object8).i();
                        if (bl5 ? (d18 = (d17 = (d16 = (double)(f7 = zx_0.h(l2))) - d12) == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1)) > 0 : (d15 = (d14 = (d13 = (double)(f7 = zx_0.h(l2))) - d12) == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1)) < 0) {
                            n3 = 1065353216;
                            f7 = 1.0f;
                        } else {
                            n3 = 1063172178;
                            f7 = 0.87f;
                        }
                        object4 = Float.valueOf(f7);
                        object5 = ((nw0_1)object5).c(object4);
                        n3 = 8;
                        f7 = 1.1E-44f;
                        L30.a((MB2)object5, (Function2)object6, (b30_0)object2, n3);
                        object2.p();
                        object2.E();
                    }
                    object6 = j.b(LP1$a.b, f6);
                    boolean bl6 = true;
                    object = object.a((LP1)object6, f6, bl6);
                    zp$j zp$j = zp.a;
                    object3 = iQ2.a(zp$j, (Gx$b)object3, (b30_0)object2, n4);
                    n7 = object2.F();
                    object6 = object2.m();
                    object = a30_0.c((b30_0)object2, (LP1)object);
                    N20.W.getClass();
                    object5 = N20$a.b;
                    object4 = object2.i();
                    n3 = object4 instanceof mp;
                    if (n3 == 0) break block19;
                    object2.A();
                    n8 = (int)(object2.e() ? 1 : 0);
                    if (n8 != 0) {
                        object2.C((Function0)object5);
                    } else {
                        object2.n();
                    }
                    object7 = N20$a.e;
                    Ow3.a((b30_0)object2, object3, (Function2)object7);
                    object3 = N20$a.d;
                    Ow3.a((b30_0)object2, object6, (Function2)object3);
                    object3 = N20$a.f;
                    n8 = (int)(object2.e() ? 1 : 0);
                    if (n8 != 0 || (n8 = (int)(Intrinsics.areEqual(object7 = object2.v(), object6 = Integer.valueOf(n7)) ? 1 : 0)) == 0) {
                        re0_0.a(n7, (b30_0)object2, n7, (N20$a$a)object3);
                    }
                    object3 = N20$a.c;
                    Ow3.a((b30_0)object2, object, (Function2)object3);
                    object = Bt3.b;
                    object = ((At3)object2.j((H30)object)).f;
                    object7 = (u10)this.d;
                    object3 = new fm_0((u10)object7);
                    n8 = -1654084516;
                    object3 = v10.c(n8, (fx0_2)object3, (b30_0)object2);
                    Ll3.a((xm3)object, (Function2)object3, (b30_0)object2, n4);
                    object2.p();
                    object = s60_0.a;
                    object3 = w60_0.a;
                    long l3 = ((OX)object2.j((H30)object3)).a;
                    object3 = mz_0.a;
                    object3 = (lZ)object2.j((H30)object3);
                    n10 = (int)(((lZ)object3).i() ? 1 : 0);
                    if (n10 != 0 ? (n10 = (int)((d9 = (d7 = (double)(f5 = zx_0.h(l3))) - d12) == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1))) > 0 : (n10 = (int)((d5 = (d2 = (double)(f5 = zx_0.h(l3))) - d12) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1))) < 0) {
                        n10 = 1060991140;
                        f5 = 0.74f;
                    } else {
                        n10 = 1058642330;
                        f5 = 0.6f;
                    }
                    object3 = Float.valueOf(f5);
                    object = ((nw0_1)object).c(object3);
                    object7 = this.e;
                    object3 = new gm_0((gx0_2)object7);
                    object3 = v10.c(2129753671, (fx0_2)object3, (b30_0)object2);
                    n8 = 56;
                    L30.a((MB2)object, (Function2)object3, (b30_0)object2, n8);
                }
                return Unit.a;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

