/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlinx.coroutines.c;
import kotlinx.coroutines.d;

public final class Sq0
implements Closeable,
Flushable {
    public static final Regex q;
    public final hn2_2 a;
    public final long b;
    public final hn2_2 c;
    public final hn2_2 d;
    public final hn2_2 e;
    public final LinkedHashMap f;
    public final c80 g;
    public long h;
    public int i;
    public re_2 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final vq0_0 p;

    static {
        Regex regex;
        q = regex = new Regex("[a-z0-9_-]{1,120}");
    }

    public Sq0(long l2, hm0_2 hm0_22, hn2_2 hn2_22, c c2) {
        this.a = hn2_22;
        this.b = l2;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            Object object = hn2_22.d("journal");
            this.c = object;
            object = hn2_22.d("journal.tmp");
            this.d = object;
            object = hn2_22.d("journal.bkp");
            this.e = object;
            int n3 = 1;
            object = new LinkedHashMap(0, 0.75f, n3 != 0);
            this.f = object;
            object = be_1.a();
            this.g = object = kotlinx.coroutines.d.a(CoroutineContext$Element$a.d(c2.M0(n3, null), (CoroutineContext$Element)object));
            this.p = object = new vq0_0(hm0_22);
            return;
        }
        String string2 = "maxSize <= 0".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void C(String string2) {
        Serializable serializable = q;
        boolean bl2 = serializable.c(string2);
        if (bl2) {
            return;
        }
        string2 = oj_0.b('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", string2);
        string2 = string2.toString();
        serializable = new IllegalArgumentException(string2);
        throw serializable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(Sq0 sq0, Sq0$a object, boolean n3) {
        synchronized (sq0) {
            int n4;
            long l2;
            int n7;
            Object object2;
            Object object3;
            int n8;
            int n10;
            int n14;
            boolean bl2;
            Sq0$b sq0$b;
            block18: {
                Object object4;
                Object object5;
                try {
                    block20: {
                        block19: {
                            sq0$b = ((Sq0$a)object).a;
                            Sq0$a sq0$a = sq0$b.g;
                            bl2 = Intrinsics.areEqual(sq0$a, object);
                            if (!bl2) break block19;
                            bl2 = false;
                            sq0$a = null;
                            n14 = 2;
                            if (n3 != 0 && (n10 = sq0$b.f) == 0) {
                                object5 = null;
                                break block20;
                            } else {
                                object = null;
                                for (n8 = 0; n8 < n14; ++n8) {
                                    object5 = sq0.p;
                                    object4 = sq0$b.d;
                                    object4 = ((ArrayList)object4).get(n8);
                                    object4 = (hn2_2)object4;
                                    ((hm0_2)object5).e((hn2_2)object4);
                                }
                                break block18;
                            }
                        }
                        object = "Check failed.";
                        object = object.toString();
                        IllegalStateException illegalStateException = new IllegalStateException((String)object);
                        throw illegalStateException;
                    }
                    for (n10 = 0; n10 < n14; ++n10) {
                        object4 = ((Sq0$a)object).c;
                        object3 = object4[n10];
                        if (object3 == false) continue;
                        object4 = sq0.p;
                        object2 = sq0$b.d;
                        object2 = ((ArrayList)object2).get(n10);
                        object3 = ((hm0_2)object4).f((hn2_2)(object2 = (hn2_2)object2));
                        if (object3 != false) continue;
                        ((Sq0$a)object).a(false);
                        return;
                    }
                    object = null;
                }
                catch (Throwable throwable) {}
                throw throwable;
                for (n8 = 0; n8 < n14; ++n8) {
                    object5 = sq0$b.d;
                    object5 = ((ArrayList)object5).get(n8);
                    object5 = (hn2_2)object5;
                    object4 = sq0$b.c;
                    object4 = ((ArrayList)object4).get(n8);
                    object4 = (hn2_2)object4;
                    object2 = sq0.p;
                    n7 = ((hm0_2)object2).f((hn2_2)object5);
                    if (n7 != 0) {
                        object2 = sq0.p;
                        ((vq0_0)object2).b((hn2_2)object5, (hn2_2)object4);
                    } else {
                        object5 = sq0.p;
                        object2 = sq0$b.c;
                        object2 = ((ArrayList)object2).get(n8);
                        boolean bl3 = ((hm0_2)object5).f((hn2_2)(object2 = (hn2_2)object2));
                        if (!bl3) {
                            String string2 = "file";
                            Intrinsics.checkNotNullParameter(object2, string2);
                            object5 = ((vq0_0)object5).k((hn2_2)object2);
                            m.a((Closeable)object5);
                        }
                    }
                    object5 = sq0$b.b;
                    Object object6 = object5[n8];
                    object5 = sq0.p;
                    object5 = ((hm0_2)object5).h((hn2_2)object4);
                    object5 = ((hl0_1)object5).d;
                    l2 = object5 != null ? (Long)object5 : 0L;
                    long[] lArray = sq0$b.b;
                    lArray[n8] = l2;
                    long l3 = sq0.h - object6 + l2;
                    sq0.h = l3;
                }
            }
            n8 = 0;
            object = null;
            sq0$b.g = null;
            n8 = sq0$b.f ? 1 : 0;
            if (n8 != 0) {
                sq0.z(sq0$b);
                return;
            }
            n8 = sq0.i;
            n14 = 1;
            sq0.i = n8 += n14;
            object = sq0.j;
            Intrinsics.checkNotNull(object);
            n10 = 32;
            object3 = 10;
            if (n3 == 0 && (n3 = (int)(sq0$b.e ? 1 : 0)) == 0) {
                Object object7 = sq0.f;
                object2 = sq0$b.a;
                ((AbstractMap)object7).remove(object2);
                object7 = "REMOVE";
                object.D((String)object7);
                object.writeByte(n10);
                object7 = sq0$b.a;
                object.D((String)object7);
                object.writeByte((int)object3);
            } else {
                sq0$b.e = n14;
                Object object8 = "CLEAN";
                object.D((String)object8);
                object.writeByte(n10);
                object8 = sq0$b.a;
                object.D((String)object8);
                object8 = sq0$b.b;
                n4 = ((Object)object8).length;
                object2 = null;
                for (n7 = 0; n7 < n4; ++n7) {
                    Object object9 = object8[n7];
                    re_2 re_22 = object.writeByte(n10);
                    re_22.Y((long)object9);
                }
                object.writeByte((int)object3);
            }
            object.flush();
            long l4 = sq0.h;
            l2 = sq0.b;
            n4 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
            if (n4 <= 0) {
                n8 = sq0.i;
                n3 = 2000;
                if (n8 >= n3) {
                    bl2 = true;
                }
                if (!bl2) return;
            }
            sq0.k();
            return;
        }
    }

    public final void A() {
        long l2;
        long l3;
        long l4;
        long l7;
        block0: while ((l7 = (l4 = (l3 = this.h) - (l2 = this.b)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
            boolean bl2;
            Iterator iterator = this.f.values().iterator();
            while (bl2 = iterator.hasNext()) {
                Sq0$b sq0$b = (Sq0$b)iterator.next();
                boolean bl3 = sq0$b.f;
                if (bl3) continue;
                this.z(sq0$b);
                continue block0;
            }
            return;
        }
        this.n = false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void G() {
        var1_1 = 1;
        synchronized (this) {
            var2_2 = this.j;
            if (var2_2 != null) {
                var2_2.close();
            }
            var2_2 = this.p;
            var4_8 = this.d;
            var2_2 = var2_2.k(var4_8);
            var2_2 = o72_0.a((y63_0)var2_2);
            var4_8 = null;
            var5_9 = "libcore.io.DiskLruCache";
            {
                catch (Throwable var3_4) {}
            }
            try {
                var2_2.D((String)var5_9);
                var6_10 = 10;
                var2_2.writeByte(var6_10);
                var7_11 = "1";
                var2_2.D((String)var7_11);
                var2_2.writeByte(var6_10);
                var8_12 = var1_1;
                var2_2.Y(var8_12);
                var2_2.writeByte(var6_10);
                var10_13 = 2;
                var8_12 = var10_13;
                var2_2.Y(var8_12);
                var2_2.writeByte(var6_10);
                var2_2.writeByte(var6_10);
                var7_11 = this.f;
                var7_11 = var7_11.values();
                var7_11 = var7_11.iterator();
                ** GOTO lbl51
            }
            catch (Throwable var3_5) {}
            try {
                var2_2.close();
                ** GOTO lbl95
            }
            catch (Throwable var2_3) {
                block17: {
                    yc0_2.a(var3_5, var2_3);
                    break block17;
                    throw var3_4;
lbl51:
                    // 3 sources

                    while (var11_14 = var7_11.hasNext()) {
                        var12_15 /* !! */  = var7_11.next();
                        var12_15 /* !! */  = (Sq0$b)var12_15 /* !! */ ;
                        var13_16 = var12_15 /* !! */ .g;
                        var14_17 = 32;
                        if (var13_16 != null) {
                            var13_16 = "DIRTY";
                            var2_2.D((String)var13_16);
                            var2_2.writeByte(var14_17);
                            var12_15 /* !! */  = var12_15 /* !! */ .a;
                            var2_2.D((String)var12_15 /* !! */ );
                            var2_2.writeByte(var6_10);
                            continue;
                        }
                        var13_16 = "CLEAN";
                        var2_2.D((String)var13_16);
                        var2_2.writeByte(var14_17);
                        var13_16 = var12_15 /* !! */ .a;
                        var2_2.D((String)var13_16);
                        var12_15 /* !! */  = (E)var12_15 /* !! */ .b;
                        var15_18 = ((E)var12_15 /* !! */ ).length;
                        for (var16_19 = 0; var16_19 < var15_18; var16_19 += var1_1) {
                            var17_20 = var12_15 /* !! */ [var16_19];
                            var2_2.writeByte(var14_17);
                            var2_2.Y((long)var17_20);
                        }
                        var2_2.writeByte(var6_10);
                    }
                    var3_6 = Unit.a;
                    try {
                        var2_2.close();
                        var1_1 = 0;
                        var3_6 = null;
                    }
                    catch (Throwable var3_7) {}
                }
                if (var3_6 != null) {
                    throw var3_6;
                }
                var3_6 = this.p;
                var2_2 = this.c;
                var1_1 = var3_6.f((hn2_2)var2_2);
                if (var1_1 != 0) {
                    var3_6 = this.p;
                    var2_2 = this.c;
                    var5_9 = this.e;
                    var3_6.b((hn2_2)var2_2, (hn2_2)var5_9);
                    var3_6 = this.p;
                    var2_2 = this.d;
                    var5_9 = this.c;
                    var3_6.b((hn2_2)var2_2, (hn2_2)var5_9);
                    var3_6 = this.p;
                    var2_2 = this.e;
                    var3_6.e((hn2_2)var2_2);
                } else {
                    var3_6 = this.p;
                    var2_2 = this.d;
                    var5_9 = this.c;
                    var3_6.b((hn2_2)var2_2, (hn2_2)var5_9);
                }
                this.j = var3_6 = this.n();
                this.i = 0;
                this.k = false;
                this.o = false;
                return;
            }
        }
    }

    public final void b() {
        boolean bl2 = this.m ^ true;
        if (bl2) {
            return;
        }
        String string2 = "cache is closed".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Sq0$a c(String object) {
        synchronized (this) {
            Throwable throwable2;
            block14: {
                block11: {
                    Object object2;
                    block13: {
                        LinkedHashMap linkedHashMap;
                        block12: {
                            int n3;
                            Object object3;
                            block10: {
                                block9: {
                                    try {
                                        this.b();
                                        Sq0.C((String)object);
                                        this.h();
                                        object2 = this.f;
                                        object2 = ((LinkedHashMap)object2).get(object);
                                        object2 = (Sq0$b)object2;
                                        linkedHashMap = null;
                                        if (object2 != null) {
                                            object3 = ((Sq0$b)object2).g;
                                        } else {
                                            n3 = 0;
                                            object3 = null;
                                        }
                                        if (object3 == null) break block9;
                                    }
                                    catch (Throwable throwable2) {}
                                    return null;
                                }
                                if (object2 != null) {
                                    n3 = ((Sq0$b)object2).h;
                                    if (n3 == 0) break block10;
                                    return null;
                                }
                            }
                            n3 = this.n ? 1 : 0;
                            if (n3 != 0 || (n3 = (int)(this.o ? 1 : 0)) != 0) break block11;
                            object3 = this.j;
                            Intrinsics.checkNotNull(object3);
                            String string2 = "DIRTY";
                            object3.D(string2);
                            int n4 = 32;
                            object3.writeByte(n4);
                            object3.D((String)object);
                            n4 = 10;
                            object3.writeByte(n4);
                            object3.flush();
                            n3 = this.k ? 1 : 0;
                            if (n3 == 0) break block12;
                            return null;
                        }
                        if (object2 != null) break block13;
                        object2 = new Sq0$b(this, (String)object);
                        linkedHashMap = this.f;
                        linkedHashMap.put(object, object2);
                        break block14;
                    }
                    ((Sq0$b)object2).g = object = new Sq0$a(this, (Sq0$b)object2);
                    return object;
                }
                this.k();
                return null;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                boolean bl2;
                try {
                    boolean bl3 = this.l;
                    bl2 = true;
                    if (bl3 && !(bl3 = this.m)) {
                        Object object = this.f;
                        object = ((LinkedHashMap)object).values();
                        int n3 = 0;
                        Sq0$b[] sq0$bArray = new Sq0$b[]{};
                        object = object.toArray(sq0$bArray);
                        int n4 = ((Sq0$b[])object).length;
                        while (true) {
                            if (n3 >= n4) {
                                this.A();
                                object = this.g;
                                n3 = 0;
                                kotlinx.coroutines.d.b((i90_0)object, null);
                                object = this.j;
                                Intrinsics.checkNotNull(object);
                                object.close();
                                this.j = null;
                                this.m = bl2;
                                return;
                            }
                            Object object2 = object[n3];
                            object2 = ((Sq0$b)object2).g;
                            if (object2 != null) {
                                Sq0$b sq0$b = ((Sq0$a)object2).a;
                                Sq0$a sq0$a = sq0$b.g;
                                boolean bl4 = Intrinsics.areEqual(sq0$a, object2);
                                if (bl4) {
                                    sq0$b.f = bl2;
                                }
                            }
                            ++n3;
                        }
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                this.m = bl2;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Sq0$c d(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block5: {
                    Object object;
                    block6: {
                        try {
                            this.b();
                            Sq0.C(string2);
                            this.h();
                            object = this.f;
                            object = ((LinkedHashMap)object).get(string2);
                            object = (Sq0$b)object;
                            if (object == null || (object = ((Sq0$b)object).a()) == null) break block5;
                            int n3 = this.i;
                            int n4 = 1;
                            this.i = n3 += n4;
                            re_2 re_22 = this.j;
                            Intrinsics.checkNotNull(re_22);
                            String string3 = "READ";
                            re_22.D(string3);
                            int n7 = 32;
                            re_22.writeByte(n7);
                            re_22.D(string2);
                            int n8 = 10;
                            re_22.writeByte(n8);
                            n8 = this.i;
                            n3 = 2000;
                            if (n8 < n3) {
                                n4 = 0;
                            }
                            if (n4 == 0) break block6;
                            this.k();
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    return object;
                }
                return null;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void flush() {
        synchronized (this) {
            boolean bl2 = this.l;
            if (!bl2) {
                return;
            }
            this.b();
            this.A();
            re_2 re_22 = this.j;
            Intrinsics.checkNotNull(re_22);
            re_22.flush();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h() {
        synchronized (this) {
            block11: {
                block10: {
                    var1_1 = this.l;
                    if (!var1_1) break block10;
                    {
                        catch (Throwable var2_3) {
                            break block11;
                        }
                    }
                    return;
                }
                var2_2 = this.p;
                var3_4 = this.d;
                var2_2.e(var3_4);
                var2_2 = this.p;
                var3_4 = this.e;
                var1_1 = var2_2.f(var3_4);
                if (!var1_1) ** GOTO lbl29
                var2_2 = this.p;
                var3_4 = this.c;
                var1_1 = var2_2.f(var3_4);
                if (!var1_1) ** GOTO lbl-1000
                var2_2 = this.p;
                var3_4 = this.e;
                var2_2.e(var3_4);
                ** GOTO lbl29
lbl-1000:
                // 1 sources

                {
                    var2_2 = this.p;
                    var3_4 = this.e;
                    var4_6 = this.c;
                    var2_2.b(var3_4, (hn2_2)var4_6);
lbl29:
                    // 3 sources

                    var2_2 = this.p;
                    var3_4 = this.c;
                    var1_1 = var2_2.f(var3_4);
                    var5_7 = true;
                    if (!var1_1) ** GOTO lbl-1000
                    try {
                        this.u();
                        this.p();
                        this.l = var5_7;
                        return;
                    }
                    catch (IOException v0) {}
                    var1_1 = false;
                    var2_2 = null;
                    try {
                        this.close();
                        var4_6 = this.p;
                        var6_8 = this.a;
                        U3.b((hm0_2)var4_6, var6_8);
                    }
                    finally {
                        this.m = false;
                    }
lbl-1000:
                    // 2 sources

                    {
                        this.G();
                        this.l = var5_7;
                        return;
                    }
                }
            }
            throw var2_3;
        }
    }

    public final void k() {
        Sq0$d sq0$d = new Sq0$d(this, null);
        Ae3.d(this.g, null, null, sq0$d, 3);
    }

    public final he2_2 n() {
        Object object = this.p;
        object.getClass();
        Object object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "file");
        object = ((vq0_0)object).a((hn2_2)object2);
        qq0_0 qq0_02 = new qq0_0(this, 0);
        object2 = new aj0_1((y63_0)object, qq0_02);
        return o72_0.a((y63_0)object2);
    }

    public final void p() {
        boolean bl2;
        Iterator iterator = this.f.values().iterator();
        long l2 = 0L;
        while (bl2 = iterator.hasNext()) {
            int n3;
            Sq0$b sq0$b = (Sq0$b)iterator.next();
            Object object = sq0$b.g;
            int n4 = 2;
            if (object == null) {
                for (n3 = 0; n3 < n4; ++n3) {
                    object = sq0$b.b;
                    Object object2 = object[n3];
                    l2 += object2;
                }
                continue;
            }
            object = null;
            sq0$b.g = null;
            while (n3 < n4) {
                object = (hn2_2)sq0$b.c.get(n3);
                vq0_0 vq0_02 = this.p;
                vq0_02.e((hn2_2)object);
                object = (hn2_2)sq0$b.d.get(n3);
                vq0_02.e((hn2_2)object);
                ++n3;
            }
            iterator.remove();
        }
        this.h = l2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void u() {
        block15: {
            block14: {
                var1_1 = 1;
                var2_2 = ", ";
                var3_4 = "unexpected journal header: [";
                var4_5 = this.p;
                var5_6 = this.c;
                var4_5 = o72_0.b(var4_5.l((hn2_2)var5_6));
                var6_7 = 0x7FFFFFFFFFFFFFFFL;
                var8_8 = var4_5.x(var6_7);
                var9_9 = var4_5.x(var6_7);
                var10_10 = var4_5.x(var6_7);
                var11_11 = var4_5.x(var6_7);
                var12_12 = var4_5.x(var6_7);
                var13_13 = "libcore.io.DiskLruCache";
                var14_14 = Intrinsics.areEqual(var13_13, var8_8);
                if (var14_14 == 0 || (var14_14 = Intrinsics.areEqual(var13_13 = "1", var9_9)) == 0 || (var14_14 = Intrinsics.areEqual(var13_13 = String.valueOf(var1_1), var10_10)) == 0) ** GOTO lbl-1000
                var14_14 = 2;
                var13_13 = String.valueOf(var14_14);
                if ((var14_14 = (int)Intrinsics.areEqual(var13_13, var11_11)) == 0 || (var14_14 = var12_12.length()) > 0) ** GOTO lbl-1000
                var15_15 = 0;
                var2_2 = null;
                while (true) {
                    var3_4 = var4_5.x(var6_7);
                    this.w(var3_4);
                    var15_15 += var1_1;
                }
                {
                    catch (Throwable var16_17) {
                        break block14;
                    }
                    catch (EOFException v0) {}
                    {
                        var16_18 = this.f;
                        var1_1 = var16_18.size();
                    }
                    {
                        this.i = var15_15 -= var1_1;
                        var1_1 = (int)var4_5.g();
                        if (var1_1 == 0) {
                            this.G();
                        } else {
                            this.j = var16_18 = this.n();
                        }
                        var16_18 = Unit.a;
                    }
                    try {
                        var4_5.close();
                        return;
                    }
                    catch (Throwable var16_19) {}
                    break block15;
                }
lbl-1000:
                // 2 sources

                {
                    var5_6 = new StringBuilder(var3_4);
                    var5_6.append(var8_8);
                    var5_6.append(var2_2);
                    var5_6.append(var9_9);
                    var5_6.append(var2_2);
                    var5_6.append(var10_10);
                    var5_6.append(var2_2);
                    var5_6.append(var11_11);
                    var5_6.append(var2_2);
                    var5_6.append(var12_12);
                    var15_16 = ']';
                    var5_6.append(var15_16);
                    var2_2 = var5_6.toString();
                    var16_20 = new IOException(var2_2);
                    throw var16_20;
                }
            }
            try {
                var4_5.close();
            }
            catch (Throwable var2_3) {
                yc0_2.a(var16_17, var2_3);
            }
        }
        if (var16_18 != null) throw var16_18;
    }

    public final void w(String object) {
        String string2;
        block17: {
            Object object2;
            block22: {
                block20: {
                    int n3;
                    int n4;
                    int n7;
                    int n8;
                    int n10;
                    block21: {
                        Object object3;
                        int n14;
                        block18: {
                            Object object4;
                            block19: {
                                boolean bl2;
                                String string3;
                                n10 = 1;
                                int n15 = 32;
                                int n16 = 0;
                                int n17 = 6;
                                n8 = StringsKt.N((CharSequence)object, (char)n15, 0, false, n17);
                                string2 = "unexpected journal line: ";
                                n7 = -1;
                                if (n8 == n7) break block17;
                                n14 = n8 + 1;
                                n4 = 4;
                                n3 = StringsKt.N((CharSequence)object, (char)n15, n14, false, n4);
                                Object object5 = this.f;
                                String string4 = "substring(...)";
                                if (n3 == n7) {
                                    string3 = ((String)object).substring(n14);
                                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                                    if (n8 == n17 && (n17 = (int)(kotlin.text.b.s((String)object, (String)(object3 = "REMOVE"), false) ? 1 : 0)) != 0) {
                                        ((AbstractMap)object5).remove(string3);
                                        return;
                                    }
                                } else {
                                    string3 = ((String)object).substring(n14, n3);
                                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                                }
                                if ((object3 = ((LinkedHashMap)object5).get(string3)) == null) {
                                    object3 = new Sq0$b(this, string3);
                                    object5.put(string3, object3);
                                }
                                object3 = (Sq0$b)object3;
                                n14 = 5;
                                if (n3 == n7 || n8 != n14 || !(bl2 = kotlin.text.b.s((String)object, (String)(object5 = "CLEAN"), false))) break block18;
                                object = ((String)object).substring(n3 += n10);
                                Intrinsics.checkNotNullExpressionValue(object, string4);
                                Object object6 = new char[n10];
                                object6[0] = n15;
                                object = StringsKt.Z((CharSequence)object, object6);
                                ((Sq0$b)object3).e = n10;
                                object4 = null;
                                ((Sq0$b)object3).g = null;
                                n15 = object.size();
                                object6 = ((Sq0$b)object3).i;
                                object6.getClass();
                                n8 = 2;
                                if (n15 != n8) break block19;
                                object4 = object;
                                object4 = (Collection)object;
                                n15 = object4.size();
                                while (n16 < n15) {
                                    try {
                                        object6 = ((Sq0$b)object3).b;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        object4 = new StringBuilder(string2);
                                        ((StringBuilder)object4).append(object);
                                        object = ((StringBuilder)object4).toString();
                                        IOException iOException = new IOException((String)object);
                                        throw iOException;
                                    }
                                    Object object7 = object.get(n16);
                                    object7 = (String)object7;
                                    long l2 = Long.parseLong(object7);
                                    object6[n16] = (char)l2;
                                    n16 += n10;
                                }
                                break block20;
                            }
                            object4 = new StringBuilder(string2);
                            ((StringBuilder)object4).append(object);
                            object = ((StringBuilder)object4).toString();
                            IOException iOException = new IOException((String)object);
                            throw iOException;
                        }
                        if (n3 != n7 || n8 != n14 || (n10 = kotlin.text.b.s((String)object, (String)(object2 = "DIRTY"), false)) == 0) break block21;
                        ((Sq0$b)object3).g = object = new Sq0$a(this, (Sq0$b)object3);
                        break block20;
                    }
                    if (n3 != n7 || n8 != n4 || (n10 = (int)(kotlin.text.b.s((String)object, (String)(object2 = "READ"), false) ? 1 : 0)) == 0) break block22;
                }
                return;
            }
            object = string2.concat((String)object);
            object2 = new IOException((String)object);
            throw object2;
        }
        object = string2.concat((String)object);
        IOException iOException = new IOException((String)object);
        throw iOException;
    }

    public final void z(Sq0$b object) {
        Object object2;
        int n3 = ((Sq0$b)object).h;
        int n4 = 10;
        int n7 = 32;
        String string2 = ((Sq0$b)object).a;
        if (n3 > 0 && (object2 = this.j) != null) {
            String string3 = "DIRTY";
            object2.D(string3);
            object2.writeByte(n7);
            object2.D(string2);
            object2.writeByte(n4);
            object2.flush();
        }
        n3 = ((Sq0$b)object).h;
        int n8 = 1;
        if (n3 <= 0 && (object2 = ((Sq0$b)object).g) == null) {
            int n10;
            int n14;
            object2 = null;
            for (n3 = 0; n3 < (n14 = 2); ++n3) {
                hn2_2 hn2_22 = (hn2_2)((Sq0$b)object).c.get(n3);
                vq0_0 vq0_02 = this.p;
                vq0_02.e(hn2_22);
                long l2 = this.h;
                long[] lArray = ((Sq0$b)object).b;
                long l3 = lArray[n3];
                this.h = l2 -= l3;
                lArray[n3] = l2 = 0L;
            }
            this.i = n10 = this.i + n8;
            object = this.j;
            if (object != null) {
                object2 = "REMOVE";
                object.D((String)object2);
                object.writeByte(n7);
                object.D(string2);
                object.writeByte(n4);
            }
            object = this.f;
            ((AbstractMap)object).remove(string2);
            n10 = this.i;
            n3 = 2000;
            if (n10 >= n3) {
                this.k();
            }
            return;
        }
        ((Sq0$b)object).f = n8;
    }
}

