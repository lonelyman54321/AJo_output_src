/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.DatePickerDialog$OnDateSetListener
 *  android.widget.DatePicker
 */
import android.app.DatePickerDialog;
import android.widget.DatePicker;
import in.juspay.hypersdk.core.JBridge;

/*
 * Renamed from Kk1
 */
public final class kk1_2
implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ JBridge a;
    public final /* synthetic */ String b;

    public /* synthetic */ kk1_2(JBridge jBridge, String string2) {
        this.a = jBridge;
        this.b = string2;
    }

    public final void onDateSet(DatePicker datePicker, int n3, int n4, int n7) {
        JBridge jBridge = this.a;
        String string2 = this.b;
        JBridge.q(jBridge, string2, datePicker, n3, n4, n7);
    }
}

