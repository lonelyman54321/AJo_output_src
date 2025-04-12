/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class zL0
implements xL0$d {
    public final Class a() {
        return InputStream.class;
    }

    public final void b(Object object) {
        ((InputStream)object).close();
    }

    public final Object c(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        return fileInputStream;
    }
}

