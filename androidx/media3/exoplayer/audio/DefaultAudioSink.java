/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.database.ContentObserver
 *  android.media.AudioDeviceCallback
 *  android.media.AudioDeviceInfo
 *  android.media.AudioManager
 *  android.media.AudioRouting$OnRoutingChangedListener
 *  android.media.AudioTrack
 *  android.media.PlaybackParams
 *  android.media.metrics.LogSessionId
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.util.Pair
 */
package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.common.audio.AudioProcessor$a;
import androidx.media3.common.audio.b;
import androidx.media3.common.audio.d;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.audio.AudioSink$a;
import androidx.media3.exoplayer.audio.AudioSink$b;
import androidx.media3.exoplayer.audio.DefaultAudioSink$a;
import androidx.media3.exoplayer.audio.DefaultAudioSink$d;
import androidx.media3.exoplayer.audio.DefaultAudioSink$e;
import androidx.media3.exoplayer.audio.DefaultAudioSink$f;
import androidx.media3.exoplayer.audio.DefaultAudioSink$g;
import androidx.media3.exoplayer.audio.DefaultAudioSink$h;
import androidx.media3.exoplayer.audio.DefaultAudioSink$i;
import androidx.media3.exoplayer.audio.DefaultAudioSink$j;
import androidx.media3.exoplayer.audio.DefaultAudioSink$k;
import androidx.media3.exoplayer.audio.DefaultAudioSink$k$a;
import androidx.media3.exoplayer.audio.a;
import androidx.media3.exoplayer.audio.a$b;
import androidx.media3.exoplayer.audio.a$c;
import androidx.media3.exoplayer.audio.b$a;
import androidx.media3.exoplayer.audio.c;
import androidx.media3.exoplayer.audio.e;
import androidx.media3.exoplayer.audio.f;
import androidx.media3.exoplayer.audio.g$a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public final class DefaultAudioSink
implements AudioSink {
    public static final Object k0;
    public static ScheduledExecutorService l0;
    public static int m0;
    public dr_1 A;
    public DefaultAudioSink$g B;
    public DefaultAudioSink$g C;
    public ot2_0 D;
    public boolean E;
    public ByteBuffer F;
    public int G;
    public long H;
    public long I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public boolean N;
    public long O;
    public float P;
    public ByteBuffer Q;
    public int R;
    public ByteBuffer S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public dt Z;
    public final Context a;
    public rr_0 a0;
    public final Er b;
    public boolean b0;
    public final boolean c;
    public long c0;
    public final ur_0 d;
    public long d0;
    public final ws3_0 e;
    public boolean e0;
    public final ImmutableList f;
    public boolean f0;
    public final ImmutableList g;
    public Looper g0;
    public final c h;
    public long h0;
    public final ArrayDeque i;
    public long i0;
    public final boolean j;
    public Handler j0;
    public int k;
    public DefaultAudioSink$k l;
    public final DefaultAudioSink$i m;
    public final DefaultAudioSink$i n;
    public final e o;
    public final DefaultAudioSink$a p;
    public final f q;
    public nu2 r;
    public AudioSink$b s;
    public DefaultAudioSink$e t;
    public DefaultAudioSink$e u;
    public androidx.media3.common.audio.a v;
    public AudioTrack w;
    public or_0 x;
    public a y;
    public DefaultAudioSink$h z;

    static {
        Object object;
        k0 = object = new Object();
    }

    public DefaultAudioSink(DefaultAudioSink$d object) {
        int n3;
        Object object2 = ((DefaultAudioSink$d)object).a;
        this.a = object2;
        Object object3 = dr_1.g;
        this.A = object3;
        object2 = object2 != null ? or_0.b((Context)object2, (dr_1)object3, null) : ((DefaultAudioSink$d)object).b;
        this.x = object2;
        object2 = ((DefaultAudioSink$d)object).c;
        this.b = object2;
        this.c = n3 = ((DefaultAudioSink$d)object).d;
        n3 = gz3.a;
        int n4 = 23;
        if (n3 >= n4 && (n3 = (int)(((DefaultAudioSink$d)object).e ? 1 : 0)) != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        this.j = n3;
        this.k = 0;
        object2 = ((DefaultAudioSink$d)object).g;
        this.o = object2;
        object2 = ((DefaultAudioSink$d)object).i;
        object2.getClass();
        this.p = object2;
        object3 = new DefaultAudioSink$j(this);
        this.h = object2 = new c((DefaultAudioSink$j)object3);
        this.d = object2 = new b();
        object3 = new b();
        Object object4 = gz3.f;
        ((ws3_0)object3).m = object4;
        this.e = object3;
        object4 = new d;
        this.f = object2 = ImmutableList.of(object4, object2, object3);
        object2 = new b();
        this.g = object2 = ImmutableList.of(object2);
        this.P = 1.0f;
        this.Y = 0;
        this.Z = object2 = new dt();
        object3 = ot2_0.d;
        object4 = object2;
        this.C = object2 = new DefaultAudioSink$g((ot2_0)object3, 0L, 0L);
        this.D = object3;
        this.E = false;
        this.i = object2 = new ArrayDeque();
        this.m = object2 = new DefaultAudioSink$i();
        this.n = object2 = new DefaultAudioSink$i();
        this.q = object = ((DefaultAudioSink$d)object).h;
    }

    public static boolean A(AudioTrack audioTrack) {
        boolean bl2;
        int n3 = gz3.a;
        int n4 = 29;
        if (n3 >= n4 && (bl2 = Kk0.b(audioTrack))) {
            bl2 = true;
        } else {
            bl2 = false;
            audioTrack = null;
        }
        return bl2;
    }

    public final void B() {
        Object object = this.y;
        if (object == null && (object = this.a) != null) {
            Object object2;
            this.g0 = object2 = Looper.myLooper();
            Object object3 = new Tk0(this);
            Object object4 = this.A;
            rr_0 rr_02 = this.a0;
            object2 = new a((Context)object, (Tk0)object3, (dr_1)object4, rr_02);
            this.y = object2;
            int n3 = object2.j;
            if (n3 != 0) {
                object = object2.g;
                object.getClass();
            } else {
                object2.j = n3 = 1;
                object = object2.f;
                if (object != null) {
                    object3 = ((a$b)((Object)object)).a;
                    object4 = ((a$b)((Object)object)).b;
                    rr_02 = null;
                    object3.registerContentObserver((Uri)object4, false, (ContentObserver)object);
                }
                n3 = gz3.a;
                object3 = object2.c;
                int n4 = 23;
                rr_02 = object2.a;
                if (n3 >= n4 && (object = object2.d) != null) {
                    object4 = (AudioManager)rr_02.getSystemService("audio");
                    object4.getClass();
                    qr_1.a((AudioManager)object4, (AudioDeviceCallback)object, (Handler)object3);
                }
                object = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
                n4 = 0;
                a$c a$c = object2.e;
                object = rr_02.registerReceiver(a$c, (IntentFilter)object, null, (Handler)object3);
                object3 = object2.i;
                object4 = object2.h;
                object = or_0.c((Context)rr_02, (Intent)object, (dr_1)object3, (rr_0)object4);
                object2.g = object;
            }
            this.x = object;
        }
    }

    public final void C() {
        boolean bl2 = this.U;
        if (!bl2) {
            long l2;
            this.U = true;
            long l3 = this.x();
            c c2 = this.h;
            c2.z = l2 = c2.b();
            VV vV = c2.I;
            c2.x = l2 = gz3.I(vV.elapsedRealtime());
            c2.A = l3;
            AudioTrack audioTrack = this.w;
            bl2 = DefaultAudioSink.A(audioTrack);
            if (bl2) {
                this.V = false;
            }
            audioTrack = this.w;
            audioTrack.stop();
            this.G = 0;
        }
    }

    public final void D(long l2) {
        int n3;
        this.u(l2);
        Object object = this.S;
        if (object != null) {
            return;
        }
        object = this.v;
        boolean n32 = ((androidx.media3.common.audio.a)object).e();
        if (!n32) {
            object = this.Q;
            if (object != null) {
                this.F((ByteBuffer)object);
                this.u(l2);
            }
            return;
        }
        while ((n3 = ((androidx.media3.common.audio.a)(object = this.v)).d()) == 0) {
            int n4;
            Object object2;
            block9: {
                do {
                    boolean bl2;
                    if (!(bl2 = ((androidx.media3.common.audio.a)(object = this.v)).e())) {
                        object = AudioProcessor.a;
                    } else {
                        object2 = ((androidx.media3.common.audio.a)object).c;
                        n4 = ((androidx.media3.common.audio.a)object).c();
                        if ((n4 = (int)(((Buffer)(object2 = object2[n4])).hasRemaining() ? 1 : 0)) != 0) {
                            object = object2;
                        } else {
                            object2 = AudioProcessor.a;
                            ((androidx.media3.common.audio.a)object).f((ByteBuffer)object2);
                            object2 = ((androidx.media3.common.audio.a)object).c;
                            n3 = ((androidx.media3.common.audio.a)object).c();
                            object = object2[n3];
                        }
                    }
                    bl2 = ((Buffer)object).hasRemaining();
                    if (!bl2) break block9;
                    this.F((ByteBuffer)object);
                    this.u(l2);
                } while ((object = this.S) == null);
                return;
            }
            object = this.Q;
            if (object == null || (n3 = ((Buffer)object).hasRemaining()) == 0) break;
            object = this.v;
            object2 = this.Q;
            n4 = (int)(((androidx.media3.common.audio.a)object).e() ? 1 : 0);
            if (n4 == 0 || (n4 = (int)(((androidx.media3.common.audio.a)object).d ? 1 : 0)) != 0) continue;
            ((androidx.media3.common.audio.a)object).f((ByteBuffer)object2);
        }
    }

    public final void E() {
        boolean bl2 = this.z();
        if (bl2) {
            Object object = Mk0.a(Jk0.a());
            float f5 = this.D.a;
            object = Nk0.a((PlaybackParams)object, f5);
            Object object2 = this.D;
            f5 = ((ot2_0)object2).b;
            object = Pk0.b(Ok0.a((PlaybackParams)object, f5));
            object2 = this.w;
            try {
                b8.b((AudioTrack)object2, (PlaybackParams)object);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                object2 = "Failed to set playback params";
                Cx.g((String)object2, illegalArgumentException);
            }
            f5 = Hk0.a(Qk0.a(this.w));
            PlaybackParams playbackParams = Qk0.a(this.w);
            float f6 = Ik0.a(playbackParams);
            object = new ot2_0(f5, f6);
            this.D = object;
            float f7 = ((ot2_0)object).a;
            object2 = this.h;
            ((c)object2).i = f7;
            object = ((c)object2).e;
            if (object != null) {
                ((Rr)object).a();
            }
            ((c)object2).d();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void F(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        block22: {
            int n3;
            int n4;
            long l2;
            long l3;
            Object object;
            DefaultAudioSink defaultAudioSink;
            block21: {
                block20: {
                    int n7;
                    defaultAudioSink = this;
                    object = this.S;
                    if (object == null) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        object = null;
                    }
                    ct3.f(n7 != 0);
                    n7 = byteBuffer.hasRemaining();
                    if (n7 == 0) {
                        return;
                    }
                    object = defaultAudioSink.u;
                    n7 = ((DefaultAudioSink$e)object).c;
                    if (n7 != 0) break block20;
                    l3 = gz3.I(20);
                    object = defaultAudioSink.u;
                    l2 = ((DefaultAudioSink$e)object).e;
                    long l4 = 1000000L;
                    RoundingMode roundingMode = RoundingMode.UP;
                    long l7 = gz3.O(l3, l2, l4, roundingMode);
                    n4 = (int)l7;
                    l3 = this.x();
                    long l8 = l3 - (l2 = (long)n4);
                    n7 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
                    if (n7 < 0) break block21;
                }
                byteBuffer2 = byteBuffer;
                break block22;
            }
            object = defaultAudioSink.u;
            int n8 = ((DefaultAudioSink$e)object).g;
            int n10 = (int)l3;
            int n14 = byteBuffer.remaining();
            byteBuffer2 = ByteBuffer.allocateDirect(n14);
            ByteOrder byteOrder = ByteOrder.nativeOrder();
            byteBuffer2 = byteBuffer2.order(byteOrder);
            int n15 = byteBuffer.position();
            while ((n3 = byteBuffer.hasRemaining()) != 0 && n10 < n4) {
                int n16;
                block19: {
                    block30: {
                        block31: {
                            float f5;
                            float f6;
                            block32: {
                                block33: {
                                    block34: {
                                        int n17;
                                        int n18;
                                        int n19;
                                        block29: {
                                            int n20;
                                            block18: {
                                                block28: {
                                                    block23: {
                                                        block24: {
                                                            float f7;
                                                            int n21;
                                                            float f8;
                                                            float f11;
                                                            block25: {
                                                                block26: {
                                                                    block27: {
                                                                        n19 = 0x50000000;
                                                                        f11 = 8.589935E9f;
                                                                        n20 = 0x10000000;
                                                                        f8 = 2.524355E-29f;
                                                                        n21 = 22;
                                                                        f7 = 3.1E-44f;
                                                                        n18 = 21;
                                                                        n3 = 4;
                                                                        f6 = 5.6E-45f;
                                                                        n16 = 3;
                                                                        f5 = 4.2E-45f;
                                                                        n17 = 2;
                                                                        if (n8 == n17) break block23;
                                                                        if (n8 == n16) break block24;
                                                                        if (n8 == n3) break block25;
                                                                        if (n8 == n18) break block26;
                                                                        if (n8 == n21) break block27;
                                                                        if (n8 != n20) {
                                                                            if (n8 != n19) {
                                                                                n19 = 0x60000000;
                                                                                f11 = 3.689349E19f;
                                                                                if (n8 != n19) {
                                                                                    object = new IllegalStateException();
                                                                                    throw object;
                                                                                }
                                                                                n19 = (byteBuffer.get() & 0xFF) << 24;
                                                                                n20 = (byteBuffer.get() & 0xFF) << 16;
                                                                                n19 |= n20;
                                                                                n20 = (byteBuffer.get() & 0xFF) << 8;
                                                                                n19 |= n20;
                                                                                n20 = byteBuffer.get() & 0xFF;
                                                                                break block18;
                                                                            } else {
                                                                                n19 = (byteBuffer.get() & 0xFF) << 24;
                                                                                n20 = (byteBuffer.get() & 0xFF) << 16;
                                                                                n19 |= n20;
                                                                                n20 = (byteBuffer.get() & 0xFF) << 8;
                                                                            }
                                                                            break block18;
                                                                        } else {
                                                                            n19 = (byteBuffer.get() & 0xFF) << 24;
                                                                            n20 = (byteBuffer.get() & 0xFF) << 16;
                                                                        }
                                                                        break block18;
                                                                    }
                                                                    n19 = byteBuffer.get() & 0xFF;
                                                                    n20 = (byteBuffer.get() & 0xFF) << 8;
                                                                    n19 |= n20;
                                                                    n20 = (byteBuffer.get() & 0xFF) << 16;
                                                                    n19 |= n20;
                                                                    n20 = byteBuffer.get();
                                                                    break block28;
                                                                }
                                                                n19 = (byteBuffer.get() & 0xFF) << 8;
                                                                n20 = (byteBuffer.get() & 0xFF) << 16;
                                                                n19 |= n20;
                                                                n20 = byteBuffer.get();
                                                                break block28;
                                                            }
                                                            f11 = byteBuffer.getFloat();
                                                            n21 = 1065353216;
                                                            f7 = 1.0f;
                                                            f11 = gz3.g(f11, -1.0f, f7);
                                                            f8 = 0.0f;
                                                            float f12 = f11 - 0.0f;
                                                            n20 = (int)(f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1));
                                                            if (n20 < 0) {
                                                                f11 = -f11;
                                                                n20 = -822083584;
                                                                f8 = -2.1474836E9f;
                                                            } else {
                                                                n20 = 0x4F000000;
                                                                f8 = 2.1474836E9f;
                                                            }
                                                            n19 = (int)(f11 *= f8);
                                                            break block29;
                                                        }
                                                        n19 = (byteBuffer.get() & 0xFF) << 24;
                                                        break block29;
                                                    }
                                                    n19 = (byteBuffer.get() & 0xFF) << 16;
                                                    n20 = byteBuffer.get();
                                                }
                                                n20 = (n20 & 0xFF) << 24;
                                            }
                                            n19 |= n20;
                                        }
                                        long l12 = n19;
                                        long l14 = n10;
                                        l12 = l12 * l14 / l2;
                                        n3 = (int)l12;
                                        if (n8 == n17) break block30;
                                        n16 = 3;
                                        f5 = 4.2E-45f;
                                        if (n8 == n16) break block31;
                                        n16 = 4;
                                        f5 = 5.6E-45f;
                                        if (n8 == n16) break block32;
                                        if (n8 == n18) break block33;
                                        n16 = 22;
                                        f5 = 3.1E-44f;
                                        if (n8 == n16) break block34;
                                        n16 = 0x10000000;
                                        f5 = 2.524355E-29f;
                                        if (n8 != n16) {
                                            n16 = 0x50000000;
                                            f5 = 8.589935E9f;
                                            if (n8 != n16) {
                                                n16 = 0x60000000;
                                                f5 = 3.689349E19f;
                                                if (n8 != n16) {
                                                    object = new IllegalStateException();
                                                    throw object;
                                                }
                                                n16 = (byte)(n3 >> 24);
                                                byteBuffer2.put((byte)n16);
                                                n16 = (byte)(n3 >> 16);
                                                byteBuffer2.put((byte)n16);
                                                n16 = (byte)(n3 >> 8);
                                                byteBuffer2.put((byte)n16);
                                                n3 = (byte)n3;
                                                byteBuffer2.put((byte)n3);
                                                break block19;
                                            } else {
                                                n16 = (byte)(n3 >> 24);
                                                byteBuffer2.put((byte)n16);
                                                n16 = (byte)(n3 >> 16);
                                                byteBuffer2.put((byte)n16);
                                                n3 = (byte)(n3 >> 8);
                                                byteBuffer2.put((byte)n3);
                                            }
                                            break block19;
                                        } else {
                                            n16 = (byte)(n3 >> 24);
                                            byteBuffer2.put((byte)n16);
                                            n3 = (byte)(n3 >> 16);
                                            byteBuffer2.put((byte)n3);
                                        }
                                        break block19;
                                    }
                                    n16 = (byte)n3;
                                    byteBuffer2.put((byte)n16);
                                    n16 = (byte)(n3 >> 8);
                                    byteBuffer2.put((byte)n16);
                                    n16 = (byte)(n3 >> 16);
                                    byteBuffer2.put((byte)n16);
                                    n3 = (byte)(n3 >> 24);
                                    byteBuffer2.put((byte)n3);
                                    break block19;
                                }
                                n16 = (byte)(n3 >> 8);
                                byteBuffer2.put((byte)n16);
                                n16 = (byte)(n3 >> 16);
                                byteBuffer2.put((byte)n16);
                                n3 = (byte)(n3 >> 24);
                                byteBuffer2.put((byte)n3);
                                break block19;
                            }
                            if (n3 < 0) {
                                f6 = -((float)n3);
                                n16 = -822083584;
                                f5 = -2.1474836E9f;
                                byteBuffer2.putFloat(f6 /= f5);
                                break block19;
                            } else {
                                f6 = n3;
                                n16 = 0x4F000000;
                                f5 = 2.1474836E9f;
                                byteBuffer2.putFloat(f6 /= f5);
                            }
                            break block19;
                        }
                        n3 = (byte)(n3 >> 24);
                        byteBuffer2.put((byte)n3);
                        break block19;
                    }
                    n16 = (byte)(n3 >> 16);
                    byteBuffer2.put((byte)n16);
                    n3 = (byte)(n3 >> 24);
                    byteBuffer2.put((byte)n3);
                }
                if ((n3 = byteBuffer.position()) != (n16 = ((DefaultAudioSink$e)object).d + n15)) continue;
                ++n10;
                n15 = byteBuffer.position();
            }
            object = byteBuffer;
            byteBuffer2.put(byteBuffer);
            byteBuffer2.flip();
        }
        defaultAudioSink.S = byteBuffer2;
    }

    public final boolean G() {
        int n3;
        int n4;
        DefaultAudioSink$e defaultAudioSink$e = this.u;
        if (defaultAudioSink$e != null && (n4 = defaultAudioSink$e.j) != 0 && (n4 = gz3.a) >= (n3 = 23)) {
            n4 = 1;
        } else {
            n4 = 0;
            defaultAudioSink$e = null;
        }
        return n4 != 0;
    }

    public final boolean a(androidx.media3.common.d d2) {
        int n3 = this.p(d2);
        if (n3) {
            n3 = 1;
        } else {
            n3 = 0;
            d2 = null;
        }
        return n3 != 0;
    }

    public final boolean b() {
        boolean bl2 = this.z();
        bl2 = !bl2 || (bl2 = this.T) && !(bl2 = this.d());
        return bl2;
    }

    public final Dr c(androidx.media3.common.d d2) {
        boolean bl2 = this.e0;
        if (bl2) {
            return Dr.d;
        }
        DefaultAudioSink$a defaultAudioSink$a = this.p;
        dr_1 dr_12 = this.A;
        return defaultAudioSink$a.a(dr_12, d2);
    }

    public final boolean d() {
        long l2;
        Object object;
        int n3;
        int n4 = this.z();
        if (n4 != 0 && ((n4 = gz3.a) < (n3 = 29) || (n4 = (int)(Kk0.b((AudioTrack)(object = this.w)) ? 1 : 0)) == 0 || (n4 = (int)(this.V ? 1 : 0)) == 0) && (n4 = (int)(((c)(object = this.h)).c(l2 = this.x()) ? 1 : 0)) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        return n4 != 0;
    }

    public final void e(int n3) {
        int n4 = gz3.a;
        int n7 = 29;
        n4 = n4 >= n7 ? 1 : 0;
        ct3.f(n4 != 0);
        this.k = n3;
    }

    public final void f() {
        boolean bl2 = this.b0;
        if (bl2) {
            bl2 = false;
            this.b0 = false;
            this.flush();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void flush() {
        long l2;
        Object object;
        int n3 = this.z();
        long l3 = 0L;
        if (n3 != 0) {
            int n8;
            Handler handler;
            DefaultAudioSink$g defaultAudioSink$g;
            this.H = l3;
            this.I = l3;
            this.J = l3;
            this.K = l3;
            this.f0 = false;
            this.L = 0;
            Object object2 = this.D;
            long l4 = 0L;
            long l7 = 0L;
            Object object3 = defaultAudioSink$g;
            this.C = defaultAudioSink$g = new DefaultAudioSink$g((ot2_0)object2, l4, l7);
            this.O = l3;
            this.B = null;
            object3 = this.i;
            ((ArrayDeque)object3).clear();
            this.Q = null;
            this.R = 0;
            this.S = null;
            this.U = false;
            this.T = false;
            this.V = false;
            this.F = null;
            this.G = 0;
            this.e.o = l3;
            this.v = object = this.u.i;
            ((androidx.media3.common.audio.a)object).b();
            object = this.h.c;
            object.getClass();
            n3 = object.getPlayState();
            int n4 = 3;
            if (n3 == n4) {
                object = this.w;
                object.pause();
            }
            if ((n3 = (int)(DefaultAudioSink.A((AudioTrack)(object = this.w)) ? 1 : 0)) != 0) {
                object = this.l;
                object.getClass();
                object3 = this.w;
                object2 = ((DefaultAudioSink$k)object).b;
                n70.b((AudioTrack)object3, (DefaultAudioSink$k$a)((Object)object2));
                object = ((DefaultAudioSink$k)object).a;
                object.removeCallbacksAndMessages(null);
            }
            object = this.u.a();
            object3 = this.t;
            if (object3 != null) {
                this.u = object3;
                this.t = null;
            }
            object3 = this.h;
            ((c)object3).d();
            ((c)object3).c = null;
            ((c)object3).e = null;
            n4 = gz3.a;
            int n7 = 24;
            if (n4 >= n7 && (object3 = this.z) != null) {
                object2 = ((DefaultAudioSink$h)object3).c;
                object2.getClass();
                handler = ((DefaultAudioSink$h)object3).a;
                Zk0.a((AudioTrack)handler, (AudioRouting.OnRoutingChangedListener)object2);
                ((DefaultAudioSink$h)object3).c = null;
                this.z = null;
            }
            object3 = this.w;
            object2 = this.s;
            Object object4 = Looper.myLooper();
            handler = new Handler(object4);
            object4 = k0;
            // MONITORENTER : object4
            Object object5 = l0;
            if (object5 == null) {
                object5 = new az3();
                l0 = object5 = Executors.newSingleThreadScheduledExecutor((ThreadFactory)object5);
            }
            m0 = n8 = m0 + 1;
            object5 = l0;
            Rk0 rk0 = new Rk0((AudioTrack)object3, (AudioSink$b)object2, handler, (AudioSink$a)object);
            object = TimeUnit.MILLISECONDS;
            l2 = 20;
            object5.schedule(rk0, l2, (TimeUnit)((Object)object));
            // MONITOREXIT : object4
            this.w = null;
        }
        object = this.n;
        ((DefaultAudioSink$i)object).a = null;
        ((DefaultAudioSink$i)object).b = l2 = -9223372036854775807L;
        ((DefaultAudioSink$i)object).c = l2;
        object = this.m;
        ((DefaultAudioSink$i)object).a = null;
        ((DefaultAudioSink$i)object).b = l2;
        ((DefaultAudioSink$i)object).c = l2;
        this.h0 = l3;
        this.i0 = l3;
        object = this.j0;
        if (object == null) return;
        object.removeCallbacksAndMessages(null);
    }

    public final void g(dr_1 object) {
        Object object2 = this.A;
        boolean bl2 = ((dr_1)object2).equals(object);
        if (bl2) {
            return;
        }
        this.A = object;
        bl2 = this.b0;
        if (bl2) {
            return;
        }
        object2 = this.y;
        if (object2 != null) {
            ((a)object2).i = object;
            Context context = ((a)object2).a;
            rr_0 rr_02 = ((a)object2).h;
            object = or_0.b(context, (dr_1)object, rr_02);
            ((a)object2).a((or_0)object);
        }
        this.flush();
    }

    public final ot2_0 getPlaybackParameters() {
        return this.D;
    }

    /*
     * Exception decompiling
     */
    public final boolean h(ByteBuffer var1_1, long var2_2, int var4_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[CASE]], but top level block is 8[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void i() {
        boolean bl2 = this.T;
        if (!bl2 && (bl2 = this.z()) && (bl2 = this.v())) {
            this.C();
            this.T = bl2 = true;
        }
    }

    public final void j(int n3, int n4) {
        boolean bl2;
        Object object = this.w;
        if (object != null && (bl2 = DefaultAudioSink.A(object)) && (object = this.u) != null && (bl2 = object.k)) {
            object = this.w;
            t60_0.b(object, n3, n4);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final long k(boolean n3) {
        Object object;
        boolean bl2;
        boolean bl3 = this.z();
        if (!bl3) return Long.MIN_VALUE;
        bl3 = this.N;
        if (bl3) {
            return Long.MIN_VALUE;
        }
        Object object2 = this.h;
        long l2 = ((c)object2).a(n3 != 0);
        Object object3 = this.u;
        long l3 = this.x();
        n3 = ((DefaultAudioSink$e)object3).e;
        l3 = gz3.M(n3, l3);
        l2 = Math.min(l2, l3);
        while (!(bl2 = ((ArrayDeque)(object3 = this.i)).isEmpty())) {
            object = (DefaultAudioSink$g)((ArrayDeque)object3).getFirst();
            l3 = ((DefaultAudioSink$g)object).c;
            long l4 = l2 - l3;
            Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object4 < 0) break;
            this.C = object3 = (DefaultAudioSink$g)((ArrayDeque)object3).remove();
        }
        object = this.C;
        long l7 = ((DefaultAudioSink$g)object).c;
        long l8 = l2 - l7;
        object2 = ((DefaultAudioSink$g)object).a;
        float f5 = ((ot2_0)object2).a;
        l2 = gz3.r(l8, f5);
        n3 = (int)(((ArrayDeque)object3).isEmpty() ? 1 : 0);
        object = this.b;
        if (n3 != 0) {
            object3 = object;
            object3 = ((DefaultAudioSink$f)object).c;
            int n4 = ((androidx.media3.common.audio.c)object3).isActive();
            if (n4 != 0) {
                l7 = ((androidx.media3.common.audio.c)object3).o;
                long l12 = 1024L;
                long l14 = l7 - l12;
                Object object5 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (object5 >= 0) {
                    l7 = ((androidx.media3.common.audio.c)object3).n;
                    l93_0 l93_02 = ((androidx.media3.common.audio.c)object3).j;
                    l93_02.getClass();
                    int n7 = l93_02.k;
                    int n8 = l93_02.b;
                    n7 = n7 * n8 * 2;
                    l12 = n7;
                    l12 = l7 - l12;
                    AudioProcessor$a audioProcessor$a = ((androidx.media3.common.audio.c)object3).h;
                    n4 = audioProcessor$a.a;
                    AudioProcessor$a audioProcessor$a2 = ((androidx.media3.common.audio.c)object3).g;
                    int n10 = audioProcessor$a2.a;
                    if (n4 == n10) {
                        long l15 = ((androidx.media3.common.audio.c)object3).o;
                        RoundingMode roundingMode = RoundingMode.DOWN;
                        l7 = gz3.O(l8, l12, l15, roundingMode);
                    } else {
                        long l16 = n4;
                        l12 *= l16;
                        l16 = ((androidx.media3.common.audio.c)object3).o;
                        l7 = n10;
                        l16 *= l7;
                        RoundingMode roundingMode = RoundingMode.DOWN;
                        l7 = gz3.O(l8, l12, l16, roundingMode);
                    }
                } else {
                    float f6 = ((androidx.media3.common.audio.c)object3).c;
                    double d2 = f6;
                    double d5 = l8;
                    l7 = (long)(d2 *= d5);
                }
                l8 = l7;
            }
            object3 = this.C;
            l7 = ((DefaultAudioSink$g)object3).b + l8;
            ((DefaultAudioSink$g)object3).d = l8 -= l2;
        } else {
            object3 = this.C;
            l7 = ((DefaultAudioSink$g)object3).b + l2;
            l2 = ((DefaultAudioSink$g)object3).d;
            l7 += l2;
        }
        object = (DefaultAudioSink$f)object;
        l2 = ((DefaultAudioSink$f)object).b.q;
        object3 = this.u;
        l8 = gz3.M(((DefaultAudioSink$e)object3).e, l2) + l7;
        l3 = this.h0;
        n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
        if (n3 <= 0) return l8;
        object3 = this.u;
        l3 = l2 - l3;
        n3 = ((DefaultAudioSink$e)object3).e;
        l3 = gz3.M(n3, l3);
        this.h0 = l2;
        this.i0 = l2 = this.i0 + l3;
        object3 = this.j0;
        if (object3 == null) {
            object2 = Looper.myLooper();
            object3 = new Handler((Looper)object2);
            this.j0 = object3;
        }
        object3 = this.j0;
        bl3 = false;
        f5 = 0.0f;
        object3.removeCallbacksAndMessages(null);
        object3 = this.j0;
        object2 = new Sk0(this, 0);
        long l17 = 100;
        object3.postDelayed((Runnable)object2, l17);
        return l8;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(androidx.media3.common.d d2, int[] nArray) {
        void var8_15;
        Object object;
        void var43_62;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        int n3;
        int n4;
        void var18_34;
        Object object2;
        Object object3;
        DefaultAudioSink$e defaultAudioSink$e;
        boolean bl5;
        boolean bl6;
        Object object4;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        int n7;
        String string2;
        int n8;
        boolean bl10;
        boolean bl11;
        Object object5;
        Object object6;
        Object object7;
        DefaultAudioSink defaultAudioSink;
        block22: {
            boolean bl12;
            boolean bl13;
            block21: {
                int n10;
                defaultAudioSink = this;
                object7 = d2;
                this.B();
                object6 = d2.o;
                object5 = "audio/raw";
                bl11 = ((String)object5).equals(object6);
                bl13 = this.j;
                bl10 = true;
                n8 = -1;
                string2 = d2.o;
                n7 = d2.E;
                bl9 = d2.D;
                if (!bl11) break block21;
                bl11 = d2.F;
                ct3.a(gz3.E((int)(bl11 ? 1 : 0)));
                bl8 = gz3.t((int)(bl11 ? 1 : 0), (int)(bl9 ? 1 : 0));
                Object object8 = new ImmutableList$Builder();
                bl7 = this.c;
                if (bl7 && (bl11 == (bl7 = 21 != 0) || bl11 == (bl7 = 1342177280 != 0) || bl11 == (bl7 = 22 != 0) || bl11 == (bl7 = 1610612736 != 0) || bl11 == (bl7 = 4 != 0))) {
                    object4 = defaultAudioSink.g;
                    ((ImmutableList$Builder)object8).addAll((Iterable)object4);
                } else {
                    object4 = defaultAudioSink.f;
                    ((ImmutableList$Builder)object8).addAll((Iterable)object4);
                    object4 = ((DefaultAudioSink$f)defaultAudioSink.b).a;
                    ((ImmutableList$Builder)object8).add((Object[])object4);
                }
                object8 = ((ImmutableList$Builder)object8).build();
                object4 = new androidx.media3.common.audio.a((ImmutableList)object8);
                object8 = defaultAudioSink.v;
                boolean bl14 = ((androidx.media3.common.audio.a)object4).equals(object8);
                if (bl14) {
                    object4 = defaultAudioSink.v;
                }
                int n14 = ((androidx.media3.common.d)object7).G;
                Object object9 = defaultAudioSink.e;
                ((ws3_0)object9).i = n14;
                ((ws3_0)object9).j = n10 = ((androidx.media3.common.d)object7).H;
                object8 = defaultAudioSink.d;
                object9 = nArray;
                ((ur_0)object8).i = nArray;
                object8 = new AudioProcessor$a(n7, (int)(bl9 ? 1 : 0), (int)(bl11 ? 1 : 0));
                try {
                    object6 = ((androidx.media3.common.audio.a)object4).a((AudioProcessor$a)object8);
                    n7 = ((AudioProcessor$a)object6).b;
                }
                catch (AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException) {
                    object6 = new AudioSink$ConfigurationException(audioProcessor$UnhandledAudioFormatException, (androidx.media3.common.d)object7);
                    throw object6;
                }
                bl9 = gz3.o(n7);
                int n15 = ((AudioProcessor$a)object6).c;
                n7 = gz3.t(n15, n7);
                bl11 = ((AudioProcessor$a)object6).a;
                bl6 = bl13;
                boolean bl15 = bl8;
                bl5 = false;
                defaultAudioSink$e = null;
                bl8 = bl9;
                bl9 = bl11;
                bl11 = false;
                object6 = null;
                break block22;
            }
            object3 = ImmutableList.of();
            object6 = new androidx.media3.common.audio.a((ImmutableList)object3);
            bl8 = this.k;
            object3 = bl8 ? this.c(d2) : Dr.d;
            int n16 = defaultAudioSink.k;
            if (n16 != 0 && (bl12 = ((Dr)object3).a)) {
                string2.getClass();
                object2 = ((androidx.media3.common.d)object7).k;
                int n17 = ip1_0.b(string2, (String)object2);
                bl9 = gz3.o((int)(bl9 ? 1 : 0));
                bl8 = ((Dr)object3).b;
                object4 = object6;
                int n18 = n17;
                bl5 = bl8;
                bl11 = true;
                int n19 = -1;
                bl6 = true;
            } else {
                Object object10 = defaultAudioSink.x;
                object3 = defaultAudioSink.A;
                if ((object10 = ((or_0)object10).d((dr_1)object3, (androidx.media3.common.d)object7)) == null) {
                    androidx.media3.common.d d5 = object7;
                    object5 = new StringBuilder("Unable to configure passthrough for: ");
                    ((StringBuilder)object5).append(object7);
                    object5 = ((StringBuilder)object5).toString();
                    object6 = new AudioSink$ConfigurationException((androidx.media3.common.d)object7, (String)object5);
                    throw object6;
                }
                object3 = (Integer)((Pair)object10).first;
                bl8 = ((Integer)object3).intValue();
                object10 = (Integer)((Pair)object10).second;
                bl9 = ((Integer)object10).intValue();
                object4 = object6;
                bl6 = bl13;
                boolean bl16 = bl8;
                bl11 = 2 != 0;
                int n20 = -1;
                bl5 = false;
                defaultAudioSink$e = null;
            }
            bl8 = bl9;
            bl9 = n7;
            n7 = -1;
        }
        String string3 = ") for: ";
        if (var18_34 == false) {
            object2 = object7;
            object7 = new StringBuilder("Invalid output encoding (mode=");
            ((StringBuilder)object7).append((int)(bl11 ? 1 : 0));
            ((StringBuilder)object7).append(string3);
            ((StringBuilder)object7).append(object2);
            object6 = ((StringBuilder)object7).toString();
            object5 = new AudioSink$ConfigurationException((androidx.media3.common.d)object2, (String)object6);
            throw object5;
        }
        if (!bl8) {
            object7 = new StringBuilder("Invalid output channel config (mode=");
            ((StringBuilder)object7).append((int)(bl11 ? 1 : 0));
            ((StringBuilder)object7).append(string3);
            object2 = d2;
            ((StringBuilder)object7).append(d2);
            object6 = ((StringBuilder)object7).toString();
            object5 = new AudioSink$ConfigurationException(d2, (String)object6);
            throw object5;
        }
        string3 = "audio/vnd.dts.hd;profile=lbr";
        int n21 = string3.equals(string2);
        int n22 = ((androidx.media3.common.d)object7).j;
        if (n21 != 0 && n22 == n8) {
            n22 = 768000;
        }
        if ((n21 = AudioTrack.getMinBufferSize((int)(bl9 ? 1 : 0), (int)(bl8 ? 1 : 0), (int)var18_34)) != (n4 = -2)) {
            n4 = 1;
        } else {
            n4 = 0;
            object5 = null;
        }
        ct3.f(n4 != 0);
        n4 = n7 != n8 ? n7 : 1;
        double d7 = bl6 ? 8.0 : 1.0;
        e e2 = defaultAudioSink.o;
        e2.getClass();
        long l2 = 1000000L;
        if (bl11) {
            if (bl11 != bl10) {
                bl10 = 2 != 0;
                if (bl11 != bl10) {
                    object6 = new IllegalArgumentException();
                    throw object6;
                }
                bl10 = 5 != 0;
                n8 = 8;
                bl10 = var18_34 == bl10 ? 500000 != 0 : (var18_34 == n8 ? 1000000 != 0 : 250000 != 0);
                n8 = -1;
                if (n22 != n8) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    n3 = IntMath.divide(n22, 8, roundingMode);
                } else {
                    n3 = androidx.media3.exoplayer.audio.e.a((int)var18_34);
                }
                long l3 = (long)bl10;
                bl4 = bl6;
                bl3 = bl5;
                long l4 = n3;
                l3 = l3 * l4 / l2;
                n3 = Ints.checkedCast(l3);
            } else {
                bl4 = bl6;
                bl3 = bl5;
                n3 = androidx.media3.exoplayer.audio.e.a((int)var18_34);
                bl10 = 50000000 != 0;
                long l7 = (long)bl10;
                long l8 = n3;
                l7 = l7 * l8 / l2;
                n3 = Ints.checkedCast(l7);
            }
            n22 = bl9;
            bl2 = bl8;
            var43_62 = var18_34;
            object = object4;
        } else {
            bl4 = bl6;
            bl3 = bl5;
            n3 = n21 * 4;
            long l12 = 250000;
            long l14 = (long)bl9;
            l12 *= l14;
            var43_62 = var18_34;
            object = object4;
            long l15 = n4;
            l12 = l12 * l15 / l2;
            bl10 = Ints.checkedCast(l12);
            n22 = bl9;
            bl2 = bl8;
            long l16 = (long)750000 * l14 * l15 / l2;
            n8 = Ints.checkedCast(l16);
            n3 = gz3.h(n3, (int)(bl10 ? 1 : 0), n8);
        }
        double d9 = (double)n3 * d7;
        n3 = (int)d9;
        n3 = (Math.max(n21, n3) + n4 - 1) / n4;
        bl9 = n3 * n4;
        n4 = 0;
        defaultAudioSink.e0 = false;
        bl6 = defaultAudioSink.b0;
        object5 = defaultAudioSink$e;
        object7 = d2;
        bl10 = bl11;
        n8 = n7;
        n21 = n22;
        n22 = bl2;
        n7 = var43_62;
        object3 = object;
        boolean bl17 = bl4;
        bl7 = bl3;
        defaultAudioSink$e = new DefaultAudioSink$e(d2, (int)var8_15, (int)(bl11 ? 1 : 0), n8, n21, (int)(bl2 ? 1 : 0), (int)var43_62, (int)(bl9 ? 1 : 0), (androidx.media3.common.audio.a)object, bl4, bl3, bl6);
        bl11 = this.z();
        if (bl11) {
            defaultAudioSink.t = defaultAudioSink$e;
            return;
        }
        defaultAudioSink.u = defaultAudioSink$e;
    }

    public final void m() {
        this.M = true;
    }

    public final void n(nu2 nu22) {
        this.r = nu22;
    }

    public final void o() {
        ct3.f(this.X);
        boolean bl2 = this.b0;
        if (!bl2) {
            this.b0 = bl2 = true;
            this.flush();
        }
    }

    public final int p(androidx.media3.common.d d2) {
        this.B();
        Object object = d2.o;
        int n3 = "audio/raw".equals(object);
        int n4 = 2;
        if (n3 != 0) {
            int n7 = d2.F;
            n3 = gz3.E(n7);
            if (n3 == 0) {
                CS1.a(n7, "Invalid PCM encoding: ");
                return 0;
            }
            if (n7 != n4 && ((n3 = this.c) == 0 || n7 != (n3 = 4))) {
                return 1;
            }
            return n4;
        }
        object = this.x;
        dr_1 dr_12 = this.A;
        if ((d2 = ((or_0)object).d(dr_12, d2)) != null) {
            return n4;
        }
        return 0;
    }

    public final void pause() {
        block2: {
            Object object;
            block4: {
                long l2;
                boolean bl2;
                block3: {
                    object = null;
                    this.W = false;
                    bl2 = this.z();
                    if (!bl2) break block2;
                    object = this.h;
                    ((c)object).d();
                    l2 = ((c)object).x;
                    long l3 = -9223372036854775807L;
                    long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l4 != false) break block3;
                    object = ((c)object).e;
                    object.getClass();
                    ((Rr)object).a();
                    break block4;
                }
                ((c)object).z = l2 = ((c)object).b();
                object = this.w;
                bl2 = DefaultAudioSink.A((AudioTrack)object);
                if (!bl2) break block2;
            }
            object = this.w;
            object.pause();
        }
    }

    public final void play() {
        this.W = true;
        boolean bl2 = this.z();
        if (bl2) {
            Object object = this.h;
            long l2 = ((c)object).x;
            long l3 = -9223372036854775807L;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 != false) {
                VV vV = ((c)object).I;
                ((c)object).x = l2 = gz3.I(vV.elapsedRealtime());
            }
            object = ((c)object).e;
            object.getClass();
            ((Rr)object).a();
            object = this.w;
            object.play();
        }
    }

    public final void q(VV vV) {
        this.h.I = vV;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void r(long var1_1) {
        block9: {
            var3_2 = this;
            var4_3 = this.G();
            var5_4 = 4 != 0;
            var6_5 = 1610612736 != 0;
            var7_6 = 22 != 0;
            var8_7 = 1342177280 != 0;
            var9_8 = 21 != 0;
            var10_9 = this.c;
            var11_10 = this.b;
            if (var4_3) break block9;
            var4_3 = this.b0;
            if (var4_3) ** GOTO lbl-1000
            var12_11 = this.u;
            var13_12 = var12_11.c;
            if (var13_12 != 0) ** GOTO lbl-1000
            var12_11 = var12_11.a;
            var4_3 = var12_11.F;
            if (var10_9 == 0) ** GOTO lbl-1000
            var13_12 = gz3.a;
            if (var4_3 != var9_8 && var4_3 != var8_7 && var4_3 != var7_6 && var4_3 != var6_5 && var4_3 != var5_4) lbl-1000:
            // 2 sources

            {
                var12_11 = var3_2.D;
                var14_13 = var11_10;
                var14_13 = (DefaultAudioSink$f)var11_10;
                var14_13.getClass();
                var15_14 = var12_11.a;
                var14_13 = var14_13.c;
                var16_15 = var14_13.c;
                var17_16 = true;
                var18_17 = var16_15 == var15_14 ? 0 : (var16_15 > var15_14 ? 1 : -1);
                if (var18_17 != false) {
                    var14_13.c = var15_14;
                    var14_13.i = var17_16;
                }
                if ((var19_18 = (cfr_temp_0 = (var15_14 = var14_13.d) - (var16_15 = var12_11.b)) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1)) != false) {
                    var14_13.d = var16_15;
                    var14_13.i = var17_16;
                }
            } else lbl-1000:
            // 3 sources

            {
                var12_11 = ot2_0.d;
            }
            var3_2.D = var12_11;
lbl40:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var12_11 = ot2_0.d;
        ** while (true)
        var20_19 = var12_11;
        var4_3 = var3_2.b0;
        if (var4_3) ** GOTO lbl-1000
        var12_11 = var3_2.u;
        var13_12 = var12_11.c;
        if (var13_12 != 0) ** GOTO lbl-1000
        var12_11 = var12_11.a;
        var4_3 = var12_11.F;
        if (var10_9 == 0) ** GOTO lbl-1000
        var10_9 = gz3.a;
        if (var4_3 != var9_8 && var4_3 != var8_7 && var4_3 != var7_6 && var4_3 != var6_5 && var4_3 != var5_4) lbl-1000:
        // 2 sources

        {
            var4_3 = var3_2.E;
            var11_10 = (DefaultAudioSink$f)var11_10;
            var21_20 = var11_10.b;
            var21_20.o = var4_3;
        } else lbl-1000:
        // 3 sources

        {
            var4_3 = false;
            var12_11 = null;
        }
        var3_2.E = var4_3;
        var12_11 = var3_2.i;
        var22_21 = 0L;
        var24_22 = Math.max(var22_21, var1_1);
        var26_23 = var3_2.u;
        var27_24 = this.x();
        var6_5 = var26_23.e;
        var29_25 = gz3.M((int)var6_5, var27_24);
        var14_13 = var21_20;
        var21_20 = new DefaultAudioSink$g(var20_19, var24_22, var29_25);
        var12_11.add(var21_20);
        var3_2.v = var12_11 = var3_2.u.i;
        var12_11.b();
        var12_11 = var3_2.s;
        if (var12_11 != null) {
            var5_4 = var3_2.E;
            var12_11 = ((g$a)var12_11).a.U0;
            var26_23 = var12_11.a;
            if (var26_23 != null) {
                var31_26 = new Qr((b$a)var12_11, var5_4);
                var26_23.post(var31_26);
            }
        }
    }

    public final void release() {
        int n3;
        a a2 = this.y;
        if (a2 != null && (n3 = a2.j) != 0) {
            AudioManager audioManager;
            Object object = null;
            a2.g = null;
            n3 = gz3.a;
            int n4 = 23;
            Context context = a2.a;
            if (n3 >= n4 && (object = a2.d) != null) {
                audioManager = (AudioManager)context.getSystemService("audio");
                audioManager.getClass();
                pr_1.a(audioManager, object);
            }
            object = a2.e;
            context.unregisterReceiver((BroadcastReceiver)object);
            object = a2.f;
            if (object != null) {
                audioManager = ((a$b)((Object)object)).a;
                audioManager.unregisterContentObserver((ContentObserver)object);
            }
            n3 = 0;
            object = null;
            a2.j = false;
        }
    }

    public final void reset() {
        AudioProcessor audioProcessor;
        boolean bl2;
        this.flush();
        Object object = this.f.iterator();
        while (bl2 = object.hasNext()) {
            audioProcessor = (AudioProcessor)object.next();
            audioProcessor.reset();
        }
        object = this.g.iterator();
        while (bl2 = object.hasNext()) {
            audioProcessor = (AudioProcessor)object.next();
            audioProcessor.reset();
        }
        object = this.v;
        if (object != null) {
            ((androidx.media3.common.audio.a)object).g();
        }
        this.W = false;
        this.e0 = false;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AudioTrack s(AudioSink$a audioSink$a, dr_1 object, int n3, androidx.media3.common.d d2) {
        int n4;
        Object object2;
        block6: {
            AudioSink$InitializationException audioSink$InitializationException;
            block7: {
                object2 = this.q;
                object = ((f)object2).a(audioSink$a, (dr_1)object, n3);
                n4 = object.getState();
                n3 = 1;
                if (n4 == n3) {
                    return object;
                }
                try {
                    object.release();
                    break block6;
                }
                catch (Exception exception) {}
                catch (IllegalArgumentException illegalArgumentException) {
                    break block7;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {}
            }
            void var11_19 = audioSink$InitializationException;
            int n7 = audioSink$a.c;
            int n8 = audioSink$a.b;
            int n10 = audioSink$a.a;
            boolean bl2 = audioSink$a.e;
            AudioSink$InitializationException audioSink$InitializationException2 = audioSink$InitializationException;
            audioSink$InitializationException = new AudioSink$InitializationException(0, n8, n7, n10, d2, bl2, (RuntimeException)var11_19);
            throw audioSink$InitializationException;
        }
        int n14 = audioSink$a.c;
        int n15 = audioSink$a.a;
        int n16 = audioSink$a.b;
        boolean bl3 = audioSink$a.e;
        object2 = object;
        object = new AudioSink$InitializationException(n4, n16, n14, n15, d2, bl3, null);
        throw object;
    }

    public final void setAudioSessionId(int n3) {
        int n4 = this.Y;
        if (n4 != n3) {
            this.Y = n3;
            n3 = n3 != 0 ? 1 : 0;
            this.X = n3;
            this.flush();
        }
    }

    public final void setAuxEffectInfo(dt dt2) {
        dt dt4 = this.Z;
        int n3 = dt4.equals(dt2);
        if (n3 != 0) {
            return;
        }
        n3 = dt2.a;
        AudioTrack audioTrack = this.w;
        if (audioTrack != null) {
            dt dt5 = this.Z;
            int n4 = dt5.a;
            if (n4 != n3) {
                audioTrack.attachAuxEffect(n3);
            }
            if (n3 != 0) {
                dt4 = this.w;
                float f5 = dt2.b;
                dt4.setAuxEffectSendLevel(f5);
            }
        }
        this.Z = dt2;
    }

    public final void setPlaybackParameters(ot2_0 ot2_02) {
        float f5 = ot2_02.a;
        float f6 = 0.1f;
        float f7 = 8.0f;
        f5 = gz3.g(f5, f6, f7);
        float f8 = ot2_02.b;
        f6 = gz3.g(f8, f6, f7);
        Object object = new ot2_0(f5, f6);
        this.D = object;
        boolean bl2 = this.G();
        if (bl2) {
            this.E();
        } else {
            long l2 = -9223372036854775807L;
            long l3 = -9223372036854775807L;
            object = new DefaultAudioSink$g(ot2_02, l3, l2);
            boolean bl3 = this.z();
            if (bl3) {
                this.B = object;
            } else {
                this.C = object;
            }
        }
    }

    public final void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2 = null;
        Object object = audioDeviceInfo == null ? null : new rr_0(audioDeviceInfo);
        this.a0 = object;
        object = this.y;
        if (object != null) {
            ((a)object).b(audioDeviceInfo);
        }
        if ((audioDeviceInfo = this.w) != null) {
            object = this.a0;
            if (object != null) {
                audioDeviceInfo2 = ((rr_0)object).a;
            }
            vk0_0.a((AudioTrack)audioDeviceInfo, audioDeviceInfo2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setSkipSilenceEnabled(boolean bl2) {
        this.E = bl2;
        bl2 = this.G();
        Object object = bl2 ? ot2_0.d : this.D;
        ot2_0 ot2_02 = object;
        long l2 = -9223372036854775807L;
        long l3 = -9223372036854775807L;
        object = new DefaultAudioSink$g(ot2_02, l3, l2);
        boolean bl3 = this.z();
        if (!bl3) {
            this.C = object;
            return;
        }
        this.B = object;
    }

    public final void setVolume(float f5) {
        float f6 = this.P;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.P = f5;
            boolean bl2 = this.z();
            if (bl2) {
                AudioTrack audioTrack = this.w;
                f6 = this.P;
                audioTrack.setVolume(f6);
            }
        }
    }

    public final AudioTrack t(DefaultAudioSink$e object) {
        Object object2;
        try {
            object2 = ((DefaultAudioSink$e)object).a();
        }
        catch (AudioSink$InitializationException audioSink$InitializationException) {
            object2 = this.s;
            if (object2 != null) {
                object2 = (g$a)object2;
                ((g$a)object2).a(audioSink$InitializationException);
            }
            throw audioSink$InitializationException;
        }
        dr_1 dr_12 = this.A;
        int n3 = this.Y;
        object = ((DefaultAudioSink$e)object).a;
        return this.s((AudioSink$a)object2, dr_12, n3, (androidx.media3.common.d)object);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void u(long var1_1) {
        block34: {
            block35: {
                block36: {
                    block31: {
                        block32: {
                            block33: {
                                var3_2 = this.S;
                                if (var3_2 == null) {
                                    return;
                                }
                                var3_2 = this.n;
                                var4_3 = var3_2.a;
                                var5_4 = false;
                                var6_5 = 1;
                                if (var4_3 != null) {
                                    var4_3 = DefaultAudioSink.k0;
                                    synchronized (var4_3) {
                                        var7_6 = DefaultAudioSink.m0;
                                        if (var7_6 > false) {
                                            return;
                                        }
                                        var7_6 = false;
                                        var8_7 = null;
                                        ** if (!var7_6) goto lbl18
                                    }
lbl17:
                                    // 1 sources

                                    return;
lbl18:
                                    // 1 sources

                                    var9_8 = SystemClock.elapsedRealtime();
                                    cfr_temp_0 = var9_8 - (var11_9 = var3_2.c);
                                    var13_10 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                    if (var13_10 < 0) {
                                        return;
                                    }
                                }
                                var4_3 = this.S;
                                var13_10 = var4_3.remaining();
                                var7_6 = this.b0;
                                var14_11 = -9223372036854775807L;
                                if (!var7_6) break block32;
                                var7_6 = (boolean)(var1_1 == var14_11 ? 0 : (var1_1 < var14_11 ? -1 : 1));
                                if (var7_6) {
                                    var7_6 = true;
                                } else {
                                    var7_6 = false;
                                    var8_7 = null;
                                }
                                ct3.f(var7_6);
                                var16_12 = -9223372036854775808L;
                                var7_6 = var1_1 == var16_12 ? 0 : (var1_1 < var16_12 ? -1 : 1);
                                if (!var7_6) {
                                    var1_1 = this.c0;
                                } else {
                                    this.c0 = var1_1;
                                }
                                var8_7 = this.w;
                                var18_13 = this.S;
                                var19_14 = gz3.a;
                                var20_15 = 26;
                                var21_16 = 1000L;
                                if (var19_14 < var20_15) break block33;
                                var23_17 = Lk0.a(var8_7, var18_13, var13_10, var1_1 *= var21_16);
                                break block31;
                            }
                            var24_18 = this.F;
                            if (var24_18 == null) {
                                var19_14 = 16;
                                this.F = var24_18 = ByteBuffer.allocate(var19_14);
                                var25_19 = ByteOrder.BIG_ENDIAN;
                                var24_18.order(var25_19);
                                var24_18 = this.F;
                                var20_15 = 0x55550001;
                                var24_18.putInt(var20_15);
                            }
                            if ((var19_14 = this.G) == 0) {
                                this.F.putInt(4, var13_10);
                                var24_18 = this.F;
                                var20_15 = 8;
                                var24_18.putLong(var20_15, var1_1 *= var21_16);
                                var26_20 = this.F;
                                var26_20.position(0);
                                this.G = var13_10;
                            }
                            if ((var23_17 = (var26_20 = this.F).remaining()) <= 0) ** GOTO lbl-1000
                            var27_21 = this.F;
                            var28_22 = var8_7.write((ByteBuffer)var27_21, var23_17, var6_5);
                            if (var28_22 < 0) {
                                this.G = 0;
                                var23_17 = var28_22;
                                break block31;
                            } else if (var28_22 < var23_17) {
                                var23_17 = 0;
                                var26_20 = null;
                                break block31;
                            } else lbl-1000:
                            // 2 sources

                            {
                                this.G = (var23_17 = var8_7.write(var18_13, var13_10, var6_5)) < 0 ? 0 : (var28_22 = this.G - var23_17);
                            }
                            break block31;
                        }
                        var26_20 = this.w;
                        var27_21 = this.S;
                        var23_17 = var26_20.write((ByteBuffer)var27_21, var13_10, var6_5);
                    }
                    this.d0 = var16_12 = SystemClock.elapsedRealtime();
                    var16_12 = 0L;
                    if (var23_17 >= 0) break block34;
                    var28_22 = gz3.a;
                    var13_10 = 24;
                    if ((var28_22 < var13_10 || var23_17 != (var28_22 = -6)) && var23_17 != (var28_22 = -32)) break block35;
                    var9_8 = this.x();
                    cfr_temp_1 = var9_8 - var16_12;
                    var28_22 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var28_22 > 0) break block36;
                    var27_21 = this.w;
                    var28_22 = (int)DefaultAudioSink.A((AudioTrack)var27_21);
                    if (var28_22 == 0) break block35;
                    var27_21 = this.u;
                    var28_22 = var27_21.c;
                    if (var28_22 == var6_5) {
                        this.e0 = var6_5;
                    }
                }
                var5_4 = true;
            }
            var4_3 = this.u.a;
            var27_21 = new AudioSink$WriteException(var23_17, (androidx.media3.common.d)var4_3, var5_4);
            var26_20 = this.s;
            if (var26_20 != null) {
                var26_20 = (g$a)var26_20;
                var26_20.a((Exception)var27_21);
            }
            if ((var23_17 = (int)var27_21.b) == 0) {
                var3_2.a((Exception)var27_21);
                return;
            }
            this.x = var26_20 = or_0.c;
            throw var27_21;
        }
        var28_22 = 0;
        var27_21 = null;
        var3_2.a = null;
        var3_2.b = var14_11;
        var3_2.c = var14_11;
        var3_2 = this.w;
        var29_23 = DefaultAudioSink.A((AudioTrack)var3_2);
        if (var29_23 != 0) {
            var9_8 = this.K;
            cfr_temp_2 = var9_8 - var16_12;
            var29_23 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
            if (var29_23 > 0) {
                this.f0 = false;
            }
            if ((var29_23 = (int)this.W) != 0 && (var3_2 = this.s) != null && var23_17 < var13_10 && !(var7_6 = this.f0) && (var3_2 = ((g$a)var3_2).a.G) != null) {
                var3_2.a();
            }
        }
        var3_2 = this.u;
        var29_23 = var3_2.c;
        if (var29_23 == 0) {
            var9_8 = this.J;
            var11_9 = var23_17;
            this.J = var9_8 += var11_9;
        }
        if (var23_17 != var13_10) return;
        if (var29_23 != 0) {
            var26_20 = this.S;
            var3_2 = this.Q;
            if (var26_20 == var3_2) {
                var5_4 = true;
            }
            ct3.f(var5_4);
            var30_24 = this.K;
            var32_25 = this.L;
            var23_17 = this.R;
            var9_8 = var23_17;
            this.K = var32_25 = var32_25 * var9_8 + var30_24;
        }
        this.S = null;
    }

    public final boolean v() {
        Object object = this.v;
        boolean bl2 = ((androidx.media3.common.audio.a)object).e();
        long l2 = Long.MIN_VALUE;
        boolean bl3 = false;
        boolean bl4 = true;
        if (!bl2) {
            this.u(l2);
            object = this.S;
            if (object == null) {
                bl3 = true;
            }
            return bl3;
        }
        object = this.v;
        boolean bl5 = ((androidx.media3.common.audio.a)object).e();
        if (bl5 && !(bl5 = ((androidx.media3.common.audio.a)object).d)) {
            ((androidx.media3.common.audio.a)object).d = bl4;
            object = (AudioProcessor)((androidx.media3.common.audio.a)object).b.get(0);
            object.e();
        }
        this.D(l2);
        object = this.v;
        bl2 = ((androidx.media3.common.audio.a)object).d();
        if (bl2 && ((object = this.S) == null || !(bl2 = ((Buffer)object).hasRemaining()))) {
            bl3 = true;
        }
        return bl3;
    }

    public final long w() {
        long l2;
        DefaultAudioSink$e defaultAudioSink$e = this.u;
        int n3 = defaultAudioSink$e.c;
        if (n3 == 0) {
            l2 = this.H;
            int n4 = defaultAudioSink$e.b;
            long l3 = n4;
            l2 /= l3;
        } else {
            l2 = this.I;
        }
        return l2;
    }

    public final long x() {
        long l2;
        DefaultAudioSink$e defaultAudioSink$e = this.u;
        int n3 = defaultAudioSink$e.c;
        if (n3 == 0) {
            l2 = this.J;
            long l3 = defaultAudioSink$e.d;
            l2 += l3;
            long l4 = 1L;
            l2 = (l2 - l4) / l3;
        } else {
            l2 = this.K;
        }
        return l2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean y() {
        block30: {
            var1_1 = this;
            var2_2 = this.m;
            var3_4 = var2_2.a;
            var4_6 = 0;
            var5_7 = 0.0f;
            var6_8 /* !! */  = null;
            var7_9 = 1;
            if (var3_4 == null) {
                while (true) {
                    break;
                }
            } else {
                var3_4 = DefaultAudioSink.k0;
                synchronized (var3_4) {
                    var9_11 = DefaultAudioSink.m0;
                    if (var9_11 > 0) {
                        return false;
                    }
                    var9_11 = 0;
                    var10_12 = 0.0f;
                    var11_13 = null;
                    ** if (var9_11 == 0) goto lbl22
                }
lbl20:
                // 1 sources

                return false;
lbl22:
                // 1 sources

                if ((var8_10 = (cfr_temp_0 = (var12_14 = SystemClock.elapsedRealtime()) - (var14_15 = var2_2.c)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) >= 0) ** continue;
                return false;
            }
            var8_10 = 0;
            var2_2 = null;
            if (var8_10) {
                return false;
            }
            try {
                var2_2 = var1_1.u;
                var2_2.getClass();
                var2_2 = var1_1.t((DefaultAudioSink$e)var2_2);
            }
            catch (AudioSink$InitializationException var3_5) {
                var2_2 = var1_1.u;
                var9_11 = var2_2.h;
                var16_16 = 1000000;
                if (var9_11 <= var16_16) break block30;
                var16_16 = (int)var2_2.l;
                var17_17 = var2_2.a;
                var18_18 = var2_2.b;
                var19_19 = var2_2.c;
                var20_20 = var2_2.d;
                var21_21 = var2_2.e;
                var22_22 = var2_2.f;
                var23_23 = var2_2.g;
                var24_24 = var2_2.i;
                var25_25 = (int)var2_2.j;
                var8_10 = (int)var2_2.k;
                var26_26 = 1000000;
                var11_13 = new DefaultAudioSink$e(var17_17, var18_18, var19_19, var20_20, var21_21, var22_22, var23_23, var26_26, var24_24, (boolean)var25_25, (boolean)var8_10, (boolean)var16_16);
                try {
                    var2_2 = var1_1.t((DefaultAudioSink$e)var11_13);
                    var1_1.u = var11_13;
                }
                catch (AudioSink$InitializationException var2_3) {
                    var3_5.addSuppressed(var2_3);
                    break block30;
                }
            }
            var1_1.w = var2_2;
            var8_10 = DefaultAudioSink.A((AudioTrack)var2_2);
            if (var8_10) {
                var2_2 = var1_1.w;
                var3_4 = var1_1.l;
                if (var3_4 == null) {
                    var1_1.l = var3_4 = new DefaultAudioSink$k(var1_1);
                }
                var3_4 = var1_1.l;
                var11_13 = var3_4.a;
                Objects.requireNonNull(var11_13);
                var27_27 = new dl0_0((Handler)var11_13);
                var3_4 = var3_4.b;
                cl0_0.a((AudioTrack)var2_2, var27_27, (DefaultAudioSink$k$a)var3_4);
                var2_2 = var1_1.u;
                var28_28 = (int)var2_2.k;
                if (var28_28) {
                    var3_4 = var1_1.w;
                    var2_2 = var2_2.a;
                    var9_11 = var2_2.G;
                    var8_10 = var2_2.H;
                    t60_0.b((AudioTrack)var3_4, var9_11, var8_10);
                }
            }
            if ((var8_10 = gz3.a) >= (var28_28 = 31) && (var3_4 = var1_1.r) != null) {
                var11_13 = var1_1.w;
                var3_4 = var3_4.b;
                var3_4.getClass();
                var3_4 = var3_4.a;
                var27_27 = sF0.a();
                var16_16 = (int)Wk0.b((LogSessionId)var3_4, var27_27);
                if (var16_16 == 0) {
                    Xk0.b((AudioTrack)var11_13, (LogSessionId)var3_4);
                }
            }
            var28_28 = var1_1.w.getAudioSessionId();
            var1_1.Y = var28_28;
            var3_4 = var1_1.w;
            var11_13 = var1_1.u;
            var16_16 = var11_13.c;
            var25_25 = 2;
            if (var16_16 == var25_25) {
                var16_16 = 1;
            } else {
                var16_16 = 0;
                var27_27 = null;
            }
            var25_25 = var11_13.g;
            var29_29 = var11_13.d;
            var9_11 = var11_13.h;
            var30_30 = var1_1.h;
            var30_30.c = var3_4;
            var30_30.d = var9_11;
            var30_30.e = var31_31 = new Rr((AudioTrack)var3_4);
            var28_28 = var3_4.getSampleRate();
            var30_30.f = var28_28;
            var28_28 = 23;
            if (var16_16 != 0 && var8_10 < var28_28 && (var25_25 == (var16_16 = 5) || var25_25 == (var16_16 = 6))) {
                var16_16 = 1;
            } else {
                var16_16 = 0;
                var27_27 = null;
            }
            var30_30.g = var16_16;
            var16_16 = (int)gz3.E(var25_25);
            var30_30.p = var16_16;
            var32_32 = -9223372036854775807L;
            if (var16_16 != 0) {
                var12_14 = var9_11 /= var29_29;
                var25_25 = var30_30.f;
                var12_14 = gz3.M(var25_25, var12_14);
            } else {
                var12_14 = var32_32;
            }
            var30_30.h = var12_14;
            var30_30.s = var12_14 = 0L;
            var30_30.t = var12_14;
            var30_30.G = false;
            var30_30.H = var12_14;
            var30_30.u = var12_14;
            var30_30.o = false;
            var30_30.x = var32_32;
            var30_30.y = var32_32;
            var30_30.q = var12_14;
            var30_30.n = var12_14;
            var30_30.i = var5_7 = 1.0f;
            var4_6 = this.z();
            if (var4_6 != 0) {
                var6_8 /* !! */  = var1_1.w;
                var10_12 = var1_1.P;
                var6_8 /* !! */ .setVolume(var10_12);
            }
            var6_8 /* !! */  = var1_1.Z;
            var4_6 = var6_8 /* !! */ .a;
            if (var4_6 != 0) {
                var1_1.w.attachAuxEffect(var4_6);
                var6_8 /* !! */  = var1_1.w;
                var11_13 = var1_1.Z;
                var10_12 = var11_13.b;
                var6_8 /* !! */ .setAuxEffectSendLevel(var10_12);
            }
            if ((var6_8 /* !! */  = var1_1.a0) != null && var8_10 >= var28_28) {
                var3_4 = var1_1.w;
                var6_8 /* !! */  = var6_8 /* !! */ .a;
                vk0_0.a((AudioTrack)var3_4, (AudioDeviceInfo)var6_8 /* !! */ );
                var3_4 = var1_1.y;
                if (var3_4 != null) {
                    var6_8 /* !! */  = var1_1.a0.a;
                    var3_4.b((AudioDeviceInfo)var6_8 /* !! */ );
                }
            }
            if (var8_10 >= (var28_28 = 24) && (var2_2 = var1_1.y) != null) {
                var6_8 /* !! */  = var1_1.w;
                var3_4 = new DefaultAudioSink$h(var6_8 /* !! */ , (a)var2_2);
                var1_1.z = var3_4;
            }
            var1_1.N = var7_9;
            var2_2 = var1_1.s;
            if (var2_2 == null) return (boolean)var7_9;
            var3_4 = var1_1.u.a();
            var2_2 = ((g$a)var2_2).a.U0;
            var6_8 /* !! */  = var2_2.a;
            if (var6_8 /* !! */  == null) return (boolean)var7_9;
            var11_13 = new Gr((b$a)var2_2, (AudioSink$a)var3_4);
            var6_8 /* !! */ .post((Runnable)var11_13);
            return (boolean)var7_9;
        }
        var2_2 = var1_1.u;
        var8_10 = var2_2.c;
        if (var8_10 != var7_9) throw var3_5;
        var1_1.e0 = var7_9;
        throw var3_5;
    }

    public final boolean z() {
        boolean bl2;
        AudioTrack audioTrack = this.w;
        if (audioTrack != null) {
            bl2 = true;
        } else {
            bl2 = false;
            audioTrack = null;
        }
        return bl2;
    }
}

