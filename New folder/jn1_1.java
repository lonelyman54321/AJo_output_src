/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.lifecycle.ActivityResultHolder;

/*
 * Renamed from jn1
 */
public final class jn1_1
implements ActivityResultHolder {
    public final /* synthetic */ JuspayServices a;

    public /* synthetic */ jn1_1(JuspayServices juspayServices) {
        this.a = juspayServices;
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        this.a.onActivityResult(n3, n4, intent);
    }
}

