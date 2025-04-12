/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.EditText
 */
import android.widget.EditText;
import com.ril.ajio.utility.validators.Validator;
import java.util.ArrayList;

/*
 * Renamed from Uw
 */
public final class uw_2
extends Validator {
    public Oj1 c;

    public final void d(ba3_2 ba3_22) {
        ba3_22.a.setError(null);
    }

    public final void e() {
        boolean bl2;
        Object object;
        boolean bl3;
        Object object2 = this.a;
        EditText editText = ((ArrayList)object2).iterator();
        while (bl3 = editText.hasNext()) {
            object = ((ba3_2)editText.next()).a;
            object.setError(null);
        }
        object2 = ((ArrayList)object2).iterator();
        while (bl2 = object2.hasNext()) {
            editText = ((ba3_2)object2.next()).a;
            object = "";
            editText.setText((CharSequence)object);
        }
    }

    public final void g(ba3_2 object) {
        boolean bl2 = this.c((ba3_2)object);
        if (!bl2 && (object = this.c) == null) {
            this.c = object = new Object();
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

