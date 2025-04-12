/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.link;

import com.affise.attribution.modules.AffiseModuleApi;
import com.affise.attribution.modules.link.AffiseLinkCallback;

public interface AffiseLinkApi
extends AffiseModuleApi {
    public void linkResolve(String var1, AffiseLinkCallback var2);
}

