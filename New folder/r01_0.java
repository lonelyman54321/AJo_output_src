/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationChannel
 */
import android.app.NotificationChannel;
import java.nio.file.FileSystem;
import java.util.Set;

/*
 * Renamed from r01
 */
public final class r01_0 {
    public static /* bridge */ /* synthetic */ Set a(FileSystem fileSystem) {
        return fileSystem.supportedFileAttributeViews();
    }

    public static /* bridge */ /* synthetic */ void b(NotificationChannel notificationChannel, String string2) {
        notificationChannel.setName((CharSequence)string2);
    }
}

