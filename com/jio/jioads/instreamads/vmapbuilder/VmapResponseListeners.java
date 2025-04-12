/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vmapbuilder;

import com.jio.jioads.adinterfaces.JioAdError;

public interface VmapResponseListeners {
    public void onVmapErrorReceived(JioAdError var1);

    public void onVmapResponseReceived(Object var1, boolean var2);
}

