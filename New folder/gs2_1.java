/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gs2
 */
public final class gs2_1 {
    public static final void a(String string2, Function0 function0, b30_0 b30_02, int n3) {
        block19: {
            block20: {
                Object object;
                int n4;
                Object object2;
                Object object3;
                String string3;
                block18: {
                    Object object4;
                    Object object5;
                    boolean bl2;
                    int n7;
                    int n8;
                    Object object6;
                    int n10;
                    block17: {
                        string3 = string2;
                        object3 = function0;
                        n10 = n3;
                        Intrinsics.checkNotNullParameter(string2, "name");
                        Intrinsics.checkNotNullParameter(function0, "onClick");
                        int n14 = -426500965;
                        object6 = b30_02;
                        object2 = b30_02.g(n14);
                        n4 = n3 & 0xE;
                        if (n4 == 0) {
                            n4 = (int)(((j30_0)object2).J(string2) ? 1 : 0);
                            n4 = n4 != 0 ? 4 : 2;
                            n4 |= n10;
                        } else {
                            n4 = n3;
                        }
                        n8 = n10 & 0x70;
                        if (n8 == 0) {
                            n8 = (int)(((j30_0)object2).x(object3) ? 1 : 0);
                            n8 = n8 != 0 ? 32 : 16;
                            n4 |= n8;
                        }
                        n7 = n4;
                        n8 = 18;
                        if ((n4 &= 0x5B) != n8 || (n4 = (int)(((j30_0)object2).h() ? 1 : 0)) == 0) break block17;
                        ((j30_0)object2).D();
                        break block18;
                    }
                    object6 = "feed_pinned.json";
                    Intrinsics.checkNotNullParameter(object6, "assetName");
                    Object object7 = new fC1$a((String)object6);
                    n4 = 6;
                    ec1_0 ec1_02 = sI2.c((fc1_0)object7, (b30_0)object2, n4);
                    object6 = (QB1)ec1_02.getValue();
                    int n15 = 1067450368;
                    int n16 = -1 >>> 1;
                    n8 = 0;
                    Object object8 = object2;
                    object6 = nk_0.a((QB1)object6, false, 1.25f, n16, (b30_0)object2, 926);
                    object7 = LP1$a.b;
                    float f5 = uq0_0.F;
                    Object object9 = j.k((LP1)object7, f5);
                    Object object10 = Nc$a.n;
                    object8 = zp.d;
                    int n17 = 54;
                    object10 = oZ.a((zp$l)object8, (Gx$a)object10, (b30_0)object2, n17);
                    int n18 = ((j30_0)object2).P;
                    Object object11 = ((j30_0)object2).P();
                    object9 = a30_0.c((b30_0)object2, (LP1)object9);
                    N20.W.getClass();
                    Xp1$a xp1$a = N20$a.b;
                    mp mp2 = ((j30_0)object2).a;
                    boolean bl3 = mp2 instanceof mp;
                    if (!bl3) break block19;
                    ((j30_0)object2).A();
                    bl3 = ((j30_0)object2).O;
                    if (bl3) {
                        ((j30_0)object2).C(xp1$a);
                    } else {
                        ((j30_0)object2).n();
                    }
                    N20$a$b n20$a$b = N20$a.e;
                    Ow3.a((b30_0)object2, object10, n20$a$b);
                    object10 = N20$a.d;
                    Ow3.a((b30_0)object2, object11, (Function2)object10);
                    object11 = N20$a.f;
                    int n19 = ((j30_0)object2).O;
                    if (n19 != 0 || !(bl2 = Intrinsics.areEqual(object5 = ((j30_0)object2).v(), object4 = Integer.valueOf(n18)))) {
                        rk_0.a(n18, (j30_0)object2, n18, (N20$a$a)object11);
                    }
                    object8 = N20$a.c;
                    Ow3.a((b30_0)object2, object9, (Function2)object8);
                    f5 = uq0_0.E;
                    object7 = j.h((LP1)object7, f5);
                    f5 = 7.096394E-12f;
                    ((j30_0)object2).K(754560674);
                    n15 = n7 & 0x70;
                    n19 = 32;
                    if (n15 == n19) {
                        n15 = 1;
                        f5 = Float.MIN_VALUE;
                    } else {
                        n15 = 0;
                        f5 = 0.0f;
                        object9 = null;
                    }
                    object5 = ((j30_0)object2).v();
                    object4 = b30$a.a;
                    if (n15 != 0 || object5 == object4) {
                        n15 = 0;
                        f5 = 0.0f;
                        object9 = null;
                        object5 = new es2_1((Function0)object3, 0);
                        ((j30_0)object2).o(object5);
                    }
                    object5 = (Function0)object5;
                    n15 = 0;
                    f5 = 0.0f;
                    ((j30_0)object2).T(false);
                    int n20 = 7;
                    n10 = 0;
                    object3 = d.b((LP1)object7, false, null, (Function0)object5, n20);
                    object = HA.e(Nc$a.e, false);
                    n8 = ((j30_0)object2).P;
                    object9 = ((j30_0)object2).P();
                    object3 = a30_0.c((b30_0)object2, (LP1)object3);
                    boolean bl4 = mp2 instanceof mp;
                    if (!bl4) break block20;
                    ((j30_0)object2).A();
                    bl4 = ((j30_0)object2).O;
                    if (bl4) {
                        ((j30_0)object2).C(xp1$a);
                    } else {
                        ((j30_0)object2).n();
                    }
                    Ow3.a((b30_0)object2, object, n20$a$b);
                    Ow3.a((b30_0)object2, object9, (Function2)object10);
                    n10 = (int)(((j30_0)object2).O ? 1 : 0);
                    if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object = ((j30_0)object2).v(), object9 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                        rk_0.a(n8, (j30_0)object2, n8, (N20$a$a)object11);
                    }
                    Ow3.a((b30_0)object2, object3, (Function2)object8);
                    object3 = (QB1)ec1_02.getValue();
                    ((j30_0)object2).K(-1202023163);
                    n10 = (int)(((j30_0)object2).J(object6) ? 1 : 0);
                    object7 = ((j30_0)object2).v();
                    if (n10 != 0 || object7 == object4) {
                        n10 = 1;
                        object7 = new eu1_2(object6, n10);
                        ((j30_0)object2).o(object7);
                    }
                    object7 = (Function0)object7;
                    object = null;
                    ((j30_0)object2).T(false);
                    object9 = j.c;
                    int n21 = 392;
                    n16 = 0;
                    object10 = null;
                    n18 = 0;
                    object8 = null;
                    n17 = 0;
                    object11 = null;
                    bl2 = false;
                    object4 = null;
                    ec1_02 = null;
                    xp1$a = null;
                    bl4 = false;
                    mp2 = null;
                    bl3 = false;
                    n20$a$b = null;
                    n19 = 0;
                    object5 = null;
                    n10 = 1;
                    int n22 = 131064;
                    object6 = object3;
                    HB1.b((QB1)object3, (Function0)object7, (LP1)object9, false, false, false, false, null, false, null, null, null, false, false, null, null, false, (b30_0)object2, n21, 0, n22);
                    ((j30_0)object2).T(n10 != 0);
                    n20 = n7 & 0xE;
                    ed3_0.a(string3, (b30_0)object2, n20);
                    ((j30_0)object2).T(n10 != 0);
                }
                object3 = ((j30_0)object2).X();
                if (object3 != null) {
                    object2 = function0;
                    n4 = n3;
                    object = new fs2_2(string3, function0, n3);
                    ((CF2)object3).d = object;
                }
                return;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

