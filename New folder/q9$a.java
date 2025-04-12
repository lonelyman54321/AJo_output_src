/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class q9$a {
    public static q9_0 a(Bundle object) {
        Intrinsics.checkNotNullParameter(object, "bundle");
        Object object2 = "CORE_CATEGORY_ID";
        boolean bl2 = object.containsKey((String)object2);
        if (bl2) {
            object2 = object.getString((String)object2);
            object = q9$a.b(object, (String)object2);
        } else {
            object2 = new q9_0();
            ((Fragment)object2).setArguments((Bundle)object);
            object = object2;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static q9_0 b(Bundle bundle, String string2) {
        String string3;
        String string4;
        q9_0 q9_02 = new q9_0();
        if (bundle == null) {
            bundle = new Bundle();
        }
        CharSequence charSequence = "is_landing_page";
        boolean bl2 = bundle.containsKey((String)charSequence);
        boolean bl3 = true;
        if (bl2) {
            q9_02.G2 = bl3;
        }
        bl2 = false;
        charSequence = null;
        if (string2 == null || !(bl3 = StringsKt.F(string2, string4 = "-", bl3)) && (bl3 = og1_1.c()) && !(bl3 = StringsKt.F(string2, string3 = "/shop/luxe", false))) {
            string2 = null;
        }
        if (string2 != null && !(bl2 = b.s(string2, string3 = "/shop/", false))) {
            charSequence = new StringBuilder(string3);
            ((StringBuilder)charSequence).append((Object)string2);
            string2 = ((StringBuilder)charSequence).toString();
        }
        bundle.putString("CORE_CATEGORY_ID", string2);
        q9_02.setArguments(bundle);
        return q9_02;
    }
}

