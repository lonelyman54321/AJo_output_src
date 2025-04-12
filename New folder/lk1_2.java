/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 */
import android.content.DialogInterface;
import in.juspay.hypersdk.core.JBridge;

/*
 * Renamed from Lk1
 */
public final class lk1_2
implements DialogInterface.OnCancelListener {
    public final /* synthetic */ JBridge a;
    public final /* synthetic */ String b;

    public /* synthetic */ lk1_2(JBridge jBridge, String string2) {
        this.a = jBridge;
        this.b = string2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        JBridge jBridge = this.a;
        String string2 = this.b;
        JBridge.r(jBridge, string2, dialogInterface);
    }
}

