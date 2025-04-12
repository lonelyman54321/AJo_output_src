/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.build;

import java.util.List;

public interface BuildConfigPropertiesProvider {
    public String getCodeName();

    public String getHardware();

    public String getManufacturer();

    public String getReleaseName();

    public int getSDKVersion();

    public List getSupportedABIs();
}

