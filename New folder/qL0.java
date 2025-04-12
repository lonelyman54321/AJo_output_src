/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

public final class qL0 {
    public static final AtomicLong a;

    static {
        AtomicLong atomicLong;
        a = atomicLong = new AtomicLong();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static File a(File serializable, String object) {
        IOException iOException2;
        String string2;
        block5: {
            boolean bl2;
            string2 = "File ";
            Intrinsics.checkNotNullParameter(serializable, "directory");
            Object object2 = "fileName";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            try {
                object2 = new File((File)serializable, (String)object);
                bl2 = ((File)object2).exists();
                if (bl2 && !(bl2 = ((File)object2).delete())) {
                    object = "Failed to delete file ";
                    object = Intrinsics.stringPlus((String)object, object2);
                    serializable = new IOException((String)object);
                    throw serializable;
                }
            }
            catch (IOException iOException2) {
                break block5;
            }
            serializable = ((File)object2).getParentFile();
            if (serializable != null) {
                serializable.mkdirs();
            }
            bl2 = ((File)object2).createNewFile();
            if (bl2) {
                return object2;
            }
            object = new StringBuilder(string2);
            ((StringBuilder)object).append(object2);
            string2 = " already exists";
            ((StringBuilder)object).append(string2);
            object = ((StringBuilder)object).toString();
            serializable = new IOException((String)object);
            throw serializable;
        }
        string2 = "An error occurred while creating a Chucker file";
        object = new IOException(string2, iOException2);
        return null;
    }
}

