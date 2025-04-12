/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

/*
 * Renamed from gM0
 */
public final class gm0_2 {
    public static final gm0_2 a;

    static {
        gm0_2 gm0_22;
        a = gm0_22 = new Object();
    }

    public final lg2_1 a(File object) {
        lg2_1 lg2_12;
        String string2 = "<this>";
        String string3 = "file";
        Intrinsics.checkNotNullParameter(object, string3);
        boolean bl2 = true;
        Object object2 = p72_0.a;
        Intrinsics.checkNotNullParameter(object, string2);
        object2 = new FileOutputStream((File)object, bl2);
        Intrinsics.checkNotNullParameter(object2, string2);
        a a2 = new a();
        try {
            lg2_12 = new lg2_1((OutputStream)object2, a2);
        }
        catch (FileNotFoundException fileNotFoundException) {
            ((File)object).getParentFile().mkdirs();
            object2 = p72_0.a;
            Intrinsics.checkNotNullParameter(object, string2);
            object2 = new FileOutputStream((File)object, bl2);
            Intrinsics.checkNotNullParameter(object2, string2);
            object = new a();
            lg2_12 = new lg2_1((OutputStream)object2, (a)object);
        }
        return lg2_12;
    }

    public final void b(File object) {
        Object object2 = "file";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = ((File)object).delete();
        if (!bl2 && (bl2 = ((File)object).exists())) {
            StringBuilder stringBuilder = new StringBuilder("failed to delete ");
            stringBuilder.append(object);
            object = stringBuilder.toString();
            object2 = new IOException((String)object);
            throw object2;
        }
    }

    public final void c(File object) {
        Intrinsics.checkNotNullParameter(object, "directory");
        Object object2 = ((File)object).listFiles();
        if (object2 != null) {
            int n3 = ((File[])object2).length;
            Object var5_5 = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                File file = object2[i3];
                boolean bl2 = file.isDirectory();
                if (bl2) {
                    String string2 = "file";
                    Intrinsics.checkNotNullExpressionValue(file, string2);
                    this.c(file);
                }
                if (bl2 = file.delete()) {
                    continue;
                }
                object2 = new StringBuilder("failed to delete ");
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

    public final boolean d(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.exists();
    }

    public final void e(File object, File file) {
        Intrinsics.checkNotNullParameter(object, "from");
        Object object2 = "to";
        Intrinsics.checkNotNullParameter(file, (String)object2);
        this.b(file);
        boolean bl2 = ((File)object).renameTo(file);
        if (bl2) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("failed to rename ");
        stringBuilder.append(object);
        stringBuilder.append(" to ");
        stringBuilder.append(file);
        object = stringBuilder.toString();
        object2 = new IOException((String)object);
        throw object2;
    }

    public final lg2_1 f(File object) {
        Object object2 = "file";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        try {
            object = o72_0.e((File)object);
        }
        catch (FileNotFoundException fileNotFoundException) {
            object2 = ((File)object).getParentFile();
            ((File)object2).mkdirs();
            object = o72_0.e((File)object);
        }
        return object;
    }

    public final long g(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.length();
    }

    public final bi1_2 h(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return o72_0.g(file);
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}

