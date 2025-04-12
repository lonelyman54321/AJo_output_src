/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.mystique;

public interface Callback {
    public void onError(String var1, String var2);

    public void onException(String var1, String var2, Throwable var3);

    public void onRenderProcessGone(boolean var1);

    public void webViewLoaded(Exception var1);
}

