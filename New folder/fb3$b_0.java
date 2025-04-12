/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/*
 * Renamed from FB3$b
 */
public final class fb3$b_0
implements U92$b {
    public final ByteBuffer a;

    public fb3$b_0() {
        ByteBuffer byteBuffer;
        this.a = byteBuffer = ByteBuffer.allocate(4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(byte[] object, Object object2, MessageDigest messageDigest) {
        if ((object2 = (Integer)object2) == null) {
            return;
        }
        messageDigest.update((byte[])object);
        object = this.a;
        synchronized (object) {
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(0);
            byteBuffer = this.a;
            int n3 = (Integer)object2;
            object2 = byteBuffer.putInt(n3);
            object2 = ((ByteBuffer)object2).array();
            messageDigest.update((byte[])object2);
            return;
        }
    }
}

