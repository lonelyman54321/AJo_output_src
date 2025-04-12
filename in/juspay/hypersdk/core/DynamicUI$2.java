/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.WebViewState;

class DynamicUI$2 {
    static final /* synthetic */ int[] $SwitchMap$in$juspay$hypersdk$core$WebViewState;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        WebViewState webViewState;
        int n7 = WebViewState.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$in$juspay$hypersdk$core$WebViewState = nArray;
        try {
            webViewState = WebViewState.Recreating;
            n4 = webViewState.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$in$juspay$hypersdk$core$WebViewState;
            webViewState = WebViewState.Broken;
            n4 = webViewState.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$in$juspay$hypersdk$core$WebViewState;
            webViewState = WebViewState.Crashed;
            n4 = webViewState.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$in$juspay$hypersdk$core$WebViewState;
            webViewState = WebViewState.Null;
            n4 = webViewState.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$in$juspay$hypersdk$core$WebViewState;
            webViewState = WebViewState.Created;
            n4 = webViewState.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$in$juspay$hypersdk$core$WebViewState;
            webViewState = WebViewState.Active;
            n4 = webViewState.ordinal();
            nArray[n4] = n3 = 6;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

