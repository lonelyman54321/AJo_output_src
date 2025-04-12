/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

final class WebViewState
extends Enum {
    private static final /* synthetic */ WebViewState[] $VALUES;
    public static final /* enum */ WebViewState Active;
    public static final /* enum */ WebViewState Broken;
    public static final /* enum */ WebViewState Crashed;
    public static final /* enum */ WebViewState Created;
    public static final /* enum */ WebViewState Null;
    public static final /* enum */ WebViewState Recreating;

    private static /* synthetic */ WebViewState[] $values() {
        WebViewState webViewState = Created;
        webViewState = Active;
        webViewState = Broken;
        webViewState = Null;
        webViewState = Crashed;
        webViewState = Recreating;
        WebViewState[] webViewStateArray = new WebViewState[]{webViewState, webViewState, webViewState, webViewState, webViewState, webViewState};
        return webViewStateArray;
    }

    static {
        WebViewState webViewState;
        Created = webViewState = new WebViewState("Created", 0);
        Active = webViewState = new WebViewState("Active", 1);
        Broken = webViewState = new WebViewState("Broken", 2);
        Null = webViewState = new WebViewState("Null", 3);
        Crashed = webViewState = new WebViewState("Crashed", 4);
        Recreating = webViewState = new WebViewState("Recreating", 5);
        $VALUES = WebViewState.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private WebViewState() {
        void var2_-1;
        void var1_-1;
    }

    public static WebViewState valueOf(String string2) {
        return Enum.valueOf(WebViewState.class, string2);
    }

    public static WebViewState[] values() {
        return (WebViewState[])$VALUES.clone();
    }
}

