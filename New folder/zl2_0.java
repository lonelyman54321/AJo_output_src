/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZL2
 */
public final class zl2_0 {
    public static final void a(String string2, ax1_0 ax1_02, u10 u102, b30_0 b30_02, int n3) {
        block17: {
            Object object;
            Object object2;
            int n4;
            u10 u103;
            ax1_0 ax1_03;
            Object object3;
            block16: {
                int n7;
                float f5;
                int n8;
                int n10;
                block15: {
                    object3 = string2;
                    ax1_03 = ax1_02;
                    u103 = u102;
                    n4 = n3;
                    Intrinsics.checkNotNullParameter(string2, "title");
                    Intrinsics.checkNotNullParameter(ax1_02, "onBackClick");
                    Intrinsics.checkNotNullParameter(u102, "content");
                    int n14 = 649297041;
                    object2 = b30_02;
                    object = b30_02.g(n14);
                    n10 = n3 & 0xE;
                    if (n10 == 0) {
                        n10 = (int)(((j30_0)object).J(string2) ? 1 : 0);
                        n10 = n10 != 0 ? 4 : 2;
                        n10 |= n4;
                    } else {
                        n10 = n3;
                    }
                    n8 = n4 & 0x70;
                    if (n8 == 0) {
                        n8 = (int)(((j30_0)object).x(ax1_03) ? 1 : 0);
                        if (n8 != 0) {
                            n8 = 32;
                            f5 = 4.5E-44f;
                        } else {
                            n8 = 16;
                            f5 = 2.2E-44f;
                        }
                        n10 |= n8;
                    }
                    if ((n8 = n4 & 0x380) == 0) {
                        n8 = (int)(((j30_0)object).x(u103) ? 1 : 0);
                        if (n8 != 0) {
                            n8 = 256;
                            f5 = 3.59E-43f;
                        } else {
                            n8 = 128;
                            f5 = 1.8E-43f;
                        }
                        n10 |= n8;
                    }
                    n7 = n10;
                    n8 = 146;
                    f5 = 2.05E-43f;
                    if ((n10 &= 0x2DB) != n8 || (n10 = (int)(((j30_0)object).h() ? 1 : 0)) == 0) break block15;
                    ((j30_0)object).D();
                    break block16;
                }
                object2 = LP1$a.b;
                Object object4 = j.c;
                long l2 = OX.f;
                fG2$a fG2$a = fg2_1.a;
                object4 = a.b((LP1)object4, l2, fG2$a);
                Object object5 = zp.c;
                Gx$a gx$a = Nc$a.m;
                boolean bl2 = false;
                float f6 = 0.0f;
                object5 = oZ.a((zp$l)object5, gx$a, (b30_0)object, 0);
                int n15 = ((j30_0)object).P;
                Object object6 = ((j30_0)object).P();
                object4 = a30_0.c((b30_0)object, (LP1)object4);
                N20.W.getClass();
                Object object7 = N20$a.b;
                Object object8 = ((j30_0)object).a;
                boolean bl3 = object8 instanceof mp;
                if (!bl3) break block17;
                ((j30_0)object).A();
                bl3 = ((j30_0)object).O;
                if (bl3) {
                    ((j30_0)object).C((Function0)object7);
                } else {
                    ((j30_0)object).n();
                }
                object7 = N20$a.e;
                Ow3.a((b30_0)object, object5, (Function2)object7);
                object5 = N20$a.d;
                Ow3.a((b30_0)object, object6, (Function2)object5);
                object5 = N20$a.f;
                bl2 = ((j30_0)object).O;
                if (bl2 || !(bl2 = Intrinsics.areEqual(object6 = ((j30_0)object).v(), object7 = Integer.valueOf(n15)))) {
                    rk_0.a(n15, (j30_0)object, n15, (N20$a$a)object5);
                }
                object5 = N20$a.c;
                Ow3.a((b30_0)object, object4, (Function2)object5);
                sz_0 sz_02 = sz_0.a;
                object2 = j.c((LP1)object2, 1.0f);
                f5 = uq0_0.B;
                object2 = j.d((LP1)object2, f5);
                f6 = uq0_0.e;
                object4 = new yl2_0(ax1_03, (String)object3);
                int n16 = 1332431722;
                object7 = v10.c(n16, (fx0_2)object4, (b30_0)object);
                l2 = 0L;
                bl3 = false;
                int n17 = 1769526;
                int n18 = 28;
                object4 = fG2$a;
                fG2$a = null;
                object8 = object;
                object3 = sz_02;
                JL.a((LP1)object2, (i13)object4, l2, null, f6, (u10)object7, (b30_0)object, n17, n18);
                n10 = n7 >> 3 & 0x70;
                n8 = 6;
                f5 = 8.4E-45f;
                object2 = n10 |= n8;
                u103.invoke(sz_02, object, object2);
                boolean bl4 = true;
                ((j30_0)object).T(bl4);
            }
            object3 = ((j30_0)object).X();
            if (object3 != null) {
                object2 = string2;
                ((CF2)object3).d = object = new xl2_1(string2, ax1_03, u103, n4);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

