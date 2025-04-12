/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;

public final class g {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final byte a(String var0) {
        var1_1 = "<this>";
        Intrinsics.checkNotNullParameter(var0, (String)var1_1);
        Intrinsics.checkNotNullParameter(var0, (String)var1_1);
        Intrinsics.checkNotNullParameter(var0, (String)var1_1);
        var1_1 = g.c(var0);
        if (var1_1 == null) ** GOTO lbl-1000
        var2_2 = var1_1.a;
        var3_3 = -1 << -1 ^ var2_2;
        var4_4 = -2147483393;
        if ((var3_3 = Integer.compare(var3_3, var4_4)) > 0) lbl-1000:
        // 2 sources

        {
            var3_3 = 0;
            var5_5 = null;
        } else {
            var2_2 = var2_2;
            var5_5 = new ct3_0(var2_2);
        }
        if (var5_5 != null) {
            return var5_5.a;
        }
        StringsKt__StringNumberConversionsKt.f(var0);
        throw null;
    }

    public static final int b(String string2) {
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Intrinsics.checkNotNullParameter(string2, (String)object);
        object = g.c(string2);
        if (object != null) {
            return ((ht3_0)object).a;
        }
        StringsKt__StringNumberConversionsKt.f(string2);
        throw null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final ht3_0 c(String string2) {
        String string3 = string2;
        int n3 = 1;
        int n4 = 10;
        String string4 = "<this>";
        Intrinsics.checkNotNullParameter(string2, string4);
        CharsKt__CharJVMKt.checkRadix(n4);
        int n7 = string2.length();
        if (n7 == 0) {
            return null;
        }
        int n8 = 0;
        int n10 = string2.charAt(0);
        int n14 = Intrinsics.compare(n10, 48);
        if (n14 < 0) {
            if (n7 == n3) return null;
            n14 = 43;
            if (n10 != n14) return null;
            n10 = 1;
        } else {
            n10 = 0;
        }
        n14 = 0x71C71C7;
        int n15 = 0x71C71C7;
        while (n10 < n7) {
            int n16 = Character.digit((int)string3.charAt(n10), n4);
            if (n16 < 0) {
                return null;
            }
            int n17 = -1 << -1;
            int n18 = n8 ^ n17;
            int n19 = n15 ^ n17;
            if ((n19 = Integer.compare(n18, n19)) > 0) {
                if (n15 != n14) return null;
                long l2 = -1;
                long l3 = 0xFFFFFFFFL;
                l2 &= l3;
                long l4 = (long)n4 & l3;
                n15 = (int)(l2 /= l4);
                n14 = n15 ^ n17;
                if ((n14 = Integer.compare(n18, n14)) > 0) {
                    return null;
                }
            }
            n14 = (n8 *= 10) + n16;
            n16 = n14 ^ n17;
            n8 ^= n17;
            if ((n8 = Integer.compare(n16, n8)) < 0) {
                return null;
            }
            n10 += n3;
            n8 = n14;
            n14 = 0x71C71C7;
        }
        return new ht3_0(n8);
    }

    public static final long d(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        mt3_0 mt3_02 = g.e(string2);
        if (mt3_02 != null) {
            return mt3_02.a;
        }
        StringsKt__StringNumberConversionsKt.f(string2);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final mt3_0 e(String string2) {
        block3: {
            int n3;
            int n4;
            int n7;
            int n8;
            Object object;
            int n10;
            String string3;
            block4: {
                block2: {
                    string3 = string2;
                    n10 = 1;
                    object = "<this>";
                    Intrinsics.checkNotNullParameter(string2, (String)object);
                    Intrinsics.checkNotNullParameter(string2, (String)object);
                    n8 = 10;
                    CharsKt__CharJVMKt.checkRadix(n8);
                    n7 = string2.length();
                    if (n7 == 0) return null;
                    n4 = 0;
                    n3 = string2.charAt(0);
                    int n14 = Intrinsics.compare(n3, 48);
                    if (n14 >= 0) break block2;
                    if (n7 == n10) return null;
                    n14 = 43;
                    if (n3 != n14) break block3;
                    n3 = 1;
                    break block4;
                }
                n3 = 0;
            }
            long l2 = n8;
            long l3 = 0L;
            long l4 = 0x71C71C71C71C71CL;
            long l7 = l3;
            long l8 = l4;
            while (true) {
                int n15;
                long l12;
                int n16;
                long l14;
                int n17;
                block5: {
                    long l15;
                    block8: {
                        block9: {
                            Object object2;
                            block6: {
                                block7: {
                                    if (n3 >= n7) {
                                        return new mt3_0(l7);
                                    }
                                    n17 = Character.digit((int)string3.charAt(n3), n8);
                                    if (n17 < 0) break;
                                    l14 = Long.MIN_VALUE;
                                    n16 = n7;
                                    l12 = l7 ^ l14;
                                    n15 = n3;
                                    l15 = l8 ^ l14;
                                    n4 = Long.compare(l12, l15);
                                    if (n4 <= 0) break block5;
                                    n4 = (int)(l8 == l4 ? 0 : (l8 < l4 ? -1 : 1));
                                    if (n4 != 0) return null;
                                    l15 = Long.MAX_VALUE;
                                    object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                                    if (object2 >= 0) break block6;
                                    l8 = l2 ^ l14;
                                    long l16 = l15 - l8;
                                    Object object3 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                                    if (object3 >= 0) break block7;
                                    l8 = l3;
                                    break block8;
                                }
                                l15 = 1L;
                                break block9;
                            }
                            l15 = l15 / l2 << n10;
                            l8 = l15 * l2;
                            long l17 = l2 ^ l14;
                            long l18 = (l8 = (long)-1 - l8 ^ l14) - l17;
                            Object object4 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                            object2 = object4 >= 0 ? (Object)1 : (Object)0;
                            l3 = object2;
                            l15 += l3;
                        }
                        l8 = l15;
                    }
                    l15 = l8 ^ l14;
                    n8 = Long.compare(l12, l15);
                    if (n8 > 0) break;
                }
                object = ht3_0.b;
                l12 = ((long)n17 & 0xFFFFFFFFL) + (l7 *= l2);
                long l19 = l12 ^ l14;
                if ((n17 = Long.compare(l19, l3 = l7 ^ l14)) < 0) break;
                n3 = n15 + '\u0001';
                l7 = l12;
                n7 = n16;
                n8 = 10;
                n4 = 0;
                l3 = 0L;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final short f(String var0) {
        var1_1 = "<this>";
        Intrinsics.checkNotNullParameter(var0, (String)var1_1);
        Intrinsics.checkNotNullParameter(var0, (String)var1_1);
        Intrinsics.checkNotNullParameter(var0, (String)var1_1);
        var1_1 = g.c(var0);
        if (var1_1 == null) ** GOTO lbl-1000
        var2_2 = var1_1.a;
        var3_3 = -1 << -1 ^ var2_2;
        var4_4 = -2147418113;
        if ((var3_3 = Integer.compare(var3_3, var4_4)) > 0) lbl-1000:
        // 2 sources

        {
            var3_3 = 0;
            var5_5 = null;
        } else {
            var2_2 = var2_2;
            var5_5 = new lu3_0(var2_2);
        }
        if (var5_5 != null) {
            return var5_5.a;
        }
        StringsKt__StringNumberConversionsKt.f(var0);
        throw null;
    }
}

