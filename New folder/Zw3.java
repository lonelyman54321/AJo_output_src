/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 *  android.net.Uri
 */
import android.content.res.Configuration;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class Zw3
implements ao1_0 {
    public final String a(Object object, ba2 configArray) {
        String string2;
        CharSequence charSequence = (object = (Uri)object).getScheme();
        boolean bl2 = Intrinsics.areEqual(charSequence, string2 = "android.resource");
        if (bl2) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(object);
            ((StringBuilder)charSequence).append('-');
            object = configArray.a.getResources().getConfiguration();
            configArray = m.a;
            int n3 = ((Configuration)object).uiMode & 0x30;
            ((StringBuilder)charSequence).append(n3);
            object = ((StringBuilder)charSequence).toString();
        } else {
            object = object.toString();
        }
        return object;
    }
}

