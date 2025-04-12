/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.view.View
 */
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

public final class Dz1
implements TextWatcher {
    public final /* synthetic */ az1_2 a;

    public Dz1(az1_2 az1_22) {
        this.a = az1_22;
    }

    public final void afterTextChanged(Editable object) {
        Intrinsics.checkNotNullParameter(object, "editable");
        object = cp_1.Companion;
        az1_2 az1_22 = this.a;
        Object object2 = az1_22.J;
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emailId");
            object2 = null;
        }
        object2 = object2.getText().toString();
        object.getClass();
        int n3 = cp$a.z((String)object2);
        object2 = "rilEmployeeEmailInfoText";
        if (n3 != 0) {
            object = az1_22.S;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object;
            }
            object = h40_0.a;
            object = h40_0.u0();
            cp$a.g((AjioTextView)object3, (String)object);
        } else {
            object = az1_22.S;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object;
            }
            n3 = 8;
            object3.setVisibility(n3);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    public final void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(object, "charSequence");
        object = this.a;
        Object object2 = ((az1_2)object).F;
        String string2 = "loginNewUserMailTil";
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        if ((n3 = (int)(object2.isErrorEnabled() ? 1 : 0)) != 0) {
            object2 = ((az1_2)object).F;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
            }
            object2.setErrorEnabled(false);
        }
        if ((object2 = ((az1_2)object).F) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        object2.setError(null);
        object2 = ((az1_2)object).Q;
        if (object2 == null) {
            object2 = "idLoginRemoval";
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object3 = object2;
        }
        ai0_2.i((View)object3);
        ((az1_2)object).Ua();
    }
}

