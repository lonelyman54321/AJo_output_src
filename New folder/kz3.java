/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public final class kz3
implements FilenameFilter {
    public final boolean accept(File file, String string2) {
        return Pattern.matches("cpu[0-9]+", string2);
    }
}

