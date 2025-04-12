/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BlendMode
 *  android.graphics.BlendModeColorFilter
 *  android.graphics.ColorFilter
 */
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;

public final class By$a {
    public static ColorFilter a(int n3, Object object) {
        object = (BlendMode)object;
        BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(n3, (BlendMode)object);
        return blendModeColorFilter;
    }
}

