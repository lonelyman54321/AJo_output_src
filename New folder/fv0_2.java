/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.EditText
 *  android.widget.TextView
 */
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.utility.validators.Validator;
import java.util.Iterator;

/*
 * Renamed from FV0
 */
public final class fv0_2 {
    public final Validator a;

    public fv0_2(vz3_0 object) {
        int n3 = 0;
        this.a = null;
        int[] nArray = FV0$a.a;
        int n4 = object.ordinal();
        n4 = nArray[n4];
        int n7 = 1;
        if (n4 != n7) {
            n7 = 2;
            if (n4 != n7) {
                n7 = 3;
                if (n4 != n7) {
                    n7 = 4;
                    if (n4 != n7) {
                        n3 = 5;
                        if (n4 == n3) {
                            this.a = object;
                        }
                    } else {
                        super();
                        ((vx0_1)object).c = null;
                        this.a = object;
                    }
                } else {
                    super();
                    ((yl3_0)object).c = null;
                    this.a = object;
                }
            } else {
                super();
                this.a = object;
            }
        } else {
            super();
            this.a = object;
        }
    }

    public final void a(fa3_2 fa3_22, EditText editText, TextInputLayout textInputLayout, String string2, String string3) {
        this.a.f(fa3_22, editText, textInputLayout, string2, string3, false, 0);
    }

    public final void b(EditText editText, TextView textView, String string2) {
        boolean bl2;
        Validator validator = this.a;
        validator.getClass();
        fa3_2 fa3_22 = fa3_2.NONE;
        ba3_2 ba3_22 = new Object();
        ba3_22.f = fa3_22;
        ba3_22.g = bl2 = true;
        ba3_22.a = editText;
        ba3_22.c = textView;
        ba3_22.e = string2;
        textView = null;
        ba3_22.d = null;
        if (editText != null && (textView = editText.getText()) != null) {
            editText = editText.getText();
            editText.length();
        }
        ba3_22.f = fa3_22;
        validator.a(ba3_22);
        validator.a.add(ba3_22);
    }

    public final void c(EditText editText, TextInputLayout textInputLayout, String string2) {
        boolean bl2;
        Validator validator = this.a;
        validator.getClass();
        fa3_2 fa3_22 = fa3_2.NONE;
        ba3_2 ba3_22 = new Object();
        ba3_22.f = fa3_22;
        ba3_22.g = bl2 = true;
        ba3_22.a = editText;
        ba3_22.b = textInputLayout;
        ba3_22.e = string2;
        textInputLayout = null;
        ba3_22.d = null;
        if (editText != null && (textInputLayout = editText.getText()) != null) {
            editText = editText.getText();
            editText.length();
        }
        ba3_22.f = fa3_22;
        validator.a(ba3_22);
        validator.a.add(ba3_22);
    }

    public final void d(EditText editText, TextInputLayout textInputLayout, String string2, xx0_0 xx0_02) {
        boolean bl2;
        Validator validator = this.a;
        validator.getClass();
        fa3_2 fa3_22 = fa3_2.NONE;
        ba3_2 ba3_22 = new Object();
        ba3_22.f = fa3_22;
        ba3_22.g = bl2 = true;
        ba3_22.a = editText;
        ba3_22.b = textInputLayout;
        ba3_22.e = string2;
        textInputLayout = null;
        ba3_22.d = null;
        if (editText != null && (textInputLayout = editText.getText()) != null) {
            editText = editText.getText();
            editText.length();
        }
        ba3_22.f = fa3_22;
        ba3_22.h = xx0_02;
        validator.a(ba3_22);
        validator.a.add(ba3_22);
    }

    public final void e(EditText editText, TextInputLayout textInputLayout, String string2, String string3, boolean bl2, int n3) {
        Validator validator = this.a;
        validator.getClass();
        fa3_2 fa3_22 = fa3_2.NONE;
        validator.f(fa3_22, editText, textInputLayout, string2, string3, bl2, n3);
    }

    public final void f(EditText editText, String string2) {
        Validator validator = this.a;
        validator.getClass();
        fa3_2 fa3_22 = fa3_2.NONE;
        ba3_2 ba3_22 = new Object();
        ba3_22.f = fa3_22;
        ba3_22.g = true;
        ba3_22.a = editText;
        ba3_22.b = null;
        ba3_22.e = string2;
        ba3_22.d = null;
        if (editText != null && (string2 = editText.getText()) != null) {
            editText = editText.getText();
            editText.length();
        }
        ba3_22.f = fa3_22;
        validator.a(ba3_22);
        validator.a.add(ba3_22);
    }

    public final void g(EditText editText, String string2) {
        boolean bl2;
        Iterator iterator = this.a.a.iterator();
        while (bl2 = iterator.hasNext()) {
            ba3_2 ba3_22 = (ba3_2)iterator.next();
            EditText editText2 = ba3_22.a;
            if (editText != editText2) continue;
            editText2.setError((CharSequence)string2);
            ba3_22 = ba3_22.a;
            ba3_22.requestFocus();
        }
    }
}

