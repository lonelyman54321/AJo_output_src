/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class ne1$a
implements ne1 {
    public final ByteBuffer a;
    public final List b;
    public final Kp c;

    public ne1$a(ByteBuffer byteBuffer, ArrayList arrayList, Kp kp) {
        this.a = byteBuffer;
        this.b = arrayList;
        this.c = kp;
    }

    public final Bitmap a(BitmapFactory.Options options) {
        ByteBuffer byteBuffer = hf_0.c(this.a);
        hF$a hF$a = new hF$a(byteBuffer);
        return BitmapFactory.decodeStream((InputStream)hF$a, null, (BitmapFactory.Options)options);
    }

    public final void b() {
    }

    public final int c() {
        ByteBuffer byteBuffer = hf_0.c(this.a);
        Kp kp = this.c;
        int n3 = -1;
        if (byteBuffer != null) {
            List list = this.b;
            int n4 = list.size();
            for (int i3 = 0; i3 < n4; ++i3) {
                ImageHeaderParser imageHeaderParser = (ImageHeaderParser)list.get(i3);
                try {
                    int n7 = imageHeaderParser.d(byteBuffer, kp);
                    if (n7 == n3) continue;
                    n3 = n7;
                    break;
                }
                finally {
                    hf_0.c(byteBuffer);
                }
            }
        }
        return n3;
    }

    public final ImageHeaderParser$ImageType d() {
        ByteBuffer byteBuffer = hf_0.c(this.a);
        return com.bumptech.glide.load.a.c(this.b, byteBuffer);
    }
}

