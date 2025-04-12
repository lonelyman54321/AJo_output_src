/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 */
package com.jio.jioads.interstitial;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.interstitial.I;
import com.jio.jioads.interstitial.InterstitialAdController;
import com.jio.jioads.interstitial.InterstitialAdController$a;
import com.jio.jioads.interstitial.h_0;
import com.jio.jioads.videomodule.s;
import java.util.HashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/*
 * Renamed from com.jio.jioads.interstitial.J
 */
public final class j_0
extends Lambda
implements Function0 {
    public final /* synthetic */ InterstitialAdController c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ m f;

    public j_0(InterstitialAdController interstitialAdController, Context context, Map map2, m m2) {
        this.c = interstitialAdController;
        this.d = context;
        this.e = map2;
        this.f = m2;
        super(0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke() {
        String string2;
        void var11_23;
        int n3;
        int n4;
        int n7;
        int n8;
        j_0 j_02 = this;
        Object object = this.c;
        Object object2 = InterstitialAdController.access$getJioVideoView$p((InterstitialAdController)object);
        if (object2 != null) {
            return Unit.a;
        }
        object2 = ((InterstitialAdController)object).getIJioAdView();
        int n10 = 0;
        Object object3 = null;
        if (object2 != null) {
            object2 = object2.H();
        } else {
            n8 = 0;
            object2 = null;
        }
        int n14 = -1;
        if (object2 == null) {
            n7 = -1;
        } else {
            int[] nArray = I.$EnumSwitchMapping$0;
            n4 = ((Enum)object2).ordinal();
            n7 = nArray[n4];
        }
        Context context = j_02.d;
        int n15 = 2;
        int n16 = 1;
        if (n7 != n14) {
            if (n7 != n16) {
                if (n7 != n15) {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
                n7 = InterstitialAdController.access$getVastLandscapeLayoutId$p((InterstitialAdController)object);
            } else {
                n7 = InterstitialAdController.access$getVastPortraitLayoutId$p((InterstitialAdController)object);
            }
        } else {
            void var9_15;
            Configuration configuration;
            Resources resources;
            if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
                n7 = configuration.orientation;
                Integer n17 = n7;
            } else {
                n7 = 0;
                Object var9_14 = null;
            }
            n7 = var9_15 != null && (n3 = var9_15.intValue()) == n16 ? InterstitialAdController.access$getVastPortraitLayoutId$p((InterstitialAdController)object) : (var9_15 != null && (n7 = var9_15.intValue()) == n15 ? InterstitialAdController.access$getVastLandscapeLayoutId$p((InterstitialAdController)object) : InterstitialAdController.access$getVastPortraitLayoutId$p((InterstitialAdController)object));
        }
        n3 = InterstitialAdController.access$getDefaultVastLayout((InterstitialAdController)object);
        if (n7 != n14) {
            n8 = n3;
        } else {
            if (object2 == null) {
                n8 = -1;
            } else {
                int[] nArray = I.$EnumSwitchMapping$0;
                n8 = ((Enum)object2).ordinal();
                n8 = nArray[n8];
            }
            if (n8 != n14) {
                if (n8 != n16) {
                    if (n8 != n15) {
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    n8 = InterstitialAdController.access$getDefaultVastLayoutLand((InterstitialAdController)object);
                } else {
                    n8 = InterstitialAdController.access$getDefaultVastLayout((InterstitialAdController)object);
                }
            } else {
                if (context != null && (object2 = context.getResources()) != null && (object2 = object2.getConfiguration()) != null) {
                    n8 = ((Configuration)object2).orientation;
                    object2 = n8;
                } else {
                    n8 = 0;
                    object2 = null;
                }
                n8 = object2 != null && (n14 = ((Integer)object2).intValue()) == n16 ? InterstitialAdController.access$getDefaultVastLayout((InterstitialAdController)object) : (object2 != null && (n8 = ((Integer)object2).intValue()) == n15 ? InterstitialAdController.access$getDefaultVastLayoutLand((InterstitialAdController)object) : InterstitialAdController.access$getDefaultVastLayout((InterstitialAdController)object));
            }
            n7 = n8;
            n8 = (int)(com.jio.jioads.adinterfaces.j_0.l(context) ? 1 : 0);
            if (n8 != 0) {
                n8 = InterstitialAdController.access$getDefaultVastLayoutForSTB((InterstitialAdController)object);
                int n18 = n7;
                n7 = n8;
                n8 = n18;
            } else {
                n8 = n7;
            }
        }
        Object object4 = ((InterstitialAdController)object).getJioAdCallbacks();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.RECEIVED;
        ((V)object4).e(jioAdView$AdState);
        ((V)((InterstitialAdController)object).getJioAdCallbacks()).o();
        Map map2 = j_02.e;
        if (map2 == null) {
            HashMap hashMap = new HashMap();
        }
        HashMap hashMap = new HashMap(var11_23);
        boolean bl2 = InterstitialAdController.access$isExoPlayerEnabled((InterstitialAdController)object);
        b b2 = ((InterstitialAdController)object).getIJioAdView();
        c c2 = ((InterstitialAdController)object).getIJioAdViewController();
        m m2 = j_02.f;
        object4 = new s(hashMap, m2, n7, bl2, b2, c2, null);
        InterstitialAdController$a interstitialAdController$a = InterstitialAdController.access$getVideoViewListener$p((InterstitialAdController)object);
        ((s)object4).z = interstitialAdController$a;
        ((s)object4).b0 = string2 = ((InterstitialAdController)object).getIJioAdView().d();
        com.jio.jioads.videomodule.config.b b3 = ((s)object4).h0();
        if (string2 != null) {
            object3 = ((Object)StringsKt.m0(string2)).toString();
        }
        n4 = 0;
        Object var11_26 = null;
        if (object3 != null && (n10 = ((String)object3).length()) != 0) {
            n10 = 0;
            object3 = null;
        } else {
            n10 = 1;
        }
        b3.e = n10 ^= n16;
        InterstitialAdController.access$initConfiguration((InterstitialAdController)object, (s)object4);
        if (n7 != n8) {
            n16 = 0;
        }
        Intrinsics.checkNotNullParameter(object4, "<this>");
        ((s)object4).g0().v = n16;
        InterstitialAdController.access$setJioVideoView$p((InterstitialAdController)object, (s)object4);
        object2 = InterstitialAdController.access$getJioVideoView$p((InterstitialAdController)object);
        if (object2 != null) {
            ((s)object2).h();
        }
        if ((object2 = InterstitialAdController.access$getJioVideoView$p((InterstitialAdController)object)) == null) {
            return Unit.a;
        }
        ((s)object2).r = object3 = new h_0((InterstitialAdController)object);
        return Unit.a;
    }
}

