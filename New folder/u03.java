/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Messenger
 */
import android.content.Intent;
import android.os.Messenger;

public final class u03 {
    public static /* bridge */ /* synthetic */ Object a(Intent intent) {
        return intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
    }
}

