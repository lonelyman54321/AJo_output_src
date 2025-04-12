/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.session.MediaSession
 *  android.media.session.MediaSessionManager$RemoteUserInfo
 */
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;

public final class dN1 {
    public static /* bridge */ /* synthetic */ MediaSessionManager.RemoteUserInfo a(MediaSession mediaSession) {
        return mediaSession.getCurrentControllerInfo();
    }
}

