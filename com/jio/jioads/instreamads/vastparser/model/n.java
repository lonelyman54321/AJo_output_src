/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.jio.jioads.instreamads.vastparser.model;

import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instreamads.vastparser.model.a;
import com.jio.jioads.instreamads.vastparser.model.b;
import com.jio.jioads.instreamads.vastparser.model.c;
import com.jio.jioads.instreamads.vastparser.model.d;
import com.jio.jioads.instreamads.vastparser.model.e;
import com.jio.jioads.instreamads.vastparser.model.i;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.model.p;
import com.jio.jioads.instreamads.vastparser.model.q;
import com.jio.jioads.tracker.JioEventTracker$TrackingEvents;
import com.jio.jioads.util.Utility;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class n {
    public String a = "";
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public ArrayList f;
    public final HashMap g;
    public final HashMap h;
    public final HashMap i;
    public final HashMap j;
    public final HashMap k;
    public final HashMap l;
    public final HashMap m;
    public final HashMap n;
    public final HashMap o;
    public final HashMap p;
    public final HashMap q;
    public final HashMap r;
    public final HashMap s;
    public final HashMap t;
    public final HashMap u;
    public final HashMap v;
    public final HashMap w;
    public final HashMap x;
    public final HashMap y;
    public String z;

    public n() {
        HashMap hashMap;
        this.b = hashMap = new HashMap();
        this.c = hashMap = new HashMap();
        this.d = hashMap = new HashMap();
        this.e = hashMap = new HashMap();
        this.g = hashMap = new HashMap();
        this.h = hashMap = new HashMap();
        this.i = hashMap = new HashMap();
        this.j = hashMap = new HashMap();
        this.k = hashMap = new HashMap();
        this.l = hashMap = new HashMap();
        this.m = hashMap = new HashMap();
        this.n = hashMap = new HashMap();
        this.o = hashMap = new HashMap();
        this.p = hashMap = new HashMap();
        this.q = hashMap = new HashMap();
        this.r = hashMap = new HashMap();
        this.s = hashMap = new HashMap();
        this.t = hashMap = new HashMap();
        this.u = hashMap = new HashMap();
        this.v = hashMap = new HashMap();
        this.w = hashMap = new HashMap();
        this.x = hashMap = new HashMap();
        this.y = hashMap = new HashMap();
    }

    public static String a(j object, String string2) {
        Object object2;
        boolean bl2;
        Object object3;
        Object object4 = null;
        if (object != null && (object3 = ((j)object).n) != null) {
            object3 = ((e)object3).e;
        } else {
            bl2 = false;
            object3 = null;
        }
        bl2 = TextUtils.isEmpty((CharSequence)object3);
        boolean bl3 = true;
        if (!bl2) {
            object3 = Utility.INSTANCE;
            object2 = object != null && (object2 = ((j)object).n) != null ? ((e)object2).e : null;
            String string3 = "ADSERVINGID";
            string2 = ((Utility)object3).replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2, string3, (String)object2, bl3);
        }
        if (object != null && (object3 = ((j)object).n) != null && (object3 = ((e)object3).g) != null && (bl2 = object3.isEmpty() ^ bl3) == bl3) {
            boolean bl4;
            object3 = ((j)object).n;
            object2 = null;
            if (object3 != null && (object3 = ((e)object3).g) != null && (object3 = (c)object3.get(0)) != null) {
                object3 = ((c)object3).e;
            } else {
                bl2 = false;
                object3 = null;
            }
            boolean bl5 = TextUtils.isEmpty((CharSequence)object3);
            if (bl5) {
                object3 = ((j)object).m;
                if (object3 != null && (object3 = ((q)object3).i) != null && (bl2 = object3.isEmpty() ^ bl3) == bl3 && (object = ((j)object).m) != null && (object = ((q)object).i) != null && (object = (c)object.get(0)) != null) {
                    object4 = ((c)object).e;
                }
            } else {
                object4 = object3;
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)object4))) {
                object = Utility.INSTANCE;
                object3 = "UNIVERSALADID";
                string2 = ((Utility)object).replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2, (String)object3, (String)object4, bl3);
            }
        }
        return string2;
    }

    public static ArrayList d(j j3, ArrayList object) {
        ArrayList<String> arrayList;
        if (j3 != null) {
            boolean bl2;
            arrayList = new ArrayList<String>();
            object = ((ArrayList)object).iterator();
            while (bl2 = object.hasNext()) {
                String string2 = (String)object.next();
                string2 = com.jio.jioads.instreamads.vastparser.model.n.a(j3, string2);
                arrayList.add(string2);
            }
        } else {
            arrayList = null;
        }
        return arrayList;
    }

    public final String b(String string2) {
        HashMap hashMap = this.g;
        boolean bl2 = hashMap.isEmpty() ^ true;
        string2 = bl2 ? (String)hashMap.get(string2) : null;
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String c(String object, String string2) {
        HashMap hashMap = this.j;
        object = (HashMap)hashMap.get(object);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            if (object == null) return null;
            return (String)object.get(string2);
        }
        if (object == null) return null;
        if ((object = ((HashMap)object).entrySet()) == null) return null;
        if ((object = (Map.Entry)CollectionsKt.M((Iterable)object)) == null) return null;
        return (String)object.getValue();
    }

    public final ArrayList e(m object, String object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "finalVastModel");
        ArrayList arrayList = new ArrayList();
        this.r((m)object, (String)object2);
        object = this.f;
        if (object != null && !(bl2 = ((ArrayList)object).isEmpty())) {
            object = this.f;
            Intrinsics.checkNotNull(object);
            bl2 = CollectionsKt.F((Iterable)object, object2);
            if (bl2) {
                boolean bl3;
                object = this.f;
                Intrinsics.checkNotNull(object);
                object = ((ArrayList)object).iterator();
                while (bl3 = object.hasNext()) {
                    Object v4;
                    HashMap hashMap = this.e;
                    object2 = (String)object.next();
                    boolean bl4 = hashMap.containsKey(object2);
                    if (!bl4 || (v4 = hashMap.get(object2)) == null) continue;
                    object2 = hashMap.get(object2);
                    Intrinsics.checkNotNull(object2);
                    object2 = CollectionsKt.k0((Iterable)object2);
                    arrayList.addAll(object2);
                }
                object = this.x;
                if (object != null && !(bl3 = ((HashMap)object).isEmpty())) {
                    object2 = JioEventTracker$TrackingEvents.EVENT_CLICK.getType();
                    if (object != null) {
                        object = (List)((HashMap)object).get(object2);
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    if (object != null && (bl3 = object.isEmpty() ^ true)) {
                        arrayList.addAll(object);
                    }
                }
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
    public final ArrayList f(m var1_1, String var2_4, String var3_5) {
        block10: {
            block9: {
                Intrinsics.checkNotNullParameter(var1_1, "finalVastModel");
                var4_6 = new ArrayList<Object>();
                try {
                    this.r((m)var1_1, (String)var3_5);
                    var1_1 = this.f;
                    if (var1_1 == null) {
                        var1_1 = mz0_2.a;
                    }
                    var1_1 = var1_1.iterator();
lbl9:
                    // 3 sources

                    while (true) {
                        var5_7 = var1_1.hasNext();
                        var6_8 = true;
                        if (!var5_7) break block9;
                        var3_5 = var1_1.next();
                        var3_5 = (String)var3_5;
                        var7_9 = this.b;
                        break;
                    }
                }
                catch (Exception var1_2) {
                    break block10;
                }
                {
                    var8_10 /* !! */  = var7_9.get(var3_5);
                    if (var8_10 /* !! */  == null) ** GOTO lbl9
                    var3_5 = var7_9.get(var3_5);
                    Intrinsics.checkNotNull(var3_5);
                    var3_5 = (List)var3_5;
                    var3_5 = var3_5.iterator();
                    while (true) {
                        if (var9_11 = var3_5.hasNext()) ** break;
                        ** continue;
                        var7_9 = var3_5.next();
                        var7_9 = (i)var7_9;
                        var8_10 /* !! */  = var7_9.a;
                        var10_12 = kotlin.text.b.i(var8_10 /* !! */ , (String)var2_4, var6_8);
                        if (!var10_12) continue;
                        var7_9 = var7_9.b;
                        var4_6.add(var7_9);
                    }
                }
            }
            var1_1 = this.x;
            if (var1_1 == null) return var4_6;
            {
                var5_7 = var1_1.isEmpty();
                if (var5_7) {
                    return var4_6;
                }
                var1_1 = var1_1.get(var2_4);
                if ((var1_1 = (List)var1_1) == null) return var4_6;
                var11_13 = var1_1.isEmpty() ^ var6_8;
                if (var11_13 == false) return var4_6;
            }
            {
                var4_6.addAll((Collection<Object>)var1_1);
                return var4_6;
            }
        }
        var2_4 = new StringBuilder();
        var3_5 = this.a;
        var2_4.append((String)var3_5);
        var2_4.append(": ");
        var3_5 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)var3_5, var1_2, (StringBuilder)var2_4);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var1_3 = JioAds$LogLevel.NONE;
        return var4_6;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(j j3) {
        boolean bl2;
        boolean bl3;
        Object object;
        String string2;
        Object object2;
        Serializable serializable;
        block17: {
            try {
                serializable = new HashMap();
                object2 = this.q;
                string2 = null;
                if (j3 != null) {
                    object = j3.h;
                } else {
                    bl3 = false;
                    object = null;
                }
                object2 = ((HashMap)object2).get(object);
                object2 = (List)object2;
                if (object2 == null) return;
                object2 = object2.iterator();
                break block17;
            }
            catch (Exception exception) {}
            serializable = new StringBuilder();
            object2 = this.a;
            ((StringBuilder)serializable).append((String)object2);
            ((StringBuilder)serializable).append(": ");
            object2 = Utility.INSTANCE;
            com.jio.jioads.jioreel.tracker.model.b.c((Utility)object2, exception, (StringBuilder)serializable);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            return;
        }
        while (bl3 = object2.hasNext()) {
            boolean bl4;
            Object object3;
            object = object2.next();
            if ((object = (b)object) != null) {
                object3 = ((b)object).i;
            } else {
                bl2 = false;
                object3 = null;
            }
            if (object3 == null || (object3 = ((b)object).f) == null) continue;
            object3 = new ArrayList();
            Object object4 = ((b)object).i;
            Intrinsics.checkNotNull(object4);
            object4 = object4.iterator();
            while (bl4 = object4.hasNext()) {
                Object object5 = object4.next();
                object5 = (a)object5;
                object5 = ((a)object5).a;
                ((ArrayList)object3).add(object5);
            }
            int n3 = ((ArrayList)object3).size();
            if (n3 <= 0) continue;
            object4 = com.jio.jioads.instreamads.vastparser.model.n.d(j3, object3);
            if (object4 != null) {
                object3 = object4;
            }
            object = ((b)object).f;
            Intrinsics.checkNotNull(object);
            ((HashMap)serializable).put(object, object3);
        }
        object2 = this.l;
        if (j3 != null) {
            object = j3.h;
        } else {
            bl3 = false;
            object = null;
        }
        bl3 = ((HashMap)object2).containsKey(object);
        if (bl3) {
            if (j3 != null) {
                object = j3.h;
            } else {
                bl3 = false;
                object = null;
            }
            object = ((HashMap)object2).get(object);
            object = (HashMap)object;
            if (object != null && !(bl2 = object.isEmpty())) {
                ((HashMap)serializable).putAll(object);
            }
        }
        if (j3 != null) {
            string2 = j3.h;
        }
        ((HashMap)object2).put(string2, serializable);
    }

    public final void h(j object, HashMap hashMap, int n3) {
        String string2 = ((j)object).p;
        Object object2 = ((j)object).h;
        int n4 = Intrinsics.areEqual(string2, object2);
        if (n4 == 0 && (n4 = 6) > n3 && (string2 = ((j)object).p) != null && (n4 = string2.length()) != 0) {
            string2 = ((j)object).p;
            Intrinsics.checkNotNull(string2);
            n4 = (int)(hashMap.containsKey(string2) ? 1 : 0);
            if (n4 != 0) {
                object = ((j)object).p;
                if ((object = (j)hashMap.get(object)) != null) {
                    string2 = ((j)object).h;
                    if (string2 != null && (object2 = this.f) != null) {
                        Intrinsics.checkNotNull(string2);
                        ((ArrayList)object2).add(string2);
                    }
                    if ((string2 = ((j)object).p) != null && (n4 = string2.length()) != 0) {
                        this.h((j)object, hashMap, ++n3);
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(m var1_1) {
        var2_2 = this;
        var3_3 /* !! */  = var1_1;
        var4_15 = '\u0001';
        Intrinsics.checkNotNullParameter(var1_1, "vastModel");
        var3_3 /* !! */  = var1_1.c;
        var5_16 = var3_3 /* !! */ .iterator();
        while (true) {
            block145: {
                block129: {
                    block128: {
                        block127: {
                            block144: {
                                block126: {
                                    block125: {
                                        block124: {
                                            block123: {
                                                block143: {
                                                    block121: {
                                                        block122: {
                                                            block142: {
                                                                block120: {
                                                                    block141: {
                                                                        block140: {
                                                                            block119: {
                                                                                block139: {
                                                                                    block138: {
                                                                                        block137: {
                                                                                            block113: {
                                                                                                block136: {
                                                                                                    block135: {
                                                                                                        block112: {
                                                                                                            block134: {
                                                                                                                block111: {
                                                                                                                    block133: {
                                                                                                                        block132: {
                                                                                                                            block110: {
                                                                                                                                block131: {
                                                                                                                                    block109: {
                                                                                                                                        block130: {
                                                                                                                                            block106: {
                                                                                                                                                if (!(var6_17 = var5_16.hasNext())) {
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                var3_3 /* !! */  = var5_16.next();
                                                                                                                                                var7_18 = var3_3 /* !! */ ;
                                                                                                                                                var7_18 = (j)var3_3 /* !! */ ;
                                                                                                                                                var3_3 /* !! */  = var2_2.w;
                                                                                                                                                if (var7_18 != null) {
                                                                                                                                                    var8_19 = var7_18.h;
                                                                                                                                                } else {
                                                                                                                                                    var9_20 = 0;
                                                                                                                                                    var8_19 = null;
                                                                                                                                                }
                                                                                                                                                if (var7_18 != null) {
                                                                                                                                                    var10_21 = var7_18.q;
                                                                                                                                                } else {
                                                                                                                                                    var11_22 = 0;
                                                                                                                                                    var10_21 = null;
                                                                                                                                                }
                                                                                                                                                var3_3 /* !! */ .put(var8_19, var10_21);
                                                                                                                                                var3_3 /* !! */  = new HashMap();
                                                                                                                                                var8_19 = new ArrayList();
                                                                                                                                                var10_21 = com.jio.jioads.instreamads.vastparser.model.m.i(var7_18);
                                                                                                                                                var12_23 = com.jio.jioads.instreamads.vastparser.model.m.k(var7_18);
                                                                                                                                                var13_24 = var2_2.b;
                                                                                                                                                var14_25 = ": ";
                                                                                                                                                if (var7_18 != null) {
                                                                                                                                                    block103: {
                                                                                                                                                        block105: {
                                                                                                                                                            block104: {
                                                                                                                                                                try {
                                                                                                                                                                    var15_26 = var7_18.m;
                                                                                                                                                                    if (var15_26 == null || (var15_26 = var15_26.i) == null) break block103;
                                                                                                                                                                    Intrinsics.checkNotNull(var15_26);
                                                                                                                                                                    var16_27 = var15_26.size();
                                                                                                                                                                    if (var16_27 < var4_15) break block103;
                                                                                                                                                                    if (var12_23 == null) break block104;
                                                                                                                                                                    var15_26 = var12_23.c;
                                                                                                                                                                    break block105;
                                                                                                                                                                }
                                                                                                                                                                catch (Exception var3_4) {
                                                                                                                                                                    break block106;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            var16_27 = '\u0000';
                                                                                                                                                            var15_26 = null;
                                                                                                                                                        }
                                                                                                                                                        if (var15_26 != null) {
                                                                                                                                                            var12_23 = var12_23.c;
                                                                                                                                                            Intrinsics.checkNotNull(var12_23);
                                                                                                                                                            var8_19.addAll(var12_23);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if ((var12_23 = var7_18.n) != null && (var12_23 = var12_23.g) != null) {
                                                                                                                                                        Intrinsics.checkNotNull(var12_23);
                                                                                                                                                        var17_28 = var12_23.size();
                                                                                                                                                        if (var17_28 >= var4_15) {
                                                                                                                                                            if (var10_21 != null) {
                                                                                                                                                                var12_23 = var10_21.c;
                                                                                                                                                            } else {
                                                                                                                                                                var17_28 = 0;
                                                                                                                                                                var12_23 = null;
                                                                                                                                                            }
                                                                                                                                                            if (var12_23 != null) {
                                                                                                                                                                var10_21 = var10_21.c;
                                                                                                                                                                Intrinsics.checkNotNull(var10_21);
                                                                                                                                                                var8_19.addAll(var10_21);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    var10_21 = new ArrayList<Iterator<Object>>();
                                                                                                                                                    var8_19 = var8_19.iterator();
                                                                                                                                                    while ((var17_28 = (int)var8_19.hasNext()) != 0) {
                                                                                                                                                        var12_23 = var8_19.next();
                                                                                                                                                        var12_23 = (i)var12_23;
                                                                                                                                                        var15_26 = var12_23.b;
                                                                                                                                                        var16_27 = (char)TextUtils.isEmpty((CharSequence)var15_26);
                                                                                                                                                        if (var16_27 == '\u0000') {
                                                                                                                                                            var18_29 = var12_23.a;
                                                                                                                                                            var12_23 = var12_23.b;
                                                                                                                                                            Intrinsics.checkNotNull(var12_23);
                                                                                                                                                            var12_23 = com.jio.jioads.instreamads.vastparser.model.n.a(var7_18, (String)var12_23);
                                                                                                                                                            var15_26 = new i((String)var18_29, (String)var12_23);
                                                                                                                                                            var10_21.add((Iterator<Object>)var15_26);
                                                                                                                                                            continue;
                                                                                                                                                        }
                                                                                                                                                        var10_21.add((Iterator<Object>)var12_23);
                                                                                                                                                    }
                                                                                                                                                    var8_19 = var7_18.h;
                                                                                                                                                    var9_20 = (int)var13_24.containsKey(var8_19);
                                                                                                                                                    if (var9_20 != 0) {
                                                                                                                                                        var8_19 = var7_18.h;
                                                                                                                                                        var8_19 = var13_24.get(var8_19);
                                                                                                                                                        if ((var8_19 = (List)var8_19) != null && (var17_28 = (int)var8_19.isEmpty()) == 0) {
                                                                                                                                                            var8_19 = var8_19.iterator();
                                                                                                                                                            while ((var17_28 = (int)var8_19.hasNext()) != 0) {
                                                                                                                                                                var12_23 = var8_19.next();
                                                                                                                                                                var16_27 = (char)var10_21.contains(var12_23 = (i)var12_23);
                                                                                                                                                                if (var16_27 != '\u0000') continue;
                                                                                                                                                                var10_21.add((Iterator<Object>)var12_23);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    var8_19 = var7_18.h;
                                                                                                                                                    var3_3 /* !! */ .put(var8_19, var10_21);
                                                                                                                                                }
                                                                                                                                                if ((var9_20 = var3_3 /* !! */ .size()) > 0) {
                                                                                                                                                    var13_24.putAll(var3_3 /* !! */ );
                                                                                                                                                }
                                                                                                                                                break block130;
                                                                                                                                            }
                                                                                                                                            var8_19 = new StringBuilder();
                                                                                                                                            var10_21 = var2_2.a;
                                                                                                                                            var8_19.append((String)var10_21);
                                                                                                                                            var8_19.append(var14_25);
                                                                                                                                            var10_21 = Utility.INSTANCE;
                                                                                                                                            com.jio.jioads.jioreel.tracker.model.b.c((Utility)var10_21, var3_4, (StringBuilder)var8_19);
                                                                                                                                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                                                            var3_3 /* !! */  = JioAds$LogLevel.NONE;
                                                                                                                                        }
                                                                                                                                        var3_3 /* !! */  = new HashMap();
                                                                                                                                        var8_19 = new ArrayList();
                                                                                                                                        var10_21 = var2_2.c;
                                                                                                                                        if (var7_18 != null) {
                                                                                                                                            block108: {
                                                                                                                                                block107: {
                                                                                                                                                    try {
                                                                                                                                                        var12_23 = var7_18.m;
                                                                                                                                                        if (var12_23 == null || (var12_23 = var12_23.g) == null) break block107;
                                                                                                                                                        Intrinsics.checkNotNull(var12_23);
                                                                                                                                                        var8_19.addAll(var12_23);
                                                                                                                                                        break block108;
                                                                                                                                                    }
                                                                                                                                                    catch (Exception var3_5) {
                                                                                                                                                        break block109;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var12_23 = var7_18.n;
                                                                                                                                                if (var12_23 != null && (var12_23 = var12_23.f) != null) {
                                                                                                                                                    Intrinsics.checkNotNull(var12_23);
                                                                                                                                                    var8_19.addAll(var12_23);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var12_23 = com.jio.jioads.instreamads.vastparser.model.n.d(var7_18, (ArrayList)var8_19);
                                                                                                                                            if (var12_23 != null) {
                                                                                                                                                var8_19 = var12_23;
                                                                                                                                            }
                                                                                                                                            if ((var17_28 = (int)var10_21.containsKey(var12_23 = var7_18.h)) != 0) {
                                                                                                                                                var12_23 = var7_18.h;
                                                                                                                                                if ((var12_23 = var10_21.get(var12_23)) != null) {
                                                                                                                                                    var12_23 = var7_18.h;
                                                                                                                                                    var12_23 = var10_21.get(var12_23);
                                                                                                                                                    Intrinsics.checkNotNull(var12_23);
                                                                                                                                                    var12_23 = (Iterable)var12_23;
                                                                                                                                                    var12_23 = CollectionsKt.k0((Iterable)var12_23);
                                                                                                                                                    var12_23 = var12_23.iterator();
                                                                                                                                                    while (var19_30 = var12_23.hasNext()) {
                                                                                                                                                        var13_24 = var12_23.next();
                                                                                                                                                        var16_27 = (char)var8_19.contains(var13_24 = (String)var13_24);
                                                                                                                                                        if (var16_27 != '\u0000') continue;
                                                                                                                                                        var8_19.add(var13_24);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var12_23 = var7_18.h;
                                                                                                                                            var3_3 /* !! */ .put(var12_23, var8_19);
                                                                                                                                        }
                                                                                                                                        if ((var9_20 = var3_3 /* !! */ .size()) > 0) {
                                                                                                                                            var10_21.putAll(var3_3 /* !! */ );
                                                                                                                                        }
                                                                                                                                        break block131;
                                                                                                                                    }
                                                                                                                                    var8_19 = new StringBuilder();
                                                                                                                                    var10_21 = var2_2.a;
                                                                                                                                    var8_19.append((String)var10_21);
                                                                                                                                    var8_19.append(var14_25);
                                                                                                                                    var10_21 = Utility.INSTANCE;
                                                                                                                                    com.jio.jioads.jioreel.tracker.model.b.c((Utility)var10_21, var3_5, (StringBuilder)var8_19);
                                                                                                                                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                                                    var3_3 /* !! */  = JioAds$LogLevel.NONE;
                                                                                                                                }
                                                                                                                                var3_3 /* !! */  = com.jio.jioads.instreamads.vastparser.model.m.i(var7_18);
                                                                                                                                var8_19 = com.jio.jioads.instreamads.vastparser.model.m.k(var7_18);
                                                                                                                                var10_21 = "";
                                                                                                                                var12_23 = "\n";
                                                                                                                                if (var8_19 != null) {
                                                                                                                                    try {
                                                                                                                                        var13_24 = var8_19.e;
                                                                                                                                        break block110;
                                                                                                                                    }
                                                                                                                                    catch (Exception var3_6) {
                                                                                                                                        break block111;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var19_30 = false;
                                                                                                                                var13_24 = null;
                                                                                                                            }
                                                                                                                            if (var13_24 == null) break block132;
                                                                                                                            var3_3 /* !! */  = var8_19.e;
                                                                                                                            if (var3_3 /* !! */  == null) ** GOTO lbl-1000
                                                                                                                            var3_3 /* !! */  = var3_3 /* !! */ .a;
                                                                                                                            break block133;
                                                                                                                        }
                                                                                                                        if (var3_3 /* !! */  != null) {
                                                                                                                            var8_19 = var3_3 /* !! */ .e;
                                                                                                                        } else {
                                                                                                                            var9_20 = 0;
                                                                                                                            var8_19 = null;
                                                                                                                        }
                                                                                                                        if (var8_19 != null && (var3_3 /* !! */  = var3_3 /* !! */ .e) != null) {
                                                                                                                            var3_3 /* !! */  = var3_3 /* !! */ .a;
                                                                                                                        } else lbl-1000:
                                                                                                                        // 2 sources

                                                                                                                        {
                                                                                                                            var6_17 = false;
                                                                                                                            var3_3 /* !! */  = null;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var9_20 = (int)TextUtils.isEmpty((CharSequence)var3_3 /* !! */ );
                                                                                                                    if (var9_20 == 0 && var7_18 != null) {
                                                                                                                        var8_19 = var2_2.g;
                                                                                                                        var13_24 = var7_18.h;
                                                                                                                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                                                                                                                        var3_3 /* !! */  = kotlin.text.b.n((String)var3_3 /* !! */ , (String)var12_23, (String)var10_21, false);
                                                                                                                        var3_3 /* !! */  = com.jio.jioads.instreamads.vastparser.model.n.a(var7_18, (String)var3_3 /* !! */ );
                                                                                                                        var8_19.put(var13_24, var3_3 /* !! */ );
                                                                                                                    }
                                                                                                                    break block134;
                                                                                                                }
                                                                                                                var8_19 = new StringBuilder();
                                                                                                                var13_24 = var2_2.a;
                                                                                                                var8_19.append((String)var13_24);
                                                                                                                var8_19.append(var14_25);
                                                                                                                var13_24 = Utility.INSTANCE;
                                                                                                                com.jio.jioads.jioreel.tracker.model.b.c((Utility)var13_24, var3_6, var8_19);
                                                                                                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                                var3_3 /* !! */  = JioAds$LogLevel.NONE;
                                                                                                            }
                                                                                                            var3_3 /* !! */  = new ArrayList();
                                                                                                            var8_19 = com.jio.jioads.instreamads.vastparser.model.m.i(var7_18);
                                                                                                            var13_24 = com.jio.jioads.instreamads.vastparser.model.m.k(var7_18);
                                                                                                            if (var7_18 != null) {
                                                                                                                try {
                                                                                                                    var15_26 = var7_18.m;
                                                                                                                    break block112;
                                                                                                                }
                                                                                                                catch (Exception var3_7) {
                                                                                                                    break block113;
                                                                                                                }
                                                                                                            }
                                                                                                            var16_27 = '\u0000';
                                                                                                            var15_26 = null;
                                                                                                        }
                                                                                                        if (var15_26 == null) break block135;
                                                                                                        if (var13_24 == null) ** GOTO lbl-1000
                                                                                                        var8_19 = var13_24.e;
                                                                                                        break block136;
                                                                                                    }
                                                                                                    if (var8_19 != null) {
                                                                                                        var8_19 = var8_19.e;
                                                                                                    } else lbl-1000:
                                                                                                    // 2 sources

                                                                                                    {
                                                                                                        var9_20 = 0;
                                                                                                        var8_19 = null;
                                                                                                    }
                                                                                                }
                                                                                                if (var8_19 != null) {
                                                                                                    var13_24 = var8_19.b;
                                                                                                } else {
                                                                                                    var19_30 = false;
                                                                                                    var13_24 = null;
                                                                                                }
                                                                                                if (var13_24 != null) {
                                                                                                    var8_19 = var8_19.b;
                                                                                                    Intrinsics.checkNotNull(var8_19);
                                                                                                    var8_19 = var8_19.iterator();
                                                                                                    while (var19_30 = var8_19.hasNext()) {
                                                                                                        var13_24 = var8_19.next();
                                                                                                        var13_24 = (a)var13_24;
                                                                                                        var13_24 = var13_24.a;
                                                                                                        var3_3 /* !! */ .add(var13_24);
                                                                                                    }
                                                                                                    if (var7_18 != null && (var9_20 = var3_3 /* !! */ .size()) > 0) {
                                                                                                        var8_19 = com.jio.jioads.instreamads.vastparser.model.n.d(var7_18, (ArrayList)var3_3 /* !! */ );
                                                                                                        if (var8_19 != null) {
                                                                                                            var3_3 /* !! */  = var8_19;
                                                                                                        }
                                                                                                        if (var19_30 = (var8_19 = var2_2.e).containsKey(var13_24 = var7_18.h)) {
                                                                                                            var13_24 = var7_18.h;
                                                                                                            var13_24 = var8_19.get(var13_24);
                                                                                                            if ((var13_24 = (List)var13_24) != null && (var16_27 = (char)var13_24.isEmpty()) == '\u0000') {
                                                                                                                var13_24 = var13_24.iterator();
                                                                                                                while ((var16_27 = (char)var13_24.hasNext()) != '\u0000') {
                                                                                                                    var15_26 = var13_24.next();
                                                                                                                    var20_31 = var3_3 /* !! */ .contains(var15_26 = (String)var15_26);
                                                                                                                    if (var20_31) continue;
                                                                                                                    var3_3 /* !! */ .add(var15_26);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        var13_24 = var7_18.h;
                                                                                                        var8_19.put(var13_24, var3_3 /* !! */ );
                                                                                                    }
                                                                                                }
                                                                                                break block137;
                                                                                            }
                                                                                            var8_19 = new StringBuilder();
                                                                                            var13_24 = var2_2.a;
                                                                                            var8_19.append((String)var13_24);
                                                                                            var8_19.append(var14_25);
                                                                                            var13_24 = Utility.INSTANCE;
                                                                                            com.jio.jioads.jioreel.tracker.model.b.c((Utility)var13_24, var3_7, (StringBuilder)var8_19);
                                                                                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                            var3_3 /* !! */  = JioAds$LogLevel.NONE;
                                                                                        }
                                                                                        if (var7_18 != null) {
                                                                                            block115: {
                                                                                                block114: {
                                                                                                    try {
                                                                                                        var3_3 /* !! */  = com.jio.jioads.instreamads.vastparser.model.m.i(var7_18);
                                                                                                        var8_19 = var2_2.h;
                                                                                                        var13_24 = "message";
                                                                                                        if (var3_3 /* !! */  != null) break block114;
                                                                                                    }
                                                                                                    catch (Exception var3_8) {
                                                                                                        break block115;
                                                                                                    }
                                                                                                    var3_3 /* !! */  = com.jio.jioads.instreamads.vastparser.model.m.k(var7_18);
                                                                                                    if (var3_3 /* !! */  != null && (var16_27 = (char)TextUtils.isEmpty((CharSequence)(var15_26 = var3_3 /* !! */ .a))) == '\u0000' && (var15_26 = var7_18.r) == null) {
                                                                                                        var15_26 = var7_18.h;
                                                                                                        var18_29 = var3_3 /* !! */ .a;
                                                                                                        var8_19.put(var15_26, var18_29);
                                                                                                        var8_19 = new StringBuilder();
                                                                                                        var15_26 = var2_2.a;
                                                                                                        var8_19.append((String)var15_26);
                                                                                                        var15_26 = ": firstLevel wrapper skipOffset: ";
                                                                                                        var8_19.append((String)var15_26);
                                                                                                        var15_26 = var7_18.h;
                                                                                                        var8_19.append((String)var15_26);
                                                                                                        var16_27 = ':';
                                                                                                        var8_19.append(var16_27);
                                                                                                        var3_3 /* !! */  = var3_3 /* !! */ .a;
                                                                                                        var8_19.append((String)var3_3 /* !! */ );
                                                                                                        var3_3 /* !! */  = var8_19.toString();
                                                                                                        Intrinsics.checkNotNullParameter(var3_3 /* !! */ , (String)var13_24);
                                                                                                        var3_3 /* !! */  = JioAds.Companion;
                                                                                                        var3_3 /* !! */  = var3_3 /* !! */ .getInstance();
                                                                                                        var3_3 /* !! */  = var3_3 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                        var8_19 = JioAds$LogLevel.NONE;
                                                                                                    }
                                                                                                    break block138;
                                                                                                }
                                                                                                var15_26 = var3_3 /* !! */ .a;
                                                                                                var16_27 = (char)TextUtils.isEmpty((CharSequence)var15_26);
                                                                                                if (var16_27 == '\u0000') {
                                                                                                    var15_26 = var7_18.h;
                                                                                                    var18_29 = var3_3 /* !! */ .a;
                                                                                                    var8_19.put(var15_26, var18_29);
                                                                                                    var8_19 = new StringBuilder();
                                                                                                    var15_26 = var2_2.a;
                                                                                                    var8_19.append((String)var15_26);
                                                                                                    var15_26 = ": inline linear skipOffset: ";
                                                                                                    var8_19.append((String)var15_26);
                                                                                                    var3_3 /* !! */  = var3_3 /* !! */ .a;
                                                                                                    var8_19.append((String)var3_3 /* !! */ );
                                                                                                    var3_3 /* !! */  = var8_19.toString();
                                                                                                    Intrinsics.checkNotNullParameter(var3_3 /* !! */ , var13_24);
                                                                                                    var3_3 /* !! */  = JioAds.Companion;
                                                                                                    var3_3 /* !! */  = var3_3 /* !! */ .getInstance();
                                                                                                    var3_3 /* !! */  = var3_3 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                    var8_19 = JioAds$LogLevel.NONE;
                                                                                                }
                                                                                                break block138;
                                                                                            }
                                                                                            var8_19 = new StringBuilder();
                                                                                            var13_24 = var2_2.a;
                                                                                            var8_19.append((String)var13_24);
                                                                                            var8_19.append(var14_25);
                                                                                            var13_24 = Utility.INSTANCE;
                                                                                            com.jio.jioads.jioreel.tracker.model.b.c((Utility)var13_24, var3_8, (StringBuilder)var8_19);
                                                                                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                            var3_3 /* !! */  = JioAds$LogLevel.NONE;
                                                                                        }
                                                                                    }
                                                                                    if (var7_18 != null) {
                                                                                        block118: {
                                                                                            block117: {
                                                                                                block116: {
                                                                                                    try {
                                                                                                        var3_3 /* !! */  = com.jio.jioads.instreamads.vastparser.model.m.i(var7_18);
                                                                                                        if (var3_3 /* !! */  == null) break block116;
                                                                                                        var8_19 = var3_3 /* !! */ .d;
                                                                                                        break block117;
                                                                                                    }
                                                                                                    catch (Exception var3_9) {
                                                                                                        break block118;
                                                                                                    }
                                                                                                }
                                                                                                var9_20 = 0;
                                                                                                var8_19 = null;
                                                                                            }
                                                                                            if (var8_19 != null && (var9_20 = (int)TextUtils.isEmpty((CharSequence)(var8_19 = var3_3 /* !! */ .d))) == 0) {
                                                                                                var8_19 = var2_2.i;
                                                                                                var13_24 = var7_18.h;
                                                                                                var3_3 /* !! */  = var3_3 /* !! */ .d;
                                                                                                var8_19.put(var13_24, var3_3 /* !! */ );
                                                                                            }
                                                                                            break block139;
                                                                                        }
                                                                                        var8_19 = new StringBuilder();
                                                                                        var13_24 = var2_2.a;
                                                                                        var8_19.append((String)var13_24);
                                                                                        var8_19.append(var14_25);
                                                                                        var13_24 = Utility.INSTANCE;
                                                                                        com.jio.jioads.jioreel.tracker.model.b.c((Utility)var13_24, var3_9, (StringBuilder)var8_19);
                                                                                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                        var3_3 /* !! */  = JioAds$LogLevel.NONE;
                                                                                    }
                                                                                }
                                                                                var3_3 /* !! */  = new ArrayList();
                                                                                if (var7_18 != null) {
                                                                                    try {
                                                                                        var8_19 = var7_18.m;
                                                                                        break block119;
                                                                                    }
                                                                                    catch (Exception var3_10) {
                                                                                        break block120;
                                                                                    }
                                                                                }
                                                                                var9_20 = 0;
                                                                                var8_19 = null;
                                                                            }
                                                                            if (var8_19 == null) break block140;
                                                                            var8_19 = var7_18.m;
                                                                            if (var8_19 == null) ** GOTO lbl-1000
                                                                            var8_19 = var8_19.f;
                                                                            break block141;
                                                                        }
                                                                        if (var7_18 != null) {
                                                                            var8_19 = var7_18.n;
                                                                        } else {
                                                                            var9_20 = 0;
                                                                            var8_19 = null;
                                                                        }
                                                                        if (var8_19 != null && (var8_19 = var7_18.n) != null) {
                                                                            var8_19 = var8_19.b;
                                                                        } else lbl-1000:
                                                                        // 2 sources

                                                                        {
                                                                            var9_20 = 0;
                                                                            var8_19 = null;
                                                                        }
                                                                    }
                                                                    var19_30 = TextUtils.isEmpty((CharSequence)var8_19);
                                                                    if (!var19_30) {
                                                                        Intrinsics.checkNotNull(var8_19);
                                                                        var3_3 /* !! */ .add(var8_19);
                                                                    } else {
                                                                        if (var7_18 != null) {
                                                                            var8_19 = var7_18.l;
                                                                        } else {
                                                                            var9_20 = 0;
                                                                            var8_19 = null;
                                                                        }
                                                                        var9_20 = (int)TextUtils.isEmpty((CharSequence)var8_19);
                                                                        if (var9_20 == 0 && var7_18 != null) {
                                                                            var8_19 = var7_18.l;
                                                                            var3_3 /* !! */ .add(var8_19);
                                                                        }
                                                                    }
                                                                    if (var7_18 != null && (var9_20 = var3_3 /* !! */ .size()) > 0) {
                                                                        var8_19 = com.jio.jioads.instreamads.vastparser.model.n.d(var7_18, (ArrayList)var3_3 /* !! */ );
                                                                        if (var8_19 != null) {
                                                                            var3_3 /* !! */  = var8_19;
                                                                        }
                                                                        if (var19_30 = (var8_19 = var2_2.s).containsKey(var13_24 = var7_18.h)) {
                                                                            var13_24 = var7_18.h;
                                                                            var13_24 = var8_19.get(var13_24);
                                                                            if ((var13_24 = (List)var13_24) != null && (var16_27 = (char)var13_24.isEmpty()) == '\u0000') {
                                                                                var13_24 = var13_24.iterator();
                                                                                while ((var16_27 = (char)var13_24.hasNext()) != '\u0000') {
                                                                                    var15_26 = var13_24.next();
                                                                                    var20_31 = var3_3 /* !! */ .contains(var15_26 = (String)var15_26);
                                                                                    if (var20_31) continue;
                                                                                    var3_3 /* !! */ .add(var15_26);
                                                                                }
                                                                            }
                                                                        }
                                                                        var13_24 = var7_18.h;
                                                                        var8_19.put(var13_24, var3_3 /* !! */ );
                                                                    }
                                                                    break block142;
                                                                }
                                                                var8_19 = new StringBuilder();
                                                                var13_24 = var2_2.a;
                                                                var8_19.append((String)var13_24);
                                                                var8_19.append(var14_25);
                                                                var13_24 = Utility.INSTANCE;
                                                                com.jio.jioads.jioreel.tracker.model.b.c((Utility)var13_24, var3_10, (StringBuilder)var8_19);
                                                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                var3_3 /* !! */  = JioAds$LogLevel.NONE;
                                                            }
                                                            var8_19 = var2_2.q;
                                                            if (var7_18 == null) break block121;
                                                            try {
                                                                var3_3 /* !! */  = com.jio.jioads.instreamads.vastparser.model.m.f(var7_18);
                                                                if (var3_3 /* !! */  == null || (var19_30 = var3_3 /* !! */ .isEmpty())) break block121;
                                                                var13_24 = new Random();
                                                                var15_26 = var3_3 /* !! */ .iterator();
                                                                while (var20_31 = var15_26.hasNext()) {
                                                                    var18_29 = var15_26.next();
                                                                    var18_29 = (b)var18_29;
                                                                    var21_32 = var18_29.f;
                                                                    var22_33 = TextUtils.isEmpty((CharSequence)var21_32);
                                                                    if (!var22_33) continue;
                                                                    var21_32 = Utility.INSTANCE;
                                                                    var23_34 = StringCompanionObject.INSTANCE;
                                                                    var23_34 = "%04d";
                                                                    var24_35 = 10000;
                                                                    var24_35 = var13_24.nextInt(var24_35);
                                                                    var25_36 = var24_35;
                                                                    var26_37 = var5_16;
                                                                }
                                                            }
                                                            catch (Exception var3_12) {
                                                                var26_37 = var5_16;
                                                                break block122;
                                                            }
                                                            {
                                                                try {
                                                                    var5_16 = new Object[var4_15];
                                                                    var5_16[0] = var25_36;
                                                                    var5_16 = Arrays.copyOf(var5_16, (int)var4_15);
                                                                    var5_16 = String.format((String)var23_34, (Object[])var5_16);
                                                                    var25_36 = "format(format, *args)";
                                                                    Intrinsics.checkNotNullExpressionValue(var5_16, (String)var25_36);
                                                                    var18_29.f = var5_16 = var21_32.getCcbValue((String)var5_16);
                                                                    var5_16 = var26_37;
                                                                    continue;
                                                                }
                                                                catch (Exception var3_11) {
                                                                    break block122;
                                                                    break;
                                                                }
                                                            }
                                                            var26_37 = var5_16;
                                                            var5_16 = var7_18.h;
                                                            var8_19.put(var5_16, var3_3 /* !! */ );
                                                            break block143;
                                                        }
                                                        var5_16 = new StringBuilder();
                                                        var25_36 = var2_2.a;
                                                        var5_16.append((String)var25_36);
                                                        var5_16.append(var14_25);
                                                        var25_36 = Utility.INSTANCE;
                                                        com.jio.jioads.jioreel.tracker.model.b.c((Utility)var25_36, (Exception)var3_3 /* !! */ , var5_16);
                                                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                        var3_3 /* !! */  = JioAds$LogLevel.NONE;
                                                        break block143;
                                                    }
                                                    var26_37 = var5_16;
                                                }
                                                if (var7_18 != null) {
                                                    var3_3 /* !! */  = var7_18.h;
                                                } else {
                                                    var6_17 = false;
                                                    var3_3 /* !! */  = null;
                                                }
                                                var3_3 /* !! */  = (List)var8_19.get(var3_3 /* !! */ );
                                                var5_16 = new HashMap();
                                                if (var3_3 /* !! */  == null) break block144;
                                                try {
                                                    var3_3 /* !! */  = var3_3 /* !! */ .iterator();
lbl556:
                                                    // 4 sources

                                                    while ((var24_35 = var3_3 /* !! */ .hasNext()) != 0) {
                                                        var25_36 = var3_3 /* !! */ .next();
                                                        if ((var25_36 = (b)var25_36) == null) break block123;
                                                        var13_24 = var25_36.f;
                                                        break block124;
                                                    }
                                                    break block125;
                                                }
                                                catch (Exception var3_13) {
                                                    break block126;
                                                }
                                            }
                                            var19_30 = false;
                                            var13_24 = null;
                                        }
                                        if (var13_24 == null) ** GOTO lbl556
                                        var13_24 = var25_36.h;
                                        if (var7_18 == null || var13_24 == null || (var16_27 = (char)TextUtils.isEmpty((CharSequence)var13_24)) != '\u0000') ** GOTO lbl556
                                        var25_36 = var25_36.f;
                                        Intrinsics.checkNotNull(var25_36);
                                        var13_24 = kotlin.text.b.n((String)var13_24, var12_23, (String)var10_21, false);
                                        var13_24 = com.jio.jioads.instreamads.vastparser.model.n.a(var7_18, (String)var13_24);
                                        var5_16.put(var25_36, var13_24);
                                        ** GOTO lbl556
                                    }
                                    var3_3 /* !! */  = var2_2.j;
                                    if (var7_18 != null) {
                                        var25_36 = var7_18.h;
                                    } else {
                                        var24_35 = 0;
                                        var25_36 = null;
                                    }
                                    var3_3 /* !! */ .put(var25_36, var5_16);
                                    break block144;
                                }
                                var5_16 = new StringBuilder();
                                var25_36 = var2_2.a;
                                var5_16.append((String)var25_36);
                                var5_16.append(var14_25);
                                var25_36 = Utility.INSTANCE;
                                com.jio.jioads.jioreel.tracker.model.b.c((Utility)var25_36, var3_13, var5_16);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var3_3 /* !! */  = JioAds$LogLevel.NONE;
                            }
                            var2_2.g((j)var7_18);
                            if (var7_18 != null) {
                                var3_3 /* !! */  = var7_18.h;
                            } else {
                                var6_17 = false;
                                var3_3 /* !! */  = null;
                            }
                            var3_3 /* !! */  = (List)var8_19.get(var3_3 /* !! */ );
                            var5_16 = new HashMap();
                            if (var3_3 /* !! */  == null) break block145;
                            try {
                                var3_3 /* !! */  = var3_3 /* !! */ .iterator();
lbl612:
                                // 4 sources

                                while ((var24_35 = (int)var3_3 /* !! */ .hasNext()) != 0) {
                                    var25_36 = var3_3 /* !! */ .next();
                                    var25_36 = (b)var25_36;
                                    var8_19 = var25_36.j;
                                    if (var8_19 == null || (var10_21 = var25_36.f) == null) continue;
                                    Intrinsics.checkNotNull(var8_19);
                                    if (var7_18 == null || (var11_22 = var8_19.isEmpty() ^ var4_15) == 0) continue;
                                    break block127;
                                }
                                break block128;
                            }
                            catch (Exception var3_14) {
                                break block129;
                            }
                        }
                        var10_21 = new ArrayList<Iterator<Object>>();
                        var8_19 = var8_19.iterator();
                        while ((var17_28 = (int)var8_19.hasNext()) != 0) {
                            var12_23 = var8_19.next();
                            var12_23 = (i)var12_23;
                            var13_24 = var12_23.b;
                            var19_30 = TextUtils.isEmpty((CharSequence)var13_24);
                            if (!var19_30) {
                                var15_26 = var12_23.a;
                                var12_23 = var12_23.b;
                                Intrinsics.checkNotNull(var12_23);
                                var12_23 = com.jio.jioads.instreamads.vastparser.model.n.a(var7_18, (String)var12_23);
                                var13_24 = new i((String)var15_26, (String)var12_23);
                                var10_21.add((Iterator<Object>)var13_24);
                                continue;
                            }
                            var10_21.add((Iterator<Object>)var12_23);
                        }
                        var25_36 = var25_36.f;
                        Intrinsics.checkNotNull(var25_36);
                        var5_16.put(var25_36, var10_21);
                        ** GOTO lbl612
                    }
                    var3_3 /* !! */  = var2_2.k;
                    if (var7_18 != null) {
                        var25_36 = var7_18.h;
                    } else {
                        var24_35 = 0;
                        var25_36 = null;
                    }
                    var3_3 /* !! */ .put(var25_36, var5_16);
                    break block145;
                }
                var5_16 = new StringBuilder();
                var25_36 = var2_2.a;
                var5_16.append((String)var25_36);
                var5_16.append(var14_25);
                var25_36 = Utility.INSTANCE;
                com.jio.jioads.jioreel.tracker.model.b.c((Utility)var25_36, var3_14, (StringBuilder)var5_16);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var3_3 /* !! */  = JioAds$LogLevel.NONE;
            }
            var2_2.l((j)var7_18);
            var2_2.o((j)var7_18);
            var2_2.q((j)var7_18);
            var2_2.s((j)var7_18);
            var5_16 = var26_37;
        }
    }

    public final String j(String string2) {
        return (String)this.i.get(string2);
    }

    public final ArrayList k(m object, String object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "finalVastModel");
        ArrayList<Object> arrayList = new ArrayList<Object>();
        this.r((m)object, (String)object2);
        object = this.f;
        if (object != null && !(bl2 = ((ArrayList)object).isEmpty())) {
            object = this.f;
            Intrinsics.checkNotNull(object);
            bl2 = CollectionsKt.F((Iterable)object, object2);
            if (bl2) {
                boolean bl3;
                object = this.f;
                Intrinsics.checkNotNull(object);
                object = ((ArrayList)object).iterator();
                while (bl3 = object.hasNext()) {
                    boolean bl4;
                    Object v4;
                    Object object3 = this.c;
                    object2 = (String)object.next();
                    boolean bl5 = ((HashMap)object3).containsKey(object2);
                    if (!bl5 || (v4 = ((HashMap)object3).get(object2)) == null) continue;
                    object2 = ((HashMap)object3).get(object2);
                    Intrinsics.checkNotNull(object2);
                    object2 = CollectionsKt.k0((Iterable)object2).iterator();
                    while (bl4 = object2.hasNext()) {
                        object3 = (String)object2.next();
                        bl5 = arrayList.contains(object3);
                        if (bl5) continue;
                        arrayList.add(object3);
                    }
                }
                object = this.x;
                if (object != null && !(bl3 = ((HashMap)object).isEmpty())) {
                    object2 = JioEventTracker$TrackingEvents.EVENT_IMPRESSION.getType();
                    if (object != null) {
                        object = (List)((HashMap)object).get(object2);
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    if (object != null && (bl3 = object.isEmpty() ^ true)) {
                        arrayList.addAll((Collection<Object>)object);
                    }
                }
            }
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(j object) {
        try {
            Object object2;
            boolean bl2;
            boolean bl3;
            CharSequence charSequence;
            Object object3 = this.q;
            String string2 = null;
            if (object != null) {
                charSequence = ((j)object).h;
            } else {
                bl3 = false;
                charSequence = null;
            }
            object3 = ((HashMap)object3).get(charSequence);
            object3 = (List)object3;
            bl3 = false;
            charSequence = null;
            if (object != null && object3 != null && !(bl2 = object3.isEmpty()) && (object2 = object3.get(0)) != null) {
                object2 = object3.get(0);
                if ((object2 = (b)object2) != null) {
                    object2 = ((b)object2).b;
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (object2 != null) {
                    boolean bl4;
                    object3 = object3.get(0);
                    if ((object3 = (b)object3) != null) {
                        string2 = ((b)object3).b;
                    }
                    if (!(bl4 = TextUtils.isEmpty(string2))) {
                        Intrinsics.checkNotNull(string2);
                        string2 = com.jio.jioads.instreamads.vastparser.model.n.a((j)object, string2);
                    }
                    object3 = this.m;
                    charSequence = ((j)object).h;
                    ((HashMap)object3).put(charSequence, string2);
                    bl3 = Utility.isURLValid(string2);
                    if (bl3) return;
                    object = ((j)object).h;
                    object2 = "<!DOCTYPE html><body style=\"margin:0;padding:0\">";
                    charSequence = new StringBuilder((String)object2);
                    ((StringBuilder)charSequence).append(string2);
                    string2 = "</body></html>";
                    ((StringBuilder)charSequence).append(string2);
                    string2 = ((StringBuilder)charSequence).toString();
                    ((HashMap)object3).put(object, string2);
                    return;
                }
            }
            if (object == null) return;
            if (object3 == null) return;
            bl2 = object3.isEmpty();
            if (bl2) {
                return;
            }
            object2 = object3.get(0);
            if (object2 == null) return;
            object2 = object3.get(0);
            if ((object2 = (b)object2) != null) {
                object2 = ((b)object2).a;
            } else {
                bl2 = false;
                object2 = null;
            }
            if (object2 == null) return;
            object2 = object3.get(0);
            if ((object2 = (b)object2) != null) {
                object2 = ((b)object2).a;
            } else {
                bl2 = false;
                object2 = null;
            }
            boolean bl5 = TextUtils.isEmpty(object2);
            if (!bl5) {
                Intrinsics.checkNotNull(object2);
                object2 = com.jio.jioads.instreamads.vastparser.model.n.a((j)object, object2);
            }
            Object object4 = this.n;
            Object object5 = ((j)object).h;
            ((HashMap)object4).put(object5, object2);
            object2 = object3.get(0);
            object2 = (b)object2;
            if (object2 != null) {
                object2 = ((b)object2).d;
            } else {
                bl2 = false;
                object2 = null;
            }
            if (object2 != null) {
                int n3;
                object2 = this.o;
                object4 = ((j)object).h;
                object5 = object3.get(0);
                if ((object5 = (b)object5) != null) {
                    object5 = ((b)object5).d;
                } else {
                    n3 = 0;
                    object5 = null;
                }
                Intrinsics.checkNotNull(object5);
                n3 = Integer.parseInt((String)object5);
                object5 = n3;
                ((HashMap)object2).put((Object)object4, (Object)object5);
            }
            object2 = object3.get(0);
            if ((object2 = (b)object2) != null) {
                object2 = ((b)object2).e;
            } else {
                bl2 = false;
                object2 = null;
            }
            if (object2 == null) return;
            object2 = this.p;
            object = ((j)object).h;
            object3 = object3.get(0);
            if ((object3 = (b)object3) != null) {
                string2 = ((b)object3).e;
            }
            Intrinsics.checkNotNull(string2);
            int n4 = Integer.parseInt(string2);
            object3 = n4;
            ((HashMap)object2).put(object, object3);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final ArrayList m(m iterator, String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(iterator, "finalVastModel");
        ArrayList arrayList = new ArrayList();
        this.r((m)((Object)iterator), string2);
        iterator = this.f;
        if (iterator != null && !(bl2 = ((ArrayList)((Object)iterator)).isEmpty())) {
            iterator = this.f;
            Intrinsics.checkNotNull(iterator);
            bl2 = CollectionsKt.F((Iterable)((Object)iterator), string2);
            if (bl2) {
                boolean bl3;
                iterator = this.f;
                Intrinsics.checkNotNull(iterator);
                iterator = ((ArrayList)((Object)iterator)).iterator();
                while (bl3 = iterator.hasNext()) {
                    Object v4;
                    Object object = (String)iterator.next();
                    HashMap hashMap = this.d;
                    boolean bl4 = hashMap.containsKey(string2);
                    if (!bl4 || (v4 = hashMap.get(object)) == null) continue;
                    object = hashMap.get(object);
                    Intrinsics.checkNotNull(object);
                    object = CollectionsKt.k0((Iterable)object);
                    arrayList.addAll(object);
                }
            }
        }
        return arrayList;
    }

    public final List n(String string2) {
        return (List)this.s.get(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void o(j object) {
        Cloneable cloneable;
        boolean bl2;
        ArrayList arrayList;
        block25: {
            int n3;
            int n4;
            block27: {
                int n7;
                block26: {
                    Exception exception2;
                    block23: {
                        List list;
                        Object object2;
                        block24: {
                            List list2;
                            block22: {
                                block21: {
                                    try {
                                        arrayList = new ArrayList();
                                        bl2 = false;
                                        cloneable = null;
                                        if (object == null) break block21;
                                        object2 = ((j)object).m;
                                        break block22;
                                    }
                                    catch (Exception exception2) {
                                        break block23;
                                    }
                                }
                                n4 = 0;
                                object2 = null;
                            }
                            if (object2 == null) break block24;
                            object2 = ((j)object).m;
                            if (object2 != null) {
                                list2 = ((q)object2).j;
                            } else {
                                n7 = 0;
                                list2 = null;
                            }
                            if (list2 == null) break block25;
                            if (object2 != null) {
                                object2 = ((q)object2).j;
                            } else {
                                n4 = 0;
                                object2 = null;
                            }
                            Intrinsics.checkNotNull(object2);
                            n4 = object2.size();
                            if (n4 <= 0) break block25;
                            object2 = ((j)object).m;
                            if (object2 != null) {
                                object2 = ((q)object2).j;
                            } else {
                                n4 = 0;
                                object2 = null;
                            }
                            Intrinsics.checkNotNull(object2);
                            n4 = object2.size();
                            list2 = null;
                            break block26;
                        }
                        if (object != null) {
                            object2 = ((j)object).n;
                        } else {
                            n4 = 0;
                            object2 = null;
                        }
                        if (object2 == null) break block25;
                        object2 = ((j)object).n;
                        if (object2 != null) {
                            list = ((e)object2).h;
                        } else {
                            n3 = 0;
                            list = null;
                        }
                        if (list == null) break block25;
                        if (object2 != null) {
                            object2 = ((e)object2).h;
                        } else {
                            n4 = 0;
                            object2 = null;
                        }
                        Intrinsics.checkNotNull(object2);
                        n4 = object2.size();
                        if (n4 <= 0) break block25;
                        object2 = ((j)object).n;
                        if (object2 != null) {
                            object2 = ((e)object2).h;
                        } else {
                            n4 = 0;
                            object2 = null;
                        }
                        Intrinsics.checkNotNull(object2);
                        n4 = object2.size();
                        list = null;
                        break block27;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    Object object3 = this.a;
                    stringBuilder.append((String)object3);
                    stringBuilder.append(": ");
                    object3 = Utility.INSTANCE;
                    com.jio.jioads.jioreel.tracker.model.b.c((Utility)object3, exception2, stringBuilder);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                    return;
                }
                for (n7 = 0; n7 < n4; ++n7) {
                    Object object4 = ((j)object).m;
                    object4 = object4 != null ? ((q)object4).j : null;
                    Intrinsics.checkNotNull(object4);
                    object4 = object4.get(n7);
                    object4 = (d)object4;
                    object4 = ((d)object4).a;
                    if (object4 == null) continue;
                    int n8 = object4.size();
                    for (int i3 = 0; i3 < n8; ++i3) {
                        Object e2 = object4.get(i3);
                        if (e2 == null) continue;
                        e2 = object4.get(i3);
                        Intrinsics.checkNotNull(e2);
                        arrayList.add(e2);
                    }
                }
                break block25;
            }
            for (n3 = 0; n3 < n4; ++n3) {
                Object object5 = ((j)object).n;
                object5 = object5 != null ? ((e)object5).h : null;
                Intrinsics.checkNotNull(object5);
                object5 = object5.get(n3);
                object5 = (d)object5;
                object5 = ((d)object5).a;
                if (object5 == null) continue;
                int n10 = object5.size();
                for (int i8 = 0; i8 < n10; ++i8) {
                    Object e5 = object5.get(i8);
                    if (e5 == null) continue;
                    e5 = object5.get(i8);
                    Intrinsics.checkNotNull(e5);
                    arrayList.add(e5);
                }
            }
        }
        if ((cloneable = com.jio.jioads.instreamads.vastparser.model.n.d((j)object, arrayList)) != null) {
            arrayList = cloneable;
        }
        if (bl2 = arrayList.isEmpty()) return;
        if (object == null) return;
        cloneable = this.r;
        object = ((j)object).h;
        ((HashMap)cloneable).put(object, arrayList);
    }

    public final String p(String string2) {
        return (String)this.h.get(string2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q(j var1_1) {
        block17: {
            block16: {
                var2_4 = 1;
                var3_5 = null;
                if (var1_1 != null) {
                    try {
                        var4_6 = var1_1.n;
                        break block16;
                    }
                    catch (Exception var1_2) {
                        break block17;
                    }
                }
                var5_7 = 0;
                var4_6 = null;
            }
            if (var4_6 == null) return;
            var4_6 = var1_1.n;
            if (var4_6 == null) return;
            var4_6 = var4_6.g;
            if (var4_6 == null) return;
            var5_7 = var4_6.isEmpty() ^ var2_4;
            if (var5_7 != var2_4) return;
            var4_6 = var1_1.n;
            var6_8 = 0;
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
            var7_9 = this.t;
            if (var4_6 == null) ** GOTO lbl50
            {
                var8_10 = var4_6.getDeeplink();
                if (var8_10 != null && (var2_4 = var8_10.length()) != 0) {
                    var8_10 = var1_1.h;
                    var3_5 = var4_6.getDeeplink();
                    Intrinsics.checkNotNull(var3_5);
                    var3_5 = com.jio.jioads.instreamads.vastparser.model.n.a((j)var1_1, (String)var3_5);
                    var7_9.put(var8_10, var3_5);
                }
                if ((var8_10 = var4_6.getFallback()) == null) return;
                var2_4 = var8_10.length();
                if (var2_4 == 0) {
                    return;
                }
                var8_10 = this.g;
                var3_5 = var1_1.h;
                var4_6 = var4_6.getFallback();
                Intrinsics.checkNotNull(var4_6);
                var1_1 = com.jio.jioads.instreamads.vastparser.model.n.a((j)var1_1, (String)var4_6);
                var8_10.put(var3_5, var1_1);
                return;
lbl50:
                // 1 sources

                var4_6 = var1_1.n;
                var9_12 = var4_6 != null ? var4_6.h : null;
                if (var9_12 == null) return;
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
                    var9_12 = var1_1.n;
                    var9_12 = var9_12 != null ? var9_12.h : null;
                    Intrinsics.checkNotNull(var9_12);
                    var9_12 = var9_12.get(var6_8);
                    var9_12 = (d)var9_12;
                    var10_13 = var9_12.b;
                    if (var10_13 != null && (var11_14 = var10_13.length()) != 0) {
                        var10_13 = var1_1.h;
                        var12_15 = var9_12.b;
                        Intrinsics.checkNotNull(var12_15);
                        var12_15 = com.jio.jioads.instreamads.vastparser.model.n.a((j)var1_1, var12_15);
                        var7_9.put(var10_13, var12_15);
                    }
                    if ((var10_13 = var9_12.c) != null && (var11_14 = var10_13.length()) != 0) {
                        var10_13 = this.u;
                        var12_15 = var1_1.h;
                        var9_12 = var9_12.c;
                        Intrinsics.checkNotNull(var9_12);
                        var9_12 = com.jio.jioads.instreamads.vastparser.model.n.a((j)var1_1, (String)var9_12);
                        var10_13.put(var12_15, var9_12);
                    }
                    var6_8 += var2_4;
                }
                return;
            }
        }
        var8_11 = new StringBuilder();
        var3_5 = this.a;
        var8_11.append((String)var3_5);
        var8_11.append(": ");
        var3_5 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)var3_5, var1_2, var8_11);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var1_3 = JioAds$LogLevel.NONE;
    }

    public final void r(m object, String object2) {
        block10: {
            Object object3;
            boolean bl2;
            int n3;
            Object object4;
            block11: {
                object4 = "finalVastModel";
                Intrinsics.checkNotNullParameter(object, (String)object4);
                if (object2 == null || (n3 = ((String)object2).length()) == 0) break block10;
                object4 = this.f;
                if (object4 == null) break block11;
                Intrinsics.checkNotNull(object4);
                n3 = (int)(object4.contains(object2) ? 1 : 0);
                if (n3 != 0) break block10;
            }
            if ((object4 = this.f) != null) {
                object4.clear();
            }
            n3 = 0;
            object4 = null;
            this.f = null;
            Object object5 = new HashMap();
            object = ((m)object).c.iterator();
            Object object6 = null;
            while (bl2 = object.hasNext()) {
                boolean bl3;
                String string2;
                object3 = (j)object.next();
                if (object3 != null) {
                    string2 = ((j)object3).h;
                } else {
                    bl3 = false;
                    string2 = null;
                }
                if (string2 == null) continue;
                string2 = ((j)object3).h;
                Intrinsics.checkNotNull(string2);
                ((HashMap)object5).put(string2, object3);
                string2 = ((j)object3).h;
                bl3 = Intrinsics.areEqual(string2, object2);
                if (!bl3) continue;
                object6 = object3;
            }
            if (object6 != null) {
                object = this.f;
                if (object == null) {
                    object = new ArrayList();
                    this.f = object;
                }
                object = this.f;
                Intrinsics.checkNotNull(object);
                ((ArrayList)object).add(object2);
                object = null;
                this.h((j)object6, (HashMap)object5, 0);
            }
            object = new StringBuilder();
            object5 = this.a;
            object6 = ": wrapper & linear adId list for ad ";
            object3 = ": ";
            X50.a(object, (String)object5, (String)object6, (String)object2, (String)object3);
            object2 = this.f;
            if (object2 != null) {
                object4 = ((ArrayList)object2).toArray();
            }
            object2 = Arrays.toString(object4);
            object4 = "toString(this)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void s(j object) {
        Exception exception2;
        Object object2;
        Serializable serializable;
        block9: {
            int n3;
            serializable = new HashMap();
            object2 = new ArrayList();
            if (object != null) {
                boolean bl2;
                Iterator iterator;
                block8: {
                    try {
                        iterator = ((j)object).m;
                        if (iterator == null || (iterator = ((q)((Object)iterator)).h) == null || (iterator = ((p)((Object)iterator)).b) == null) break block8;
                        Intrinsics.checkNotNull(iterator);
                        ((ArrayList)object2).addAll(iterator);
                    }
                    catch (Exception exception2) {
                        break block9;
                    }
                }
                if ((iterator = ((j)object).n) != null && (iterator = ((e)((Object)iterator)).j) != null && (iterator = ((p)((Object)iterator)).b) != null) {
                    Intrinsics.checkNotNull(iterator);
                    ((ArrayList)object2).addAll(iterator);
                }
                if ((iterator = com.jio.jioads.instreamads.vastparser.model.n.d((j)object, (ArrayList)object2)) != null) {
                    object2 = iterator;
                }
                if (bl2 = ((HashMap)serializable).containsKey(iterator = ((j)object).h)) {
                    boolean bl3;
                    iterator = ((j)object).h;
                    iterator = ((HashMap)serializable).get(iterator);
                    if ((iterator = (List)((Object)iterator)) != null && !(bl3 = iterator.isEmpty())) {
                        iterator = iterator.iterator();
                        while (bl3 = iterator.hasNext()) {
                            Object object3 = iterator.next();
                            boolean bl4 = object2.contains(object3 = (String)object3);
                            if (bl4) continue;
                            object2.add(object3);
                        }
                    }
                }
                object = ((j)object).h;
                ((HashMap)serializable).put(object, object2);
            }
            if ((n3 = ((HashMap)serializable).size()) <= 0) return;
            object = this.d;
            ((HashMap)object).putAll(serializable);
            return;
        }
        serializable = new StringBuilder();
        object2 = this.a;
        ((StringBuilder)serializable).append((String)object2);
        ((StringBuilder)serializable).append(": ");
        object2 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object2, exception2, (StringBuilder)serializable);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }
}

