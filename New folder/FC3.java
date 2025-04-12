/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.autofill.AutofillId
 */
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;

public final class FC3 {
    public static Zs a(View view) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            view = FC3$a.a(view);
            Zs zs = new Zs((AutofillId)view);
            return zs;
        }
        return null;
    }
}

