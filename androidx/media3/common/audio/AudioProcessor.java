/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor$a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface AudioProcessor {
    public static final ByteBuffer a;

    static {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(0);
        ByteOrder byteOrder = ByteOrder.nativeOrder();
        a = byteBuffer.order(byteOrder);
    }

    public boolean b();

    public ByteBuffer c();

    public void d(ByteBuffer var1);

    public void e();

    public AudioProcessor$a f(AudioProcessor$a var1);

    public void flush();

    public boolean isActive();

    public void reset();
}

