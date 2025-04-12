/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.lifecycle.FragmentEvent;

class JuspayServices$6 {
    static final /* synthetic */ int[] $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent;

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
        $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent = nArray;
        try {
            fragmentEvent = FragmentEvent.ON_PAUSE;
            n4 = fragmentEvent.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent;
            fragmentEvent = FragmentEvent.ON_RESUME;
            n4 = fragmentEvent.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent;
            fragmentEvent = FragmentEvent.ON_ATTACH;
            n4 = fragmentEvent.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent;
            fragmentEvent = FragmentEvent.ON_DESTROY;
            n4 = fragmentEvent.ordinal();
            nArray[n4] = n3 = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

