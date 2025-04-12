/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.network;

import java.util.Map;

public interface NetworkTaskListener {
    public void onError(int var1, Object var2, Map var3);

    public void onSuccess(String var1, Map var2);
}

