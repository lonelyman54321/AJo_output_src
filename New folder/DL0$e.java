/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public final class DL0$e
implements Comparable {
    public final File a;
    public final long b;

    public DL0$e(File file) {
        long l2;
        Intrinsics.checkNotNullParameter(file, "file");
        this.a = file;
        this.b = l2 = file.lastModified();
    }

    public final int a(DL0$e comparable) {
        int n3;
        Object object = "another";
        Intrinsics.checkNotNullParameter(comparable, (String)object);
        long l2 = comparable.b;
        long l3 = this.b;
        Object object2 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (object2 < 0) {
            n3 = -1;
        } else {
            object2 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (object2 > 0) {
                n3 = 1;
            } else {
                object = this.a;
                comparable = comparable.a;
                n3 = ((File)object).compareTo((File)comparable);
            }
        }
        return n3;
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = object instanceof DL0$e;
        if (bl2 && (n3 = this.a((DL0$e)(object = (DL0$e)object))) == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public final int hashCode() {
        int n3 = (this.a.hashCode() + 1073) * 37;
        long l2 = -1 >>> 1;
        int n4 = (int)(this.b % l2);
        return n3 + n4;
    }
}

