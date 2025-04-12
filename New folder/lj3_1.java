/*
 * Decompiled with CFR 0.152.
 */
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

/*
 * Renamed from lj3
 */
public final class lj3_1 {
    public static /* bridge */ /* synthetic */ FileAttribute a(Set set) {
        return PosixFilePermissions.asFileAttribute(set);
    }
}

