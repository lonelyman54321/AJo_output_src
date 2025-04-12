/*
 * Decompiled with CFR 0.152.
 */
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;

/*
 * Renamed from jj3
 */
public final class jj3_1 {
    public static /* bridge */ /* synthetic */ Path a(Path path, String string2, FileAttribute[] fileAttributeArray) {
        return Files.createTempFile(path, string2, null, fileAttributeArray);
    }
}

