/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.text.Charsets;

/*
 * Renamed from eu3
 */
public final class eu3_0 {
    public static final fx3_0 k;
    public String a;
    public boolean b;
    public int c;
    public iu3_0 d;
    public String e;
    public String f;
    public String g;
    public List h;
    public jm2_2 i;
    public jx3_0 j;

    static {
        eu3$a eu3$a = new Object();
        Intrinsics.checkNotNullParameter(eu3$a, "<this>");
        k = ku3_0.b("http://localhost");
    }

    /*
     * Unable to fully structure code
     */
    public eu3_0(int var1_1) {
        block9: {
            var2_2 = this;
            var3_3 = mz0_2.a;
            im2_2.b.getClass();
            var4_4 = qz0_2.c;
            var5_5 = "";
            Intrinsics.checkNotNullParameter(var5_5, "host");
            Intrinsics.checkNotNullParameter(var3_3, "pathSegments");
            var6_6 = "parameters";
            Intrinsics.checkNotNullParameter(var4_4, (String)var6_6);
            Intrinsics.checkNotNullParameter(var5_5, "fragment");
            super();
            this.a = var5_5;
            var7_7 = 0;
            var8_8 = null;
            this.b = false;
            this.c = 0;
            this.d = null;
            this.e = null;
            this.f = null;
            var9_9 = pw_1.a;
            var9_9 = Charsets.UTF_8;
            var10_10 = "<this>";
            Intrinsics.checkNotNullParameter(var5_5, var10_10);
            Intrinsics.checkNotNullParameter(var9_9, "charset");
            var11_11 = new Comparable<StringBuilder>();
            var9_9 = var9_9.newEncoder();
            var12_12 = "newEncoder(...)";
            Intrinsics.checkNotNullExpressionValue(var9_9, var12_12);
            var13_13 = var5_5.length();
            Intrinsics.checkNotNullParameter(var9_9, var10_10);
            var14_14 = "input";
            Intrinsics.checkNotNullParameter(var5_5, var14_14);
            var15_15 = new ee_2();
            Intrinsics.checkNotNullParameter(var9_9, var10_10);
            var16_16 = "destination";
            Intrinsics.checkNotNullParameter(var15_15, var16_16);
            Intrinsics.checkNotNullParameter(var5_5, var14_14);
            var17_17 = "Check failed.";
            var18_18 = "dst";
            if (var13_13 > 0) break block9;
            var19_19 = var4_4;
            var9_9 = null;
            ** GOTO lbl59
        }
        while (true) {
            block10: {
                Intrinsics.checkNotNullParameter(var9_9, var10_10);
                Intrinsics.checkNotNullParameter(var5_5, var14_14);
                Intrinsics.checkNotNullParameter(var15_15, (String)var18_18);
                var19_19 = var4_4;
                var4_4 = (Iterator<T>)os_2.a((CharsetEncoder)var9_9, (CharSequence)var5_5, var7_7, var13_13);
                var20_20 = ((Object)var4_4).length;
                var21_21 = var9_9;
                var9_9 = null;
                var15_15.n((byte[])var4_4, 0, var20_20);
                var22_22 = ((Object)var4_4).length;
                if (var22_22 < 0) break;
                if ((var7_7 += var22_22) < var13_13) break block10;
lbl59:
                // 2 sources

                var4_4 = new Iterator<T>(false, (StringBuilder)var11_11, false);
                pw_1.f((ee_2)var15_15, (Function1)var4_4);
                var4_4 = var11_11.toString();
                var2_2.g = var4_4;
                var20_20 = 10;
                var7_7 = yx_2.o((Iterable)var3_3, var20_20);
                var4_4 = new Iterator<T>(var7_7);
                var3_3 = var3_3.iterator();
                while ((var7_7 = (int)var3_3.hasNext()) != 0) {
                    var8_8 = (String)var3_3.next();
                    Intrinsics.checkNotNullParameter(var8_8, var10_10);
                    Intrinsics.checkNotNullParameter(var8_8, var10_10);
                    var9_9 = new StringBuilder();
                    var11_11 = Charsets.UTF_8;
                    var13_13 = 0;
                    block2: while (var13_13 < (var23_23 = var8_8.length())) {
                        block11: {
                            block12: {
                                var23_23 = var8_8.charAt(var13_13);
                                var5_5 = Character.valueOf(var23_23);
                                var21_21 = var3_3;
                                var3_3 = pw_1.b;
                                var24_24 = var3_3.contains(var5_5);
                                if (var24_24 != 0 || (var24_24 = (var5_5 = pw_1.e).contains(var3_3 = Character.valueOf(var23_23))) != 0) break block11;
                                var20_20 = 55296;
                                var26_26 = var6_6;
                                var27_27 = '\udfff';
                                var3_3 = new a((char)var20_20, var27_27);
                                var24_24 = var3_3.d(var23_23);
                                var24_24 = var24_24 != 0 ? 2 : 1;
                                var6_6 = var11_11.newEncoder();
                                Intrinsics.checkNotNullExpressionValue(var6_6, var12_12);
                                var24_24 += var13_13;
                                Intrinsics.checkNotNullParameter(var6_6, var10_10);
                                Intrinsics.checkNotNullParameter(var8_8, var14_14);
                                var5_5 = new ee_2();
                                Intrinsics.checkNotNullParameter(var6_6, var10_10);
                                Intrinsics.checkNotNullParameter(var5_5, var16_16);
                                Intrinsics.checkNotNullParameter(var8_8, var14_14);
                                if (var13_13 < var24_24) break block12;
                                var25_25 = var18_18;
                                ** GOTO lbl114
                            }
                            while (true) {
                                block13: {
                                    Intrinsics.checkNotNullParameter(var6_6, var10_10);
                                    Intrinsics.checkNotNullParameter(var8_8, var14_14);
                                    Intrinsics.checkNotNullParameter(var5_5, (String)var18_18);
                                    var15_15 = os_2.a((CharsetEncoder)var6_6, var8_8, var13_13, var24_24);
                                    var25_25 = var18_18;
                                    var28_28 = ((Object)var15_15).length;
                                    var29_29 = var6_6;
                                    var27_27 = '\u0000';
                                    var6_6 = null;
                                    var5_5.n((byte[])var15_15, 0, var28_28);
                                    var28_28 = ((Object)var15_15).length;
                                    if (var28_28 < 0) break;
                                    if ((var13_13 += var28_28) < var24_24) break block13;
lbl114:
                                    // 2 sources

                                    var18_18 = new ow_1((StringBuilder)var9_9);
                                    pw_1.f((ee_2)var5_5, (Function1)var18_18);
                                    var13_13 = var24_24;
lbl117:
                                    // 2 sources

                                    while (true) {
                                        var3_3 = var21_21;
                                        var6_6 = var26_26;
                                        var18_18 = var25_25;
                                        var20_20 = 10;
                                        continue block2;
                                        break;
                                    }
                                }
                                var6_6 = var29_29;
                            }
                            var18_18 = new IllegalStateException(var17_17);
                            throw var18_18;
                        }
                        var25_25 = var18_18;
                        var26_26 = var6_6;
                        var9_9.append(var23_23);
                        var28_28 = 1;
                        var13_13 += var28_28;
                        ** continue;
                    }
                    var25_25 = var18_18;
                    var21_21 = var3_3;
                    var26_26 = var6_6;
                    var18_18 = var9_9.toString();
                    var4_4.add((Object)var18_18);
                    var18_18 = var25_25;
                    var20_20 = 10;
                }
                var26_26 = var6_6;
                var2_2.h = var4_4;
                var18_18 = var19_19;
                var4_4 = var6_6;
                Intrinsics.checkNotNullParameter(var19_19, (String)var6_6);
                var3_3 = mm2_1.a();
                var4_4 = vz0_2.a.iterator();
                while ((var27_27 = var4_4.hasNext()) != '\u0000') {
                    var6_6 = (String)var4_4.next();
                    var18_18.d((String)var6_6);
                    var5_5 = mz0_2.a;
                    var9_9 = null;
                    var6_6 = pw_1.e((String)var6_6, false);
                    var30_30 = 10;
                    var31_31 = yx_2.o((Iterable)var5_5, var30_30);
                    var8_8 = new ArrayList<String>(var31_31);
                    var5_5 = var5_5.iterator();
                    while ((var31_31 = (int)var5_5.hasNext()) != 0) {
                        var12_12 = (String)var5_5.next();
                        Intrinsics.checkNotNullParameter(var12_12, var10_10);
                        var13_13 = 1;
                        var12_12 = pw_1.e(var12_12, (boolean)var13_13);
                        var8_8.add(var12_12);
                    }
                    var13_13 = 1;
                    var3_3.a((String)var6_6, var8_8);
                }
                var2_2.i = var3_3;
                var2_2.j = var18_18 = new jx3_0((km2_2)var3_3);
                return;
            }
            var4_4 = var19_19;
            var9_9 = var21_21;
        }
        var18_18 = new IllegalStateException(var17_17);
        throw var18_18;
    }

