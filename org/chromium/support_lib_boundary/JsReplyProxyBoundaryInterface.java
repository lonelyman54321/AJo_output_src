/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.IsomorphicObjectBoundaryInterface;

public interface JsReplyProxyBoundaryInterface
extends IsomorphicObjectBoundaryInterface {
    public void postMessage(String var1);

    public void postMessageWithPayload(InvocationHandler var1);
}

