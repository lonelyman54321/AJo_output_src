/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  org.json.JSONObject
 */
package in.juspay.hypersmshandler;

import android.app.Activity;
import org.json.JSONObject;

public interface JuspayDuiHook {
    public void attach(Activity var1);

    public void detach(Activity var1);

    public String execute(Activity var1, String var2, JSONObject var3);
}

