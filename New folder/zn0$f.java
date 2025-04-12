/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioFormat
 *  android.media.AudioFormat$Builder
 *  android.media.Spatializer
 *  android.os.Handler
 */
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Handler;
import androidx.media3.common.d;
import java.util.Objects;

public final class zn0$f {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public Hn0 d;

    public zn0$f(Spatializer spatializer) {
        this.a = spatializer;
        int n3 = Bn0.a(spatializer);
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            spatializer = null;
        }
        this.b = n3;
    }

    public final boolean a(dr_1 dr_12, d d2) {
        String string2 = d2.o;
        String string3 = "audio/eac3-joc";
        int n3 = Objects.equals(string2, string3);
        int n4 = -1;
        int n7 = d2.D;
        if (n3 != 0) {
            n3 = 16;
            if (n7 == n3) {
                n7 = 12;
            }
        } else {
            String string4 = d2.o;
            string2 = "audio/iamf";
            n3 = (int)(Objects.equals(string4, string2) ? 1 : 0);
            if (n3 != 0) {
                if (n7 == n4) {
                    n7 = 6;
                }
            } else {
                string2 = "audio/ac4";
                n3 = (int)(Objects.equals(string4, string2) ? 1 : 0);
                if (n3 != 0 && (n7 == (n3 = 18) || n7 == (n3 = 21))) {
                    n7 = 24;
                }
            }
        }
        if ((n3 = gz3.o(n7)) == 0) {
            return false;
        }
        AudioFormat.Builder builder = new AudioFormat.Builder();
        int n8 = 2;
        builder = builder.setEncoding(n8);
        string2 = builder.setChannelMask(n3);
        int n10 = d2.E;
        if (n10 != n4) {
            string2.setSampleRate(n10);
        }
        d2 = this.a;
        dr_12 = dr_12.a().a;
        string2 = string2.build();
        return Gn0.a((Spatializer)d2, (AudioAttributes)dr_12, (AudioFormat)string2);
    }
}

