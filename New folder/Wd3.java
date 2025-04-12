/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class Wd3
implements BK2 {
    public final List a;
    public final BK2 b;
    public final Kp c;

    public Wd3(ArrayList arrayList, ff_1 ff_12, Kp kp) {
        this.a = arrayList;
        this.b = ff_12;
        this.c = kp;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean a(Object object, Z92 object2) {
        boolean bl2;
        ImageHeaderParser$ImageType imageHeaderParser$ImageType;
        List list;
        ImageHeaderParser$ImageType imageHeaderParser$ImageType2;
        void var2_5;
        InputStream inputStream = (InputStream)object;
        Object object3 = NZ0.b;
        Boolean bl3 = (Boolean)var2_5.c((U92)object3);
        boolean bl4 = bl3;
        if (!bl4 && (imageHeaderParser$ImageType2 = com.bumptech.glide.load.a.b(list = this.a, inputStream, (Kp)(object3 = this.c))) == (imageHeaderParser$ImageType = ImageHeaderParser$ImageType.GIF)) {
            bl2 = true;
        } else {
            bl2 = false;
            Object var1_4 = null;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final wk2_0 b(Object object, int n3, int n4, Z92 z92) {
        wk2_0 wk2_02;
        Object object2;
        block4: {
            object = (InputStream)object;
            int n7 = 16384;
            object2 = new ByteArrayOutputStream(n7);
            wk2_02 = null;
            try {
                int n8;
                int n10;
                byte[] byArray = new byte[n7];
                while ((n10 = ((InputStream)object).read(byArray)) != (n8 = -1)) {
                    n8 = 0;
                    ((ByteArrayOutputStream)object2).write(byArray, 0, n10);
                }
                ((OutputStream)object2).flush();
            }
            catch (IOException iOException) {
                int n14 = 5;
                Log.isLoggable((String)"StreamGifDecoder", (int)n14);
                object = null;
                break block4;
            }
            object = ((ByteArrayOutputStream)object2).toByteArray();
        }
        if (object == null) {
            return wk2_02;
        }
        object = ByteBuffer.wrap((byte[])object);
        object2 = this.b;
        return object2.b(object, n3, n4, z92);
    }
}

