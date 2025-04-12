/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.support_lib_boundary;

import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;

public interface WebMessagePayloadBoundaryInterface
extends FeatureFlagHolderBoundaryInterface {
    public byte[] getAsArrayBuffer();

    public String getAsString();

    public int getType();
}

