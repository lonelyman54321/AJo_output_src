/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.EditText
 */
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.utility.validators.Validator;
import java.util.Iterator;

/*
 * Renamed from yl3
 */
public final class yl3_0
extends Validator {
    public xl3_0 c;

    public final void d(ba3_2 object) {
        EditText editText = ((ba3_2)object).a;
        int n3 = 0;
        if (editText != null) {
            editText.setError(null);
        }
        if ((object = ((ba3_2)object).b) != null) {
            ((TextInputLayout)((Object)object)).setError(null);
            int n4 = 1;
            editText = object.getChildAt(n4);
            if (editText != null) {
                n3 = 8;
                editText.setVisibility(n3);
                editText.invalidate();
            }
            object.invalidate();
        }
    }

    public final void e() {
        boolean bl2;
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (ba3_2)iterator.next();
            Object object2 = ((ba3_2)object).a;
            int n3 = 0;
            if (object2 != null) {
                object2.setError(null);
                object2 = "";
                EditText editText = ((ba3_2)object).a;
                editText.setText((CharSequence)object2);
            }
            if ((object = ((ba3_2)object).b) == null) continue;
            ((TextInputLayout)((Object)object)).setError(null);
            int n4 = 1;
            object2 = object.getChildAt(n4);
            if (object2 != null) {
                n3 = 8;
                object2.setVisibility(n3);
                object2.invalidate();
            }
            object.invalidate();
        }
    }

    public final void g(ba3_2 ba3_22) {
        this.d(ba3_22);
        boolean bl2 = this.c(ba3_22);
        if (!bl2) {
            xl3_0 xl3_02 = this.c;
            if (xl3_02 == null) {
                this.c = xl3_02 = new Object();
            }
            xl3_02.a(ba3_22);
        }
    }

    public final boolean h() {
        boolean bl2;
        Object object = this.a.iterator();
        while (bl2 = object.hasNext()) {
            ba3_2 ba3_22 = (ba3_2)object.next();
            this.d(ba3_22);
        }
        object = this.c;
        if (object == null) {
            this.c = object = new Object();
        }
        return this.b((aa3_2)object);
    }
}

