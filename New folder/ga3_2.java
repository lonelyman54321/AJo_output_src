/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextWatcher;
import com.ril.ajio.utility.validators.Validator;

/*
 * Renamed from gA3
 */
public final class ga3_2
implements TextWatcher {
    public Validator a;
    public ba3_2 b;

    public final void afterTextChanged(Editable object) {
        object = this.a;
        ba3_2 ba3_22 = this.b;
        ((Validator)object).d(ba3_22);
        ((Validator)object).g(ba3_22);
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }
}

