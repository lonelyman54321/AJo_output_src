/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioDeviceInfo
 *  android.media.LoudnessCodecController
 *  android.media.MediaCodec
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 */
package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import androidx.media3.common.d;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.b$a;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.e$b;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$e;
import androidx.media3.exoplayer.mediacodec.d$a;
import androidx.media3.exoplayer.mediacodec.d$b;
import androidx.media3.exoplayer.mediacodec.e;
import androidx.media3.exoplayer.n$a;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.MoreExecutors;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class g
extends MediaCodecRenderer
implements EL1 {
    public final Context T0;
    public final b$a U0;
    public final AudioSink V0;
    public final RC1 W0;
    public int X0;
    public boolean Y0;
    public boolean Z0;
    public d a1;
    public d b1;
    public long c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public int g1;

    public g(Context object, d$b d$b, boolean bl2, Handler handler, e$b e$b, DefaultAudioSink defaultAudioSink) {
        RC1 rC1;
        int n3 = gz3.a;
        int n4 = 35;
        if (n3 >= n4) {
            rC1 = new RC1();
        } else {
            n3 = 0;
            rC1 = null;
        }
        super(1, d$b, bl2, 44100.0f);
        this.T0 = object = object.getApplicationContext();
        this.V0 = defaultAudioSink;
        this.W0 = rC1;
        this.g1 = -1000;
        super(handler, e$b);
        this.U0 = object;
        super(this);
        defaultAudioSink.s = object;
    }

    public final void A() {
        b$a b$a = this.U0;
        this.e1 = true;
        Object object = null;
        this.a1 = null;
        try {
            object = this.V0;
        }
        catch (Throwable throwable) {
            try {
                super.A();
                throw throwable;
            }
            finally {
                fj0 fj02 = this.O0;
                b$a.a(fj02);
            }
        }
        object.flush();
        try {
            super.A();
            return;
        }
        finally {
            object = this.O0;
            b$a.a((fj0)object);
        }
    }

    public final void B(boolean bl2, boolean bl3) {
        Object object = new Object();
        this.O0 = object;
        Object object2 = this.U0;
        Handler handler = ((b$a)object2).a;
        if (handler != null) {
            Fr fr = new Fr(0, object2, object);
            handler.post((Runnable)fr);
        }
        object = this.d;
        object.getClass();
        bl2 = ((uJ2)object).b;
        object2 = this.V0;
        if (bl2) {
            object2.o();
        } else {
            object2.f();
        }
        object = this.f;
        object.getClass();
        object2.n((nu2)object);
        object = this.g;
        object.getClass();
        object2.q((VV)object);
    }

    public final void C(long l2, boolean bl2) {
        super.C(l2, bl2);
        this.V0.flush();
        this.c1 = l2;
        this.f1 = false;
        this.d1 = true;
    }

    public final void D() {
        Object object = this.V0;
        object.release();
        int n3 = gz3.a;
        int n4 = 35;
        if (n3 >= n4 && (object = this.W0) != null) {
            HashSet hashSet = ((RC1)object).a;
            hashSet.clear();
            object = ((RC1)object).c;
            if (object != null) {
                OC1.a((LoudnessCodecController)object);
            }
        }
    }

    public final int D0(d object) {
        AudioSink audioSink = this.V0;
        object = audioSink.c((d)object);
        int n3 = ((Dr)object).a;
        if (n3 == 0) {
            return 0;
        }
        n3 = ((Dr)object).b;
        n3 = n3 != 0 ? 1536 : 512;
        boolean bl2 = ((Dr)object).c;
        if (bl2) {
            n3 |= 0x800;
        }
        return n3;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void E() {
        Throwable throwable222222;
        AudioSink audioSink = this.V0;
        this.f1 = false;
        boolean bl2 = false;
        Object var3_3 = null;
        this.M();
        this.q0();
        DrmSession drmSession = this.F;
        if (drmSession != null) {
            drmSession.e(null);
        }
        this.F = null;
        bl2 = this.e1;
        if (bl2) {
            this.e1 = false;
            audioSink.reset();
        }
        return;
        {
            catch (Throwable throwable222222) {}
        }
        catch (Throwable throwable3) {
            DrmSession drmSession2 = this.F;
            if (drmSession2 != null) {
                drmSession2.e(null);
            }
            this.F = null;
            throw throwable3;
        }
        boolean bl3 = this.e1;
        if (bl3) {
            this.e1 = false;
            audioSink.reset();
        }
        throw throwable222222;
    }

    public final int E0(e object, d d2) {
        int n3;
        String string2 = "OMX.google.raw.decoder";
        object = ((e)object).a;
        int n4 = string2.equals(object);
        if (n4 != 0 && (n4 = gz3.a) < (n3 = 24) && (n4 != (n3 = 23) || (n4 = (int)(gz3.G((Context)(object = this.T0)) ? 1 : 0)) == 0)) {
            return -1;
        }
        return d2.p;
    }

    public final void F() {
        this.V0.play();
    }

    public final void F0() {
        long l2;
        AudioSink audioSink = this.V0;
        boolean bl2 = this.b();
        long l3 = audioSink.k(bl2);
        long l4 = l3 - (l2 = Long.MIN_VALUE);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            boolean bl3 = this.d1;
            if (!bl3) {
                l2 = this.c1;
                l3 = Math.max(l2, l3);
            }
            this.c1 = l3;
            audioSink = null;
            this.d1 = false;
        }
    }

    public final void G() {
        this.F0();
        this.V0.pause();
    }

    public final hj0 K(e e2, d d2, d d5) {
        int n3;
        int n4;
        hj0 hj02 = e2.b(d2, d5);
        Object object = this.F;
        int n7 = 0;
        if (object == null && (n4 = this.y0(d5)) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        int n8 = hj02.e;
        if (n4 != 0) {
            n4 = 32768;
            n8 |= n4;
        }
        if ((n4 = this.E0(e2, d5)) > (n3 = this.X0)) {
            n8 |= 0x40;
        }
        int n10 = n8;
        int n14 = n8 != 0 ? 0 : (n7 = hj02.d);
        String string2 = e2.a;
        object = new hj0(string2, d2, d5, n14, n10);
        return object;
    }

    public final float V(float f5, d[] dArray) {
        int n3 = dArray.length;
        int n4 = -1;
        int n7 = -1;
        for (int i3 = 0; i3 < n3; ++i3) {
            d d2 = dArray[i3];
            int n8 = d2.E;
            if (n8 == n4) continue;
            n7 = Math.max(n7, n8);
        }
        if (n7 == n4) {
            f5 = -1.0f;
        } else {
            float f6 = n7;
            f5 *= f6;
        }
        return f5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final ArrayList W(androidx.media3.exoplayer.mediacodec.g var1_1, d var2_2, boolean var3_3) {
        block5: {
            block4: {
                var4_4 = var2_2.o;
                if (var4_4 != null) break block4;
                var1_1 = ImmutableList.of();
                break block5;
            }
            var4_4 = this.V0;
            var5_5 = var4_4.a((d)var2_2);
            if (!var5_5) ** GOTO lbl-1000
            var4_4 = MediaCodecUtil.e("audio/raw", false, false);
            var6_6 = var4_4.isEmpty();
            if (var6_6) {
                var5_5 = false;
                var4_4 = null;
            } else {
                var4_4 = (e)var4_4.get(0);
            }
            if (var4_4 != null) {
                var1_1 = ImmutableList.of(var4_4);
            } else lbl-1000:
            // 2 sources

            {
                var1_1 = MediaCodecUtil.g((androidx.media3.exoplayer.mediacodec.g)var1_1, (d)var2_2, var3_3, false);
            }
        }
        var7_7 /* !! */  = MediaCodecUtil.a;
        var7_7 /* !! */  = new ArrayList(var1_1);
        var1_1 = new tl1_0(var2_2);
        var2_2 = new UL1((MediaCodecUtil$e)var1_1);
        Collections.sort(var7_7 /* !! */ , var2_2);
        return var7_7 /* !! */ ;
    }

    public final d$a X(e e2, d d2, MediaCrypto mediaCrypto, float f5) {
        Object object;
        Object object2;
        Object object3;
        float f6;
        int n3;
        int n4;
        Object object4;
        Object object5;
        int n7;
        String string2;
        g g3 = this;
        e e5 = e2;
        d d5 = d2;
        float f7 = f5;
        Object object6 = this.j;
        object6.getClass();
        int n8 = this.E0(e2, d2);
        int n10 = ((d[])object6).length;
        int n14 = 1;
        d$a d$a = null;
        if (n10 != n14) {
            n10 = ((d[])object6).length;
            string2 = null;
            for (n7 = 0; n7 < n10; ++n7) {
                object5 = object6[n7];
                object4 = e2.b(d2, (d)object5);
                n4 = ((hj0)object4).d;
                if (n4 == 0) continue;
                n3 = this.E0(e2, (d)object5);
                n8 = Math.max(n8, n3);
            }
        }
        g3.X0 = n8;
        int n15 = gz3.a;
        n8 = 24;
        String string3 = e5.a;
        if (n15 < n8 && (n7 = (int)((string2 = "OMX.SEC.aac.dec").equals(string3) ? 1 : 0)) != 0 && (n7 = (int)((string2 = "samsung").equals(object5 = gz3.c) ? 1 : 0)) != 0 && ((n3 = (int)((string2 = gz3.b).startsWith((String)(object5 = "zeroflte")) ? 1 : 0)) != 0 || (n3 = (int)(string2.startsWith((String)(object5 = "herolte")) ? 1 : 0)) != 0 || (n7 = (int)(string2.startsWith((String)(object5 = "heroqlte")) ? 1 : 0)) != 0)) {
            n7 = 1;
        } else {
            n7 = 0;
            string2 = null;
        }
        g3.Y0 = n7;
        string2 = "OMX.google.opus.decoder";
        n7 = (int)(string3.equals(string2) ? 1 : 0);
        if (n7 == 0 && (n7 = (int)(string3.equals(string2 = "c2.android.opus.decoder") ? 1 : 0)) == 0 && (n7 = (int)(string3.equals(string2 = "OMX.google.vorbis.decoder") ? 1 : 0)) == 0 && (n10 = (int)(string3.equals(string2 = "c2.android.vorbis.decoder") ? 1 : 0)) == 0) {
            n10 = 0;
            string3 = null;
        } else {
            n10 = 1;
        }
        g3.Z0 = n10;
        n10 = g3.X0;
        string2 = new MediaFormat();
        object4 = e5.c;
        string2.setString("mime", (String)object4);
        n3 = d5.D;
        object4 = "channel-count";
        string2.setInteger((String)object4, n3);
        n4 = d5.E;
        string2.setInteger("sample-rate", n4);
        object5 = d5.r;
        hm1_0.b((MediaFormat)string2, (List)object5);
        object5 = "max-input-size";
        hm1_0.a((MediaFormat)string2, (String)object5, n10);
        n10 = 23;
        if (n15 >= n10) {
            object5 = "priority";
            string2.setInteger((String)object5, 0);
            f6 = -1.0f;
            n3 = (int)(f7 == f6 ? 0 : (f7 > f6 ? 1 : -1));
            if (n3 != 0 && (n15 != n10 || (n3 = (int)(((String)(object5 = "ZTE B2017G")).equals(string3 = gz3.d) ? 1 : 0)) == 0 && (n10 = (int)(((String)(object5 = "AXON 7 mini")).equals(string3) ? 1 : 0)) == 0)) {
                string3 = "operating-rate";
                string2.setFloat(string3, f7);
            }
        }
        int n16 = 28;
        f7 = 3.9E-44f;
        string3 = d5.o;
        if (n15 <= n16 && (n16 = (int)(((String)(object3 = "audio/ac4")).equals(string3) ? 1 : 0)) != 0) {
            object3 = "ac4-is-sync";
            string2.setInteger((String)object3, n14);
        }
        object3 = "audio/raw";
        if (n15 >= n8) {
            object2 = new androidx.media3.common.d$a();
            object = ip1_0.l((String)object3);
            ((androidx.media3.common.d$a)object2).n = object;
            ((androidx.media3.common.d$a)object2).C = n14 = d5.D;
            ((androidx.media3.common.d$a)object2).D = n4;
            ((androidx.media3.common.d$a)object2).E = n14 = 4;
            object5 = new d((androidx.media3.common.d$a)object2);
            object2 = g3.V0;
            n8 = object2.p((d)object5);
            n3 = 2;
            f6 = 2.8E-45f;
            if (n8 == n3) {
                object2 = "pcm-encoding";
                string2.setInteger((String)object2, n14);
            }
        }
        if (n15 >= (n8 = 32)) {
            object2 = "max-output-channel-count";
            n14 = 99;
            string2.setInteger((String)object2, n14);
        }
        if (n15 >= (n8 = 35)) {
            n15 = -g3.g1;
            n15 = Math.max(0, n15);
            object2 = "importance";
            string2.setInteger((String)object2, n15);
        }
        if ((n15 = (int)(((String)object3).equals(object6 = e5.b) ? 1 : 0)) != 0 && (n16 = (int)(((String)object3).equals(string3) ? 1 : 0)) == 0) {
            object3 = d5;
        } else {
            n16 = 0;
            f7 = 0.0f;
            object3 = null;
        }
        g3.b1 = object3;
        object = g3.W0;
        object3 = d$a;
        e5 = e2;
        object6 = string2;
        d5 = d2;
        string3 = mediaCrypto;
        d$a = new d$a(e2, (MediaFormat)string2, d2, null, mediaCrypto, (RC1)object);
        return d$a;
    }

    public final void Y(DecoderInputBuffer object) {
        Object object2;
        Object object3;
        int n3 = gz3.a;
        int n4 = 29;
        if (n3 >= n4 && (object3 = ((DecoderInputBuffer)object).b) != null && (n3 = (int)(Objects.equals(object3 = ((d)object3).o, object2 = "audio/opus") ? 1 : 0)) != 0 && (n3 = (int)(this.x0 ? 1 : 0)) != 0) {
            object3 = ((DecoderInputBuffer)object).g;
            object3.getClass();
            object = ((DecoderInputBuffer)object).b;
            object.getClass();
            n4 = ((Buffer)object3).remaining();
            int n7 = 8;
            if (n4 == n7) {
                object2 = ByteOrder.LITTLE_ENDIAN;
                long l2 = ((ByteBuffer)object3).order((ByteOrder)object2).getLong() * 48000L;
                long l3 = 1000000000L;
                n4 = (int)(l2 /= l3);
                object3 = this.V0;
                int n8 = ((d)object).G;
                object3.j(n8, n4);
            }
        }
    }

    public final boolean b() {
        AudioSink audioSink;
        boolean bl2 = this.K0;
        if (bl2 && (bl2 = (audioSink = this.V0).b())) {
            bl2 = true;
        } else {
            bl2 = false;
            audioSink = null;
        }
        return bl2;
    }

    public final boolean c() {
        AudioSink audioSink = this.V0;
        boolean bl2 = audioSink.d();
        if (!bl2 && !(bl2 = super.c())) {
            bl2 = false;
            audioSink = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final void d0(Exception exception) {
        Cx.d("Audio codec error", exception);
        b$a b$a = this.U0;
        Handler handler = b$a.a;
        if (handler != null) {
            Ir ir = new Ir(b$a, exception);
            handler.post((Runnable)ir);
        }
    }

    public final void e0(long l2, String string2, long l3) {
        b$a b$a = this.U0;
        Handler handler = b$a.a;
        if (handler != null) {
            Lr lr = new Lr(b$a, string2, l2, l3);
            handler.post((Runnable)lr);
        }
    }

    public final boolean f() {
        boolean bl2 = this.f1;
        this.f1 = false;
        return bl2;
    }

    public final void f0(String string2) {
        b$a b$a = this.U0;
        Handler handler = b$a.a;
        if (handler != null) {
            Mr mr = new Mr(b$a, string2);
            handler.post((Runnable)mr);
        }
    }

    public final hj0 g0(HV0 object) {
        d d2 = ((HV0)object).b;
        d2.getClass();
        this.a1 = d2;
        object = super.g0((HV0)object);
        b$a b$a = this.U0;
        Handler handler = b$a.a;
        if (handler != null) {
            Kr kr = new Kr(b$a, d2, (hj0)object);
            handler.post((Runnable)kr);
        }
        return object;
    }

    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    public final ot2_0 getPlaybackParameters() {
        return this.V0.getPlaybackParameters();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h0(d object, MediaFormat object2) {
        AudioSink$ConfigurationException audioSink$ConfigurationException2;
        block9: {
            AudioSink audioSink;
            int[] nArray;
            block7: {
                block8: {
                    int n3;
                    int n4;
                    block11: {
                        block13: {
                            int n7;
                            int n8;
                            block14: {
                                int n10;
                                int n14;
                                block15: {
                                    int n15;
                                    block16: {
                                        int n16;
                                        int n17;
                                        int n18;
                                        int n19;
                                        block12: {
                                            int n20;
                                            Object object3;
                                            block10: {
                                                n4 = 8;
                                                n19 = 7;
                                                n14 = 4;
                                                n18 = 5;
                                                n10 = 3;
                                                n15 = 6;
                                                n8 = 2;
                                                n7 = 1;
                                                object3 = this.b1;
                                                nArray = null;
                                                if (object3 == null) break block10;
                                                object = object3;
                                                break block11;
                                            }
                                            object3 = this.L;
                                            if (object3 == null) break block11;
                                            object2.getClass();
                                            object3 = ((d)object).o;
                                            String string2 = "audio/raw";
                                            int n21 = string2.equals(object3);
                                            n21 = n21 != 0 ? ((d)object).F : ((n21 = gz3.a) >= (n20 = 24) && (n20 = (int)(object2.containsKey((String)(object3 = "pcm-encoding")) ? 1 : 0)) != 0 ? object2.getInteger((String)object3) : ((n20 = (int)(object2.containsKey((String)(object3 = "v-bits-per-sample")) ? 1 : 0)) != 0 ? gz3.s(object2.getInteger((String)object3)) : 2));
                                            androidx.media3.common.d$a d$a = new androidx.media3.common.d$a();
                                            d$a.n = string2 = ip1_0.l(string2);
                                            d$a.E = n21;
                                            d$a.F = n21 = ((d)object).G;
                                            d$a.G = n21 = ((d)object).H;
                                            d$a.k = object3 = ((d)object).l;
                                            d$a.l = object3 = ((d)object).m;
                                            d$a.a = object3 = ((d)object).a;
                                            d$a.b = object3 = ((d)object).b;
                                            d$a.c = object3 = ImmutableList.copyOf((Collection)((d)object).c);
                                            d$a.d = object3 = ((d)object).d;
                                            d$a.e = n21 = ((d)object).e;
                                            d$a.f = n21 = ((d)object).f;
                                            d$a.C = n21 = object2.getInteger("channel-count");
                                            object3 = "sample-rate";
                                            d$a.D = n3 = object2.getInteger((String)object3);
                                            object2 = new d(d$a);
                                            n21 = (int)(this.Y0 ? 1 : 0);
                                            n17 = ((d)object2).D;
                                            if (n21 == 0 || n17 != n15 || (n16 = ((d)object).D) >= n15) break block12;
                                            nArray = new int[n16];
                                            for (n4 = 0; n4 < n16; n4 += n7) {
                                                nArray[n4] = n4;
                                            }
                                            break block13;
                                        }
                                        n16 = this.Z0;
                                        if (n16 == 0) break block13;
                                        if (n17 == n10) break block14;
                                        if (n17 == n18) break block15;
                                        if (n17 == n15) break block16;
                                        if (n17 != n19) {
                                            if (n17 == n4) {
                                                int[] nArray2 = nArray = new int[n4];
                                                int[] nArray3 = nArray;
                                                nArray2[0] = 0;
                                                nArray3[1] = 2;
                                                nArray2[2] = 1;
                                                nArray3[3] = 7;
                                                nArray2[4] = 5;
                                                nArray3[5] = 6;
                                                nArray2[6] = 3;
                                                nArray3[7] = 4;
                                            }
                                            break block13;
                                        } else {
                                            int[] nArray4 = nArray = new int[n19];
                                            int[] nArray5 = nArray;
                                            nArray4[0] = 0;
                                            nArray5[1] = 2;
                                            nArray4[2] = 1;
                                            nArray5[3] = 6;
                                            nArray4[4] = 5;
                                            nArray5[5] = 3;
                                            nArray5[6] = 4;
                                        }
                                        break block13;
                                    }
                                    int[] nArray6 = nArray = new int[n15];
                                    int[] nArray7 = nArray;
                                    nArray6[0] = 0;
                                    nArray7[1] = 2;
                                    nArray6[2] = 1;
                                    nArray7[3] = 5;
                                    nArray6[4] = 3;
                                    nArray7[5] = 4;
                                    break block13;
                                }
                                nArray = new int[]{0, n8, n7, n10, n14};
                                break block13;
                            }
                            nArray = new int[]{0, n8, n7};
                        }
                        object = object2;
                    }
                    try {
                        n3 = gz3.a;
                        n4 = 29;
                        audioSink = this.V0;
                        if (n3 < n4) break block7;
                        n3 = (int)(this.x0 ? 1 : 0);
                        if (n3 == 0) break block8;
                        object2 = this.d;
                        object2.getClass();
                        n3 = ((uJ2)object2).a;
                        if (n3 == 0) break block8;
                        object2 = this.d;
                        object2.getClass();
                        n3 = ((uJ2)object2).a;
                        audioSink.e(n3);
                        break block7;
                    }
                    catch (AudioSink$ConfigurationException audioSink$ConfigurationException2) {
                        break block9;
                    }
                }
                audioSink.e(0);
            }
            audioSink.l((d)object, nArray);
            return;
        }
        object2 = audioSink$ConfigurationException2.a;
        throw this.z(audioSink$ConfigurationException2, (d)object2, false, 5001);
    }

    public final void i0(long l2) {
        this.V0.getClass();
    }

    public final void j(int n3, Object iterator) {
        int n4 = 2;
        Object object = this.V0;
        if (n3 != n4) {
            n4 = 3;
            if (n3 != n4) {
                n4 = 6;
                if (n3 != n4) {
                    n4 = 12;
                    if (n3 != n4) {
                        n4 = 16;
                        int n7 = 35;
                        if (n3 != n4) {
                            n4 = 9;
                            if (n3 != n4) {
                                n4 = 10;
                                if (n3 != n4) {
                                    n4 = 11;
                                    if (n3 == n4) {
                                        iterator = (n$a)((Object)iterator);
                                        this.G = iterator;
                                    }
                                } else {
                                    iterator.getClass();
                                    iterator = (Integer)((Object)iterator);
                                    n3 = (Integer)((Object)iterator);
                                    object.setAudioSessionId(n3);
                                    int n8 = gz3.a;
                                    if (n8 >= n7 && (iterator = this.W0) != null) {
                                        LoudnessCodecController loudnessCodecController;
                                        Object object2 = ((RC1)((Object)iterator)).c;
                                        if (object2 != null) {
                                            OC1.a(object2);
                                            n4 = 0;
                                            object2 = null;
                                            ((RC1)((Object)iterator)).c = null;
                                        }
                                        object2 = MoreExecutors.directExecutor();
                                        object = new QC1((RC1)((Object)iterator));
                                        ((RC1)((Object)iterator)).c = loudnessCodecController = PC1.a(n3, (Executor)object2, (QC1)object);
                                        iterator = ((RC1)((Object)iterator)).a.iterator();
                                        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                                            object2 = (MediaCodec)iterator.next();
                                            n4 = (int)(MC1.a(loudnessCodecController, (MediaCodec)object2) ? 1 : 0);
                                            if (n4 != 0) continue;
                                            iterator.remove();
                                        }
                                    }
                                }
                            } else {
                                iterator.getClass();
                                iterator = (Boolean)((Object)iterator);
                                n3 = (int)(((Boolean)((Object)iterator)).booleanValue() ? 1 : 0);
                                object.setSkipSilenceEnabled(n3 != 0);
                            }
                        } else {
                            int n10;
                            iterator.getClass();
                            iterator = (Integer)((Object)iterator);
                            this.g1 = n3 = ((Integer)((Object)iterator)).intValue();
                            androidx.media3.exoplayer.mediacodec.d d2 = this.L;
                            if (d2 != null && (n10 = gz3.a) >= n7) {
                                iterator = new Iterator();
                                n4 = -this.g1;
                                n4 = Math.max(0, n4);
                                object = "importance";
                                iterator.putInt((String)object, n4);
                                d2.b((Bundle)iterator);
                            }
                        }
                    } else {
                        n3 = gz3.a;
                        n4 = 23;
                        if (n3 >= n4) {
                            AudioDeviceInfo audioDeviceInfo = mr_0.a(iterator);
                            object.setPreferredDevice(audioDeviceInfo);
                        }
                    }
                } else {
                    iterator = (dt)((Object)iterator);
                    iterator.getClass();
                    object.setAuxEffectInfo((dt)((Object)iterator));
                }
            } else {
                iterator = (dr_1)((Object)iterator);
                iterator.getClass();
                object.g((dr_1)((Object)iterator));
            }
        } else {
            iterator.getClass();
            iterator = (Float)((Object)iterator);
            float f5 = ((Float)((Object)iterator)).floatValue();
            object.setVolume(f5);
        }
    }

    public final void k0() {
        this.V0.m();
    }

    /*
     * Unable to fully structure code
     */
    public final boolean o0(long var1_1, long var3_2, androidx.media3.exoplayer.mediacodec.d var5_3, ByteBuffer var6_4, int var7_5, int var8_6, int var9_7, long var10_8, boolean var12_9, boolean var13_10, d var14_11) {
        var6_4.getClass();
        var15_12 = this.b1;
        var16_15 = 1;
        if (var15_12 != null && (var17_16 = var8_6 & 2) != 0) {
            var5_3.getClass();
            var5_3.i(var7_5);
            return (boolean)var16_15;
        }
        var15_12 = this.V0;
        if (var12_9) {
            if (var5_3 != null) {
                var5_3.i(var7_5);
            }
            var18_17 = this.O0;
            var18_17.f = var19_19 = var18_17.f + var9_7;
            var15_12.m();
            return (boolean)var16_15;
        }
        try {
            var17_16 = (int)var15_12.h(var6_4, var10_8, var9_7);
            if (var17_16 != 0) {
                if (var5_3 != null) {
                    var5_3.i(var7_5);
                }
                var15_12 = this.O0;
                var15_12.e = var20_21 = var15_12.e + var9_7;
                return (boolean)var16_15;
            }
            return false;
        }
        catch (AudioSink$WriteException var15_13) {
            var16_15 = this.x0;
            if (var16_15 == 0) ** GOTO lbl-1000
            var21_24 = this.d;
            var21_24.getClass();
            var16_15 = var21_24.a;
            if (var16_15 != 0) {
                var16_15 = 5003;
            } else lbl-1000:
            // 2 sources

            {
                var16_15 = 5002;
            }
            var20_22 = var15_13.b;
            throw this.z(var15_13, var14_11, var20_22, var16_15);
        }
        catch (AudioSink$InitializationException var15_14) {
            var21_25 = this.a1;
            var20_23 = this.x0;
            if (var20_23 == 0) ** GOTO lbl-1000
            var18_18 = this.d;
            var18_18.getClass();
            var20_23 = var18_18.a;
            if (var20_23 != 0) {
                var20_23 = 5004;
            } else lbl-1000:
            // 2 sources

            {
                var20_23 = 5001;
            }
            var19_20 = var15_14.b;
            throw this.z(var15_14, var21_25, var19_20, var20_23);
        }
    }

    public final long q() {
        int n3 = this.h;
        int n4 = 2;
        if (n3 == n4) {
            this.F0();
        }
        return this.c1;
    }

    public final void r0() {
        AudioSink audioSink;
        try {
            audioSink = this.V0;
        }
        catch (AudioSink$WriteException audioSink$WriteException) {
            int n3 = this.x0;
            n3 = n3 != 0 ? 5003 : 5002;
            d d2 = audioSink$WriteException.c;
            boolean bl2 = audioSink$WriteException.b;
            throw this.z(audioSink$WriteException, d2, bl2, n3);
        }
        audioSink.i();
    }

    public final void setPlaybackParameters(ot2_0 ot2_02) {
        this.V0.setPlaybackParameters(ot2_02);
    }

    public final EL1 x() {
        return this;
    }

    public final boolean y0(d d2) {
        int n3;
        uJ2 uJ22 = this.d;
        uJ22.getClass();
        int n4 = uJ22.a;
        if (n4 != 0 && (n3 = (n4 = this.D0(d2)) & 0x200) != 0) {
            uJ2 uJ23 = this.d;
            uJ23.getClass();
            n3 = uJ23.a;
            int n7 = 2;
            if (n3 == n7 || (n4 &= 0x400) != 0 || (n4 = d2.G) == 0 && (n4 = d2.H) == 0) {
                return true;
            }
        }
        return this.V0.a(d2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int z0(Sj0 var1_1, d var2_2) {
        block26: {
            block25: {
                var3_3 = this;
                var4_4 = var2_2;
                var5_5 = var2_2.o;
                var6_6 = ip1_0.h(var5_5);
                var7_7 = 0;
                if (var6_6 == 0) {
                    return tj2_0.a(0, 0, 0, 0);
                }
                var6_6 = 1;
                var8_8 = var2_2.M;
                if (var8_8 != 0) {
                    var9_9 = 1;
                } else {
                    var9_9 = 0;
                    var10_10 = null;
                }
                var11_11 = 2;
                if (var8_8 != 0 && var8_8 != var11_11) {
                    var8_8 = 0;
                    var12_12 = null;
                } else {
                    var8_8 = 1;
                }
                var13_13 = 32;
                var14_14 = null;
                var15_15 = "audio/raw";
                var16_16 = 8;
                var17_17 = 4;
                var18_18 = var3_3.V0;
                if (var8_8 == 0) ** GOTO lbl-1000
                if (var9_9 == 0) ** GOTO lbl-1000
                var10_10 = MediaCodecUtil.e((String)var15_15, false, false);
                var19_19 = var10_10.isEmpty();
                if (var19_19) {
                    var9_9 = 0;
                    var10_10 = null;
                } else {
                    var10_10 = (e)var10_10.get(0);
                }
                if (var10_10 != null) lbl-1000:
                // 2 sources

                {
                    var9_9 = var3_3.D0(var4_4);
                    var19_19 = var18_18.a(var4_4);
                    if (var19_19) {
                        return tj2_0.a(var17_17, var16_16, var13_13, var9_9);
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var9_9 = 0;
                    var10_10 = null;
                }
                if ((var21_21 = var15_15.equals(var20_20 = var4_4.o)) && !(var21_21 = var18_18.a(var4_4))) {
                    return tj2_0.a(var6_6, 0, 0, 0);
                }
                var22_22 = new androidx.media3.common.d$a();
                var23_23 = ip1_0.l((String)var15_15);
                var22_22.n = var23_23;
                var22_22.C = var24_24 = var4_4.D;
                var22_22.D = var24_24 = var4_4.E;
                var22_22.E = var11_11;
                var23_23 = new d(var22_22);
                var21_21 = var18_18.a((d)var23_23);
                if (!var21_21) {
                    return tj2_0.a(var6_6, 0, 0, 0);
                }
                if (var20_20 != null) break block25;
                var14_14 = ImmutableList.of();
                break block26;
            }
            var25_25 = var18_18.a(var4_4);
            if (var25_25 == 0) ** GOTO lbl-1000
            var25_25 = (var15_15 = MediaCodecUtil.e((String)var15_15, false, false)).isEmpty();
            if (var25_25 == 0) {
                var14_14 = (e)var15_15.get(0);
            }
            if (var14_14 != null) {
                var14_14 = ImmutableList.of(var14_14);
            } else lbl-1000:
            // 2 sources

            {
                var14_14 = var1_1;
                var14_14 = MediaCodecUtil.g(var1_1, var4_4, false, false);
            }
        }
        var26_26 = var14_14.isEmpty();
        if (var26_26 != 0) {
            return tj2_0.a(var6_6, 0, 0, 0);
        }
        if (var8_8 == 0) {
            return tj2_0.a(var11_11, 0, 0, 0);
        }
        var12_12 = (e)var14_14.get(0);
        var11_11 = (int)var12_12.d(var4_4);
        if (var11_11 == 0) {
            for (var26_26 = 1; var26_26 < (var25_25 = var14_14.size()); ++var26_26) {
                var18_18 = (e)var14_14.get(var26_26);
                var19_19 = var18_18.d(var4_4);
                if (!var19_19) continue;
                var8_8 = 0;
                var12_12 = null;
                break;
            }
        } else {
            var18_18 = var12_12;
            var6_6 = var11_11;
            var8_8 = 1;
        }
        if (var6_6 == 0) {
            var17_17 = 3;
        }
        if (var6_6 != 0 && (var27_27 = var18_18.e(var4_4)) != 0) {
            var16_16 = 16;
        }
        if ((var27_27 = var18_18.g) != 0) {
            var27_27 = 64;
        } else {
            var27_27 = 0;
            var4_4 = null;
        }
        if (var8_8 != 0) {
            var7_7 = 128;
        }
        var6_6 = var17_17 | var16_16 | var13_13;
        return var27_27 | var6_6 | var7_7 | var9_9;
    }
}

