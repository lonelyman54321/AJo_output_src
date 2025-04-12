/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.customviews;

import com.ril.ajio.services.data.Address.AddressType;

public final class AddressWidgetView$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        AddressType addressType;
        int n7 = AddressType.values().length;
        int[] nArray = new int[n7];
        try {
            addressType = AddressType.Pincode;
            n4 = addressType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            addressType = AddressType.Address;
            n4 = addressType.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            addressType = AddressType.None;
            n4 = addressType.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            addressType = AddressType.PinCodeEmpty;
            n4 = addressType.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

