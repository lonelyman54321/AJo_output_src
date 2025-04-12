/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.os.Build$VERSION
 */
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/*
 * Renamed from By
 */
public final class by_0 {
    public static ColorFilter a(int n3, hy_0 object) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 29;
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (n4 >= n7) {
            if ((object = Iy$b.a(object)) != null) {
                porterDuffColorFilter = By$a.a(n3, object);
            }
            return porterDuffColorFilter;
        }
        if ((object = iy_0.a(object)) != null) {
            porterDuffColorFilter = new PorterDuffColorFilter(n3, (PorterDuff.Mode)object);
        }
        return porterDuffColorFilter;
    }
}

