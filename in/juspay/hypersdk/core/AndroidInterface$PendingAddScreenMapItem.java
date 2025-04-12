/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

final class AndroidInterface$PendingAddScreenMapItem {
    String callbackName;
    int index;
    String parentId;
    boolean replaceChild;
    String runInUIprop;
    String screenName;

    public AndroidInterface$PendingAddScreenMapItem(String string2, String string3, int n3, String string4, boolean bl2, String string5) {
        this.parentId = string2;
        this.screenName = string3;
        this.index = n3;
        this.callbackName = string4;
        this.replaceChild = bl2;
        this.runInUIprop = string5;
    }
}

