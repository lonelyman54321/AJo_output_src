/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.res.AssetFileDescriptor
 *  android.media.AudioTrack
 *  android.media.AudioTrack$StreamEventCallback
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.exoplayer.audio.DefaultAudioSink$k$a;

public final class n70 {
    public static /* bridge */ /* synthetic */ AssetFileDescriptor a(ContentResolver contentResolver, Uri uri, Bundle bundle) {
        return contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
    }

    public static /* bridge */ /* synthetic */ void b(AudioTrack audioTrack, DefaultAudioSink$k$a defaultAudioSink$k$a) {
        audioTrack.unregisterStreamEventCallback((AudioTrack.StreamEventCallback)defaultAudioSink$k$a);
    }
}

