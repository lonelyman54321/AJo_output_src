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
import java.io.InputStream;
import java.util.List;

public final class Qk$c
implements BK2 {
    public final Qk a;

    public Qk$c(Qk qk) {
        this.a = qk;
    }

    public final boolean a(Object object, Z92 object2) {
        boolean bl2;
        int n3;
        int n4;
        object = (InputStream)object;
        object2 = this.a;
        List list = ((Qk)object2).a;
        object2 = ((Qk)object2).b;
        if ((object = com.bumptech.glide.load.a.b(list, (InputStream)object, (Kp)object2)) != (object2 = ImageHeaderParser$ImageType.ANIMATED_WEBP) && ((n4 = Build.VERSION.SDK_INT) < (n3 = 31) || object != (object2 = ImageHeaderParser$ImageType.ANIMATED_AVIF))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final wk2_0 b(Object object, int n3, int n4, Z92 z92) {
        object = qd1.a(hf_0.b((InputStream)object));
        this.a.getClass();
        return Qk.a((ImageDecoder.Source)object, n3, n4, z92);
    }
}

