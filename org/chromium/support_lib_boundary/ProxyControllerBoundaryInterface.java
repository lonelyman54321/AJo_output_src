/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

public interface ProxyControllerBoundaryInterface {
    public void clearProxyOverride(Runnable var1, Executor var2);

    public void setProxyOverride(String[][] var1, String[] var2, Runnable var3, Executor var4);

    public void setProxyOverride(String[][] var1, String[] var2, Runnable var3, Executor var4, boolean var5);
}

