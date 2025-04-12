/*
 * Decompiled with CFR 0.152.
 */
import java.io.RandomAccessFile;
import java.util.zip.ZipException;

public final class KJ3 {
    public static KJ3$a a(RandomAccessFile object) {
        long l2;
        long l3 = ((RandomAccessFile)object).length();
        long l4 = l3 - (long)22;
        long l7 = l4 - (l2 = 0L);
        long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (l8 >= 0) {
            long l12;
            int n3;
            long l14 = 65558L;
            long l15 = (l3 -= l14) - l2;
            l8 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
            if (l8 >= 0) {
                l2 = l3;
            }
            int n4 = Integer.reverseBytes(101010256);
            do {
                ((RandomAccessFile)object).seek(l4);
                n3 = ((RandomAccessFile)object).readInt();
                if (n3 != n4) continue;
                n4 = 2;
                ((RandomAccessFile)object).skipBytes(n4);
                ((RandomAccessFile)object).skipBytes(n4);
                ((RandomAccessFile)object).skipBytes(n4);
                ((RandomAccessFile)object).skipBytes(n4);
                KJ3$a kJ3$a = new Object();
                long l16 = Integer.reverseBytes(((RandomAccessFile)object).readInt());
                long l17 = 0xFFFFFFFFL;
                kJ3$a.b = l16 &= l17;
                kJ3$a.a = l16 = (long)Integer.reverseBytes(((RandomAccessFile)object).readInt()) & l17;
                return kJ3$a;
            } while ((n3 = (int)((l12 = (l4 -= (l14 = 1L)) - l2) == 0L ? 0 : (l12 < 0L ? -1 : 1))) >= 0);
            object = new ZipException("End Of Central Directory signature not found");
            throw object;
        }
        StringBuilder stringBuilder = new StringBuilder("File too short to be a zip file: ");
        l4 = ((RandomAccessFile)object).length();
        stringBuilder.append(l4);
        object = stringBuilder.toString();
        ZipException zipException = new ZipException((String)object);
        throw zipException;
    }
}

