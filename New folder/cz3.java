/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public final class cz3 {
    public static final Charset a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void a(File object) {
        Object object2 = ((File)object).listFiles();
        if (object2 != null) {
            int n3 = ((File[])object2).length;
            Object var4_4 = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                File file = object2[i3];
                boolean bl2 = file.isDirectory();
                if (bl2) {
                    cz3.a(file);
                }
                if (bl2 = file.delete()) {
                    continue;
                }
                object2 = new StringBuilder("failed to delete file: ");
                ((StringBuilder)object2).append(file);
                object2 = ((StringBuilder)object2).toString();
                object = new IOException((String)object2);
                throw object;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("not a readable directory: ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        object2 = new IOException((String)object);
        throw object2;
    }
}

