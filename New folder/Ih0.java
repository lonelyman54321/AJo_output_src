/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationChannel
 *  android.graphics.Canvas
 *  android.graphics.RectF
 */
import android.app.NotificationChannel;
import android.graphics.Canvas;
import android.graphics.RectF;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public final class Ih0 {
    public static /* synthetic */ NotificationChannel a(String string2) {
        NotificationChannel notificationChannel = new NotificationChannel("com.google.android.gms.availability", (CharSequence)string2, 4);
        return notificationChannel;
    }

    public static /* bridge */ /* synthetic */ Set b() {
        return PosixFilePermissions.fromString("rw-------");
    }

    public static /* bridge */ /* synthetic */ void c(Canvas canvas, RectF rectF) {
        canvas.clipOutRect(rectF);
    }
}

