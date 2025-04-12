/*
 * Decompiled with CFR 0.152.
 */
import com.bumptech.glide.load.data.a;
import java.nio.ByteBuffer;

/*
 * Renamed from gF
 */
public final class gf_1
implements a {
    public final ByteBuffer a;

    public gf_1(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public final Object a() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    public final void b() {
    }
}

