/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import kotlin.io.AccessDeniedException;
import kotlin.jvm.internal.Intrinsics;

public final class iM0$b$a
extends iM0$a {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ iM0$b f;

    public iM0$b$a(iM0$b iM0$b, File file) {
        Intrinsics.checkNotNullParameter(file, "rootDir");
        this.f = iM0$b;
        super(file);
    }

    public final File a() {
        Object object;
        int n3 = this.e;
        int n4 = 0;
        int n7 = 1;
        iM0$b iM0$b = this.f;
        File file = this.a;
        if (n3 == 0 && (object = this.c) == null) {
            object = iM0$b.d.c;
            if (object != null && (n3 = (int)(((Boolean)(object = (Boolean)object.invoke(file))).booleanValue() ? 1 : 0)) == 0) {
                return null;
            }
            object = file.listFiles();
            this.c = object;
            if (object == null) {
                object = iM0$b.d.e;
                if (object != null) {
                    int n8 = 2;
                    File file2 = this.a;
                    String string2 = "Cannot list files in a directory";
                    AccessDeniedException accessDeniedException = new AccessDeniedException(file2, null, string2, n8, null);
                    object.invoke(file, accessDeniedException);
                }
                this.e = n7;
            }
        }
        if ((object = this.c) != null) {
            int n10 = this.d;
            Intrinsics.checkNotNull(object);
            n3 = ((File[])object).length;
            if (n10 < n3) {
                object = this.c;
                Intrinsics.checkNotNull(object);
                n4 = this.d;
                this.d = n7 = n4 + 1;
                return object[n4];
            }
        }
        if ((n3 = this.b) == 0) {
            this.b = n7;
            return file;
        }
        object = iM0$b.d.d;
        if (object != null) {
            object.invoke(file);
        }
        return null;
    }
}

