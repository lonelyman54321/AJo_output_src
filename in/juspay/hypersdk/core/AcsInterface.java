/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package in.juspay.hypersdk.core;

import android.util.Base64;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.DynamicUI;
import in.juspay.hypersdk.core.JuspayServices;

public class AcsInterface {
    private final DynamicUI dui;
    private final DuiInterface duiInterface;

    public AcsInterface(JuspayServices object) {
        DynamicUI dynamicUI;
        this.dui = dynamicUI = ((JuspayServices)object).getDynamicUI();
        this.duiInterface = object = ((JuspayServices)object).getJBridge();
    }

    private boolean isFunctionAllowedToInvoke(String string2) {
        return string2.matches("^[a-zA-Z0-9]*$");
    }

    public String getDataFromSharedPrefs(String string2) {
        DuiInterface duiInterface = this.duiInterface;
        if (duiInterface != null) {
            return duiInterface.getDataFromSharedPrefs(string2, "");
        }
        return "__failed";
    }

    public String getResourceByName(String string2) {
        DuiInterface duiInterface = this.duiInterface;
        if (duiInterface != null) {
            return duiInterface.getResourceByName(string2);
        }
        return "__failed";
    }

    public String getSessionAttribute(String string2) {
        DuiInterface duiInterface = this.duiInterface;
        if (duiInterface != null) {
            return duiInterface.getSessionAttribute(string2, "");
        }
        return "__failed";
    }

    public String getSessionInfo() {
        String string2;
        Object object = this.duiInterface;
        boolean bl2 = ((String)(object = object != null ? ((DuiInterface)object).getSessionInfo() : string2)).equals(string2 = "");
        if (bl2) {
            object = "__failed";
        }
        return object;
    }

    public void invoke(String string2, String object) {
        int n3 = this.isFunctionAllowedToInvoke(string2);
        if (n3 != 0) {
            object = ((String)object).getBytes();
            n3 = 2;
            object = Base64.encodeToString((byte[])object, (int)n3);
            String string3 = "window[\"onEvent'\"]('";
            String string4 = "',atob('";
            String string5 = "'))";
            string2 = uc0_0.a(string3, string2, string4, (String)object, string5);
            object = this.dui;
            ((DynamicUI)object).addJsToWebView(string2);
        }
    }

    public void invoke(String string2, String object, String string3) {
        int n3 = this.isFunctionAllowedToInvoke(string2);
        if (n3 != 0) {
            object = ((String)object).getBytes();
            n3 = 2;
            object = Base64.encodeToString((byte[])object, (int)n3);
            String string4 = "window[\"onEvent'\"]('";
            String string5 = "',atob('";
            String string6 = "'),'";
            string2 = h30_0.a(og_1.a(string4, string2, string5, (String)object, string6), string3, "')");
            object = this.dui;
            ((DynamicUI)object).addJsToWebView(string2);
        }
    }

    public boolean isOnline() {
        DuiInterface duiInterface = this.duiInterface;
        if (duiInterface != null) {
            return duiInterface.isOnline();
        }
        return true;
    }
}

