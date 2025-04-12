/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersmshandler;

public interface Tracker {
    public void trackAction(String var1, String var2, String var3, String var4, Object var5);

    public void trackAndLogException(String var1, String var2, String var3, String var4, String var5, Throwable var6);
}

