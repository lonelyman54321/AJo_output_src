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
import com.jio.jioads.instreamads.vastparser.model.h;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.jioreel.adDetection.k;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.jioreel.vast.interfaces.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class e
implements a {
    public final /* synthetic */ k a;

    public e(k k2) {
        this.a = k2;
    }

    public final void a(m m2) {
        Object object = m2 != null ? m2.c : null;
        k k2 = this.a;
        k2.D = object;
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                Iterator iterator;
                Object object2;
                char c2;
                int n3;
                Object object3;
                j j3 = (j)object.next();
                if (j3 != null && (object3 = j3.n) != null) {
                    object3 = ((com.jio.jioads.instreamads.vastparser.model.e)object3).i;
                } else {
                    n3 = 0;
                    object3 = null;
                }
                if (object3 != null) {
                    object3 = j3.n;
                    if (object3 != null && (object3 = ((com.jio.jioads.instreamads.vastparser.model.e)object3).i) != null) {
                        n3 = object3.size();
                        object3 = n3;
                    } else {
                        n3 = 0;
                        object3 = null;
                    }
                    Intrinsics.checkNotNull(object3);
                    n3 = (Integer)object3;
                    if (n3 > 0) {
                        object3 = j3.n;
                        if (object3 != null && (object3 = ((com.jio.jioads.instreamads.vastparser.model.e)object3).i) != null) {
                            object3 = object3.iterator();
                            while (true) {
                                c2 = (char)(object3.hasNext() ? 1 : 0);
                                object2 = k2.N;
                                if (c2 == '\u0000') break;
                                iterator = (h)object3.next();
                                if (object2 == null) continue;
                                String string2 = j3.h;
                                if (string2 == null) {
                                    string2 = "";
                                }
                                iterator = (h)((Object)((HashMap)object2).put(string2, iterator));
                            }
                            Intrinsics.checkNotNull(object2);
                            object3 = "omVerificationData";
                            Intrinsics.checkNotNullParameter(object2, (String)object3);
                            l_0.a = object2;
                        }
                        iterator = Looper.getMainLooper();
                        object3 = new Handler((Looper)iterator);
                        iterator = new Iterator(k2);
                        object3.post((Runnable)((Object)iterator));
                    }
                }
                iterator = "VastAd info: ";
                object3 = new StringBuilder((String)((Object)iterator));
                if (j3 != null) {
                    iterator = j3.h;
                } else {
                    c2 = '\u0000';
                    iterator = null;
                }
                ((StringBuilder)object3).append((String)((Object)iterator));
                c2 = ' ';
                ((StringBuilder)object3).append(c2);
                if (j3 != null && (iterator = j3.n) != null) {
                    iterator = ((com.jio.jioads.instreamads.vastparser.model.e)((Object)iterator)).c;
                } else {
                    c2 = '\u0000';
                    iterator = null;
                }
                object2 = "  ";
                j_0.k(object3, (String)((Object)iterator), (String)object2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                object3 = p.t;
                if (object3 != null && (object3 = ((p)object3).a()) != null) {
                    ((com.jio.jioads.jioreel.vast.a)object3).h(j3, m2);
                }
                if ((object3 = p.t) != null && (object3 = ((p)object3).a()) != null) {
                    ((com.jio.jioads.jioreel.vast.a)object3).f(j3, m2);
                }
                if ((object3 = p.t) != null && (object3 = ((p)object3).a()) != null) {
                    ((com.jio.jioads.jioreel.vast.a)object3).g(j3, m2);
                }
                if ((object3 = p.t) != null && (object3 = ((p)object3).a()) != null) {
                    ((com.jio.jioads.jioreel.vast.a)object3).e(j3);
                }
                if (j3 == null || (c2 = (char)(CollectionsKt.F((Iterable)(object3 = k2.d), iterator = j3.h) ? 1 : 0)) != '\u0000' || (iterator = j3.n) == null || (iterator = ((com.jio.jioads.instreamads.vastparser.model.e)((Object)iterator)).g) == null) continue;
                iterator = iterator.iterator();
                while (bl3 = iterator.hasNext()) {
                    object2 = ((c)iterator.next()).d;
                    if (object2 == null || (bl3 = object2.isEmpty())) continue;
                    object2 = j3.h;
                    Intrinsics.checkNotNull(object2);
                    ((ArrayList)object3).add(object2);
                }
            }
        }
    }
}

