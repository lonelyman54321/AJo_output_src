/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextWatcher;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

public final class ux0$b
implements TextWatcher {
    public final /* synthetic */ ux0_0 a;

    public ux0$b(ux0_0 ux0_02) {
        this.a = ux0_02;
    }

    public final void afterTextChanged(Editable object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "editable");
        object = this.a;
        Object object2 = object.o;
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmailErrorTv");
            bl2 = false;
            object2 = null;
        }
        int n3 = 4;
        object2.setVisibility(n3);
        object2 = cp_1.Companion;
        Object object4 = object.j;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmailEt");
            n3 = 0;
            object4 = null;
        }
        object4 = object4.getText().toString();
        object2.getClass();
        bl2 = cp$a.z((String)object4);
        object4 = "rilEmployeeEmailInfoText";
        if (bl2) {
            object = object.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            } else {
                object3 = object;
            }
            int n4 = R$string.ril_employee_benefits_text;
            object = hv3_0.K(n4);
            cp$a.g((AjioTextView)object3, (String)object);
        } else {
            object = object.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            } else {
                object3 = object;
            }
            int n7 = 8;
            object3.setVisibility(n7);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }
}

