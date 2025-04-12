/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCrypto
 *  android.view.ActionMode
 */
import android.media.MediaCrypto;
import android.view.ActionMode;

public final class NL1 {
    public static /* bridge */ /* synthetic */ void a(MediaCrypto mediaCrypto, byte[] byArray) {
        mediaCrypto.setMediaDrmSession(byArray);
    }

    public static /* bridge */ /* synthetic */ void b(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }
}

