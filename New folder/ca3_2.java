/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
import android.view.View;
import com.ril.ajio.utility.validators.Validator;

/*
 * Renamed from cA3
 */
public final class ca3_2
implements View.OnFocusChangeListener {
    public Validator a;
    public ba3_2 b;

    public final void onFocusChange(View object, boolean bl2) {
        object = this.b;
        fa3_2 fa3_22 = object.f;
        fa3_2 fa3_23 = fa3_2.ONFOCUSLOST_DOVALIDATE;
        Validator validator = this.a;
        if (!(fa3_22 != fa3_23 && fa3_22 != (fa3_23 = fa3_2.ALL) || bl2)) {
            validator.d((ba3_2)object);
            validator.g((ba3_2)object);
        }
        if (((fa3_22 = object.f) == (fa3_23 = fa3_2.ONFOCUSGAINED_CLEARVALIDATION) || fa3_22 == (fa3_23 = fa3_2.ALL)) && bl2) {
            validator.d((ba3_2)object);
        }
    }
}

