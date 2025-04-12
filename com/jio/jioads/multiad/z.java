/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.jio.jioads.multiad;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.multiad.H;
import com.jio.jioads.multiad.I;
import com.jio.jioads.multiad.b_0;
import com.jio.jioads.multiad.d_0;
import com.jio.jioads.multiad.g_0;
import com.jio.jioads.multiad.j;
import com.jio.jioads.multiad.model.a;
import com.jio.jioads.multiad.model.b;
import com.jio.jioads.multiad.model.e;
import com.jio.jioads.multiad.model.f;
import com.jio.jioads.multiad.o;
import com.jio.jioads.multiad.s;
import com.jio.jioads.multiad.t;
import com.jio.jioads.multiad.v;
import com.jio.jioads.network.c;
import com.jio.jioads.util.Utility;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

public final class z {
    public final hh3_2 A;
    public Context B;
    public int C;
    public final HashMap D;
    public JSONObject E;
    public c F;
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final int i;
    public final String j;
    public final String k;
    public final boolean l;
    public HashMap m;
    public d_0 n;
    public com.jio.jioads.common.b o;
    public com.jio.jioads.common.a p;
    public j q;
    public H r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public ArrayList w;
    public boolean x;
    public ArrayList y;
    public ArrayList z;

    public z(HashMap hashMap, String string2, boolean bl2, d_0 d_02, String string3, boolean bl3, String string4, boolean bl4, boolean bl5, long l2, int n3, String string5, com.jio.jioads.common.b b2, com.jio.jioads.common.a a2, String string6, boolean bl6, j j3) {
        z z5 = this;
        Object object = hashMap;
        Object object2 = d_02;
        Intrinsics.checkNotNullParameter(hashMap, "sessionMap");
        Intrinsics.checkNotNullParameter(d_02, "multiAdSelectionListener");
        Intrinsics.checkNotNullParameter(string3, "ccbString");
        Intrinsics.checkNotNullParameter(string4, "packageName");
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Intrinsics.checkNotNullParameter(a2, "mAdDataStore");
        Intrinsics.checkNotNullParameter(string6, "multiAdPrefKey");
        Intrinsics.checkNotNullParameter(j3, "dataObserver");
        this.a = string2;
        this.b = bl2;
        this.c = string3;
        this.d = bl3;
        this.e = string4;
        this.f = bl4;
        this.g = bl5;
        this.h = l2;
        this.i = n3;
        this.j = string5;
        this.k = string6;
        this.l = bl6;
        this.m = hashMap;
        this.n = d_02;
        this.o = b2;
        this.p = a2;
        this.q = j3;
        this.w = object;
        super();
        this.y = object;
        super();
        this.z = object;
        int n4 = 2;
        super(b2, n4);
        object = yr1_2.b((Function0)object);
        this.A = object;
        object = b2.k0();
        object2 = JioAdView$AdState.DESTROYED;
        object = object != object2 ? b2.Y() : null;
        z5.B = object;
        z5.D = object = new HashMap();
        super();
        z5.E = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void j(z var0, f var1_1, HashMap var2_2, ArrayList var3_3, ArrayList var4_4, long var5_5, String var7_6) {
        var8_7 = var0;
        if (var1_1 != null) ** GOTO lbl-1000
        var9_8 /* !! */  = var0.p;
        if (var9_8 /* !! */  != null && (var9_8 /* !! */  = var9_8 /* !! */ .c) != null && (var9_8 /* !! */  = var9_8 /* !! */ .b) != null) {
            var9_8 /* !! */  = var9_8 /* !! */ .a;
        } else {
            var10_9 = false;
            var9_8 /* !! */  = null;
        }
        var10_9 = TextUtils.isEmpty((CharSequence)var9_8 /* !! */ );
        if (!var10_9) {
            var10_9 = true;
        } else lbl-1000:
        // 2 sources

        {
            var10_9 = false;
            var9_8 /* !! */  = null;
        }
        var8_7.s = var10_9;
        var11_10 = 0L;
        var13_11 = var5_5 == var11_10 ? 0 : (var5_5 < var11_10 ? -1 : 1);
        if (var13_11 <= 0 || !var10_9 || (var10_9 = var8_7.f)) ** GOTO lbl-1000
        var9_8 /* !! */  = var8_7.p;
        if (var9_8 /* !! */  != null && (var9_8 /* !! */  = var9_8 /* !! */ .c) != null && (var9_8 /* !! */  = var9_8 /* !! */ .b) != null) {
            var9_8 /* !! */  = var9_8 /* !! */ .a;
        } else {
            var10_9 = false;
            var9_8 /* !! */  = null;
        }
        var10_9 = TextUtils.isEmpty((CharSequence)var9_8 /* !! */ );
        if (!var10_9) {
            var14_12 = "message";
            Intrinsics.checkNotNullParameter("Considering mediation ads", var14_12);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var9_8 /* !! */  = JioAds$LogLevel.NONE;
            var0.h(null, null, null, var3_3);
        } else lbl-1000:
        // 2 sources

        {
            var9_8 /* !! */  = new Ref$ObjectRef();
            var14_13 = var7_6;
            var9_8 /* !! */ .element = var7_6;
            if (var1_1 == null) {
                var14_13 = var0;
                var15_14 = new s((Ref$ObjectRef)var9_8 /* !! */ , var0, var2_2, var4_4, var3_3);
                var9_8 /* !! */  = "prm";
                var14_13 = var2_2;
                var0.m((String)var9_8 /* !! */ , var2_2, var4_4, var3_3, var15_14);
            } else {
                var9_8 /* !! */  = var1_1;
                var0.i(var1_1, var7_6, var4_4, var3_3, var2_2);
            }
        }
    }

    public final int a(HashMap object) {
        int n3;
        int n4 = 0;
        Object object2 = null;
        if (object == null) {
            object = this.p;
            if (object != null && (object = ((com.jio.jioads.common.a)object).c) != null) {
                object = ((e)object).a;
            } else {
                n3 = 0;
                object = null;
            }
        }
        Object object3 = "pgm";
        String string2 = "prm";
        Iterator iterator = "dd";
        Object object4 = "cpd";
        int n7 = 0;
        if (object != null) {
            int n8;
            int n10;
            object2 = ((HashMap)object).get(object4);
            String string3 = "<get-values>(...)";
            if (object2 != null) {
                int n14;
                object2 = ((HashMap)object).get(object4);
                Intrinsics.checkNotNull(object2);
                object2 = ((HashMap)object2).values();
                n4 = object2.size();
                object4 = ((HashMap)object).get(object4);
                Intrinsics.checkNotNull(object4);
                object4 = ((HashMap)object4).values();
                Intrinsics.checkNotNullExpressionValue(object4, string3);
                object4 = object4.iterator();
                n10 = 0;
                while ((n14 = object4.hasNext()) != 0) {
                    HashMap hashMap = ((f)object4.next()).d;
                    if (hashMap != null) {
                        n14 = hashMap.size();
                    } else {
                        n14 = 0;
                        hashMap = null;
                    }
                    n10 += n14;
                }
            } else {
                n4 = 0;
                object2 = null;
                n10 = 0;
            }
            if ((object4 = ((HashMap)object).get(iterator)) != null) {
                object4 = ((HashMap)object).get(iterator);
                Intrinsics.checkNotNull(object4);
                object4 = ((HashMap)object4).values();
                int n15 = object4.size();
                n4 += n15;
                iterator = ((HashMap)object).get(iterator);
                Intrinsics.checkNotNull(iterator);
                iterator = ((HashMap)((Object)iterator)).values();
                Intrinsics.checkNotNullExpressionValue(iterator, string3);
                iterator = iterator.iterator();
                while ((n15 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    object4 = ((f)iterator.next()).d;
                    if (object4 != null) {
                        n15 = ((HashMap)object4).size();
                    } else {
                        n15 = 0;
                        object4 = null;
                    }
                    n10 += n15;
                }
            }
            if ((object3 = ((HashMap)object).get(object3)) != null && (n8 = this.t) == 0) {
                ++n4;
                ++n10;
            }
            if ((object3 = ((HashMap)object).get(string2)) != null) {
                object3 = ((HashMap)object).get(string2);
                Intrinsics.checkNotNull(object3);
                object3 = ((HashMap)object3).values();
                n8 = object3.size() + n4;
                object = ((HashMap)object).get(string2);
                Intrinsics.checkNotNull(object);
                object = ((HashMap)object).values();
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object = object.iterator();
                while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object2 = ((f)object.next()).d;
                    if (object2 != null) {
                        n4 = ((HashMap)object2).size();
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    n10 += n4;
                }
                n4 = n8;
            }
            n7 = n10;
        } else {
            object = this.p;
            e e2 = object != null ? ((com.jio.jioads.common.a)object).b : null;
            if (e2 != null) {
                boolean bl2;
                if (object != null && (object = ((com.jio.jioads.common.a)object).b) != null && (object = ((e)object).a) != null) {
                    object = (HashMap)((HashMap)object).get(object4);
                } else {
                    n3 = 0;
                    object = null;
                }
                if (object != null) {
                    object = this.p;
                    if (object != null && (object = ((com.jio.jioads.common.a)object).b) != null && (object = ((e)object).a) != null) {
                        object = (HashMap)((HashMap)object).get(object4);
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    Intrinsics.checkNotNull(object);
                    object = ((HashMap)object).values();
                    n3 = object.size();
                } else {
                    n3 = 0;
                    object = null;
                }
                object4 = this.p;
                if (object4 != null && (object4 = ((com.jio.jioads.common.a)object4).b) != null && (object4 = ((e)object4).a) != null) {
                    object4 = (HashMap)((HashMap)object4).get(iterator);
                } else {
                    boolean bl3 = false;
                    object4 = null;
                }
                if (object4 != null) {
                    int n16;
                    object4 = this.p;
                    if (object4 != null && (object4 = ((com.jio.jioads.common.a)object4).b) != null && (object4 = ((e)object4).a) != null) {
                        iterator = (HashMap)((HashMap)object4).get(iterator);
                    } else {
                        n16 = 0;
                        iterator = null;
                    }
                    Intrinsics.checkNotNull(iterator);
                    iterator = ((HashMap)((Object)iterator)).values();
                    n16 = iterator.size();
                    n3 += n16;
                }
                if ((iterator = this.p) != null && (iterator = ((com.jio.jioads.common.a)((Object)iterator)).b) != null && (iterator = ((e)((Object)iterator)).a) != null) {
                    object3 = (HashMap)((HashMap)((Object)iterator)).get(object3);
                } else {
                    bl2 = false;
                    object3 = null;
                }
                if (object3 != null && !(bl2 = this.t)) {
                    ++n3;
                }
                if ((object3 = this.p) != null && (object3 = ((com.jio.jioads.common.a)object3).b) != null && (object3 = ((e)object3).a) != null) {
                    object3 = (HashMap)((HashMap)object3).get(string2);
                } else {
                    bl2 = false;
                    object3 = null;
                }
                if (object3 != null) {
                    object3 = this.p;
                    if (object3 != null && (object3 = ((com.jio.jioads.common.a)object3).b) != null && (object3 = ((e)object3).a) != null) {
                        object2 = (HashMap)((HashMap)object3).get(string2);
                    }
                    Intrinsics.checkNotNull(object2);
                    object2 = ((HashMap)object2).values();
                    n4 = object2.size() + n3;
                } else {
                    n4 = n3;
                }
            } else {
                n4 = 0;
                object2 = null;
            }
        }
        object = this.q;
        if (object != null) {
            object = ((j)object).a;
            ((t)object).k = n7;
        }
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final a b(ArrayList object, HashMap hashMap, String object2) {
        Object object7 = "message";
        Object object6 = null;
        try {
            int n4;
            Object object5 = new StringBuilder();
            Object object4 = this.o;
            if (object4 != null) {
                object4 = object4.P();
            } else {
                n4 = 0;
                object4 = null;
            }
            ((StringBuilder)object5).append((String)object4);
            object4 = ": Inside selectAdByEven";
            ((StringBuilder)object5).append((String)object4);
            object5 = ((StringBuilder)object5).toString();
            Intrinsics.checkNotNullParameter(object5, (String)object7);
            object5 = JioAds.Companion;
            object4 = ((JioAds$Companion)object5).getInstance();
            ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = JioAds$LogLevel.NONE;
            long l2 = this.h;
            long l3 = -1;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 > 0) {
                object7 = this.o;
                if (object7 == null) return object6;
                String string2 = object7.P();
                if (string2 == null) return object6;
                l4 = 0;
                object5 = this;
                object4 = object;
                HashMap hashMap2 = hashMap;
                object = this.c((ArrayList)object, hashMap, string2, (String)object2, false);
                return object;
            } else {
                object2 = new Random();
                n4 = ((ArrayList)object).size();
                int n3 = ((Random)object2).nextInt(n4);
                object4 = new StringBuilder();
                Object object3 = this.o;
                object3 = object3 != null ? object3.P() : null;
                ((StringBuilder)object4).append((String)object3);
                object3 = ": Available adIds: ";
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append(object);
                object3 = " and generated random number: ";
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append(n3);
                object4 = ((StringBuilder)object4).toString();
                Intrinsics.checkNotNullParameter(object4, (String)object7);
                object7 = ((JioAds$Companion)object5).getInstance();
                ((JioAds)object7).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = ((ArrayList)object).get(n3);
                object = (String)object;
                if (hashMap == null) return object6;
                object = hashMap.get(object);
                object = (a)object;
            }
            return object;
        }
        catch (Exception exception) {}
        return object6;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final a c(ArrayList arrayList, HashMap hashMap, String string2, String string3, boolean bl2) {
        void var8_17;
        CharSequence charSequence;
        long l2;
        int n3;
        String string4;
        Object object;
        void var8_19;
        String string5;
        String string6;
        block8: {
            Object object2;
            HashMap hashMap2 = hashMap;
            string6 = string2;
            String string7 = string2.concat(": Inside selectAdByDuration()");
            string5 = "message";
            Intrinsics.checkNotNullParameter(string7, string5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            if (hashMap == null) return var8_19;
            object = hashMap.keySet();
            string4 = "<get-keys>(...)";
            Intrinsics.checkNotNullExpressionValue(object, string4);
            object = object.iterator();
            Object object3 = null;
            n3 = 0;
            while (true) {
                block15: {
                    block13: {
                        block9: {
                            a a2;
                            block10: {
                                int n4;
                                block14: {
                                    long l3;
                                    long l4;
                                    long l7;
                                    long l8;
                                    long l12;
                                    long l14;
                                    block11: {
                                        block12: {
                                            Object object4;
                                            Object v4;
                                            boolean bl3 = object.hasNext();
                                            l2 = this.h;
                                            if (!bl3) break;
                                            object2 = (String)object.next();
                                            boolean bl4 = arrayList.contains(object2);
                                            if (!bl4 || (v4 = hashMap2.get(object2)) == null) break block9;
                                            a2 = (a)hashMap2.get(object2);
                                            if (a2 != null) {
                                                object4 = a2.e;
                                            } else {
                                                n4 = 0;
                                                object4 = null;
                                            }
                                            if (object4 == null) break block9;
                                            object4 = a2.e;
                                            Intrinsics.checkNotNull(object4);
                                            object4 = ((b)object4).d;
                                            if (object4 != null) {
                                                n4 = Integer.parseInt((String)object4);
                                            } else {
                                                n4 = 0;
                                                object4 = null;
                                            }
                                            if (n4 <= 0) break block10;
                                            object4 = a2.e;
                                            Intrinsics.checkNotNull(object4);
                                            object4 = ((b)object4).d;
                                            if (object4 != null) {
                                                n4 = Integer.parseInt((String)object4);
                                            } else {
                                                n4 = 0;
                                                object4 = null;
                                            }
                                            charSequence = new StringBuilder();
                                            ((StringBuilder)charSequence).append(string6);
                                            ((StringBuilder)charSequence).append(": checking for ad ");
                                            ((StringBuilder)charSequence).append((String)object2);
                                            ((StringBuilder)charSequence).append(" - ");
                                            ((StringBuilder)charSequence).append(n4);
                                            ir3_0.b((StringBuilder)charSequence, " secs", string5);
                                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                            JioAds$LogLevel jioAds$LogLevel2 = JioAds$LogLevel.NONE;
                                            object2 = object3;
                                            l14 = n4;
                                            Object object5 = l2 == l14 ? 0 : (l2 < l14 ? -1 : 1);
                                            if (object5 == false) {
                                                charSequence = string5;
                                                a a3 = a2;
                                                n3 = n4;
                                                break block8;
                                            }
                                            l12 = 0L;
                                            if (bl2) break block11;
                                            long l15 = (l14 = l2 - l14) - l12;
                                            object5 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                                            if (object5 <= 0) break block12;
                                            charSequence = string5;
                                            l8 = n3;
                                            long l16 = l14 - (l2 -= l8);
                                            Object object6 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                                            if (object6 > 0) break block13;
                                            break block14;
                                        }
                                        charSequence = string5;
                                        break block13;
                                    }
                                    charSequence = string5;
                                    if (n3 != 0 && ((l7 = (l4 = (l8 = l2 - l14) - l12) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0 || (l7 = (l3 = l8 - (l2 -= (l14 = (long)n3))) == 0L ? 0 : (l3 < 0L ? -1 : 1)) <= 0)) break block13;
                                }
                                object3 = a2;
                                n3 = n4;
                                break block15;
                            }
                            charSequence = string5;
                            n3 = -1;
                            object3 = a2;
                            continue;
                        }
                        charSequence = string5;
                        object2 = object3;
                    }
                    object3 = object2;
                }
                string5 = charSequence;
            }
            charSequence = string5;
            object2 = object3;
            String string8 = object3;
        }
        if (var8_17 == null) return var8_19;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string6);
        stringBuilder.append(": searching for duration: ");
        stringBuilder.append(l2);
        stringBuilder.append(", ad ");
        string6 = var8_17.a;
        string5 = " selected from campaign :";
        object = " (duration ";
        string4 = string3;
        X50.a(stringBuilder, string6, string5, string3, (String)object);
        stringBuilder.append(n3);
        stringBuilder.append(" secs)");
        String string9 = stringBuilder.toString();
        string6 = charSequence;
        Intrinsics.checkNotNullParameter(string9, (String)charSequence);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return var8_19;
    }

    public final String d() {
        return (String)this.A.getValue();
    }

    public final void e(int n3, String objectArray, String object, String string2, String string3) {
        int n4;
        int n7 = 4;
        int n8 = 3;
        int n10 = 2;
        int n14 = 1;
        Cloneable cloneable = this.m;
        if (cloneable != null && (n4 = ((HashMap)cloneable).containsKey(objectArray)) == n14) {
            cloneable = this.m;
            Intrinsics.checkNotNull(cloneable);
            objectArray = ((HashMap)cloneable).get(objectArray);
            Intrinsics.checkNotNull(objectArray);
            objectArray = objectArray;
            objectArray[0] = object;
            objectArray[n14] = string2;
            object = objectArray[n10];
            String string4 = "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }";
            Intrinsics.checkNotNull(object, string4);
            object = (ArrayList)object;
            ((ArrayList)object).add(string2);
            objectArray[n8] = string3;
            Integer n15 = n3;
            objectArray[n7] = n15;
        } else {
            cloneable = new ArrayList();
            ((ArrayList)cloneable).add(string2);
            Serializable serializable = Integer.valueOf(n3);
            int n16 = 5;
            Object[] objectArray2 = new Object[n16];
            objectArray2[0] = object;
            objectArray2[n14] = string2;
            objectArray2[n10] = cloneable;
            objectArray2[n8] = string3;
            objectArray2[n7] = serializable;
            serializable = this.m;
            if (serializable != null) {
                Intrinsics.checkNotNull(serializable);
                serializable.put(objectArray, objectArray2);
            }
        }
    }

    public final void f(Context context, String string2, String string3, String string4, boolean bl2, long l2) {
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl3) {
            String string5 = "";
            String string6 = "skexpiry";
            String string7 = "ads";
            String string8 = "cmps";
            if (bl2) {
                context = j_0.o(context, "multiad_pref");
                String string9 = this.k;
                bl3 = TextUtils.isEmpty((CharSequence)(string9 = context.getString(string9, string5)));
                if (!bl3) {
                    boolean bl4;
                    Intrinsics.checkNotNull(string9);
                    string5 = new JSONObject(string9);
                    if (string4 != null && (bl2 = string5.has(string8)) && (bl4 = (string9 = string5.getJSONObject(string8)).has(string3))) {
                        string3 = string9.getJSONObject(string3);
                        bl2 = TextUtils.isEmpty((CharSequence)string4);
                        if (!bl2) {
                            bl2 = string3.has(string7);
                            if (bl2 && (bl2 = (string3 = string3.getJSONObject(string7)).has(string4))) {
                                string3 = string3.getJSONObject(string4);
                                string3.put(string6, l2);
                            }
                        } else {
                            string3.put(string6, l2);
                        }
                    }
                    if ((context = context.edit()) != null && (context = context.putString(string2, string3 = string5.toString())) != null) {
                        context.apply();
                    }
                }
            } else {
                context = j_0.o(context, "master_config_pref");
                String string10 = "master_config_";
                CharSequence charSequence = new StringBuilder(string10);
                String string11 = this.e;
                charSequence.append(string11);
                charSequence = charSequence.toString();
                charSequence = context.getString((String)charSequence, string5);
                bl3 = TextUtils.isEmpty((CharSequence)charSequence);
                if (!bl3) {
                    Intrinsics.checkNotNull(charSequence);
                    string5 = new JSONObject((String)charSequence);
                    charSequence = "asi";
                    boolean bl5 = string5.has((String)charSequence);
                    if (bl5 && (bl5 = (charSequence = string5.getJSONObject((String)charSequence)).has(string2))) {
                        Intrinsics.checkNotNull(string2);
                        string2 = charSequence.getJSONObject(string2);
                        charSequence = "bkp";
                        bl5 = string2.has((String)charSequence);
                        if (bl5) {
                            boolean bl6;
                            JSONObject jSONObject = string2.getJSONObject((String)charSequence);
                            Intrinsics.checkNotNull(jSONObject);
                            if (string4 != null && (bl6 = jSONObject.has(string8)) && (bl6 = (string8 = jSONObject.getJSONObject(string8)).has(string3))) {
                                string3 = string8.getJSONObject(string3);
                                boolean bl7 = TextUtils.isEmpty((CharSequence)string4);
                                if (!bl7) {
                                    boolean bl8;
                                    bl7 = string3.has(string7);
                                    if (bl7 && (bl8 = (string3 = string3.getJSONObject(string7)).has(string4))) {
                                        string3 = string3.getJSONObject(string4);
                                        string3.put(string6, l2);
                                    }
                                } else {
                                    string3.put(string6, l2);
                                }
                            }
                            string2.put((String)charSequence, (Object)jSONObject);
                            context = context.edit();
                            if (context != null && (context = context.putString(string2 = kp1_0.c(string10, string11), string3 = string5.toString())) != null) {
                                context.apply();
                            }
                        }
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void g(Context var1_1, String var2_2, String var3_3, boolean var4_4, boolean var5_5, String var6_6) {
        block24: {
            block26: {
                block27: {
                    block25: {
                        block23: {
                            var7_7 = "message";
                            if (!var5_5) {
                                var8_8 /* !! */  = new StringBuilder();
                                var8_8 /* !! */ .append((String)var2_2);
                                var9_9 = ": deleting campaign: ";
                                var8_8 /* !! */ .append(var9_9);
                                var8_8 /* !! */ .append(var3_3);
                                Intrinsics.checkNotNullParameter(var8_8 /* !! */ .toString(), var7_7);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var8_8 /* !! */  = JioAds$LogLevel.NONE;
                            }
                            var8_8 /* !! */  = "";
                            var9_9 = "cmps";
                            var10_10 = "asi";
                            var11_11 = "pgm";
                            var12_12 = null;
                            var13_13 = "prm";
                            var14_14 = "dd";
                            if (var4_4 == 0) break block23;
                            var4_4 = Intrinsics.areEqual(var6_6, var11_11);
                            if (var4_4 != 0) {
                                var15_15 = new StringBuilder();
                                var15_15.append((String)var2_2);
                                var16_17 = ": deleting PGM from main model campaign: ";
                                var15_15.append(var16_17);
                                var15_15.append(var6_6);
                                Intrinsics.checkNotNullParameter(var15_15.toString(), var7_7);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var15_15 = JioAds$LogLevel.NONE;
                                var15_15 = this.p;
                                if (var15_15 != null && (var15_15 = var15_15.c) != null && (var15_15 = var15_15.a) != null) {
                                    var15_15 = (HashMap)var15_15.remove(var6_6);
                                }
                                if ((var15_15 = this.o) != null) {
                                    var17_20 = false;
                                    var6_6 = null;
                                    var15_15.a(false);
                                }
                            } else if (var3_3 != null && (var4_4 = var3_3.length()) != 0 && (var4_4 = var6_6.length()) != 0) {
                                var15_15 = new StringBuilder();
                                var15_15.append((String)var2_2);
                                var16_18 = ": deleting from main model campaign: ";
                                var15_15.append(var16_18);
                                var15_15.append(var3_3);
                                Intrinsics.checkNotNullParameter(var15_15.toString(), var7_7);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var15_15 = JioAds$LogLevel.NONE;
                                var15_15 = this.p;
                                if (var15_15 != null && (var15_15 = var15_15.c) != null && (var15_15 = var15_15.a) != null && (var15_15 = (HashMap)var15_15.get(var6_6)) != null) {
                                    var15_15 = (f)var15_15.remove(var3_3);
                                }
                            }
                            if ((var18_21 = TextUtils.isEmpty((CharSequence)(var6_6 = (var1_1 = j_0.o(var1_1, "multiad_pref")).getString((String)(var15_15 = this.k), (String)var8_8 /* !! */ )))) || !(var17_20 = (var8_8 /* !! */  = new JSONObject(var6_6)).has(var10_10)) || !(var17_20 = (var6_6 = var8_8 /* !! */ .getJSONObject(var10_10)).has((String)var2_2)) || !(var17_20 = (var2_2 = (var6_6 = var8_8 /* !! */ .getJSONObject(var10_10)).getJSONObject((String)var2_2)).has(var9_9))) break block24;
                            var2_2 = var2_2.getJSONObject(var9_9);
                            var17_20 = TextUtils.isEmpty((CharSequence)var3_3);
                            if (!var17_20 && (var17_20 = var2_2.has(var14_14)) && (var17_20 = (var6_6 = var2_2.getJSONObject(var14_14)).has(var3_3))) {
                                var2_2 = var2_2.getJSONObject(var14_14);
                            } else {
                                var17_20 = TextUtils.isEmpty((CharSequence)var3_3);
                                if (!var17_20 && (var17_20 = var2_2.has(var13_13)) && (var17_20 = (var6_6 = var2_2.getJSONObject(var13_13)).has(var3_3))) {
                                    var2_2 = var2_2.getJSONObject(var13_13);
                                } else {
                                    var17_20 = var2_2.has(var11_11);
                                    if (var17_20 && var5_5) {
                                        Intrinsics.checkNotNullParameter("Deleting PGM node from PROD ad as DC instruction came", var7_7);
                                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        var2_2.remove(var11_11);
                                    }
                                    var19_23 = 0;
                                    var2_2 = null;
                                }
                            }
                            var5_5 = TextUtils.isEmpty((CharSequence)var3_3);
                            if (!var5_5 && var2_2 != null && (var5_5 = var2_2.has(var3_3))) {
                                var2_2.remove(var3_3);
                            }
                            if ((var19_23 = this.a(null)) != 0) ** GOTO lbl-1000
                            var2_2 = this.p;
                            if (var2_2 != null && (var2_2 = var2_2.c) != null && (var2_2 = var2_2.b) != null) {
                                var2_2 = var2_2.a;
                            } else {
                                var19_23 = 0;
                                var2_2 = null;
                            }
                            if (var2_2 == null || (var19_23 = var2_2.length()) == 0) {
                                var2_2 = this.p;
                                if (var2_2 != null) {
                                    var2_2.c = null;
                                }
                                var1_1 = var1_1.edit().remove((String)var15_15);
                                var1_1.apply();
                            } else lbl-1000:
                            // 2 sources

                            {
                                var1_1 = var1_1.edit();
                                var2_2 = var8_8 /* !! */ .toString();
                                var1_1 = var1_1.putString((String)var15_15, (String)var2_2);
                                var1_1.apply();
                            }
                            break block24;
                        }
                        var1_1 = j_0.o(var1_1, "master_config_pref");
                        var6_6 = "master_config_";
                        var15_16 /* !! */  = new StringBuilder(var6_6);
                        var16_19 = this.e;
                        var15_16 /* !! */ .append(var16_19);
                        var15_16 /* !! */  = var15_16 /* !! */ .toString();
                        var15_16 /* !! */  = var1_1.getString((String)var15_16 /* !! */ , (String)var8_8 /* !! */ );
                        if (var15_16 /* !! */  == null || (var18_22 = var15_16 /* !! */ .length()) == 0 || (var4_4 = (var8_8 /* !! */  = new JSONObject((String)var15_16 /* !! */ )).has(var10_10)) == 0 || (var15_16 /* !! */  = var8_8 /* !! */ .optJSONObject(var10_10)) == null || !(var20_24 = var15_16 /* !! */ .has((String)var2_2)) || !(var20_24 = (var2_2 = var15_16 /* !! */ .getJSONObject((String)var2_2)).has((String)(var15_16 /* !! */  = "bkp"))) || (var4_4 = (var2_2 = var2_2.getJSONObject((String)var15_16 /* !! */ )).has(var9_9)) == 0) break block24;
                        var4_4 = (var2_2 = var2_2.getJSONObject(var9_9)).has(var14_14);
                        if (var4_4 == 0 || (var4_4 = (var15_16 /* !! */  = var2_2.getJSONObject(var14_14)).has(var3_3)) == 0) break block25;
                        var12_12 = var2_2.getJSONObject(var14_14);
                        var13_13 = var14_14;
                        break block26;
                    }
                    var4_4 = var2_2.has(var11_11);
                    if (var4_4 == 0 || !var5_5) break block27;
                    Intrinsics.checkNotNullParameter("Deleting PGM node from backup ad as DC instruction came", var7_7);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var15_16 /* !! */  = JioAds$LogLevel.NONE;
                    var2_2.remove(var11_11);
                    ** GOTO lbl-1000
                }
                var4_4 = var2_2.has(var13_13);
                if (var4_4 != 0 && (var4_4 = (var15_16 /* !! */  = var2_2.getJSONObject(var13_13)).has(var3_3)) != 0) {
                    var12_12 = var2_2.getJSONObject(var13_13);
                } else lbl-1000:
                // 2 sources

                {
                    var13_13 = null;
                }
            }
            if (var12_12 != null && (var4_4 = var12_12.has(var3_3)) != 0) {
                var12_12.remove(var3_3);
            }
            if (var12_12 != null && (var21_25 = var12_12.length()) < (var4_4 = 1)) {
                var2_2.remove(var13_13);
            }
            if ((var1_1 = var1_1.edit()) != null && (var1_1 = var1_1.putString((String)(var2_2 = kp1_0.c(var6_6, var16_19)), var3_3 = var8_8 /* !! */ .toString())) != null) {
                var1_1.apply();
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void h(a var1_1, f var2_2, String var3_3, ArrayList var4_4) {
        block49: {
            block50: {
                block54: {
                    block55: {
                        block53: {
                            block52: {
                                block51: {
                                    var5_5 = this;
                                    var6_6 /* !! */  = "message";
                                    var7_7 = null;
                                    var8_8 = this.d;
                                    if (!var8_8 || (var9_9 = this.o) == null) break block49;
                                    var10_11 /* !! */  = var9_9.Y();
                                    if (var10_11 /* !! */  == null || (var10_11 /* !! */  = (var10_11 /* !! */  = this.o) != null ? var10_11 /* !! */ .k0() : null) == (var11_12 /* !! */  = JioAdView$AdState.DESTROYED)) break block50;
                                    var10_11 /* !! */  = var9_9.Y();
                                    Intrinsics.checkNotNull(var10_11 /* !! */ );
                                    var11_12 /* !! */  = this.d();
                                    var9_9 = "null cannot be cast to non-null type kotlin.String";
                                    var12_13 = "";
                                    var13_14 = "multiad_pref";
                                    var14_15 = var5_5.k;
                                    var15_16 = 0;
                                    var16_17 = null;
                                    if (!var8_8) break block51;
                                    var17_18 = var5_5.p;
                                    if (var17_18 != null) {
                                        var17_18 = var17_18.c;
                                    } else {
                                        var18_19 = 0;
                                        var17_18 = null;
                                    }
                                    if (var17_18 != null) break block52;
                                    var17_18 = new StringBuilder();
                                    var17_18.append((String)var11_12 /* !! */ );
                                    var17_18.append(" : fetching multiad response from SP");
                                    Intrinsics.checkNotNullParameter(var17_18.toString(), var6_6 /* !! */ );
                                    var17_18 = JioAds.Companion;
                                    var17_18.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    var19_20 = JioAds$LogLevel.NONE;
                                    var12_13 = j_0.d(var10_11 /* !! */ , (String)var13_14, 0, var12_13, var14_15);
                                    Intrinsics.checkNotNull(var12_13, (String)var9_9);
                                    var12_13 = (String)var12_13;
                                    var20_21 = TextUtils.isEmpty((CharSequence)var12_13);
                                    if (var20_21) ** GOTO lbl-1000
                                    var9_9 = new StringBuilder();
                                    var9_9.append((String)var11_12 /* !! */ );
                                    var19_20 = " : parsing multiad response";
                                    var9_9.append((String)var19_20);
                                    Intrinsics.checkNotNullParameter(var9_9.toString(), var6_6 /* !! */ );
                                    var9_9 = var17_18.getInstance();
                                    var9_9.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    var17_18 = com.jio.jioads.multiad.v.c((String)var12_13, (String)var11_12 /* !! */ );
                                    break block52;
                                }
                                var17_18 = var5_5.p;
                                if (var17_18 != null) {
                                    var17_18 = var17_18.b;
                                } else {
                                    var18_19 = 0;
                                    var17_18 = null;
                                }
                                if (var17_18 == null) {
                                    block48: {
                                        var17_18 = new StringBuilder("master_config_");
                                        var19_20 = var5_5.e;
                                        var17_18.append((String)var19_20);
                                        var17_18 = var17_18.toString();
                                        var21_22 = "master_config_pref";
                                        var12_13 = j_0.d(var10_11 /* !! */ , var21_22, 0, var12_13, (String)var17_18);
                                        Intrinsics.checkNotNull(var12_13, (String)var9_9);
                                        var12_13 = (String)var12_13;
                                        var20_21 = TextUtils.isEmpty((CharSequence)var12_13);
                                        if (!var20_21) {
                                            var9_9 = new Object();
                                            try {
                                                var9_9 = var9_9.a((String)var12_13, (String)var19_20);
                                                break block48;
                                            }
                                            catch (JSONException var9_10) {
                                                var12_13 = Utility.INSTANCE;
                                                Intrinsics.checkNotNullParameter(var12_13.printStacktrace((Exception)var9_10), var6_6 /* !! */ );
                                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                var9_9 = JioAds$LogLevel.NONE;
                                            }
                                        }
                                        var20_21 = false;
                                        var9_9 = null;
                                    }
                                    ** if (var9_9 == null || (var9_9 = var9_9.a) == null) goto lbl-1000
lbl-1000:
                                    // 1 sources

                                    {
                                        var17_18 = var9_9 = var9_9.get((Object)var11_12 /* !! */ );
                                        var17_18 = (e)var9_9;
                                        ** GOTO lbl92
                                    }
                                }
                                break block52;
lbl-1000:
                                // 2 sources

                                {
                                    var18_19 = 0;
                                    var17_18 = null;
                                }
                            }
                            if (var17_18 != null) {
                                var9_9 = var17_18.a;
                            } else {
                                var20_21 = false;
                                var9_9 = null;
                            }
                            var22_23 = true;
                            if (var9_9 == null) ** GOTO lbl-1000
                            var9_9 = var17_18.a;
                            Intrinsics.checkNotNull(var9_9);
                            var20_21 = var9_9.isEmpty() ^ var22_23;
                            if (var20_21) {
                                var9_9 = new HashMap();
                                var17_18 = var17_18.a;
                                Intrinsics.checkNotNull(var17_18);
                                var9_9.putAll(var17_18);
                            } else lbl-1000:
                            // 2 sources

                            {
                                var20_21 = false;
                                var9_9 = null;
                            }
                            if (var9_9 == null || (var18_19 = var9_9.isEmpty()) != 0) break block53;
                            var17_18 = "cpd";
                            var23_24 = var9_9.containsKey(var17_18);
                            if (var23_24 == 0) ** GOTO lbl-1000
                            if ((var17_18 = (HashMap)var9_9.get(var17_18)) != null) {
                                var18_19 = var17_18.size();
                            } else {
                                var18_19 = 0;
                                var17_18 = null;
                            }
                            if (var18_19 > 0) {
                                var18_19 = 1;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var18_19 = 0;
                                var17_18 = null;
                            }
                            var19_20 = "dd";
                            var24_25 = var9_9.containsKey(var19_20);
                            if (var24_25) {
                                if ((var19_20 = (HashMap)var9_9.get(var19_20)) != null) {
                                    var23_24 = var19_20.size();
                                } else {
                                    var23_24 = 0;
                                    var19_20 = null;
                                }
                                if (var23_24 > 0) {
                                    var18_19 = 1;
                                }
                            }
                            if (var24_25 = var9_9.containsKey(var19_20 = "prm")) {
                                if ((var19_20 = (HashMap)var9_9.get(var19_20)) != null) {
                                    var15_16 = var19_20.size();
                                }
                                if (var15_16 > 0) {
                                    var18_19 = 1;
                                }
                            }
                            var15_16 = (var20_21 = var9_9.containsKey(var16_17 = "pgm")) != false && (var20_21 = var5_5.t) == false ? 1 : var18_19;
                            var20_21 = var5_5.s;
                            if (!var20_21) break block54;
                            var9_9 = var5_5.p;
                            if (var9_9 != null && (var9_9 = var9_9.c) != null && (var9_9 = var9_9.b) != null) {
                                var9_9 = var9_9.a;
                            } else {
                                var20_21 = false;
                                var9_9 = null;
                            }
                            var20_21 = TextUtils.isEmpty((CharSequence)var9_9);
                            if (var20_21) break block54;
                            break block55;
                        }
                        var20_21 = var5_5.s;
                        if (!var20_21) break block54;
                        var9_9 = var5_5.p;
                        if (var9_9 != null && (var9_9 = var9_9.c) != null && (var9_9 = var9_9.b) != null) {
                            var9_9 = var9_9.a;
                        } else {
                            var20_21 = false;
                            var9_9 = null;
                        }
                        var20_21 = TextUtils.isEmpty((CharSequence)var9_9);
                        if (var20_21) break block54;
                    }
                    var15_16 = 1;
                }
                if (var15_16 == 0) {
                    var9_9 = new StringBuilder();
                    var9_9.append((String)var11_12 /* !! */ );
                    var11_12 /* !! */  = ": deleting adspotdata for prod";
                    var9_9.append((String)var11_12 /* !! */ );
                    Intrinsics.checkNotNullParameter(var9_9.toString(), var6_6 /* !! */ );
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var9_9 = JioAds$LogLevel.NONE;
                    j_0.f(var10_11 /* !! */ , (String)var13_14, var14_15);
                }
                break block49;
            }
            Intrinsics.checkNotNullParameter("JioAdView AdState is Destroyed so returning from deliverAdToController()", var6_6 /* !! */ );
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var9_9 = JioAds$LogLevel.NONE;
            return;
        }
        if (!(var8_8 || (var20_21 = var5_5.f) || (var8_8 = TextUtils.isEmpty((CharSequence)(var9_9 = var5_5.j))))) {
            var25_26 = "Backup ad so adding MED header into backup responseHeader";
            Intrinsics.checkNotNullParameter(var25_26, var6_6 /* !! */ );
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var6_6 /* !! */  = JioAds$LogLevel.NONE;
            var6_6 /* !! */  = var5_5.p;
            if (var6_6 /* !! */  != null && (var6_6 /* !! */  = var6_6 /* !! */ .b) != null) {
                var6_6 /* !! */  = var6_6 /* !! */ .b;
            } else {
                var26_27 = false;
                var6_6 /* !! */  = null;
            }
            if (var6_6 /* !! */  != null) {
                var6_6 /* !! */ .a = var9_9;
            }
        }
        if ((var9_9 = var5_5.o) != null) {
            var9_9 = var9_9.z();
        } else {
            var20_21 = false;
            var9_9 = null;
        }
        if (var9_9 != null) {
            var9_9.A = var26_27 = var5_5.s;
        }
        var5_5.D.clear();
        var9_9 = var5_5.o;
        if (var9_9 != null) {
            var7_7 = var9_9.k0();
        }
        if (var7_7 != (var9_9 = JioAdView$AdState.DESTROYED) && (var25_26 = var5_5.n) != null) {
            var27_28 = var5_5.s;
            var10_11 /* !! */  = var1_1;
            var11_12 /* !! */  = var2_2;
            var12_13 = var3_3;
            var13_14 = var4_4;
            var25_26.a(var1_1, var2_2, var3_3, var4_4, var27_28);
        }
        if ((var9_9 = var5_5.r) != null) {
            var9_9.a();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void i(f var1_1, String var2_2, ArrayList var3_3, ArrayList var4_4, HashMap var5_5) {
        block172: {
            block165: {
                block171: {
                    block166: {
                        block160: {
                            block170: {
                                block167: {
                                    block149: {
                                        block150: {
                                            block164: {
                                                block162: {
                                                    block169: {
                                                        block161: {
                                                            block168: {
                                                                block158: {
                                                                    block157: {
                                                                        block159: {
                                                                            block156: {
                                                                                block155: {
                                                                                    block154: {
                                                                                        block153: {
                                                                                            block152: {
                                                                                                block151: {
                                                                                                    var6_6 = this;
                                                                                                    var7_7 = var1_1;
                                                                                                    var8_8 = var3_3;
                                                                                                    var9_9 /* !! */  = var4_4;
                                                                                                    var10_10 = var5_5;
                                                                                                    var11_11 = 2;
                                                                                                    var12_12 /* !! */  = "message";
                                                                                                    if (var1_1 == null) break block165;
                                                                                                    var13_13 /* !! */  = new StringBuilder();
                                                                                                    var14_16 /* !! */  = this.o;
                                                                                                    if (var14_16 /* !! */  != null) {
                                                                                                        var14_16 /* !! */  = var14_16 /* !! */ .P();
                                                                                                    } else {
                                                                                                        var15_17 = false;
                                                                                                        var14_16 /* !! */  = null;
                                                                                                    }
                                                                                                    var13_13 /* !! */ .append((String)var14_16 /* !! */ );
                                                                                                    var13_13 /* !! */ .append(": Selected campaign Id: ");
                                                                                                    var14_16 /* !! */  = var7_7.a;
                                                                                                    var13_13 /* !! */ .append((String)var14_16 /* !! */ );
                                                                                                    var13_13 /* !! */ .append(" from ");
                                                                                                    var14_16 /* !! */  = var2_2;
                                                                                                    var13_13 /* !! */ .append(var2_2);
                                                                                                    com.jio.jioads.util.j.a(var13_13 /* !! */ .toString());
                                                                                                    var16_18 = var7_7.e;
                                                                                                    var13_13 /* !! */  = Calendar.getInstance();
                                                                                                    var18_19 = var13_13 /* !! */ .getTimeInMillis();
                                                                                                    var11_11 = (int)(var16_18 == var18_19 ? 0 : (var16_18 < var18_19 ? -1 : 1));
                                                                                                    if (var11_11 > 0) {
                                                                                                        var13_13 /* !! */  = new StringBuilder();
                                                                                                        var20_20 = var6_6.o;
                                                                                                        var20_20 = var20_20 != null ? var20_20.P() : null;
                                                                                                        var13_13 /* !! */ .append((String)var20_20);
                                                                                                        var13_13 /* !! */ .append(": skip expiry for campaign ");
                                                                                                        var20_20 = var7_7.a;
                                                                                                        var13_13 /* !! */ .append((String)var20_20);
                                                                                                        var20_20 = ": ";
                                                                                                        var13_13 /* !! */ .append((String)var20_20);
                                                                                                        var13_13 /* !! */ .append(var16_18);
                                                                                                        var21_21 /* !! */  = " not yet elapsed";
                                                                                                        var13_13 /* !! */ .append((String)var21_21 /* !! */ );
                                                                                                        com.jio.jioads.util.j.a(var13_13 /* !! */ .toString());
                                                                                                        var11_11 = 0;
                                                                                                        var13_13 /* !! */  = null;
                                                                                                    } else {
                                                                                                        var11_11 = 1;
                                                                                                    }
                                                                                                    var21_21 /* !! */  = var6_6.o;
                                                                                                    if (var21_21 /* !! */  != null) {
                                                                                                        var21_21 /* !! */  = var21_21 /* !! */ .k0();
                                                                                                    } else {
                                                                                                        var22_22 = false;
                                                                                                        var21_21 /* !! */  = null;
                                                                                                    }
                                                                                                    var23_23 = JioAdView$AdState.DESTROYED;
                                                                                                    if (var21_21 /* !! */  == var23_23 || var11_11 == 0 || (var21_21 /* !! */  = var7_7.b) == null) break block166;
                                                                                                    Intrinsics.checkNotNull(var21_21 /* !! */ );
                                                                                                    var21_21 /* !! */  = var21_21 /* !! */ .a;
                                                                                                    if (var21_21 /* !! */  == null) break block166;
                                                                                                    var21_21 /* !! */  = var7_7.b;
                                                                                                    Intrinsics.checkNotNull(var21_21 /* !! */ );
                                                                                                    var21_21 /* !! */  = var21_21 /* !! */ .a;
                                                                                                    var22_22 = TextUtils.isEmpty((CharSequence)var21_21 /* !! */ );
                                                                                                    if (var22_22) break block166;
                                                                                                    var13_13 /* !! */  = var6_6.B;
                                                                                                    if (var13_13 /* !! */  == null) {
                                                                                                        return;
                                                                                                    }
                                                                                                    var23_23 = var7_7.b;
                                                                                                    Intrinsics.checkNotNull(var23_23);
                                                                                                    var23_23 = var23_23.a;
                                                                                                    Intrinsics.checkNotNull(var23_23);
                                                                                                    var21_21 /* !! */  = new JSONObject((String)var23_23);
                                                                                                    var23_23 = new StringBuilder();
                                                                                                    var20_20 = var6_6.o;
                                                                                                    var20_20 = var20_20 != null ? var20_20.P() : null;
                                                                                                    var23_23.append((String)var20_20);
                                                                                                    var20_20 = ": checking for FCAP rules";
                                                                                                    var23_23.append((String)var20_20);
                                                                                                    com.jio.jioads.util.j.a(var23_23.toString());
                                                                                                    var23_23 = var6_6.o;
                                                                                                    var23_23 = var23_23 != null ? var23_23.P() : null;
                                                                                                    var20_20 = var7_7.a;
                                                                                                    Intrinsics.checkNotNull(var20_20);
                                                                                                    var24_24 = "lmt";
                                                                                                    var25_25 = "cv";
                                                                                                    var26_26 = "c";
                                                                                                    var27_28 /* !! */  = "i";
                                                                                                    Intrinsics.checkNotNullParameter(var20_20, "campaignId");
                                                                                                    Intrinsics.checkNotNullParameter(var21_21 /* !! */ , "fcapRuleHeader");
                                                                                                    var28_30 = new StringBuilder();
                                                                                                    var28_30.append((String)var23_23);
                                                                                                    var28_30.append(": inside isCampaignUsable");
                                                                                                    Intrinsics.checkNotNullParameter(var28_30.toString(), (String)var12_12 /* !! */ );
                                                                                                    var28_30 = JioAds.Companion;
                                                                                                    var28_30.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                    var14_16 /* !! */  = JioAds$LogLevel.NONE;
                                                                                                    var13_13 /* !! */  = j_0.o((Context)var13_13 /* !! */ , "common_prefs");
                                                                                                    var29_32 = false;
                                                                                                    var9_9 /* !! */  = null;
                                                                                                    var13_13 /* !! */  = var13_13 /* !! */ .getString("fcap", null);
                                                                                                    var10_10 = Calendar.getInstance();
                                                                                                    var30_34 = var10_10.getTimeInMillis();
                                                                                                    if (var13_13 /* !! */  == null) break block167;
                                                                                                    var10_10 = new JSONObject((String)var13_13 /* !! */ );
                                                                                                    I.e((JSONObject)var10_10);
                                                                                                    var11_11 = var10_10.has((String)var20_20);
                                                                                                    if (var11_11 == 0) break block149;
                                                                                                    var13_13 /* !! */  = var10_10.getJSONObject((String)var20_20);
                                                                                                    var10_10 = new StringBuilder();
                                                                                                    var10_10.append((String)var23_23);
                                                                                                    var9_9 /* !! */  = ": local counter map for campaign id: ";
                                                                                                    var10_10.append((String)var9_9 /* !! */ );
                                                                                                    var10_10.append((String)var20_20);
                                                                                                    var9_9 /* !! */  = " is: ";
                                                                                                    var10_10.append((String)var9_9 /* !! */ );
                                                                                                    var10_10.append(var13_13 /* !! */ );
                                                                                                    var10_10 = var10_10.toString();
                                                                                                    Intrinsics.checkNotNullParameter(var10_10, (String)var12_12 /* !! */ );
                                                                                                    var10_10 = var28_30.getInstance();
                                                                                                    var10_10.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                    var10_10 = new StringBuilder();
                                                                                                    var10_10.append((String)var23_23);
                                                                                                    var9_9 /* !! */  = ": fcap header: ";
                                                                                                    var10_10.append((String)var9_9 /* !! */ );
                                                                                                    var10_10.append(var21_21 /* !! */ );
                                                                                                    var10_10 = var10_10.toString();
                                                                                                    Intrinsics.checkNotNullParameter(var10_10, (String)var12_12 /* !! */ );
                                                                                                    var10_10 = var28_30.getInstance();
                                                                                                    var10_10.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                    var32_35 = (char)var21_21 /* !! */ .has(var24_24);
                                                                                                    if (var32_35 == '\u0000') break block150;
                                                                                                    var10_10 = var21_21 /* !! */ .getJSONObject(var24_24);
                                                                                                    var29_32 = var10_10.has(var27_28 /* !! */ );
                                                                                                    if (!var29_32) break block151;
                                                                                                    var9_9 /* !! */  = var10_10.getJSONObject(var27_28 /* !! */ );
                                                                                                    break block152;
                                                                                                }
                                                                                                var29_32 = false;
                                                                                                var9_9 /* !! */  = null;
                                                                                            }
                                                                                            var33_36 = var10_10.has((String)var26_26);
                                                                                            if (var33_36 == 0) break block153;
                                                                                            var28_30 = var10_10.getJSONObject((String)var26_26);
                                                                                            break block154;
                                                                                        }
                                                                                        var33_36 = 0;
                                                                                        var28_30 = null;
                                                                                    }
                                                                                    var15_17 = var10_10.has(var25_25);
                                                                                    if (!var15_17) break block155;
                                                                                    var10_10 = var10_10.getJSONObject(var25_25);
                                                                                    break block156;
                                                                                }
                                                                                var32_35 = '\u0000';
                                                                                var10_10 = null;
                                                                            }
                                                                            var14_16 /* !! */  = "expiry";
                                                                            var20_20 = "getString(...)";
                                                                            var24_24 = "keys(...)";
                                                                            if (var9_9 /* !! */  == null) break block157;
                                                                            var34_38 = var13_13 /* !! */ .has(var27_28 /* !! */ );
                                                                            if (!var34_38) break block157;
                                                                            var35_39 /* !! */  = var21_21 /* !! */ ;
                                                                            var21_21 /* !! */  = var9_9 /* !! */ .keys();
                                                                            Intrinsics.checkNotNullExpressionValue(var21_21 /* !! */ , var24_24);
                                                                            var27_28 /* !! */  = var13_13 /* !! */ .getJSONObject(var27_28 /* !! */ );
                                                                            block103: while (true) {
                                                                                var36_40 = var21_21 /* !! */ .hasNext();
                                                                                if (!var36_40) break block158;
                                                                                var37_41 /* !! */  = var21_21 /* !! */ .next();
                                                                                var38_42 = var21_21 /* !! */ ;
                                                                                var21_21 /* !! */  = var37_41 /* !! */ ;
                                                                                var21_21 /* !! */  = (String)var37_41 /* !! */ ;
                                                                                var36_40 = var27_28 /* !! */ .has((String)var21_21 /* !! */ );
                                                                                if (!var36_40) break block159;
                                                                                var8_8 = var27_28 /* !! */ .getJSONObject((String)var21_21 /* !! */ );
                                                                                var37_41 /* !! */  = var27_28 /* !! */ ;
                                                                                var27_28 /* !! */  = var9_9 /* !! */ .getString((String)var21_21 /* !! */ );
                                                                                Intrinsics.checkNotNullExpressionValue(var27_28 /* !! */ , (String)var20_20);
                                                                                var39_43 = Long.parseLong(var27_28 /* !! */ );
                                                                                var41_44 = var8_8.getLong((String)var14_16 /* !! */ );
                                                                                var43_45 = var8_8.getLong((String)var21_21 /* !! */ );
                                                                                var45_46 = var41_44 == var30_34 ? 0 : (var41_44 < var30_34 ? -1 : 1);
                                                                                if (var45_46 >= 0 || (var45_46 = (int)((cfr_temp_0 = var41_44 - (var46_47 = (long)-1)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) == 0) break;
lbl246:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    var8_8 = var3_3;
                                                                                    var27_28 /* !! */  = var37_41 /* !! */ ;
lbl249:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var21_21 /* !! */  = var38_42;
                                                                                        continue block103;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
                                                                            ** while ((var45_46 = (int)(var43_45 == var39_43 ? 0 : (var43_45 < var39_43 ? -1 : 1))) < 0)
lbl253:
                                                                            // 1 sources

                                                                            var48_48 = 0;
                                                                            var49_49 = 0.0f;
                                                                            var27_28 /* !! */  = null;
                                                                            break block168;
                                                                        }
                                                                        var8_8 = var3_3;
                                                                        ** while (true)
                                                                    }
                                                                    var35_39 /* !! */  = var21_21 /* !! */ ;
                                                                }
                                                                var48_48 = 1;
                                                                var49_49 = 1.4E-45f;
                                                            }
                                                            if (var48_48 == 0) {
                                                                var13_13 /* !! */  = new StringBuilder();
                                                                var13_13 /* !! */ .append((String)var23_23);
                                                                var26_26 = ": FCAP i limit reached";
                                                                var13_13 /* !! */ .append((String)var26_26);
                                                                var13_13 /* !! */  = var13_13 /* !! */ .toString();
                                                                Intrinsics.checkNotNullParameter(var13_13 /* !! */ , (String)var12_12 /* !! */ );
                                                                var13_13 /* !! */  = JioAds.Companion;
                                                                var13_13 /* !! */  = var13_13 /* !! */ .getInstance();
                                                                var13_13 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                var13_13 /* !! */  = JioAds$LogLevel.NONE;
lbl286:
                                                                // 3 sources

                                                                while (true) {
                                                                    var11_11 = var48_48;
                                                                    break block160;
                                                                    break;
                                                                }
                                                            }
                                                            if (var28_30 != null) {
                                                                var45_46 = var13_13 /* !! */ .has((String)var26_26);
                                                                if (var45_46 == 0) break block161;
                                                                var8_8 = var28_30.keys();
                                                                Intrinsics.checkNotNullExpressionValue(var8_8, var24_24);
                                                                var26_26 = var13_13 /* !! */ .getJSONObject((String)var26_26);
                                                                block107: while (true) {
                                                                    var29_32 = var8_8.hasNext();
                                                                    if (!var29_32) break block161;
                                                                    var9_9 /* !! */  = var8_8.next();
                                                                    var9_9 /* !! */  = (String)var9_9 /* !! */ ;
                                                                    var22_22 = var26_26.has((String)var9_9 /* !! */ );
                                                                    if (!var22_22) continue;
                                                                    var21_21 /* !! */  = var26_26.getJSONObject((String)var9_9 /* !! */ );
                                                                    var50_51 = var26_26;
                                                                    var26_26 = var28_30.getString((String)var9_9 /* !! */ );
                                                                    Intrinsics.checkNotNullExpressionValue(var26_26, (String)var20_20);
                                                                    var51_52 = Long.parseLong((String)var26_26);
                                                                    var39_43 = var21_21 /* !! */ .getLong((String)var14_16 /* !! */ );
                                                                    var41_44 = var21_21 /* !! */ .getLong((String)var9_9 /* !! */ );
                                                                    var53_53 = var39_43 == var30_34 ? 0 : (var39_43 < var30_34 ? -1 : 1);
                                                                    if (var53_53 >= 0 || (var53_53 = (int)((cfr_temp_1 = var39_43 - (var46_47 = (long)-1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) == 0) break;
                                                                    while (true) {
                                                                        var26_26 = var50_51;
                                                                        continue block107;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                                if ((var53_53 = (int)(var41_44 == var51_52 ? 0 : (var41_44 < var51_52 ? -1 : 1))) < 0) ** continue;
                                                                var48_48 = 0;
                                                                var49_49 = 0.0f;
                                                                var27_28 /* !! */  = null;
                                                            }
                                                        }
                                                        if (var48_48 != 0) break block169;
                                                        var13_13 /* !! */  = new StringBuilder();
                                                        var13_13 /* !! */ .append((String)var23_23);
                                                        var26_26 = ": FCAP c limit reached";
                                                        var13_13 /* !! */ .append((String)var26_26);
                                                        var13_13 /* !! */  = var13_13 /* !! */ .toString();
                                                        Intrinsics.checkNotNullParameter(var13_13 /* !! */ , (String)var12_12 /* !! */ );
                                                        var13_13 /* !! */  = JioAds.Companion;
                                                        var13_13 /* !! */  = var13_13 /* !! */ .getInstance();
                                                        var13_13 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                        var13_13 /* !! */  = JioAds$LogLevel.NONE;
                                                        ** GOTO lbl286
                                                    }
                                                    if (var10_10 != null) {
                                                        var53_53 = var13_13 /* !! */ .has(var25_25);
                                                        if (var53_53 == 0) break block162;
                                                        var26_26 = var10_10.keys();
                                                        Intrinsics.checkNotNullExpressionValue(var26_26, var24_24);
                                                        var13_13 /* !! */  = var13_13 /* !! */ .getJSONObject(var25_25);
                                                        while (true) {
                                                            block163: {
                                                                var45_46 = var26_26.hasNext();
                                                                if (var45_46 == 0) break;
                                                                var8_8 = var26_26.next();
                                                                var8_8 = (String)var8_8;
                                                                var29_32 = var13_13 /* !! */ .has((String)var8_8);
                                                                if (!var29_32) break block163;
                                                                var9_9 /* !! */  = var13_13 /* !! */ .getJSONObject((String)var8_8);
                                                                var28_30 = var10_10.getString((String)var8_8);
                                                                Intrinsics.checkNotNullExpressionValue(var28_30, (String)var20_20);
                                                                var54_54 = Long.parseLong((String)var28_30);
                                                                var51_52 = var9_9 /* !! */ .getLong((String)var14_16 /* !! */ );
                                                                var56_55 = var9_9 /* !! */ .getLong((String)var8_8);
                                                                var33_36 = var51_52 == var30_34 ? 0 : (var51_52 < var30_34 ? -1 : 1);
                                                                var46_47 = -1;
                                                                if (var33_36 < 0 && (var33_36 = (int)(var51_52 == var46_47 ? 0 : (var51_52 < var46_47 ? -1 : 1))) != 0 || (var33_36 = (int)(var56_55 == var54_54 ? 0 : (var56_55 < var54_54 ? -1 : 1))) < 0) continue;
                                                                var53_53 = 0;
                                                                var58_56 = 0.0f;
                                                                var26_26 = null;
                                                                break block164;
                                                            }
                                                            var46_47 = -1;
                                                        }
                                                    }
                                                }
                                                var53_53 = var48_48;
                                                var58_56 = var49_49;
                                            }
                                            if (var53_53 == 0) {
                                                try {
                                                    var13_13 /* !! */  = new StringBuilder();
                                                }
                                                catch (Exception v0) {}
                                                var13_13 /* !! */ .append((String)var23_23);
                                                var10_10 = ": FCAP cv limit reached";
                                                var13_13 /* !! */ .append((String)var10_10);
                                                var13_13 /* !! */  = var13_13 /* !! */ .toString();
                                                Intrinsics.checkNotNullParameter(var13_13 /* !! */ , (String)var12_12 /* !! */ );
                                                var13_13 /* !! */  = JioAds.Companion;
                                                var13_13 /* !! */  = var13_13 /* !! */ .getInstance();
                                                var13_13 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                var13_13 /* !! */  = JioAds$LogLevel.NONE;
                                                var11_11 = var53_53;
                                                break block160;
                                            }
                                            var48_48 = var53_53;
                                            var49_49 = var58_56;
                                            ** GOTO lbl469
                                            catch (Exception v1) {}
                                        }
                                        var35_39 /* !! */  = var21_21 /* !! */ ;
                                        break block170;
                                    }
                                    var35_39 /* !! */  = var21_21 /* !! */ ;
                                    var13_13 /* !! */  = new StringBuilder();
                                    var13_13 /* !! */ .append((String)var23_23);
                                    var26_26 = ": Local count records not available";
                                    var13_13 /* !! */ .append((String)var26_26);
                                    var13_13 /* !! */  = var13_13 /* !! */ .toString();
                                    Intrinsics.checkNotNullParameter(var13_13 /* !! */ , (String)var12_12 /* !! */ );
                                    var13_13 /* !! */  = var28_30.getInstance();
                                    var13_13 /* !! */  = var13_13 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                }
                                var35_39 /* !! */  = var21_21 /* !! */ ;
                                var13_13 /* !! */  = new StringBuilder();
                                var13_13 /* !! */ .append((String)var23_23);
                                var26_26 = ": FCAP Config not available";
                                var13_13 /* !! */ .append((String)var26_26);
                                var13_13 /* !! */  = var13_13 /* !! */ .toString();
                                Intrinsics.checkNotNullParameter(var13_13 /* !! */ , (String)var12_12 /* !! */ );
                                var13_13 /* !! */  = var28_30.getInstance();
                                try {
                                    var13_13 /* !! */  = var13_13 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                }
                                catch (Exception v2) {}
                            }
lbl466:
                            // 2 sources

                            while (true) {
                                var48_48 = 1;
                                var49_50 = 1.4E-45f;
lbl469:
                                // 3 sources

                                while (true) {
                                    var13_13 /* !! */  = new StringBuilder();
                                    var13_13 /* !! */ .append((String)var23_23);
                                    var26_26 = ": isUsable: ";
                                    var13_13 /* !! */ .append((String)var26_26);
                                    var13_13 /* !! */ .append((boolean)var48_48);
                                    Intrinsics.checkNotNullParameter(var13_13 /* !! */ .toString(), (String)var12_12 /* !! */ );
                                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    var13_13 /* !! */  = JioAds$LogLevel.NONE;
                                    ** continue;
                                    break;
                                }
                                break;
                            }
                        }
                        var12_12 /* !! */  = var35_39 /* !! */ ;
                        break block171;
                    }
                    var26_26 = new StringBuilder();
                    var10_10 = var6_6.o;
                    if (var10_10 != null) {
                        var9_9 /* !! */  = var10_10.P();
                    } else {
                        var29_32 = false;
                        var9_9 /* !! */  = null;
                    }
                    var26_26.append((String)var9_9 /* !! */ );
                    var26_26.append(": NO FCAP rules available for ");
                    var10_10 = var7_7.a;
                    var26_26.append((String)var10_10);
                    var26_26 = var26_26.toString();
                    com.jio.jioads.util.j.a((String)var26_26);
                    var59_57 = false;
                    var12_12 /* !! */  = null;
                }
                var26_26 = new StringBuilder();
                var10_10 = var6_6.o;
                if (var10_10 != null) {
                    var9_9 /* !! */  = var10_10.P();
                } else {
                    var29_32 = false;
                    var9_9 /* !! */  = null;
                }
                var26_26.append((String)var9_9 /* !! */ );
                var26_26.append(": campaign Id ");
                var10_10 = var7_7.a;
                var26_26.append((String)var10_10);
                var10_10 = " isValid: ";
                var26_26.append((String)var10_10);
                var26_26.append((boolean)var11_11);
                var32_35 = ' ';
                var26_26.append(var32_35);
                var26_26 = var26_26.toString();
                com.jio.jioads.util.j.a((String)var26_26);
                if (var11_11 != 0) {
                    var13_13 /* !! */  = var7_7.d;
                    if (var13_13 /* !! */  != null && (var11_11 = var13_13 /* !! */ .isEmpty()) == 0) {
                        var26_26 = var7_7.d;
                        var13_13 /* !! */  = this;
                        var10_10 = var5_5;
                        var7_7 = var1_1;
                        var8_8 = var3_3;
                        var9_9 /* !! */  = var4_4;
                        var27_28 /* !! */  = var2_2;
                        this.p((HashMap)var26_26, var5_5, var1_1, var3_3, var4_4, (JSONObject)var12_12 /* !! */ , var2_2);
                    } else {
                        var13_13 /* !! */  = new StringBuilder();
                        var26_26 = var6_6.o;
                        if (var26_26 != null) {
                            var28_30 = var26_26.P();
                        } else {
                            var33_36 = 0;
                            var28_30 = null;
                        }
                        var13_13 /* !! */ .append((String)var28_30);
                        var13_13 /* !! */ .append(": selected campaign: ");
                        var26_26 = var7_7.a;
                        var13_13 /* !! */ .append((String)var26_26);
                        var26_26 = " does not have ads node. skipping it.";
                        var13_13 /* !! */ .append((String)var26_26);
                        com.jio.jioads.util.j.a(var13_13 /* !! */ .toString());
                        var13_13 /* !! */  = var6_6.w;
                        if (var13_13 /* !! */  != null) {
                            var26_26 = var7_7.a;
                            Intrinsics.checkNotNull(var26_26);
                            var13_13 /* !! */ .add(var26_26);
                        }
                        var13_13 /* !! */  = var7_7.a;
                        Intrinsics.checkNotNull(var13_13 /* !! */ );
                        var26_26 = var3_3;
                        var3_3.add(var13_13 /* !! */ );
                        var10_10 = var4_4;
                        var13_13 /* !! */  = var5_5;
                        var6_6.o(var5_5, var4_4, var3_3);
                    }
                } else {
                    var26_26 = var3_3;
                    var10_10 = var4_4;
                    var13_13 /* !! */  = var5_5;
                    var8_8 = var6_6.w;
                    if (var8_8 != null) {
                        var9_9 /* !! */  = var7_7.a;
                        Intrinsics.checkNotNull(var9_9 /* !! */ );
                        var8_8.add(var9_9 /* !! */ );
                    }
                    var7_7 = var7_7.a;
                    Intrinsics.checkNotNull(var7_7);
                    var26_26.add(var7_7);
                    var6_6.o((HashMap)var13_13 /* !! */ , (ArrayList)var10_10, (ArrayList)var26_26);
                }
                break block172;
            }
            var26_27 = var3_3;
            var10_10 = var4_4;
            var7_7 = this.o;
            if (var7_7 != null) {
                var9_9 /* !! */  = var7_7.L();
            } else {
                var29_33 = false;
                var9_9 /* !! */  = null;
            }
            var7_7 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP;
            if (var9_9 /* !! */  == var7_7 && !(var60_59 = var6_6.v)) {
                Intrinsics.checkNotNullParameter("All Campaigns are exhausted so fetch from first-Infinite loop", (String)var12_12 /* !! */ );
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var7_7 = JioAds$LogLevel.NONE;
                var6_6.v = var60_59 = true;
                var4_4.clear();
                var3_3.clear();
                var8_8 = var6_6.o;
                if (var8_8 != null && (var8_8 = var8_8.P()) != null && (var9_9 /* !! */  = var6_6.m) != null && (var29_33 = var9_9 /* !! */ .containsKey(var8_8)) == var60_59) {
                    var7_7 = var6_6.m;
                    if (var7_7 != null) {
                        var7_7 = var7_7.get(var8_8);
                        var9_9 /* !! */  = var7_7;
                        var9_9 /* !! */  = (Object[])var7_7;
                    } else {
                        var29_33 = false;
                        var9_9 /* !! */  = null;
                    }
                    if (var9_9 /* !! */  != null) {
                        var7_7 = var9_9 /* !! */ [var11_11];
                        Intrinsics.checkNotNull(var7_7, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        var7_7 = (ArrayList)var7_7;
                        var7_7.clear();
                        var9_9 /* !! */  = var6_6.m;
                        Intrinsics.checkNotNull(var9_9 /* !! */ );
                        var59_58 = 5;
                        var12_12 /* !! */  = new Object[var59_58];
                        var27_29 = "";
                        var28_31 = null;
                        var12_12 /* !! */ [0] = var27_29;
                        var33_37 = 1;
                        var12_12 /* !! */ [var33_37] = var27_29;
                        var12_12 /* !! */ [var11_11] = var7_7;
                        var12_12 /* !! */ [3] = var27_29;
                        var11_11 = 4;
                        var12_12 /* !! */ [var11_11] = var27_29;
                        var9_9 /* !! */ .put(var8_8, var12_12 /* !! */ );
                    }
                }
                if ((var13_14 = var6_6.p) != null && (var13_14 = var13_14.c) != null) {
                    var28_31 = var13_14.a;
                } else {
                    var33_37 = 0;
                    var28_31 = null;
                }
                var6_6.o(var28_31, (ArrayList)var10_10, (ArrayList)var26_27);
            } else {
                var13_15 /* !! */  = new StringBuilder();
                var26_27 = var6_6.o;
                if (var26_27 != null) {
                    var9_9 /* !! */  = var26_27.P();
                } else {
                    var29_33 = false;
                    var9_9 /* !! */  = null;
                }
                var13_15 /* !! */ .append((String)var9_9 /* !! */ );
                var13_15 /* !! */ .append(": No valid campaign available to select for adspot id ");
                var26_27 = var6_6.o;
                if (var26_27 != null) {
                    var9_9 /* !! */  = var26_27.P();
                } else {
                    var29_33 = false;
                    var9_9 /* !! */  = null;
                }
                ir3_0.b(var13_15 /* !! */ , (String)var9_9 /* !! */ , (String)var12_12 /* !! */ );
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var13_15 /* !! */  = JioAds$LogLevel.NONE;
                var11_11 = 0;
                var13_15 /* !! */  = null;
                var6_6.h(null, null, null, null);
            }
        }
        return;
        ** while (true)
        catch (Exception v3) {
            ** continue;
        }
    }

    public final void k(String object) {
        char c2;
        boolean bl2;
        String string2;
        Object object2;
        Object object3;
        Object object4 = this.B;
        Object object5 = null;
        String string3 = "eads";
        String string4 = "multiad_pref";
        String string5 = null;
        if (object4 != null) {
            object3 = "";
            object4 = String.valueOf(j_0.d((Context)object4, string4, 0, object3, string3));
        } else {
            object4 = null;
        }
        if (object4 != null) {
            object2 = "\\b.*";
            string2 = cP.a(".*\\b", object, (String)object2);
            object3 = new Regex(string2);
            bl2 = ((Regex)object3).c((CharSequence)object4);
            object3 = bl2;
        } else {
            bl2 = false;
            object3 = null;
        }
        string2 = "message";
        if (object4 != null && (c2 = ((String)object4).length()) != '\u0000') {
            object5 = new JSONObject((String)object4);
            object5 = object5.keys();
            object2 = "keys(...)";
            Intrinsics.checkNotNullExpressionValue(object5, (String)object2);
            while ((c2 = (char)(object5.hasNext() ? 1 : 0)) != '\u0000') {
                Object object6;
                boolean bl3;
                Object object7;
                boolean bl4;
                object2 = (String)object5.next();
                Object object8 = this.o;
                if (object8 != null) {
                    object8 = object8.P();
                } else {
                    bl4 = false;
                    object8 = null;
                }
                bl4 = Intrinsics.areEqual(object8, object2);
                if (bl4) {
                    object8 = this.B;
                    if (object8 == null) continue;
                    object7 = Boolean.FALSE;
                    bl3 = Intrinsics.areEqual(object3, object7);
                    if (bl3 && (object7 = this.o) != null && (object7 = object7.P()) != null) {
                        object6 = this.E;
                        StringBuilder stringBuilder = new StringBuilder();
                        JSONObject jSONObject = new JSONObject((String)object4);
                        object2 = jSONObject.get((String)object2);
                        stringBuilder.append(object2);
                        c2 = ',';
                        stringBuilder.append(c2);
                        stringBuilder.append((String)object);
                        object2 = stringBuilder.toString();
                        object6.put((String)object7, object2);
                    }
                    object2 = new StringBuilder();
                    object7 = this.o;
                    if (object7 != null) {
                        object7 = object7.P();
                    } else {
                        bl3 = false;
                        object7 = null;
                    }
                    ((StringBuilder)object2).append((String)object7);
                    ((StringBuilder)object2).append(": Update Eads preferences");
                    object7 = this.E;
                    ((StringBuilder)object2).append(object7);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                    object2 = j_0.o((Context)object8, string4).edit();
                    object8 = this.E.toString();
                    object2 = object2.putString(string3, (String)object8);
                    object2.apply();
                    continue;
                }
                object2 = this.B;
                if (object2 == null) continue;
                bl4 = TextUtils.isEmpty((CharSequence)object4);
                if (!bl4 && (object8 = this.o) != null && (object8 = object8.P()) != null) {
                    object8 = new JSONObject((String)object4);
                    this.E = object8;
                }
                if ((object8 = this.o) != null && (object8 = object8.P()) != null) {
                    object7 = this.E;
                    object7.put((String)object8, object);
                }
                object8 = new StringBuilder();
                object7 = this.o;
                if (object7 != null) {
                    object7 = object7.P();
                } else {
                    bl3 = false;
                    object7 = null;
                }
                object6 = ": Update Eads preferences for new adspotId";
                j_0.k((StringBuilder)object8, (String)object7, (String)object6);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object8 = JioAds$LogLevel.NONE;
                object2 = j_0.o((Context)object2, string4).edit();
                object8 = this.E.toString();
                object2 = object2.putString(string3, (String)object8);
                object2.apply();
            }
        } else {
            object4 = this.B;
            if (object4 != null) {
                object3 = this.E;
                object2 = this.o;
                if (object2 != null) {
                    object2 = object2.P();
                } else {
                    c2 = '\u0000';
                    object2 = null;
                }
                bl2 = object3.has((String)object2);
                if (!bl2 && (object3 = this.o) != null && (object3 = object3.P()) != null) {
                    object2 = this.E;
                    object2.put((String)object3, object);
                }
                object3 = new StringBuilder();
                object2 = this.o;
                if (object2 != null) {
                    string5 = object2.P();
                }
                ((StringBuilder)object3).append(string5);
                string5 = ": Storing Eads data first time: ";
                ((StringBuilder)object3).append(string5);
                ((StringBuilder)object3).append((String)object);
                Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = this.E.toString();
                j_0.p((Context)object4, string4, 0, object, string3);
            }
        }
    }

    public final void l(String string2, String string3, String string4, Context context, boolean bl2, String string5) {
        String string6 = string3;
        Object object = string4;
        Intrinsics.checkNotNullParameter(KW.a(string2, ": deleting ad : ", string4, " in campaign ", string3), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        int n3 = 1;
        String string7 = "";
        String string8 = "ads";
        String string9 = "cmps";
        String string10 = "asi";
        String string11 = "prm";
        String string12 = "dd";
        if (bl2) {
            boolean bl3;
            JSONObject jSONObject;
            boolean bl4;
            String string13;
            SharedPreferences sharedPreferences2 = j_0.o(context, "multiad_pref");
            string7 = sharedPreferences2.getString(string13 = this.k, string7);
            boolean bl5 = TextUtils.isEmpty((CharSequence)string7);
            if (!bl5 && (bl4 = (jSONObject = new JSONObject(string7)).has(string10)) && (bl4 = (string7 = jSONObject.getJSONObject(string10)).has(string2)) && (bl3 = (string7 = jSONObject.getJSONObject(string10).getJSONObject(string2)).has(string9))) {
                boolean bl6;
                Object object2;
                boolean bl7 = (string7 = string7.getJSONObject(string9)).has(string12);
                if (bl7 && (bl7 = (string9 = string7.getJSONObject(string12)).has(string3))) {
                    string7 = string7.getJSONObject(string12);
                    object2 = string7.getJSONObject(string3);
                } else {
                    bl7 = string7.has(string11);
                    if (bl7 && (bl7 = (string9 = string7.getJSONObject(string11)).has(string6))) {
                        string7 = string7.getJSONObject(string11);
                        object2 = string7.getJSONObject(string6);
                    } else {
                        bl6 = false;
                        object2 = null;
                    }
                }
                if (object2 != null && (bl4 = object2.has(string8))) {
                    string7 = object2.getJSONObject(string8);
                    bl6 = string7.has((String)object);
                    if (bl6) {
                        string7.remove((String)object);
                    }
                    object = sharedPreferences2.edit();
                    object2 = jSONObject.toString();
                    int n4 = (object = object.putString(string13, (String)object2)).commit();
                    if (n4 != 0 && (n4 = string7.length()) < n3) {
                        bl4 = false;
                        string7 = null;
                        object = this;
                        string6 = string3;
                        n3 = (int)(bl2 ? 1 : 0);
                        object2 = string5;
                        this.g(context, string2, string3, bl2, false, string5);
                    }
                }
            }
        } else {
            boolean bl8;
            boolean bl9;
            boolean bl10;
            SharedPreferences sharedPreferences3 = j_0.o(context, "master_config_pref");
            String string14 = "master_config_";
            CharSequence charSequence = new StringBuilder(string14);
            Object object3 = this.e;
            charSequence.append((String)object3);
            charSequence = charSequence.toString();
            string7 = sharedPreferences3.getString((String)charSequence, string7);
            if (string7 != null && (bl10 = (charSequence = new JSONObject(string7)).has(string10)) && (string7 = charSequence.optJSONObject(string10)) != null && (bl9 = string7.has(string10 = ((Object)StringsKt.m0(string2)).toString())) && (bl8 = (string7 = string7.getJSONObject(string2)).has(string10 = "bkp")) && (bl9 = (string7 = string7.getJSONObject(string10)).has(string9))) {
                boolean bl11 = (string7 = string7.getJSONObject(string9)).has(string12);
                if (bl11 && (bl11 = (string9 = string7.getJSONObject(string12)).has(string3))) {
                    string7 = string7.getJSONObject(string12).getJSONObject(string3);
                } else {
                    bl11 = string7.has(string11);
                    if (bl11 && (bl11 = (string9 = string7.getJSONObject(string11)).has(string6))) {
                        string7 = string7.getJSONObject(string11).getJSONObject(string6);
                    } else {
                        bl10 = false;
                        string7 = null;
                    }
                }
                if (string7 != null && (bl11 = string7.has(string8))) {
                    int n7;
                    boolean bl12 = (string7 = string7.getJSONObject(string8)).has((String)object);
                    if (bl12) {
                        string7.remove((String)object);
                    }
                    if ((object = sharedPreferences3.edit()) != null && (object = object.putString((String)(object3 = kp1_0.c(string14, (String)object3)), string8 = charSequence.toString())) != null) {
                        n7 = (int)(object.commit() ? 1 : 0);
                        object3 = n7 != 0;
                    } else {
                        boolean bl13 = false;
                        object3 = null;
                    }
                    object = Boolean.TRUE;
                    n7 = Intrinsics.areEqual(object3, object);
                    if (n7 && (n7 = string7.length()) < n3) {
                        bl10 = false;
                        string7 = null;
                        object = this;
                        string6 = string3;
                        n3 = (int)(bl2 ? 1 : 0);
                        object3 = string5;
                        this.g(context, string2, string3, bl2, false, string5);
                    }
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final void m(String var1_1, HashMap var2_2, ArrayList var3_3, ArrayList var4_4, b_0 var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 8[TRYBLOCK] [10 : 2158->2163)] java.lang.Exception
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
     * Exception decompiling
     */
    public final void n(ArrayList var1_1, HashMap var2_2, HashMap var3_3, f var4_4, ArrayList var5_5, ArrayList var6_6, JSONObject var7_7, String var8_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 17[TRYBLOCK] [22 : 1002->1006)] java.lang.Exception
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

    public final void o(HashMap serializable, ArrayList arrayList, ArrayList arrayList2) {
        int n3;
        Intrinsics.checkNotNullParameter(arrayList, "skippedAd");
        Intrinsics.checkNotNullParameter(arrayList2, "skippedCampaigns");
        o o3 = new o(this, arrayList2, arrayList, (HashMap)serializable);
        int n4 = this.C;
        this.C = n3 = n4 + 1;
        n3 = 10;
        if (n4 > n3 && serializable != null) {
            serializable = new g_0(o3);
            long l2 = 15;
            com.jio.jioads.util.s.b(l2, (Function0)((Object)serializable));
        } else {
            o3.invoke();
        }
    }

    public final void p(HashMap hashMap, HashMap hashMap2, f f5, ArrayList arrayList, ArrayList arrayList2, JSONObject jSONObject, String string2) {
        block25: {
            Object object;
            Object object2;
            Object object3;
            ArrayList arrayList3;
            ArrayList arrayList4;
            f f6;
            HashMap hashMap3;
            Object object4;
            z z5;
            block20: {
                block21: {
                    Object object5;
                    int n3;
                    Object object6;
                    int n4;
                    z5 = this;
                    object4 = hashMap;
                    hashMap3 = hashMap2;
                    f6 = f5;
                    arrayList4 = arrayList;
                    arrayList3 = arrayList2;
                    object3 = new StringBuilder();
                    object2 = this.o;
                    object2 = object2 != null ? object2.P() : null;
                    j_0.k((StringBuilder)object3, (String)object2, ": inside selectAd()");
                    object3 = JioAds.Companion;
                    ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                    object2 = " skipping it";
                    object = ": Ad object is null/already used so skipping campaign ";
                    if (f6 == null || object4 == null || (n4 = hashMap.isEmpty()) != 0) break block20;
                    n4 = hashMap.size();
                    if (n4 <= 0) break block21;
                    object2 = new ArrayList();
                    object = new ArrayList();
                    Object object7 = z5.m;
                    String string3 = "message";
                    int n7 = 1;
                    if (object7 != null) {
                        object6 = z5.o;
                        if (object6 == null || (object6 = object6.P()) == null) {
                            object6 = "";
                        }
                        if ((n4 = (int)(((HashMap)object7).containsKey(object6) ? 1 : 0)) == n7) {
                            object7 = z5.m;
                            if (object7 != null) {
                                object6 = z5.o;
                                object6 = object6 != null ? object6.P() : null;
                                object7 = (Object[])object7.get(object6);
                            } else {
                                n4 = 0;
                                object7 = null;
                            }
                            if (object7 != null) {
                                n3 = 2;
                                object = object7[n3];
                                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                                object = (ArrayList)object;
                                object6 = "Already consumed Ads: ";
                                object7 = new StringBuilder((String)object6);
                                ((StringBuilder)object7).append(object);
                                object7 = ((StringBuilder)object7).toString();
                                Intrinsics.checkNotNullParameter(object7, string3);
                                object3 = ((JioAds$Companion)object3).getInstance();
                                ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                ((ArrayList)object).addAll(arrayList3);
                            }
                        }
                    }
                    object3 = hashMap.keySet().iterator();
                    while ((n4 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                        int n8;
                        boolean bl2;
                        Object object8;
                        boolean bl3;
                        block24: {
                            float f7;
                            boolean bl4;
                            float f8;
                            block23: {
                                block22: {
                                    object7 = (String)object3.next();
                                    object6 = (a)((HashMap)object4).get(object7);
                                    if (object6 == null) continue;
                                    bl3 = object.contains(object7);
                                    if (bl3) {
                                        l_0.h("Ignoring unusable ad: ", (String)object7);
                                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        object8 = object;
                                        bl3 = false;
                                        f8 = 0.0f;
                                    } else {
                                        object8 = object;
                                        bl3 = true;
                                        f8 = Float.MIN_VALUE;
                                    }
                                    long l2 = ((a)object6).f;
                                    long l3 = 0L;
                                    Object object9 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                                    if (object9 <= 0) break block22;
                                    object5 = Calendar.getInstance();
                                    l2 = object5.getTimeInMillis();
                                    bl4 = bl3;
                                    f7 = f8;
                                    long l4 = ((a)object6).f;
                                    long l7 = l4 - l2;
                                    object9 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                    if (object9 <= 0) break block23;
                                    object5 = new StringBuilder();
                                    object = z5.o;
                                    if (object != null) {
                                        object = object.P();
                                    } else {
                                        n3 = 0;
                                        object = null;
                                    }
                                    object5.append((String)object);
                                    object5.append(": skip expiry for campaign ");
                                    object5.append(f6);
                                    object5.append(" & ad ");
                                    object5.append((String)object7);
                                    object5.append(": ");
                                    long l8 = ((a)object6).f;
                                    object5.append(l8);
                                    object = " not yet elapsed";
                                    object5.append((String)object);
                                    Intrinsics.checkNotNullParameter(object5.toString(), string3);
                                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    object5 = JioAds$LogLevel.NONE;
                                    bl3 = false;
                                    f8 = 0.0f;
                                    break block24;
                                }
                                bl4 = bl3;
                                f7 = f8;
                            }
                            bl3 = bl4;
                            f8 = f7;
                        }
                        if (bl3 && (bl2 = (object5 = z5.z) != null && (n8 = object5.contains(object7)) == n7)) {
                            ((ArrayList)object2).add(object7);
                        }
                        object = object8;
                    }
                    object3 = this;
                    object4 = hashMap;
                    hashMap3 = hashMap2;
                    f6 = f5;
                    arrayList4 = arrayList;
                    arrayList3 = arrayList2;
                    object5 = jSONObject;
                    object = string2;
                    this.n((ArrayList)object2, hashMap, hashMap2, f5, arrayList, arrayList2, jSONObject, string2);
                    break block25;
                }
                object4 = new StringBuilder();
                Object object10 = z5.o;
                if (object10 != null) {
                    object10 = object10.P();
                } else {
                    boolean bl5 = false;
                    object10 = null;
                }
                ((StringBuilder)object4).append((String)object10);
                ((StringBuilder)object4).append((String)object);
                object10 = f6.a;
                com.jio.jioads.adinterfaces.d_0.a((StringBuilder)object4, (String)object10, (String)object2, (JioAds$Companion)object3);
                object3 = f6.a;
                Intrinsics.checkNotNull(object3);
                arrayList4.add(object3);
                z5.o(hashMap3, arrayList3, arrayList4);
                break block25;
            }
            if (f6 == null) {
                String string4;
                object2 = new StringBuilder();
                object4 = z5.o;
                if (object4 != null) {
                    string4 = object4.P();
                } else {
                    boolean bl6 = false;
                    string4 = null;
                }
                object4 = ": null campaign id";
                com.jio.jioads.adinterfaces.d_0.a((StringBuilder)object2, string4, (String)object4, (JioAds$Companion)object3);
            } else {
                object4 = new StringBuilder();
                Object object11 = z5.o;
                if (object11 != null) {
                    object11 = object11.P();
                } else {
                    boolean bl7 = false;
                    object11 = null;
                }
                ((StringBuilder)object4).append((String)object11);
                ((StringBuilder)object4).append((String)object);
                object11 = f6.a;
                com.jio.jioads.adinterfaces.d_0.a((StringBuilder)object4, (String)object11, (String)object2, (JioAds$Companion)object3);
                object3 = f6.a;
                Intrinsics.checkNotNull(object3);
                arrayList4.add(object3);
            }
            z5.o(hashMap3, arrayList3, arrayList4);
        }
    }

    public final void q() {
        this.q = null;
        this.n = null;
        this.r = null;
        this.m = null;
        ArrayList arrayList = this.z;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.z = null;
        arrayList = this.y;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.y = null;
        arrayList = this.w;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.w = null;
        this.o = null;
        this.p = null;
        this.C = 0;
        this.B = null;
    }
}

