/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 */
import android.os.Build;
import android.text.TextUtils;

/*
 * Renamed from fN1
 */
public final class fn1_0 {
    public lN1 a;

    public fn1_0(String object, int n3, int n4) {
        if (object != null) {
            int n7 = TextUtils.isEmpty((CharSequence)object);
            if (n7 == 0) {
                n7 = Build.VERSION.SDK_INT;
                int n8 = 28;
                if (n7 >= n8) {
                    kN1 kN12;
                    super((String)object, n3, n4);
                    jN1.a(n3, n4, (String)object);
                    this.a = kN12;
                } else {
                    lN1 lN12;
                    this.a = lN12 = new lN1((String)object, n3, n4);
                }
                return;
            }
            object = new IllegalArgumentException("packageName should be nonempty");
            throw object;
        }
        object = new NullPointerException("package shouldn't be null");
        throw object;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof fn1_0;
        if (!bl2) {
            return false;
        }
        object = ((fn1_0)object).a;
        return this.a.equals(object);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

