/*
 * Decompiled with CFR 0.152.
 */
package androidx.profileinstaller;

import java.io.File;

public final class a {
    public static boolean a(File fileArray) {
        boolean bl2 = fileArray.isDirectory();
        boolean bl3 = true;
        if (bl2) {
            fileArray = fileArray.listFiles();
            bl2 = false;
            if (fileArray == null) {
                return false;
            }
            int n3 = fileArray.length;
            boolean bl4 = true;
            for (int i3 = 0; i3 < n3; ++i3) {
                File file = fileArray[i3];
                boolean bl5 = a.a(file);
                bl4 = bl5 && bl4;
            }
            return bl4;
        }
        fileArray.delete();
        return bl3;
    }
}

