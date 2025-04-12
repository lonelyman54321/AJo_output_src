/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.init;

import com.affise.attribution.init.AffiseInitProperties;

public interface InitPropertiesStorage {
    public AffiseInitProperties getProperties();

    public void setProperties(AffiseInitProperties var1);

    public void updateSecretKey(String var1);
}

