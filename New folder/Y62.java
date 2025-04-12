/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.RenderEffect
 */
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RenderEffect;

public final class Y62 {
    public static /* bridge */ /* synthetic */ RenderEffect a(PorterDuffColorFilter porterDuffColorFilter) {
        return RenderEffect.createColorFilterEffect((ColorFilter)porterDuffColorFilter);
    }
}

