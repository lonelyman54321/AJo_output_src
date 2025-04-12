/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileFilter;

public final class KQ1
implements FileFilter {
    public final boolean accept(File file) {
        return file.getName().equals("MultiDex.lock") ^ true;
    }
}

