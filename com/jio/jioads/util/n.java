/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup
 */
package com.jio.jioads.util;

import android.content.Context;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$ORIENTATION_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$VideoAdType;
import com.jio.jioads.adinterfaces.JioAdView$VideoPlayerViewType;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.a;
import com.jio.jioads.controller.o;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class n
implements b {
    public boolean a;
    public boolean b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;
    public final /* synthetic */ List e;

    public n(Context context, String string2, List list) {
        this.c = context;
        this.d = string2;
        this.e = list;
    }

    public final ViewGroup A() {
        return null;
    }

    public final Integer B() {
        return null;
    }

    public final HashMap C() {
        return null;
    }

    public final boolean D() {
        return false;
    }

    public final JioAdView$VideoAdType E() {
        return null;
    }

    public final boolean F() {
        return false;
    }

    public final String G() {
        return null;
    }

    public final JioAdView$ORIENTATION_TYPE H() {
        return null;
    }

    public final Integer I() {
        return null;
    }

    public final Integer J() {
        return null;
    }

    public final JioAdView$AD_TYPE K() {
        return JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
    }

    public final JioAdView$AdPodVariant L() {
        return JioAdView$AdPodVariant.NONE;
    }

    public final JioAdListener M() {
        return null;
    }

    public final boolean N() {
        return false;
    }

    public final Boolean O() {
        return Boolean.TRUE;
    }

    public final String P() {
        return this.d;
    }

    public final int[] Q() {
        return null;
    }

    public final JioAdsMetadata R() {
        return null;
    }

    public final boolean S() {
        return false;
    }

    public final Integer T() {
        return null;
    }

    public final void U() {
        this.a = true;
    }

    public final Integer V() {
        return null;
    }

    public final int W() {
        return -1;
    }

    public final boolean X() {
        return false;
    }

    public final Context Y() {
        return this.c;
    }

    public final void Z(int n3) {
    }

    public final List a() {
        return this.e;
    }

    public final void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "nativeAdClickUrl");
    }

    public final void a(boolean bl2) {
    }

    public final Object[] a0() {
        return null;
    }

    public final void b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "nativeUrl");
    }

    public final int[] b() {
        return null;
    }

    public final Integer b0() {
        return null;
    }

    public final void c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "title");
    }

    public final boolean c() {
        return false;
    }

    public final Integer c0() {
        return null;
    }

    public final String d() {
        return null;
    }

    public final void d(String string2) {
        Intrinsics.checkNotNullParameter(string2, "ctaText");
    }

    public final JioAdView$VideoPlayerViewType d0() {
        return null;
    }

    public final void e(String string2) {
        Intrinsics.checkNotNullParameter(string2, "cTABrandPage");
    }

    public final boolean e() {
        return this.b;
    }

    public final void e0(int[] nArray) {
        Intrinsics.checkNotNullParameter(nArray, "array");
    }

    public final int f() {
        return 30;
    }

    public final boolean f0() {
        return false;
    }

    public final int g() {
        return 20;
    }

    public final boolean g0() {
        return false;
    }

    public final void h(long l2) {
    }

    public final a h0() {
        return null;
    }

    public final int i() {
        return -1;
    }

    public final void i(boolean bl2) {
    }

    public final boolean i0() {
        return false;
    }

    public final void j(JioAdView$AdState jioAdView$AdState) {
        Intrinsics.checkNotNullParameter((Object)jioAdView$AdState, "adState");
    }

    public final int j0() {
        return -1;
    }

    public final int k() {
        return 0;
    }

    public final JioAdView$AdState k0() {
        return null;
    }

    public final boolean l() {
        return false;
    }

    public final ViewGroup l0() {
        return null;
    }

    public final boolean m() {
        return this.a;
    }

    public final String m0() {
        return null;
    }

    public final JioAdView n() {
        return null;
    }

    public final Boolean n0() {
        return null;
    }

    public final void o() {
        this.b = true;
    }

    public final int o0() {
        return 5;
    }

    public final boolean p() {
        return false;
    }

    public final boolean p0() {
        return false;
    }

    public final Integer q() {
        return null;
    }

    public final String q0() {
        return null;
    }

    public final JioAds$MediaType r() {
        return null;
    }

    public final int s() {
        return -1;
    }

    public final void t() {
    }

    public final boolean u() {
        return false;
    }

    public final boolean v() {
        return false;
    }

    public final int w() {
        return 20;
    }

    public final int x() {
        return 0;
    }

    public final Boolean y() {
        return null;
    }

    public final o z() {
        return null;
    }
}

