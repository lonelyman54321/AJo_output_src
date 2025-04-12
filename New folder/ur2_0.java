/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ListView
 */
import android.app.Dialog;
import android.view.View;
import android.widget.ListView;
import com.ril.ajio.payment.fragment.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from ur2
 */
public final class ur2_0
implements View.OnClickListener {
    public final /* synthetic */ ListView a;
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ String c;
    public final /* synthetic */ h d;
    public final /* synthetic */ String[] e;

    public /* synthetic */ ur2_0(ListView listView, Dialog dialog, String string2, h h3, String[] stringArray) {
        this.a = listView;
        this.b = dialog;
        this.c = string2;
        this.d = h3;
        this.e = stringArray;
    }

    public final void onClick(View object) {
        Dialog dialog = this.b;
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        CharSequence charSequence = this.c;
        Intrinsics.checkNotNullParameter(charSequence, "$mode");
        Object object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = this.e;
        Intrinsics.checkNotNullParameter(object3, "$valuelist");
        object = this.a;
        int n3 = object.getCheckedItemPosition();
        int n4 = -1;
        if (n3 == n4) {
            dialog.dismiss();
        } else {
            int n7 = 1;
            int n8 = kotlin.text.b.i((String)charSequence, "month", n7 != 0);
            n4 = 0;
            String string2 = null;
            if (n8 != 0) {
                n8 = 8;
                object3 = "expiremonthEt";
                if (n3 <= n8) {
                    charSequence = ((h)object2).p;
                    if (charSequence == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    } else {
                        string2 = charSequence;
                    }
                    object2 = "0";
                    charSequence = new StringBuilder((String)object2);
                    ((StringBuilder)charSequence).append(n3 += n7);
                    object = ((StringBuilder)charSequence).toString();
                    string2.setText((CharSequence)object);
                } else {
                    charSequence = ((h)object2).p;
                    if (charSequence == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    } else {
                        string2 = charSequence;
                    }
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(n3 += n7);
                    object = ((StringBuilder)charSequence).toString();
                    string2.setText((CharSequence)object);
                }
            } else {
                object = object3[n3];
                charSequence = ((h)object2).o;
                if (charSequence == null) {
                    charSequence = "expireyearEt";
                    Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                } else {
                    string2 = charSequence;
                }
                string2.setText((CharSequence)object);
            }
            dialog.dismiss();
        }
    }
}

