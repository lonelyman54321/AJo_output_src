/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.handler;

import java.util.HashMap;
import java.util.List;

public interface OnGAEventHandlerListener {
    public void pushEEBannerImpression(String var1, HashMap var2, String var3, String var4, String var5, String var6, String var7, boolean var8, boolean var9, String var10);

    public void pushEEFleekImpressions(List var1, String var2, String var3, String var4, String var5);

    public void pushEEProductImpression(List var1, String var2, String var3, String var4, String var5, boolean var6, String var7, String var8, String var9, String var10, String var11, String var12, String var13, String var14, String var15);
}

