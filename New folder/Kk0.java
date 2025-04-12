/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.view.accessibility.AccessibilityManager
 */
import android.media.AudioTrack;
import android.view.accessibility.AccessibilityManager;

public final class Kk0 {
    public static /* bridge */ /* synthetic */ int a(AccessibilityManager accessibilityManager, int n3, int n4) {
        return accessibilityManager.getRecommendedTimeoutMillis(n3, n4);
    }

    public static /* bridge */ /* synthetic */ boolean b(AudioTrack audioTrack) {
        return audioTrack.isOffloadedPlayback();
    }
}

