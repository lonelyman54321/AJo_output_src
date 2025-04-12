/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.bm;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.ei;
import com.google.android.play.core.assetpacks.internal.o;
import java.io.File;
import java.io.IOException;

final class ej {
    private static final o a;
    private final bm b;

    static {
        o o3;
        a = o3 = new o("MergeSliceTaskHandler");
    }

    public ej(bm bm3) {
        this.b = bm3;
    }

    private static void b(File object, File object2) {
        block8: {
            block9: {
                block7: {
                    boolean bl2;
                    block6: {
                        bl2 = ((File)object).isDirectory();
                        if (!bl2) break block6;
                        ((File)object2).mkdirs();
                        for (File file : ((File)object).listFiles()) {
                            String string2 = file.getName();
                            File file2 = new File((File)object2, string2);
                            ej.b(file, file2);
                        }
                        boolean bl3 = ((File)object).delete();
                        if (!bl3) {
                            object = String.valueOf(object);
                            object = "Unable to delete directory: ".concat((String)object);
                            object2 = new cz((String)object);
                            throw object2;
                        }
                        break block7;
                    }
                    bl2 = ((File)object2).exists();
                    if (bl2) break block8;
                    boolean bl4 = ((File)object).renameTo((File)object2);
                    if (!bl4) break block9;
                }
                return;
            }
            object = String.valueOf(object);
            object = "Unable to move file: ".concat((String)object);
            object2 = new cz((String)object);
            throw object2;
        }
        object2 = object2.toString();
        object2 = "File clashing with existing file from other slice: ".concat((String)object2);
        object = new cz((String)object2);
        throw object;
    }

    public final void a(ei ei2) {
        int n3 = 1;
        Object object = this.b;
        Object object2 = ei2.l;
        int n4 = ei2.a;
        long l2 = ei2.b;
        String string2 = ei2.c;
        boolean bl2 = ((File)(object = ((bm)object).q((String)object2, n4, l2, string2))).exists();
        if (bl2) {
            object2 = this.b;
            String string3 = ei2.l;
            int n7 = ei2.a;
            long l3 = ei2.b;
            n4 = (int)(((File)(object2 = ((bm)object2).j(string3, n7, l3))).exists() ? 1 : 0);
            if (n4 == 0) {
                ((File)object2).mkdirs();
            }
            ej.b((File)object, (File)object2);
            try {
                object = this.b;
            }
            catch (IOException iOException) {
                object2 = a;
                string3 = iOException.getMessage();
                Object object3 = new Object[n3];
                object3[0] = string3;
                ((o)object2).b("Writing merge checkpoint failed with %s.", object3);
                int n8 = ei2.k;
                object3 = new cz("Writing merge checkpoint failed.", iOException, n8);
                throw object3;
            }
            object2 = ei2.l;
            n4 = ei2.a;
            l2 = ei2.b;
            int n10 = ((bm)object).b((String)object2, n4, l2);
            object2 = this.b;
            string3 = ei2.l;
            n7 = ei2.a;
            l3 = ei2.b;
            int n14 = n10 + 1;
            ((bm)object2).A(string3, n7, l3, n14);
            return;
        }
        object = ei2.c;
        object = cP.a("Cannot find verified files for slice ", (String)object, ".");
        int n15 = ei2.k;
        cz cz2 = new cz((String)object, n15);
        throw cz2;
    }
}

