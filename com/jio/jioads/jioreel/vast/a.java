/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.jio.jioads.jioreel.vast;

import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instreamads.vastparser.model.c;
import com.jio.jioads.instreamads.vastparser.model.d;
import com.jio.jioads.instreamads.vastparser.model.e;
import com.jio.jioads.instreamads.vastparser.model.f;
import com.jio.jioads.instreamads.vastparser.model.i;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.model.o;
import com.jio.jioads.instreamads.vastparser.model.q;
import com.jio.jioads.util.Utility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class a {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;

    public a() {
        HashMap hashMap;
        this.a = hashMap = new HashMap();
        this.b = hashMap = new HashMap();
        this.c = hashMap = new HashMap();
        this.d = hashMap = new HashMap();
        this.e = hashMap = new HashMap();
        new HashMap();
        new ArrayList();
    }

    public static String a(j object, String string2) {
        boolean bl2;
        Object object2;
        boolean bl3;
        Object object3;
        Object object4 = null;
        if (object != null && (object3 = ((j)object).n) != null) {
            object3 = ((e)object3).e;
        } else {
            bl3 = false;
            object3 = null;
        }
        bl3 = TextUtils.isEmpty((CharSequence)object3);
        boolean bl4 = true;
        if (!bl3) {
            object3 = Utility.INSTANCE;
            object2 = object != null && (object2 = ((j)object).n) != null ? ((e)object2).e : null;
            String string3 = "ADSERVINGID";
            string2 = ((Utility)object3).replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2, string3, (String)object2, bl4);
        }
        bl3 = false;
        object3 = null;
        object2 = object != null && (object2 = ((j)object).n) != null && (object2 = ((e)object2).g) != null && (object2 = (c)object2.get(0)) != null ? ((c)object2).e : null;
        boolean bl5 = TextUtils.isEmpty((CharSequence)object2);
        if (bl5) {
            if (object != null && (object = ((j)object).m) != null && (object = ((q)object).i) != null && (object = (c)object.get(0)) != null) {
                object4 = ((c)object).e;
            }
        } else {
            object4 = object2;
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)object4))) {
            object = Utility.INSTANCE;
            object3 = "UNIVERSALADID";
            string2 = ((Utility)object).replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2, (String)object3, (String)object4, bl4);
        }
        return string2;
    }

    public static ArrayList c(j j3, ArrayList object) {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = ((ArrayList)object).iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (i)object.next();
            Object object3 = ((i)object2).b;
            boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
            if (!bl3) {
                String string2 = ((i)object2).b;
                Intrinsics.checkNotNull(string2);
                string2 = com.jio.jioads.jioreel.vast.a.a(j3, string2);
                object2 = ((i)object2).a;
                object3 = new i((String)object2, string2);
                arrayList.add(object3);
                continue;
            }
            arrayList.add(object2);
        }
        return arrayList;
    }

    public final String b(String string2) {
        int n3;
        Object v4;
        int n4;
        Object object;
        Object object2 = this.d;
        if (object2 != null) {
            object = (String)((HashMap)object2).get(string2);
        } else {
            n4 = 0;
            object = null;
        }
        if (object != null) {
            object2 = object2 != null ? (String)((HashMap)object2).get(string2) : null;
            object2 = String.valueOf(object2);
        } else {
            object2 = "";
        }
        n4 = ((String)object2).length();
        if (n4 == 0 && (v4 = ((HashMap)(object = this.c)).get(string2)) != null && (n3 = ((String)(object2 = String.valueOf(string2 = ((HashMap)object).get(string2)))).length()) == 0) {
            return null;
        }
        return object2;
    }

    public final ArrayList d(String string2, String iterator) {
        ArrayList<Object> arrayList;
        block14: {
            arrayList = new ArrayList<Object>();
            Object object = this.a;
            boolean bl2 = ((HashMap)object).isEmpty();
            boolean bl3 = true;
            if (!(bl2 ^= bl3)) break block14;
            Object object2 = ((HashMap)object).get(iterator);
            if (object2 == null) break block14;
            iterator = ((HashMap)object).get(iterator);
            Intrinsics.checkNotNull(iterator);
            iterator = (List)((Object)iterator);
            try {
                iterator = iterator.iterator();
            }
            catch (Exception exception) {
                Object object3 = Utility.INSTANCE.printStacktrace(exception);
                iterator = "message";
                Intrinsics.checkNotNullParameter(object3, (String)((Object)iterator));
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
            }
            while (true) {
                boolean bl4 = iterator.hasNext();
                if (!bl4) break;
                object = iterator.next();
                object = (i)object;
                object2 = ((i)object).a;
                bl2 = kotlin.text.b.i(object2, string2, bl3);
                if (!bl2) continue;
                object = ((i)object).b;
                arrayList.add(object);
                continue;
                break;
            }
        }
        return arrayList;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(j var1_1) {
        block16: {
            block15: {
                var2_4 = 0;
                var3_5 = null;
                if (var1_1 != null) {
                    try {
                        var4_6 = var1_1.n;
                        break block15;
                    }
                    catch (Exception var1_2) {
                        break block16;
                    }
                }
                var5_7 = 0;
                var4_6 = null;
            }
            if (var4_6 == null) return;
            var4_6 = var1_1.n;
            var6_8 = 0;
            var7_9 = null;
            if (var4_6 == null || (var4_6 = var4_6.g) == null) ** GOTO lbl-1000
            var4_6 = var4_6.get(0);
            if ((var4_6 = (c)var4_6) != null && (var4_6 = var4_6.c) != null && (var4_6 = var4_6.f) != null) {
                var4_6 = var4_6.getCtaUrl();
            } else lbl-1000:
            // 2 sources

            {
                var5_7 = 0;
                var4_6 = null;
            }
            var8_10 = this.d;
            if (var4_6 != null) {
                var3_5 = var4_6.getDeeplink();
                if (var3_5 != null && (var2_4 = var3_5.length()) != 0) {
                    Intrinsics.checkNotNull(var8_10);
                    var3_5 = var1_1.h;
                    var7_9 = var4_6.getDeeplink();
                    Intrinsics.checkNotNull(var7_9);
                    var7_9 = com.jio.jioads.jioreel.vast.a.a((j)var1_1, var7_9);
                    var8_10.put(var3_5, var7_9);
                }
                if ((var3_5 = var4_6.getFallback()) == null) return;
                var2_4 = var3_5.length();
                if (var2_4 == 0) {
                    return;
                }
                var3_5 = this.c;
                var7_9 = var1_1.h;
                var4_6 = var4_6.getFallback();
                Intrinsics.checkNotNull(var4_6);
                var1_1 = com.jio.jioads.jioreel.vast.a.a((j)var1_1, (String)var4_6);
                var3_5.put(var7_9, var1_1);
                return;
            }
            var4_6 = var1_1.n;
            var9_11 = var4_6 != null ? var4_6.h : null;
            if (var9_11 == null) return;
            if (var4_6 != null) {
                var4_6 = var4_6.h;
            } else {
                var5_7 = 0;
                var4_6 = null;
            }
            Intrinsics.checkNotNull(var4_6);
            var5_7 = var4_6.size();
            if (var5_7 <= 0) return;
            var4_6 = var1_1.n;
            if (var4_6 != null) {
                var4_6 = var4_6.h;
            } else {
                var5_7 = 0;
                var4_6 = null;
            }
            Intrinsics.checkNotNull(var4_6);
            var5_7 = var4_6.size();
            while (var6_8 < var5_7) {
                block17: {
                    var9_11 = var1_1.n;
                    var9_11 = var9_11 != null ? var9_11.h : null;
                    Intrinsics.checkNotNull(var9_11);
                    var9_11 = var9_11.get(var6_8);
                    var9_11 = (d)var9_11;
                    if (var8_10 == null || (var10_12 = var9_11.b) == null || (var11_13 = var10_12.length()) == 0) ** GOTO lbl-1000
                    Intrinsics.checkNotNull(var8_10);
                    var10_12 = var1_1.h;
                    var12_14 = var9_11.b;
                    Intrinsics.checkNotNull(var12_14);
                    var12_14 = com.jio.jioads.jioreel.vast.a.a((j)var1_1, var12_14);
                    var8_10.put(var10_12, var12_14);
lbl-1000:
                    // 2 sources

                    {
                        if ((var10_12 = this.e) == null || (var12_14 = var9_11.c) == null || (var13_15 = var12_14.length()) == 0) break block17;
                        Intrinsics.checkNotNull(var10_12);
                        var12_14 = var1_1.h;
                        var9_11 = var9_11.c;
                        Intrinsics.checkNotNull(var9_11);
                        var9_11 = com.jio.jioads.jioreel.vast.a.a((j)var1_1, (String)var9_11);
                        var10_12.put(var12_14, var9_11);
                    }
                }
                ++var6_8;
            }
            return;
        }
        var1_3 /* !! */  = Utility.INSTANCE.printStacktrace(var1_2);
        var3_5 = "message";
        Intrinsics.checkNotNullParameter(var1_3 /* !! */ , (String)var3_5);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var1_3 /* !! */  = JioAds$LogLevel.NONE;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(j object, m object2) {
        Exception exception2;
        block12: {
            Object object3;
            boolean bl2;
            Object object4;
            Object object5;
            block14: {
                block15: {
                    block13: {
                        block11: {
                            object5 = null;
                            object4 = object2 != null ? m.i((j)object) : null;
                            if (object2 != null) {
                                object2 = m.k((j)object);
                            } else {
                                bl2 = false;
                                object2 = null;
                            }
                            if (object2 != null) {
                                try {
                                    object3 = ((f)object2).e;
                                    break block11;
                                }
                                catch (Exception exception2) {
                                    break block12;
                                }
                            }
                            object3 = null;
                        }
                        if (object3 == null) break block13;
                        object2 = ((f)object2).e;
                        if (object2 == null) break block14;
                        object2 = ((o)object2).a;
                        break block15;
                    }
                    if (object4 != null) {
                        object2 = ((f)object4).e;
                    } else {
                        bl2 = false;
                        object2 = null;
                    }
                    if (object2 == null || (object2 = ((f)object4).e) == null) break block14;
                    object2 = ((o)object2).a;
                }
                object5 = object2;
            }
            if (bl2 = TextUtils.isEmpty(object5)) return;
            if (object == null) return;
            object2 = this.c;
            object4 = ((j)object).h;
            Intrinsics.checkNotNull(object5);
            object3 = "\n";
            String string2 = "";
            object5 = kotlin.text.b.n((String)object5, (String)object3, string2, false);
            object = com.jio.jioads.jioreel.vast.a.a((j)object, (String)object5);
            ((HashMap)object2).put(object4, object);
            return;
        }
        Object object6 = Utility.INSTANCE.printStacktrace(exception2);
        object2 = "message";
        Intrinsics.checkNotNullParameter(object6, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object6 = JioAds$LogLevel.NONE;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(j var1_1, m var2_4) {
        block15: {
            block17: {
                block16: {
                    block14: {
                        var3_5 = new ArrayList();
                        var4_6 = 0;
                        var5_7 = null;
                        if (var2_4 != null) {
                            var6_8 = m.i((j)var1_1);
                        } else {
                            var7_9 = false;
                            var6_8 = null;
                        }
                        var2_4 = var2_4 != null ? m.k((j)var1_1) : null;
                        if (var1_1 != null) {
                            try {
                                var8_10 = var1_1.m;
                                break block14;
                            }
                            catch (Exception var1_2) {
                                break block15;
                            }
                        }
                        var8_10 = null;
                    }
                    if (var8_10 == null) break block16;
                    if (var2_4 == null) ** GOTO lbl-1000
                    var2_4 = var2_4.e;
                    break block17;
                }
                if (var6_8 != null) {
                    var2_4 = var6_8.e;
                } else lbl-1000:
                // 2 sources

                {
                    var2_4 = null;
                }
            }
            if (var2_4 != null) {
                var5_7 = var2_4.b;
            }
            if (var5_7 == null) return;
            var2_4 = var2_4.b;
            Intrinsics.checkNotNull(var2_4);
            var2_4 = var2_4.iterator();
            while ((var4_6 = var2_4.hasNext()) != 0) {
                var5_7 = var2_4.next();
                var5_7 = (com.jio.jioads.instreamads.vastparser.model.a)var5_7;
                var5_7 = var5_7.a;
                var3_5.add(var5_7);
            }
            if (var1_1 == null) return;
            var2_4 = this.b;
            var5_7 = var1_1.p;
            var4_6 = var2_4.containsKey(var5_7);
            if (var4_6 != 0) {
                var5_7 = var1_1.p;
                if ((var5_7 = var2_4.get(var5_7)) != null) {
                    var5_7 = var1_1.p;
                    var5_7 = var2_4.get(var5_7);
                    Intrinsics.checkNotNull(var5_7);
                    var5_7 = (Collection)var5_7;
                    var3_5.addAll(var5_7);
                }
            }
            if ((var4_6 = var3_5.size()) <= 0) return;
            var5_7 = new ArrayList();
            var3_5 = var3_5.iterator();
            while (true) {
                if (!(var7_9 = var3_5.hasNext())) {
                    var1_1 = var1_1.h;
                    var2_4.put(var1_1, var5_7);
                    return;
                }
                var6_8 = var3_5.next();
                var6_8 = (String)var6_8;
                var6_8 = com.jio.jioads.jioreel.vast.a.a((j)var1_1, (String)var6_8);
                var5_7.add(var6_8);
            }
        }
        var1_3 /* !! */  = Utility.INSTANCE.printStacktrace(var1_2);
        var2_4 = "message";
        Intrinsics.checkNotNullParameter(var1_3 /* !! */ , (String)var2_4);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var1_3 /* !! */  = JioAds$LogLevel.NONE;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(j object, m object2) {
        Exception exception2;
        block14: {
            int n3;
            HashMap hashMap;
            HashMap<Object, Object> hashMap2;
            block15: {
                int n4;
                ArrayList arrayList;
                block16: {
                    int n7;
                    f f5;
                    List list;
                    block12: {
                        block13: {
                            hashMap2 = new HashMap<Object, Object>();
                            arrayList = new ArrayList();
                            list = null;
                            f5 = object2 != null ? m.i((j)object) : null;
                            if (object2 != null) {
                                object2 = m.k((j)object);
                            } else {
                                n4 = 0;
                                object2 = null;
                            }
                            hashMap = this.a;
                            if (object == null) break block15;
                            try {
                                Object object3 = ((j)object).m;
                                n7 = 1;
                                if (object3 == null || (object3 = ((q)object3).i) == null) break block12;
                                Intrinsics.checkNotNull(object3);
                                int n8 = object3.size();
                                if (n8 < n7) break block12;
                                if (object2 == null) break block13;
                                list = ((f)object2).c;
                            }
                            catch (Exception exception2) {
                                break block14;
                            }
                        }
                        if (list != null) {
                            object2 = ((f)object2).c;
                            Intrinsics.checkNotNull(object2);
                            arrayList.addAll(object2);
                        }
                        break block16;
                    }
                    if ((object2 = ((j)object).n) != null && (object2 = ((e)object2).g) != null) {
                        Intrinsics.checkNotNull(object2);
                        n4 = object2.size();
                        if (n4 >= n7) {
                            if (f5 != null) {
                                list = f5.c;
                            }
                            if (list != null) {
                                object2 = f5.c;
                                Intrinsics.checkNotNull(object2);
                                arrayList.addAll(object2);
                            }
                        }
                    }
                }
                if ((n4 = hashMap.containsKey(object2 = ((j)object).p)) != 0) {
                    object2 = ((j)object).p;
                    if ((object2 = hashMap.get(object2)) != null) {
                        object2 = ((j)object).p;
                        object2 = hashMap.get(object2);
                        Intrinsics.checkNotNull(object2);
                        object2 = (Collection)object2;
                        arrayList.addAll(object2);
                    }
                }
                object2 = com.jio.jioads.jioreel.vast.a.c((j)object, arrayList);
                object = ((j)object).h;
                hashMap2.put(object, object2);
            }
            if ((n3 = hashMap2.size()) > 0) {
                hashMap.putAll(hashMap2);
            }
            return;
        }
        Intrinsics.checkNotNullParameter(Utility.INSTANCE.printStacktrace(exception2), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }
}

