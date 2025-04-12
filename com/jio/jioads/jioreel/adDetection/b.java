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
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.instreamads.vastparser.model.e;
import com.jio.jioads.instreamads.vastparser.model.h;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.jioreel.adDetection.a;
import com.jio.jioads.jioreel.adDetection.c;
import com.jio.jioads.jioreel.ssai.f;
import com.jio.jioads.jioreel.ssai.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class b
implements com.jio.jioads.jioreel.vast.interfaces.a {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ c b;
    public final /* synthetic */ com.jio.jioads.jioreel.data.dash.a c;

    public b(Ref$ObjectRef ref$ObjectRef, c c2, com.jio.jioads.jioreel.data.dash.a a2) {
        this.a = ref$ObjectRef;
        this.b = c2;
        this.c = a2;
    }

    public final void a(m object) {
        boolean bl2;
        int n3;
        int n4;
        Object object2;
        Object object3 = new StringBuilder("VastAds size for vastUrl ");
        Iterator iterator = (String)this.a.element;
        ((StringBuilder)object3).append((String)((Object)iterator));
        ((StringBuilder)object3).append(" is ");
        char c2 = '\u0000';
        iterator = null;
        if (object != null && (object2 = ((m)object).c) != null) {
            n4 = object2.size();
            object2 = n4;
        } else {
            n4 = 0;
            object2 = null;
        }
        ((StringBuilder)object3).append(object2);
        object3 = ((StringBuilder)object3).toString();
        object2 = "message";
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = this.b;
        Object object4 = ((c)object3).l;
        Object object5 = this.c;
        ((ArrayList)object4).add(object5);
        if (object != null && (object4 = ((m)object).c) != null && (object4 = (j)object4.get(n3 = ((c)object3).p)) != null) {
            Object object6;
            int n7;
            Object object7 = ((m)object).c;
            n3 = object7.size();
            if (n3 == (n7 = ((c)object3).p + 1)) {
                n3 = 0;
                object7 = null;
                ((c)object3).p = 0;
            } else {
                ((c)object3).p = n7;
            }
            object7 = ((m)object).c;
            n7 = ((c)object3).p;
            object7 = object7.get(n7);
            Intrinsics.checkNotNull(object7);
            object7 = ((j)object7).n;
            if (object7 != null) {
                object7 = ((e)object7).i;
            } else {
                n3 = 0;
                object7 = null;
            }
            if (object7 != null) {
                object7 = ((m)object).c;
                n7 = ((c)object3).p;
                object7 = object7.get(n7);
                Intrinsics.checkNotNull(object7);
                object7 = ((j)object7).n;
                if (object7 != null && (object7 = ((e)object7).i) != null) {
                    n3 = object7.size();
                    object7 = n3;
                } else {
                    n3 = 0;
                    object7 = null;
                }
                Intrinsics.checkNotNull(object7);
                n3 = (Integer)object7;
                if (n3 > 0) {
                    object7 = ((m)object).c;
                    n7 = ((c)object3).p;
                    object7 = object7.get(n7);
                    Intrinsics.checkNotNull(object7);
                    object7 = ((j)object7).n;
                    if (object7 != null && (object7 = ((e)object7).i) != null) {
                        HashMap hashMap;
                        object7 = object7.iterator();
                        while (true) {
                            n7 = (int)(object7.hasNext() ? 1 : 0);
                            hashMap = ((c)object3).w;
                            if (n7 == 0) break;
                            object6 = (h)object7.next();
                            if (hashMap == null) continue;
                            Object object8 = ((m)object).c;
                            Intrinsics.checkNotNull(object8);
                            int n8 = ((c)object3).p;
                            object8 = object8.get(n8);
                            Intrinsics.checkNotNull(object8);
                            object8 = ((j)object8).h;
                            if (object8 == null) {
                                object8 = "";
                            }
                            object6 = (h)hashMap.put(object8, object6);
                        }
                        Intrinsics.checkNotNull(hashMap);
                        object7 = "omVerificationData";
                        Intrinsics.checkNotNullParameter(hashMap, (String)object7);
                        l_0.a = hashMap;
                    }
                    object6 = Looper.getMainLooper();
                    object7 = new Handler((Looper)object6);
                    object6 = new a((c)object3);
                    object7.post((Runnable)object6);
                }
            }
            object7 = new StringBuilder("VastAd info: ");
            object6 = ((j)object4).n;
            if (object6 != null) {
                iterator = ((e)object6).c;
            }
            ((StringBuilder)object7).append((String)((Object)iterator));
            c2 = ' ';
            ((StringBuilder)object7).append(c2);
            Intrinsics.checkNotNullParameter(((StringBuilder)object7).toString(), (String)object2);
            iterator = JioAds.Companion;
            ((JioAds$Companion)((Object)iterator)).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object7 = JioAds$LogLevel.NONE;
            object7 = ((c)object3).q;
            object6 = ((com.jio.jioads.jioreel.data.dash.a)object5).a;
            object7.put(object6, object4);
            object6 = "period id after parse : ";
            object7 = new StringBuilder((String)object6);
            object5 = ((com.jio.jioads.jioreel.data.dash.a)object5).a;
            d90_0.b((StringBuilder)object7, (String)object5, (String)object2, (JioAds$Companion)((Object)iterator));
            iterator = p.t;
            if (iterator != null && (iterator = ((p)((Object)iterator)).a()) != null) {
                ((com.jio.jioads.jioreel.vast.a)((Object)iterator)).h((j)object4, (m)object);
            }
            if ((iterator = p.t) != null && (iterator = ((p)((Object)iterator)).a()) != null) {
                ((com.jio.jioads.jioreel.vast.a)((Object)iterator)).f((j)object4, (m)object);
            }
            if ((iterator = p.t) != null && (iterator = ((p)((Object)iterator)).a()) != null) {
                ((com.jio.jioads.jioreel.vast.a)((Object)iterator)).g((j)object4, (m)object);
            }
            if ((object = p.t) != null && (object = ((p)object).a()) != null) {
                ((com.jio.jioads.jioreel.vast.a)object).e((j)object4);
            }
            if ((c2 = (char)(CollectionsKt.F((Iterable)(object = ((f)object3).d), iterator = ((j)object4).h) ? 1 : 0)) == '\u0000' && (iterator = ((j)object4).n) != null && (iterator = ((e)((Object)iterator)).g) != null) {
                iterator = iterator.iterator();
                while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    object2 = ((com.jio.jioads.instreamads.vastparser.model.c)iterator.next()).d;
                    if (object2 == null || (n4 = (int)(object2.isEmpty() ? 1 : 0)) != 0) continue;
                    object2 = ((j)object4).h;
                    Intrinsics.checkNotNull(object2);
                    ((ArrayList)object).add(object2);
                }
            }
        }
        if (!(bl2 = ((c)object3).u) && (bl2 = ((ArrayList)(object = ((c)object3).l)).isEmpty() ^ true)) {
            ((f)object3).f();
            object = ((f)object3).c;
            if (object != null) {
                object3 = ((c)object3).x;
                object.post((Runnable)object3);
            }
        }
    }
}

