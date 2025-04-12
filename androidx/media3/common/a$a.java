/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package androidx.media3.common;

import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$e;
import java.util.Arrays;

public final class a$a {
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final MediaItem[] e;
    public final int[] f;
    public final long[] g;
    public final long h;
    public final boolean i;

    static {
        f4.b(0, 1, 2, 3, 4);
        gz3.D(5);
        gz3.D(6);
        gz3.D(7);
        gz3.D(8);
    }

    public a$a(int n3, int n4, int[] nArray, MediaItem[] mediaItemArray, long[] lArray) {
        long l2;
        int n7 = nArray.length;
        int n8 = mediaItemArray.length;
        n7 = n7 == n8 ? 1 : 0;
        ct3.a(n7 != 0);
        this.a = l2 = 0L;
        this.b = n3;
        this.c = n4;
        this.f = nArray;
        this.e = mediaItemArray;
        this.g = lArray;
        this.h = l2;
        this.i = false;
        n3 = mediaItemArray.length;
        Uri[] uriArray = new Uri[n3];
        this.d = uriArray;
        for (int i3 = 0; i3 < (n4 = (uriArray = this.d).length); ++i3) {
            Object object = mediaItemArray[i3];
            if (object == null) {
                n4 = 0;
                object = null;
            } else {
                object = ((MediaItem)object).b;
                object.getClass();
                object = ((MediaItem$e)object).a;
            }
            uriArray[i3] = object;
        }
    }

    public final int a(int n3) {
        int n4;
        int[] nArray;
        int n7;
        int n8 = 1;
        n3 += n8;
        while (n3 < (n7 = (nArray = this.f).length) && (n7 = (int)(this.i ? 1 : 0)) == 0 && (n4 = nArray[n3]) != 0 && n4 != n8) {
            ++n3;
        }
        return n3;
    }

    public final boolean equals(Object object) {
        Object[] objectArray;
        Object[] objectArray2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (objectArray2 = a$a.class) == (objectArray = object.getClass())) {
            int n3;
            long l2;
            int n4;
            int n7;
            object = (a$a)object;
            long l3 = this.a;
            long l4 = ((a$a)object).a;
            long l7 = l3 - l4;
            Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object2 != false || (n7 = this.b) != (n4 = ((a$a)object).b) || (n7 = this.c) != (n4 = ((a$a)object).c) || (n7 = (int)(Arrays.equals(objectArray = this.e, objectArray2 = ((a$a)object).e) ? 1 : 0)) == 0 || (n7 = (int)(Arrays.equals((int[])(objectArray = (Object[])this.f), (int[])(objectArray2 = (Object[])((a$a)object).f)) ? 1 : 0)) == 0 || (n7 = (int)(Arrays.equals((long[])(objectArray = (Object[])this.g), (long[])(objectArray2 = (Object[])((a$a)object).g)) ? 1 : 0)) == 0 || (object2 = (l2 = (l3 = this.h) - (l4 = ((a$a)object).h)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false || (n7 = (int)(this.i ? 1 : 0)) != (n3 = ((a$a)object).i)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.b * 31;
        int n4 = this.c;
        n3 = (n3 + n4) * 31;
        long l2 = this.a;
        int n7 = 32;
        long l3 = l2 >>> n7;
        int n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        n4 = (Arrays.hashCode(this.e) + n3) * 31;
        n3 = (Arrays.hashCode(this.f) + n4) * 31;
        n4 = (Arrays.hashCode(this.g) + n3) * 31;
        l3 = this.h;
        n3 = (int)(l3 >>> n7 ^ l3);
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.i ? 1 : 0);
        return n4 + n3;
    }
}

