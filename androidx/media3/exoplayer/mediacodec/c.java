/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import androidx.media3.exoplayer.mediacodec.a$a;
import androidx.media3.exoplayer.mediacodec.d;
import androidx.media3.exoplayer.mediacodec.d$a;
import androidx.media3.exoplayer.mediacodec.d$b;
import androidx.media3.exoplayer.mediacodec.h$a;

public final class c
implements d$b {
    public final Context a;

    public c(Context context) {
        this.a = context;
    }

    public final d a(d$a d$a) {
        h$a h$a;
        int n3;
        Object object;
        int n4 = gz3.a;
        int n7 = 23;
        if (n4 >= n7 && (n4 >= (n7 = 31) || (object = this.a) != null && n4 >= (n3 = 28) && (n4 = (int)((h$a = object.getPackageManager()).hasSystemFeature((String)(object = "com.amazon.hardware.tv_screen")) ? 1 : 0)) != 0)) {
            n4 = ip1_0.g(d$a.c.o);
            object = new StringBuilder("Creating an asynchronous MediaCodec adapter for track type ");
            String string2 = gz3.x(n4);
            ((StringBuilder)object).append(string2);
            Cx.e(((StringBuilder)object).toString());
            object = new a$a(n4);
            ((a$a)object).c = false;
            return ((a$a)object).b(d$a);
        }
        h$a = new Object();
        return h$a.a(d$a);
    }
}

