/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.cv;

public final class cu
implements Runnable {
    public final /* synthetic */ cv a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ AssetPackState c;

    public /* synthetic */ cu(cv cv2, Bundle bundle, AssetPackState assetPackState) {
        this.a = cv2;
        this.b = bundle;
        this.c = assetPackState;
    }

    public final void run() {
        cv cv2 = this.a;
        Bundle bundle = this.b;
        AssetPackState assetPackState = this.c;
        cv.a(cv2, bundle, assetPackState);
    }
}

