/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Picture
 */
import android.graphics.Picture;
import java.util.HashMap;
import java.util.Stack;

public final class rR2 {
    public rr2$f_0 a = null;
    public final float b;
    public final CH$r c;
    public final HashMap d;

    public rR2() {
        this.b = 96.0f;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        this.d = hashMap = new HashMap();
    }

    public static rR2$L a(rR2$J object, String string2) {
        boolean bl2;
        Object object2 = object;
        object2 = (rR2$L)object;
        Object object3 = ((rR2$L)object2).c;
        boolean bl3 = string2.equals(object3);
        if (bl3) {
            return object2;
        }
        object = object.b().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (rR2$N)object.next();
            bl3 = object2 instanceof rR2$L;
            if (!bl3) continue;
            object3 = object2;
            object3 = (rR2$L)object2;
            String string3 = ((rR2$L)object3).c;
            boolean bl4 = string2.equals(string3);
            if (bl4) {
                return object3;
            }
            bl3 = object2 instanceof rR2$J;
            if (!bl3 || (object2 = rR2.a((rR2$J)object2, string2)) == null) continue;
            return object2;
        }
        return null;
    }

    public final rR2$L b(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            Object object = this.a.c;
            n3 = (int)(string2.equals(object) ? 1 : 0);
            if (n3 != 0) {
                return this.a;
            }
            object = this.d;
            boolean bl2 = ((HashMap)object).containsKey(string2);
            if (bl2) {
                return (rR2$L)((HashMap)object).get(string2);
            }
            rR2$L rR2$L = rR2.a(this.a, string2);
            ((HashMap)object).put(string2, rR2$L);
            return rR2$L;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Picture c(int var1_1, int var2_2, pj2_0 var3_3) {
        block22: {
            block26: {
                block25: {
                    block24: {
                        block23: {
                            var4_4 = new Picture();
                            var5_5 /* !! */  = var4_4.beginRecording(var1_1, var2_2);
                            var6_6 = false;
                            var7_7 = null;
                            if (var3_3 /* !! */  == null || (var8_8 = var3_3 /* !! */ .e) == null) {
                                if (var3_3 /* !! */  == null) {
                                    var3_3 /* !! */  = new pj2_0();
                                } else {
                                    var8_8 = new Object();
                                    var8_8.a = null;
                                    var8_8.b = null;
                                    var8_8.c = null;
                                    var8_8.d = null;
                                    var8_8.e = null;
                                    var9_9 = var3_3 /* !! */ .a;
                                    var8_8.a = var9_9;
                                    var8_8.b = var9_9 = var3_3 /* !! */ .b;
                                    var8_8.c = var9_9 = var3_3 /* !! */ .c;
                                    var8_8.d = var9_9 = var3_3 /* !! */ .d;
                                    var8_8.e = var3_3 /* !! */  = var3_3 /* !! */ .e;
                                    var3_3 /* !! */  = var8_8;
                                }
                                var10_10 = var1_1;
                                var11_11 = var2_2;
                                var12_12 = 0;
                                var13_13 = 0.0f;
                                var9_9 = null;
                                var3_3 /* !! */ .e = var8_8 = new rR2$b(0.0f, 0.0f, var10_10, var11_11);
                            }
                            var14_14 /* !! */  = new Object();
                            var14_14 /* !! */ .a = var5_5 /* !! */ ;
                            var14_14 /* !! */ .b = var11_11 = this.b;
                            var14_14 /* !! */ .c = this;
                            var15_15 = this.a;
                            if (var15_15 == null) break block22;
                            var5_5 /* !! */  = var3_3 /* !! */ .d;
                            if (var5_5 /* !! */  == null) break block23;
                            if ((var5_5 /* !! */  = this.b((String)var5_5 /* !! */ )) == null || !(var16_16 = var5_5 /* !! */  instanceof rR2$f0)) break block22;
                            var5_5 /* !! */  = (rR2$f0)var5_5 /* !! */ ;
                            var8_8 = var5_5 /* !! */ .p;
                            if (var8_8 == null) break block22;
                            var5_5 /* !! */  = var5_5 /* !! */ .o;
                            break block24;
                        }
                        var5_5 /* !! */  = var3_3 /* !! */ .c;
                        if (var5_5 /* !! */  != null) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var5_5 /* !! */  = var15_15.p;
                        ** while (true)
                        var8_8 = var5_5 /* !! */ ;
                        var5_5 /* !! */  = var3_3 /* !! */ .b;
                        if (var5_5 /* !! */  == null) {
                            var5_5 /* !! */  = var15_15.o;
                        }
                    }
                    var9_9 = var3_3 /* !! */ .a;
                    var17_17 = true;
                    if (var9_9 == null) ** GOTO lbl-1000
                    var9_9 = var9_9.a;
                    if (var9_9 != null) {
                        var12_12 = var9_9.size();
                    } else {
                        var12_12 = 0;
                        var13_13 = 0.0f;
                        var9_9 = null;
                    }
                    if (var12_12 > 0) {
                        var12_12 = 1;
                        var13_13 = 1.4E-45f;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var12_12 = 0;
                        var13_13 = 0.0f;
                        var9_9 = null;
                    }
                    if (var12_12 != 0) {
                        var9_9 = var3_3 /* !! */ .a;
                        var18_18 = this.c;
                        var18_18.b((CH$r)var9_9);
                    }
                    var14_14 /* !! */ .d = var9_9 = new sR2$h();
                    var9_9 = new Stack();
                    var14_14 /* !! */ .e = var9_9;
                    var9_9 = var14_14 /* !! */ .d;
                    var18_18 = rR2$E.b();
                    var14_14 /* !! */ .R((sR2$h)var9_9, (rR2$E)var18_18);
                    var9_9 = var14_14 /* !! */ .d;
                    var9_9.f = null;
                    var9_9.h = false;
                    var7_7 = var14_14 /* !! */ .e;
                    var18_18 = new sR2$h((sR2$h)var9_9);
                    var7_7.push(var18_18);
                    var7_7 = new Stack();
                    var14_14 /* !! */ .g = var7_7;
                    var7_7 = new Stack();
                    var14_14 /* !! */ .f = var7_7;
                    var7_7 = var15_15.d;
                    if (var7_7 != null) {
                        var9_9 = var14_14 /* !! */ .d;
                        var9_9.h = var6_6 = var7_7.booleanValue();
                    }
                    var14_14 /* !! */ .O();
                    var9_9 = var3_3 /* !! */ .e;
                    var7_7 = new rR2$b((rR2$b)var9_9);
                    var9_9 = var15_15.s;
                    if (var9_9 != null) {
                        var19_19 = var7_7.c;
                        var7_7.c = var13_13 = var9_9.e((sR2)var14_14 /* !! */ , var19_19);
                    }
                    if ((var9_9 = var15_15.t) != null) {
                        var19_19 = var7_7.d;
                        var7_7.d = var13_13 = var9_9.e((sR2)var14_14 /* !! */ , var19_19);
                    }
                    var14_14 /* !! */ .F((rr2$f_0)var15_15, (rR2$b)var7_7, (rR2$b)var8_8, (By2)var5_5 /* !! */ );
                    var14_14 /* !! */ .N();
                    var14_14 /* !! */  = var3_3 /* !! */ .a;
                    if (var14_14 /* !! */  == null) break block25;
                    var14_14 /* !! */  = var14_14 /* !! */ .a;
                    if (var14_14 /* !! */  != null) {
                        var1_1 = var14_14 /* !! */ .size();
                    } else {
                        var1_1 = 0;
                        var10_10 = 0.0f;
                        var14_14 /* !! */  = null;
                    }
                    if (var1_1 > 0) break block26;
                }
                var17_17 = false;
            }
            if (var17_17) {
                var14_14 /* !! */  = CH$u.RenderOptions;
                var15_15 = this.c.a;
                if (var15_15 != null) {
                    var15_15 = var15_15.iterator();
                    while (var20_20 = var15_15.hasNext()) {
                        var3_3 /* !! */  = ((CH$p)var15_15.next()).c;
                        if (var3_3 /* !! */  != var14_14 /* !! */ ) continue;
                        var15_15.remove();
                    }
                }
            }
        }
        var4_4.endRecording();
        return var4_4;
    }

    public final rR2$L d(String string2) {
        String string3;
        if (string2 == null) {
            return null;
        }
        String string4 = "\"";
        int n3 = string2.startsWith(string4);
        int n4 = 1;
        if (n3 != 0 && (n3 = string2.endsWith(string4)) != 0) {
            n3 = string2.length() - n4;
            string2 = string2.substring(n4, n3);
            string3 = "\\\"";
            string2 = string2.replace(string3, string4);
        } else {
            string4 = "'";
            n3 = string2.startsWith(string4);
            if (n3 != 0 && (n3 = (int)(string2.endsWith(string4) ? 1 : 0)) != 0) {
                n3 = string2.length() - n4;
                string2 = string2.substring(n4, n3);
                string3 = "\\'";
                string2 = string2.replace(string3, string4);
            }
        }
        string2 = string2.replace("\\\n", "");
        string4 = "\\A";
        string3 = "\n";
        string2 = string2.replace(string4, string3);
        int n7 = string2.length();
        if (n7 > n4 && (n7 = (int)(string2.startsWith(string4 = "#") ? 1 : 0)) != 0) {
            string2 = string2.substring(n4);
            return this.b(string2);
        }
        return null;
    }
}

