/*
 * Decompiled with CFR 0.152.
 */
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;

/*
 * Renamed from mj3
 */
public final class mj3_1 {
    public static /* bridge */ /* synthetic */ Path a(Path path, FileAttribute[] fileAttributeArray) {
        return Files.createTempDirectory(path, null, fileAttributeArray);
    }
}

