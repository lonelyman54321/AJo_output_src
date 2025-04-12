/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package in.juspay.hyper.bridge;

import android.content.Intent;
import in.juspay.hyper.bridge.HBridge;
import in.juspay.hyper.core.BridgeComponents;
import kotlin.jvm.internal.Intrinsics;

public abstract class HyperBridge
implements HBridge {
    private final BridgeComponents bridgeComponents;

    public HyperBridge(BridgeComponents bridgeComponents) {
        Intrinsics.checkNotNullParameter(bridgeComponents, "bridgeComponents");
        this.bridgeComponents = bridgeComponents;
    }

    public final BridgeComponents getBridgeComponents() {
        return this.bridgeComponents;
    }

    public String getInterfaceName() {
        String string2 = this.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(string2, "javaClass.simpleName");
        return string2;
    }

    public boolean onActivityResult(int n3, int n4, Intent intent) {
        return false;
    }

    public boolean onRequestPermissionResult(int n3, String[] stringArray, int[] nArray) {
        Intrinsics.checkNotNullParameter(stringArray, "permissions");
        Intrinsics.checkNotNullParameter(nArray, "grantResults");
        return false;
    }

    public void reset() {
    }

    public void terminate() {
    }
}

