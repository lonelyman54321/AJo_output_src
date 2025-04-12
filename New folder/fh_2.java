/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from fH
 */
public final class fh_2
implements DialogInterface.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ hh_2 c;

    public /* synthetic */ fh_2(ArrayList arrayList, String[] stringArray, hh_2 hh_22) {
        this.a = arrayList;
        this.b = stringArray;
        this.c = hh_22;
    }

    public final void onClick(DialogInterface object, int n3) {
        int n4;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$subGroupList");
        String[] stringArray = this.b;
        Intrinsics.checkNotNullParameter(stringArray, "$subGroupArray");
        hh_2 hh_22 = this.c;
        Intrinsics.checkNotNullParameter(hh_22, "this$0");
        object = new StringBuilder();
        int n7 = ((ArrayList)object2).size();
        int n8 = 0;
        while (true) {
            n4 = 1;
            if (n8 >= n7) break;
            Object object3 = ((ArrayList)object2).get(n8);
            String string2 = "get(...)";
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            int n10 = ((Number)object3).intValue();
            object3 = stringArray[n10];
            ((StringBuilder)object).append((String)object3);
            n10 = ((ArrayList)object2).size() - n4;
            if (n8 != n10) {
                String string3 = ",";
                ((StringBuilder)object).append(string3);
            }
            ++n8;
        }
        object = ((StringBuilder)object).toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        object2 = "All";
        boolean bl2 = StringsKt.F((CharSequence)object, (CharSequence)object2, n4 != 0);
        if (bl2) {
            object = object2;
        }
        if ((object2 = hh_22.l) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subUserGroup");
            object2 = null;
        }
        object2.setText((CharSequence)object);
    }
}

