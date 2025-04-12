/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.iab.omid.library.ril.adsession.Partner
 */
package com.jio.jioads.iab;

import com.iab.omid.library.ril.adsession.Partner;
import com.jio.jioads.utils.Constants$SDKVersion;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g
extends Lambda
implements Function0 {
    public static final g c;

    static {
        g g3;
        c = g3 = new Lambda(0);
    }

    public final Object invoke() {
        String string2 = Constants$SDKVersion.Companion.getLIBRARY_VERSION();
        return Partner.createPartner((String)"JioAds", (String)string2);
    }
}

