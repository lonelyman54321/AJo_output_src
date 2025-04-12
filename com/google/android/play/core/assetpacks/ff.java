/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.ch;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.fe;
import com.google.android.play.core.assetpacks.fj;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

final class ff {
    private static final Pattern a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List a(File serializable, File object) {
        Object object2;
        int n3;
        Object object3;
        Object object4;
        int n4;
        Serializable serializable2 = new ArrayList();
        Object object5 = new fe();
        object = ((File)object).listFiles((FilenameFilter)object5);
        int n7 = 0;
        object5 = null;
        if (object == null) {
            object = new File[]{};
        } else {
            int n8;
            n4 = ((Object)object).length;
            object4 = new File[n4];
            object3 = null;
            for (n3 = 0; n3 < (n8 = ((Object)object).length); ++n3) {
                Object object6 = object[n3];
                String string2 = ((File)object6).getName();
                String string3 = "-";
                int n10 = Integer.parseInt(string2 = string2.split(string3)[0]);
                if (n10 <= n8 && (object2 = object4[n10]) == null) {
                    object4[n10] = object6;
                    continue;
                }
                serializable = new cz("Metadata folder ordering corrupt.");
                throw serializable;
            }
            object = object4;
        }
        while (n7 < (n4 = ((Object)object).length)) {
            block12: {
                Throwable throwable2;
                block13: {
                    block10: {
                        block11: {
                            object4 = object[n7];
                            ((ArrayList)serializable2).add(object4);
                            object3 = ((File)object4).getName();
                            object2 = "LFH";
                            n3 = (int)(((String)object3).contains((CharSequence)object2) ? 1 : 0);
                            if (n3 == 0) break block12;
                            object3 = new FileInputStream((File)object4);
                            try {
                                object4 = new ch((InputStream)object3);
                                object4 = ((ch)object4).b();
                                object2 = ((fj)object4).c();
                                if (object2 == null) break block10;
                                object2 = new File((File)serializable, (String)(object4 = ((fj)object4).c()));
                                n4 = (int)(((File)object2).exists() ? 1 : 0);
                                if (n4 == 0) break block11;
                                ((ArrayList)serializable2).add(object2);
                            }
                            catch (Throwable throwable2) {}
                            ((InputStream)object3).close();
                            break block12;
                        }
                        object = ((File)object2).getCanonicalPath();
                        serializable2 = new StringBuilder();
                        object5 = "Missing asset file ";
                        ((StringBuilder)serializable2).append((String)object5);
                        ((StringBuilder)serializable2).append((String)object);
                        object = " during slice reconstruction.";
                        ((StringBuilder)serializable2).append((String)object);
                        object = ((StringBuilder)serializable2).toString();
                        serializable = new cz((String)object);
                        throw serializable;
                        break block13;
                    }
                    object = "Metadata files corrupt. Could not read local file header.";
                    serializable = new cz((String)object);
                    throw serializable;
                }
                try {
                    ((InputStream)object3).close();
                    throw throwable2;
                }
                catch (Throwable throwable3) {
                    throwable2.addSuppressed(throwable3);
                }
                throw throwable2;
            }
            ++n7;
        }
        return serializable2;
    }

    public static /* synthetic */ boolean b(File file, String string2) {
        return a.matcher(string2).matches();
    }
}

