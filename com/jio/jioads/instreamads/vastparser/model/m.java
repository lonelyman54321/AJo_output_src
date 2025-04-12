/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.text.TextUtils
 */
package com.jio.jioads.instreamads.vastparser.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.instreamads.vastparser.model.b;
import com.jio.jioads.instreamads.vastparser.model.c;
import com.jio.jioads.instreamads.vastparser.model.f;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.k;
import com.jio.jioads.instreamads.vastparser.model.l;
import com.jio.jioads.instreamads.vastparser.model.n;
import com.jio.jioads.util.Utility;
import com.jio.jioads.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;

public final class m {
    public n a;
    public String b;
    public List c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public ArrayList h;
    public String i;
    public final HashMap j;

    public m() {
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        hashMap = new HashMap();
        this.g = hashMap;
        hashMap = new HashMap();
        this.h = hashMap;
        hashMap = com.jio.jioads.util.b.b.a();
        this.i = hashMap;
        this.j = hashMap = new HashMap();
    }

    public static String c(Context object, String stringArray, String string2, String string3) {
        int n3;
        String string4 = "video_cache_pref";
        object = j_0.o((Context)object, string4);
        if ((object = com.jio.jioads.utils.h.b((String)stringArray, (SharedPreferences)object, string3, string2)) != null && (n3 = ((String)object).length()) != 0) {
            int n4;
            stringArray = "#";
            try {
                stringArray = new String[]{stringArray};
                n4 = 6;
                string3 = null;
            }
            catch (Exception exception) {}
            object = StringsKt.a0((CharSequence)object, stringArray, false, 0, n4);
            stringArray = new String[]{};
            object = object.toArray(stringArray);
            object = (String[])object;
            return object[0];
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public static List f(j var0) {
        var1_1 = var0.n;
        var2_2 = 1;
        var3_3 = null;
        if (var1_1 == null || (var1_1 = var1_1.g) == null || (var4_4 = var1_1.isEmpty() ^ var2_2) != var2_2) ** GOTO lbl-1000
        var1_1 = var0.n;
        if (var1_1 != null && (var1_1 = var1_1.g) != null && (var1_1 = (c)CollectionsKt.firstOrNull((List)var1_1)) != null) {
            var1_1 = var1_1.d;
        } else {
            var4_4 = false;
            var1_1 = null;
        }
        if (var1_1 != null && (var1_1 = var0.n) != null && (var1_1 = var1_1.g) != null && (var1_1 = (c)CollectionsKt.firstOrNull((List)var1_1)) != null) {
            var1_1 = var1_1.d;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = false;
            var1_1 = null;
        }
        if (var1_1 != null && (var5_5 = var1_1.isEmpty()) == 0 || (var6_6 = var0.n) == null || (var6_6 = var6_6.g) == null || (var5_5 = var6_6.size()) <= var2_2) ** GOTO lbl-1000
        var6_6 = var0.n;
        if (var6_6 != null && (var6_6 = var6_6.g) != null && (var6_6 = (c)CollectionsKt.N(var2_2, (List)var6_6)) != null) {
            var6_6 = var6_6.d;
        } else {
            var5_5 = 0;
            var6_6 = null;
        }
        if (var6_6 != null) {
            var0 = var0.n;
            if (var0 != null && (var0 = var0.g) != null && (var0 = (c)CollectionsKt.N(var2_2, (List)var0)) != null) {
                var3_3 = var0.d;
            }
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = var1_1;
        }
        return var3_3;
    }

    /*
     * Unable to fully structure code
     */
    public static f i(j var0) {
        var1_1 = null;
        if (var0 != null) {
            var2_2 = var0.n;
        } else {
            var3_3 = 0;
            var2_2 = null;
        }
        var4_4 = 1;
        if (var2_2 == null) ** GOTO lbl-1000
        var2_2 = var0.n;
        if (var2_2 != null) {
            var5_5 = var2_2.g;
        } else {
            var6_6 = 0;
            var5_5 = null;
        }
        if (var5_5 == null || var2_2 == null || (var2_2 = var2_2.g) == null || (var3_3 = var2_2.isEmpty() ^ var4_4) != var4_4) ** GOTO lbl-1000
        var2_2 = var0.n;
        if (var2_2 != null && (var2_2 = var2_2.g) != null && (var2_2 = (c)CollectionsKt.firstOrNull((List)var2_2)) != null) {
            var2_2 = var2_2.c;
        } else {
            var3_3 = 0;
            var2_2 = null;
        }
        if (var2_2 != null && (var2_2 = var0.n) != null && (var2_2 = var2_2.g) != null && (var2_2 = (c)CollectionsKt.firstOrNull((List)var2_2)) != null) {
            var2_2 = var2_2.c;
        } else lbl-1000:
        // 3 sources

        {
            var3_3 = 0;
            var2_2 = null;
        }
        if (var2_2 != null || var0 == null || (var5_5 = var0.n) == null || (var5_5 = var5_5.g) == null || (var6_6 = var5_5.size()) <= var4_4) ** GOTO lbl-1000
        var5_5 = var0.n;
        if (var5_5 != null && (var5_5 = var5_5.g) != null && (var5_5 = (c)CollectionsKt.N(var4_4, (List)var5_5)) != null) {
            var5_5 = var5_5.c;
        } else {
            var6_6 = 0;
            var5_5 = null;
        }
        if (var5_5 != null) {
            var0 = var0.n;
            if (var0 != null && (var0 = var0.g) != null && (var0 = (c)CollectionsKt.N(var4_4, (List)var0)) != null) {
                var1_1 = var0.c;
            }
        } else lbl-1000:
        // 2 sources

        {
            var1_1 = var2_2;
        }
        return var1_1;
    }

    /*
     * Unable to fully structure code
     */
    public static f k(j var0) {
        var1_1 = null;
        if (var0 != null) {
            var2_2 = var0.m;
        } else {
            var3_3 = 0;
            var2_2 = null;
        }
        var4_4 = 1;
        if (var2_2 == null) ** GOTO lbl-1000
        var2_2 = var0.m;
        if (var2_2 != null) {
            var5_5 = var2_2.i;
        } else {
            var6_6 = 0;
            var5_5 = null;
        }
        if (var5_5 == null || var2_2 == null || (var2_2 = var2_2.i) == null || (var3_3 = var2_2.isEmpty() ^ var4_4) != var4_4) ** GOTO lbl-1000
        var2_2 = var0.m;
        if (var2_2 != null && (var2_2 = var2_2.i) != null && (var2_2 = (c)CollectionsKt.firstOrNull((List)var2_2)) != null) {
            var2_2 = var2_2.c;
        } else {
            var3_3 = 0;
            var2_2 = null;
        }
        if (var2_2 != null && (var2_2 = var0.m) != null && (var2_2 = var2_2.i) != null && (var2_2 = (c)CollectionsKt.firstOrNull((List)var2_2)) != null) {
            var2_2 = var2_2.c;
        } else lbl-1000:
        // 3 sources

        {
            var3_3 = 0;
            var2_2 = null;
        }
        if (var2_2 != null || var0 == null || (var5_5 = var0.m) == null || (var5_5 = var5_5.i) == null || (var6_6 = var5_5.size()) <= var4_4) ** GOTO lbl-1000
        var5_5 = var0.m;
        if (var5_5 != null && (var5_5 = var5_5.i) != null && (var5_5 = (c)CollectionsKt.N(var4_4, (List)var5_5)) != null) {
            var5_5 = var5_5.c;
        } else {
            var6_6 = 0;
            var5_5 = null;
        }
        if (var5_5 != null) {
            var0 = var0.m;
            if (var0 != null && (var0 = var0.i) != null && (var0 = (c)CollectionsKt.N(var4_4, (List)var0)) != null) {
                var1_1 = var0.c;
            }
        } else lbl-1000:
        // 2 sources

        {
            var1_1 = var2_2;
        }
        return var1_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String a(int n3) {
        Object object;
        Object object2;
        block6: {
            block7: {
                object2 = null;
                ArrayList arrayList = this.g;
                try {
                    int n4;
                    int n7 = arrayList.isEmpty() ^ 1;
                    if (n7 != 0 && (n7 = arrayList.size()) > n3) {
                        object = CollectionsKt.N(n3, arrayList);
                        if ((object = (k)object) == null) break block6;
                        object = ((k)object).b;
                        break block7;
                    }
                    arrayList = this.h;
                    if (arrayList == null || (n4 = arrayList.size()) <= n3 || (arrayList = this.h) == null) break block6;
                    object = CollectionsKt.N(n3, arrayList);
                    if ((object = (k)object) == null) break block6;
                    object = ((k)object).b;
                }
                catch (Exception exception) {}
            }
            object2 = object;
        }
        if (object2 != null) {
            n3 = (int)(TextUtils.isEmpty(object2) ? 1 : 0);
            if (n3 == 0) return object2;
        }
        object = com.jio.jioads.util.b.b;
        return "progressive";
    }

    public final String b(Context object, int n3, ArrayList object2) {
        block40: {
            block42: {
                Object object3;
                block45: {
                    Object object4;
                    CharSequence charSequence;
                    Object object5;
                    block44: {
                        Object object6;
                        block43: {
                            block41: {
                                boolean bl2;
                                Intrinsics.checkNotNullParameter(object, "context");
                                if (object2 == null) {
                                    return "";
                                }
                                try {
                                    bl2 = object2.isEmpty() ^ true;
                                    if (!bl2) break block40;
                                }
                                catch (Exception exception) {}
                                object3 = object2.get(n3);
                                object3 = (k)object3;
                                object3 = ((k)object3).j;
                                object3 = String.valueOf(object3);
                                bl2 = Boolean.parseBoolean(object3);
                                if (!bl2) break block41;
                                object = object2.get(n3);
                                object = (k)object;
                                object = ((k)object).a;
                                break block42;
                            }
                            object3 = object2.get(n3);
                            object3 = (k)object3;
                            object3 = ((k)object3).a;
                            object6 = object2.get(n3);
                            object6 = (k)object6;
                            object6 = ((k)object6).c;
                            object5 = object2.get(n3);
                            object5 = (k)object5;
                            object5 = ((k)object5).a;
                            if (object5 != null) break block43;
                            return null;
                        }
                        charSequence = new StringBuilder();
                        charSequence.append((String)object6);
                        char c2 = '_';
                        charSequence.append(c2);
                        Object object7 = object2.get(n3);
                        object7 = (k)object7;
                        object7 = ((k)object7).h;
                        charSequence.append((String)object7);
                        charSequence = charSequence.toString();
                        object4 = object2.get(n3);
                        object4 = (k)object4;
                        object4 = ((k)object4).i;
                        object4 = String.valueOf(object4);
                        object2 = this.a;
                        if (object2 == null) break block44;
                        object2 = ((n)object2).y;
                        if (object2 == null) break block44;
                        object2 = ((HashMap)object2).get(object6);
                        object2 = (String)object2;
                        if (object2 == null) break block44;
                        object = object2;
                        break block45;
                    }
                    object = m.c((Context)object, object5, (String)charSequence, object4);
                }
                if (object != null) {
                    n3 = ((String)object).length();
                    if (n3 != 0) break block42;
                }
                object = String.valueOf(object3);
            }
            return object;
        }
        return null;
    }

    public final ArrayList d(Context object, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(object, "context");
        ArrayList<Object> arrayList2 = "urlData";
        Intrinsics.checkNotNullParameter(arrayList, (String)((Object)arrayList2));
        arrayList2 = new ArrayList<Object>();
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2;
            block40: {
                block43: {
                    Object object3;
                    block42: {
                        Object object4;
                        Object object5;
                        block41: {
                            object2 = arrayList.get(i3);
                            object2 = (k)object2;
                            object2 = ((k)object2).a;
                            object2 = String.valueOf(object2);
                            object3 = arrayList.get(i3);
                            object3 = (k)object3;
                            object3 = ((k)object3).j;
                            object5 = Boolean.TRUE;
                            boolean bl2 = Intrinsics.areEqual(object3, object5);
                            if (bl2) break block40;
                            object3 = arrayList.get(i3);
                            object3 = (k)object3;
                            object3 = ((k)object3).c;
                            object5 = new StringBuilder();
                            ((StringBuilder)object5).append((String)object3);
                            char c2 = '_';
                            ((StringBuilder)object5).append(c2);
                            object4 = arrayList.get(i3);
                            object4 = (k)object4;
                            object4 = ((k)object4).h;
                            ((StringBuilder)object5).append((String)object4);
                            object5 = ((StringBuilder)object5).toString();
                            object4 = arrayList.get(i3);
                            object4 = (k)object4;
                            object4 = ((k)object4).c;
                            object4 = String.valueOf(object4);
                            Object object6 = this.a;
                            if (object6 == null) break block41;
                            object6 = ((n)object6).y;
                            if (object6 == null) break block41;
                            object3 = ((HashMap)object6).get(object3);
                            object3 = (String)object3;
                            if (object3 != null) break block42;
                        }
                        object3 = m.c(object, object2, (String)object5, object4);
                    }
                    if (object3 != null) {
                        int n4 = ((String)object3).length();
                        if (n4 == 0) break block43;
                        arrayList2.add(object3);
                        continue;
                    }
                }
                arrayList2.add(object2);
                continue;
            }
            arrayList2.add(object2);
        }
        try {
            object = l.c;
        }
        catch (Exception exception) {
            return null;
        }
        cx_2.w(arrayList2, (Function1)object);
        return arrayList2;
    }

    /*
     * Exception decompiling
     */
    public final List e(Context var1_1, int var2_2, Function2 var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [13, 12 : 94->104)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void g(int var1_1, Context var2_2, String var3_3, List var4_4) {
        block44: {
            var5_5 = Utility.INSTANCE;
            var2_2 /* !! */  = var5_5.getScreenHeightAndWidth((Context)var2_2 /* !! */ );
            var5_5 = tp_2.A(var2_2 /* !! */ );
            var5_5 = (String)var5_5;
            var6_6 = Integer.parseInt((String)var5_5);
            var7_7 = 1;
            var2_2 /* !! */  = tp_2.E(var7_7, var2_2 /* !! */ );
            var2_2 /* !! */  = (String)var2_2 /* !! */ ;
            var8_8 = Integer.parseInt((String)var2_2 /* !! */ );
            var9_9 = new ArrayList<E>();
            var4_4 = var4_4.iterator();
            var10_10 = null;
            var11_11 = var8_8;
            var12_12 = var6_6;
            while (true) {
                block42: {
                    block43: {
                        var13_13 = var4_4.hasNext();
                        if (!var13_13) break;
                        var14_14 /* !! */  = var4_4.next();
                        var14_14 /* !! */  = (b)var14_14 /* !! */ ;
                        var15_15 = var14_14 /* !! */ .d;
                        var16_16 = TextUtils.isEmpty((CharSequence)var15_15);
                        if (var16_16 != 0) break block42;
                        var15_15 = var14_14 /* !! */ .e;
                        var16_16 = TextUtils.isEmpty((CharSequence)var15_15);
                        if (var16_16 != 0) break block42;
                        var15_15 = var14_14 /* !! */ .d;
                        var16_16 = Integer.parseInt(var15_15);
                        var16_16 = var6_6 - var16_16;
                        var17_17 = var14_14 /* !! */ .e;
                        var18_18 = Integer.parseInt(var17_17);
                        var18_18 = var8_8 - var18_18;
                        if (var1_1 == 0) break block43;
                        if (var1_1 != var7_7) {
                            var19_19 = 6;
                            if (var1_1 != var19_19) {
                                var18_18 = 7;
                                if (var1_1 != var18_18) continue;
                            }
                            break block43;
                        }
                        if (var16_16 < 0 || var16_16 >= var12_12) continue;
                        var17_17 = var14_14 /* !! */ .e;
                        var18_18 = Integer.parseInt(var17_17);
                        if (var18_18 > var8_8) continue;
                        var10_10 = var14_14 /* !! */ ;
                        var12_12 = var16_16;
                        continue;
                    }
                    if (var18_18 < 0 || var18_18 >= var11_11) continue;
                    var15_15 = var14_14 /* !! */ .d;
                    var16_16 = Integer.parseInt(var15_15);
                    if (var16_16 > var6_6) continue;
                    var10_10 = var14_14 /* !! */ ;
                    var11_11 = var18_18;
                    continue;
                }
                var9_9.add(var14_14 /* !! */ );
                continue;
                break;
            }
            if (var10_10 == null) {
                var1_1 = var9_9.isEmpty() ^ var7_7;
                if (var1_1 == 0) break block44;
                var10_10 = var20_20 = CollectionsKt.firstOrNull(var9_9);
                var10_10 = (b)var20_20;
            }
        }
        if (var10_10 == null) ** GOTO lbl114
        try {
            var20_20 = this.a;
            if (var20_20 == null) ** GOTO lbl114
        }
        catch (Exception v0) {
            ** continue;
        }
        var2_2 /* !! */  = var10_10.a;
        var4_4 = var20_20.n;
        var4_4.put(var3_3, var2_2 /* !! */ );
        var2_2 /* !! */  = var10_10.b;
        var4_4 = var20_20.m;
        var4_4.put(var3_3, var2_2 /* !! */ );
        var2_2 /* !! */  = var10_10.f;
        var20_20.z = var2_2 /* !! */ ;
lbl114:
        // 4 sources

    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(String object) {
        synchronized (this) {
            boolean bl2;
            Object object2;
            Object object3;
            int n3;
            Object object4;
            Object object5;
            Object object6;
            Object object7 = "adspotId";
            try {
                Intrinsics.checkNotNullParameter(object, (String)object7);
                object7 = new StringBuilder();
                ((StringBuilder)object7).append((String)object);
                object6 = ": checking if sequence  attribute if present in vast";
                ((StringBuilder)object7).append((String)object6);
                object7 = ((StringBuilder)object7).toString();
                object6 = "message";
                Intrinsics.checkNotNullParameter(object7, (String)object6);
                object7 = JioAds.Companion;
                object6 = ((JioAds$Companion)object7).getInstance();
                ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object6 = JioAds$LogLevel.NONE;
                object6 = new TreeMap();
                object5 = ((JioAds$Companion)object7).getInstance();
                object5 = ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object4 = JioAds$LogLevel.DEBUG;
                n3 = 0;
                object3 = null;
                if (object5 == object4) {
                    object2 = "";
                    object5 = new StringBuilder((String)object2);
                } else {
                    object5 = null;
                }
                object7 = ((JioAds$Companion)object7).getInstance();
                object7 = ((JioAds)object7).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object7 == object4) {
                    object4 = "";
                    object7 = new StringBuilder((String)object4);
                } else {
                    bl2 = false;
                    object7 = null;
                }
                object4 = this.c;
                object4 = object4.iterator();
            }
            catch (Throwable throwable) {}
            {
                int n4;
                throw throwable;
                while ((n4 = object4.hasNext()) != 0) {
                    object2 = object4.next();
                    Object object8 = (object2 = (j)object2) != null ? ((j)object2).k : null;
                    if (object8 != null) {
                        object8 = ((j)object2).k;
                        if ((object8 = ((TreeMap)object6).get(object8)) == null) {
                            if (object5 != null) {
                                Object object9 = "[id: ";
                                object8 = new StringBuilder((String)object9);
                                object9 = ((j)object2).h;
                                ((StringBuilder)object8).append((String)object9);
                                object9 = ", seq: ";
                                ((StringBuilder)object8).append((String)object9);
                                object9 = ((j)object2).k;
                                ((StringBuilder)object8).append(object9);
                                object9 = "], ";
                                ((StringBuilder)object8).append((String)object9);
                                object8 = ((StringBuilder)object8).toString();
                                ((StringBuilder)object5).append((String)object8);
                            }
                            object8 = ((j)object2).k;
                            Intrinsics.checkNotNull(object8);
                            ((TreeMap)object6).put(object8, object2);
                            continue;
                        }
                    }
                    if (object7 == null) continue;
                    object8 = new StringBuilder();
                    if (object2 != null) {
                        object2 = ((j)object2).h;
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    ((StringBuilder)object8).append((String)object2);
                    object2 = ", ";
                    ((StringBuilder)object8).append((String)object2);
                    object2 = ((StringBuilder)object8).toString();
                    ((StringBuilder)object7).append((String)object2);
                }
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((String)object);
                object2 = ": vast ad with sequence attribute are with ids: ";
                ((StringBuilder)object4).append((String)object2);
                if (object5 != null) {
                    n4 = ((StringBuilder)object5).length();
                    if (n4 == 0) {
                        object5 = "-";
                    }
                } else {
                    object5 = null;
                }
                ((StringBuilder)object4).append(object5);
                object5 = ((StringBuilder)object4).toString();
                object4 = "message";
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                object5 = JioAds.Companion;
                object4 = ((JioAds$Companion)object5).getInstance();
                ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object4 = JioAds$LogLevel.NONE;
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((String)object);
                object2 = ": vast ad with non-sequence attribute are with ids: ";
                ((StringBuilder)object4).append((String)object2);
                if (object7 != null) {
                    n3 = ((StringBuilder)object7).length();
                    object3 = n3 == 0 ? "-" : object7;
                }
                ((StringBuilder)object4).append(object3);
                object7 = ((StringBuilder)object4).toString();
                object4 = "message";
                Intrinsics.checkNotNullParameter(object7, (String)object4);
                object7 = ((JioAds$Companion)object5).getInstance();
                ((JioAds)object7).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                bl2 = object6.isEmpty() ^ true;
                if (bl2) {
                    object = ((TreeMap)object6).values();
                    object7 = "<get-values>(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object7);
                    this.c = object = CollectionsKt.m0(object);
                } else {
                    object7 = new StringBuilder();
                    ((StringBuilder)object7).append((String)object);
                    object = ": sequence attribute value is not present in response";
                    ((StringBuilder)object7).append((String)object);
                    object = ((StringBuilder)object7).toString();
                    object7 = "message";
                    Intrinsics.checkNotNullParameter(object, (String)object7);
                    object = ((JioAds$Companion)object5).getInstance();
                    ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                return;
            }
        }
    }

    public final void j(String object) {
        boolean bl2;
        boolean bl3;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        boolean bl4;
        Object object6;
        block16: {
            block14: {
                object6 = this.c.iterator();
                while (true) {
                    bl4 = object6.hasNext();
                    object5 = null;
                    if (!bl4) break block14;
                    object4 = object6.next();
                    object3 = object4;
                    object3 = (j)object4;
                    if (object3 != null) {
                        object2 = ((j)object3).h;
                    } else {
                        bl3 = false;
                        object2 = null;
                    }
                    if (!(bl3 = Intrinsics.areEqual(object2, object))) continue;
                    if (object3 != null) {
                        object3 = ((j)object3).n;
                    } else {
                        bl2 = false;
                        object3 = null;
                    }
                    if (object3 != null) break;
                }
                break block16;
            }
            bl4 = false;
            object4 = null;
        }
        object4 = (j)object4;
        if (object4 != null) {
            object6 = this.c;
            object6.remove(object4);
        }
        if ((object6 = this.h) != null) {
            block15: {
                object6 = ((ArrayList)object6).iterator();
                while (bl4 = object6.hasNext()) {
                    object4 = object6.next();
                    object3 = object4;
                    object3 = ((k)object4).c;
                    bl2 = Intrinsics.areEqual(object3, object);
                    if (!bl2) continue;
                    break block15;
                }
                bl4 = false;
                object4 = null;
            }
            object4 = (k)object4;
            if (object4 != null && (object6 = this.h) != null) {
                ((ArrayList)object6).remove(object4);
            }
        }
        object6 = this.g;
        object4 = ((ArrayList)object6).iterator();
        while (bl2 = object4.hasNext()) {
            object3 = object4.next();
            object2 = object3;
            object2 = ((k)object3).c;
            bl3 = Intrinsics.areEqual(object2, object);
            if (!bl3) continue;
            object5 = object3;
            break;
        }
        if ((object5 = (k)object5) != null) {
            ((ArrayList)object6).remove(object5);
        }
        if ((object6 = this.a) != null) {
            ((n)object6).b.remove(object);
            ((n)object6).c.remove(object);
            ((n)object6).d.remove(object);
            ((n)object6).e.remove(object);
            object4 = ((n)object6).f;
            if (object4 != null) {
                object4 = TypeIntrinsics.asMutableCollection(object4);
                object4.remove(object);
            }
            ((n)object6).g.remove(object);
            ((n)object6).h.remove(object);
            ((n)object6).i.remove(object);
            ((n)object6).j.remove(object);
            ((n)object6).k.remove(object);
            ((n)object6).l.remove(object);
            ((n)object6).m.remove(object);
            ((n)object6).n.remove(object);
            ((n)object6).o.remove(object);
            ((n)object6).p.remove(object);
            ((n)object6).q.remove(object);
            ((n)object6).r.remove(object);
            ((n)object6).s.remove(object);
            ((n)object6).t.remove(object);
            ((n)object6).u.remove(object);
            TypeIntrinsics.asMutableMap(((n)object6).v).remove(object);
            ((n)object6).w.remove(object);
            object4 = ((n)object6).y;
            if (object4 != null) {
                object4 = (String)TypeIntrinsics.asMutableMap(object4).remove(object);
            }
            object4 = new StringBuilder();
            object6 = ((n)object6).a;
            ((StringBuilder)object4).append((String)object6);
            ((StringBuilder)object4).append(": clearAdData for adId: ");
            ((StringBuilder)object4).append((String)object);
            object = ((StringBuilder)object4).toString();
            object6 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object6);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }
}

