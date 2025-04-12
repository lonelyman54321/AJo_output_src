/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;

/*
 * Renamed from z1
 */
public final class z1_0 {
    public static final int[] a;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[14];
        int[] nArray3 = nArray;
        nArray2[0] = 2002;
        nArray3[1] = 2000;
        nArray2[2] = 1920;
        nArray3[3] = 1601;
        nArray2[4] = 1600;
        nArray3[5] = 1001;
        nArray2[6] = 1000;
        nArray3[7] = 960;
        nArray2[8] = 800;
        nArray3[9] = 800;
        nArray2[10] = 480;
        nArray3[11] = 400;
        nArray2[12] = 400;
        nArray3[13] = 2048;
        a = nArray;
    }

    public static void a(int n3, Xm2 object) {
        ((Xm2)object).F(7);
        object = ((Xm2)object).a;
        object[0] = -84;
        object[1] = 64;
        int n4 = -1;
        object[2] = n4;
        object[3] = n4;
        byte by2 = (byte)(n3 >> 16 & 0xFF);
        object[4] = by2;
        by2 = (byte)(n3 >> 8 & 0xFF);
        object[5] = by2;
        n3 = (byte)(n3 & 0xFF);
        object[6] = n3;
    }

    /*
     * Unable to fully structure code
     */
    public static z1$b b(Vm2 var0) {
        block7: {
            block9: {
                block12: {
                    block10: {
                        block11: {
                            block8: {
                                var1_1 = 16;
                                var2_2 = var0.g(var1_1);
                                var1_1 = var0.g(var1_1);
                                var3_3 = -1;
                                var4_4 = 4;
                                if (var1_1 == var3_3) {
                                    var1_1 = var0.g(24);
                                    var3_3 = 7;
                                } else {
                                    var3_3 = 4;
                                }
                                var1_1 += var3_3;
                                var3_3 = 44097;
                                if (var2_2 == var3_3) {
                                    var1_1 += 2;
                                }
                                if ((var3_3 = var0.g(var2_2 = 2)) == (var5_5 = 3)) {
                                    do {
                                        var0.g(var2_2);
                                    } while ((var3_3 = (int)var0.f()) != 0);
                                }
                                var3_3 = var0.g(10);
                                var6_6 = var0.f();
                                if (var6_6 != 0 && (var6_6 = var0.g(var5_5)) > 0) {
                                    var0.o(var2_2);
                                }
                                var6_6 = var0.f();
                                var7_7 = 44100;
                                var8_8 = 48000;
                                var6_6 = var6_6 != 0 ? 48000 : 44100;
                                var9_9 = var0.g(var4_4);
                                var10_10 = z1_0.a;
                                if (var6_6 != var7_7 || var9_9 != (var7_7 = 13)) break block8;
                                var9_9 = var10_10[var9_9];
                                break block7;
                            }
                            if (var6_6 != var8_8 || var9_9 >= (var7_7 = 14)) break block9;
                            var7_7 = var10_10[var9_9];
                            var8_8 = 1;
                            var11_11 = 8;
                            if ((var3_3 %= 5) == var8_8) break block10;
                            var8_8 = 11;
                            if (var3_3 == var2_2) break block11;
                            if (var3_3 == var5_5) break block10;
                            if (var3_3 != var4_4 || var9_9 != var5_5 && var9_9 != var11_11 && var9_9 != var8_8) break block12;
lbl43:
                            // 2 sources

                            while (true) {
                                var9_9 = var7_7 + 1;
                                break block7;
                                break;
                            }
                        }
                        if (var9_9 != var11_11 && var9_9 != var8_8) break block12;
                        ** GOTO lbl43
                    }
                    if (var9_9 != var5_5 && var9_9 != var11_11) ** break;
                    ** while (true)
                }
                var9_9 = var7_7;
                break block7;
            }
            var9_9 = 0;
            var0 = null;
        }
        var12_12 = new z1$b(var6_6, var1_1, var9_9);
        return var12_12;
    }

    public static void c(Vm2 vm2, z1$a z1$a) {
        int n3 = 5;
        int n4 = vm2.g(n3);
        vm2.o(2);
        int n7 = vm2.f();
        if (n7 != 0) {
            vm2.o(n3);
        }
        if (n4 >= (n3 = 7) && n4 <= (n3 = 10)) {
            vm2.n();
        }
        if ((n3 = (int)(vm2.f() ? 1 : 0)) != 0) {
            boolean bl2;
            n3 = vm2.g(3);
            n7 = z1$a.b;
            int n8 = -1;
            if (n7 == n8 && n4 >= 0 && n4 <= (n7 = 15) && (n3 == 0 || n3 == (n7 = 1))) {
                z1$a.b = n4;
            }
            if (bl2 = vm2.f()) {
                z1_0.e(vm2);
            }
        }
    }

    public static void d(Vm2 vm2, z1$a z1$a) {
        int n3 = 2;
        vm2.o(n3);
        boolean bl2 = vm2.f();
        int n4 = vm2.g(8);
        for (int i3 = 0; i3 < n4; ++i3) {
            vm2.o(n3);
            int n7 = vm2.f();
            if (n7 != 0) {
                n7 = 5;
                vm2.o(n7);
            }
            if (bl2) {
                n7 = 24;
                vm2.o(n7);
                continue;
            }
            n7 = (int)(vm2.f() ? 1 : 0);
            int n8 = 4;
            if (n7 != 0) {
                n7 = (int)(vm2.f() ? 1 : 0);
                if (n7 == 0) {
                    vm2.o(n8);
                }
                z1$a.c = n7 = vm2.g(6) + 1;
            }
            vm2.o(n8);
        }
        boolean bl3 = vm2.f();
        if (bl3) {
            vm2.o(3);
            bl3 = vm2.f();
            if (bl3) {
                z1_0.e(vm2);
            }
        }
    }

    public static void e(Vm2 object) {
        int n3;
        int n4 = ((Vm2)object).g(6);
        if (n4 >= (n3 = 2) && n4 <= (n3 = 42)) {
            ((Vm2)object).o(n4 *= 8);
            return;
        }
        object = n4;
        Object[] objectArray = new Object[]{object};
        throw ParserException.b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", objectArray));
    }
}

