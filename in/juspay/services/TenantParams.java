/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.services;

import java.util.List;

public interface TenantParams {
    public String getBaseContent();

    public String getBootLoaderEndpoint();

    public List getBridgeClasses();

    public String getTenant();
}

