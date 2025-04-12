/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.multiad;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.common.a;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.n;
import com.jio.jioads.multiad.N;
import com.jio.jioads.multiad.d_0;
import com.jio.jioads.multiad.f_0;
import com.jio.jioads.multiad.h_0;
import com.jio.jioads.multiad.j;
import com.jio.jioads.multiad.l_0;
import com.jio.jioads.multiad.model.c;
import com.jio.jioads.multiad.model.e;
import com.jio.jioads.multiad.n_0;
import com.jio.jioads.multiad.p;
import com.jio.jioads.multiad.r;
import com.jio.jioads.multiad.z;
import com.jio.jioads.util.Utility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class t {
    public static final HashMap r;
    public final String a;
    public final b b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final n g;
    public final ArrayList h;
    public final ArrayList i;
    public final LinkedHashMap j;
    public int k;
    public int l;
    public boolean m;
    public final hh3_2 n;
    public final hh3_2 o;
    public final j p;
    public z q;

    static {
        HashMap hashMap;
        r = hashMap = new HashMap();
    }

    public t(String object, b b2, String string2, boolean bl2, String string3, boolean bl3, n n3) {
        Intrinsics.checkNotNullParameter(object, "multiAdPrefKey");
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Intrinsics.checkNotNullParameter(string3, "packageName");
        Intrinsics.checkNotNullParameter(n3, "multiAdResponse");
        this.a = object;
        this.b = b2;
        this.c = string2;
        this.d = bl2;
        this.e = string3;
        this.f = bl3;
        this.g = n3;
        object = new ArrayList();
        this.h = object;
        object = new ArrayList();
        this.i = object;
        this.j = object;
        object = yr1_2.b(com.jio.jioads.multiad.p.c);
        this.n = object;
        object = yr1_2.b(com.jio.jioads.multiad.r.c);
        this.o = object;
        this.p = object = new j(this);
    }

    public final HashMap a() {
        return (HashMap)this.n.getValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(a a2, long l2, int n3, f_0 f_02, boolean bl2) {
        z z5;
        t t3 = this;
        Object object = a2;
        Intrinsics.checkNotNullParameter(a2, "adDataStore");
        boolean bl3 = bl2;
        this.m = bl2;
        Object object2 = this.b;
        Object object3 = object2.P();
        Object object4 = new StringBuilder();
        ((StringBuilder)object4).append((String)object3);
        ((StringBuilder)object4).append(": Inside getBackupAd()");
        object4 = ((StringBuilder)object4).toString();
        Object object5 = "message";
        Intrinsics.checkNotNullParameter(object4, (String)object5);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = JioAds$LogLevel.NONE;
        ArrayList arrayList = this.i;
        arrayList.clear();
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        object4 = this.c();
        boolean bl4 = ((HashMap)object4).containsKey(object3);
        if (bl4 && (object4 = (h_0)this.c().get(object3)) != null) {
            object5 = ((h_0)object4).b;
            if (object5 != null) {
                arrayList.clear();
                arrayList.addAll(object5);
            }
            if ((object4 = ((h_0)object4).a) != null) {
                arrayList2.clear();
                arrayList2.addAll(object4);
            }
        }
        if ((object4 = t3.q) != null) {
            ((z)object4).q();
        }
        HashMap hashMap = null;
        t3.q = null;
        Object object6 = this.a();
        object4 = f_02;
        Object object7 = new l_0(t3, (String)object3, f_02);
        object3 = Utility.INSTANCE;
        object4 = object2.P();
        String string2 = ((Utility)object3).getCcbValue((String)object4);
        object3 = N.a;
        boolean bl5 = N.j(object2.P());
        boolean bl6 = t3.m;
        object2 = ((a)object).c;
        Object object8 = object2 != null && (object2 = ((e)object2).b) != null ? (object2 = ((c)object2).a) : null;
        b b2 = t3.b;
        String string3 = t3.a;
        object4 = t3.c;
        boolean bl7 = t3.d;
        String string4 = t3.e;
        bl3 = t3.f;
        j j3 = t3.p;
        object2 = z5;
        object3 = object6;
        object6 = object7;
        object7 = string2;
        z z6 = z5;
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = arrayList;
        object = object8;
        z5 = new z((HashMap)object3, (String)object4, bl7, (d_0)object6, string2, false, string4, bl5, bl6, l2, n3, (String)object8, b2, a2, string3, bl3, j3);
        object2 = a2;
        object2 = a2.b;
        hashMap = object2 != null ? ((e)object2).a : null;
        object4 = z6;
        object3 = arrayList3;
        object2 = arrayList4;
        z6.o(hashMap, arrayList4, arrayList3);
        t3.q = z6;
    }

    public final HashMap c() {
        return (HashMap)this.o.getValue();
    }

    public final void d(a a2, long l2, int n3, f_0 f_02, boolean bl2) {
        z z5;
        n_0 n_02;
        t t3 = this;
        Object object = a2;
        Intrinsics.checkNotNullParameter(a2, "adDataStore");
        this.m = bl2;
        Object object2 = new StringBuilder("inside getProductionAd campaigns size: ");
        Object object3 = a2.c;
        HashMap hashMap = null;
        if (object3 != null && (object3 = ((e)object3).a) != null) {
            int bl3 = ((HashMap)object3).size();
            object3 = bl3;
        } else {
            boolean bl3 = false;
            object3 = null;
        }
        ((StringBuilder)object2).append(object3);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        Object object4 = t3.b;
        object2 = object4.P();
        Cloneable cloneable = t3.i;
        cloneable.clear();
        ArrayList arrayList = t3.h;
        arrayList.clear();
        object3 = this.c();
        boolean bl4 = ((HashMap)object3).containsKey(object2);
        if (bl4 && (object2 = (h_0)((HashMap)(object3 = this.c())).get(object2)) != null) {
            object3 = ((h_0)object2).b;
            if (object3 != null) {
                cloneable.clear();
                cloneable.addAll(object3);
            }
            if ((object2 = ((h_0)object2).a) != null) {
                arrayList.clear();
                arrayList.addAll(object2);
            }
        }
        if ((object2 = t3.q) != null) {
            ((z)object2).q();
        }
        t3.q = null;
        HashMap hashMap2 = this.a();
        object2 = n_02;
        object3 = this;
        Object object5 = a2;
        n_02 = new n_0(this, f_02, a2, l2, n3, bl2);
        object2 = Utility.INSTANCE;
        object3 = object4.P();
        object2 = ((Utility)object2).getCcbValue((String)object3);
        object3 = N.a;
        object3 = object4.P();
        boolean bl5 = N.j((String)object3);
        boolean bl6 = t3.m;
        object5 = ((a)object).c;
        Object object6 = object5 != null && (object5 = ((e)object5).b) != null ? (object5 = ((c)object5).a) : null;
        b b2 = t3.b;
        String string2 = t3.a;
        String string3 = t3.c;
        boolean bl7 = t3.d;
        z z6 = z5;
        boolean bl8 = bl7;
        ArrayList arrayList2 = arrayList;
        boolean bl9 = true;
        String string4 = t3.e;
        bl7 = t3.f;
        j j3 = t3.p;
        object4 = z5;
        object5 = cloneable;
        cloneable = hashMap2;
        hashMap = n_02;
        a a3 = object;
        object = object2;
        z5 = new z(hashMap2, string3, bl8, n_02, (String)object2, bl9, string4, bl5, bl6, l2, n3, (String)object6, b2, a2, string2, bl7, j3);
        object2 = a3.c;
        hashMap = object2 != null ? ((e)object2).a : null;
        z6.o(hashMap, (ArrayList)object5, arrayList2);
        t3.q = z6;
    }
}

