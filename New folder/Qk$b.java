/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ImageDecoder$Source
 *  android.os.Build$VERSION
 */
import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.a;
import java.nio.ByteBuffer;

public final class Qk$b
implements BK2 {
    public final Qk a;

    public Qk$b(Qk qk) {
        this.a = qk;
    }

    public final boolean a(Object object, Z92 object2) {
        boolean bl2;
        int n3;
        int n4;
        object = (ByteBuffer)object;
        if ((object = com.bumptech.glide.load.a.c(this.a.a, (ByteBuffer)object)) != (object2 = ImageHeaderParser$ImageType.ANIMATED_WEBP) && ((n4 = Build.VERSION.SDK_INT) < (n3 = 31) || object != (object2 = ImageHeaderParser$ImageType.ANIMATED_AVIF))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final wk2_0 b(Object object, int n3, int n4, Z92 z92) {
        object = qd1.a((ByteBuffer)object);
        this.a.getClass();
        return Qk.a((ImageDecoder.Source)object, n3, n4, z92);
    }
}

