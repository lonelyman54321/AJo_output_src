/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import kotlin.io.AccessDeniedException;
import kotlin.jvm.internal.Intrinsics;

public final class iM0$b$c
extends iM0$a {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ iM0$b e;

    public iM0$b$c(iM0$b iM0$b, File file) {
        Intrinsics.checkNotNullParameter(file, "rootDir");
        this.e = iM0$b;
        super(file);
    }

    public final File a() {
        int n3;
        Object object;
        int n4;
        block10: {
            File file;
            iM0$b iM0$b;
            block11: {
                int n7 = this.b;
                n4 = 0;
                iM0$b = this.e;
                file = this.a;
                if (n7 == 0) {
                    Object object2 = iM0$b.d.c;
                    if (object2 != null && (n7 = (int)(((Boolean)(object2 = (Boolean)object2.invoke(file))).booleanValue() ? 1 : 0)) == 0) {
                        return null;
                    }
                    this.b = true;
                    return file;
                }
                object = this.c;
                if (object != null) {
                    int n8 = this.d;
                    Intrinsics.checkNotNull(object);
                    n7 = ((File[])object).length;
                    if (n8 >= n7) {
                        object = iM0$b.d.d;
                        if (object != null) {
                            object.invoke(file);
                        }
                        return null;
                    }
                }
                if ((object = this.c) != null) break block10;
                object = file.listFiles();
                this.c = object;
                if (object == null && (object = iM0$b.d.e) != null) {
                    int n10 = 2;
                    File file2 = this.a;
                    String string2 = "Cannot list files in a directory";
                    AccessDeniedException accessDeniedException = new AccessDeniedException(file2, null, string2, n10, null);
                    object.invoke(file, accessDeniedException);
                }
                if ((object = this.c) == null) break block11;
                Intrinsics.checkNotNull(object);
                n7 = ((Object)object).length;
                if (n7 != 0) break block10;
            }
            if ((object = iM0$b.d.d) != null) {
                object.invoke(file);
            }
            return null;
        }
        object = this.c;
        Intrinsics.checkNotNull(object);
        n4 = this.d;
        this.d = n3 = n4 + 1;
        return object[n4];
    }
}

