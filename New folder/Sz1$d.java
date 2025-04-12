/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.widget.EditText
 */
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.ril.ajio.R$drawable;
import kotlin.jvm.internal.Intrinsics;

public final class Sz1$d
implements TextWatcher {
    public final EditText a;
    public final EditText b;
    public final /* synthetic */ sz1_2 c;

    public Sz1$d(sz1_2 sz1_22, EditText editText, EditText editText2) {
        Intrinsics.checkNotNullParameter(editText, "curr");
        this.c = sz1_22;
        this.a = editText;
        this.b = editText2;
    }

    public final void afterTextChanged(Editable object) {
        if (object != null) {
            int n3;
            String string2;
            int n4;
            EditText editText = this.b;
            if (editText != null && (n4 = (string2 = object.toString()).length()) > 0) {
                string2 = this.a;
                string2.clearFocus();
                editText.requestFocus();
            }
            if ((n3 = (object = object.toString()).length()) > 0) {
                object = this.c;
                sz1_2.Pa((sz1_2)object);
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        if (charSequence != null) {
            ((Object)charSequence).toString();
        }
    }

    public final void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        object = this.c;
        EditText editText = ((sz1_2)object).l;
        Object object2 = null;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText1");
            editText = null;
        }
        n7 = R$drawable.rounded_cool_grey_refresh;
        Drawable drawable2 = hv3_0.r(n7);
        editText.setBackground(drawable2);
        editText = ((sz1_2)object).m;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText2");
            editText = null;
        }
        n7 = R$drawable.rounded_cool_grey_refresh;
        drawable2 = hv3_0.r(n7);
        editText.setBackground(drawable2);
        editText = ((sz1_2)object).n;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText3");
            editText = null;
        }
        n7 = R$drawable.rounded_cool_grey_refresh;
        drawable2 = hv3_0.r(n7);
        editText.setBackground(drawable2);
        editText = ((sz1_2)object).o;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText4");
            editText = null;
        }
        n7 = R$drawable.rounded_cool_grey_refresh;
        drawable2 = hv3_0.r(n7);
        editText.setBackground(drawable2);
        editText = ((sz1_2)object).p;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorIv");
            editText = null;
        }
        n7 = 8;
        editText.setVisibility(n7);
        editText = ((sz1_2)object).q;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorTv");
            editText = null;
        }
        editText.setVisibility(n7);
        editText = ((sz1_2)object).S;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginButtonAccessibleUser");
            editText = null;
        }
        editText.setVisibility(n7);
        object = ((sz1_2)object).T;
        if (object == null) {
            object = "loginOtpVerifiedText";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object2.setVisibility(n7);
    }
}

