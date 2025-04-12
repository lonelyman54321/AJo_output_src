/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.instream.video.vodVmap;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$JioVmapListener;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.controller.f;
import com.jio.jioads.instream.video.vodVmap.a;
import com.jio.jioads.instream.video.vodVmap.b;
import com.jio.jioads.instream.video.vodVmap.c;
import com.jio.jioads.instream.video.vodVmap.g;
import com.jio.jioads.instream.video.vodVmap.h;
import com.jio.jioads.instream.video.vodVmap.k;
import com.jio.jioads.instream.video.vodVmap.l;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.n;
import com.jio.jioads.instreamads.vastparser.model.q;
import com.jio.jioads.instreamads.wrapper.i;
import com.jio.jioads.tracker.JioEventTracker$TrackingEvents;
import com.jio.jioads.util.Utility;
import com.jio.jioads.videomodule.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import org.json.JSONObject;

public final class m {
    public final com.jio.jioads.common.b a;
    public final com.jio.jioads.controller.a b;
    public final f c;
    public final JioVmapAdsLoader$JioVmapListener d;
    public final com.jio.jioads.instreamads.vmapParser.model.c e;
    public final HashMap f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public int k;
    public String l;
    public String m;
    public Long n;
    public String o;
    public com.jio.jioads.instreamads.vastparser.model.m p;
    public final LinkedHashMap q;
    public s r;
    public Map s;
    public boolean t;
    public final ArrayList u;
    public boolean v;
    public final HashMap w;
    public boolean x;
    public final a y;

    public m(com.jio.jioads.common.b object, com.jio.jioads.controller.a a2, f f5, JioVmapAdsLoader$JioVmapListener jioVmapAdsLoader$JioVmapListener, com.jio.jioads.instreamads.vmapParser.model.c c2, HashMap hashMap, int n3, String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(object, "iJioAdView");
        Intrinsics.checkNotNullParameter(a2, "jioAdCallbacks");
        Intrinsics.checkNotNullParameter(f5, "iJioAdViewController");
        this.a = object;
        this.b = a2;
        this.c = f5;
        this.d = jioVmapAdsLoader$JioVmapListener;
        this.e = c2;
        this.f = hashMap;
        this.g = n3;
        this.h = string2;
        this.i = string3;
        this.j = string4;
        this.k = -1;
        object = new LinkedHashMap();
        this.q = object;
        this.u = object;
        super();
        this.w = object;
        this.y = object = new a(this);
    }

    public static String a(int n3) {
        int n4 = 1;
        int n7 = 3;
        int n8 = 2;
        int n10 = 60;
        int n14 = n3 % 60;
        String string2 = "format(format, *args)";
        if ((n3 /= n10) >= n10) {
            int n15 = n3 / 60;
            Object object = StringCompanionObject.INSTANCE;
            object = n15;
            Integer n16 = n3 %= n10;
            Integer n17 = n14;
            Object[] objectArray = new Object[n7];
            objectArray[0] = object;
            objectArray[n4] = n16;
            objectArray[n8] = n17;
            return xh2_0.a(objectArray, n7, "%02d:%02d:%02d.000", string2);
        }
        Object object = StringCompanionObject.INSTANCE;
        Integer n18 = n3;
        object = n14;
        Object[] objectArray = new Object[n8];
        objectArray[0] = n18;
        objectArray[n4] = object;
        return xh2_0.a(objectArray, n8, "00:%02d:%02d.000", string2);
    }

    public final String b(String string2) {
        l_0.h("vmap: inside findExistingParent for ", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.p;
        String string3 = null;
        if (object != null) {
            boolean bl2;
            Intrinsics.checkNotNull(object);
            object = ((com.jio.jioads.instreamads.vastparser.model.m)object).c.iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                String string4;
                j j3 = (j)object.next();
                if (j3 != null) {
                    string4 = j3.h;
                } else {
                    bl3 = false;
                    string4 = null;
                }
                if (!(bl3 = Intrinsics.areEqual(string4, string2))) continue;
                if (j3 == null) break;
                string3 = j3.p;
                break;
            }
        }
        return string3;
    }

