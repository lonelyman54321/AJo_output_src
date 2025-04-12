/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package org.chromium.support_lib_boundary;

import android.os.Handler;
import java.lang.reflect.InvocationHandler;

public interface WebMessagePortBoundaryInterface {
    public void close();

    public void postMessage(InvocationHandler var1);

    public void setWebMessageCallback(InvocationHandler var1);

    public void setWebMessageCallback(InvocationHandler var1, Handler var2);
}

