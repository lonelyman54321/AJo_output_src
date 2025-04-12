/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hyper.core;

import org.json.JSONObject;

public interface TrackerInterface {
    public void addLogToPersistedQueue(JSONObject var1);

    public void track(JSONObject var1);

    public void trackAction(String var1, String var2, String var3, String var4, Object var5);

    public void trackAndLogException(String var1, String var2, String var3, String var4, String var5, Throwable var6);

    public void trackApiCalls(String var1, String var2, String var3, Integer var4, String var5, Long var6, Long var7, Object var8, Object var9, String var10);

    public void trackLifecycle(String var1, String var2, String var3, String var4, Object var5);
}

