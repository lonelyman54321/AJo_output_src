/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.view.contentcapture.ContentCaptureSession
 */
import android.media.AudioTrack;
import android.view.contentcapture.ContentCaptureSession;

/*
 * Renamed from t60
 */
public final class t60_0 {
    public static /* bridge */ /* synthetic */ ContentCaptureSession a(Object object) {
        return (ContentCaptureSession)object;
    }

    public static /* bridge */ /* synthetic */ void b(AudioTrack audioTrack, int n3, int n4) {
        audioTrack.setOffloadDelayPadding(n3, n4);
    }
}

