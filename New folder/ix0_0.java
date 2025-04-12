/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.DatePickerDialog$OnDateSetListener
 *  android.widget.DatePicker
 */
import android.app.DatePickerDialog;
import android.widget.DatePicker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Ix0
 */
public final class ix0_0
implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ px0_1 a;

    public /* synthetic */ ix0_0(px0_1 px0_12) {
        this.a = px0_12;
    }

    public final void onDateSet(DatePicker datePicker, int n3, int n4, int n7) {
        int n8 = 1;
        px0_1 px0_12 = this.a;
        Intrinsics.checkNotNullParameter(px0_12, "this$0");
        px0_12.v = n3;
        px0_12.w = n4;
        px0_12.x = n7;
        n4 += n8;
        Object object = StringCompanionObject.INSTANCE;
        Object object2 = n7;
        object = new Object[n8];
        object[0] = object2;
        object2 = "%02d";
        String string2 = "format(...)";
        object = xh2_0.a(object, n8, (String)object2, string2);
        Object object3 = n4;
        Object[] objectArray = new Object[n8];
        objectArray[0] = object3;
        object3 = xh2_0.a(objectArray, n8, (String)object2, string2);
        Object object4 = n3;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        String string3 = "/";
        ((StringBuilder)object2).append(string3);
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(string3);
        ((StringBuilder)object2).append(object4);
        object4 = k7.a(((StringBuilder)object2).toString(), "dd/MM/yyyy", "dd MMMM yyyy");
        object3 = px0_12.i;
        n7 = 0;
        object2 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateOfBirthField");
            n4 = 0;
            object3 = null;
        }
        object3.setText((CharSequence)object4);
        object4 = px0_12.j;
        if (object4 == null) {
            object4 = "dateOfBirthFieldLabelTv";
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object2 = object4;
        }
        object2.setVisibility(0);
    }
}

