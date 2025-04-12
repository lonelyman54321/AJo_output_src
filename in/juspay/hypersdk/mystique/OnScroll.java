/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 */
package in.juspay.hypersdk.mystique;

import android.widget.AbsListView;
import in.juspay.hypersdk.core.DuiCallback;

public class OnScroll
implements AbsListView.OnScrollListener {
    private final DuiCallback duiCallback;
    private String scrollCallback;
    private String scrollChangeCallback;

    public OnScroll(DuiCallback duiCallback) {
        this.duiCallback = duiCallback;
    }

    public void onScroll(AbsListView object, int n3, int n4, int n7) {
        object = this.duiCallback;
        StringBuilder stringBuilder = new StringBuilder("window.callUICallback('");
        String string2 = this.scrollCallback;
        stringBuilder.append(string2);
        stringBuilder.append("','");
        stringBuilder.append(n3);
        String string3 = ",";
        stringBuilder.append(string3);
        stringBuilder.append(n4);
        stringBuilder.append(string3);
        stringBuilder.append(n7);
        stringBuilder.append("');");
        string3 = stringBuilder.toString();
        object.addJsToWebView(string3);
    }

    public void onScrollStateChanged(AbsListView object, int n3) {
        object = this.duiCallback;
        StringBuilder stringBuilder = new StringBuilder("window.callUICallback('");
        String string2 = this.scrollChangeCallback;
        stringBuilder.append(string2);
        stringBuilder.append("',");
        stringBuilder.append(n3);
        stringBuilder.append(");");
        String string3 = stringBuilder.toString();
        object.addJsToWebView(string3);
    }

    public void setScrollCallback(String string2) {
        this.scrollCallback = string2;
    }

    public void setScrollChangeCallback(String string2) {
        this.scrollChangeCallback = string2;
    }
}

