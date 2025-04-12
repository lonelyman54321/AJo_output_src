/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.browse.MediaBrowser
 *  android.media.browse.MediaBrowser$ItemCallback
 */
import android.media.browse.MediaBrowser;
import androidx.fragment.app.FragmentActivity;

public final class t6 {
    public static /* bridge */ /* synthetic */ int a(FragmentActivity fragmentActivity, int n3) {
        return fragmentActivity.getColor(n3);
    }

    public static /* bridge */ /* synthetic */ void b(MediaBrowser mediaBrowser, String string2, MediaBrowser.ItemCallback itemCallback) {
        mediaBrowser.getItem(string2, itemCallback);
    }
}

