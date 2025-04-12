/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioAttributes
 *  android.media.AudioFormat
 *  android.media.AudioManager
 */
package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.media3.exoplayer.audio.DefaultAudioSink$a;

public final class d
implements DefaultAudioSink$a {
    public final Context a;
    public Boolean b;

    public d(Context context) {
        this.a = context;
    }

    public final Dr a(dr_1 object, androidx.media3.common.d object2) {
        int n3;
        object2.getClass();
        object.getClass();
        int n4 = gz3.a;
        int n7 = 29;
        if (n4 >= n7 && (n3 = ((androidx.media3.common.d)object2).E) != (n7 = -1)) {
            int n8;
            String string2;
            Object object3 = this.b;
            boolean bl2 = false;
            boolean bl3 = true;
            if (object3 != null) {
                n7 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
            } else {
                object3 = this.a;
                if (object3 != null) {
                    string2 = "audio";
                    if ((object3 = (AudioManager)object3.getSystemService(string2)) != null) {
                        string2 = "offloadVariableRateSupported";
                        if ((object3 = object3.getParameters(string2)) != null && (n7 = (int)(((String)object3).equals(string2 = "offloadVariableRateSupported=1") ? 1 : 0)) != 0) {
                            n7 = 1;
                        } else {
                            n7 = 0;
                            object3 = null;
                        }
                        this.b = object3 = Boolean.valueOf(n7 != 0);
                    } else {
                        object3 = Boolean.FALSE;
                        this.b = object3;
                    }
                } else {
                    object3 = Boolean.FALSE;
                    this.b = object3;
                }
                object3 = this.b;
                n7 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
            }
            string2 = ((androidx.media3.common.d)object2).o;
            string2.getClass();
            String string3 = ((androidx.media3.common.d)object2).k;
            int n10 = ip1_0.b(string2, string3);
            if (n10 != 0 && n4 >= (n8 = gz3.m(n10))) {
                block18: {
                    int n14 = gz3.o(((androidx.media3.common.d)object2).D);
                    if (n14 == 0) {
                        return Dr.d;
                    }
                    try {
                        object2 = gz3.n(n3, n14, n10);
                        n3 = 31;
                        if (n4 < n3) break block18;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        return Dr.d;
                    }
                    object = ((dr_1)object).a().a;
                    int n15 = Fk0.a((AudioFormat)object2, (AudioAttributes)object);
                    if (n15 == 0) {
                        object = Dr.d;
                    } else {
                        object2 = new Object();
                        n3 = 32;
                        if (n4 > n3 && n15 == (n4 = 2)) {
                            bl2 = true;
                        }
                        ((Dr$a)object2).a = bl3;
                        ((Dr$a)object2).b = bl2;
                        ((Dr$a)object2).c = n7;
                        object = ((Dr$a)object2).a();
                    }
                    return object;
                }
                object = ((dr_1)object).a().a;
                boolean bl4 = Ek0.b((AudioFormat)object2, (AudioAttributes)object);
                if (!bl4) {
                    object = Dr.d;
                } else {
                    object = new Object();
                    ((Dr$a)object).a = bl3;
                    ((Dr$a)object).c = n7;
                    object = ((Dr$a)object).a();
                }
                return object;
            }
            return Dr.d;
        }
        return Dr.d;
    }
}

