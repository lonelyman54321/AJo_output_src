/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

/*
 * Renamed from vn1
 */
public class vn1_2
extends hm0_2 {
    public final y63_0 a(hn2_2 object) {
        Intrinsics.checkNotNullParameter(object, "file");
        object = ((hn2_2)object).e();
        Object object2 = p72_0.a;
        object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        FileOutputStream fileOutputStream = new FileOutputStream((File)object, true);
        Intrinsics.checkNotNullParameter(fileOutputStream, (String)object2);
        object2 = new a();
        object = new lg2_1(fileOutputStream, (a)object2);
        return object;
    }

    public void b(hn2_2 object, hn2_2 hn2_22) {
        Intrinsics.checkNotNullParameter(object, "source");
        Intrinsics.checkNotNullParameter(hn2_22, "target");
        Serializable serializable = ((hn2_2)object).e();
        Comparable<File> comparable = hn2_22.e();
        boolean bl2 = serializable.renameTo((File)comparable);
        if (bl2) {
            return;
        }
        comparable = new Comparable<File>("failed to move ");
        ((StringBuilder)comparable).append(object);
        ((StringBuilder)comparable).append(" to ");
        ((StringBuilder)comparable).append(hn2_22);
        object = ((StringBuilder)comparable).toString();
        serializable = new IOException((String)object);
        throw serializable;
    }

    public final void c(hn2_2 object) {
        Intrinsics.checkNotNullParameter(object, "dir");
        Object object2 = ((hn2_2)object).e();
        boolean bl2 = ((File)object2).mkdir();
        if (!bl2) {
            boolean bl3;
            object2 = this.i((hn2_2)object);
            if (object2 != null && (bl2 = ((hl0_1)object2).b) == (bl3 = true)) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("failed to create directory: ");
            stringBuilder.append(object);
            object = stringBuilder.toString();
            object2 = new IOException((String)object);
            throw object2;
        }
    }

    public final void d(hn2_2 object) {
        Object object2 = "path";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = Thread.interrupted();
        if (!bl2) {
            object2 = ((hn2_2)object).e();
            boolean bl3 = ((File)object2).delete();
            if (!bl3 && (bl2 = ((File)object2).exists())) {
                StringBuilder stringBuilder = new StringBuilder("failed to delete ");
                stringBuilder.append(object);
                object = stringBuilder.toString();
                object2 = new IOException((String)object);
                throw object2;
            }
            return;
        }
        object = new InterruptedIOException("interrupted");
        throw object;
    }

    public final List g(hn2_2 object) {
        Intrinsics.checkNotNullParameter(object, "dir");
        Serializable serializable = ((hn2_2)object).e();
        Object object2 = ((File)serializable).list();
        if (object2 == null) {
            boolean bl2 = ((File)serializable).exists();
            if (!bl2) {
                object2 = new StringBuilder("no such file: ");
                ((StringBuilder)object2).append(object);
                object = ((StringBuilder)object2).toString();
                serializable = new FileNotFoundException((String)object);
                throw serializable;
            }
            object2 = new StringBuilder("failed to list ");
            ((StringBuilder)object2).append(object);
            object = ((StringBuilder)object2).toString();
            serializable = new IOException((String)object);
            throw serializable;
        }
        serializable = new ArrayList();
        for (Object object3 : object2) {
            Intrinsics.checkNotNull(object3);
            object3 = ((hn2_2)object).d((String)object3);
            ((ArrayList)serializable).add(object3);
        }
        bx_2.p((List)((Object)serializable));
        Intrinsics.checkNotNull(serializable);
        return serializable;
    }

    public hl0_1 i(hn2_2 object) {
        boolean bl2;
        long l2;
        long l3;
        long l4;
        Object object2 = "path";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((hn2_2)object).e();
        boolean bl3 = ((File)object).isFile();
        boolean bl4 = ((File)object).isDirectory();
        long l7 = ((File)object).lastModified();
        long l8 = ((File)object).length();
        if (!(bl3 || bl4 || (l4 = (l3 = l7 - (l2 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false || (l4 = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1)) != false || (bl2 = ((File)object).exists()))) {
            return null;
        }
        Long l12 = l8;
        Long l14 = l7;
        object2 = object;
        object = new hl0_1(bl3, bl4, null, l12, null, l14, null);
        return object;
    }

    public final ul0_1 j(hn2_2 comparable) {
        Intrinsics.checkNotNullParameter(comparable, "file");
        comparable = comparable.e();
        RandomAccessFile randomAccessFile = new RandomAccessFile((File)comparable, "r");
        sn1_2 sn1_22 = new sn1_2(randomAccessFile);
        return sn1_22;
    }

    public final y63_0 k(hn2_2 hn2_22) {
        Intrinsics.checkNotNullParameter(hn2_22, "file");
        return o72_0.e(hn2_22.e());
    }

    public final a93_0 l(hn2_2 hn2_22) {
        Intrinsics.checkNotNullParameter(hn2_22, "file");
        return o72_0.g(hn2_22.e());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}

