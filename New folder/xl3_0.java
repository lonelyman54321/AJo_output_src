/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.textfield.TextInputLayout;

/*
 * Renamed from xl3
 */
public final class xl3_0
implements aa3_2 {
    public final void a(ba3_2 object) {
        TextInputLayout textInputLayout = object.b;
        String string2 = object.e;
        if (textInputLayout != null) {
            textInputLayout.setError(string2);
            int n3 = 1;
            object = object.b;
            textInputLayout = object.getChildAt(n3);
            if (textInputLayout != null) {
                string2 = null;
                textInputLayout.setVisibility(0);
                textInputLayout.invalidate();
            }
            object.invalidate();
        } else {
            object = object.a;
            if (object != null) {
                object.setError(string2);
                object.requestFocus();
            }
        }
    }
}

