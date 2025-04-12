/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.lifecycle;

import in.juspay.hypersdk.lifecycle.FragmentEvent;

public final class HyperFragment$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        FragmentEvent fragmentEvent;
        int n7 = FragmentEvent.values().length;
        int[] nArray = new int[n7];
        try {
            fragmentEvent = FragmentEvent.ON_PAUSE;
            n4 = fragmentEvent.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fragmentEvent = FragmentEvent.ON_RESUME;
            n4 = fragmentEvent.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fragmentEvent = FragmentEvent.ON_STOP;
            n4 = fragmentEvent.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fragmentEvent = FragmentEvent.ON_DESTROY;
            n4 = fragmentEvent.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fragmentEvent = FragmentEvent.ON_SAVED_STATE_INSTANCE;
            n4 = fragmentEvent.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fragmentEvent = FragmentEvent.ON_ATTACH;
            n4 = fragmentEvent.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fragmentEvent = FragmentEvent.ON_ACTIVITY_RESULT;
            n4 = fragmentEvent.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fragmentEvent = FragmentEvent.ON_REQUEST_PERMISSION_RESULT;
            n4 = fragmentEvent.ordinal();
            nArray[n4] = n3 = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

