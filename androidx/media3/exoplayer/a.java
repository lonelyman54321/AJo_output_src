/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioAttributes
 *  android.media.AudioFocusRequest
 *  android.media.AudioFocusRequest$Builder
 *  android.media.AudioManager
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.os.Handler
 */
package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.media3.exoplayer.a$a;
import androidx.media3.exoplayer.a$b;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.e$b;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.Objects;

public final class a {
    public final Supplier a;
    public final a$a b;
    public a$b c;
    public dr_1 d;
    public int e;
    public int f;
    public float g = 1.0f;
    public AudioFocusRequest h;

    public a(Context object, Handler handler, a$b a$b) {
        br_1 br_12 = new br_1((Context)object);
        object = Suppliers.memoize(br_12);
        this.a = object;
        this.c = a$b;
        super(this, handler);
        this.b = object;
        this.e = 0;
    }

    public final void a() {
        int n3 = this.e;
        int n4 = 1;
        if (n3 != n4 && n3 != 0) {
            n3 = gz3.a;
            n4 = 26;
            Supplier supplier = this.a;
            if (n3 >= n4) {
                AudioFocusRequest audioFocusRequest = this.h;
                if (audioFocusRequest != null) {
                    audioFocusRequest = (AudioManager)supplier.get();
                    AudioFocusRequest audioFocusRequest2 = this.h;
                    xr.a((AudioManager)audioFocusRequest, audioFocusRequest2);
                }
            } else {
                AudioManager audioManager = (AudioManager)supplier.get();
                a$a a$a = this.b;
                audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener)a$a);
            }
        }
    }

    public final void b(int n3) {
        Object object = this.c;
        if (object != null) {
            object = ((e$b)object).a;
            boolean bl2 = ((e)object).getPlayWhenReady();
            int n4 = -1;
            n4 = n3 == n4 ? 2 : 1;
            ((e)object).A(n3, n4, bl2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void c(dr_1 var1_1) {
        block14: {
            block13: {
                var2_2 = this.d;
                var3_3 = gz3.a;
                var4_4 = Objects.equals(var2_2, var1_1);
                if (var4_4) break block14;
                this.d = var1_1;
                var4_4 = false;
                var2_2 = null;
                var3_3 = 1;
                if (var1_1 == null) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        var5_5 = 0;
                        break block13;
                        break;
                    }
                }
                var5_5 = 3;
                var6_6 = var1_1.c;
                switch (var6_6) {
                    case 3: {
                        ** GOTO lbl-1000
                    }
                    default: {
                        var1_1 = "Unidentified audio usage: ";
                        CS1.a(var6_6, (String)var1_1);
                        ** continue;
                    }
                    case 16: {
                        var5_5 = 4;
                        break;
                    }
                    case 11: {
                        var7_7 = var1_1.a;
                        if (var7_7 != var3_3) break;
                    }
                    case 2: 
                    case 4: {
                        var5_5 = 2;
                        break;
                    }
lbl31:
                    // 2 sources

                    case 1: 
                    case 14: {
                        var5_5 = 1;
                        break;
                    }
                    case 0: {
                        var1_1 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.";
                        Cx.f((String)var1_1);
                        ** GOTO lbl31
                    }
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 12: 
                    case 13: 
                }
            }
            this.f = var5_5;
            if (var5_5 == var3_3 || var5_5 == 0) {
                var4_4 = true;
            }
            var1_1 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.";
            ct3.b(var4_4, (String)var1_1);
        }
    }

    public final void d(int n3) {
        float f5;
        int n4 = this.e;
        if (n4 == n3) {
            return;
        }
        this.e = n3;
        n4 = 4;
        float f6 = 5.6E-45f;
        if (n3 == n4) {
            n3 = 1045220557;
            f5 = 0.2f;
        } else {
            n3 = 1065353216;
            f5 = 1.0f;
        }
        f6 = this.g;
        n4 = (int)(f6 == f5 ? 0 : (f6 > f5 ? 1 : -1));
        if (n4 == 0) {
            return;
        }
        this.g = f5;
        Object object = this.c;
        if (object != null) {
            object = ((e$b)object).a;
            f6 = ((e)object).h0;
            a a2 = ((e)object).B;
            float f7 = a2.g;
            Float f8 = Float.valueOf(f6 *= f7);
            int n7 = 1;
            f7 = Float.MIN_VALUE;
            int n8 = 2;
            ((e)object).u(n7, n8, f8);
        }
    }

    public final int e(int n3, boolean n4) {
        int n7 = 1;
        boolean bl2 = false;
        dr_1 dr_12 = null;
        if (n3 != n7 && (n3 = this.f) == n7) {
            n3 = 3;
            int n8 = -1;
            if (n4 != 0) {
                n4 = this.e;
                int n10 = 2;
                if (n4 != n10) {
                    n4 = gz3.a;
                    int n14 = 26;
                    Supplier supplier = this.a;
                    a$a a$a = this.b;
                    if (n4 >= n14) {
                        Object object;
                        AudioFocusRequest audioFocusRequest = this.h;
                        if (audioFocusRequest == null) {
                            boolean bl3;
                            if (audioFocusRequest == null) {
                                ar_0.a();
                                n3 = this.f;
                                audioFocusRequest = yr_1.a(n3);
                            } else {
                                ar_0.a();
                                audioFocusRequest = zr.a(this.h);
                            }
                            object = this.d;
                            if (object != null && (n14 = ((dr_1)object).a) == n7) {
                                bl3 = true;
                            }
                            object.getClass();
                            object = ((dr_1)object).a().a;
                            this.h = audioFocusRequest = vr.a(ur.a(tr.a(sr.a((AudioFocusRequest.Builder)audioFocusRequest, (AudioAttributes)object), bl3), a$a));
                        }
                        audioFocusRequest = (AudioManager)supplier.get();
                        object = this.h;
                        n3 = wr.a((AudioManager)audioFocusRequest, (AudioFocusRequest)object);
                    } else {
                        AudioManager audioManager = (AudioManager)supplier.get();
                        dr_12 = this.d;
                        dr_12.getClass();
                        int n15 = this.f;
                        n3 = audioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener)a$a, n3, n15);
                    }
                    if (n3 == n7) {
                        this.d(n10);
                    } else {
                        this.d(n7);
                        n7 = -1;
                    }
                }
                return n7;
            }
            n4 = this.e;
            if (n4 != n7) {
                if (n4 != n3) {
                    return n7;
                }
                return 0;
            }
            return n8;
        }
        this.a();
        this.d(0);
        return n7;
    }
}

