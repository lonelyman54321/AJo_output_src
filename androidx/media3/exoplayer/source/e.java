/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$a;
import androidx.media3.common.MediaItem$a$a;
import androidx.media3.common.MediaItem$b;
import androidx.media3.common.MediaItem$c;
import androidx.media3.common.MediaItem$c$a;
import androidx.media3.common.MediaItem$d;
import androidx.media3.common.MediaItem$d$a;
import androidx.media3.common.MediaItem$e;
import androidx.media3.common.MediaItem$f;
import androidx.media3.common.MediaItem$h;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.datasource.a$a;
import androidx.media3.datasource.c$a;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.drm.c;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.MergingMediaSource;
import androidx.media3.exoplayer.source.e$a;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.j$a;
import androidx.media3.exoplayer.source.m$a;
import androidx.media3.exoplayer.source.o;
import androidx.media3.exoplayer.source.u;
import androidx.media3.exoplayer.upstream.b;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class e
implements j$a {
    public final e$a a;
    public final DataSource$Factory b;
    public vf3$a_0 c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public e(Context object, ll0_0 ll0_02) {
        float f5;
        long l2;
        Object object2 = new c$a();
        a$a a$a = new a$a((Context)object, (c$a)object2);
        this.b = a$a;
        this.c = object;
        this.a = object2 = new e$a(ll0_02, (jn0_0)object);
        object = ((e$a)object2).d;
        if (a$a != object) {
            ((e$a)object2).d = a$a;
            ((e$a)object2).b.clear();
            object = ((e$a)object2).c;
            ((HashMap)object).clear();
        }
        this.d = l2 = -9223372036854775807L;
        this.e = l2;
        this.f = l2;
        this.g = f5 = -3.4028235E38f;
        this.h = f5;
        this.i = true;
    }

    public static j$a g(Class genericDeclaration, DataSource$Factory object) {
        Class<DataSource$Factory> clazz;
        Class[] classArray;
        int n3 = 1;
        try {
            classArray = new Class[n3];
            clazz = DataSource$Factory.class;
        }
        catch (Exception exception) {
            object = new IllegalStateException(exception);
            throw object;
        }
        classArray[0] = clazz;
        genericDeclaration = genericDeclaration.getConstructor(classArray);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        genericDeclaration = ((Constructor)genericDeclaration).newInstance(objectArray);
        return (j$a)((Object)genericDeclaration);
    }

    public final j$a a(jn0_0 jn0_02) {
        boolean bl2;
        jn0_02.getClass();
        this.c = jn0_02;
        Object object = this.a;
        ((e$a)object).f = jn0_02;
        Object object2 = ((e$a)object).a;
        object2.a(jn0_02);
        object = ((e$a)object).c.values().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (j$a)object.next();
            object2.a(jn0_02);
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final j b(MediaItem mediaItem) {
        long l2;
        Object object;
        boolean bl2;
        Object object2;
        long l3;
        long l4;
        Object object3;
        long l7;
        Object object4;
        int n3;
        int n4;
        Object object5;
        Object object6;
        block26: {
            Object object7;
            MediaItem$h mediaItem$h;
            Object object8;
            Object object9;
            Object object10;
            Object object11;
            Object object12;
            Object object13;
            long l8;
            long l12;
            float f5;
            float f6;
            float f7;
            float f8;
            int n7;
            Object object14;
            Object object15;
            boolean bl3;
            e e2;
            block25: {
                e2 = this;
                object6 = mediaItem;
                bl3 = true;
                mediaItem.b.getClass();
                object5 = mediaItem.b.a.getScheme();
                n4 = 0;
                object15 = null;
                if (object5 != null && (n3 = ((String)object5).equals(object4 = "ssai")) != 0) {
                    throw null;
                }
                object5 = ((MediaItem)object6).b.b;
                object4 = "application/x-image-uri";
                n3 = Objects.equals(object5, object4);
                if (n3 != 0) {
                    long cfr_ignored_7 = ((MediaItem)object6).b.h;
                    throw null;
                }
                object5 = ((MediaItem)object6).b;
                object4 = ((MediaItem$e)object5).a;
                object5 = ((MediaItem$e)object5).b;
                n3 = gz3.B((Uri)object4, (String)object5);
                object4 = ((MediaItem)object6).b;
                long l14 = ((MediaItem$e)object4).h;
                l7 = -9223372036854775807L;
                long l15 = l14 - l7;
                object14 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                if (object14 != false && (n7 = (object4 = e2.a.a) instanceof ll0_0) != 0) {
                    object4 = (ll0_0)object4;
                    synchronized (object4) {
                        ((ll0_0)object4).f = bl3;
                    }
                }
                try {
                    object4 = e2.a;
                    object5 = ((e$a)object4).a(n3);
                    object4 = ((MediaItem)object6).c.a();
                    object3 = ((MediaItem)object6).c;
                    l4 = ((MediaItem$d)object3).a;
                    l3 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
                    if (l3 != false) break block25;
                    ((MediaItem$d$a)object4).a = l4 = e2.d;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    IllegalStateException illegalStateException = new IllegalStateException(classNotFoundException);
                    throw illegalStateException;
                }
            }
            if ((object14 = (Object)((f8 = (f7 = ((MediaItem$d)object3).d) - (f6 = -3.4028235E38f)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1))) == false) {
                ((MediaItem$d$a)object4).d = f7 = e2.g;
            }
            if ((object14 = (Object)((f5 = (f7 = ((MediaItem$d)object3).e) - f6) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) == false) {
                ((MediaItem$d$a)object4).e = f7 = e2.h;
            }
            if ((l3 = (l12 = (l4 = ((MediaItem$d)object3).b) - l7) == 0L ? 0 : (l12 < 0L ? -1 : 1)) == false) {
                ((MediaItem$d$a)object4).b = l4 = e2.e;
            }
            if ((n7 = (l8 = (l4 = ((MediaItem$d)object3).c) - l7) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == 0) {
                ((MediaItem$d$a)object4).c = l4 = e2.f;
            }
            if ((object2 = ((MediaItem$d)(object3 = new MediaItem$d((MediaItem$d$a)object4))).equals(object4 = ((MediaItem)object6).c)) == 0) {
                Object object16;
                Object object17;
                ImmutableList immutableList;
                Object object18;
                Object object19;
                MediaItem$h mediaItem$h2;
                String string2;
                long l16;
                Object object20;
                boolean bl4;
                long l17;
                object4 = new MediaItem$c$a();
                object13 = Collections.emptyList();
                object12 = ImmutableList.of();
                object11 = MediaItem$f.a;
                object11 = new Object();
                object10 = ((MediaItem)object6).e;
                ((MediaItem$a$a)object11).a = l17 = ((MediaItem$a)object10).a;
                ((MediaItem$a$a)object11).b = l17 = ((MediaItem$a)object10).b;
                ((MediaItem$a$a)object11).c = bl4 = ((MediaItem$a)object10).c;
                ((MediaItem$a$a)object11).d = bl4 = ((MediaItem$a)object10).d;
                ((MediaItem$a$a)object11).e = bl2 = ((MediaItem$a)object10).e;
                object10 = ((MediaItem)object6).a;
                object9 = ((MediaItem)object6).d;
                ((MediaItem)object6).c.a();
                object8 = ((MediaItem)object6).f;
                object6 = ((MediaItem)object6).b;
                if (object6 != null) {
                    long l18;
                    object4 = ((MediaItem$e)object6).e;
                    String string3 = ((MediaItem$e)object6).b;
                    mediaItem$h = ((MediaItem$e)object6).a;
                    object13 = ((MediaItem$e)object6).d;
                    object12 = ((MediaItem$e)object6).f;
                    object15 = ((MediaItem$e)object6).g;
                    object7 = ((MediaItem$e)object6).c;
                    if (object7 != null) {
                        object = new Object();
                        object20 = object15;
                        object15 = ((MediaItem$c)object7).a;
                        ((MediaItem$c$a)object).a = object15;
                        ((MediaItem$c$a)object).b = object15 = ((MediaItem$c)object7).b;
                        object15 = ((MediaItem$c)object7).c;
                        ((MediaItem$c$a)object).c = object15;
                        n4 = (int)(((MediaItem$c)object7).d ? 1 : 0);
                        ((MediaItem$c$a)object).d = n4;
                        n4 = (int)(((MediaItem$c)object7).e ? 1 : 0);
                        ((MediaItem$c$a)object).e = n4;
                        n4 = (int)(((MediaItem$c)object7).f ? 1 : 0);
                        ((MediaItem$c$a)object).f = n4;
                        object15 = ((MediaItem$c)object7).g;
                        ((MediaItem$c$a)object).g = object15;
                        object15 = ((MediaItem$c)object7).h;
                        ((MediaItem$c$a)object).h = (byte[])object15;
                    } else {
                        object20 = object15;
                        object = new MediaItem$c$a();
                    }
                    object7 = object4;
                    l16 = l18 = ((MediaItem$e)object6).h;
                    string2 = string3;
                    mediaItem$h2 = mediaItem$h;
                    object19 = object4;
                    object18 = object13;
                    immutableList = object12;
                    object17 = object20;
                    object4 = object;
                } else {
                    l16 = l7;
                    object18 = object13;
                    immutableList = object12;
                    mediaItem$h2 = null;
                    string2 = null;
                    object19 = null;
                    object17 = null;
                }
                object6 = ((MediaItem$d)object3).a();
                object = ((MediaItem$c$a)object4).b;
                if (object != null && (object = ((MediaItem$c$a)object4).a) == null) {
                    bl3 = false;
                    object = null;
                } else {
                    bl3 = true;
                }
                ct3.f(bl3);
                if (mediaItem$h2 != null) {
                    object15 = ((MediaItem$c$a)object4).a;
                    Object object21 = object15 != null ? (object15 = new MediaItem$c((MediaItem$c$a)object4)) : null;
                    object16 = object = new MediaItem$e((Uri)mediaItem$h2, string2, (MediaItem$c)object21, (List)object18, (String)object19, immutableList, object17, l16);
                } else {
                    object16 = null;
                }
                if (object10 == null) {
                    object10 = "";
                }
                object20 = object10;
                object15 = new MediaItem$a((MediaItem$a$a)object11);
                object4 = new MediaItem$d((MediaItem$d$a)object6);
                if (object9 == null) {
                    object9 = androidx.media3.common.e.I;
                }
                object6 = object = new MediaItem((String)object20, (MediaItem$b)object15, (MediaItem$e)object16, (MediaItem$d)object4, (androidx.media3.common.e)object9, (MediaItem$f)object8);
            }
            object = object5.b((MediaItem)object6);
            object5 = ((MediaItem)object6).b.f;
            n4 = object5.isEmpty();
            if (n4 != 0) break block26;
            n4 = object5.size() + 1;
            object15 = new j[n4];
            object2 = 0;
            object4 = null;
            object15[0] = object;
            f7 = 0.0f;
            object7 = null;
            for (object14 = (Object)0; object14 < (bl3 = object5.size()); object14 += n7) {
                bl3 = e2.i;
                if (bl3) {
                    object = new d$a();
                    ((d$a)object).n = object4 = ip1_0.l(((MediaItem$h)object5.get((int)object14)).b);
                    ((d$a)object).d = object4 = ((MediaItem$h)object5.get((int)object14)).c;
                    ((d$a)object).e = object2 = ((MediaItem$h)object5.get((int)object14)).d;
                    ((d$a)object).f = object2 = ((MediaItem$h)object5.get((int)object14)).e;
                    ((d$a)object).b = object4 = ((MediaItem$h)object5.get((int)object14)).f;
                    ((d$a)object).a = object4 = ((MediaItem$h)object5.get((int)object14)).g;
                    object4 = new d((d$a)object);
                    object = new nm0_0(e2, (d)object4);
                    object11 = e2.b;
                    object10 = new Yo2(object);
                    object = new a();
                    object8 = new Object();
                    object2 = 1;
                    n7 = object14 + true;
                    object12 = MediaItem.b(((MediaItem$h)object5.get((int)object14)).a.toString());
                    ((MediaItem)object12).b.getClass();
                    object9 = ((a)object).a((MediaItem)object12);
                    int n8 = 0x100000;
                    boolean bl5 = true;
                    object13 = object4;
                    object4 = new o((MediaItem)object12, (DataSource$Factory)object11, (m$a)object10, (c)object9, (b)object8, n8, bl5);
                    object15[n7] = object4;
                    n7 = 1;
                    continue;
                }
                object = e2.b;
                object.getClass();
                object4 = new Object();
                n7 = 1;
                long l19 = object14 + true;
                mediaItem$h = (MediaItem$h)object5.get((int)object14);
                object = (a$a)object;
                object15[l19] = object13 = new u(mediaItem$h, (a$a)object, (b)object4);
            }
            object = new MergingMediaSource((j[])object15);
        }
        object3 = object;
        object = ((MediaItem)object6).e;
        l7 = ((MediaItem$a)object).a;
        long l20 = 0L;
        long l21 = l7 - l20;
        object2 = l21 == 0L ? 0 : (l21 < 0L ? -1 : 1);
        if (object2 != 0 || (object2 = (l2 = (l20 = ((MediaItem$a)object).b) - (l4 = Long.MIN_VALUE)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != 0 || (n3 = (int)(((MediaItem$a)object).d ? 1 : 0)) != 0) {
            l4 = ((MediaItem$a)object).b;
            n4 = (int)(((MediaItem$a)object).e ? 1 : 0);
            object2 = 1;
            l3 = n4 ^ 1;
            boolean bl6 = ((MediaItem$a)object).c;
            bl2 = ((MediaItem$a)object).d;
            object4 = object5;
            object3 = object5 = new ClippingMediaSource((j)object3, l7, l4, (boolean)l3, bl6, bl2);
        }
        ((MediaItem)object6).b.getClass();
        ((MediaItem)object6).b.getClass();
        return object3;
    }

    public final j$a c() {
        ct3.e(null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final j$a d() {
        ct3.e(null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final j$a e() {
        throw null;
    }

    public final j$a f(boolean bl2) {
        boolean bl3;
        this.i = bl2;
        Object object = this.a;
        ((e$a)object).e = bl2;
        Object object2 = ((e$a)object).a;
        object2.b(bl2);
        object = ((e$a)object).c.values().iterator();
        while (bl3 = object.hasNext()) {
            object2 = (j$a)object.next();
            object2.f(bl2);
        }
        return this;
    }
}

