/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
import android.os.Build;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;

public final class BE {
    public static Object a(Bundle bundle, String clazz) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 34;
        if (n3 >= n4) {
            return BE$a.a(bundle, (String)((Object)clazz));
        }
        clazz = ActivityResult.class;
        boolean bl2 = clazz.isInstance(bundle = bundle.getParcelable((String)((Object)clazz)));
        if (!bl2) {
            bundle = null;
        }
        return bundle;
    }
}