    public final void c() {
        Object object;
        Object object2 = this.p;
        if (object2 != null && (object2 = ((com.jio.jioads.instreamads.vastparser.model.m)object2).a) != null) {
            ((n)object2).c.clear();
            ((n)object2).b.clear();
            object = ((n)object2).d;
            ((HashMap)object).clear();
            object2 = ((n)object2).e;
            ((HashMap)object2).clear();
        }
        boolean bl2 = false;
        object2 = null;
        this.p = null;
        long l2 = 0L;
        object = l2;
        this.n = object;
        object = new b(this);
        com.jio.jioads.util.s.d((Function0)object);
        object = this.l;
        boolean bl3 = kotlin.text.b.i((String)object, "end", false);
        this.f();
        Object object3 = new StringBuilder("vmap: adBreak ");
        com.jio.jioads.instreamads.vmapParser.model.c c2 = this.e;
        Object object4 = c2 != null ? c2.a : null;
        object3.append(object4);
        object3 = object3.toString();
        object4 = "message";
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        if (c2 != null) {
            object2 = c2.a;
        }
        if (object2 == null || (bl2 = object2.isEmpty()) || bl3) {
            object2 = new c(this);
            com.jio.jioads.util.s.d((Function0)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(int n3, List list, int n4, com.jio.jioads.instreamads.vastparser.model.m m2, String string2, String string3) {
        Exception exception2;
        Object object;
        block23: {
            com.jio.jioads.common.b b2;
            int n7;
            int n8;
            Object object2;
            Object object3;
            String string4;
            String string5;
            com.jio.jioads.instreamads.vastparser.model.m m3;
            int n10;
            block22: {
                int n14;
                Object object4;
                m m4 = this;
                n10 = n3;
                m3 = m2;
                string5 = string2;
                string4 = string3;
                object = this.p;
                if (object == null) {
                    this.p = object = new com.jio.jioads.instreamads.vastparser.model.m();
                    object3 = new n();
                    object2 = "vmap";
                    object4 = "<set-?>";
                    Intrinsics.checkNotNullParameter(object2, (String)object4);
                    ((n)object3).a = object2;
                    object2 = "vastStorage";
                    Intrinsics.checkNotNullParameter(object3, (String)object2);
                    ((com.jio.jioads.instreamads.vastparser.model.m)object).a = object3;
                }
                object = "message";
                int n15 = 1;
                if (m3 != null && (object3 = m3.c) != null && (n8 = (int)(object3.isEmpty() ? 1 : 0)) == n15) {
                    Intrinsics.checkNotNullParameter("vmap: Empty vast tag response", (String)object);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                }
                if (n10 >= (n8 = m3 != null && (object3 = m3.c) != null ? object3.size() : -1)) {
                    List list2 = list;
                    m4.g(string4, n4, list);
                    return;
                }
                if (m3 == null) return;
                object3 = m3.c;
                if (object3 == null) return;
                Object object5 = object3 = CollectionsKt.N(n10, (List)object3);
                object5 = (j)object3;
                if (object5 == null) return;
                object3 = ((j)object5).h;
                if (object3 == null) return;
                ((j)object5).p = string5;
                if (string5 != null) {
                    object3 = m4.p;
                    if (object3 != null) {
                        object2 = ((com.jio.jioads.instreamads.vastparser.model.m)object3).c;
                    } else {
                        n14 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        Intrinsics.checkNotNull(object3);
                        object3 = ((com.jio.jioads.instreamads.vastparser.model.m)object3).c.iterator();
                        while ((n14 = object3.hasNext()) != 0) {
                            object2 = (j)object3.next();
                            if (object2 != null) {
                                object4 = ((j)object2).h;
                            } else {
                                n7 = 0;
                                object4 = null;
                            }
                            if ((n7 = Intrinsics.areEqual(object4, string5)) == 0) continue;
                            object3 = ((j)object2).r;
                            break;
                        }
                    } else {
                        n8 = 0;
                        object3 = null;
                    }
                    object2 = ((j)object5).h;
                    n14 = Intrinsics.areEqual(string5, object2);
                    if (n14 != 0) {
                        object2 = object3 == null ? m4.b(string5) : object3;
                        ((j)object5).r = object2;
                        if (object3 == null) {
                            object3 = m4.b(string5);
                        }
                        ((j)object5).p = object3;
                    } else {
                        if (object3 == null) {
                            object3 = string5;
                        }
                        ((j)object5).r = object3;
                    }
                }
                object3 = ((j)object5).h;
                b2 = m4.a;
                if (object3 != null) {
                    object3 = ((j)object5).m;
                    if (object3 != null) {
                        object3 = ((q)object3).e;
                    } else {
                        n8 = 0;
                        object3 = null;
                    }
                    if (object3 != null && (n8 = ((String)object3).length()) != 0) {
                        l l2;
                        object = m4.p;
                        Intrinsics.checkNotNull(object);
                        ((com.jio.jioads.instreamads.vastparser.model.m)object).c.add(object5);
                        object = l2;
                        n8 = n4;
                        n14 = n3;
                        object4 = this;
                        m3 = m2;
                        string5 = string2;
                        string4 = string3;
                        l2 = new l(n4, n3, this, m2, string2, string3, list);
                        Object object6 = m4.c;
                        i i3 = new i((j)object5, l2, b2, (com.jio.jioads.common.c)object6);
                        object6 = ((j)object5).k;
                        if (object6 != null) {
                            n15 = 0;
                        }
                        i3.i = n15;
                        i3.c(null, null, null);
                        return;
                    }
                }
                if ((object3 = ((j)object5).h) == null) return;
                object3 = ((j)object5).n;
                if (object3 == null) return;
                try {
                    object3 = m4.p;
                    Intrinsics.checkNotNull(object3);
                    object3 = ((com.jio.jioads.instreamads.vastparser.model.m)object3).c;
                    object3.add(object5);
                    object3 = ((j)object5).p;
                    if (object3 != null && (n8 = ((String)object3).length()) != 0) break block22;
                }
                catch (Exception exception2) {
                    break block23;
                }
                ((j)object5).p = string5;
            }
            m4.m = string4;
            b2.t();
            object3 = "vmap: starting prepare player from processParsedVastModel";
            Intrinsics.checkNotNullParameter(object3, (String)object);
            object = JioAds.Companion;
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            this.h();
            n8 = n10 + 1;
            object = this;
            object2 = list;
            n7 = n4;
            m3 = m2;
            string5 = string2;
            string4 = string3;
            this.d(n8, list, n4, m2, string2, string3);
            return;
        }
        object = "vmap: Exception while preparing: ";
        LO1.b((String)object, exception2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public final void e(String string2, int n3, List list) {
        int n4 = list.size();
        Object object = "message";
        Object object2 = this.a;
        if (n4 > n3) {
            Object object3 = (com.jio.jioads.instreamads.vmapParser.model.a)list.get(n3);
            String string3 = object3.a;
            Object object4 = this.q;
            Intrinsics.checkNotNull(object4);
            String string4 = object3.d;
            object4.put(string3, string4);
            object3 = object2.k0();
            object4 = JioAdView$AdState.DESTROYED;
            if (object3 != object4) {
                Object object5;
                Object object6 = object2.Y();
                object2 = new com.jio.jioads.network.c((Context)object6);
                Object object7 = new HashMap();
                object3 = this.f;
                if (object3 != null) {
                    boolean bl2;
                    object4 = object3.entrySet().iterator();
                    while (bl2 = object4.hasNext()) {
                        object5 = (Map.Entry)object4.next();
                        Object k2 = object5.getKey();
                        object5 = object5.getValue();
                        ((HashMap)object7).put(k2, object5);
                    }
                }
                object4 = new StringBuilder("vmap: metadata ");
                ((StringBuilder)object4).append(object3);
                Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), (String)object);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                object3 = object5;
                object = object2;
                object2 = string4;
                object4 = this;
                string4 = object6;
                object6 = object7;
                object7 = string2;
                object5 = new g((com.jio.jioads.network.c)object, (String)object2, this, string3, (Context)string4, (HashMap)object6, list, n3, string2);
                com.jio.jioads.util.s.c((Function0)object5);
            }
        } else {
            this.j();
            Object object8 = string2;
            this.m = string2;
            object2.t();
            Intrinsics.checkNotNullParameter("vmap: starting prepare player from fetchAdSource", (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object8 = JioAds$LogLevel.NONE;
            this.h();
        }
    }

    public final void f() {
        Object object = new StringBuilder("vmap: clearing current cue point: ");
        Object object2 = this.l;
        object.append((String)object2);
        object.append(", ");
        object2 = this.m;
        String string2 = "message";
        ir3_0.b(object, (String)object2, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.e;
        if (object != null && (object2 = ((com.jio.jioads.instreamads.vmapParser.model.c)object).a) != null) {
            string2 = this.l;
            object2 = (com.jio.jioads.instreamads.vmapParser.model.b)TypeIntrinsics.asMutableMap(object2).remove(string2);
        }
        if (object != null && (object = ((com.jio.jioads.instreamads.vmapParser.model.c)object).a) != null) {
            object2 = this.m;
            object = (com.jio.jioads.instreamads.vmapParser.model.b)TypeIntrinsics.asMutableMap(object).remove(object2);
        }
        this.m = null;
        this.l = null;
        this.o = null;
    }

    public final void g(String object, int n3, List list) {
        String string2 = "message";
        Intrinsics.checkNotNullParameter("vmap: Inside prepareNextAdSource", string2);
        JioAds$Companion jioAds$Companion = JioAds.Companion;
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        int n4 = list.size();
        if (n4 > ++n3) {
            this.e((String)object, n3, list);
        } else {
            LinkedHashMap linkedHashMap = this.q;
            if (linkedHashMap == null || (n3 = (int)(linkedHashMap.isEmpty() ? 1 : 0)) != 0) {
                this.j();
                this.m = object;
                this.a.t();
                Intrinsics.checkNotNullParameter("vmap: starting prepare player from prepareNextAdSource", string2);
                object = jioAds$Companion.getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                this.h();
            }
        }
    }

    public final void h() {
        Object object;
        Object object2 = this.a;
        Object object3 = object2.k0();
        if (object3 == (object = JioAdView$AdState.DESTROYED)) {
            return;
        }
        object3 = object2.Y();
        Object object4 = this.r;
        if (object4 == null) {
            boolean bl2;
            if (object3 != null && (object4 = this.p) != null) {
                int n3;
                Integer n4 = object2.B();
                if (n4 != null) {
                    n3 = n4;
                } else {
                    n3 = 0;
                    n4 = null;
                }
                k k2 = new k(this);
                object3 = ((com.jio.jioads.instreamads.vastparser.model.m)object4).e((Context)object3, n3, k2);
            } else {
                bl2 = false;
                object3 = null;
            }
            if (object3 == null || (bl2 = object3.isEmpty())) {
                Intrinsics.checkNotNullParameter("vmap: Final vast model is empty", "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = JioAdError.Companion;
                object3 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                object2.getClass();
                object2 = t_0.a((JioAdError$JioAdErrorType)((Object)object3));
                ((JioAdError)object2).setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease("Empty Vast Document Received - no ads available");
                this.f();
                object3 = JioAdView$AdState.FAILED;
                object = (V)this.b;
                ((V)object).e((JioAdView$AdState)((Object)object3));
                object3 = this.d;
                if (object3 != null) {
                    object3.onJioVmapError((JioAdError)object2);
                }
                return;
            }
        }
        if ((object3 = object2.k0()) != object) {
            object3 = new Ref$ObjectRef();
            ((Ref$ObjectRef)object3).element = object2 = object2.Y();
            object2 = new h(this, (Ref$ObjectRef)object3);
            com.jio.jioads.util.s.d((Function0)object2);
        }
        object2 = this.r;
        if (object2 != null) {
            ((s)object2).J(false);
        }
    }

    public final void i() {
        Object object = this.j;
        this.o = object;
        object = this.e;
        if (object != null) {
            Object object2;
            Intrinsics.checkNotNull(object);
            Map map2 = ((com.jio.jioads.instreamads.vmapParser.model.c)object).a;
            String string2 = "end";
            boolean bl2 = map2.containsKey(string2);
            if (bl2 && !(bl2 = Intrinsics.areEqual(object2 = this.m, string2))) {
                int n3;
                object2 = this.r;
                if (object2 != null) {
                    ((s)object2).u();
                }
                bl2 = false;
                object2 = null;
                this.r = null;
                this.k = n3 = -1;
                this.p = null;
                Intrinsics.checkNotNull(object);
                object = (com.jio.jioads.instreamads.vmapParser.model.b)map2.get(string2);
                if (object != null) {
                    this.l = string2;
                    object = ((com.jio.jioads.instreamads.vmapParser.model.b)object).c;
                    map2 = null;
                    this.e(string2, 0, (List)object);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void j() {
        block13: {
            var1_1 = this;
            var2_2 = this.p;
            if (var2_2 != null) {
                var2_2 = var2_2.c;
            } else {
                var3_3 = false;
                var2_2 = null;
            }
            if (var2_2 == null || (var3_3 = var2_2.isEmpty())) break block13;
            var2_2 = var1_1.p;
            if (var2_2 != null && (var4_4 /* !! */  = var2_2.a) != null) {
                Intrinsics.checkNotNull(var2_2);
                var4_4 /* !! */ .i((com.jio.jioads.instreamads.vastparser.model.m)var2_2);
            }
            if ((var4_4 /* !! */  = (var2_2 = var1_1.a).k0()) == (var5_5 = JioAdView$AdState.DESTROYED) || (var4_4 /* !! */  = var2_2.Y()) == null || (var4_4 /* !! */  = var1_1.o) == null) break block13;
            var4_4 /* !! */  = JioEventTracker$TrackingEvents.values();
            var6_6 = ((Object)var4_4 /* !! */ ).length;
            var7_7 /* !! */  = null;
            for (var8_8 = 0; var8_8 < var6_6; ++var8_8) {
                block18: {
                    block14: {
                        var9_9 = var4_4 /* !! */ [var8_8];
                        var10_10 = var1_1.p;
                        if (var10_10 == null || (var10_10 = var10_10.a) == null || (var10_10 = var10_10.x) == null) break block14;
                        var11_11 = var9_9.getType();
                        var9_9 = var9_9.getType();
                        var12_12 = new List<Object>();
                        var13_13 /* !! */  = var2_2.k0();
                        if (var13_13 /* !! */  == (var14_14 /* !! */  = JioAdView$AdState.DESTROYED)) {
                            var12_12 = mz0_2.a;
lbl27:
                            // 5 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var13_13 /* !! */  = var2_2.Y();
                        if (var13_13 /* !! */  == null || (var14_14 /* !! */  = var1_1.o) == null) ** GOTO lbl27
                        Intrinsics.checkNotNull((Object)var14_14 /* !! */ );
                        var17_17 = "vmap_cache_pref";
                        var18_18 = "";
                        var19_19 = TextUtils.isEmpty((CharSequence)(var13_13 /* !! */  = String.valueOf(j_0.d((Context)var13_13 /* !! */ , var17_17, 0, var18_18, (String)var14_14 /* !! */ ))));
                        if (var19_19 != 0) ** GOTO lbl27
                        var14_14 /* !! */  = new JSONObject((String)var13_13 /* !! */ );
                        var13_13 /* !! */  = var14_14 /* !! */ .getString("tj");
                        var14_14 /* !! */  = new JSONObject((String)var13_13 /* !! */ );
                        if (var9_9 == null || !(var20_20 = var14_14 /* !! */ .has((String)var9_9))) ** GOTO lbl27
                        var13_13 /* !! */  = var14_14 /* !! */ .getJSONArray((String)var9_9);
                        var19_19 = var13_13 /* !! */ .length();
                        var21_21 = 0;
                        var17_17 = null;
                        while (true) {
                            block12: {
                                block16: {
                                    block17: {
                                        block15: {
                                            if (var21_21 < var19_19) ** break;
                                            ** continue;
                                            var22_22 = var13_13 /* !! */ .get(var21_21);
                                            var22_22 = var22_22 != null ? var22_22.toString() : null;
                                            var23_23 /* !! */  = "click";
                                            var24_24 = Intrinsics.areEqual(var9_9, var23_23 /* !! */ );
                                            var7_7 /* !! */  = var2_2.k0();
                                            var15_15 = var4_4 /* !! */ ;
                                            var4_4 /* !! */  = JioAdView$AdState.DESTROYED;
                                            if (var7_7 /* !! */  != var4_4 /* !! */ ) break block15;
                                            var16_16 = var6_6;
                                            var25_25 = var9_9;
                                            var9_9 = null;
                                            var22_22 = null;
                                            break block12;
                                        }
                                        var4_4 /* !! */  = var2_2.Y();
                                        var7_7 /* !! */  = var1_1.o;
                                        if (var7_7 /* !! */  == null) break block16;
                                        var7_7 /* !! */  = new Object();
                                        var7_7 /* !! */ .p = var4_4 /* !! */ ;
                                        var16_16 = var6_6;
                                        var5_5 = var2_2.P();
                                        var7_7 /* !! */ .q = var5_5;
                                        var7_7 /* !! */ .a = var22_22;
                                        if (var4_4 /* !! */  == null) break block17;
                                        Intrinsics.checkNotNullParameter(var4_4 /* !! */ , "context");
                                        var5_5 = "common_prefs";
                                        var22_22 = "advid";
                                        var25_25 = var9_9;
                                        var9_9 = null;
                                        var5_5 = j_0.d((Context)var4_4 /* !! */ , (String)var5_5, 0, var18_18, (String)var22_22);
                                        var22_22 = "null cannot be cast to non-null type kotlin.String";
                                        Intrinsics.checkNotNull(var5_5, (String)var22_22);
                                        var5_5 = (String)var5_5;
                                        ** GOTO lbl89
                                    }
                                    var25_25 = var9_9;
                                    var9_9 = null;
lbl86:
                                    // 2 sources

                                    while (true) {
                                        var6_6 = 0;
                                        var5_5 = null;
lbl89:
                                        // 2 sources

                                        var7_7 /* !! */ .r = var5_5;
                                        var5_5 = Utility.INSTANCE;
                                        var4_4 /* !! */  = var5_5.getUidFromPreferences((Context)var4_4 /* !! */ );
                                        var7_7 /* !! */ .s = var4_4 /* !! */ ;
                                        var26_26 = var1_1.k;
                                        var4_4 /* !! */  = Integer.valueOf(var26_26);
                                        var7_7 /* !! */ .l = var4_4 /* !! */ ;
                                        var4_4 /* !! */  = var1_1.o;
                                        var7_7 /* !! */ .d = var4_4 /* !! */ ;
                                        var7_7 /* !! */ .e = var23_23 /* !! */  = Boolean.valueOf((boolean)var24_24);
                                        var7_7 /* !! */ .w = var23_23 /* !! */  = var2_2.q0();
                                        var7_7 /* !! */ .m = var23_23 /* !! */  = Boolean.TRUE;
                                        var7_7 /* !! */ .o = var23_23 /* !! */  = Boolean.FALSE;
                                        var7_7 /* !! */ .n = var23_23 /* !! */ ;
                                        var7_7 /* !! */ .t = var23_23 /* !! */  = var2_2.R();
                                        var2_2.L();
                                        var24_24 = var2_2.W();
                                        var7_7 /* !! */ .F = var23_23 /* !! */  = Integer.valueOf(var24_24);
                                        var23_23 /* !! */  = var2_2.K();
                                        var7_7 /* !! */ .u = var23_23 /* !! */ ;
                                        var22_22 = var5_5.replaceMacros((com.jio.jioads.util.k)var7_7 /* !! */ );
                                        break block12;
                                        break;
                                    }
                                }
                                var16_16 = var6_6;
                                var25_25 = var9_9;
                                var9_9 = null;
                            }
                            if (var22_22 != null) {
                                var12_12.add(var22_22);
                            }
                            ++var21_21;
                            var4_4 /* !! */  = var15_15;
                            var6_6 = var16_16;
                            var9_9 = var25_25;
                            var7_7 /* !! */  = null;
                        }
                        var15_15 = var4_4 /* !! */ ;
                        var16_16 = var6_6;
                        var9_9 = null;
                        var10_10.put(var11_11, var12_12);
                        break block18;
                    }
                    var15_15 = var4_4 /* !! */ ;
                    var16_16 = var6_6;
                    var9_9 = null;
                }
                var4_4 /* !! */  = var15_15;
                var6_6 = var16_16;
                var7_7 /* !! */  = null;
            }
        }
        return;
        catch (Exception v0) {
            ** continue;
        }
    }
}

