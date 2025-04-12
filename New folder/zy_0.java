/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;

/*
 * Renamed from zy
 */
public final class zy_0 {
    public static final boolean a(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public static final int b(Object object) {
        int n3;
        boolean bl2 = object instanceof Bitmap;
        if (bl2) {
            object = (Bitmap)object;
            n3 = object.getByteCount() / 1024;
        } else {
            bl2 = object instanceof byte[];
            if (bl2) {
                object = (byte[])object;
                n3 = ((Object)object).length / 1024;
            } else {
                n3 = 1;
            }
        }
        return n3;
    }
}

