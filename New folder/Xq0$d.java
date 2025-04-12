/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public final class Xq0$d {
    public final String a;
    public final long[] b;
    public final File[] c;
    public final File[] d;
    public boolean e;
    public Xq0$c f;
    public final /* synthetic */ Xq0 g;

    public Xq0$d(Xq0 xq0, String string2) {
        int n3;
        this.g = xq0;
        this.a = string2;
        int n4 = xq0.g;
        Object[] objectArray = new long[n4];
        this.b = objectArray;
        objectArray = new File[n4];
        this.c = (File[])objectArray;
        File[] fileArray = new File[n4];
        this.d = fileArray;
        super(string2);
        fileArray.append('.');
        int n7 = fileArray.length();
        objectArray = null;
        for (int i3 = 0; i3 < (n3 = xq0.g); ++i3) {
            File file;
            fileArray.append(i3);
            File[] fileArray2 = this.c;
            String string3 = fileArray.toString();
            File file2 = xq0.a;
            fileArray2[i3] = file = new File(file2, string3);
            fileArray.append(".tmp");
            fileArray2 = this.d;
            string3 = fileArray.toString();
            fileArray2[i3] = file = new File(file2, string3);
            fileArray.setLength(n7);
        }
    }

    public final String a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (long l2 : this.b) {
            char c2 = ' ';
            stringBuilder.append(c2);
            stringBuilder.append(l2);
        }
        return stringBuilder.toString();
    }
}

