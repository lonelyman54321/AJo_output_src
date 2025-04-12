/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;

public interface WebMessageBoundaryInterface
extends FeatureFlagHolderBoundaryInterface {
    public String getData();

    public InvocationHandler getMessagePayload();

    public InvocationHandler[] getPorts();
}

