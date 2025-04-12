/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.jio.jioads.jioreel.adDetection;

import android.os.Handler;
import android.os.Looper;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.instreamads.vastparser.model.c;
import com.jio.jioads.instreamads.vastparser.model.e;
import com.jio.jioads.instreamads.vastparser.model.h;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.jioreel.adDetection.HLSAdDetector$task$1;
import com.jio.jioads.jioreel.adDetection.k;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.jioreel.vast.interfaces.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class f
implements a {
    public final /* synthetic */ k a;
    public final /* synthetic */ String b;

    public f(k k2, String string2) {
        this.a = k2;
        this.b = string2;
    }

    public final void a(m object) {
        int n3;
        int n4;
        HLSAdDetector$task$1 hLSAdDetector$task$1 = null;
        Object object2 = object != null ? object.c : null;
        k k2 = this.a;
        k2.D = object2;
        object2 = new StringBuilder("VastAds size for vastUrl ");
        Object object3 = this.b;
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(" is ");
        object3 = k2.D;
        if (object3 != null) {
            n4 = object3.size();
            object3 = n4;
        } else {
            n4 = 0;
            object3 = null;
        }
        ((StringBuilder)object2).append(object3);
        object2 = ((StringBuilder)object2).toString();
        object3 = "message";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = k2.D;
        if (object2 != null) {
            boolean bl2;
            object2 = object2.iterator();
            while (bl2 = object2.hasNext()) {
                int n7;
                Iterator iterator;
                Object object4;
                char c2;
                int n8;
                Object object5;
                j j3 = (j)object2.next();
                if (j3 != null && (object5 = j3.n) != null) {
                    object5 = ((e)object5).i;
                } else {
                    n8 = 0;
                    object5 = null;
                }
                if (object5 != null) {
                    object5 = j3.n;
                    if (object5 != null && (object5 = ((e)object5).i) != null) {
                        n8 = object5.size();
                        object5 = n8;
                    } else {
                        n8 = 0;
                        object5 = null;
                    }
                    Intrinsics.checkNotNull(object5);
                    n8 = (Integer)object5;
                    if (n8 > 0) {
                        object5 = j3.n;
                        if (object5 != null && (object5 = ((e)object5).i) != null) {
                            object5 = object5.iterator();
                            while (true) {
                                c2 = (char)(object5.hasNext() ? 1 : 0);
                                object4 = k2.N;
                                if (c2 == '\u0000') break;
                                iterator = (h)object5.next();
                                if (object4 == null) continue;
                                String string2 = j3.h;
                                if (string2 == null) {
                                    string2 = "";
                                }
                                iterator = (h)((Object)((HashMap)object4).put(string2, iterator));
                            }
                            Intrinsics.checkNotNull(object4);
                            object5 = "omVerificationData";
                            Intrinsics.checkNotNullParameter(object4, (String)object5);
                            l_0.a = object4;
                        }
                        iterator = Looper.getMainLooper();
                        object5 = new Handler((Looper)iterator);
                        n7 = 1;
                        iterator = new Iterator(k2, n7);
                        object5.post((Runnable)((Object)iterator));
                    }
                }
                iterator = "VastAd info: ";
                object5 = new StringBuilder((String)((Object)iterator));
                if (j3 != null) {
                    iterator = j3.h;
                } else {
                    c2 = '\u0000';
                    iterator = null;
                }
                ((StringBuilder)object5).append((String)((Object)iterator));
                c2 = ' ';
                ((StringBuilder)object5).append(c2);
                if (j3 != null && (iterator = j3.n) != null) {
                    iterator = ((e)((Object)iterator)).c;
                } else {
                    c2 = '\u0000';
                    iterator = null;
                }
                object4 = "  ";
                j_0.k(object5, (String)((Object)iterator), (String)object4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object5 = JioAds$LogLevel.NONE;
                object5 = p.t;
                if (object5 != null && (object5 = ((p)object5).a()) != null) {
                    ((com.jio.jioads.jioreel.vast.a)object5).h(j3, (m)object);
                }
                if ((object5 = p.t) != null && (object5 = ((p)object5).a()) != null) {
                    ((com.jio.jioads.jioreel.vast.a)object5).f(j3, (m)object);
                }
                if ((object5 = p.t) != null && (object5 = ((p)object5).a()) != null) {
                    ((com.jio.jioads.jioreel.vast.a)object5).g(j3, (m)object);
                }
                if ((object5 = p.t) != null && (object5 = ((p)object5).a()) != null) {
                    ((com.jio.jioads.jioreel.vast.a)object5).e(j3);
                }
                if (j3 == null || (c2 = (char)(CollectionsKt.F((Iterable)(object5 = k2.d), iterator = j3.h) ? 1 : 0)) != '\u0000' || (iterator = j3.n) == null || (iterator = ((e)((Object)iterator)).g) == null) continue;
                iterator = iterator.iterator();
                while ((n7 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    object4 = ((c)iterator.next()).d;
                    if (object4 == null || (n7 = (int)(object4.isEmpty() ? 1 : 0)) != 0) continue;
                    object4 = j3.h;
                    Intrinsics.checkNotNull(object4);
                    ((ArrayList)object5).add(object4);
                }
            }
        }
        if ((n3 = k2.E) == 0) {
            Intrinsics.checkNotNullParameter("Inside detectAd", (String)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            n3 = (int)(k2.G ? 1 : 0);
            if (n3 == 0) {
                k2.f();
                object = k2.c;
                if (object != null) {
                    hLSAdDetector$task$1 = k2.O;
                    object.post(hLSAdDetector$task$1);
                }
            }
        }
    }
}

