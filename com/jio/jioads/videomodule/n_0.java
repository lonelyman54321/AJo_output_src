/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.videomodule;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.videomodule.player.k;
import com.jio.jioads.videomodule.s;
import com.jio.jioads.videomodule.s_0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from com.jio.jioads.videomodule.N
 */
public final class n_0
extends Lambda
implements Function0 {
    public final /* synthetic */ s c;
    public final /* synthetic */ boolean d;

    public n_0(s s7, boolean bl2) {
        this.c = s7;
        this.d = bl2;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke() {
        Object object4 = this.c;
        boolean bl2 = ((s)object4).c;
        boolean bl3 = false;
        Object object = null;
        if (bl2) {
            Object object2;
            object4 = new StringBuilder();
            Object object3 = this.c;
            String string2 = ": updating exo playlist";
            l_0.e((s)object3, (StringBuilder)object4, string2);
            object4 = JioAds.Companion;
            ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            object3 = this.c;
            boolean bl4 = this.d;
            ((s)object3).k();
            int n3 = ((s)object3).U();
            if (n3 <= 0) return Unit.a;
            Object object5 = ((s)object3).g;
            if (object5 != null) {
                object = ((s)object3).b;
                object2 = ((s)object3).O;
                object = ((m)object).d((Context)object5, (ArrayList)object2);
            }
            object5 = new StringBuilder();
            object2 = ((s)object3).R();
            ((StringBuilder)object5).append((String)object2);
            object2 = ": updating playlist currentVideoCount: ";
            ((StringBuilder)object5).append((String)object2);
            ((StringBuilder)object5).append(n3);
            ((StringBuilder)object5).append(", size: ");
            n3 = l_0.a(((s)object3).O);
            ((StringBuilder)object5).append(n3);
            String string3 = ((StringBuilder)object5).toString();
            object5 = "message";
            Intrinsics.checkNotNullParameter(string3, (String)object5);
            ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = ((s)object3).t;
            if (object4 == null) return Unit.a;
            object4.d((ArrayList)object, bl4);
            return Unit.a;
        }
        object4 = new StringBuilder();
        Object object6 = this.c;
        Object string2 = ": updating media player ";
        b.d((s)object6, (StringBuilder)object4, (String)string2);
        int n4 = this.c.o;
        ((StringBuilder)object4).append(n4 != 0);
        ((StringBuilder)object4).append(' ');
        n4 = this.c.M;
        ((StringBuilder)object4).append(n4 != 0);
        Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), "message");
        object4 = JioAds.Companion;
        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object6 = JioAds$LogLevel.NONE;
        object6 = this.c;
        synchronized (object6) {
            string2 = new s_0((s)object6);
            com.jio.jioads.util.s.d((Function0)string2);
        }
        object6 = this.c;
        boolean bl5 = ((s)object6).o;
        if (!bl5 && !(bl5 = ((s)object6).M)) {
            ((s)object6).n();
            return Unit.a;
        }
        n4 = ((s)object6).c();
        if (n4 != 0) {
            object4 = this.c;
            n4 = ((s)object4).M;
            if (n4 != 0) return Unit.a;
            n4 = ((s)object4).v;
            if (n4 != 0) {
                n4 = ((s)object4).w;
                if (n4 != 0) return Unit.a;
            }
            ((s)object4).B(null);
            return Unit.a;
        }
        object6 = this.c;
        bl5 = ((s)object6).M;
        if (!bl5) {
            try {
                ((s)object6).B(null);
                return Unit.a;
            }
            catch (Exception exception) {
                return Unit.a;
            }
        }
        string2 = ((s)object6).X;
        object6 = ((s)object6).t;
        n4 = Intrinsics.areEqual(string2, object6);
        if (n4 != 0) {
            object6 = this.c.u;
            if (object6 != null) {
                object = ((k)object6).d();
            }
        } else {
            object6 = this.c.t;
            if (object6 != null) {
                object = object6.d();
            }
        }
        if (object == null) return Unit.a;
        n4 = ((String)object).length();
        if (n4 == 0) {
            return Unit.a;
        }
        Intrinsics.checkNotNullParameter(object, "<this>");
        object6 = "http://";
        bl5 = false;
        string2 = null;
        n4 = (int)(kotlin.text.b.s((String)object, (String)object6, false) ? 1 : 0);
        if (n4 == 0) {
            object6 = "https://";
            bl3 = kotlin.text.b.s((String)object, (String)object6, false);
            if (!bl3) return Unit.a;
        }
        object = this.c;
        object6 = ((s)object).g;
        if (object6 == null) return Unit.a;
        m string3 = ((s)object).b;
        object = ((s)object).O;
        int n7 = 1;
        if ((object = string3.b((Context)object6, n7, (ArrayList)object)) == null) {
            return Unit.a;
        }
        Intrinsics.checkNotNullParameter(object, "<this>");
        object6 = "http://";
        n4 = (int)(kotlin.text.b.s((String)object, (String)object6, false) ? 1 : 0);
        if (n4 != 0) return Unit.a;
        object6 = "https://";
        n4 = (int)(kotlin.text.b.s((String)object, (String)object6, false) ? 1 : 0);
        if (n4 != 0) {
            return Unit.a;
        }
        object6 = new StringBuilder();
        string2 = this.c.R();
        ((StringBuilder)object6).append((String)string2);
        ((StringBuilder)object6).append(": updating media player with cached path: ");
        ((StringBuilder)object6).append((String)object);
        object6 = ((StringBuilder)object6).toString();
        string2 = "message";
        Intrinsics.checkNotNullParameter(object6, (String)string2);
        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = this.c;
        ((s)object4).B((String)object);
        return Unit.a;
    }
}

