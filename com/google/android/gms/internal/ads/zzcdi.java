/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnBufferingUpdateListener
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnInfoListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.media.MediaPlayer$OnVideoSizeChangedListener
 *  android.media.MediaPlayer$TrackInfo
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.view.Surface
 *  android.view.TextureView$SurfaceTextureListener
 *  android.view.View
 *  android.view.View$MeasureSpec
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcdb;
import com.google.android.gms.internal.ads.zzcdc;
import com.google.android.gms.internal.ads.zzcdd;
import com.google.android.gms.internal.ads.zzcde;
import com.google.android.gms.internal.ads.zzcdf;
import com.google.android.gms.internal.ads.zzcdg;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzcdj;
import com.google.android.gms.internal.ads.zzcdk;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzced;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzfuv;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class zzcdi
extends zzcdk
implements TextureView.SurfaceTextureListener,
MediaPlayer.OnBufferingUpdateListener,
MediaPlayer.OnCompletionListener,
MediaPlayer.OnErrorListener,
MediaPlayer.OnInfoListener,
MediaPlayer.OnPreparedListener,
MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzcee zzd;
    private final zzcef zze;
    private final boolean zzf;
    private int zzg = 0;
    private int zzh = 0;
    private MediaPlayer zzi;
    private Uri zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzcec zzn;
    private final boolean zzo;
    private int zzp;
    private zzcdj zzq;
    private boolean zzr = false;
    private Integer zzs = null;

    static {
        HashMap<Integer, String> hashMap;
        zzc = hashMap = new HashMap<Integer, String>();
        Integer n3 = -1004;
        hashMap.put(n3, "MEDIA_ERROR_IO");
        n3 = -1007;
        hashMap.put(n3, "MEDIA_ERROR_MALFORMED");
        n3 = -1010;
        hashMap.put(n3, "MEDIA_ERROR_UNSUPPORTED");
        n3 = -110;
        hashMap.put(n3, "MEDIA_ERROR_TIMED_OUT");
        n3 = 3;
        hashMap.put(n3, "MEDIA_INFO_VIDEO_RENDERING_START");
        n3 = 100;
        hashMap.put(n3, "MEDIA_ERROR_SERVER_DIED");
        n3 = 1;
        hashMap.put(n3, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(n3, "MEDIA_INFO_UNKNOWN");
        n3 = 700;
        hashMap.put(n3, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        n3 = 701;
        hashMap.put(n3, "MEDIA_INFO_BUFFERING_START");
        n3 = 702;
        hashMap.put(n3, "MEDIA_INFO_BUFFERING_END");
        n3 = 800;
        hashMap.put(n3, "MEDIA_INFO_BAD_INTERLEAVING");
        n3 = 801;
        hashMap.put(n3, "MEDIA_INFO_NOT_SEEKABLE");
        n3 = 802;
        hashMap.put(n3, "MEDIA_INFO_METADATA_UPDATE");
        n3 = 901;
        hashMap.put(n3, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        n3 = 902;
        hashMap.put(n3, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcdi(Context context, zzcee zzcee2, boolean bl2, boolean bl3, zzced zzced2, zzcef zzcef2) {
        super(context);
        this.setSurfaceTextureListener(this);
        this.zzd = zzcee2;
        this.zze = zzcef2;
        this.zzo = bl2;
        this.zzf = bl3;
        zzcef2.zza(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzD() {
        MediaPlayer mediaPlayer;
        int n3;
        block8: {
            Context context;
            int n4;
            Object object;
            Object object2;
            block7: {
                com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView init MediaPlayer");
                object2 = this.getSurfaceTexture();
                Uri uri = this.zzj;
                if (uri == null) return;
                if (object2 == null) {
                    return;
                }
                uri = null;
                this.zzE(false);
                n3 = 1;
                try {
                    zzu.zzk();
                    object = new MediaPlayer();
                    this.zzi = object;
                    object.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener)this);
                    object = this.zzi;
                    object.setOnCompletionListener((MediaPlayer.OnCompletionListener)this);
                    object = this.zzi;
                    object.setOnErrorListener((MediaPlayer.OnErrorListener)this);
                    object = this.zzi;
                    object.setOnInfoListener((MediaPlayer.OnInfoListener)this);
                    object = this.zzi;
                    object.setOnPreparedListener((MediaPlayer.OnPreparedListener)this);
                    object = this.zzi;
                    object.setOnVideoSizeChangedListener((MediaPlayer.OnVideoSizeChangedListener)this);
                    this.zzm = 0;
                    n4 = this.zzo;
                    if (n4 == 0) break block7;
                    context = this.getContext();
                    object = new zzcec(context);
                    this.zzn = object;
                    int n7 = this.getWidth();
                    int n8 = this.getHeight();
                    ((zzcec)object).zzd((SurfaceTexture)object2, n7, n8);
                    object = this.zzn;
                    ((Thread)object).start();
                    object = this.zzn;
                    object = ((zzcec)object).zzb();
                    if (object != null) {
                        object2 = object;
                    } else {
                        object = this.zzn;
                        ((zzcec)object).zze();
                        n4 = 0;
                        object = null;
                        this.zzn = null;
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    break block8;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    break block8;
                }
                catch (IOException iOException) {
                    break block8;
                }
            }
            object = this.zzi;
            context = this.getContext();
            Uri uri = this.zzj;
            object.setDataSource(context, uri);
            zzu.zzl();
            object = new Surface(object2);
            object2 = this.zzi;
            object2.setSurface((Surface)object);
            object2 = this.zzi;
            n4 = 3;
            object2.setAudioStreamType(n4);
            object2 = this.zzi;
            object2.setScreenOnWhilePlaying(n3 != 0);
            object2 = this.zzi;
            object2.prepareAsync();
            this.zzF(n3);
            return;
        }
        String string2 = String.valueOf(this.zzj);
        String string3 = "Failed to initialize MediaPlayer at ";
        string2 = string3.concat(string2);
        com.google.android.gms.ads.internal.util.client.zzm.zzk(string2, (Throwable)mediaPlayer);
        mediaPlayer = this.zzi;
        this.onError(mediaPlayer, n3, 0);
    }

    private final void zzE(boolean bl2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView release");
        zzcec zzcec2 = this.zzn;
        if (zzcec2 != null) {
            zzcec2.zze();
            this.zzn = null;
        }
        if ((zzcec2 = this.zzi) != null) {
            zzcec2.reset();
            this.zzi.release();
            this.zzi = null;
            zzcec2 = null;
            this.zzF(0);
            if (bl2) {
                this.zzh = 0;
            }
        }
    }

    private final void zzF(int n3) {
        int n4 = 3;
        if (n3 == n4) {
            this.zze.zzc();
            zzcei zzcei2 = this.zzb;
            zzcei2.zzb();
        } else {
            int n7 = this.zzg;
            if (n7 == n4) {
                this.zze.zze();
                zzcei zzcei3 = this.zzb;
                zzcei3.zzc();
            }
        }
        this.zzg = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzG(float f5) {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            return;
        }
        try {
            mediaPlayer.setVolume(f5, f5);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            return;
        }
    }

    private final boolean zzH() {
        boolean bl2;
        boolean bl3;
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null && (bl3 = this.zzg) != (bl2 = -1 != 0) && bl3 && bl3 != (bl2 = true)) {
            return bl2;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ zzcdj zzi(zzcdi zzcdi2) {
        return zzcdi2.zzq;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzcdi zzcdi2, boolean bl2) {
        zzcdi2.zzr = true;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzcdi zzcdi2, MediaPlayer object) {
        block15: {
            Object object2 = "frameRate";
            Serializable serializable = zzbep.zzbR;
            zzben zzben2 = zzba.zzc();
            serializable = (Boolean)zzben2.zza((zzbeg)((Object)serializable));
            boolean bl2 = (Boolean)serializable;
            if (bl2 && (serializable = zzcdi2.zzd) != null && object != null) {
                int n3;
                try {
                    object = object.getTrackInfo();
                    if (object == null) break block15;
                }
                catch (RuntimeException runtimeException) {
                    object = "AdMediaPlayerView.reportMetadata";
                    object2 = zzu.zzo();
                    ((zzcby)object2).zzw(runtimeException, (String)object);
                }
                serializable = new Serializable();
                zzben2 = null;
                for (int i3 = 0; i3 < (n3 = ((MediaPlayer.TrackInfo[])object).length); ++i3) {
                    boolean bl3;
                    String string2;
                    Object object3;
                    Object object4 = object[i3];
                    if (object4 == null) continue;
                    int n4 = object4.getTrackType();
                    int n7 = 30;
                    int n8 = 1;
                    float f5 = Float.MIN_VALUE;
                    String string3 = "codecs-string";
                    String string4 = "mime";
                    if (n4 != n8) {
                        n8 = 2;
                        f5 = 2.8E-45f;
                        if (n4 != n8 || (object4 = object4.getFormat()) == null) continue;
                        n4 = (int)(object4.containsKey(string4) ? 1 : 0);
                        if (n4 != 0) {
                            object3 = object4.getString(string4);
                            string2 = "audioMime";
                            serializable.put(string2, (String)object3);
                        }
                        if ((n4 = Build.VERSION.SDK_INT) < n7 || (n4 = (int)(object4.containsKey(string3) ? 1 : 0)) == 0) continue;
                        object4 = object4.getString(string3);
                        object3 = "audioCodec";
                        serializable.put((String)object3, (String)object4);
                        continue;
                    }
                    if ((object4 = object4.getFormat()) == null) continue;
                    object3 = "frame-rate";
                    n8 = (int)(object4.containsKey((String)object3) ? 1 : 0);
                    if (n8 != 0) {
                        f5 = object4.getFloat((String)object3);
                        string2 = String.valueOf(f5);
                        try {
                            serializable.put((String)object2, string2);
                        }
                        catch (ClassCastException classCastException) {
                            n4 = object4.getInteger((String)object3);
                            object3 = String.valueOf(n4);
                            serializable.put((String)object2, (String)object3);
                        }
                    }
                    if ((n8 = (int)(object4.containsKey((String)(object3 = "bitrate")) ? 1 : 0)) != 0) {
                        n4 = object4.getInteger((String)object3);
                        zzcdi2.zzs = object3 = Integer.valueOf(n4);
                        object3 = String.valueOf(object3);
                        string2 = "bitRate";
                        serializable.put(string2, (String)object3);
                    }
                    if ((n8 = (int)(object4.containsKey((String)(object3 = "width")) ? 1 : 0)) != 0 && (bl3 = object4.containsKey(string2 = "height"))) {
                        n4 = object4.getInteger((String)object3);
                        n8 = object4.getInteger(string2);
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(n4);
                        stringBuilder.append("x");
                        stringBuilder.append(n8);
                        object3 = stringBuilder.toString();
                        string2 = "resolution";
                        serializable.put(string2, (String)object3);
                    }
                    if ((n4 = (int)(object4.containsKey(string4) ? 1 : 0)) != 0) {
                        object3 = object4.getString(string4);
                        string2 = "videoMime";
                        serializable.put(string2, (String)object3);
                    }
                    if ((n4 = Build.VERSION.SDK_INT) < n7 || (n4 = (int)(object4.containsKey(string3) ? 1 : 0)) == 0) continue;
                    object4 = object4.getString(string3);
                    object3 = "videoCodec";
                    serializable.put((String)object3, (String)object4);
                }
                boolean bl4 = serializable.isEmpty();
                if (!bl4) {
                    zzcdi2.zzd.zzd("onMetadataEvent", (Map)((Object)serializable));
                    return;
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzv(zzcdi zzcdi2) {
        return zzcdi2.zzr;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int n3) {
        this.zzm = n3;
    }

    public final void onCompletion(MediaPlayer object) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView completion");
        int n3 = 5;
        this.zzF(n3);
        this.zzh = n3;
        object = zzt.zza;
        zzcdb zzcdb2 = new zzcdb(this);
        object.post((Runnable)zzcdb2);
    }

    public final boolean onError(MediaPlayer object, int n3, int n4) {
        object = zzc;
        Object object2 = n3;
        object2 = (String)object.get(object2);
        Object object3 = n4;
        object = (String)object.get(object3);
        object3 = new StringBuilder("AdMediaPlayerView MediaPlayer error: ");
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(":");
        ((StringBuilder)object3).append((String)object);
        com.google.android.gms.ads.internal.util.client.zzm.zzj(((StringBuilder)object3).toString());
        n4 = -1;
        this.zzF(n4);
        this.zzh = n4;
        object3 = zzt.zza;
        zzcdc zzcdc2 = new zzcdc(this, (String)object2, (String)object);
        object3.post(zzcdc2);
        return true;
    }

    public final boolean onInfo(MediaPlayer object, int n3, int n4) {
        object = zzc;
        Object object2 = n3;
        object2 = (String)object.get(object2);
        Comparable<Integer> comparable = n4;
        object = (String)object.get(comparable);
        comparable = new Comparable<Integer>("AdMediaPlayerView MediaPlayer info: ");
        ((StringBuilder)comparable).append((String)object2);
        ((StringBuilder)comparable).append(":");
        ((StringBuilder)comparable).append((String)object);
        com.google.android.gms.ads.internal.util.zze.zza(((StringBuilder)comparable).toString());
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public final void onMeasure(int var1_1, int var2_2) {
        block8: {
            block13: {
                block14: {
                    block11: {
                        block12: {
                            block9: {
                                block10: {
                                    var3_3 = View.getDefaultSize((int)this.zzk, (int)var1_1);
                                    var4_4 = View.getDefaultSize((int)this.zzl, (int)var2_2);
                                    var5_5 = this.zzk;
                                    if (var5_5 <= 0 || (var5_5 = this.zzl) <= 0 || (var6_6 = this.zzn) != null) break block8;
                                    var3_3 = View.MeasureSpec.getMode((int)var1_1);
                                    var1_1 = View.MeasureSpec.getSize((int)var1_1);
                                    var4_4 = View.MeasureSpec.getMode((int)var2_2);
                                    var2_2 = View.MeasureSpec.getSize((int)var2_2);
                                    var5_5 = 0x40000000;
                                    if (var3_3 != var5_5) break block9;
                                    if (var4_4 != var5_5) break block10;
                                    var3_3 = this.zzk;
                                    var4_4 = var3_3 * var2_2;
                                    var5_5 = this.zzl;
                                    var7_7 = var1_1 * var5_5;
                                    if (var4_4 < var7_7) {
                                        var3_3 = var4_4 / var5_5;
lbl18:
                                        // 3 sources

                                        while (true) {
                                            var4_4 = var2_2;
                                            break block8;
                                            break;
                                        }
                                    }
                                    if (var4_4 > var7_7) {
                                        var4_4 = var7_7 / var3_3;
lbl23:
                                        // 3 sources

                                        while (true) {
                                            var3_3 = var1_1;
                                            break block8;
                                            break;
                                        }
                                    }
                                    break block11;
                                }
                                var3_3 = 0x40000000;
                            }
                            var7_8 = -1 << -1;
                            if (var3_3 != var5_5) break block12;
                            var3_3 = this.zzl * var1_1;
                            var5_5 = this.zzk;
                            if (var4_4 == var7_8 && (var3_3 /= var5_5) > var2_2) break block11;
                            var4_4 = var3_3;
                            ** GOTO lbl23
                        }
                        if (var4_4 != var5_5) break block13;
                        var4_4 = this.zzk * var2_2;
                        var5_5 = this.zzl;
                        if (var3_3 != var7_8 || (var4_4 /= var5_5) <= var1_1) break block14;
                    }
                    var3_3 = var1_1;
                    ** GOTO lbl18
                }
lbl46:
                // 2 sources

                while (true) {
                    var3_3 = var4_4;
                    ** continue;
                    break;
                }
            }
            var5_5 = this.zzk;
            var8_9 = this.zzl;
            if (var4_4 == var7_8 && var8_9 > var2_2) {
                var4_4 = var2_2 * var5_5 / var8_9;
            } else {
                var4_4 = var5_5;
                var2_2 = var8_9;
            }
            ** while (var3_3 != var7_8 || var4_4 <= var1_1)
lbl58:
            // 1 sources

            var4_4 = (var8_9 *= var1_1) / var5_5;
            ** while (true)
        }
        this.setMeasuredDimension(var3_3, var4_4);
        var9_10 = this.zzn;
        if (var9_10 != null) {
            var9_10.zzc(var3_3, var4_4);
        }
    }

    public final void onPrepared(MediaPlayer object) {
        Object object2;
        int n3;
        int n4;
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView prepared");
        this.zzF(2);
        this.zze.zzb();
        zzfuv zzfuv2 = zzt.zza;
        Object object3 = new zzcda(this, (MediaPlayer)object);
        zzfuv2.post((Runnable)object3);
        this.zzk = n4 = object.getVideoWidth();
        this.zzl = n3 = object.getVideoHeight();
        n3 = this.zzp;
        if (n3 != 0) {
            this.zzq(n3);
        }
        n3 = (int)(this.zzf ? 1 : 0);
        n4 = 3;
        if (n3 != 0 && (n3 = (int)(this.zzH() ? 1 : 0)) != 0 && (n3 = (object = this.zzi).getCurrentPosition()) > 0 && (n3 = this.zzh) != n4) {
            long l2;
            long l3;
            long l4;
            long l7;
            int n7;
            com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView nudging MediaPlayer");
            this.zzG(0.0f);
            this.zzi.start();
            object = this.zzi;
            n3 = object.getCurrentPosition();
            object3 = zzu.zzB();
            long l8 = object3.currentTimeMillis();
            while ((n7 = this.zzH()) != 0 && (n7 = (object2 = this.zzi).getCurrentPosition()) == n3 && (l7 = (l4 = (l3 = (object2 = zzu.zzB()).currentTimeMillis() - l8) - (l2 = 250L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0) {
            }
            object = this.zzi;
            object.pause();
            this.zzn();
        }
        n3 = this.zzk;
        int n8 = this.zzl;
        object2 = "AdMediaPlayerView stream dimensions: ";
        StringBuilder stringBuilder = new StringBuilder((String)object2);
        stringBuilder.append(n3);
        stringBuilder.append(" x ");
        stringBuilder.append(n8);
        object = stringBuilder.toString();
        com.google.android.gms.ads.internal.util.client.zzm.zzi((String)object);
        n3 = this.zzh;
        if (n3 == n4) {
            this.zzp();
        }
        this.zzn();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture object, int n3, int n4) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface created");
        this.zzD();
        object = zzt.zza;
        zzcdd zzcdd2 = new zzcdd(this);
        object.post((Runnable)zzcdd2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture object) {
        int n3;
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface destroyed");
        object = this.zzi;
        if (object != null && (n3 = this.zzp) == 0) {
            int bl2;
            this.zzp = bl2 = object.getCurrentPosition();
        }
        if ((object = this.zzn) != null) {
            object.zze();
        }
        object = zzt.zza;
        zzcdf zzcdf2 = new zzcdf(this);
        object.post((Runnable)zzcdf2);
        boolean bl2 = true;
        this.zzE(bl2);
        return bl2;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture object, int n3, int n4) {
        Object object2;
        object = "AdMediaPlayerView surface changed";
        com.google.android.gms.ads.internal.util.zze.zza((String)object);
        int n7 = this.zzh;
        int n8 = this.zzk;
        boolean bl2 = false;
        if (n8 == n3 && (n8 = this.zzl) == n4) {
            bl2 = true;
        }
        if ((object2 = this.zzi) != null && n7 == (n8 = 3) && bl2) {
            n7 = this.zzp;
            if (n7 != 0) {
                this.zzq(n7);
            }
            this.zzp();
        }
        if ((object = this.zzn) != null) {
            object.zzc(n3, n4);
        }
        object = zzt.zza;
        object2 = new zzcde(this, n3, n4);
        object.post((Runnable)object2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        zzcdj zzcdj2 = this.zzq;
        this.zza.zza(surfaceTexture, zzcdj2);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int n3, int n4) {
        int n7;
        String string2 = "AdMediaPlayerView size changed: ";
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(n3);
        stringBuilder.append(" x ");
        stringBuilder.append(n4);
        String string3 = stringBuilder.toString();
        com.google.android.gms.ads.internal.util.zze.zza(string3);
        this.zzk = n3 = mediaPlayer.getVideoWidth();
        this.zzl = n7 = mediaPlayer.getVideoHeight();
        n3 = this.zzk;
        if (n3 != 0 && n7 != 0) {
            this.requestLayout();
        }
    }

    public final void onWindowVisibilityChanged(int n3) {
        Object object = new StringBuilder("AdMediaPlayerView window visibility changed to ");
        object.append(n3);
        com.google.android.gms.ads.internal.util.zze.zza(object.toString());
        object = zzt.zza;
        zzccz zzccz2 = new zzccz(this, n3);
        object.post(zzccz2);
        super.onWindowVisibilityChanged(n3);
    }

    public final String toString() {
        String string2 = zzcdi.class.getName();
        String string3 = Integer.toHexString(this.hashCode());
        return n1.a(string2, "@", string3);
    }

    public final int zza() {
        boolean bl2 = this.zzH();
        if (bl2) {
            return this.zzi.getCurrentPosition();
        }
        return 0;
    }

    public final int zzb() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4 && (n3 = (int)(this.zzH() ? 1 : 0)) != 0) {
            return ek3_1.a(this.zzi).getInt("android.media.mediaplayer.dropped");
        }
        return -1;
    }

    public final int zzc() {
        boolean bl2 = this.zzH();
        if (bl2) {
            return this.zzi.getDuration();
        }
        return -1;
    }

    public final int zzd() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public final int zze() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public final long zzf() {
        return 0L;
    }

    public final long zzg() {
        Integer n3 = this.zzs;
        if (n3 != null) {
            long l2 = this.zzh();
            long l3 = this.zzm;
            return l2 * l3 / (long)100;
        }
        return -1;
    }

    public final long zzh() {
        Integer n3 = this.zzs;
        if (n3 != null) {
            long l2 = this.zzc();
            long l3 = this.zzs.intValue();
            return l2 * l3;
        }
        return -1;
    }

    public final String zzj() {
        boolean bl2 = true;
        boolean bl3 = this.zzo;
        String string2 = bl2 != bl3 ? "" : " spherical";
        return "MediaPlayer".concat(string2);
    }

    public final /* synthetic */ void zzm(int n3) {
        zzcdj zzcdj2 = this.zzq;
        if (zzcdj2 != null) {
            zzcdj2.onWindowVisibilityChanged(n3);
        }
    }

    public final void zzn() {
        float f5 = this.zzb.zza();
        this.zzG(f5);
    }

    public final void zzo() {
        Object object = "AdMediaPlayerView pause";
        com.google.android.gms.ads.internal.util.zze.zza(object);
        boolean bl2 = this.zzH();
        int n3 = 4;
        if (bl2 && (bl2 = (object = this.zzi).isPlaying())) {
            this.zzi.pause();
            this.zzF(n3);
            object = zzt.zza;
            zzcdh zzcdh2 = new zzcdh(this);
            object.post((Runnable)zzcdh2);
        }
        this.zzh = n3;
    }

    public final void zzp() {
        Object object = "AdMediaPlayerView play";
        com.google.android.gms.ads.internal.util.zze.zza(object);
        boolean bl2 = this.zzH();
        int n3 = 3;
        if (bl2) {
            this.zzi.start();
            this.zzF(n3);
            this.zza.zzb();
            object = zzt.zza;
            zzcdg zzcdg2 = new zzcdg(this);
            object.post((Runnable)zzcdg2);
        }
        this.zzh = n3;
    }

    public final void zzq(int n3) {
        String string2 = "AdMediaPlayerView seek ";
        CharSequence charSequence = new StringBuilder(string2);
        charSequence.append(n3);
        charSequence = charSequence.toString();
        com.google.android.gms.ads.internal.util.zze.zza((String)charSequence);
        boolean bl2 = this.zzH();
        if (bl2) {
            this.zzi.seekTo(n3);
            this.zzp = 0;
            return;
        }
        this.zzp = n3;
    }

    public final void zzr(zzcdj zzcdj2) {
        this.zzq = zzcdj2;
    }

    public final void zzs(String string2) {
        String string3;
        zzbcy zzbcy2 = zzbcy.zza((Uri)(string2 = Uri.parse((String)string2)));
        if (zzbcy2 != null && (string3 = zzbcy2.zza) == null) {
            return;
        }
        if (zzbcy2 != null) {
            string2 = Uri.parse((String)zzbcy2.zza);
        }
        this.zzj = string2;
        this.zzp = 0;
        this.zzD();
        this.requestLayout();
        this.invalidate();
    }

    public final void zzt() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzi.release();
            this.zzi = null;
            mediaPlayer = null;
            this.zzF(0);
            this.zzh = 0;
        }
        this.zze.zzd();
    }

    public final void zzu(float f5, float f6) {
        zzcec zzcec2 = this.zzn;
        if (zzcec2 != null) {
            zzcec2.zzf(f5, f6);
        }
    }
}

