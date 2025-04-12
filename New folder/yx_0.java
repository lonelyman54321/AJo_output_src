/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 */
import android.content.Context;
import android.graphics.Rect;
import java.util.function.Consumer;

/*
 * Renamed from yx
 */
public final class yx_0 {
    public static /* bridge */ /* synthetic */ Context a(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static /* bridge */ /* synthetic */ void b(Consumer consumer, Rect rect) {
        consumer.accept(rect);
    }
}

