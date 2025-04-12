/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.link;

import com.affise.attribution.Affise$Module;
import com.affise.attribution.modules.link.AffiseLink;
import com.affise.attribution.modules.link.AffiseLinkCallback;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseLinkKt {
    public static final void linkResolve(Affise$Module affise$Module, String string2, AffiseLinkCallback affiseLinkCallback) {
        Intrinsics.checkNotNullParameter(affise$Module, "<this>");
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(affiseLinkCallback, "callback");
        AffiseLink.linkResolve(string2, affiseLinkCallback);
    }
}