    public final void a() {
        int n3;
        Object object;
        Object object2 = this.a;
        int n4 = object2.length();
        if (n4 > 0 || (n4 = (int)(Intrinsics.areEqual(object2 = this.c().a, object = "file") ? 1 : 0)) != 0) {
            return;
        }
        object2 = k;
        object = ((fx3_0)object2).a;
        this.a = object;
        object = this.d;
        if (object == null) {
            this.d = object = ((fx3_0)object2).i;
        }
        if ((n3 = this.c) == 0) {
            n4 = ((fx3_0)object2).b;
            this.e(n4);
        }
    }

    public final fx3_0 b() {
        fx3_0 fx3_02;
        Object object;
        this.a();
        iu3_0 iu3_02 = this.d;
        String string2 = this.a;
        int n3 = this.c;
        Object object2 = this.h;
        int n4 = yx_2.o((Iterable)object2, 10);
        ArrayList<Object> arrayList = new ArrayList<Object>(n4);
        object2 = object2.iterator();
        while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object = pw_1.c((String)object2.next());
            arrayList.add(object);
        }
        object = kx3_0.a((km2_2)this.j.a);
        object2 = this.g;
        int n7 = 15;
        String string3 = pw_1.d((String)object2, 0, 0, false, n7);
        object2 = this.e;
        Object object3 = null;
        Object object4 = object2 != null ? (object2 = pw_1.c((String)object2)) : null;
        object2 = this.f;
        Object object5 = object2 != null ? (object2 = pw_1.c((String)object2)) : null;
        this.a();
        object2 = new StringBuilder(256);
        fu3_0.a(this, (StringBuilder)object2);
        String string4 = ((StringBuilder)object2).toString();
        Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
        object2 = fx3_02;
        object3 = object4;
        object4 = object5;
        object5 = string4;
        fx3_02 = new fx3_0(iu3_02, string2, n3, arrayList, (im2_2)object, string3, (String)object3, (String)object4, string4);
        return fx3_02;
    }

    public final iu3_0 c() {
        iu3_0 iu3_02 = this.d;
        if (iu3_02 == null) {
            iu3_02 = iu3_0.c;
            iu3_02 = iu3_0.c;
        }
        return iu3_02;
    }

    public final void d(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.a = string2;
    }

    public final void e(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = 65536)) {
            this.c = n3;
            return;
        }
        String string2 = hj0_0.a(n3, "Port must be between 0 and 65535, or 0 if not set. Provided: ");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder(256);
        fu3_0.a(this, charSequence);
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "toString(...)");
        return charSequence;
    }
}

