/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.ump;

import android.app.Activity;
import com.google.android.ump.ConsentInformation$OnConsentInfoUpdateFailureListener;
import com.google.android.ump.ConsentInformation$OnConsentInfoUpdateSuccessListener;
import com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus;
import com.google.android.ump.ConsentRequestParameters;

public interface ConsentInformation {
    public boolean canRequestAds();

    public int getConsentStatus();

    public ConsentInformation$PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus();

    public boolean isConsentFormAvailable();

    public void requestConsentInfoUpdate(Activity var1, ConsentRequestParameters var2, ConsentInformation$OnConsentInfoUpdateSuccessListener var3, ConsentInformation$OnConsentInfoUpdateFailureListener var4);

    public void reset();
}

