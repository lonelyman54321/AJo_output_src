/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.link;

import com.affise.attribution.Affise$Module;
import com.affise.attribution.modules.AffiseModules;
import com.affise.attribution.modules.link.AffiseLinkApi;
import com.affise.attribution.modules.link.AffiseLinkCallback;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseLink {
    public static final AffiseLink INSTANCE;
    private static AffiseLinkApi module;

    static {
        AffiseLink affiseLink;
        INSTANCE = affiseLink = new AffiseLink();
    }

    private AffiseLink() {
    }

    private final AffiseLinkApi getApi() {
        Object object = module;
        if (object == null) {
            object = Affise$Module.INSTANCE;
            AffiseModules affiseModules = AffiseModules.Link;
            module = object = (AffiseLinkApi)((Affise$Module)object).api$attribution_release(affiseModules);
        }
        return object;
    }

    public static final void linkResolve(String object, AffiseLinkCallback affiseLinkCallback) {
        Intrinsics.checkNotNullParameter(object, "url");
        Intrinsics.checkNotNullParameter(affiseLinkCallback, "callback");
        AffiseLinkApi affiseLinkApi = INSTANCE.getApi();
        if (affiseLinkApi != null) {
            affiseLinkApi.linkResolve((String)object, affiseLinkCallback);
            object = Unit.a;
        } else {
            object = null;
        }
        if (object == null) {
            object = "";
            affiseLinkCallback.handle((String)object);
        }
    }
}

