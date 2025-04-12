/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.widget.EditText
 */
import android.view.View;
import android.widget.EditText;

/*
 * Renamed from Ii0
 */
public final class ii0_2
implements View.OnFocusChangeListener {
    public final /* synthetic */ EditText[] a;

    public /* synthetic */ ii0_2(EditText[] editTextArray) {
        this.a = editTextArray;
    }

    public final void onFocusChange(View view, boolean bl2) {
        ki0_1.a(this.a, view, bl2);
    }
}

