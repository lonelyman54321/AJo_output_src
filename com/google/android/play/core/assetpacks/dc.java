/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.eh;
import com.google.android.play.core.assetpacks.fd;
import com.google.android.play.core.assetpacks.fj;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

final class dc
extends OutputStream {
    private final eh a;
    private final File b;
    private final fd c;
    private long d;
    private long e;
    private FileOutputStream f;
    private fj g;

    public dc(File file, fd fd2) {
        eh eh2;
        this.a = eh2 = new eh();
        this.b = file;
        this.c = fd2;
    }

    public final void write(int n3) {
        n3 = (byte)n3;
        int n4 = 1;
        byte[] byArray = new byte[n4];
        byArray[0] = n3;
        this.write(byArray, 0, n4);
    }

    public final void write(byte[] byArray) {
        int n3 = byArray.length;
        this.write(byArray, 0, n3);
    }

    public final void write(byte[] byArray, int n3, int n4) {
        while (n4 > 0) {
            long l2;
            long l3;
            Object object;
            int n7;
            int n8;
            Object object2;
            long l4;
            long l7 = this.d;
            long l8 = 0L;
            long l12 = l7 - l8;
            Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object3 == false && (object3 = (l4 = (l7 = this.e) - l8) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                int n10;
                object2 = this.a;
                n8 = ((eh)object2).b(byArray, n3, n4);
                if (n8 == (n7 = -1)) break;
                n3 += n8;
                n4 -= n8;
                this.g = object2 = this.a.c();
                n8 = (int)(((fj)object2).d() ? 1 : 0);
                n7 = 0;
                Object object4 = null;
                if (n8 != 0) {
                    this.d = l8;
                    object2 = this.c;
                    object = this.g.f();
                    byte[] byArray2 = this.g.f();
                    n10 = byArray2.length;
                    ((fd)object2).l((byte[])object, 0, n10);
                    object2 = this.g.f();
                    n8 = ((Object)object2).length;
                    this.e = l7 = (long)n8;
                } else {
                    object2 = this.g;
                    n8 = (int)(((fj)object2).h() ? 1 : 0);
                    if (n8 != 0 && (n8 = (int)(((fj)(object2 = this.g)).g() ? 1 : 0)) == 0) {
                        object2 = this.c;
                        object4 = this.g.f();
                        ((fd)object2).j((byte[])object4);
                        object2 = this.b;
                        object4 = new File;
                        object = this.g.c();
                        ((File)object4)((File)object2, (String)object);
                        ((File)object4).getParentFile().mkdirs();
                        this.d = l3 = this.g.b();
                        this.f = object2 = new FileOutputStream((File)object4);
                    } else {
                        object2 = this.g.f();
                        object = this.c;
                        n10 = ((Object)object2).length;
                        ((fd)object).l((byte[])object2, 0, n10);
                        object2 = this.g;
                        this.d = l7 = ((fj)object2).b();
                    }
                }
            }
            if ((n8 = ((fj)(object2 = this.g)).g()) != 0) continue;
            l7 = n4;
            object = this.g;
            object3 = ((fj)object).d();
            if (object3 != false) {
                object = this.c;
                l2 = this.e;
                ((fd)object).e(l2, byArray, n3, n4);
                this.e = l8 = this.e + l7;
                n7 = n4;
            } else {
                object = this.g;
                object3 = ((fj)object).h();
                if (object3 != false) {
                    l3 = this.d;
                    l7 = Math.min(l7, l3);
                    n7 = (int)l7;
                    object2 = this.f;
                    ((FileOutputStream)object2).write(byArray, n3, n7);
                    l3 = this.d;
                    long l14 = n7;
                    this.d = l3 -= l14;
                    n8 = (int)(l3 == l8 ? 0 : (l3 < l8 ? -1 : 1));
                    if (n8 == 0) {
                        object2 = this.f;
                        ((FileOutputStream)object2).close();
                    }
                } else {
                    l8 = this.d;
                    l7 = Math.min(l7, l8);
                    n7 = (int)l7;
                    n8 = this.g.f().length;
                    l8 = n8;
                    object2 = this.g;
                    l3 = ((fj)object2).b();
                    l8 += l3;
                    l3 = this.d;
                    l2 = l8 - l3;
                    object = this.c;
                    ((fd)object).e(l2, byArray, n3, n7);
                    l8 = this.d;
                    l3 = n7;
                    this.d = l8 -= l3;
                }
            }
            n3 += n7;
            n4 -= n7;
        }
    }
}

