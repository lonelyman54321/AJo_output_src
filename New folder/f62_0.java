/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.graphics.Path
 *  android.util.Property
 */
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

/*
 * Renamed from f62
 */
public final class f62_0 {
    public static ObjectAnimator a(Object object, Property property, Path path) {
        return ObjectAnimator.ofObject((Object)object, (Property)property, null, (Path)path);
    }
}

