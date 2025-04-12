/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.multiad;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.d_0;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.a;
import com.jio.jioads.multiad.m_0;
import com.jio.jioads.multiad.model.c;
import com.jio.jioads.multiad.model.e;
import com.jio.jioads.multiad.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o
extends Lambda
implements Function0 {
    public final /* synthetic */ z c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ArrayList f;

    public o(z z5, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap) {
        this.c = z5;
        this.d = hashMap;
        this.e = arrayList;
        this.f = arrayList2;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke() {
        Object object;
        Object object2;
        int n3;
        String string2;
        int n4;
        String string3;
        Object object3;
        Serializable serializable;
        Object object4;
        z z5;
        block19: {
            int n7;
            z5 = this.c;
            object4 = z5.D;
            boolean bl2 = ((HashMap)object4).isEmpty();
            serializable = this.d;
            if (bl2) {
                object4 = z5.D;
                ((HashMap)object4).clear();
                if (serializable != null) {
                    ((HashMap)object4).putAll(serializable);
                }
            }
            object4 = new StringBuilder();
            object3 = z5.o;
            string3 = null;
            if (object3 != null) {
                object3 = object3.P();
            } else {
                n4 = 0;
                object3 = null;
            }
            string2 = "message";
            String string4 = ": Inside getAdDetails()";
            j_0.k((StringBuilder)object4, (String)object3, string4);
            object4 = JioAds.Companion;
            ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            n4 = z5.a(null);
            n3 = 1;
            if (n4 == n3) {
                z5.x = n3;
            }
            n4 = 0;
            object3 = null;
            try {
                object2 = z5.p;
                if (object2 != null && (object2 = ((a)object2).c) != null && (object2 = ((e)object2).b) != null) {
                    object2 = ((c)object2).o;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                if (object2 != null) {
                    object2 = new StringBuilder();
                    object = z5.o;
                    object = object != null ? object.P() : null;
                }
                break block19;
            }
            catch (Exception exception) {
                break block19;
            }
            ((StringBuilder)object2).append((String)object);
            object = ": Enable Ad category: ";
            ((StringBuilder)object2).append((String)object);
            object = z5.p;
            object = object != null && (object = ((a)object).c) != null && (object = ((e)object).b) != null ? ((c)object).o : null;
            ((StringBuilder)object2).append(object);
            object2 = ((StringBuilder)object2).toString();
            Intrinsics.checkNotNullParameter(object2, string2);
            object2 = ((JioAds$Companion)object4).getInstance();
            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = z5.p;
            if (object2 != null && (object2 = ((a)object2).c) != null && (object2 = ((e)object2).b) != null && (object2 = ((c)object2).o) != null && (n7 = ((Integer)object2).intValue()) == n3) {
                n4 = 1;
            }
        }
        z5.u = n4;
        if (serializable != null) {
            boolean bl3 = z5.g;
            if (bl3) {
                serializable = new StringBuilder();
                object3 = z5.o;
                if (object3 != null) {
                    string3 = object3.P();
                }
                object3 = ": PGM set to be skipped";
                d_0.a((StringBuilder)serializable, string3, (String)object3, (JioAds$Companion)object4);
                z5.t = n3;
            }
            object2 = this.c;
            ArrayList arrayList = this.f;
            ArrayList arrayList2 = this.e;
            HashMap hashMap = this.d;
            m_0 m_02 = new m_0((z)object2, arrayList, arrayList2, hashMap);
            object = "cpd";
            ((z)object2).m((String)object, hashMap, arrayList2, arrayList, m_02);
            return Unit.a;
        }
        serializable = new StringBuilder();
        object3 = z5.o;
        if (object3 != null) {
            object3 = object3.P();
        } else {
            n4 = 0;
            object3 = null;
        }
        ((StringBuilder)serializable).append((String)object3);
        ((StringBuilder)serializable).append(": No campaigns available to select for adspot id ");
        object3 = z5.o;
        if (object3 != null) {
            object3 = object3.P();
        } else {
            n4 = 0;
            object3 = null;
        }
        d90_0.b((StringBuilder)serializable, (String)object3, string2, (JioAds$Companion)object4);
        z5.h(null, null, null, null);
        return Unit.a;
    }
}

