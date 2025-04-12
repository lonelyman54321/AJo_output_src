/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class ar0 {
    public final File a;
    public final int b;
    public final yc1_2 c;
    public final Function1 d;

    public ar0(File file, int n3, yc1_2 yc1_22) {
        Intrinsics.checkNotNullParameter(file, "directory");
        lx3 lx32 = lx3.c;
        Intrinsics.checkNotNullParameter(lx32, "hashFunction");
        this.a = file;
        this.b = n3;
        this.c = yc1_22;
        this.d = lx32;
    }

    public final File a(String object, byte[] object2) {
        Intrinsics.checkNotNullParameter(object, "key");
        Object object3 = "value";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        int n3 = zy_0.b(object2);
        int n4 = this.b;
        if (n3 <= n4) {
            object3 = this.b((String)object);
            n4 = (int)(((File)object3).exists() ? 1 : 0);
            if (n4 != 0) {
                ((File)object3).delete();
            }
            object3 = this.b((String)object);
            yc1_2 yc1_22 = this.c;
            if (yc1_22 != null) {
                CharSequence charSequence = new StringBuilder("mapped file path - ");
                Object object4 = ((File)object3).getAbsoluteFile();
                charSequence.append(object4);
                object4 = " to key - ";
                charSequence.append((String)object4);
                charSequence.append((String)object);
                object = charSequence.toString();
                charSequence = "FileDownload";
                yc1_22.b((String)charSequence, (String)object);
            }
            object = new FileOutputStream((File)object3);
            ((FileOutputStream)object).write((byte[])object2);
            ((FileOutputStream)object).close();
            return object3;
        }
        this.d((String)object);
        object2 = hj0_0.a(n4, "File size exceeds the maximum limit of ");
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final File b(String string2) {
        Comparable<StringBuilder> comparable = new StringBuilder();
        File file = this.a;
        comparable.append(file);
        comparable.append("/CT_FILE_");
        string2 = (String)this.d.invoke(string2);
        comparable.append(string2);
        string2 = comparable.toString();
        comparable = new File(string2);
        return comparable;
    }

    public final File c(String object) {
        String string2 = "key";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.b((String)object);
        boolean bl2 = ((File)object).exists();
        if (!bl2) {
            object = null;
        }
        return object;
    }

    public final boolean d(String object) {
        boolean bl2;
        String string2 = "key";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.b((String)object);
        boolean bl3 = ((File)object).exists();
        if (bl3) {
            ((File)object).delete();
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

