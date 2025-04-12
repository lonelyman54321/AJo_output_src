/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;

public class RW0 {
    public final RW0$b a;

    public RW0() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            RW0$a rW0$a = new RW0$a();
            this.a = rW0$a;
        } else {
            RW0$b rW0$b;
            this.a = rW0$b;
        }
    }
}

