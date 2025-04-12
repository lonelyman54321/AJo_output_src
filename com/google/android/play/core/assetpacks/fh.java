/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.bm;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.dv;
import com.google.android.play.core.assetpacks.ef;
import com.google.android.play.core.assetpacks.ff;
import com.google.android.play.core.assetpacks.fg;
import com.google.android.play.core.assetpacks.internal.o;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

final class fh {
    private static final o a;
    private final bm b;

    static {
        o o3;
        a = o3 = new o("VerifySliceTaskHandler");
    }

    public fh(bm bm3) {
        this.b = bm3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void b(fg object, File object2) {
        IOException iOException2;
        CharSequence charSequence;
        Object object3;
        Object[] objectArray;
        Object object4;
        block6: {
            block7: {
                object4 = ".";
                objectArray = "Cannot find metadata files for slice ";
                try {
                    object3 = this.b;
                    charSequence = ((dv)object).l;
                    int n3 = ((fg)object).a;
                    long l2 = ((fg)object).b;
                    String string2 = ((fg)object).c;
                    object3 = ((bm)object3).o((String)charSequence, n3, l2, string2);
                    boolean bl2 = ((File)object3).exists();
                    if (!bl2) break block6;
                    object2 = ff.a((File)object2, (File)object3);
                }
                catch (IOException iOException2) {}
                try {
                    object2 = ef.a((List)object2);
                    objectArray = ((fg)object).d;
                    boolean bl3 = ((String)object2).equals(objectArray);
                    if (!bl3) break block7;
                    object2 = ((fg)object).c;
                    object4 = a;
                    object = ((dv)object).l;
                }
                catch (IOException iOException3) {
                    object3 = ((fg)object).c;
                    object4 = cP.a("Could not digest file during verification for slice ", (String)object3, (String)object4);
                    int n4 = ((dv)object).k;
                    objectArray = new cz((String)object4, iOException3, n4);
                    throw objectArray;
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    int n7 = ((dv)object).k;
                    object4 = new cz("SHA256 algorithm not supported.", noSuchAlgorithmException, n7);
                    throw object4;
                }
                objectArray = new Object[]{object2, object};
                ((o)object4).d("Verification of slice %s of pack %s successful.", objectArray);
                return;
            }
            objectArray = ((fg)object).c;
            object4 = cP.a("Verification failed for slice ", (String)objectArray, (String)object4);
            int n8 = ((dv)object).k;
            object2 = new cz((String)object4, n8);
            throw object2;
        }
        object3 = ((fg)object).c;
        charSequence = new StringBuilder((String)objectArray);
        ((StringBuilder)charSequence).append((String)object3);
        ((StringBuilder)charSequence).append((String)object4);
        objectArray = ((StringBuilder)charSequence).toString();
        int n10 = ((dv)object).k;
        object2 = new cz((String)objectArray, n10);
        throw object2;
        object3 = ((fg)object).c;
        object4 = cP.a("Could not reconstruct slice archive during verification for slice ", (String)object3, (String)object4);
        int n14 = ((dv)object).k;
        objectArray = new cz((String)object4, iOException2, n14);
        throw objectArray;
    }

    public final void a(fg fg2) {
        Object object = this.b;
        Object object2 = fg2.l;
        int n3 = fg2.a;
        long l2 = fg2.b;
        String string2 = fg2.c;
        boolean bl2 = ((File)(object = ((bm)object).p((String)object2, n3, l2, string2))).exists();
        if (bl2) {
            boolean bl3;
            this.b(fg2, (File)object);
            bm bm3 = this.b;
            String string3 = fg2.l;
            int n4 = fg2.a;
            long l3 = fg2.b;
            String string4 = fg2.c;
            object2 = bm3.q(string3, n4, l3, string4);
            n3 = (int)(((File)object2).exists() ? 1 : 0);
            if (n3 == 0) {
                ((File)object2).mkdirs();
            }
            if (bl3 = ((File)object).renameTo((File)object2)) {
                return;
            }
            object2 = fg2.c;
            object2 = cP.a("Failed to move slice ", (String)object2, " after verification.");
            int n7 = fg2.k;
            object = new cz((String)object2, n7);
            throw object;
        }
        object2 = fg2.c;
        object2 = cP.a("Cannot find unverified files for slice ", (String)object2, ".");
        int n8 = fg2.k;
        object = new cz((String)object2, n8);
        throw object;
    }
}

