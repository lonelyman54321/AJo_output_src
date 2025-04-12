/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class ed3$a {
    public static ed3_2 a(Bundle bundle, String string2) {
        Intrinsics.checkNotNullParameter(string2, "storePageId");
        ed3_2 ed3_22 = new ed3_2();
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("STORE_PAGE_ID", string2);
        String[] stringArray = "/shop/";
        int n3 = StringsKt.F(string2, (CharSequence)stringArray, false);
        String string3 = "";
        String string4 = "STORE_ID";
        if (n3 != 0) {
            n3 = StringsKt.F(string2 = b.n(string2, (String)stringArray, string3, false), (CharSequence)(stringArray = "-"), false);
            if (n3 != 0) {
                stringArray = new String[]{stringArray};
                n3 = 6;
                string2 = (String)StringsKt.a0(string2, stringArray, false, 0, n3).get(0);
            }
            bundle.putString(string4, string2);
        } else {
            bundle.putString(string4, string3);
        }
        ed3_22.setArguments(bundle);
        return ed3_22;
    }
}

