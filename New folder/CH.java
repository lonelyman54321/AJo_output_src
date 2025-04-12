/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Locale;

public final class CH {
    public final CH$f a;
    public final CH$u b;
    public boolean c = false;

    public CH(CH$f cH$f, CH$u cH$u) {
        this.a = cH$f;
        this.b = cH$u;
    }

    public static int a(ArrayList object, int n3, rR2$L rR2$L) {
        int n4 = 0;
        if (n3 < 0) {
            return 0;
        }
        object = ((ArrayList)object).get(n3);
        Object object2 = rR2$L.b;
        int n7 = -1;
        if (object != object2) {
            return n7;
        }
        object = object2.b().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (rR2$N)object.next();
            if (object2 == rR2$L) {
                return n4;
            }
            ++n4;
        }
        return n7;
    }

    public static ArrayList c(CH$d cH$d) {
        int n3;
        ArrayList<CH$f> arrayList = new ArrayList<CH$f>();
        while ((n3 = cH$d.f()) == 0) {
            CH$f cH$f;
            n3 = cH$d.f();
            int n4 = 0;
            String string2 = null;
            if (n3 == 0) {
                n3 = cH$d.b;
                String string3 = cH$d.a;
                char c2 = string3.charAt(n3);
                char c3 = 'z';
                char c5 = 'a';
                char c6 = 'Z';
                char c7 = 'A';
                if (c2 >= c7 && c2 <= c6 || c2 >= c5 && c2 <= c3) {
                    n4 = cH$d.a();
                    while (n4 >= c7 && n4 <= c6 || n4 >= c5 && n4 <= c3) {
                        n4 = cH$d.a();
                    }
                    n4 = cH$d.b;
                    string2 = string3.substring(n3, n4);
                } else {
                    cH$d.b = n3;
                }
            }
            if (string2 == null) break;
            try {
                cH$f = CH$f.valueOf(string2);
            }
            catch (IllegalArgumentException illegalArgumentException) {}
            arrayList.add(cH$f);
            if ((n3 = (int)(cH$d.p() ? 1 : 0)) != 0) continue;
        }
        return arrayList;
    }

    public static boolean f(CH$q cH$q, CH$s cH$s, int n3, ArrayList arrayList, int n4, rR2$L object) {
        Object object2 = (CH$t)cH$s.a.get(n3);
        boolean bl2 = CH.i(cH$q, object2, (rR2$L)object);
        if (!bl2) {
            return false;
        }
        CH$e cH$e = CH$e.DESCENDANT;
        object2 = object2.a;
        int n7 = 1;
        if (object2 == cH$e) {
            if (n3 == 0) {
                return n7 != 0;
            }
            while (n4 >= 0) {
                int n8 = n3 + -1;
                if ((n8 = (int)(CH.h(cH$q, cH$s, n8, arrayList, n4) ? 1 : 0)) != 0) {
                    return n7 != 0;
                }
                n4 += -1;
            }
            return false;
        }
        cH$e = CH$e.CHILD;
        if (object2 == cH$e) {
            return CH.h(cH$q, cH$s, n3 -= n7, arrayList, n4);
        }
        int n10 = CH.a(arrayList, n4, (rR2$L)object);
        if (n10 <= 0) {
            return false;
        }
        object = ((rR2$N)object).b.b();
        Object object3 = object = object.get(n10 -= n7);
        object3 = (rR2$L)object;
        int n14 = n3 + -1;
        return CH.f(cH$q, cH$s, n14, arrayList, n4, (rR2$L)object3);
    }

    public static boolean g(CH$q cH$q, CH$s object, rR2$L rR2$L) {
        int n3;
        ArrayList<rR2$J> arrayList = new ArrayList<rR2$J>();
        Object object2 = rR2$L.b;
        while (true) {
            n3 = 0;
            if (object2 == null) break;
            arrayList.add(0, (rR2$J)object2);
            object2 = ((rR2$N)object2).b;
        }
        int n4 = arrayList.size();
        int n7 = 1;
        int n8 = n4 + -1;
        object2 = ((CH$s)object).a;
        if (object2 == null) {
            n4 = 0;
            object2 = null;
        } else {
            n4 = ((ArrayList)object2).size();
        }
        if (n4 == n7) {
            object = (CH$t)((CH$s)object).a.get(0);
            return CH.i(cH$q, (CH$t)object, rR2$L);
        }
        object2 = ((CH$s)object).a;
        if (object2 != null) {
            n3 = ((ArrayList)object2).size();
        }
        n7 = n3 + -1;
        object2 = cH$q;
        return CH.f(cH$q, (CH$s)object, n7, arrayList, n8, rR2$L);
    }

    public static boolean h(CH$q cH$q, CH$s cH$s, int n3, ArrayList arrayList, int n4) {
        Object object;
        Object object2 = (CH$t)cH$s.a.get(n3);
        boolean bl2 = CH.i(cH$q, object2, (rR2$L)(object = (rR2$L)arrayList.get(n4)));
        if (!bl2) {
            return false;
        }
        CH$e cH$e = CH$e.DESCENDANT;
        object2 = object2.a;
        int n7 = 1;
        if (object2 == cH$e) {
            if (n3 == 0) {
                return n7 != 0;
            }
            while (n4 > 0) {
                int n8 = n3 + -1;
                if ((n8 = (int)(CH.h(cH$q, cH$s, n8, arrayList, n4 += -1) ? 1 : 0)) == 0) continue;
                return n7 != 0;
            }
            return false;
        }
        cH$e = CH$e.CHILD;
        if (object2 == cH$e) {
            return CH.h(cH$q, cH$s, n3 -= n7, arrayList, n4 -= n7);
        }
        int n10 = CH.a(arrayList, n4, (rR2$L)object);
        if (n10 <= 0) {
            return false;
        }
        object = ((rR2$N)object).b.b();
        Object object3 = object2 = object.get(n10 -= n7);
        object3 = (rR2$L)object2;
        int n14 = n3 + -1;
        return CH.f(cH$q, cH$s, n14, arrayList, n4, (rR2$L)object3);
    }

    public static boolean i(CH$q cH$q, CH$t iterator, rR2$L rR2$L) {
        boolean bl2;
        Object object;
        Object object2;
        Object object3 = ((CH$t)((Object)iterator)).b;
        if (object3 != null) {
            object2 = rR2$L.n();
            object = Locale.US;
            bl2 = ((String)object3).equals(object2 = ((String)object2).toLowerCase((Locale)object));
            if (!bl2) {
                return false;
            }
        }
        if ((object3 = ((CH$t)((Object)iterator)).c) != null) {
            boolean bl3;
            object3 = ((ArrayList)object3).iterator();
            while (bl3 = object3.hasNext()) {
                object2 = (CH$b)object3.next();
                object = ((CH$b)object2).a;
                object.getClass();
                object2 = ((CH$b)object2).c;
                String string2 = "id";
                boolean bl4 = ((String)object).equals(string2);
                if (!bl4) {
                    string2 = "class";
                    boolean bl5 = ((String)object).equals(string2);
                    if (!bl5) {
                        return false;
                    }
                    object = rR2$L.g;
                    if (object == null) {
                        return false;
                    }
                    bl3 = object.contains(object2);
                    if (bl3) continue;
                    return false;
                }
                object = rR2$L.c;
                bl3 = ((String)object2).equals(object);
                if (bl3) continue;
                return false;
            }
        }
        if ((iterator = ((CH$t)((Object)iterator)).d) != null) {
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while (bl2 = iterator.hasNext()) {
                object3 = (CH$g)iterator.next();
                bl2 = object3.a(cH$q, rR2$L);
                if (bl2) continue;
                return false;
            }
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(CH$r var1_1, CH$d var2_2) {
        block22: {
            block25: {
                block23: {
                    block24: {
                        block21: {
                            var3_3 = var2_2.t();
                            var2_2.q();
                            if (var3_3 == null) break block22;
                            var4_4 = this.c;
                            var5_5 = 1;
                            var6_6 = "Invalid @media rule: expected '}' at end of rule set";
                            var7_7 = 125;
                            var8_8 = 0;
                            var9_9 = 123;
                            if (var4_4 != 0 || (var4_4 = (int)var3_3.equals(var10_10 /* !! */  = "media")) == 0) break block23;
                            var3_3 = CH.c(var2_2);
                            var4_4 = (int)var2_2.d((char)var9_9);
                            if (var4_4 == 0) break block24;
                            var2_2.q();
                            var10_10 /* !! */  = this.a;
                            var3_3 = var3_3.iterator();
                            while ((var9_9 = (int)var3_3.hasNext()) != 0) {
                                var11_11 = (CH$f)var3_3.next();
                                if (var11_11 != (var12_13 = CH$f.all) && var11_11 != var10_10 /* !! */ ) continue;
                                this.c = var5_5;
                                var3_3 = this.e(var2_2);
                                var1_1.b((CH$r)var3_3);
                                this.c = false;
                                break block21;
                            }
                            this.e(var2_2);
                        }
                        var13_14 = var2_2.f();
                        if (!var13_14 && !(var13_14 = var2_2.d((char)var7_7))) {
                            var1_1 = new Exception(var6_6);
                            throw var1_1;
                        }
                        break block25;
                    }
                    var1_1 = new Exception("Invalid @media rule: missing rule set");
                    throw var1_1;
                }
                var13_15 = this.c;
                var4_4 = 59;
                if (var13_15 != 0 || (var13_15 = var3_3.equals(var1_1 = "import")) == 0) ** GOTO lbl107
                var13_15 = var2_2.f();
                var3_3 = null;
                if (var13_15 == 0) {
                    var13_15 = var2_2.b;
                    var14_16 = "url(";
                    var7_7 = (int)var2_2.e((String)var14_16);
                    if (var7_7 != 0) {
                        var2_2.q();
                        var14_16 = var2_2.s();
                        if (var14_16 == null) {
                            var14_16 = new StringBuilder();
                            while ((var8_8 = (int)var2_2.f()) == 0) {
                                var8_8 = var2_2.b;
                                var11_12 = var2_2.a;
                                if ((var8_8 = (int)var11_12.charAt(var8_8)) == (var15_17 = 39) || var8_8 == (var15_17 = 34) || var8_8 == (var15_17 = 40) || var8_8 == (var15_17 = 41) || (var15_17 = (int)uR2$i.g(var8_8)) != 0 || (var15_17 = (int)Character.isISOControl(var8_8)) != 0) break;
                                var2_2.b = var15_17 = var2_2.b + var5_5;
                                var15_17 = 92;
                                if (var8_8 == var15_17) {
                                    var8_8 = (int)var2_2.f();
                                    if (var8_8 != 0) continue;
                                    var8_8 = var2_2.b;
                                    var2_2.b = var15_17 = var8_8 + 1;
                                    if ((var8_8 = (int)var11_12.charAt(var8_8)) == (var15_17 = 10) || var8_8 == (var15_17 = 13) || var8_8 == (var15_17 = 12)) continue;
                                    var15_17 = CH$d.r(var8_8);
                                    if (var15_17 != (var16_18 = -1)) {
                                        for (var8_8 = 1; var8_8 <= (var17_19 = 5) && (var17_19 = (int)var2_2.f()) == 0; ++var8_8) {
                                            var17_19 = var2_2.b;
                                            if ((var17_19 = CH$d.r(var11_12.charAt(var17_19))) == var16_18) break;
                                            var2_2.b = var18_20 = var2_2.b + var5_5;
                                            var15_17 = var15_17 * 16 + var17_19;
                                        }
                                        var8_8 = (char)var15_17;
                                        var14_16.append((char)var8_8);
                                        continue;
                                    }
                                }
                                var8_8 = (char)var8_8;
                                var14_16.append((char)var8_8);
                            }
                            if ((var5_5 = var14_16.length()) == 0) {
                                var7_7 = 0;
                                var14_16 = null;
                            } else {
                                var19_21 = var14_16.toString();
                                var14_16 = var19_21;
                            }
                        }
                        if (var14_16 == null) {
                            var2_2.b = var13_15;
                        } else {
                            var2_2.q();
                            var5_5 = var2_2.f();
                            if (var5_5 == 0 && (var5_5 = (int)var2_2.e(var19_21 = ")")) == 0) {
                                var2_2.b = var13_15;
                            } else {
                                var3_3 = var14_16;
                            }
                        }
                    }
                }
                if (var3_3 == null) {
                    var3_3 = var2_2.s();
                }
                if (var3_3 != null) {
                    var2_2.q();
                    CH.c(var2_2);
                    var13_15 = (int)var2_2.f();
                    if (var13_15 == 0 && (var13_15 = (int)var2_2.d((char)var4_4)) == 0) {
                        var1_1 = new Exception(var6_6);
                        throw var1_1;
                    }
                } else {
                    var1_1 = new Exception("Invalid @import rule: expected string or url()");
                    throw var1_1;
lbl107:
                    // 3 sources

                    while ((var13_15 = var2_2.f()) == 0 && ((var13_15 = (var1_1 = var2_2.h()).intValue()) != var4_4 || var8_8 != 0)) {
                        if (var13_15 == var9_9) {
                            ++var8_8;
                            continue;
                        }
                        if (var13_15 != var7_7 || var8_8 <= 0 || (var8_8 += -1) != 0) continue;
                    }
                }
            }
            var2_2.q();
            return;
        }
        var1_1 = new Exception("Invalid '@' rule");
        throw var1_1;
    }

    public final boolean d(CH$r object, CH$d object2) {
        boolean bl2;
        Object object3 = ((CH$d)((Object)object2)).u();
        if (object3 != null && !(bl2 = ((ArrayList)object3).isEmpty())) {
            bl2 = ((uR2$i)((Object)object2)).d('{');
            if (bl2) {
                block12: {
                    block13: {
                        boolean bl3;
                        boolean bl4;
                        Object object4;
                        int n3;
                        boolean bl5;
                        ((uR2$i)((Object)object2)).q();
                        rR2$E rR2$E = new rR2$E();
                        do {
                            object4 = ((CH$d)((Object)object2)).t();
                            ((uR2$i)((Object)object2)).q();
                            int n4 = ((uR2$i)((Object)object2)).d(':');
                            if (n4 == 0) break block12;
                            ((uR2$i)((Object)object2)).q();
                            n4 = ((uR2$i)((Object)object2)).f();
                            bl4 = true;
                            int n7 = 33;
                            n3 = 125;
                            int n8 = 59;
                            String string2 = null;
                            if (n4 == 0) {
                                int n10;
                                n4 = ((uR2$i)((Object)object2)).b;
                                String string3 = ((uR2$i)((Object)object2)).a;
                                int n14 = string3.charAt(n4);
                                int n15 = n4;
                                while (n14 != (n10 = -1) && n14 != n8 && n14 != n3 && n14 != n7 && n14 != (n10 = 10) && n14 != (n10 = 13)) {
                                    if ((n14 = (int)(uR2$i.g(n14) ? 1 : 0)) == 0) {
                                        n14 = ((uR2$i)((Object)object2)).b;
                                        n15 = n14 + 1;
                                    }
                                    n14 = ((uR2$i)((Object)object2)).a();
                                }
                                n14 = ((uR2$i)((Object)object2)).b;
                                if (n14 > n4) {
                                    string2 = string3.substring(n4, n15);
                                } else {
                                    ((uR2$i)((Object)object2)).b = n4;
                                }
                            }
                            if (string2 == null) break block13;
                            ((uR2$i)((Object)object2)).q();
                            n4 = ((uR2$i)((Object)object2)).d((char)n7) ? 1 : 0;
                            if (n4 != 0) {
                                ((uR2$i)((Object)object2)).q();
                                String string4 = "important";
                                n4 = ((uR2$i)((Object)object2)).e(string4) ? 1 : 0;
                                if (n4 != 0) {
                                    ((uR2$i)((Object)object2)).q();
                                } else {
                                    object = new Exception("Malformed rule set: found unexpected '!'");
                                    throw object;
                                }
                            }
                            ((uR2$i)((Object)object2)).d((char)n8);
                            uR2.E(rR2$E, (String)object4, string2);
                            ((uR2$i)((Object)object2)).q();
                            bl5 = ((uR2$i)((Object)object2)).f();
                        } while (!bl5 && !(bl5 = ((uR2$i)((Object)object2)).d((char)n3)));
                        ((uR2$i)((Object)object2)).q();
                        object2 = ((ArrayList)object3).iterator();
                        while (bl3 = object2.hasNext()) {
                            object3 = (CH$s)object2.next();
                            object4 = new Object();
                            ((CH$p)object4).a = object3;
                            ((CH$p)object4).b = rR2$E;
                            object3 = this.b;
                            ((CH$p)object4).c = object3;
                            ((CH$r)object).a((CH$p)object4);
                        }
                        return bl4;
                    }
                    object = new Exception("Expected property value");
                    throw object;
                }
                object = new Exception("Expected ':'");
                throw object;
            }
            object = new Exception("Malformed rule block: expected '{'");
            throw object;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final CH$r e(CH$d cH$d) {
        BH bH3;
        CH$r cH$r = new CH$r();
        while (true) {
            char c2;
            block6: {
                try {
                    while ((c2 = cH$d.f()) == '\u0000') {
                        String string2 = "<!--";
                        c2 = cH$d.e(string2);
                        if (c2 != '\u0000' || (c2 = cH$d.e(string2 = "-->")) != '\u0000') continue;
                        c2 = '@';
                        if ((c2 = (char)(cH$d.d(c2) ? 1 : 0)) != '\u0000') {
                            this.b(cH$r, cH$d);
                            continue;
                        }
                        break block6;
                    }
                    return cH$r;
                }
                catch (BH bH3) {
                    break;
                }
            }
            c2 = (char)(this.d(cH$r, cH$d) ? 1 : 0);
            if (c2 == '\u0000') return cH$r;
        }
        bH3.getMessage();
        return cH$r;
    }
}

