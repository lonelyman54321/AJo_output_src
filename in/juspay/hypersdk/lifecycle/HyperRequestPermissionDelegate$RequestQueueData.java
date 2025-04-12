/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.lifecycle;

import kotlin.jvm.internal.Intrinsics;

final class HyperRequestPermissionDelegate$RequestQueueData {
    private final int requestCode;
    private final String[] requests;

    public HyperRequestPermissionDelegate$RequestQueueData(String[] stringArray, int n3) {
        Intrinsics.checkNotNullParameter(stringArray, "requests");
        this.requests = stringArray;
        this.requestCode = n3;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public final String[] getRequests() {
        return this.requests;
    }
}

