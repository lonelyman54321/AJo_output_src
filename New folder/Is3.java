/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 *  android.text.style.AbsoluteSizeSpan
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.RelativeSizeSpan
 *  android.text.style.StrikethroughSpan
 *  android.text.style.StyleSpan
 *  android.text.style.TypefaceSpan
 *  android.text.style.UnderlineSpan
 *  android.util.Pair
 */
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public final class Is3 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final Ms3 f;
    public final String[] g;
    public final String h;
    public final String i;
    public final Is3 j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public Is3(String hashMap, String string2, long l2, long l3, Ms3 ms3, String[] stringArray, String string3, String string4, Is3 is3) {
        boolean bl2;
        this.a = hashMap;
        this.b = string2;
        this.i = string4;
        this.f = ms3;
        this.g = stringArray;
        if (string2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            hashMap = null;
        }
        this.c = bl2;
        this.d = l2;
        this.e = l3;
        string3.getClass();
        this.h = string3;
        this.j = is3;
        this.k = hashMap = new HashMap();
        this.l = hashMap = new HashMap();
    }

    public static Is3 a(String string2) {
        Is3 is3;
        String string3 = "\n";
        string2 = string2.replaceAll("\r\n", string3).replaceAll(" *\n *", string3);
        Object object = " ";
        String string4 = string2.replaceAll(string3, (String)object).replaceAll("[ \t\\x0B\f\r]+", (String)object);
        object = is3;
        is3 = new Is3(null, string4, -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
        return is3;
    }

    public static SpannableStringBuilder e(String charSequence, TreeMap treeMap) {
        boolean bl2 = treeMap.containsKey(charSequence);
        if (!bl2) {
            Pe0$a pe0$a = new Pe0$a();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            pe0$a.a = spannableStringBuilder;
            treeMap.put(charSequence, pe0$a);
        }
        charSequence = ((Pe0$a)treeMap.get((Object)charSequence)).a;
        charSequence.getClass();
        return (SpannableStringBuilder)charSequence;
    }

    public final Is3 b(int n3) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (Is3)arrayList.get(n3);
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
        throw indexOutOfBoundsException;
    }

    public final int c() {
        int n3;
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            n3 = arrayList.size();
        }
        return n3;
    }

    public final void d(TreeSet treeSet, boolean bl2) {
        int n3;
        Object object;
        String string2 = "p";
        Object object2 = this.a;
        boolean bl3 = string2.equals(object2);
        String string3 = "div";
        boolean bl4 = string3.equals(object2);
        if (bl2 || bl3 || bl4 && (object2 = this.i) != null) {
            long l2;
            long l3 = this.d;
            long l4 = -9223372036854775807L;
            long l7 = l3 - l4;
            long l8 = l7 == 0L ? '\u0000' : (l7 < 0L ? '\uffffffff' : '\u0001');
            if (l8 != false) {
                object = l3;
                treeSet.add(object);
            }
            if ((l8 = (l2 = (l3 = this.e) - l4) == 0L ? '\u0000' : (l2 < 0L ? '\uffffffff' : '\u0001')) != false) {
                object2 = l3;
                treeSet.add(object2);
            }
        }
        if ((object2 = this.m) == null) {
            return;
        }
        bl4 = false;
        object2 = null;
        string3 = null;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.m)).size()); ++i3) {
            object = (Is3)this.m.get(i3);
            boolean bl5 = bl2 || bl3;
            ((Is3)object).d(treeSet, bl5);
        }
    }

    public final boolean f(long l2) {
        long l3;
        long l4;
        long l7 = this.e;
        long l8 = this.d;
        long l12 = -9223372036854775807L;
        long l14 = l8 - l12;
        long l15 = l14 == 0L ? '\u0000' : (l14 < 0L ? '\uffffffff' : '\u0001');
        boolean bl2 = l15 == false && (l15 = l7 == l12 ? '\u0000' : (l7 < l12 ? '\uffffffff' : '\u0001')) == false || (l15 = l8 == l2 ? '\u0000' : (l8 < l2 ? '\uffffffff' : '\u0001')) <= 0 && (l15 = l7 == l12 ? '\u0000' : (l7 < l12 ? '\uffffffff' : '\u0001')) == false || (l15 = l8 == l12 ? '\u0000' : (l8 < l12 ? '\uffffffff' : '\u0001')) == false && (l4 = l2 == l7 ? '\u0000' : (l2 < l7 ? '\uffffffff' : '\u0001')) < 0 || (l4 = l8 == l2 ? '\u0000' : (l8 < l2 ? '\uffffffff' : '\u0001')) <= 0 && (l3 = l2 == l7 ? '\u0000' : (l2 < l7 ? '\uffffffff' : '\u0001')) < 0;
        return bl2;
    }

    public final void g(long l2, String string2, ArrayList arrayList) {
        int n3;
        String string3 = "";
        Object object = this.h;
        int n4 = string3.equals(object);
        if (n4 == 0) {
            string2 = object;
        }
        n4 = this.f(l2);
        if (n4 != 0 && (n4 = (string3 = "div").equals(object = this.a)) != 0 && (string3 = this.i) != null) {
            Pair pair = new Pair((Object)string2, (Object)string3);
            arrayList.add(pair);
            return;
        }
        string3 = null;
        for (n4 = 0; n4 < (n3 = this.c()); ++n4) {
            object = this.b(n4);
            ((Is3)object).g(l2, string2, arrayList);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void h(long var1_1, Map var3_2, Map var4_3, String var5_4, TreeMap var6_5) {
        var7_6 = this;
        var8_7 = var3_2;
        var9_8 = -1;
        var10_9 = 0.0f / 0.0f;
        var11_10 = 1;
        var12_11 = this.f(var1_1);
        if (var12_11 == 0) {
            return;
        }
        var13_12 = "";
        var14_13 = this.h;
        var12_11 = var13_12.equals(var14_13);
        var15_14 = var12_11 != 0 ? var5_4 : var14_13;
        var13_12 = var7_6.l.entrySet().iterator();
        while ((var16_15 = var13_12.hasNext()) != 0) {
            block67: {
                block62: {
                    block59: {
                        block61: {
                            block60: {
                                block65: {
                                    block66: {
                                        block64: {
                                            block63: {
                                                var18_17 = var7_6.k;
                                                var14_13 = (Map.Entry)var13_12.next();
                                                var17_16 = (String)var14_13.getKey();
                                                var19_18 = var18_17.containsKey(var17_16);
                                                if (var19_18 != 0) {
                                                    var18_17 = (Integer)var18_17.get(var17_16);
                                                    var20_19 = var18_17.intValue();
                                                } else {
                                                    var20_19 = 0;
                                                    var18_17 = null;
                                                }
                                                var14_13 = (Integer)var14_13.getValue();
                                                var16_15 = var14_13.intValue();
                                                if (var20_19 == var16_15) break block62;
                                                var17_16 = (Pe0$a)var6_5.get(var17_16);
                                                var17_16.getClass();
                                                var21_20 = (Ks3)var4_3.get(var15_14);
                                                var21_20.getClass();
                                                var22_21 = var7_6.f;
                                                var23_22 = var7_6.g;
                                                var22_21 = Ls3.a(var22_21, (String[])var23_22, var8_7);
                                                var23_22 = (SpannableStringBuilder)var17_16.a;
                                                if (var23_22 == null) {
                                                    var23_22 = new SpannableStringBuilder();
                                                    var17_16.a = var23_22;
                                                }
                                                if (var22_21 == null) break block62;
                                                var24_23 = var22_21.h;
                                                if (var24_23 == var9_8 && (var25_24 = var22_21.i) == var9_8) {
                                                    var25_24 = -1;
                                                } else {
                                                    if (var24_23 == var11_10) {
                                                        var25_24 = 1;
                                                    } else {
                                                        var25_24 = 0;
                                                        var26_25 = null;
                                                    }
                                                    var24_23 = var22_21.i;
                                                    if (var24_23 == var11_10) {
                                                        var24_23 = 2;
                                                    } else {
                                                        var24_23 = 0;
                                                        var27_26 = null;
                                                    }
                                                    var25_24 |= var24_23;
                                                }
                                                if (var25_24 == var9_8) break block63;
                                                var24_23 = var22_21.h;
                                                if (var24_23 != var9_8) ** GOTO lbl67
                                                var11_10 = var22_21.i;
                                                if (var11_10 == var9_8) {
                                                    var11_10 = 1;
                                                    var24_23 = -1;
                                                } else {
                                                    var11_10 = 1;
lbl67:
                                                    // 2 sources

                                                    var28_27 = var24_23 == var11_10 ? 1 : 0;
                                                    var24_23 = var22_21.i;
                                                    if (var24_23 == var11_10) {
                                                        var24_23 = 2;
                                                    } else {
                                                        var24_23 = 0;
                                                        var27_26 = null;
                                                    }
                                                    var24_23 = var28_27 | var24_23;
                                                }
                                                var26_25 = new StyleSpan(var24_23);
                                                var24_23 = 33;
                                                var23_22.setSpan(var26_25, var20_19, var16_15, var24_23);
                                                break block64;
                                            }
                                            var24_23 = 33;
                                        }
                                        var25_24 = var22_21.f;
                                        if (var25_24 == var11_10) {
                                            var26_25 = new StrikethroughSpan();
                                            var23_22.setSpan(var26_25, var20_19, var16_15, var24_23);
                                        }
                                        if ((var25_24 = var22_21.g) == var11_10) {
                                            var26_25 = new UnderlineSpan();
                                            var23_22.setSpan(var26_25, var20_19, var16_15, var24_23);
                                        }
                                        if ((var25_24 = (int)var22_21.c) != 0) {
                                            var11_10 = (int)var22_21.c;
                                            if (var11_10 != 0) {
                                                var11_10 = var22_21.b;
                                                var26_25 = new ForegroundColorSpan(var11_10);
                                                V93.a(var23_22, var26_25, var20_19, var16_15);
                                            } else {
                                                var29_28 /* !! */  = new IllegalStateException("Font color has not been defined.");
                                                throw var29_28 /* !! */ ;
                                            }
                                        }
                                        if ((var25_24 = (int)var22_21.e) != 0) {
                                            var11_10 = (int)var22_21.e;
                                            if (var11_10 != 0) {
                                                var11_10 = var22_21.d;
                                                var26_25 = new BackgroundColorSpan(var11_10);
                                                V93.a(var23_22, var26_25, var20_19, var16_15);
                                            } else {
                                                var29_28 /* !! */  = new IllegalStateException("Background color has not been defined.");
                                                throw var29_28 /* !! */ ;
                                            }
                                        }
                                        if ((var26_25 = var22_21.a) != null) {
                                            var30_29 /* !! */  = var22_21.a;
                                            var26_25 = new TypefaceSpan((String)var30_29 /* !! */ );
                                            V93.a(var23_22, var26_25, var20_19, var16_15);
                                        }
                                        var26_25 = var22_21.r;
                                        var11_10 = 3;
                                        if (var26_25 != null) {
                                            var24_23 = var26_25.a;
                                            if (var24_23 == var9_8) {
                                                var19_18 = var21_20.j;
                                                var24_23 = 2;
                                                if (var19_18 != var24_23 && var19_18 != (var24_23 = 1)) {
                                                    var19_18 = 1;
                                                    var31_30 = 1.4E-45f;
                                                } else {
                                                    var19_18 = 3;
                                                    var31_30 = 4.2E-45f;
                                                }
                                                var24_23 = var19_18;
                                                var19_18 = 1;
                                                var31_30 = 1.4E-45f;
                                            } else {
                                                var19_18 = var26_25.b;
                                            }
                                            var9_8 = -2;
                                            var10_9 = 0.0f / 0.0f;
                                            var25_24 = var26_25.c;
                                            if (var25_24 == var9_8) {
                                                var25_24 = 1;
                                            }
                                            var29_28 /* !! */  = new vj3_0(var24_23, var19_18, var25_24);
                                            V93.a(var23_22, var29_28 /* !! */ , var20_19, var16_15);
                                        }
                                        if ((var9_8 = var22_21.m) == (var25_24 = 2)) break block65;
                                        if (var9_8 == var11_10 || var9_8 == (var25_24 = 4)) break block66;
lbl138:
                                        // 3 sources

                                        while (true) {
                                            var24_23 = -1;
                                            break block59;
                                            break;
                                        }
                                    }
                                    var29_28 /* !! */  = new Lo0();
                                    var25_24 = 33;
                                    var23_22.setSpan((Object)var29_28 /* !! */ , var20_19, var16_15, var25_24);
                                    ** GOTO lbl138
                                }
                                var29_28 /* !! */  = var7_6.j;
                                while (var29_28 /* !! */  != null) {
                                    var21_20 = var29_28 /* !! */ .f;
                                    var27_26 = var29_28 /* !! */ .g;
                                    if ((var21_20 = Ls3.a((Ms3)var21_20, (String[])var27_26, var8_7)) == null || (var19_18 = var21_20.m) != (var24_23 = 1)) {
                                        var29_28 /* !! */  = var29_28 /* !! */ .j;
                                        continue;
                                    }
                                    break block60;
                                }
                                var9_8 = 0;
                                var10_9 = 0.0f;
                                var29_28 /* !! */  = null;
                            }
                            if (var29_28 /* !! */  == null) ** GOTO lbl138
                            var21_20 = new ArrayDeque();
                            var21_20.push(var29_28 /* !! */ );
                            while ((var24_23 = (int)var21_20.isEmpty()) == 0) {
                                var27_26 = (Is3)var21_20.pop();
                                var26_25 = var27_26.f;
                                var30_29 /* !! */  = var27_26.g;
                                if ((var26_25 = Ls3.a((Ms3)var26_25, var30_29 /* !! */ , var8_7)) != null && (var25_24 = var26_25.m) == (var11_10 = 3)) {
                                    var26_25 = var27_26;
                                    break block61;
                                }
                                var25_24 = var27_26.c();
                                var11_10 = 1;
                                var25_24 -= var11_10;
                                while (var25_24 >= 0) {
                                    var30_29 /* !! */  = var27_26.b(var25_24);
                                    var21_20.push(var30_29 /* !! */ );
                                    var11_10 = -1;
                                    var25_24 += var11_10;
                                }
                                var11_10 = 3;
                            }
                            var25_24 = 0;
                            var26_25 = null;
                        }
                        if (var26_25 != null) ** break;
                        ** continue;
                        var19_18 = var26_25.c();
                        if (var19_18 != (var11_10 = 1)) ** GOTO lbl-1000
                        var19_18 = 0;
                        var31_30 = 0.0f;
                        var21_20 = null;
                        var30_29 /* !! */  = var26_25.b((int)0).b;
                        if (var30_29 /* !! */  != null) {
                            var30_29 /* !! */  = var26_25.b((int)0).b;
                            var24_23 = gz3.a;
                            var27_26 = var26_25.f;
                            var26_25 = var26_25.g;
                            if ((var26_25 = Ls3.a((Ms3)var27_26, (String[])var26_25, var8_7)) != null) {
                                var25_24 = var26_25.n;
lbl198:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var25_24 = -1;
                            ** continue;
                            var24_23 = -1;
                            if (var25_24 == var24_23) {
                                var21_20 = var29_28 /* !! */ .f;
                                var29_28 /* !! */  = var29_28 /* !! */ .g;
                                if ((var29_28 /* !! */  = Ls3.a((Ms3)var21_20, var29_28 /* !! */ , var8_7)) != null) {
                                    var25_24 = var29_28 /* !! */ .n;
                                }
                            }
                            var29_28 /* !! */  = new MQ2((String)var30_29 /* !! */ , var25_24);
                            var25_24 = 33;
                            var23_22.setSpan((Object)var29_28 /* !! */ , var20_19, var16_15, var25_24);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var24_23 = -1;
                            var29_28 /* !! */  = "Skipping rubyText node without exactly one text child.";
                            Cx.e((String)var29_28 /* !! */ );
                        }
                    }
                    var9_8 = var22_21.q;
                    var25_24 = 1;
                    if (var9_8 == var25_24) {
                        var29_28 /* !! */  = new u91();
                        V93.a(var23_22, var29_28 /* !! */ , var20_19, var16_15);
                    }
                    var9_8 = var22_21.j;
                    var19_18 = 1120403456;
                    var31_30 = 100.0f;
                    if (var9_8 != var25_24) {
                        var25_24 = 2;
                        if (var9_8 != var25_24) {
                            var25_24 = 3;
                            if (var9_8 != var25_24) {
                                var32_31 = var13_12;
                            } else {
                                var10_9 = var22_21.k / var31_30;
                                var26_25 = (RelativeSizeSpan[])var23_22.getSpans(var20_19, var16_15, RelativeSizeSpan.class);
                                var11_10 = ((RelativeSizeSpan[])var26_25).length;
                                var27_26 = null;
                                for (var24_23 = 0; var24_23 < var11_10; var24_23 += var12_11) {
                                    var21_20 = var26_25[var24_23];
                                    var32_31 = var13_12;
                                    var12_11 = var23_22.getSpanStart(var21_20);
                                    if (var12_11 <= var20_19 && (var12_11 = var23_22.getSpanEnd(var21_20)) >= var16_15) {
                                        var10_9 = var33_32 = var21_20.getSizeChange() * var10_9;
                                    }
                                    if ((var12_11 = var23_22.getSpanStart(var21_20)) == var20_19 && (var12_11 = var23_22.getSpanEnd(var21_20)) == var16_15) {
                                        var12_11 = var23_22.getSpanFlags(var21_20);
                                        var34_33 = var26_25;
                                        var25_24 = 33;
                                        if (var12_11 == var25_24) {
                                            var23_22.removeSpan(var21_20);
                                        }
lbl247:
                                        // 4 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var34_33 = var26_25;
                                    var25_24 = 33;
                                    ** continue;
                                    var12_11 = 1;
                                    var33_32 = 1.4E-45f;
                                    var13_12 = var32_31;
                                    var26_25 = var34_33;
                                    var19_18 = 1120403456;
                                    var31_30 = 100.0f;
                                }
                                var32_31 = var13_12;
                                var25_24 = 33;
                                var13_12 = new RelativeSizeSpan(var10_9);
                                var23_22.setSpan(var13_12, var20_19, var16_15, var25_24);
                            }
                        } else {
                            var32_31 = var13_12;
                            var33_32 = var22_21.k;
                            var29_28 /* !! */  = new RelativeSizeSpan(var33_32);
                            V93.a(var23_22, var29_28 /* !! */ , var20_19, var16_15);
                        }
                    } else {
                        var32_31 = var13_12;
                        var33_32 = var22_21.k;
                        var12_11 = (int)var33_32;
                        var25_24 = 1;
                        var29_28 /* !! */  = new AbsoluteSizeSpan(var12_11, (boolean)var25_24);
                        V93.a(var23_22, var29_28 /* !! */ , var20_19, var16_15);
                    }
                    var29_28 /* !! */  = "p";
                    var13_12 = var7_6.a;
                    var9_8 = (int)var29_28 /* !! */ .equals(var13_12);
                    if (var9_8 != 0) {
                        var10_9 = var22_21.s;
                        var33_32 = 3.4028235E38f;
                        cfr_temp_0 = var10_9 - var33_32;
                        var12_11 = cfr_temp_0 == 0.0f ? '\u0000' : (cfr_temp_0 > 0.0f ? '\u0001' : '\uffffffff');
                        if (var12_11 != 0) {
                            var10_9 *= -90.0f;
                            var12_11 = 1120403456;
                            var33_32 = 100.0f;
                            var17_16.q = var10_9 /= var33_32;
                        }
                        if ((var29_28 /* !! */  = var22_21.o) != null) {
                            var17_16.c = var29_28 /* !! */ ;
                        }
                        if ((var29_28 /* !! */  = var22_21.p) != null) {
                            var17_16.d = var29_28 /* !! */ ;
                        }
                    }
                    break block67;
                }
                var32_31 = var13_12;
            }
            var13_12 = var32_31;
            var9_8 = -1;
            var10_9 = 0.0f / 0.0f;
            var11_10 = 1;
        }
        var30_29 /* !! */  = null;
        for (var11_10 = 0; var11_10 < (var9_8 = this.c()); var11_10 += var9_8) {
            var29_28 /* !! */  = var7_6.b(var11_10);
            var26_25 = var3_2;
            var17_16 = var4_3;
            var18_17 = var15_14;
            var21_20 = var6_5;
            var29_28 /* !! */ .h(var1_1, var3_2, var4_3, (String)var15_14, var6_5);
            var9_8 = 1;
            var10_9 = 1.4E-45f;
        }
    }

    public final void i(long l2, boolean bl2, String string2, TreeMap treeMap) {
        Is3 is3 = this;
        TreeMap treeMap2 = treeMap;
        Iterator iterator = this.k;
        ((HashMap)((Object)iterator)).clear();
        HashMap hashMap = this.l;
        hashMap.clear();
        Object object = "metadata";
        String string3 = this.a;
        boolean n3 = ((String)object).equals(string3);
        if (n3) {
            return;
        }
        object = "";
        Object object2 = this.h;
        boolean bl3 = ((String)object).equals(object2);
        Object object3 = bl3 ? string2 : object2;
        boolean bl4 = is3.c;
        if (bl4 && bl2) {
            iterator = Is3.e((String)object3, treeMap2);
            object = is3.b;
            object.getClass();
            iterator.append((CharSequence)object);
        } else {
            object = "br";
            boolean bl5 = ((String)object).equals(string3);
            char c2 = '\n';
            if (bl5 && bl2) {
                iterator = Is3.e((String)object3, treeMap2);
                iterator.append(c2);
            } else {
                boolean bl6 = this.f(l2);
                if (bl6) {
                    int n4;
                    String string4;
                    char c3;
                    object = treeMap.entrySet().iterator();
                    while ((c3 = object.hasNext()) != '\u0000') {
                        object2 = (Map.Entry)object.next();
                        string4 = (String)object2.getKey();
                        object2 = ((Pe0$a)object2.getValue()).a;
                        object2.getClass();
                        c3 = ((CharSequence)object2).length();
                        object2 = (int)c3;
                        ((HashMap)((Object)iterator)).put(string4, object2);
                    }
                    iterator = "p";
                    boolean bl7 = ((String)((Object)iterator)).equals(string3);
                    int n7 = 0;
                    while (true) {
                        int n8 = this.c();
                        int n10 = 1;
                        if (n7 >= n8) break;
                        iterator = this.b(n7);
                        if (!bl2 && !bl7) {
                            c3 = '\u0000';
                            object2 = null;
                        } else {
                            c3 = '\u0001';
                        }
                        string4 = object3;
                        ((Is3)((Object)iterator)).i(l2, c3 != '\u0000', (String)object3, treeMap);
                        ++n7;
                    }
                    if (bl7) {
                        char c5;
                        char c6;
                        int n14;
                        iterator = Is3.e((String)object3, treeMap2);
                        for (n14 = iterator.length() - n10; n14 >= 0 && (c6 = iterator.charAt(n14)) == (c3 = ' '); n14 += -1) {
                        }
                        if (n14 >= 0 && (c5 = iterator.charAt(n14)) != c2) {
                            iterator.append(c2);
                        }
                    }
                    iterator = treeMap.entrySet().iterator();
                    while ((n4 = iterator.hasNext()) != 0) {
                        object = iterator.next();
                        string3 = (String)object.getKey();
                        object = ((Pe0$a)object.getValue()).a;
                        object.getClass();
                        n4 = ((CharSequence)object).length();
                        object = n4;
                        hashMap.put(string3, object);
                    }
                }
            }
        }
    }
}

