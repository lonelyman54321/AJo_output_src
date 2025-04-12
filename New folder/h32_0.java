/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from H32
 */
public final class h32_0
extends vn1_2 {
    public static Long m(FileTime comparable) {
        long l2 = us0.a(comparable);
        comparable = l2;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            comparable = null;
        }
        return comparable;
    }

    public final void b(hn2_2 object, hn2_2 object2) {
        Intrinsics.checkNotNullParameter(object, "source");
        CopyOption[] copyOptionArray = "target";
        Intrinsics.checkNotNullParameter(object2, (String)copyOptionArray);
        object = ((hn2_2)object).f();
        object2 = ((hn2_2)object2).f();
        int n3 = 2;
        copyOptionArray = new CopyOption[n3];
        StandardCopyOption standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
        int n4 = 0;
        copyOptionArray[0] = standardCopyOption;
        standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
        n4 = 1;
        copyOptionArray[n4] = standardCopyOption;
        try {
            Files.move((Path)object, (Path)object2, copyOptionArray);
            return;
        }
        catch (NoSuchFileException noSuchFileException) {
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            object = new IOException("atomic move not supported");
            throw object;
        }
        String string2 = noSuchFileException.getMessage();
        object2 = new FileNotFoundException(string2);
        throw object2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final hl0_1 i(hn2_2 comparable) {
        void var2_4;
        hl0_1 hl0_12;
        Comparable comparable2;
        void var2_6;
        Intrinsics.checkNotNullParameter(comparable, "path");
        comparable = ((hn2_2)comparable).f();
        Intrinsics.checkNotNullParameter(comparable, "nioPath");
        Object var2_2 = null;
        Object object = BasicFileAttributes.class;
        int n3 = 1;
        LinkOption[] linkOptionArray = new LinkOption[n3];
        Object object2 = LinkOption.NOFOLLOW_LINKS;
        linkOptionArray[0] = object2;
        try {
            object = Files.readAttributes((Path)comparable, object, linkOptionArray);
        }
        catch (FileSystemException | NoSuchFileException fileSystemException) {
            return var2_6;
        }
        n3 = (int)(object.isSymbolicLink() ? 1 : 0);
        comparable = n3 != 0 ? Files.readSymbolicLink((Path)comparable) : null;
        boolean bl2 = object.isRegularFile();
        boolean bl3 = object.isDirectory();
        if (comparable != null) {
            object2 = hn2_2.b;
            object2 = "<this>";
            Intrinsics.checkNotNullParameter(comparable, (String)object2);
            comparable2 = comparable = hn2$a.a(comparable.toString(), false);
        } else {
            comparable2 = null;
        }
        long l2 = object.size();
        Long l3 = l2;
        comparable = object.creationTime();
        Comparable comparable3 = comparable != null ? (comparable = h32_0.m((FileTime)comparable)) : null;
        comparable = object.lastModifiedTime();
        Comparable comparable4 = comparable != null ? (comparable = h32_0.m((FileTime)comparable)) : null;
        comparable = object.lastAccessTime();
        if (comparable != null) {
            Long l4 = h32_0.m((FileTime)comparable);
        }
        hl0_1 hl0_13 = hl0_12 = new hl0_1(bl2, bl3, (hn2_2)comparable2, l3, (Long)comparable3, (Long)comparable4, (Long)var2_4);
        return var2_6;
    }

    public final String toString() {
        return "NioSystemFileSystem";
    }
}

