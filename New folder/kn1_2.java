/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.lifecycle.RequestPermissionResult;

/*
 * Renamed from kn1
 */
public final class kn1_2
implements RequestPermissionResult {
    public final /* synthetic */ JuspayServices a;

    public /* synthetic */ kn1_2(JuspayServices juspayServices) {
        this.a = juspayServices;
    }

    public final void onRequestPermissionsResult(int n3, String[] stringArray, int[] nArray) {
        this.a.onRequestPermissionsResult(n3, stringArray, nArray);
    }
}

