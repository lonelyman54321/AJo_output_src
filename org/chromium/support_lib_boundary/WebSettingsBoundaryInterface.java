/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.support_lib_boundary;

import java.util.Map;
import java.util.Set;

public interface WebSettingsBoundaryInterface {
    public int getAttributionBehavior();

    public int getDisabledActionModeMenuItems();

    public boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    public int getForceDark();

    public int getForceDarkBehavior();

    public boolean getOffscreenPreRaster();

    public Set getRequestedWithHeaderOriginAllowList();

    public boolean getSafeBrowsingEnabled();

    public Map getUserAgentMetadataMap();

    public int getWebAuthnSupport();

    public int getWebViewMediaIntegrityApiDefaultStatus();

    public Map getWebViewMediaIntegrityApiOverrideRules();

    public boolean getWillSuppressErrorPage();

    public boolean isAlgorithmicDarkeningAllowed();

    public void setAlgorithmicDarkeningAllowed(boolean var1);

    public void setAttributionBehavior(int var1);

    public void setDisabledActionModeMenuItems(int var1);

    public void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean var1);

    public void setForceDark(int var1);

    public void setForceDarkBehavior(int var1);

    public void setOffscreenPreRaster(boolean var1);

    public void setRequestedWithHeaderOriginAllowList(Set var1);

    public void setSafeBrowsingEnabled(boolean var1);

    public void setUserAgentMetadataFromMap(Map var1);

    public void setWebAuthnSupport(int var1);

    public void setWebViewMediaIntegrityApiStatus(int var1, Map var2);

    public void setWillSuppressErrorPage(boolean var1);
}

