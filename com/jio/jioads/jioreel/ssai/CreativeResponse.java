/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.ssai;

import com.jio.jioads.jioreel.data.JioReelAdMetaData;

public interface CreativeResponse {
    public void onFailure(String var1, String var2);

    public void onSuccess(JioReelAdMetaData var1);
}

