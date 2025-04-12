/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.os.Build$VERSION
 */
import android.graphics.Bitmap;
import android.os.Build;
import java.io.Serializable;

public final class b {
    public static final int a(Bitmap object) {
        int n3 = object.isRecycled();
        int n4 = 1;
        if ((n3 ^= n4) != 0) {
            int n7;
            try {
                n7 = object.getAllocationByteCount();
            }
            catch (Exception exception) {
                n3 = object.getWidth();
                int n8 = object.getHeight() * n3;
                object = object.getConfig();
                Bitmap.Config config = Bitmap.Config.ALPHA_8;
                if (object != config) {
                    config = Bitmap.Config.RGB_565;
                    n4 = 2;
                    if (object != config && object != (config = Bitmap.Config.ARGB_4444)) {
                        n3 = Build.VERSION.SDK_INT;
                        n4 = 26;
                        n4 = n3 >= n4 && object == (config = Jh.a()) ? 8 : 4;
                    }
                }
                n7 = n8 * n4;
            }
            return n7;
        }
        Serializable serializable = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        serializable.append(object);
        serializable.append(" [");
        n4 = object.getWidth();
        serializable.append(n4);
        serializable.append(" x ");
        n4 = object.getHeight();
        serializable.append(n4);
        serializable.append("] + ");
        object = object.getConfig();
        serializable.append(object);
        object = serializable.toString();
        object = object.toString();
        serializable = new IllegalStateException((String)object);
        throw serializable;
    }

    public static final boolean b(Bitmap.Config config) {
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
}

