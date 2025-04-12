/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$Action
 *  android.app.RemoteInput
 *  android.os.Bundle
 */
import android.app.Notification;
import android.app.RemoteInput;
import android.os.Bundle;

public final class A42$a$a {
    public static Bundle a(Notification.Action action) {
        return action.getExtras();
    }

    public static RemoteInput[] b(Notification.Action action) {
        return action.getRemoteInputs();
    }
}

