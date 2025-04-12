/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import com.google.firebase.installations.remote.InstallationResponse$ResponseCode;
import com.google.firebase.installations.remote.TokenResult$ResponseCode;

class FirebaseInstallations$3 {
    static final /* synthetic */ int[] $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode;
    static final /* synthetic */ int[] $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        Enum enum_;
        int n4;
        Object object;
        int n7 = TokenResult$ResponseCode.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode = nArray;
        int n8 = 1;
        try {
            object = TokenResult$ResponseCode.OK;
            n4 = ((Enum)object).ordinal();
            nArray[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 2;
        try {
            object = $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode;
            enum_ = TokenResult$ResponseCode.BAD_CONFIG;
            n3 = enum_.ordinal();
            object[n3] = (TokenResult$ResponseCode)n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode;
            enum_ = TokenResult$ResponseCode.AUTH_ERROR;
            n3 = enum_.ordinal();
            int n10 = 3;
            object[n3] = (TokenResult$ResponseCode)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = InstallationResponse$ResponseCode.values().length;
        object = new int[n4];
        $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode = (int[])object;
        try {
            enum_ = InstallationResponse$ResponseCode.OK;
            n3 = enum_.ordinal();
            object[n3] = (TokenResult$ResponseCode)n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            int[] nArray2 = $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode;
            object = InstallationResponse$ResponseCode.BAD_CONFIG;
            n4 = ((Enum)object).ordinal();
            nArray2[n4] = n7;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

