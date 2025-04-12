/*
 * Decompiled with CFR 0.152.
 */
import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sn1
 */
public final class sn1_2
extends ul0_1 {
    public final RandomAccessFile d;

    public sn1_2(RandomAccessFile randomAccessFile) {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.d = randomAccessFile;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            RandomAccessFile randomAccessFile = this.d;
            randomAccessFile.close();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - bad return control flow
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int b(long l2, byte[] byArray, int n3, int n4) {
        synchronized (this) {
            int n7;
            int n8;
            Object object = "array";
            try {
                int n10;
                Intrinsics.checkNotNullParameter(byArray, (String)object);
                object = this.d;
                ((RandomAccessFile)object).seek(l2);
                Object var8_7 = null;
                for (n8 = 0; n8 < n4; n8 += n10) {
                    RandomAccessFile randomAccessFile = this.d;
                    n7 = n4 - n8;
                    n10 = randomAccessFile.read(byArray, n3, n7);
                    if (n10 != (n7 = -1)) continue;
                    if (n8 != 0) break;
                }
            }
            catch (Throwable throwable) {}
            return n7;
            return n8;
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long c() {
        synchronized (this) {
            RandomAccessFile randomAccessFile = this.d;
            return randomAccessFile.length();
        }
    }
}

