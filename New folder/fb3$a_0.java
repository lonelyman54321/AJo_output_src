/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/*
 * Renamed from FB3$a
 */
public final class fb3$a_0
implements U92$b {
    public final ByteBuffer a;

    public fb3$a_0() {
        ByteBuffer byteBuffer;
        this.a = byteBuffer = ByteBuffer.allocate(8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(byte[] object, Object object2, MessageDigest messageDigest) {
        object2 = (Long)object2;
        messageDigest.update((byte[])object);
        object = this.a;
        synchronized (object) {
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(0);
            byteBuffer = this.a;
            long l2 = (Long)object2;
            object2 = byteBuffer.putLong(l2);
            object2 = ((ByteBuffer)object2).array();
            messageDigest.update((byte[])object2);
            return;
        }
    }
}

