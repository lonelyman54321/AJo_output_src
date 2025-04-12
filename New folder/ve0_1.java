/*
 * Decompiled with CFR 0.152.
 */
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from vE0
 */
public final class ve0_1
implements ImageHeaderParser {
    public final int a(InputStream inputStream, Kp object) {
        object = new ue0_0(inputStream);
        int n3 = ((ue0_0)object).c();
        if (n3 == 0) {
            n3 = -1;
        }
        return n3;
    }

    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public final int d(ByteBuffer byteBuffer, Kp kp) {
        Object object = hf_0.a;
        object = new hF$a(byteBuffer);
        return this.a((InputStream)object, kp);
    }
}

