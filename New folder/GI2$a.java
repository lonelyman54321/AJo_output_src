/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.RemoteInput
 *  android.app.RemoteInput$Builder
 */
import android.app.RemoteInput;
import java.util.Set;

public final class GI2$a {
    public static Set a(RemoteInput remoteInput) {
        return remoteInput.getAllowedDataTypes();
    }

    public static void b(RemoteInput.Builder builder, String string2) {
        builder.setAllowDataType(string2, true);
    }
}

