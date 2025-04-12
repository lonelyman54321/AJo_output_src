/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.DatePickerDialog$OnDateSetListener
 *  android.widget.DatePicker
 */
import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from mh2
 */
public final class mh2_0
implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ qh2_2 a;

    public /* synthetic */ mh2_0(qh2_2 qh2_22) {
        this.a = qh2_22;
    }

    public final void onDateSet(DatePicker object, int n3, int n4, int n7) {
        int n8 = 1;
        qh2_2 qh2_22 = this.a;
        Intrinsics.checkNotNullParameter(qh2_22, "this$0");
        qh2_22.o = n3;
        qh2_22.p = n4;
        qh2_22.q = n7;
        n4 += n8;
        Object object2 = StringCompanionObject.INSTANCE;
        Object object3 = n7;
        object2 = new Object[n8];
        object2[0] = object3;
        object3 = "%02d";
        String string2 = "format(...)";
        object2 = xh2_0.a(object2, n8, (String)object3, string2);
        Object object4 = n4;
        Object[] objectArray = new Object[n8];
        objectArray[0] = object4;
        object = xh2_0.a(objectArray, n8, (String)object3, string2);
        Object object5 = n3;
        object4 = new StringBuilder();
        ((StringBuilder)object4).append((String)object2);
        object3 = "/";
        ((StringBuilder)object4).append((String)object3);
        ((StringBuilder)object4).append((String)object);
        ((StringBuilder)object4).append((String)object3);
        ((StringBuilder)object4).append(object5);
        object = ((StringBuilder)object4).toString();
        object4 = "dd MMM yyyy";
        object = k7.a((String)object, "dd/MM/yyyy", (String)object4);
        object5 = qh2_22.j;
        if (object5 != null) {
            object5.setText((CharSequence)object);
        }
        if ((object = qh2_22.k) != null) {
            n3 = 0;
            object5 = null;
            ((TextInputLayout)((Object)object)).setEndIconDrawable(null);
        }
        qh2_22.Pa();
    }
}

