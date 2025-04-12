/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.RemoteInput
 *  android.app.RemoteInput$Builder
 */
import android.app.RemoteInput;

public final class GI2$b {
    public static int a(RemoteInput remoteInput) {
        return remoteInput.getEditChoicesBeforeSending();
    }

    public static void b(RemoteInput.Builder builder, int n3) {
        builder.setEditChoicesBeforeSending(n3);
    }
}

