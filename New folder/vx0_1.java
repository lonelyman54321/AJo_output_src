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
import java.util.Iterator;

/*
 * Renamed from Vx0
 */
public final class vx0_1
extends Validator {
    public ux0_1 c;

    public final void d(ba3_2 ba3_22) {
        TextView textView = ba3_22.c;
        if (textView != null) {
            String string2 = "";
            textView.setText((CharSequence)string2);
            ba3_22 = ba3_22.c;
            if (ba3_22 != null) {
                int n3 = 4;
                ba3_22.setVisibility(n3);
                ba3_22.invalidate();
            }
        }
    }

    public final void e() {
        boolean bl2;
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            ba3_2 ba3_22 = (ba3_2)iterator.next();
            EditText editText = ba3_22.a;
            if (editText != null) {
                String string2 = "";
                editText.setText((CharSequence)string2);
            }
            if ((ba3_22 = ba3_22.c) == null) continue;
            editText = null;
            ba3_22.setText(null);
            int n3 = 4;
            ba3_22.setVisibility(n3);
            ba3_22.invalidate();
        }
    }

    public final void g(ba3_2 ba3_22) {
        this.d(ba3_22);
        boolean bl2 = this.c(ba3_22);
        if (!bl2) {
            ux0_1 ux0_12 = this.c;
            if (ux0_12 == null) {
                this.c = ux0_12 = new Object();
            }
            ux0_12.a(ba3_22);
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

