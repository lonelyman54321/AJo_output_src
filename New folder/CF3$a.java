/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  android.os.Build$VERSION
 */
import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CF3$a
extends mm$i {
    public final Pattern d;

    public CF3$a() {
        Object object = "ALGORITHMIC_DARKENING";
        super((String)object, (String)object);
        this.d = object = Pattern.compile("\\A\\d+");
    }

    public final boolean c() {
        int n3;
        int n4;
        int n7 = super.c();
        if (n7 != 0 && (n4 = Build.VERSION.SDK_INT) < (n3 = 29)) {
            Object object;
            n7 = BF3.a;
            n7 = 26;
            if (n4 >= n7) {
                object = sm_0.a();
            } else {
                try {
                    object = BF3.a();
                }
                catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
                    n7 = 0;
                    object = null;
                }
            }
            n4 = 0;
            if (object == null) {
                return false;
            }
            Object object2 = this.d;
            String string2 = ((PackageInfo)object).versionName;
            boolean n8 = ((Matcher)(object2 = ((Pattern)object2).matcher(string2))).find();
            if (n8) {
                object = ((PackageInfo)object).versionName;
                int n10 = ((Matcher)object2).start();
                n3 = ((Matcher)object2).end();
                n7 = Integer.parseInt((String)(object = ((String)object).substring(n10, n3)));
                if (n7 >= (n3 = 105)) {
                    n4 = 1;
                }
            }
            return n4 != 0;
        }
        return n7 != 0;
    }
}

