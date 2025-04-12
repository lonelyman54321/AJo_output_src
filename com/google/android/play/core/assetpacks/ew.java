/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.bm;
import com.google.android.play.core.assetpacks.bp;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.dc;
import com.google.android.play.core.assetpacks.dv;
import com.google.android.play.core.assetpacks.ev;
import com.google.android.play.core.assetpacks.fd;
import com.google.android.play.core.assetpacks.internal.am;
import com.google.android.play.core.assetpacks.internal.an;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.z;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

final class ew {
    private static final o a;
    private final bm b;
    private final aq c;

    static {
        o o3;
        a = o3 = new o("PatchSliceTaskHandler");
    }

    public ew(bm bm3, aq aq2) {
        this.b = bm3;
        this.c = aq2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(ev ev2) {
        IOException iOException222222;
        Object object;
        Object object2;
        String string2;
        int n3;
        Object object3;
        block12: {
            Object object4;
            Object object5;
            Object object6;
            int n4;
            Object object7;
            Object object8;
            int n7;
            ew ew2;
            block11: {
                block10: {
                    ew2 = this;
                    object3 = ev2;
                    n3 = 1;
                    n7 = 2;
                    string2 = null;
                    object2 = this.b;
                    object = ev2.l;
                    int n8 = ev2.a;
                    long l2 = ev2.b;
                    object8 = ((bm)object2).h((String)object, n8, l2);
                    object2 = ((bm)object2).i((String)object, n8, l2);
                    object = ev2.f;
                    object7 = new File((File)object2, (String)object);
                    object2 = ev2.h;
                    n4 = ev2.e;
                    if (n4 != n7) break block10;
                    n8 = 8192;
                    object2 = object = new GZIPInputStream((InputStream)object2, n8);
                    {
                        catch (IOException iOException222222) {}
                    }
                }
                try {
                    object = new bp((File)object8, (File)object7);
                    bm bm3 = ew2.b;
                    String string3 = ((dv)object3).l;
                    int n10 = ((ev)object3).c;
                    long l3 = ((ev)object3).d;
                    object6 = ((ev)object3).f;
                    object5 = bm3.p(string3, n10, l3, (String)object6);
                    boolean bl2 = ((File)object5).exists();
                    if (bl2) break block11;
                    ((File)object5).mkdirs();
                }
                catch (Throwable throwable) {
                    object = throwable;
                    break block12;
                }
            }
            object8 = ew2.b;
            object7 = ((dv)object3).l;
            int n14 = ((ev)object3).c;
            long l4 = ((ev)object3).d;
            String string4 = ((ev)object3).f;
            object6 = object4;
            object4 = new fd((bm)object8, (String)object7, n14, l4, string4);
            object6 = new dc((File)object5, (fd)object4);
            long l7 = ((ev)object3).g;
            am.a((an)object, (InputStream)object2, (OutputStream)object6, l7);
            object4.i(0);
            ((InputStream)object2).close();
            object2 = a;
            object = ((ev)object3).f;
            object5 = ((dv)object3).l;
            object4 = new Object[n7];
            object4[0] = object;
            object4[n3] = object5;
            object = "Patching and extraction finished for slice %s of pack %s.";
            ((o)object2).d((String)object, object4);
            object2 = (z)ew2.c.a();
            n4 = ((dv)object3).k;
            object5 = ((dv)object3).l;
            object4 = ((ev)object3).f;
            object2.g(n4, (String)object5, (String)object4, 0);
            try {
                object2 = ((ev)object3).h;
                ((InputStream)object2).close();
                return;
            }
            catch (IOException iOException3) {
                object2 = a;
                object = ((ev)object3).f;
                object3 = ((dv)object3).l;
                Object[] objectArray = new Object[n7];
                objectArray[0] = object;
                objectArray[n3] = object3;
                ((o)object2).e("Could not close file for slice %s of pack %s.", objectArray);
                return;
            }
        }
        try {
            ((InputStream)object2).close();
            throw object;
        }
        catch (Throwable throwable) {
            object2 = throwable;
            ((Throwable)object).addSuppressed(throwable);
            throw object;
        }
        object2 = a;
        object = iOException222222.getMessage();
        Object object9 = new Object[n3];
        object9[0] = object;
        ((o)object2).b("IOException during patching %s.", object9);
        string2 = ((ev)object3).f;
        object2 = ((dv)object3).l;
        string2 = uc0_0.a("Error patching slice ", string2, " of pack ", (String)object2, ".");
        int n15 = ((dv)object3).k;
        object9 = new cz(string2, iOException222222, n15);
        throw object9;
    }
}

