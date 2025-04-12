/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.layout.a;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.StringsKt;

/*
 * Renamed from nL1
 */
public final class nl1_0
implements Zw$b,
sp0_0 {
    public Hp1 a;
    public final Z50 b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final eb3_2 f;
    public final int[] g;
    public final int[] h;
    public float i;
    public final ArrayList j;

    public nl1_0(Vo0 arrayList) {
        Object object;
        super(0, 0);
        Object object2 = new ArrayList();
        ((tf3_0)object).x0 = object2;
        ((Z50)object).y0 = object2 = new Zw((Z50)object);
        ((Z50)object).z0 = object2 = new cp0((Z50)object);
        ((Z50)object).B0 = null;
        ((Z50)object).C0 = false;
        qr_0[] qr_0Array = new Eu1();
        ((Z50)object).D0 = qr_0Array;
        ((Z50)object).G0 = 0;
        ((Z50)object).H0 = 0;
        int n3 = 4;
        qr_0[] qr_0Array2 = new qr_0[n3];
        ((Z50)object).I0 = qr_0Array2;
        qr_0Array = new qr_0[n3];
        ((Z50)object).J0 = qr_0Array;
        ((Z50)object).K0 = 257;
        ((Z50)object).L0 = false;
        ((Z50)object).M0 = false;
        ((Z50)object).N0 = null;
        ((Z50)object).O0 = null;
        ((Z50)object).P0 = null;
        ((Z50)object).Q0 = null;
        Object object3 = new HashSet();
        ((Z50)object).R0 = object3;
        ((Z50)object).S0 = object3 = new Object();
        ((Z50)object).B0 = this;
        ((Z50)object).z0.f = this;
        this.b = object;
        object = new LinkedHashMap();
        this.c = object;
        object = new LinkedHashMap();
        this.d = object;
        object = new LinkedHashMap();
        this.e = object;
        this.f = object = new eb3_2((Vo0)((Object)arrayList));
        int n4 = 2;
        object = new int[n4];
        this.g = (int[])object;
        arrayList = (ArrayList)new int[n4];
        this.h = (int[])arrayList;
        this.i = 0.0f / 0.0f;
        this.j = arrayList = new ArrayList();
    }

    public static xm3 e(HashMap hashMap) {
        long l2;
        int n3;
        Object object = hashMap;
        String string2 = (String)hashMap.get("size");
        long l3 = Dm3.c;
        if (string2 != null) {
            float f5 = Float.parseFloat(string2);
            l3 = Em3.i(0x100000000L, f5);
        }
        long l4 = l3;
        string2 = "color";
        object = (String)((HashMap)object).get(string2);
        long l7 = OX.b;
        if (object != null && (n3 = StringsKt.d0((CharSequence)object, '#')) != 0) {
            long l8;
            long l12;
            object = ((String)object).substring(1);
            String string3 = "this as java.lang.String).substring(startIndex)";
            Intrinsics.checkNotNullExpressionValue(object, string3);
            n3 = ((String)object).length();
            int n4 = 6;
            if (n3 == n4) {
                string3 = "FF";
                object = string3.concat((String)object);
            }
            n3 = 16;
            try {
                l12 = Long.parseLong((String)object, n3);
            }
            catch (Exception exception) {}
            int n7 = (int)l12;
            l2 = l8 = zx_0.c(n7);
        }
        l2 = l7;
        object = new xm3(l2, l4, null, null, 0L, null, 0, 0L, 0xFFFFFC);
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static void g(Y50$b object, int n3, int n4, int n7, boolean bl2, boolean bl3, int n8, int[] nArray) {
        boolean bl4;
        void var4_6;
        int n10;
        void var3_5;
        void var5_7;
        void var6_8;
        int n14;
        int[] nArray2 = nL1$a.$EnumSwitchMapping$0;
        int n15 = ((Enum)object).ordinal();
        int n16 = nArray2[n15];
        n15 = 0;
        int n17 = 1;
        if (n16 == n17) {
            var7_9[0] = n14;
            var7_9[n17] = n14;
            return;
        }
        int n18 = 2;
        if (n16 == n18) {
            var7_9[0] = false;
            var7_9[n17] = var6_8;
            return;
        }
        int n19 = 3;
        if (n16 != n19) {
            n14 = 4;
            if (n16 == n14) {
                var7_9[0] = var6_8;
                var7_9[n17] = var6_8;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object);
            stringBuilder.append(" is not supported");
            String string2 = stringBuilder.toString().toString();
            IllegalStateException illegalStateException = new IllegalStateException(string2);
            throw illegalStateException;
        }
        if (var5_7 == false && (var3_5 != n17 && var3_5 != n18 || var3_5 != n18 && n10 == n17 && var4_6 == false)) {
            bl4 = false;
            Object var0_2 = null;
        } else {
            bl4 = true;
        }
        if (bl4) {
            n10 = n14;
        } else {
            n10 = 0;
            Object var15_18 = null;
        }
        var7_9[0] = n10;
        if (!bl4) {
            n14 = var6_8;
        }
        var7_9[n17] = n14;
    }

    public final void a() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(Y50 var1_1, Zw$a var2_2) {
        var3_3 = this;
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 = var1_1.l;
        var7_7 = this.d;
        var8_8 = (Integer[])var7_7.get(var6_6);
        var9_9 /* !! */  = var2_2.a;
        var10_10 /* !! */  = var2_2.c;
        var11_11 = var1_1.t;
        var12_12 = var2_2.j;
        var13_13 = 1;
        if (var8_8 != null) {
            var14_14 = var8_8[var13_13];
            var15_15 = var14_14.intValue();
        } else {
            var15_15 = 0;
            var14_14 = null;
        }
        var16_16 = var1_1.p();
        if (var15_15 == var16_16) {
            var15_15 = 1;
        } else {
            var15_15 = 0;
            var14_14 = null;
        }
        var16_16 = (int)var1_1.F();
        var17_17 = var3_3.f;
        var18_18 = var17_17.l;
        var20_19 = c60.i(var18_18);
        var21_20 /* !! */  = var3_3.g;
        var22_21 = var17_17;
        var17_17 = var21_20 /* !! */ ;
        nl1_0.g(var9_9 /* !! */ , var10_10 /* !! */ , var11_11, var12_12, (boolean)var15_15, (boolean)var16_16, var20_19, var21_20 /* !! */ );
        var9_9 /* !! */  = var5_5.b;
        var10_10 /* !! */  = var5_5.d;
        var11_11 = var4_4.u;
        var12_12 = var5_5.j;
        if (var8_8 != null) {
            var15_15 = 0;
            var14_14 = null;
            var8_8 = var8_8[0];
            var23_22 /* !! */  = var8_8.intValue();
        } else {
            var23_22 /* !! */  = 0;
            var8_8 = null;
        }
        var15_15 = var1_1.v();
        var24_23 = var23_22 /* !! */  == var15_15;
        var25_24 = var1_1.G();
        var26_25 = var22_21.l;
        var28_26 = c60.h(var26_25);
        var8_8 = var3_3.h;
        var29_27 /* !! */  = var9_9 /* !! */ ;
        nl1_0.g(var9_9 /* !! */ , var10_10 /* !! */ , var11_11, var12_12, var24_23, var25_24, var28_26, (int[])var8_8);
        var8_8 = var3_3.g;
        var9_9 /* !! */  = null;
        var10_10 /* !! */  = var8_8[0];
        var11_11 = 1;
        var23_22 /* !! */  = var8_8[var11_11];
        var30_28 = var3_3.h;
        var15_15 = var30_28[0];
        var31_29 = var30_28[var11_11];
        var32_30 = f60.a(var10_10 /* !! */ , var23_22 /* !! */ , var15_15, var31_29);
        var10_10 /* !! */  = var5_5.j;
        var12_12 = 2;
        if (var10_10 /* !! */  == var11_11 || var10_10 /* !! */  == var12_12 || (var34_31 = var5_5.a) != (var35_32 = Y50$b.MATCH_CONSTRAINT) || (var10_10 /* !! */  = var4_4.t) != 0 || (var34_31 = var5_5.b) != var35_32 || (var10_10 /* !! */  = var4_4.u) != 0) {
            var36_33 = var3_3.f((Y50)var4_4, var32_30);
            var4_4.g = false;
            var15_15 = 32;
            var26_25 = var36_33 >> var15_15;
            var16_16 = (int)var26_25;
            var14_14 = var16_16;
            var20_19 = var4_4.w;
            var17_17 = var20_19;
            var13_13 = 0;
            var21_20 /* !! */  = null;
            if (var20_19 <= 0) {
                var17_17 = null;
            }
            var20_19 = var4_4.x;
            var29_27 /* !! */  = Integer.valueOf(var20_19);
            if (var20_19 > 0) {
                var38_34 /* !! */  = var29_27 /* !! */ ;
            } else {
                var20_19 = 0;
                var38_34 /* !! */  = null;
            }
            var14_14 = (Number)kotlin.ranges.f.j((Integer)var14_14, (Integer)var17_17, (Integer)var38_34 /* !! */ );
            var15_15 = var14_14.intValue();
            var39_35 = 0xFFFFFFFFL;
            var11_11 = (int)(var36_33 &= var39_35);
            var34_31 = var11_11;
            var20_19 = var4_4.z;
            var17_17 = var20_19;
            if (var20_19 <= 0) {
                var17_17 = null;
            }
            var20_19 = var4_4.A;
            var29_27 /* !! */  = Integer.valueOf(var20_19);
            if (var20_19 > 0) {
                var21_20 /* !! */  = (int[])var29_27 /* !! */ ;
            }
            var34_31 = (Number)kotlin.ranges.f.j((Integer)var34_31, (Integer)var17_17, (Integer)var21_20 /* !! */ );
            var10_10 /* !! */  = var34_31.intValue();
            if (var15_15 != var16_16) {
                var16_16 = c60.j(var32_30);
                var23_22 /* !! */  = c60.h(var32_30);
                var32_30 = f60.a(var15_15, var15_15, var16_16, var23_22 /* !! */ );
                var15_15 = 1;
            } else {
                var15_15 = 0;
                var14_14 = null;
            }
            if (var10_10 /* !! */  != var11_11) {
                var11_11 = c60.k(var32_30);
                var23_22 /* !! */  = c60.i(var32_30);
                var32_30 = f60.a(var11_11, var23_22 /* !! */ , var10_10 /* !! */ , var10_10 /* !! */ );
                var15_15 = 1;
            }
            if (var15_15 != 0) {
                var3_3.f((Y50)var4_4, var32_30);
                var23_22 /* !! */  = 0;
                var8_8 = null;
                var4_4.g = false;
            }
        }
        var8_8 = var3_3.c;
        var9_9 /* !! */  = var4_4.j0;
        var31_29 = (var8_8 = (Ns2)var8_8.get((Object)var9_9 /* !! */ )) != null ? var8_8.a : var1_1.v();
        var5_5.e = var31_29;
        var31_29 = var8_8 != null ? var8_8.b : var1_1.p();
        var5_5.f = var31_29;
        var31_29 = -1 << -1;
        if (var8_8 == null) ** GOTO lbl-1000
        var10_10 /* !! */  = (int)var22_21.j;
        var35_32 = var22_21.i;
        if (var10_10 /* !! */  != 0) {
            var35_32.clear();
            var34_31 = var22_21.h.iterator();
            while ((var15_15 = (int)var34_31.hasNext()) != 0) {
                var14_14 = var34_31.next();
                var41_36 = var22_21.c;
                if ((var14_14 = ((qg2_0)var41_36.get(var14_14)).a()) == null) continue;
                var35_32.add(var14_14);
            }
            var15_15 = 0;
            var14_14 = null;
            var22_21.j = false;
        }
        if ((var42_37 = (int)var35_32.contains(var4_4)) != 0) {
            var4_4 = Pc.a;
            var42_37 = var8_8.U((Oc)var4_4);
        } else lbl-1000:
        // 2 sources

        {
            var42_37 = -1 << -1;
        }
        if (var42_37 != var31_29) {
            var23_22 /* !! */  = 1;
        } else {
            var23_22 /* !! */  = 0;
            var8_8 = null;
        }
        var5_5.h = var23_22 /* !! */ ;
        var5_5.g = var42_37;
        var4_4 = var7_7.get(var6_6);
        if (var4_4 == null) {
            var42_37 = 3;
            var4_4 = new Integer[var42_37];
            var23_22 /* !! */  = 0;
            var8_8 = null;
            var4_4[0] = var34_31 = Integer.valueOf(0);
            var34_31 = 0;
            var11_11 = 1;
            var4_4[var11_11] = var34_31;
            var9_9 /* !! */  = Integer.valueOf(var31_29);
            var4_4[var12_12] = var9_9 /* !! */ ;
            var7_7.put(var6_6, var4_4);
        } else {
            var23_22 /* !! */  = 0;
            var8_8 = null;
        }
        var4_4[0] = var6_6 = Integer.valueOf(var5_5.e);
        var6_6 = var5_5.f;
        var43_38 = 1;
        var4_4[var43_38] = var6_6;
        var4_4[var12_12] = var6_6 = Integer.valueOf(var5_5.g);
        var42_37 = var5_5.e;
        var44_39 = var5_5.c;
        if (var42_37 == var44_39 && (var42_37 = var5_5.f) == (var44_39 = var5_5.d)) {
            var13_13 = 0;
            var21_20 /* !! */  = null;
        } else {
            var13_13 = 1;
        }
        var5_5.i = var13_13;
    }

    public final void c(b30_0 object, int n3) {
        Serializable serializable;
        object = object.g(1750959258);
        int n4 = n3 & 6;
        int n7 = 2;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x(this) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        if ((n4 &= 3) == n7 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            serializable = this.j;
            n7 = serializable.size();
            for (int i3 = 0; i3 < n7; ++i3) {
                int n8;
                Object object2 = (K50$a)serializable.get(i3);
                object2.getClass();
                Object object3 = rp0_0.a;
                object2.getClass();
                object3 = (hx0_2)((HashMap)object3).get(null);
                object2.getClass();
                if (object3 != null) {
                    n8 = -209368134;
                    ((j30_0)object).K(n8);
                    object2 = 0;
                    object3.invoke(null, null, object, object2);
                    ((j30_0)object).T(false);
                    continue;
                }
                ((j30_0)object).K(-209229285);
                n8 = -206910826;
                ((j30_0)object).K(n8);
                ((j30_0)object).T(false);
                ((j30_0)object).T(false);
            }
        }
        object = ((j30_0)object).X();
        if (object != null) {
            serializable = new nL1$c(this, n3);
            ((CF2)object).d = serializable;
        }
    }

    public final void d(float f5, b30_0 object, int n3) {
        int n4;
        Object object2 = androidx.compose.foundation.layout.d.a;
        object = object.g(2126574786);
        int n7 = n3 & 6;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).J(object2) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n8 = n3 & 0x30;
        int n10 = 32;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object).b(f5) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        if ((n8 = n3 & 0x180) == 0) {
            n8 = (int)(((j30_0)object).x(this) ? 1 : 0);
            n8 = n8 != 0 ? 256 : 128;
            n7 |= n8;
        }
        if ((n8 = n7 & 0x93) == (n4 = 146) && (n8 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            b30$a$a b30$a$a;
            Object object3 = LP1$a.b;
            object2 = ((d)object2).e((LP1)object3);
            n8 = (int)(((j30_0)object).x(this) ? 1 : 0);
            n4 = 0;
            if ((n7 &= 0x70) == n10) {
                n7 = 1;
            } else {
                n7 = 0;
                b30$a$a = null;
            }
            object3 = ((j30_0)object).v();
            if ((n7 |= n8) != 0 || object3 == (b30$a$a = b30$a.a)) {
                object3 = new ol1_0(this, f5);
                ((j30_0)object).o(object3);
            }
            object3 = (Function1)object3;
            AL.a((LP1)object2, (Function1)object3, (b30_0)object, 0);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new pl1_0(this, f5, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final long f(Y50 object, long l2) {
        int n3;
        int n4;
        Object object2 = ((Y50)object).j0;
        int n7 = object instanceof se3_0;
        long l3 = 0xFFFFFFFFL;
        int n8 = 32;
        int n10 = 0;
        if (n7 != 0) {
            int n14 = c60.g(l2);
            n7 = -1 << -1;
            int n15 = 0x40000000;
            if (n14 != 0) {
                n14 = 0x40000000;
            } else {
                n14 = (int)(c60.e(l2) ? 1 : 0);
                if (n14 != 0) {
                    n14 = -1 << -1;
                } else {
                    n14 = 0;
                    object2 = null;
                }
            }
            boolean bl2 = c60.f(l2);
            if (bl2) {
                n10 = 0x40000000;
            } else {
                n15 = (int)(c60.d(l2) ? 1 : 0);
                if (n15 != 0) {
                    n10 = -1 << -1;
                }
            }
            object = (se3_0)object;
            n7 = c60.i(l2);
            n4 = c60.h(l2);
            ((se3_0)object).a0(n14, n7, n10, n4);
            n4 = ((se3_0)object).G0;
            n3 = ((se3_0)object).H0;
        } else {
            n3 = object2 instanceof xk1_0;
            if (n3 == 0) {
                long l4 = 0;
                long l7 = l4 << n8;
                return l4 & l3 | l7;
            }
            object = object2;
            object = ((xk1_0)object2).Q(l2);
            LinkedHashMap linkedHashMap = this.c;
            linkedHashMap.put(object2, object);
            n4 = ((Ns2)object).a;
            n3 = ((Ns2)object).b;
        }
        l2 = (long)n4 << n8;
        long l8 = (long)n3 & l3;
        return l2 | l8;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void h(Ns2$a object, List iterator) {
        int n3;
        Object object2;
        Object object3;
        Object object4;
        int n4;
        Iterator iterator2;
        Object object5;
        int n7;
        Ns2 ns2;
        int n8;
        Object object6;
        LinkedHashMap linkedHashMap = this.e;
        int n10 = linkedHashMap.isEmpty();
        Object object7 = this.b;
        if (n10 != 0) {
            object6 = ((tf3_0)object7).x0;
            n8 = object6.size();
            ns2 = null;
            for (n7 = 0; n7 < n8; ++n7) {
                object5 = (Y50)object6.get(n7);
                iterator2 = ((Y50)object5).j0;
                n4 = iterator2 instanceof xk1_0;
                if (n4 == 0) continue;
                object5 = ((Y50)object5).k;
                Y50 y50 = ((UF3)object5).a;
                if (y50 != null) {
                    int n14;
                    ((UF3)object5).b = n14 = y50.w();
                    ((UF3)object5).c = n14 = y50.x();
                    n14 = y50.w();
                    int n15 = y50.Y;
                    ((UF3)object5).d = n14 += n15;
                    n14 = y50.x();
                    n15 = y50.Z;
                    ((UF3)object5).e = n14 += n15;
                    UF3 uF3 = y50.k;
                    ((UF3)object5).c(uF3);
                }
                object4 = new UF3((UF3)object5);
                linkedHashMap.put(iterator2, object4);
            }
        }
        n10 = object3.size();
        n8 = 0;
        float f5 = 0.0f;
        Object var18_42 = null;
        while (true) {
            block36: {
                block38: {
                    block37: {
                        block35: {
                            n7 = 0;
                            ns2 = null;
                            if (n8 >= n10) break;
                            object5 = (xk1_0)object3.get(n8);
                            boolean bl2 = linkedHashMap.containsKey(object5);
                            if (bl2) break block37;
                            iterator2 = ((Iterable)linkedHashMap.keySet()).iterator();
                            while ((n4 = iterator2.hasNext()) != 0) {
                                Object object8;
                                Object object9 = object4 = iterator2.next();
                                xk1_0 xk1_02 = (xk1_0)object4;
                                object2 = androidx.compose.ui.layout.a.a(xk1_02);
                                if (object2 == null || (n3 = (int)(Intrinsics.areEqual(object8 = androidx.compose.ui.layout.a.a(xk1_02), object2 = androidx.compose.ui.layout.a.a((xk1_0)object5)) ? 1 : 0)) == 0) continue;
                                break block35;
                            }
                            n4 = 0;
                            object4 = null;
                        }
                        object4 = (xk1_0)object4;
                        if (object4 != null) break block38;
                        break block36;
                    }
                    object4 = object5;
                }
                if ((iterator2 = (UF3)linkedHashMap.get(object4)) == null) {
                    return;
                }
                LinkedHashMap linkedHashMap2 = this.c;
                if ((object4 = (Ns2)linkedHashMap2.get(object4)) == null) {
                    return;
                }
                n3 = linkedHashMap.containsKey(object5);
                if (n3 == 0) {
                    n3 = ((Ns2)object4).a;
                    n4 = ((Ns2)object4).b;
                    if (n3 >= 0 && n4 >= 0) {
                        long l2 = f60.i(n3, n3, n4, n4);
                        ns2 = object5.Q(l2);
                        A50.b(object, ns2, (UF3)((Object)iterator2));
                        break block36;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("width(");
                        stringBuilder.append(n3);
                        stringBuilder.append(") and height(");
                        stringBuilder.append(n4);
                        stringBuilder.append(") must be >= 0");
                        hz0.a(stringBuilder.toString());
                        throw null;
                    }
                }
                A50.b(object, (Ns2)object4, (UF3)((Object)iterator2));
            }
            ++n8;
        }
        Gp1 gp1 = Gp1.BOUNDS;
        if (gp1 != null) return;
        StringBuilder stringBuilder = Ex0.a("{   root: {interpolated: { left:  0,  top:  0,");
        object3 = new StringBuilder("  right:   ");
        n10 = ((Y50)object7).v();
        ((StringBuilder)object3).append(n10);
        object6 = " ,";
        ((StringBuilder)object3).append((String)object6);
        object3 = ((StringBuilder)object3).toString();
        stringBuilder.append((String)object3);
        String string2 = "  bottom:  ";
        object3 = new StringBuilder(string2);
        n8 = ((Y50)object7).p();
        ((StringBuilder)object3).append(n8);
        ((StringBuilder)object3).append((String)object6);
        object3 = ((StringBuilder)object3).toString();
        stringBuilder.append((String)object3);
        stringBuilder.append(" } }");
        object3 = ((tf3_0)object7).x0.iterator();
        while (true) {
            Object object10;
            float f6;
            int n16;
            int n17;
            block40: {
                v50$a[] v50$aArray;
                block41: {
                    block39: {
                        n10 = (int)(object3.hasNext() ? 1 : 0);
                        object7 = " }";
                        if (n10 == 0) break block39;
                        object6 = (Y50)object3.next();
                        Object object11 = ((Y50)object6).j0;
                        n17 = object11 instanceof xk1_0;
                        iterator2 = "}, ";
                        object4 = ": {";
                        String string3 = " ";
                        if (n17 == 0) {
                            n8 = object6 instanceof w11_0;
                            if (n8 == 0) continue;
                            StringBuilder stringBuilder2 = new StringBuilder(string3);
                            object5 = ((Y50)object6).l;
                            stringBuilder2.append((String)object5);
                            stringBuilder2.append((String)object4);
                            String string4 = stringBuilder2.toString();
                            stringBuilder.append(string4);
                            object6 = (w11_0)object6;
                            n8 = ((w11_0)object6).B0;
                            if (n8 == 0) {
                                String string5 = " type: 'hGuideline', ";
                                stringBuilder.append(string5);
                            } else {
                                String string6 = " type: 'vGuideline', ";
                                stringBuilder.append(string6);
                            }
                            stringBuilder.append(" interpolated: ");
                            StringBuilder stringBuilder3 = new StringBuilder(" { left: ");
                            n17 = ((Y50)object6).w();
                            stringBuilder3.append(n17);
                            stringBuilder3.append(", top: ");
                            n17 = ((Y50)object6).x();
                            stringBuilder3.append(n17);
                            stringBuilder3.append(", right: ");
                            n17 = ((Y50)object6).w();
                            n4 = ((Y50)object6).v() + n17;
                            stringBuilder3.append(n4);
                            object5 = ", bottom: ";
                            stringBuilder3.append((String)object5);
                            n17 = ((Y50)object6).x();
                            n10 = ((Y50)object6).p() + n17;
                            stringBuilder3.append(n10);
                            stringBuilder3.append((String)object7);
                            object6 = stringBuilder3.toString();
                            stringBuilder.append((String)object6);
                            stringBuilder.append((String)((Object)iterator2));
                            continue;
                        }
                        object7 = ((Y50)object6).l;
                        if (object7 == null) {
                            object7 = object11;
                            object7 = (xk1_0)object11;
                            object5 = androidx.compose.ui.layout.a.a((xk1_0)object7);
                            if (object5 == null) {
                                n17 = (object7 = object7.B()) instanceof E50;
                                if (n17 != 0) {
                                    object7 = (E50)object7;
                                } else {
                                    n16 = 0;
                                    object7 = null;
                                }
                                if (object7 != null) {
                                    object7 = object7.a();
                                    object5 = object7;
                                } else {
                                    n17 = 0;
                                    object5 = null;
                                    f6 = 0.0f;
                                }
                            }
                            if (object5 != null) {
                                object7 = object5.toString();
                            } else {
                                n16 = 0;
                                object7 = null;
                            }
                            ((Y50)object6).l = object7;
                        }
                        if ((object7 = (UF3)linkedHashMap.get(object11)) != null && (object7 = ((UF3)object7).a) != null) {
                            object7 = ((Y50)object7).k;
                        } else {
                            n16 = 0;
                            object7 = null;
                        }
                        if (object7 == null) continue;
                        StringBuilder stringBuilder4 = new StringBuilder(string3);
                        object6 = ((Y50)object6).l;
                        stringBuilder4.append((String)object6);
                        stringBuilder4.append((String)object4);
                        object6 = stringBuilder4.toString();
                        stringBuilder.append((String)object6);
                        stringBuilder.append(" interpolated : ");
                        stringBuilder.append("{\n");
                        UF3.a(((UF3)object7).b, "left", stringBuilder);
                        UF3.a(((UF3)object7).c, "top", stringBuilder);
                        UF3.a(((UF3)object7).d, "right", stringBuilder);
                        UF3.a(((UF3)object7).e, "bottom", stringBuilder);
                        f5 = ((UF3)object7).f;
                        UF3.b(stringBuilder, "pivotX", f5);
                        f5 = ((UF3)object7).g;
                        UF3.b(stringBuilder, "pivotY", f5);
                        f5 = ((UF3)object7).h;
                        UF3.b(stringBuilder, "rotationX", f5);
                        f5 = ((UF3)object7).i;
                        UF3.b(stringBuilder, "rotationY", f5);
                        f5 = ((UF3)object7).j;
                        UF3.b(stringBuilder, "rotationZ", f5);
                        f5 = ((UF3)object7).k;
                        UF3.b(stringBuilder, "translationX", f5);
                        f5 = ((UF3)object7).l;
                        UF3.b(stringBuilder, "translationY", f5);
                        f5 = ((UF3)object7).m;
                        UF3.b(stringBuilder, "translationZ", f5);
                        f5 = ((UF3)object7).n;
                        UF3.b(stringBuilder, "scaleX", f5);
                        f5 = ((UF3)object7).o;
                        UF3.b(stringBuilder, "scaleY", f5);
                        f5 = ((UF3)object7).p;
                        UF3.b(stringBuilder, "alpha", f5);
                        n8 = ((UF3)object7).r;
                        UF3.a(n8, "visibility", stringBuilder);
                        f5 = ((UF3)object7).q;
                        UF3.b(stringBuilder, "interpolatedPos", f5);
                        object6 = ((UF3)object7).a;
                        if (object6 == null) break block40;
                        v50$aArray = v50$a.values();
                        n17 = v50$aArray.length;
                        object4 = null;
                        break block41;
                    }
                    stringBuilder.append((String)object7);
                    stringBuilder.getClass();
                    Hp1 hp1 = this.a;
                    if (hp1 == null) return;
                    hp1.d();
                    return;
                }
                for (n4 = 0; n4 < n17; ++n4) {
                    void var14_33;
                    v50$a v50$a = v50$aArray[n4];
                    object2 = ((Y50)object6).n(v50$a);
                    if (object2 == null || (object10 = ((v50_0)object2).f) == null) continue;
                    object10 = "Anchor";
                    stringBuilder.append((String)object10);
                    String string7 = v50$a.name();
                    stringBuilder.append(string7);
                    stringBuilder.append(": ['");
                    String string8 = ((v50_0)object2).f.d.l;
                    if (string8 == null) {
                        String string9 = "#PARENT";
                    }
                    stringBuilder.append((String)var14_33);
                    String string10 = "', '";
                    stringBuilder.append(string10);
                    object10 = ((v50_0)object2).f.e.name();
                    stringBuilder.append((String)object10);
                    stringBuilder.append(string10);
                    n3 = ((v50_0)object2).g;
                    stringBuilder.append(n3);
                    String string11 = "'],\n";
                    stringBuilder.append(string11);
                }
            }
            object6 = "phone_orientation";
            n8 = 2143289344;
            f5 = 0.0f / 0.0f;
            UF3.b(stringBuilder, (String)object6, f5);
            UF3.b(stringBuilder, (String)object6, f5);
            object6 = ((UF3)object7).s;
            n16 = ((HashMap)object6).size();
            String string12 = "}\n";
            if (n16 != 0) {
                stringBuilder.append("custom : {\n");
                object7 = ((HashMap)object6).keySet().iterator();
                block12: while ((n17 = (int)(object7.hasNext() ? 1 : 0)) != 0) {
                    object5 = (String)object7.next();
                    object4 = (mg0)((HashMap)object6).get(object5);
                    stringBuilder.append((String)object5);
                    object5 = ": ";
                    stringBuilder.append((String)object5);
                    n17 = ((mg0)object4).b;
                    String string13 = ",\n";
                    object2 = "',\n";
                    object10 = "'";
                    switch (n17) {
                        default: {
                            continue block12;
                        }
                        case 904: {
                            stringBuilder.append((String)object10);
                            n17 = (int)(((mg0)object4).f ? 1 : 0);
                            stringBuilder.append(n17 != 0);
                            stringBuilder.append((String)object2);
                            continue block12;
                        }
                        case 903: {
                            stringBuilder.append((String)object10);
                            object5 = ((mg0)object4).e;
                            stringBuilder.append((String)object5);
                            stringBuilder.append((String)object2);
                            continue block12;
                        }
                        case 902: {
                            stringBuilder.append((String)object10);
                            n17 = ((mg0)object4).c;
                            object5 = mg0.a(n17);
                            stringBuilder.append((String)object5);
                            stringBuilder.append((String)object2);
                            continue block12;
                        }
                        case 901: 
                        case 905: {
                            f6 = ((mg0)object4).d;
                            stringBuilder.append(f6);
                            stringBuilder.append(string13);
                            continue block12;
                        }
                        case 900: 
                    }
                    n17 = ((mg0)object4).c;
                    stringBuilder.append(n17);
                    stringBuilder.append(string13);
                }
                stringBuilder.append(string12);
            }
            stringBuilder.append(string12);
            stringBuilder.append((String)((Object)iterator2));
        }
    }

    public final long i(long l2, bp1_0 bp1_02, H50 h50, List list) {
        float f5;
        float f6;
        int n3;
        Object object;
        nl1_0 nl1_02 = this;
        Iterator iterator = list;
        int n4 = list.isEmpty();
        if (n4 != 0) {
            int n7 = c60.k(l2);
            n4 = c60.j(l2);
            return dj1.a(n7, n4);
        }
        n4 = c60.g(l2);
        Object object2 = vq0.i;
        if (n4 != 0) {
            n4 = c60.i(l2);
            object = vq0.b(n4);
        } else {
            object = new vq0((String)object2);
            n3 = c60.k(l2);
            if (n3 >= 0) {
                ((vq0)object).a = n3;
            }
        }
        Iterator iterator2 = nl1_02.f;
        Object object3 = ((Fb3)((Object)iterator2)).f;
        ((G50)object3).e0 = object;
        n4 = (int)(c60.f(l2) ? 1 : 0);
        if (n4 != 0) {
            n4 = c60.h(l2);
            object = vq0.b(n4);
        } else {
            object = new vq0((String)object2);
            int n8 = c60.j(l2);
            if (n8 >= 0) {
                ((vq0)object).a = n8;
            }
        }
        object2 = ((Fb3)((Object)iterator2)).f;
        ((G50)object2).f0 = object;
        object = ((G50)object2).e0;
        Z50 z50 = nl1_02.b;
        object3 = null;
        ((vq0)object).a(z50, 0);
        object = ((G50)object2).f0;
        int n10 = 1;
        ((vq0)object).a(z50, n10);
        ((eb3_2)((Object)iterator2)).l = l2;
        object = bp1_0.Rtl;
        Object object4 = bp1_02;
        if (bp1_02 == object) {
            n4 = 1;
            f6 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f6 = 0.0f;
            object = null;
        }
        ((Fb3)((Object)iterator2)).b = n4 ^= n10;
        nl1_02.c.clear();
        nl1_02.d.clear();
        object = nl1_02.e;
        ((LinkedHashMap)object).clear();
        n4 = (int)(h50.a(list) ? 1 : 0);
        if (n4 != 0) {
            Object object5;
            boolean bl2;
            Object object6;
            Object object7;
            boolean bl3;
            object = ((Fb3)((Object)iterator2)).c;
            object4 = ((HashMap)object).keySet().iterator();
            while (bl3 = object4.hasNext()) {
                object7 = object4.next();
                object7 = ((qg2_0)((HashMap)object).get(object7)).a();
                ((Y50)object7).H();
            }
            ((HashMap)object).clear();
            object4 = 0;
            ((HashMap)object).put(object4, object2);
            ((Fb3)((Object)iterator2)).d.clear();
            ((Fb3)((Object)iterator2)).e.clear();
            ((Fb3)((Object)iterator2)).h.clear();
            ((Fb3)((Object)iterator2)).j = n10;
            object = h50;
            h50.b((eb3_2)((Object)iterator2), (List)((Object)iterator));
            A50.a((eb3_2)((Object)iterator2), (List)((Object)iterator));
            z50.x0.clear();
            ((G50)object2).e0.a(z50, 0);
            ((G50)object2).f0.a(z50, n10);
            iterator = ((Fb3)((Object)iterator2)).d;
            object = ((HashMap)((Object)iterator)).keySet().iterator();
            while (true) {
                n10 = (int)(object.hasNext() ? 1 : 0);
                object4 = ((Fb3)((Object)iterator2)).c;
                if (n10 == 0) break;
                object6 = object.next();
                object7 = ((D41)((HashMap)((Object)iterator)).get(object6)).s();
                if (object7 == null) continue;
                if ((object4 = (qg2_0)((HashMap)object4).get(object6)) == null) {
                    object4 = ((Fb3)((Object)iterator2)).b(object6);
                }
                object4.b((Y50)object7);
            }
            object = ((HashMap)object4).keySet().iterator();
            while ((n10 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object6 = object.next();
                object7 = (qg2_0)((HashMap)object4).get(object6);
                if (object7 == object2 || !(bl2 = (object5 = object7.c()) instanceof D41) || (object7 = ((D41)object7.c()).s()) == null) continue;
                object5 = (qg2_0)((HashMap)object4).get(object6);
                if (object5 == null) {
                    object5 = ((Fb3)((Object)iterator2)).b(object6);
                }
                object5.b((Y50)object7);
            }
            object = ((HashMap)object4).keySet().iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                iterator2 = object.next();
                if ((iterator2 = (qg2_0)((HashMap)object4).get(iterator2)) != object2) {
                    object6 = iterator2.a();
                    object7 = iterator2.getKey().toString();
                    ((Y50)object6).m0 = object7;
                    ((Y50)object6).X = null;
                    object7 = iterator2.c();
                    bl3 = object7 instanceof y11_0;
                    if (bl3) {
                        iterator2.apply();
                    }
                    z50.a((Y50)object6);
                    continue;
                }
                iterator2.b(z50);
            }
            object = ((HashMap)((Object)iterator)).keySet().iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                iterator2 = object.next();
                object6 = ((D41)((Object)(iterator2 = (D41)((HashMap)((Object)iterator)).get(iterator2)))).s();
                if (object6 != null) {
                    object6 = ((D41)((Object)iterator2)).m0.iterator();
                    while (bl3 = object6.hasNext()) {
                        object7 = object6.next();
                        object7 = (qg2_0)((HashMap)object4).get(object7);
                        object5 = ((D41)((Object)iterator2)).s();
                        object7 = object7.a();
                        ((F41)object5).a((Y50)object7);
                    }
                    ((D41)((Object)iterator2)).apply();
                    continue;
                }
                ((D41)((Object)iterator2)).apply();
            }
            iterator = ((HashMap)object4).keySet().iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object = iterator.next();
                if ((object = (qg2_0)((HashMap)object4).get(object)) == object2 || (n3 = (iterator2 = object.c()) instanceof D41) == 0 || (object6 = ((D41)((Object)(iterator2 = (D41)object.c()))).s()) == null) continue;
                iterator2 = ((D41)((Object)iterator2)).m0.iterator();
                while (bl3 = iterator2.hasNext()) {
                    object7 = iterator2.next();
                    object5 = (qg2_0)((HashMap)object4).get(object7);
                    if (object5 != null) {
                        object7 = object5.a();
                        ((F41)object6).a((Y50)object7);
                        continue;
                    }
                    bl2 = object7 instanceof qg2_0;
                    if (bl2) {
                        object7 = ((qg2_0)object7).a();
                        ((F41)object6).a((Y50)object7);
                        continue;
                    }
                    object5 = System.out;
                    String string2 = "couldn't find reference for ";
                    StringBuilder stringBuilder = new StringBuilder(string2);
                    stringBuilder.append(object7);
                    object7 = stringBuilder.toString();
                    ((PrintStream)object5).println((String)object7);
                }
                object.apply();
            }
            iterator = ((HashMap)object4).keySet().iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object = iterator.next();
                object2 = (qg2_0)((HashMap)object4).get(object);
                object2.apply();
                if ((object2 = object2.a()) == null || object == null) continue;
                ((Y50)object2).l = object = object.toString();
            }
        } else {
            A50.a((eb3_2)((Object)iterator2), (List)((Object)iterator));
        }
        int n14 = c60.i(l2);
        z50.W(n14);
        n14 = c60.h(l2);
        z50.R(n14);
        n14 = 2143289344;
        nl1_02.i = f5 = 0.0f / 0.0f;
        iterator = nl1_02.a;
        n4 = 1065353216;
        f6 = 1.0f;
        if (iterator != null) {
            Intrinsics.checkNotNull(iterator);
            iterator.getClass();
            n14 = z50.v();
            if (n14 < 0) {
                n14 = z50.v();
                f5 = n14;
                float f7 = 0.0f;
                nl1_02.i = f5 /= f7;
            } else {
                nl1_02.i = f6;
            }
            z50.W(0);
        }
        if ((iterator = nl1_02.a) != null) {
            float f8;
            Intrinsics.checkNotNull(iterator);
            iterator.getClass();
            f5 = nl1_02.i;
            n14 = (int)(Float.isNaN(f5) ? 1 : 0);
            if (n14 != 0) {
                nl1_02.i = f6;
            }
            if ((n14 = z50.p()) < 0) {
                n14 = z50.p();
                f5 = n14;
                f6 = 0.0f;
                f6 = f5 / f6;
            }
            if ((n14 = (int)((f8 = f6 - (f5 = nl1_02.i)) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1))) < 0) {
                nl1_02.i = f6;
            }
            z50.R(0);
        }
        z50.y0.c(z50);
        z50.K0 = 257;
        Eu1.q = z50.f0(512);
        n10 = z50.K0;
        object3 = z50;
        z50.d0(n10, 0, 0, 0, 0, 0, 0);
        n14 = z50.v();
        n4 = z50.p();
        return dj1.a(n14, n4);
    }
}

