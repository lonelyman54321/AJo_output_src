/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;

public class mm$i
extends mm {
    public final boolean b() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        n3 = n3 >= n4 ? 1 : 0;
        return n3 != 0;
    }
}

