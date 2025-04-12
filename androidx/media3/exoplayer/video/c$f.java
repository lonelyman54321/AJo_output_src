/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.media3.exoplayer.video;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.c;
import androidx.media3.exoplayer.video.c$e;
import com.google.common.collect.ImmutableList;

public final class c$f
implements Vy2$a {
    public final MB3$a a;

    public c$f(c$e c$e) {
        this.a = c$e;
    }

    public final vy2_1 a(Context context, VX object, c c2, Tt2 tt2, ImmutableList immutableList) {
        Object var6_8 = null;
        int n3 = 1;
        Context context2 = "androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory";
        try {
            context2 = Class.forName((String)context2);
        }
        catch (Exception exception) {
            int n4 = VideoFrameProcessingException.a;
            n4 = exception instanceof VideoFrameProcessingException;
            Object object2 = n4 != 0 ? (VideoFrameProcessingException)exception : (object = new Exception(exception));
            throw object2;
        }
        Object object3 = new Class[n3];
        Object object4 = MB3$a.class;
        object3[0] = object4;
        context2 = context2.getConstructor((Class<?>)object3);
        object3 = this.a;
        Object object5 = new Object[n3];
        object5[0] = object3;
        var6_8 = context2.newInstance((Object[])object5);
        object5 = var6_8;
        object5 = var6_8;
        context2 = context;
        object3 = object;
        object4 = c2;
        return object5.a(context, (VX)object, c2, tt2, immutableList);
    }
}

