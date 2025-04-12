/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$a;
import androidx.media3.common.MediaItem$a$a;
import androidx.media3.common.MediaItem$b;
import androidx.media3.common.MediaItem$d;
import androidx.media3.common.MediaItem$d$a;
import androidx.media3.common.MediaItem$f;
import androidx.media3.common.e;
import androidx.media3.common.g;
import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import androidx.media3.exoplayer.source.MergingMediaSource$a;
import androidx.media3.exoplayer.source.c;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.l;
import androidx.media3.exoplayer.source.v;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class MergingMediaSource
extends c {
    public static final MediaItem t;
    public final j[] k;
    public final ArrayList l;
    public final g[] m;
    public final ArrayList n;
    public final yl0 o;
    public final ListMultimap p;
    public int q;
    public long[][] r;
    public MergingMediaSource$IllegalMergeException s;

    static {
        MediaItem mediaItem;
        MediaItem$a$a mediaItem$a$a = new MediaItem$a$a();
        ImmutableMap.of();
        ImmutableList.of();
        Collections.emptyList();
        ImmutableList.of();
        MediaItem$d$a mediaItem$d$a = new MediaItem$d$a();
        MediaItem$f mediaItem$f = MediaItem$f.a;
        MediaItem$b mediaItem$b = new MediaItem$a(mediaItem$a$a);
        MediaItem$d mediaItem$d = new MediaItem$d(mediaItem$d$a);
        e e2 = androidx.media3.common.e.I;
        t = mediaItem = new MediaItem("MergingMediaSource", mediaItem$b, null, mediaItem$d, e2, mediaItem$f);
    }

    public MergingMediaSource(j ... object) {
        int n3;
        ArrayList arrayList;
        this.k = object;
        this.o = arrayList;
        List<j> list = Arrays.asList(object);
        this.n = arrayList = new ArrayList(list);
        this.q = -1;
        int n4 = ((j[])object).length;
        this.l = arrayList = new ArrayList(n4);
        arrayList = null;
        list = null;
        for (n4 = 0; n4 < (n3 = ((j[])object).length); ++n4) {
            ArrayList arrayList2 = this.l;
            ArrayList arrayList3 = new ArrayList();
            arrayList2.add(arrayList3);
        }
        object = new g[((j[])object).length];
        this.m = object;
        object = new long[0][];
        this.r = (long[][])object;
        new HashMap();
        this.p = object = MultimapBuilder.hashKeys().arrayListValues().build();
    }

    public final MediaItem c() {
        Object object = this.k;
        int n3 = ((j[])object).length;
        if (n3 > 0) {
            n3 = 0;
            object = object[0].c();
        } else {
            object = t;
        }
        return object;
    }

    public final void f(i i3) {
        Object object;
        int n3;
        i i8 = i3;
        i8 = (l)i3;
        for (int i10 = 0; i10 < (n3 = ((j[])(object = this.k)).length); ++i10) {
            int n4;
            int n7;
            Object object2 = (List)this.l.get(i10);
            for (n7 = 0; n7 < (n4 = object2.size()); ++n7) {
                i i12 = ((MergingMediaSource$a)object2.get((int)n7)).b;
                n4 = (int)(i12.equals(i3) ? 1 : 0);
                if (n4 == 0) continue;
                object2.remove(n7);
                break;
            }
            object = object[i10];
            object2 = ((l)i8).a[i10];
            n7 = object2 instanceof v;
            if (n7 != 0) {
                object2 = ((v)object2).a;
            }
            object.f((i)object2);
        }
    }

    public final void h(MediaItem mediaItem) {
        this.k[0].h(mediaItem);
    }

    public final void l() {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.s;
        if (mergingMediaSource$IllegalMergeException == null) {
            super.l();
            return;
        }
        throw mergingMediaSource$IllegalMergeException;
    }

    public final i n(j$b object, Cj0 object2, long l2) {
        j[] jArray = this.k;
        int n3 = jArray.length;
        i[] iArray = new i[n3];
        g[] gArray = this.m;
        g g3 = gArray[0];
        Object object3 = ((j$b)object).a;
        int n4 = g3.b(object3);
        for (int i3 = 0; i3 < n3; ++i3) {
            object3 = gArray[i3].m(n4);
            object3 = ((j$b)object).a(object3);
            Object object4 = jArray[i3];
            long l3 = this.r[n4][i3];
            long l4 = l2 - l3;
            iArray[i3] = object4 = object4.n((j$b)object3, (Cj0)object2, l4);
            object4 = (List)this.l.get(i3);
            i i8 = iArray[i3];
            MergingMediaSource$a mergingMediaSource$a = new MergingMediaSource$a((j$b)object3, i8);
            object4.add(mergingMediaSource$a);
        }
        object2 = this.r[n4];
        yl0 yl02 = this.o;
        object = new l(yl02, (long[])object2, iArray);
        return object;
    }

    public final boolean p(MediaItem mediaItem) {
        boolean bl2;
        Object object = this.k;
        int n3 = ((j[])object).length;
        boolean bl3 = false;
        if (n3 > 0 && (bl2 = (object = object[0]).p(mediaItem))) {
            bl3 = true;
        }
        return bl3;
    }

    public final void s(Kq3 kq3) {
        Object object;
        int n3;
        this.j = kq3;
        kq3 = gz3.k(null);
        this.i = kq3;
        kq3 = null;
        for (int i3 = 0; i3 < (n3 = ((j[])(object = this.k)).length); ++i3) {
            Integer n4 = i3;
            object = object[i3];
            this.z(n4, (j)object);
        }
    }

    public final void u() {
        super.u();
        Arrays.fill(this.m, null);
        this.q = -1;
        this.s = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        j[] jArray = this.k;
        Collections.addAll(arrayList, jArray);
    }

    public final j$b v(Object object, j$b j$b) {
        block1: {
            int n3;
            object = (Integer)object;
            ArrayList arrayList = this.l;
            int n4 = (Integer)object;
            object = (List)arrayList.get(n4);
            for (int i3 = 0; i3 < (n3 = object.size()); ++i3) {
                j$b j$b2 = ((MergingMediaSource$a)object.get((int)i3)).a;
                n3 = (int)(j$b2.equals(j$b) ? 1 : 0);
                if (n3 == 0) continue;
                object = ((MergingMediaSource$a)((List)arrayList.get((int)0)).get((int)i3)).a;
                break block1;
            }
            n4 = 0;
            object = null;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void y(Object object, j j3, g g3) {
        object = (Integer)object;
        Object object2 = this.s;
        if (object2 != null) {
            return;
        }
        int n3 = this.q;
        int n4 = -1;
        if (n3 == n4) {
            this.q = n3 = g3.i();
        } else {
            n3 = g3.i();
            if (n3 != (n4 = this.q)) {
                this.s = object = new IOException();
                return;
            }
        }
        object2 = this.r;
        n3 = ((Object)object2).length;
        n4 = 0;
        g[] gArray = this.m;
        if (n3 == 0) {
            n3 = this.q;
            int n7 = gArray.length;
            int n8 = 2;
            int[] nArray = new int[n8];
            int n10 = 1;
            nArray[n10] = n7;
            nArray[0] = n3;
            object2 = (long[][])Array.newInstance(Long.TYPE, nArray);
            this.r = (long[][])object2;
        }
        object2 = this.n;
        ((ArrayList)object2).remove(j3);
        int n14 = (Integer)object;
        gArray[n14] = g3;
        n14 = (int)(((ArrayList)object2).isEmpty() ? 1 : 0);
        if (n14 == 0) return;
        object = gArray[0];
        this.t((g)object);
    }
}

