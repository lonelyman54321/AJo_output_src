/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.b;
import androidx.navigation.i$b;
import androidx.navigation.j;
import androidx.navigation.p;
import androidx.navigation.q$a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

public class i {
    public static final /* synthetic */ int j;
    public final String a;
    public j b;
    public CharSequence c;
    public final ArrayList d;
    public final ca3 e;
    public final LinkedHashMap f;
    public int g;
    public String h;
    public hh3_2 i;

    static {
        new LinkedHashMap();
    }

    public i(p cloneable) {
        Intrinsics.checkNotNullParameter(cloneable, "navigator");
        cloneable = q$a.a(cloneable.getClass());
        Intrinsics.checkNotNullParameter(cloneable, "navigatorName");
        this.a = cloneable;
        this.d = cloneable = new Cloneable();
        super(0);
        this.e = cloneable;
        super();
        this.f = cloneable;
    }

    public final Bundle a(Bundle object) {
        Object object2;
        String string2;
        Object object3;
        boolean bl2;
        boolean bl3;
        Object object4 = this.f;
        if (object == null && (bl3 = object4.isEmpty())) {
            return null;
        }
        Bundle bundle = new Bundle();
        Object object5 = ((LinkedHashMap)object4).entrySet().iterator();
        while (true) {
            bl2 = object5.hasNext();
            object3 = "bundle";
            string2 = "name";
            if (!bl2) break;
            object2 = object5.next();
            String string3 = (String)object2.getKey();
            object2 = (b)object2.getValue();
            object2.getClass();
            Intrinsics.checkNotNullParameter(string3, string2);
            Intrinsics.checkNotNullParameter(bundle, (String)object3);
            boolean bl4 = ((b)object2).c;
            if (!bl4 || (object3 = ((b)object2).e) == null) continue;
            object2 = ((b)object2).a;
            ((cU1)object2).e(bundle, string3, object3);
        }
        if (object != null) {
            boolean bl5;
            bundle.putAll((Bundle)object);
            object = ((LinkedHashMap)object4).entrySet().iterator();
            while (bl5 = object.hasNext()) {
                object4 = (Map.Entry)object.next();
                object5 = (String)object4.getKey();
                object4 = (b)object4.getValue();
                bl2 = ((b)object4).d;
                if (bl2) continue;
                Intrinsics.checkNotNullParameter(object5, string2);
                Intrinsics.checkNotNullParameter(bundle, (String)object3);
                bl2 = ((b)object4).b;
                object4 = ((b)object4).a;
                if (bl2 || !(bl2 = bundle.containsKey((String)object5)) || (object2 = bundle.get((String)object5)) != null) {
                    try {
                        ((cU1)object4).a(bundle, (String)object5);
                        continue;
                    }
                    catch (ClassCastException classCastException) {}
                }
                object = Gn.a("Wrong argument type for '", (String)object5, "' in argument bundle. ");
                object4 = ((cU1)object4).b();
                ((StringBuilder)object).append((String)object4);
                ((StringBuilder)object).append(" expected.");
                object = ((StringBuilder)object).toString();
                object = object.toString();
                object4 = new IllegalArgumentException((String)object);
                throw object4;
            }
        }
        return bundle;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public i$b c(pT1 var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        Intrinsics.checkNotNullParameter(var1_1, "navDeepLinkRequest");
        var4_4 = this.d;
        var5_5 = var4_4.isEmpty();
        var6_6 = false;
        var7_7 = null;
        if (var5_5) {
            return null;
        }
        var8_8 = var4_4.iterator();
        var9_9 = null;
        block0: while ((var10_10 = var8_8.hasNext()) != 0) {
            block25: {
                block24: {
                    block23: {
                        var4_4 = (gt1_0)var8_8.next();
                        var11_11 = var2_2.f;
                        var12_12 /* !! */  = var3_3.a;
                        if (var12_12 /* !! */  != null) {
                            var13_13 = var4_4.d(var12_12 /* !! */ , (Map)var11_11);
                        } else {
                            var14_14 = 0;
                            var13_13 = null;
                        }
                        var15_15 = var4_4.b(var12_12 /* !! */ );
                        var16_16 = 1;
                        var17_17 = 0;
                        var18_18 = var3_3.b;
                        if (var18_18 != null && (var20_20 = Intrinsics.areEqual(var18_18, var19_19 = var4_4.b)) != 0) {
                            var20_20 = 1;
                        } else {
                            var20_20 = 0;
                            var18_18 = null;
                        }
                        var21_21 = var3_3.c;
                        if (var21_21 == null) ** GOTO lbl-1000
                        var22_22 = "mimeType";
                        Intrinsics.checkNotNullParameter(var21_21, var22_22);
                        var7_7 = var4_4.c;
                        if (var7_7 == null) ** GOTO lbl-1000
                        var19_19 = (Pattern)var4_4.n.getValue();
                        Intrinsics.checkNotNull(var19_19);
                        var19_19 = var19_19.matcher(var21_21);
                        var23_23 = var19_19.matches();
                        if (var23_23 != 0) {
                            Intrinsics.checkNotNullParameter(var7_7, var22_22);
                            var22_22 = "/";
                            var19_19 = new Regex(var22_22);
                            var7_7 = var19_19.e((CharSequence)var7_7);
                            var23_23 = var7_7.isEmpty();
                            if (var23_23 == 0) {
                                var23_23 = var7_7.size();
                                var19_19 = var7_7.listIterator(var23_23);
                                while ((var24_24 = var19_19.hasPrevious()) != 0) {
                                    var22_22 = (String)var19_19.previous();
                                    var24_24 = var22_22.length();
                                    if (var24_24 == 0) continue;
                                    var7_7 = (Iterable)var7_7;
                                    var23_23 = var19_19.nextIndex() + var16_16;
                                    var7_7 = CollectionsKt.f0((Iterable)var7_7, var23_23);
                                    break;
                                }
                            } else {
                                var7_7 = mz0_2.a;
                            }
                            var19_19 = (String)var7_7.get(0);
                            var25_25 /* !! */  = (String)var7_7.get(var16_16);
                            var7_7 = new gT1$a(var21_21);
                            Intrinsics.checkNotNullParameter(var7_7, "other");
                            var21_21 = var7_7.a;
                            var23_23 = (int)Intrinsics.areEqual(var19_19, var21_21);
                            if (var23_23 != 0) {
                                var17_17 = 2;
                            }
                            if ((var16_16 = (int)Intrinsics.areEqual(var25_25 /* !! */ , var7_7 = var7_7.b)) != 0) {
                                ++var17_17;
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            var17_17 = -1;
                        }
                        if (var13_13 != null) break block23;
                        if (var20_20 == 0 && var17_17 <= (var16_16 = -1)) break block24;
                        Intrinsics.checkNotNullParameter(var11_11, "arguments");
                        var25_25 /* !! */  = new Bundle();
                        if (var12_12 /* !! */  != null) {
                            var7_7 = (Pattern)var4_4.f.getValue();
                            if (var7_7 != null) {
                                var19_19 = var12_12 /* !! */ .toString();
                                var7_7 = var7_7.matcher((CharSequence)var19_19);
                            } else {
                                var6_6 = false;
                                var7_7 = null;
                            }
                            if (var7_7 != null && (var23_23 = var7_7.matches()) != 0) {
                                var4_4.e((Matcher)var7_7, var25_25 /* !! */ , (Map)var11_11);
                                var7_7 = (Boolean)var4_4.g.getValue();
                                var6_6 = var7_7.booleanValue();
                                if (var6_6) {
                                    var4_4.f(var12_12 /* !! */ , var25_25 /* !! */ , (Map)var11_11);
                                }
                            }
                        }
                        if (!(var5_5 = (var11_11 = RS1.a((Map)var11_11, (Function1)(var12_12 /* !! */  = new rt1_2(var25_25 /* !! */ )))).isEmpty())) break block24;
                    }
                    var16_16 = (int)var4_4.o;
                    var4_4 = var7_7;
                    var11_11 = this;
                    var12_12 /* !! */  = var13_13;
                    var14_14 = var16_16;
                    var16_16 = var20_20;
                    var7_7 = new i$b(this, var13_13, (boolean)var14_14, var15_15, (boolean)var20_20, var17_17);
                    if (var9_9 == null || (var10_10 = var7_7.a((i$b)var9_9)) > 0) break block25;
                }
lbl101:
                // 2 sources

                while (true) {
                    var6_6 = false;
                    var7_7 = null;
                    continue block0;
                    break;
                }
            }
            var9_9 = var7_7;
            ** continue;
        }
        return var9_9;
    }

    public final i$b d(String object) {
        Intrinsics.checkNotNullParameter(object, "route");
        Object object2 = this.i;
        if (object2 != null && (object2 = (gt1_0)((hh3_2)object2).getValue()) != null) {
            Object object3;
            if (object != null) {
                object3 = "android-app://androidx.navigation/";
                object = ((String)object3).concat((String)object);
            } else {
                object = "";
            }
            object = Uri.parse((String)object);
            Intrinsics.checkExpressionValueIsNotNull(object, "Uri.parse(this)");
            object3 = this.f;
            Bundle bundle = ((gt1_0)object2).d((Uri)object, (Map)object3);
            if (bundle == null) {
                return null;
            }
            int n3 = ((gt1_0)object2).b((Uri)object);
            boolean bl2 = ((gt1_0)object2).o;
            object = new i$b(this, bundle, bl2, n3, false, -1);
            return object;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean equals(Object var1_1) {
        var2_2 = true;
        if (this == var1_1) {
            return var2_2;
        }
        if (var1_1 != null && (var3_3 = var1_1 instanceof i)) {
            var4_4 = this.d;
            var1_1 = (i)var1_1;
            var5_5 = var1_1.d;
            var3_3 = Intrinsics.areEqual(var4_4, var5_5);
            var5_5 = this.e;
            var6_6 = var5_5.j();
            var7_7 = var1_1.e;
            var8_8 = var7_7.j();
            var9_9 /* !! */  = "<this>";
            if (var6_6 == var8_8) {
                Intrinsics.checkNotNullParameter(var5_5, var9_9 /* !! */ );
                var10_10 = new Iterator<T>((ca3)var5_5);
                var10_10 = ez2_1.b(var10_10).iterator();
                while ((var8_8 = (int)var10_10.hasNext()) != 0) {
                    var8_8 = ((Number)var10_10.next()).intValue();
                    var11_11 = var5_5.f(var8_8);
                    if ((var8_8 = (int)Intrinsics.areEqual(var11_11, var12_12 = var7_7.f(var8_8))) != 0) continue;
                    ** break block10
                }
                var13_13 = true;
            } else lbl-1000:
            // 2 sources

            {
                var13_13 = false;
                var5_5 = null;
            }
            var10_10 = this.f;
            var14_14 = var10_10.size();
            var12_12 = var1_1.f;
            var15_15 = var12_12.size();
            if (var14_14 == var15_15) {
                Intrinsics.checkNotNullParameter(var10_10, var9_9 /* !! */ );
                var10_10 = CollectionsKt.E((Iterable)((Iterable)var10_10.entrySet())).a.iterator();
                while ((var14_14 = (int)var10_10.hasNext()) != 0) {
                    var7_7 = (Map.Entry)var10_10.next();
                    var9_9 /* !! */  = var7_7.getKey();
                    var16_16 = var12_12.containsKey(var9_9 /* !! */ );
                    if (!var16_16) ** break block11
                    var9_9 /* !! */  = var7_7.getKey();
                    var14_14 = (int)Intrinsics.areEqual(var9_9 /* !! */  = var12_12.get(var9_9 /* !! */ ), var7_7 = var7_7.getValue());
                    if (var14_14 != 0) {
                        continue;
                    }
                    ** break block11
                }
                var6_6 = 1;
            } else lbl-1000:
            // 3 sources

            {
                var6_6 = 0;
                var10_10 = null;
            }
            var14_14 = this.g;
            var8_8 = var1_1.g;
            if (!(var14_14 == var8_8 && (var17_17 = Intrinsics.areEqual(var7_7 = this.h, var1_1 = var1_1.h)) && var3_3 && var13_13 && var6_6 != 0)) {
                var2_2 = false;
            }
            return var2_2;
        }
        return false;
    }

    public int hashCode() {
        int n3;
        String string2;
        Object object;
        int n4;
        int n7;
        int n8 = this.g;
        int n10 = 31;
        n8 *= 31;
        Object object2 = this.h;
        if (object2 != null) {
            n7 = object2.hashCode();
        } else {
            n7 = 0;
            object2 = null;
        }
        n8 += n7;
        object2 = this.d.iterator();
        while ((n4 = object2.hasNext()) != 0) {
            object = (gt1_0)object2.next();
            n8 *= 31;
            string2 = ((gt1_0)object).a;
            if (string2 != null) {
                n3 = string2.hashCode();
            } else {
                n3 = 0;
                string2 = null;
            }
            n8 = (n8 + n3) * 31;
            string2 = ((gt1_0)object).b;
            if (string2 != null) {
                n3 = string2.hashCode();
            } else {
                n3 = 0;
                string2 = null;
            }
            n8 = (n8 + n3) * 31;
            object = ((gt1_0)object).c;
            if (object != null) {
                n4 = object.hashCode();
            } else {
                n4 = 0;
                object = null;
            }
            n8 += n4;
        }
        object = this.e;
        Intrinsics.checkNotNullParameter(object, "<this>");
        n7 = 0;
        object2 = null;
        while (true) {
            if (n7 < (n3 = ((ca3)object).j())) {
                n3 = 1;
            } else {
                n3 = 0;
                string2 = null;
            }
            if (n3 == 0) break;
            n3 = n7 + 1;
            object2 = (QS1)((ca3)object).k(n7);
            object2.getClass();
            n8 *= 961;
            n7 = n3;
        }
        object2 = this.f;
        object = ((Iterable)((LinkedHashMap)object2).keySet()).iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            string2 = (String)object.next();
            n8 = zy_2.b(n8 * 31, n10, string2);
            if ((string2 = ((LinkedHashMap)object2).get(string2)) != null) {
                n3 = string2.hashCode();
            } else {
                n3 = 0;
                string2 = null;
            }
            n8 += n3;
        }
        return n8;
    }

    public String toString() {
        CharSequence charSequence = new StringBuilder();
        CharSequence charSequence2 = this.getClass().getSimpleName();
        ((StringBuilder)charSequence).append((String)charSequence2);
        ((StringBuilder)charSequence).append("(");
        ((StringBuilder)charSequence).append("0x");
        int n3 = this.g;
        charSequence2 = Integer.toHexString(n3);
        ((StringBuilder)charSequence).append((String)charSequence2);
        ((StringBuilder)charSequence).append(")");
        charSequence2 = this.h;
        if (charSequence2 != null && (n3 = (int)(kotlin.text.b.k(charSequence2) ? 1 : 0)) == 0) {
            ((StringBuilder)charSequence).append(" route=");
            charSequence2 = this.h;
            ((StringBuilder)charSequence).append((String)charSequence2);
        }
        if ((charSequence2 = this.c) != null) {
            ((StringBuilder)charSequence).append(" label=");
            charSequence2 = this.c;
            ((StringBuilder)charSequence).append(charSequence2);
        }
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "sb.toString()");
        return charSequence;
    }
}

