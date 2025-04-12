/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesManifestException;

public final class GooglePlayServicesIncorrectManifestValueException
extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int n3) {
        int n4 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        String string2 = z41.a("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", " but found ", ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />", n4, n3);
        super(n3, string2);
    }
}

