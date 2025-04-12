/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.ColorSpace
 */
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import java.nio.file.attribute.FileTime;

public final class us0 {
    public static /* bridge */ /* synthetic */ long a(FileTime fileTime) {
        return fileTime.toMillis();
    }

    public static /* bridge */ /* synthetic */ ColorSpace b(BitmapFactory.Options options) {
        return options.outColorSpace;
    }
}

