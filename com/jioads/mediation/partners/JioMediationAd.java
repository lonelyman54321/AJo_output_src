/*
 * Decompiled with CFR 0.152.
 */
package com.jioads.mediation.partners;

import com.jio.jioads.adinterfaces.JioAdView;
import com.jioads.mediation.partners.JioMediationListener;
import java.util.Map;

public abstract class JioMediationAd {
    public abstract void loadAd(JioAdView var1, JioMediationListener var2, Map var3, Map var4);

    public abstract void onInvalidate();

    public abstract void showAd();
}

