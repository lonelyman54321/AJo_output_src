/*
 * Decompiled with CFR 0.152.
 */
package androidx.profileinstaller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

public final class d$b {
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public d$b(int n3, int n4, long l2, long l3) {
        this.a = n3;
        this.b = n4;
        this.c = l2;
        this.d = l3;
    }

    public static d$b a(File object) {
        FileInputStream fileInputStream = new FileInputStream((File)object);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        try {
            int n3 = dataInputStream.readInt();
            int n4 = dataInputStream.readInt();
            long l2 = dataInputStream.readLong();
            long l3 = dataInputStream.readLong();
            object = new d$b(n3, n4, l2, l3);
            return object;
        }
        finally {
            try {
                ((InputStream)dataInputStream).close();
            }
            catch (Throwable throwable) {
                Throwable throwable2;
                throwable2.addSuppressed(throwable);
            }
        }
    }

    public final void b(File file) {
        file.delete();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        try {
            int n3 = this.a;
            dataOutputStream.writeInt(n3);
            n3 = this.b;
            dataOutputStream.writeInt(n3);
            long l2 = this.c;
            dataOutputStream.writeLong(l2);
            l2 = this.d;
            dataOutputStream.writeLong(l2);
            return;
        }
        finally {
            try {
                ((OutputStream)dataOutputStream).close();
            }
            catch (Throwable throwable) {
                Throwable throwable2;
                throwable2.addSuppressed(throwable);
            }
        }
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (n3 = object instanceof d$b) != 0) {
            long l2;
            long l3;
            long l4;
            long l7;
            long l8;
            long l12;
            object = (d$b)object;
            n3 = this.b;
            int n4 = ((d$b)object).b;
            if (n3 != n4 || (l12 = (l8 = (l7 = this.c) - (l4 = ((d$b)object).c)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false || (n3 = this.a) != (n4 = ((d$b)object).a) || (l3 = (l2 = (l7 = this.d) - (l4 = ((d$b)object).d)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        Integer n3 = this.b;
        Long l2 = this.c;
        Integer n4 = this.a;
        Long l3 = this.d;
        Object[] objectArray = new Object[]{n3, l2, n4, l3};
        return Objects.hash(objectArray);
    }
}

