/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.EditText
 *  android.widget.TextView
 */
import android.widget.EditText;
import android.widget.TextView;
import com.ril.ajio.utility.validators.Validator;
import java.util.ArrayList;

/*
 * Renamed from Wv3
 */
public final class wv3_0
extends Validator {
    public HW2 c;

    public final void d(ba3_2 ba3_22) {
        ((TextView)ba3_22.a.getTag()).setVisibility(8);
    }

    public final void e() {
        boolean bl2;
        Object object;
        boolean bl3;
        Object object2 = this.a;
        EditText editText = ((ArrayList)object2).iterator();
        while (bl3 = editText.hasNext()) {
            object = (TextView)((ba3_2)editText.next()).a.getTag();
            int n3 = 8;
            object.setVisibility(n3);
        }
        object2 = ((ArrayList)object2).iterator();
        while (bl2 = object2.hasNext()) {
            editText = ((ba3_2)object2.next()).a;
            object = "";
            editText.setText((CharSequence)object);
        }
    }

    public final void g(ba3_2 ba3_22) {
        boolean bl2 = this.c(ba3_22);
        if (!bl2) {
            HW2 hW2 = this.c;
            if (hW2 == null) {
                this.c = hW2 = new Object();
            }
            hW2.a(ba3_22);
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

