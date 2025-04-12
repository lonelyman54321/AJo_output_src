/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.DeniedByServerException
 *  android.media.MediaCodec$CryptoException
 *  android.media.MediaDrm$MediaDrmStateException
 *  android.media.NotProvisionedException
 *  android.media.metrics.NetworkEvent
 *  android.media.metrics.NetworkEvent$Builder
 *  android.media.metrics.PlaybackErrorEvent
 *  android.media.metrics.PlaybackErrorEvent$Builder
 *  android.media.metrics.PlaybackMetrics
 *  android.media.metrics.PlaybackMetrics$Builder
 *  android.media.metrics.PlaybackSession
 *  android.media.metrics.PlaybackStateEvent
 *  android.media.metrics.PlaybackStateEvent$Builder
 *  android.media.metrics.TrackChangeEvent
 *  android.media.metrics.TrackChangeEvent$Builder
 *  android.net.Uri
 *  android.os.SystemClock
 *  android.system.ErrnoException
 *  android.system.OsConstants
 *  android.util.Pair
 */
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.MediaItem$e;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.common.f;
import androidx.media3.common.g;
import androidx.media3.common.g$b;
import androidx.media3.common.g$c;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.source.j$b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;

/*
 * Renamed from XM1
 */
public final class xm1_1
implements oe,
Pt2 {
    public boolean A;
    public final Context a;
    public final Lm0 b;
    public final PlaybackSession c;
    public final long d;
    public final g$c e;
    public final g$b f;
    public final HashMap g;
    public final HashMap h;
    public String i;
    public PlaybackMetrics.Builder j;
    public int k;
    public int l;
    public int m;
    public PlaybackException n;
    public XM1$b o;
    public XM1$b p;
    public XM1$b q;
    public d r;
    public d s;
    public d t;
    public boolean u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public xm1_1(Context object, PlaybackSession playbackSession) {
        long l2;
        this.a = object = object.getApplicationContext();
        this.c = playbackSession;
        this.e = object;
        super();
        this.f = object;
        super();
        this.h = object;
        super();
        this.g = object;
        this.d = l2 = SystemClock.elapsedRealtime();
        this.l = 0;
        this.m = 0;
        super();
        this.b = object;
        object.d = this;
    }

    public final void a(wc3_0 object) {
        Object object2 = this.o;
        if (object2 != null) {
            Object object3 = ((XM1$b)object2).a;
            int n3 = ((d)object3).w;
            int n4 = -1;
            if (n3 == n4) {
                int n7;
                object3 = ((d)object3).a();
                ((d$a)object3).u = n3 = ((wc3_0)object).a;
                ((d$a)object3).v = n7 = ((wc3_0)object).b;
                object = new d((d$a)object3);
                object2 = ((XM1$b)object2).b;
                this.o = object3 = new XM1$b((d)object, (String)object2);
            }
        }
    }

    public final void b(fj0 fj02) {
        int n3 = this.x;
        int n4 = fj02.g;
        this.x = n3 += n4;
        n3 = this.y;
        int n7 = fj02.e;
        this.y = n3 += n7;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean c(XM1$b object) {
        String string2;
        if (object == null) return false;
        object = ((XM1$b)object).b;
        Lm0 lm0 = this.b;
        synchronized (lm0) {
            string2 = lm0.f;
        }
        boolean bl2 = ((String)object).equals(string2);
        if (!bl2) return false;
        return true;
    }

    public final void d() {
        int n3;
        Object object = this.j;
        if (object != null && (n3 = this.A) != 0) {
            long l2;
            int n4;
            n3 = this.z;
            J60.a((PlaybackMetrics.Builder)object, n3);
            object = this.j;
            n3 = this.x;
            K60.a((PlaybackMetrics.Builder)object, n3);
            object = this.j;
            n3 = this.y;
            L60.b((PlaybackMetrics.Builder)object, n3);
            object = this.g;
            String string2 = this.i;
            object = (Long)((HashMap)object).get(string2);
            string2 = this.j;
            long l3 = 0L;
            long l4 = object == null ? l3 : (Long)object;
            N60.b((PlaybackMetrics.Builder)string2, l4);
            object = this.h;
            string2 = this.i;
            object = (Long)((HashMap)object).get(string2);
            string2 = this.j;
            l4 = object == null ? l3 : (Long)object;
            O60.b((PlaybackMetrics.Builder)string2, l4);
            string2 = this.j;
            if (object != null && (n4 = (l2 = (l4 = ((Long)object).longValue()) - l3) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0) {
                n4 = 1;
            } else {
                n4 = 0;
                object = null;
            }
            P60.b((PlaybackMetrics.Builder)string2, n4);
            object = this.c;
            string2 = FM1.a(this.j);
            GM1.a((PlaybackSession)object, (PlaybackMetrics)string2);
        }
        this.j = null;
        this.i = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.A = false;
    }

    public final void e(g object, j$b object2) {
        int n3;
        int n4;
        PlaybackMetrics.Builder builder = this.j;
        if (object2 == null) {
            return;
        }
        object2 = ((j$b)object2).a;
        int n7 = ((g)object).b(object2);
        if (n7 == (n4 = -1)) {
            return;
        }
        Object object3 = this.f;
        int n8 = 0;
        Uri uri = null;
        ((g)object).g(n7, (g$b)object3, false);
        n7 = ((g$b)object3).c;
        object3 = this.e;
        ((g)object).o(n7, (g$c)object3);
        object = ((g$c)object3).c.b;
        n7 = 2;
        int n10 = 1;
        if (object != null) {
            uri = ((MediaItem$e)object).a;
            object = ((MediaItem$e)object).b;
            n3 = gz3.B(uri, (String)object);
            n8 = n3 != 0 ? (n3 != n10 ? (n3 != n7 ? 1 : 4) : 5) : 3;
        }
        OM1.a(builder, n8);
        long l2 = ((g$c)object3).m;
        long l3 = -9223372036854775807L;
        n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
        if (n3 != 0 && (n3 = (int)(((g$c)object3).k ? 1 : 0)) == 0 && (n3 = (int)(((g$c)object3).i ? 1 : 0)) == 0 && (n3 = (int)(((g$c)object3).b() ? 1 : 0)) == 0) {
            l2 = gz3.T(((g$c)object3).m);
            PM1.a(builder, l2);
        }
        if ((n3 = (int)(((g$c)object3).b() ? 1 : 0)) == 0) {
            n7 = 1;
        }
        QM1.a(builder, n7);
        this.A = n10;
    }

    public final void f(oe$a object, String string2) {
        boolean bl2;
        object = ((oe$a)object).d;
        if ((object == null || !(bl2 = ((j$b)object).b())) && (bl2 = string2.equals(object = this.i))) {
            this.d();
        }
        this.g.remove(string2);
        this.h.remove(string2);
    }

    public final void g(int n3, long l2, d d2, int n4) {
        TrackChangeEvent.Builder builder = KM1.a(n3);
        long l3 = this.d;
        builder = Q60.b(builder, l2 -= l3);
        int n7 = 1;
        if (d2 != null) {
            float f5;
            float f6;
            String string2;
            int n8;
            Yz.b(builder);
            int n10 = 2;
            float f7 = 2.8E-45f;
            if (n4 != n7) {
                n8 = 3;
                if (n4 != n10) {
                    n8 = n4 != n8 ? 1 : 4;
                }
            } else {
                n8 = 2;
            }
            km1_0.a(builder, n8);
            Object object = d2.n;
            if (object != null) {
                lm1_0.a(builder, (String)object);
            }
            if ((object = d2.o) != null) {
                mm1_0.a(builder, (String)object);
            }
            if ((object = d2.k) != null) {
                nm1_0.a(builder, (String)object);
            }
            if ((n8 = d2.j) != (n4 = -1)) {
                om1_0.a(builder, n8);
            }
            if ((n8 = d2.v) != n4) {
                pm1_0.a(builder, n8);
            }
            if ((n8 = d2.w) != n4) {
                qm1_0.a(builder, n8);
            }
            if ((n8 = d2.D) != n4) {
                rm1_0.a(builder, n8);
            }
            if ((n8 = d2.E) != n4) {
                NM1.a(builder, n8);
            }
            if ((string2 = d2.d) != null) {
                Object object2;
                int n14 = gz3.a;
                String string3 = "-";
                object = string2.split(string3, n4);
                n8 = 0;
                string2 = object[0];
                n14 = ((String[])object).length;
                if (n14 >= n10) {
                    object2 = object[n7];
                } else {
                    n10 = 0;
                    f7 = 0.0f;
                    object2 = null;
                }
                object2 = Pair.create((Object)string2, (Object)object2);
                object = (String)((Pair)object2).first;
                SM1.a(builder, (String)object);
                object2 = ((Pair)object2).second;
                if (object2 != null) {
                    object2 = (String)object2;
                    TM1.a(builder, (String)object2);
                }
            }
            if ((n10 = (int)((f6 = (f5 = d2.x) - (f7 = -1.0f)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) != 0) {
                UM1.a(builder, f5);
            }
        } else {
            VM1.a(builder);
        }
        this.A = n7;
        PlaybackSession playbackSession = this.c;
        builder = WM1.a(builder);
        xz_0.b(playbackSession, (TrackChangeEvent)builder);
    }

    public final void p(PlaybackException playbackException) {
        this.n = playbackException;
    }

    public final void q(jm1_0 jm1_02) {
        int n3;
        this.v = n3 = jm1_02.a;
    }

    public final void r(oe$a object, int n3, long l2) {
        Object object2 = ((oe$a)object).d;
        if (object2 != null) {
            object = ((oe$a)object).b;
            object = this.b.d((g)object, (j$b)object2);
            object2 = this.h;
            Long l3 = (Long)((HashMap)object2).get(object);
            HashMap hashMap = this.g;
            Long l4 = (Long)hashMap.get(object);
            long l7 = 0L;
            long l8 = l3 == null ? l7 : l3;
            Long l12 = l8 += l2;
            ((HashMap)object2).put(object, l12);
            if (l4 != null) {
                l7 = l4;
            }
            long l14 = n3;
            Long l15 = l7 += l14;
            hashMap.put(object, l15);
        }
    }

    public final void s(int n3) {
        int n4 = 1;
        if (n3 == n4) {
            this.u = n4;
        }
        this.k = n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final void t(f var1_1, oe$b var2_2) {
        block110: {
            block144: {
                block146: {
                    block145: {
                        block143: {
                            block142: {
                                block141: {
                                    block140: {
                                        block136: {
                                            block139: {
                                                block138: {
                                                    block137: {
                                                        block135: {
                                                            block134: {
                                                                block114: {
                                                                    block109: {
                                                                        block133: {
                                                                            block115: {
                                                                                block117: {
                                                                                    block132: {
                                                                                        block131: {
                                                                                            block130: {
                                                                                                block129: {
                                                                                                    block118: {
                                                                                                        block127: {
                                                                                                            block128: {
                                                                                                                block120: {
                                                                                                                    block126: {
                                                                                                                        block125: {
                                                                                                                            block124: {
                                                                                                                                block123: {
                                                                                                                                    block122: {
                                                                                                                                        block121: {
                                                                                                                                            block119: {
                                                                                                                                                block116: {
                                                                                                                                                    block113: {
                                                                                                                                                        var3_3 = this;
                                                                                                                                                        var4_4 = var2_2;
                                                                                                                                                        var5_6 = 1;
                                                                                                                                                        var6_7 = var2_2.a.a;
                                                                                                                                                        var7_8 = var6_7.size();
                                                                                                                                                        if (var7_8 == 0) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        var7_8 = 0;
                                                                                                                                                        var6_7 = null;
                                                                                                                                                        while (true) {
                                                                                                                                                            block106: {
                                                                                                                                                                block111: {
                                                                                                                                                                    var8_9 = var4_4.a.a;
                                                                                                                                                                    var9_10 = var8_9.size();
                                                                                                                                                                    var10_11 = 11;
                                                                                                                                                                    if (var7_8 >= var9_10) break;
                                                                                                                                                                    var8_9 = var4_4.a;
                                                                                                                                                                    var9_10 = var8_9.a(var7_8);
                                                                                                                                                                    var11_12 = (oe$a)var4_4.b.get(var9_10);
                                                                                                                                                                    var11_12.getClass();
                                                                                                                                                                    if (var9_10 != 0) break block111;
                                                                                                                                                                    var12_13 = var3_3.b;
                                                                                                                                                                    synchronized (var12_13) {
                                                                                                                                                                        block105: {
                                                                                                                                                                            block112: {
                                                                                                                                                                                block104: {
                                                                                                                                                                                    var8_9 = var12_13.d;
                                                                                                                                                                                    var8_9.getClass();
                                                                                                                                                                                    var8_9 = var12_13.e;
                                                                                                                                                                                    var13_14 = var11_12.b;
                                                                                                                                                                                    var12_13.e = var13_14;
                                                                                                                                                                                    var13_14 = var12_13.c;
                                                                                                                                                                                    var13_14 = var13_14.values();
                                                                                                                                                                                    var13_14 = var13_14.iterator();
lbl33:
                                                                                                                                                                                    // 4 sources

                                                                                                                                                                                    while ((var14_15 = var13_14.hasNext()) != 0) {
                                                                                                                                                                                        var15_16 = var13_14.next();
                                                                                                                                                                                        var16_17 = var12_13.e;
                                                                                                                                                                                        var10_11 = (int)(var15_16 = (Lm0$a)var15_16).b((g)var8_9, (g)var16_17);
                                                                                                                                                                                        if (var10_11 != 0 && (var10_11 = (int)var15_16.a((oe$a)var11_12)) == 0) continue;
                                                                                                                                                                                        break block104;
                                                                                                                                                                                    }
                                                                                                                                                                                    break block112;
                                                                                                                                                                                    catch (Throwable var4_5) {
                                                                                                                                                                                        break block105;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                var13_14.remove();
                                                                                                                                                                                var10_11 = (int)var15_16.e;
                                                                                                                                                                                if (var10_11 == 0) ** GOTO lbl33
                                                                                                                                                                                var16_17 = var15_16.a;
                                                                                                                                                                                var17_18 = var12_13.f;
                                                                                                                                                                                var10_11 = (int)var16_17.equals(var17_18);
                                                                                                                                                                                if (var10_11 != 0) {
                                                                                                                                                                                    var12_13.a((Lm0$a)var15_16);
                                                                                                                                                                                }
                                                                                                                                                                                var16_17 = var12_13.d;
                                                                                                                                                                                var15_16 = var15_16.a;
                                                                                                                                                                                var16_17 = (xm1_1)var16_17;
                                                                                                                                                                                var16_17.f((oe$a)var11_12, (String)var15_16);
                                                                                                                                                                                ** GOTO lbl33
                                                                                                                                                                            }
                                                                                                                                                                            var12_13.e((oe$a)var11_12);
                                                                                                                                                                            break block106;
                                                                                                                                                                        }
                                                                                                                                                                        throw var4_5;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                if (var9_10 == var10_11) {
                                                                                                                                                                    var8_9 = var3_3.b;
                                                                                                                                                                    var18_19 /* !! */  = var3_3.k;
                                                                                                                                                                    var8_9.g((oe$a)var11_12, var18_19 /* !! */ );
                                                                                                                                                                } else {
                                                                                                                                                                    var8_9 = var3_3.b;
                                                                                                                                                                    var8_9.f((oe$a)var11_12);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            var7_8 += var5_6;
                                                                                                                                                        }
                                                                                                                                                        var19_20 = SystemClock.elapsedRealtime();
                                                                                                                                                        var7_8 = (int)var4_4.a(0);
                                                                                                                                                        if (var7_8 != 0) {
                                                                                                                                                            var6_7 = (oe$a)var4_4.b.get(0);
                                                                                                                                                            var6_7.getClass();
                                                                                                                                                            var8_9 = var3_3.j;
                                                                                                                                                            if (var8_9 != null) {
                                                                                                                                                                var8_9 = var6_7.b;
                                                                                                                                                                var6_7 = var6_7.d;
                                                                                                                                                                var3_3.e((g)var8_9, (j$b)var6_7);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if ((var7_8 = (int)var4_4.a(var21_21 = 2)) != 0 && (var6_7 = var3_3.j) != null) {
                                                                                                                                                            block107: {
                                                                                                                                                                var6_7 = var1_1.getCurrentTracks().a.iterator();
                                                                                                                                                                while ((var9_10 = (int)var6_7.hasNext()) != 0) {
                                                                                                                                                                    var8_9 = (bq3$a)var6_7.next();
                                                                                                                                                                    var11_12 = null;
                                                                                                                                                                    for (var22_22 = 0; var22_22 < (var18_19 /* !! */  = var8_9.a); var22_22 += var5_6) {
                                                                                                                                                                        var12_13 = var8_9.e;
                                                                                                                                                                        var18_19 /* !! */  = (int)var12_13[var22_22];
                                                                                                                                                                        if (var18_19 /* !! */  == 0 || (var12_13 = var8_9.b.d[var22_22].s) == null) {
                                                                                                                                                                            continue;
                                                                                                                                                                        }
                                                                                                                                                                        break block107;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                var18_19 /* !! */  = 0;
                                                                                                                                                                var12_13 = null;
                                                                                                                                                            }
                                                                                                                                                            if (var12_13 != null) {
                                                                                                                                                                block108: {
                                                                                                                                                                    var6_7 = xm1_0.a(var3_3.j);
                                                                                                                                                                    var8_9 = null;
                                                                                                                                                                    for (var9_10 = 0; var9_10 < (var22_22 = var12_13.d); var9_10 += var5_6) {
                                                                                                                                                                        var11_12 = var12_13.a[var9_10].b;
                                                                                                                                                                        var13_14 = OF.d;
                                                                                                                                                                        var23_23 = (int)var11_12.equals(var13_14);
                                                                                                                                                                        if (var23_23 != 0) {
                                                                                                                                                                            var9_10 = 3;
                                                                                                                                                                        } else {
                                                                                                                                                                            var13_14 = OF.e;
                                                                                                                                                                            var23_23 = (int)var11_12.equals(var13_14);
                                                                                                                                                                            if (var23_23 != 0) {
                                                                                                                                                                                var9_10 = 2;
                                                                                                                                                                            } else {
                                                                                                                                                                                var13_14 = OF.c;
                                                                                                                                                                                var22_22 = (int)var11_12.equals(var13_14);
                                                                                                                                                                                if (var22_22 == 0) continue;
                                                                                                                                                                                var9_10 = 6;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        break block108;
                                                                                                                                                                    }
                                                                                                                                                                    var9_10 = 1;
                                                                                                                                                                }
                                                                                                                                                                ym1_0.a((PlaybackMetrics.Builder)var6_7, var9_10);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if ((var7_8 = (int)var4_4.a(1011)) != 0) {
                                                                                                                                                            var3_3.z = var7_8 = var3_3.z + var5_6;
                                                                                                                                                        }
                                                                                                                                                        var6_7 = var3_3.n;
                                                                                                                                                        var24_24 = 5;
                                                                                                                                                        var23_23 = 4;
                                                                                                                                                        if (var6_7 != null) break block113;
                                                                                                                                                        var7_8 = 1;
                                                                                                                                                        var9_10 = 2;
                                                                                                                                                        var25_25 = 9;
                                                                                                                                                        break block114;
                                                                                                                                                    }
                                                                                                                                                    var22_22 = var3_3.v;
                                                                                                                                                    if (var22_22 == var23_23) {
                                                                                                                                                        var22_22 = 1;
                                                                                                                                                    } else {
                                                                                                                                                        var22_22 = 0;
                                                                                                                                                        var11_12 = null;
                                                                                                                                                    }
                                                                                                                                                    var21_21 = var6_7.a;
                                                                                                                                                    var18_19 /* !! */  = 1001;
                                                                                                                                                    if (var21_21 == var18_19 /* !! */ ) {
                                                                                                                                                        var18_19 /* !! */  = 20;
                                                                                                                                                        var11_12 = new XM1$a(var18_19 /* !! */ , 0);
lbl143:
                                                                                                                                                        // 12 sources

                                                                                                                                                        while (true) {
                                                                                                                                                            var23_23 = 13;
                                                                                                                                                            var25_25 = 9;
                                                                                                                                                            break block109;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    var18_19 /* !! */  = var6_7 instanceof ExoPlaybackException;
                                                                                                                                                    if (var18_19 /* !! */  != 0) {
                                                                                                                                                        var12_13 = var6_7;
                                                                                                                                                        var12_13 = (ExoPlaybackException)var6_7;
                                                                                                                                                        var23_23 = var12_13.c;
                                                                                                                                                        if (var23_23 == var5_6) {
                                                                                                                                                            var23_23 = 1;
                                                                                                                                                        } else {
                                                                                                                                                            var23_23 = 0;
                                                                                                                                                            var13_14 = null;
                                                                                                                                                        }
                                                                                                                                                        var18_19 /* !! */  = var12_13.g;
                                                                                                                                                    } else {
                                                                                                                                                        var18_19 /* !! */  = 0;
                                                                                                                                                        var12_13 = null;
                                                                                                                                                        var23_23 = 0;
                                                                                                                                                        var13_14 = null;
                                                                                                                                                    }
                                                                                                                                                    var8_9 = ((Throwable)var6_7).getCause();
                                                                                                                                                    var8_9.getClass();
                                                                                                                                                    var25_25 = var8_9 instanceof IOException;
                                                                                                                                                    var14_15 = 24;
                                                                                                                                                    var10_11 = 27;
                                                                                                                                                    var5_6 = 23;
                                                                                                                                                    if (var25_25 == 0) break block115;
                                                                                                                                                    var18_19 /* !! */  = var8_9 instanceof HttpDataSource$InvalidResponseCodeException;
                                                                                                                                                    if (var18_19 /* !! */  == 0) break block116;
                                                                                                                                                    var8_9 = (HttpDataSource$InvalidResponseCodeException)var8_9;
                                                                                                                                                    var9_10 = var8_9.d;
                                                                                                                                                    var11_12 = new XM1$a(var24_24, var9_10);
                                                                                                                                                    ** GOTO lbl143
                                                                                                                                                }
                                                                                                                                                var18_19 /* !! */  = var8_9 instanceof HttpDataSource.InvalidContentTypeException;
                                                                                                                                                if (var18_19 /* !! */  != 0 || (var18_19 /* !! */  = var8_9 instanceof ParserException) != 0) break block117;
                                                                                                                                                var22_22 = var8_9 instanceof HttpDataSource$HttpDataSourceException;
                                                                                                                                                if (var22_22 != 0 || (var18_19 /* !! */  = var8_9 instanceof UdpDataSource.UdpDataSourceException) != 0) break block118;
                                                                                                                                                var22_22 = 1002;
                                                                                                                                                if (var21_21 != var22_22) break block119;
                                                                                                                                                var9_10 = 21;
                                                                                                                                                var11_12 = new XM1$a(var9_10, 0);
                                                                                                                                                ** GOTO lbl143
                                                                                                                                            }
                                                                                                                                            var22_22 = var8_9 instanceof DrmSession$DrmSessionException;
                                                                                                                                            if (var22_22 == 0) break block120;
                                                                                                                                            var8_9 = ((Throwable)var8_9).getCause();
                                                                                                                                            var8_9.getClass();
                                                                                                                                            var22_22 = var8_9 instanceof MediaDrm.MediaDrmStateException;
                                                                                                                                            if (var22_22 == 0) break block121;
                                                                                                                                            var8_9 = ((MediaDrm.MediaDrmStateException)var8_9).getDiagnosticInfo();
                                                                                                                                            var9_10 = gz3.q((String)var8_9);
                                                                                                                                            var22_22 = gz3.p(var9_10);
                                                                                                                                            switch (var22_22) {
                                                                                                                                                default: {
                                                                                                                                                    var14_15 = 27;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                case 6005: {
                                                                                                                                                    var14_15 = 26;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                case 6004: {
                                                                                                                                                    var14_15 = 25;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                case 6003: {
                                                                                                                                                    var14_15 = 28;
                                                                                                                                                }
                                                                                                                                                case 6002: 
                                                                                                                                            }
                                                                                                                                            var11_12 = new XM1$a(var14_15, var9_10);
                                                                                                                                            ** GOTO lbl143
                                                                                                                                        }
                                                                                                                                        var22_22 = gz3.a;
                                                                                                                                        if (var22_22 < var5_6 || (var22_22 = (int)gl0.b((Throwable)var8_9)) == 0) break block122;
                                                                                                                                        var11_12 = new XM1$a(var10_11, 0);
                                                                                                                                        ** GOTO lbl143
                                                                                                                                    }
                                                                                                                                    var22_22 = var8_9 instanceof NotProvisionedException;
                                                                                                                                    if (var22_22 == 0) break block123;
                                                                                                                                    var11_12 = new XM1$a(var14_15, 0);
                                                                                                                                    ** GOTO lbl143
                                                                                                                                }
                                                                                                                                var22_22 = var8_9 instanceof DeniedByServerException;
                                                                                                                                if (var22_22 == 0) break block124;
                                                                                                                                var9_10 = 29;
                                                                                                                                var11_12 = new XM1$a(var9_10, 0);
                                                                                                                                ** GOTO lbl143
                                                                                                                            }
                                                                                                                            var22_22 = var8_9 instanceof UnsupportedDrmException;
                                                                                                                            if (var22_22 == 0) break block125;
                                                                                                                            var11_12 = new XM1$a(var5_6, 0);
                                                                                                                            ** GOTO lbl143
                                                                                                                        }
                                                                                                                        var9_10 = var8_9 instanceof DefaultDrmSessionManager$MissingSchemeDataException;
                                                                                                                        if (var9_10 == 0) break block126;
                                                                                                                        var21_21 = 28;
                                                                                                                        var11_12 = new XM1$a(var21_21, 0);
                                                                                                                        ** GOTO lbl143
                                                                                                                    }
                                                                                                                    var9_10 = 30;
                                                                                                                    var11_12 = new XM1$a(var9_10, 0);
                                                                                                                    ** GOTO lbl143
                                                                                                                }
                                                                                                                var22_22 = var8_9 instanceof FileDataSource.FileDataSourceException;
                                                                                                                if (var22_22 == 0 || (var22_22 = (var11_12 = ((Throwable)var8_9).getCause()) instanceof FileNotFoundException) == 0) break block127;
                                                                                                                var8_9 = ((Throwable)var8_9).getCause();
                                                                                                                var8_9.getClass();
                                                                                                                var8_9 = var8_9.getCause();
                                                                                                                var22_22 = var8_9 instanceof ErrnoException;
                                                                                                                if (var22_22 == 0) break block128;
                                                                                                                var8_9 = (ErrnoException)var8_9;
                                                                                                                var9_10 = var8_9.errno;
                                                                                                                var22_22 = OsConstants.EACCES;
                                                                                                                if (var9_10 != var22_22) break block128;
                                                                                                                var9_10 = 32;
                                                                                                                var11_12 = new XM1$a(var9_10, 0);
                                                                                                                ** GOTO lbl143
                                                                                                            }
                                                                                                            var9_10 = 31;
                                                                                                            var11_12 = new XM1$a(var9_10, 0);
                                                                                                            ** while (true)
                                                                                                        }
                                                                                                        var25_25 = 9;
                                                                                                        var11_12 = new XM1$a(var25_25, 0);
lbl267:
                                                                                                        // 7 sources

                                                                                                        while (true) {
                                                                                                            var23_23 = 13;
                                                                                                            break block109;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    var25_25 = 9;
                                                                                                    var12_13 = sV1.b(var3_3.a);
                                                                                                    var18_19 /* !! */  = var12_13.c();
                                                                                                    var23_23 = 1;
                                                                                                    if (var18_19 /* !! */  != var23_23) break block129;
                                                                                                    var9_10 = 3;
                                                                                                    var11_12 = new XM1$a(var9_10, 0);
                                                                                                    ** GOTO lbl267
                                                                                                }
                                                                                                var12_13 = ((Throwable)var8_9).getCause();
                                                                                                var23_23 = var12_13 instanceof UnknownHostException;
                                                                                                if (var23_23 == 0) break block130;
                                                                                                var23_23 = 6;
                                                                                                var11_12 = new XM1$a(var23_23, 0);
                                                                                                ** GOTO lbl267
                                                                                            }
                                                                                            var23_23 = 6;
                                                                                            var18_19 /* !! */  = var12_13 instanceof SocketTimeoutException;
                                                                                            if (var18_19 /* !! */  == 0) break block131;
                                                                                            var18_19 /* !! */  = 7;
                                                                                            var11_12 = new XM1$a(var18_19 /* !! */ , 0);
                                                                                            ** GOTO lbl267
                                                                                        }
                                                                                        var18_19 /* !! */  = 7;
                                                                                        if (var22_22 == 0) break block132;
                                                                                        var8_9 = (HttpDataSource$HttpDataSourceException)var8_9;
                                                                                        var9_10 = var8_9.c;
                                                                                        var22_22 = 1;
                                                                                        if (var9_10 != var22_22) break block132;
                                                                                        var9_10 = 4;
                                                                                        var11_12 = new XM1$a(var9_10, 0);
                                                                                        ** GOTO lbl267
                                                                                    }
                                                                                    var9_10 = 4;
                                                                                    var14_15 = 8;
                                                                                    var11_12 = new XM1$a(var14_15, 0);
                                                                                    ** GOTO lbl267
                                                                                }
                                                                                var9_10 = 4;
                                                                                var18_19 /* !! */  = 7;
                                                                                var23_23 = 6;
                                                                                var14_15 = 8;
                                                                                var25_25 = 9;
                                                                                var22_22 = var22_22 != 0 ? 10 : 11;
                                                                                var26_26 = new XM1$a(var22_22, 0);
                                                                                var11_12 = var26_26;
                                                                                ** while (true)
                                                                            }
                                                                            var22_22 = 8;
                                                                            var21_21 = 28;
                                                                            var25_25 = 9;
                                                                            if (var23_23 != 0 && (var18_19 /* !! */  == 0 || var18_19 /* !! */  == (var22_22 = 1))) {
                                                                                var9_10 = 35;
                                                                                var11_12 = new XM1$a(var9_10, 0);
lbl325:
                                                                                // 3 sources

                                                                                while (true) {
                                                                                    var23_23 = 13;
                                                                                    break block109;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if (var23_23 == 0 || var18_19 /* !! */  != (var22_22 = 3)) break block133;
                                                                            var9_10 = 15;
                                                                            var11_12 = new XM1$a(var9_10, 0);
                                                                            ** GOTO lbl325
                                                                        }
                                                                        if (var23_23 != 0 && var18_19 /* !! */  == (var22_22 = 2)) {
                                                                            var11_12 = new XM1$a(var5_6, 0);
                                                                            ** continue;
                                                                        }
                                                                        var22_22 = var8_9 instanceof MediaCodecRenderer$DecoderInitializationException;
                                                                        if (var22_22 != 0) {
                                                                            var8_9 = ((MediaCodecRenderer$DecoderInitializationException)var8_9).d;
                                                                            var9_10 = gz3.q((String)var8_9);
                                                                            var23_23 = 13;
                                                                            var11_12 = new XM1$a(var23_23, var9_10);
                                                                        } else {
                                                                            var23_23 = 13;
                                                                            var22_22 = var8_9 instanceof MediaCodecDecoderException;
                                                                            var18_19 /* !! */  = 14;
                                                                            if (var22_22 != 0) {
                                                                                var8_9 = (MediaCodecDecoderException)var8_9;
                                                                                var9_10 = var8_9.a;
                                                                                var11_12 = new XM1$a(var18_19 /* !! */ , var9_10);
                                                                            } else {
                                                                                var22_22 = var8_9 instanceof OutOfMemoryError;
                                                                                if (var22_22 != 0) {
                                                                                    var11_12 = new XM1$a(var18_19 /* !! */ , 0);
                                                                                } else {
                                                                                    var22_22 = var8_9 instanceof AudioSink$InitializationException;
                                                                                    if (var22_22 != 0) {
                                                                                        var8_9 = (AudioSink$InitializationException)var8_9;
                                                                                        var18_19 /* !! */  = 17;
                                                                                        var9_10 = var8_9.a;
                                                                                        var11_12 = new XM1$a(var18_19 /* !! */ , var9_10);
                                                                                    } else {
                                                                                        var22_22 = var8_9 instanceof AudioSink$WriteException;
                                                                                        if (var22_22 != 0) {
                                                                                            var8_9 = (AudioSink$WriteException)var8_9;
                                                                                            var18_19 /* !! */  = 18;
                                                                                            var9_10 = var8_9.a;
                                                                                            var11_12 = new XM1$a(var18_19 /* !! */ , var9_10);
                                                                                        } else {
                                                                                            var22_22 = var8_9 instanceof MediaCodec.CryptoException;
                                                                                            if (var22_22 != 0) {
                                                                                                var8_9 = (MediaCodec.CryptoException)var8_9;
                                                                                                var9_10 = var8_9.getErrorCode();
                                                                                                var22_22 = gz3.p(var9_10);
                                                                                                switch (var22_22) {
                                                                                                    default: {
                                                                                                        var21_21 = 27;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 6005: {
                                                                                                        var21_21 = 26;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 6004: {
                                                                                                        var21_21 = 25;
                                                                                                        break;
                                                                                                    }
                                                                                                    case 6002: {
                                                                                                        var21_21 = 24;
                                                                                                    }
                                                                                                    case 6003: 
                                                                                                }
                                                                                                var11_12 = new XM1$a(var21_21, var9_10);
                                                                                            } else {
                                                                                                var9_10 = 22;
                                                                                                var11_12 = new XM1$a(var9_10, 0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    var8_9 = var3_3.c;
                                                                    var12_13 = MM1.a();
                                                                    var27_27 = var3_3.d;
                                                                    var27_27 = var19_20 - var27_27;
                                                                    var12_13 = AM1.a((PlaybackErrorEvent.Builder)var12_13, var27_27);
                                                                    var23_23 = var11_12.a;
                                                                    var12_13 = BM1.a((PlaybackErrorEvent.Builder)var12_13, var23_23);
                                                                    var22_22 = var11_12.b;
                                                                    var11_12 = DM1.a((PlaybackErrorEvent.Builder)var12_13, var22_22);
                                                                    var6_7 = H60.a(EM1.a((PlaybackErrorEvent.Builder)var11_12, (Exception)var6_7));
                                                                    I60.a((PlaybackSession)var8_9, (PlaybackErrorEvent)var6_7);
                                                                    var7_8 = 1;
                                                                    var3_3.A = var7_8;
                                                                    var8_9 = null;
                                                                    var3_3.n = null;
                                                                    var9_10 = 2;
                                                                }
                                                                var22_22 = (int)var4_4.a(var9_10);
                                                                if (var22_22 == 0) break block134;
                                                                var11_12 = var1_1.getCurrentTracks();
                                                                var18_19 /* !! */  = (int)var11_12.b(var9_10);
                                                                var5_6 = (int)var11_12.b(var7_8);
                                                                var14_15 = 3;
                                                                var10_11 = (int)var11_12.b(var14_15);
                                                                if (var18_19 /* !! */  != 0 || var5_6 != 0 || var10_11 != 0) break block135;
                                                            }
                                                            var24_24 = 10;
                                                            var25_25 = 4;
                                                            break block136;
                                                        }
                                                        if (var18_19 /* !! */  != 0) break block137;
                                                        var6_7 = var3_3.r;
                                                        var9_10 = gz3.a;
                                                        var21_21 = 0;
                                                        var7_8 = (int)Objects.equals(var6_7, null);
                                                        if (var7_8 != 0) break block138;
                                                        var6_7 = var3_3.r;
                                                        var29_28 = var6_7 == null ? 1 : 0;
                                                        var3_3.r = null;
                                                        var9_10 = 1;
                                                        var6_7 = this;
                                                        var30_29 = var19_20;
                                                        var24_24 = 10;
                                                        var25_25 = 4;
                                                        var23_23 = 0;
                                                        var13_14 = null;
                                                        var14_15 = var29_28;
                                                        this.g(var9_10, var19_20, null, var29_28);
                                                        break block139;
                                                    }
                                                    var21_21 = 0;
                                                }
                                                var24_24 = 10;
                                                var25_25 = 4;
                                            }
                                            if (var5_6 == 0) {
                                                var6_7 = var3_3.s;
                                                var9_10 = gz3.a;
                                                var7_8 = (int)Objects.equals(var6_7, null);
                                                if (var7_8 == 0) {
                                                    var6_7 = var3_3.s;
                                                    if (var6_7 == null) {
                                                        var14_15 = 1;
                                                    } else {
                                                        var14_15 = 0;
                                                        var15_16 = null;
                                                    }
                                                    var3_3.s = null;
                                                    var9_10 = 0;
                                                    var8_9 = null;
                                                    var6_7 = this;
                                                    var30_29 = var19_20;
                                                    var23_23 = 0;
                                                    var13_14 = null;
                                                    this.g(0, var19_20, null, var14_15);
                                                }
                                            }
                                            if (var10_11 == 0) {
                                                var6_7 = var3_3.t;
                                                var9_10 = gz3.a;
                                                var7_8 = (int)Objects.equals(var6_7, null);
                                                if (var7_8 == 0) {
                                                    var6_7 = var3_3.t;
                                                    if (var6_7 == null) {
                                                        var14_15 = 1;
                                                    } else {
                                                        var14_15 = 0;
                                                        var15_16 = null;
                                                    }
                                                    var3_3.t = null;
                                                    var9_10 = 2;
                                                    var6_7 = this;
                                                    var30_29 = var19_20;
                                                    var23_23 = 0;
                                                    var13_14 = null;
                                                    this.g(var9_10, var19_20, null, var14_15);
                                                }
                                            }
                                        }
                                        var6_7 = var3_3.o;
                                        var7_8 = (int)var3_3.c((XM1$b)var6_7);
                                        if (var7_8 != 0) {
                                            var6_7 = var3_3.o;
                                            var13_14 = var6_7.a;
                                            var7_8 = var13_14.w;
                                            var9_10 = -1;
                                            if (var7_8 != var9_10) {
                                                var6_7 = var3_3.r;
                                                var9_10 = gz3.a;
                                                var7_8 = (int)Objects.equals(var6_7, var13_14);
                                                if (var7_8 != 0) lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                                var6_7 = var3_3.r;
                                                if (var6_7 == null) {
                                                    var14_15 = 1;
                                                } else {
                                                    var14_15 = 0;
                                                    var15_16 = null;
                                                }
                                                var3_3.r = var13_14;
                                                var9_10 = 1;
                                                var6_7 = this;
                                                var30_29 = var19_20;
                                                this.g(var9_10, var19_20, (d)var13_14, var14_15);
                                                ** continue;
                                                var7_8 = 0;
                                                var6_7 = null;
                                                var3_3.o = null;
                                            }
                                        }
                                        if ((var7_8 = (int)var3_3.c((XM1$b)(var6_7 = var3_3.p))) != 0) {
                                            var13_14 = var3_3.p.a;
                                            var6_7 = var3_3.s;
                                            var9_10 = gz3.a;
                                            var7_8 = (int)Objects.equals(var6_7, var13_14);
                                            if (var7_8 != 0) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var6_7 = var3_3.s;
                                            if (var6_7 == null) {
                                                var14_15 = 1;
                                            } else {
                                                var14_15 = 0;
                                                var15_16 = null;
                                            }
                                            var3_3.s = var13_14;
                                            var9_10 = 0;
                                            var8_9 = null;
                                            var6_7 = this;
                                            var30_29 = var19_20;
                                            this.g(0, var19_20, (d)var13_14, var14_15);
                                            ** continue;
                                            var7_8 = 0;
                                            var6_7 = null;
                                            var3_3.p = null;
                                        }
                                        if ((var7_8 = (int)var3_3.c((XM1$b)(var6_7 = var3_3.q))) != 0) {
                                            var13_14 = var3_3.q.a;
                                            var6_7 = var3_3.t;
                                            var9_10 = gz3.a;
                                            var7_8 = (int)Objects.equals(var6_7, var13_14);
                                            if (var7_8 != 0) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var6_7 = var3_3.t;
                                            if (var6_7 == null) {
                                                var14_15 = 1;
                                            } else {
                                                var14_15 = 0;
                                                var15_16 = null;
                                            }
                                            var3_3.t = var13_14;
                                            var9_10 = 2;
                                            var6_7 = this;
                                            var30_29 = var19_20;
                                            this.g(var9_10, var19_20, (d)var13_14, var14_15);
                                            ** continue;
                                            var7_8 = 0;
                                            var6_7 = null;
                                            var3_3.q = null;
                                        }
                                        var6_7 = sV1.b(var3_3.a);
                                        var7_8 = var6_7.c();
                                        switch (var7_8) {
                                            default: {
                                                var14_15 = 1;
                                                break;
                                            }
                                            case 10: {
                                                var14_15 = 7;
                                                break;
                                            }
                                            case 9: {
                                                var14_15 = 8;
                                                break;
                                            }
                                            case 7: {
                                                var14_15 = 3;
                                                break;
                                            }
                                            case 5: {
                                                var14_15 = 6;
                                                break;
                                            }
                                            case 4: {
                                                var14_15 = 5;
                                                break;
                                            }
                                            case 3: {
                                                var14_15 = 4;
                                                break;
                                            }
                                            case 2: {
                                                var14_15 = 2;
                                                break;
                                            }
                                            case 1: {
                                                var14_15 = 9;
                                                break;
                                            }
                                            case 0: {
                                                var14_15 = 0;
                                                var15_16 = null;
                                            }
                                        }
                                        var7_8 = var3_3.m;
                                        if (var14_15 != var7_8) {
                                            var3_3.m = var14_15;
                                            var6_7 = var3_3.c;
                                            var8_9 = tm1_0.a(LM1.a(), var14_15);
                                            var30_29 = var3_3.d;
                                            var30_29 = var19_20 - var30_29;
                                            var8_9 = vm1_0.a(um1_0.a((NetworkEvent.Builder)var8_9, var30_29));
                                            wm1_0.a((PlaybackSession)var6_7, (NetworkEvent)var8_9);
                                        }
                                        if ((var7_8 = var1_1.getPlaybackState()) != (var9_10 = 2)) {
                                            var3_3.u = false;
                                        }
                                        if ((var6_7 = var1_1.getPlayerError()) == null) {
                                            var3_3.w = false;
                                        } else {
                                            var7_8 = (int)var4_4.a(var24_24);
                                            if (var7_8 != 0) {
                                                var7_8 = 1;
                                                var3_3.w = var7_8;
                                            }
                                        }
                                        var7_8 = var1_1.getPlaybackState();
                                        var9_10 = (int)var3_3.u;
                                        if (var9_10 == 0) break block140;
                                        var9_10 = 1;
                                        var10_11 = 5;
                                        break block110;
                                    }
                                    var9_10 = (int)var3_3.w;
                                    if (var9_10 == 0) break block141;
                                    var9_10 = 1;
                                    var10_11 = 13;
                                    break block110;
                                }
                                if (var7_8 != var25_25) break block142;
                                var9_10 = 1;
                                var10_11 = 11;
                                break block110;
                            }
                            var10_11 = 12;
                            var9_10 = 2;
                            if (var7_8 != var9_10) break block143;
                            var7_8 = var3_3.l;
                            if (var7_8 == 0 || var7_8 == var9_10 || var7_8 == var10_11) ** GOTO lbl645
                            var7_8 = (int)var1_1.getPlayWhenReady();
                            if (var7_8 == 0) {
                                var9_10 = 1;
                                var10_11 = 7;
                            } else {
                                var7_8 = var1_1.getPlaybackSuppressionReason();
                                var10_11 = var7_8 != 0 ? 10 : 6;
lbl642:
                                // 3 sources

                                while (true) {
                                    var9_10 = 1;
                                    break block110;
                                    break;
                                }
lbl645:
                                // 1 sources

                                var9_10 = 1;
                                var10_11 = 2;
                            }
                            break block110;
                        }
                        var9_10 = 3;
                        if (var7_8 != var9_10) break block144;
                        var7_8 = (int)var1_1.getPlayWhenReady();
                        if (var7_8 != 0) break block145;
                        var9_10 = 1;
                        var10_11 = 4;
                        break block110;
                    }
                    var7_8 = var1_1.getPlaybackSuppressionReason();
                    if (var7_8 == 0) break block146;
                    var10_11 = 9;
                    ** GOTO lbl642
                }
                var10_11 = 3;
                ** while (true)
            }
            var9_10 = 1;
            if (var7_8 != var9_10 || (var7_8 = var3_3.l) == 0) {
                var10_11 = var3_3.l;
            }
        }
        var7_8 = var3_3.l;
        if (var7_8 != var10_11) {
            var3_3.l = var10_11;
            var3_3.A = var9_10;
            var6_7 = var3_3.c;
            var8_9 = wz_0.a();
            var22_22 = var3_3.l;
            var8_9 = HM1.a((PlaybackStateEvent.Builder)var8_9, var22_22);
            var30_29 = var3_3.d;
            var8_9 = Xk0.a(Wk0.a((PlaybackStateEvent.Builder)var8_9, var19_20 -= var30_29));
            IM1.a((PlaybackSession)var6_7, (PlaybackStateEvent)var8_9);
        }
        if ((var9_10 = (int)var4_4.a(var7_8 = 1028)) != 0) {
            var8_9 = var3_3.b;
            var4_4 = (oe$a)var4_4.b.get(var7_8);
            var4_4.getClass();
            var8_9.b((oe$a)var4_4);
        }
    }

    public final void u(oe$a object, jm1_0 jm1_02) {
        block4: {
            XM1$b xM1$b;
            block2: {
                block3: {
                    j$b j$b = ((oe$a)object).d;
                    if (j$b == null) {
                        return;
                    }
                    d d2 = jm1_02.c;
                    d2.getClass();
                    j$b.getClass();
                    object = ((oe$a)object).b;
                    Lm0 lm0 = this.b;
                    object = lm0.d((g)object, j$b);
                    xM1$b = new XM1$b(d2, (String)object);
                    int n3 = jm1_02.b;
                    if (n3 == 0) break block2;
                    int n4 = 1;
                    if (n3 == n4) break block3;
                    n4 = 2;
                    if (n3 == n4) break block2;
                    n4 = 3;
                    if (n3 == n4) {
                        this.q = xM1$b;
                    }
                    break block4;
                }
                this.p = xM1$b;
                break block4;
            }
            this.o = xM1$b;
        }
    }
}

