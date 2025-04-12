/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap$Config
 *  android.os.Build$VERSION
 */
import android.graphics.Bitmap;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;

public final class f {
    public static final boolean a(Bitmap.Config config) {
        boolean bl2;
        Bitmap.Config config2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4 && config == (config2 = Kh.a())) {
            bl2 = true;
        } else {
            bl2 = false;
            config = null;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final int b(wq0 object, WS2 wS2) {
        void var3_7;
        boolean bl2 = object instanceof wq0$a;
        if (!bl2) {
            object = f$a.$EnumSwitchMapping$1;
            int n3 = wS2.ordinal();
            Object object2 = object[n3];
            if (object2 == (n3 = 1)) return (int)var3_7;
            n3 = 2;
            if (object2 == n3) {
                return (int)var3_7;
            }
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        object = (wq0$a)object;
        int n4 = ((wq0$a)object).a;
        return (int)var3_7;
    }
}

