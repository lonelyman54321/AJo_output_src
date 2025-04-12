/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.net.Uri
 *  android.view.Surface
 *  android.view.TextureView$SurfaceTextureListener
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import in.juspay.hypersdk.core.B;
import in.juspay.hypersdk.core.DuiLogger;
import in.juspay.hypersdk.core.InflateView;
import org.json.JSONObject;

class InflateView$2
implements TextureView.SurfaceTextureListener {
    private boolean isDrawn = false;
    final /* synthetic */ InflateView this$0;
    final /* synthetic */ Context val$context;
    final /* synthetic */ MediaPlayer val$mMediaPlayer;
    final /* synthetic */ JSONObject val$properties;
    final /* synthetic */ Uri val$uri;

    public InflateView$2(InflateView inflateView, MediaPlayer mediaPlayer, Context context, Uri uri, JSONObject jSONObject) {
        this.this$0 = inflateView;
        this.val$mMediaPlayer = mediaPlayer;
        this.val$context = context;
        this.val$uri = uri;
        this.val$properties = jSONObject;
    }

    public static /* synthetic */ void a(MediaPlayer mediaPlayer, MediaPlayer mediaPlayer2) {
        mediaPlayer.start();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int n3, int n4) {
        Exception exception2;
        block4: {
            block3: {
                n3 = (int)(this.isDrawn ? 1 : 0);
                if (n3 != 0) {
                    return;
                }
                n3 = 1;
                try {
                    this.isDrawn = n3;
                    Object object = this.val$mMediaPlayer;
                    object.reset();
                    object = this.val$mMediaPlayer;
                    Context context = this.val$context;
                    Uri uri = this.val$uri;
                    object.setDataSource(context, uri);
                    object = this.val$mMediaPlayer;
                    context = new Surface(surfaceTexture);
                    object.setSurface((Surface)context);
                    surfaceTexture = this.val$mMediaPlayer;
                    surfaceTexture.prepareAsync();
                    surfaceTexture = this.val$properties;
                    object = "autoloop";
                    context = null;
                    boolean bl2 = surfaceTexture.optBoolean((String)object, false);
                    if (!bl2) break block3;
                    surfaceTexture = this.val$mMediaPlayer;
                    surfaceTexture.setLooping(n3 != 0);
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            surfaceTexture = this.val$mMediaPlayer;
            B b2 = new B((MediaPlayer)surfaceTexture);
            surfaceTexture.setOnPreparedListener((MediaPlayer.OnPreparedListener)b2);
            return;
        }
        DuiLogger duiLogger = this.this$0.dynamicUI.getLogger();
        String string2 = "Exception in TextureView: ";
        CharSequence charSequence = new StringBuilder(string2);
        charSequence.append(exception2);
        String string3 = charSequence.toString();
        charSequence = "TextureView";
        duiLogger.e((String)charSequence, string3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        try {
            surfaceTexture = this.val$mMediaPlayer;
        }
        catch (Exception exception) {
            return true;
        }
        surfaceTexture.stop();
        surfaceTexture = this.val$mMediaPlayer;
        surfaceTexture.release();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int n3, int n4) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

