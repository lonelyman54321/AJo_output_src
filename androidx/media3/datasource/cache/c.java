/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.SQLException
 *  android.os.ConditionVariable
 */
package androidx.media3.datasource.cache;

import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.Cache$CacheException;
import androidx.media3.datasource.cache.Cache$a;
import androidx.media3.datasource.cache.SimpleCache$1;
import androidx.media3.datasource.cache.b;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public final class c
implements Cache {
    public static final HashSet j;
    public final File a;
    public final b b;
    public final oJ c;
    public final aj_0 d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public Cache$CacheException i;

    static {
        HashSet hashSet;
        j = hashSet = new HashSet();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public c(File object, ht1_0 object2, nb3_2 object3) {
        aj_0 aj_02;
        oJ oJ2 = new oJ((nb3_2)object3, (File)object);
        aj_02.a = object3;
        object3 = c.class;
        // MONITORENTER : object3
        HashSet hashSet = j;
        File file = ((File)object).getAbsoluteFile();
        boolean bl2 = hashSet.add(file);
        // MONITOREXIT : object3
        if (bl2) {
            this.a = object;
            this.b = object2;
            this.c = oJ2;
            this.d = aj_02;
            this.e = object = new HashMap();
            this.f = object = new Random();
            this.g = true;
            this.h = -1;
            object = new ConditionVariable();
            object2 = new SimpleCache$1(this, (ConditionVariable)object);
            ((Thread)object2).start();
            object.block();
            return;
        }
        object3 = new StringBuilder("Another SimpleCache instance uses the folder: ");
        ((StringBuilder)object3).append(object);
        object = ((StringBuilder)object3).toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void i(c object) {
        IOException iOException3;
        Object object2;
        Object object3;
        block19: {
            boolean bl2;
            Object object4;
            block20: {
                aj_0 aj_02;
                boolean bl3;
                block18: {
                    long l2;
                    long l3;
                    HashMap hashMap;
                    boolean bl4;
                    block17: {
                        object4 = ((c)object).c;
                        object3 = ((c)object).a;
                        boolean bl5 = ((File)object3).exists();
                        if (!bl5) {
                            try {
                                androidx.media3.datasource.cache.c.l((File)object3);
                            }
                            catch (Cache$CacheException cache$CacheException) {
                                ((c)object).i = cache$CacheException;
                                return;
                            }
                        }
                        if ((object2 = ((File)object3).listFiles()) == null) {
                            object2 = "Failed to list cache directory files: ";
                            object4 = new StringBuilder((String)object2);
                            ((StringBuilder)object4).append(object3);
                            object4 = ((StringBuilder)object4).toString();
                            Cx.c((String)object4);
                            object3 = new IOException((String)object4);
                            ((c)object).i = object3;
                            return;
                        }
                        bl3 = ((File[])object2).length;
                        aj_02 = null;
                        bl4 = false;
                        hashMap = null;
                        while (true) {
                            String string2;
                            l3 = -1;
                            if (bl4 >= bl3) break;
                            File file = object2[bl4];
                            String string3 = file.getName();
                            int n3 = string3.endsWith(string2 = ".uid");
                            if (n3 != 0) {
                                n3 = 46;
                                try {
                                    n3 = string3.indexOf(n3);
                                    string3 = string3.substring(0, n3);
                                    n3 = 16;
                                    l2 = Long.parseLong(string3, n3);
                                    break block17;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    String string4 = "Malformed UID file: ";
                                    CharSequence charSequence = new StringBuilder(string4);
                                    charSequence.append(file);
                                    charSequence = charSequence.toString();
                                    Cx.c((String)charSequence);
                                    file.delete();
                                }
                            }
                            bl4 += 1;
                        }
                        l2 = l3;
                    }
                    ((c)object).h = l2;
                    bl4 = (boolean)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                    if (!bl4) {
                        try {
                            ((c)object).h = l2 = androidx.media3.datasource.cache.c.m((File)object3);
                        }
                        catch (IOException iOException2) {
                            String string5 = "Failed to create cache UID: ";
                            object2 = new StringBuilder(string5);
                            ((StringBuilder)object2).append(object3);
                            object3 = ((StringBuilder)object2).toString();
                            Cx.d((String)object3, iOException2);
                            ((c)object).i = object2 = new IOException((String)object3, iOException2);
                            return;
                        }
                    }
                    try {
                        l2 = ((c)object).h;
                        ((oJ)object4).e(l2);
                        bl3 = true;
                        aj_02 = ((c)object).d;
                        if (aj_02 == null) break block18;
                    }
                    catch (IOException iOException3) {
                        break block19;
                    }
                    long l4 = ((c)object).h;
                    aj_02.b(l4);
                    hashMap = aj_02.a();
                    ((c)object).o((File)object3, bl3, (File[])object2, hashMap);
                    object2 = hashMap.keySet();
                    aj_02.c((Set)object2);
                    break block20;
                }
                aj_02 = null;
                ((c)object).o((File)object3, bl3, (File[])object2, null);
            }
            object = ImmutableSet.copyOf(((oJ)object4).a.keySet()).iterator();
            while (bl2 = object.hasNext()) {
                object3 = (String)object.next();
                ((oJ)object4).f((String)object3);
            }
            try {
                ((oJ)object4).g();
                return;
            }
            catch (IOException iOException4) {
                object4 = "Storing index file failed";
                Cx.d((String)object4, iOException4);
                return;
            }
        }
        String string6 = "Failed to initialize cache indices: ";
        object2 = new StringBuilder(string6);
        ((StringBuilder)object2).append(object3);
        object3 = ((StringBuilder)object2).toString();
        Cx.d((String)object3, iOException3);
        ((c)object).i = object2 = new IOException((String)object3, iOException3);
    }

    public static void l(File object) {
        boolean bl2 = ((File)object).mkdirs();
        if (!bl2 && !(bl2 = ((File)object).isDirectory())) {
            Serializable serializable = new StringBuilder("Failed to create cache directory: ");
            serializable.append(object);
            object = serializable.toString();
            Cx.c((String)object);
            serializable = new IOException((String)object);
            throw serializable;
        }
    }

    public static long m(File serializable) {
        long l2;
        Object object = new SecureRandom();
        long l3 = ((Random)object).nextLong();
        long l4 = l3 - (l2 = Long.MIN_VALUE);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        l3 = object2 == false ? 0L : Math.abs(l3);
        int n3 = 16;
        String string2 = Long.toString(l3, n3);
        String string3 = ".uid";
        File file = new File((File)serializable, string2 = Ft2.a(string2, string3));
        boolean bl2 = file.createNewFile();
        if (bl2) {
            return l3;
        }
        object = new StringBuilder("Failed to create UID file: ");
        ((StringBuilder)object).append(file);
        object = ((StringBuilder)object).toString();
        serializable = new IOException((String)object);
        throw serializable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zl0_0 a(String object) {
        synchronized (this) {
            oJ oJ2 = this.c;
            object = oJ2.c((String)object);
            if (object == null) return zl0_0.c;
            return ((nJ)object).e;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(kJ object) {
        synchronized (this) {
            int n3;
            long l2;
            Object object2;
            try {
                object2 = this.c;
                String string2 = ((kJ)object).a;
                object2 = ((oJ)object2).c(string2);
                object2.getClass();
                l2 = ((kJ)object).b;
                n3 = 0;
                object = null;
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                ArrayList arrayList;
                int n4;
                if (n3 >= (n4 = (arrayList = ((nJ)object2).d).size())) {
                    object = new IllegalStateException();
                    throw object;
                }
                Object object3 = arrayList.get(n3);
                object3 = (nJ$a)object3;
                long l3 = ((nJ$a)object3).a;
                long l4 = l3 - l2;
                Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object4 == false) {
                    arrayList.remove(n3);
                    object = this.c;
                    object2 = ((nJ)object2).b;
                    ((oJ)object).f((String)object2);
                    this.notifyAll();
                    return;
                }
                ++n3;
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final c53_0 c(long l2, String object, long l3) {
        synchronized (this) {
            Throwable throwable2;
            int n3;
            c53_0 c53_02;
            block9: {
                try {
                    this.k();
                    c53_02 = this.n(l2, (String)object, l3);
                    n3 = c53_02.d;
                    if (n3 == 0) break block9;
                    return this.r((String)object, c53_02);
                }
                catch (Throwable throwable2) {}
            }
            oJ oJ2 = this.c;
            object = oJ2.d((String)object);
            long l4 = c53_02.c;
            oJ2 = null;
            {
                Object object2;
                int n4;
                throw throwable2;
                for (n3 = 0; n3 < (n4 = ((ArrayList)(object2 = ((nJ)object).d)).size()); ++n3) {
                    Object object3;
                    object2 = ((ArrayList)object2).get(n3);
                    object2 = (nJ$a)object2;
                    long l7 = ((nJ$a)object2).a;
                    long l8 = -1;
                    Object object4 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1);
                    if (object4 <= 0) {
                        long l12 = ((nJ$a)object2).b;
                        long l14 = l12 - l8;
                        object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                        if (object3 == false) return null;
                        long l15 = (l7 += l12) - l2;
                        object3 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                        if (object3 <= 0) continue;
                    } else {
                        object3 = l4 == l8 ? 0 : (l4 < l8 ? -1 : 1);
                        if (object3 == false) return null;
                        l8 = l2 + l4;
                        long l16 = l8 - l7;
                        object3 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                        if (object3 <= 0) {
                            continue;
                        }
                    }
                    return null;
                }
                object = new nJ$a(l2, l4);
                ((ArrayList)object2).add(object);
                return c53_02;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(kJ kJ3) {
        synchronized (this) {
            this.p(kJ3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(File object, long l2) {
        synchronized (this) {
            Throwable throwable2;
            block14: {
                long l3;
                boolean bl2;
                block13: {
                    try {
                        bl2 = ((File)object).exists();
                        if (bl2) break block13;
                    }
                    catch (Throwable throwable2) {
                        break block14;
                    }
                    return;
                }
                long l4 = 0L;
                long l7 = l2 - l4;
                Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object2 == false) {
                    ((File)object).delete();
                    return;
                }
                oJ oJ2 = this.c;
                long l8 = -9223372036854775807L;
                Object object3 = object;
                long l12 = l2;
                Object object4 = c53_0.b((File)object, l2, l8, oJ2);
                object4.getClass();
                Object object5 = this.c;
                object3 = ((kJ)object4).a;
                object5 = ((oJ)object5).c((String)object3);
                object5.getClass();
                l4 = ((kJ)object4).b;
                long l14 = ((kJ)object4).c;
                bl2 = ((nJ)object5).a(l4, l14);
                ct3.f(bl2);
                object5 = ((nJ)object5).e;
                l4 = u60_0.a((W60)object5);
                l14 = -1;
                Object object6 = l4 == l14 ? 0 : (l4 < l14 ? -1 : 1);
                if (object6 != false) {
                    l14 = ((kJ)object4).b;
                    l3 = ((kJ)object4).c;
                    long l15 = (l14 += l3) - l4;
                    object6 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                    if (object6 <= 0) {
                        object6 = 1;
                    } else {
                        object6 = 0;
                        object5 = null;
                    }
                    ct3.f((boolean)object6);
                }
                if ((object5 = this.d) != null) {
                    String string2 = ((File)object).getName();
                    try {
                        object3 = this.d;
                        l12 = ((kJ)object4).c;
                        l3 = ((kJ)object4).f;
                        ((aj_0)object3).d(l12, string2, l3);
                    }
                    catch (IOException iOException) {
                        object4 = new IOException(iOException);
                        throw object4;
                    }
                }
                this.j((c53_0)object4);
                try {
                    object = this.c;
                    ((oJ)object).g();
                    this.notifyAll();
                }
                catch (IOException iOException) {
                    object4 = new IOException(iOException);
                    throw object4;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final c53_0 f(long l2, String string2, long l3) {
        synchronized (this) {
            this.k();
            c53_0 c53_02;
            while ((c53_02 = this.c(l2, string2, l3)) == null) {
                this.wait();
            }
            return c53_02;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(String object, X60 object2) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                try {
                    this.k();
                    oJ oJ2 = this.c;
                    object = oJ2.d((String)object);
                    zl0_0 zl0_02 = ((nJ)object).e;
                    ((nJ)object).e = object2 = zl0_02.a((X60)object2);
                    boolean bl2 = ((zl0_0)object2).equals(zl0_02) ^ true;
                    if (bl2) {
                        object2 = oJ2.e;
                        object2.a((nJ)object);
                    }
                    try {}
                    catch (IOException iOException) {
                        object2 = new IOException(iOException);
                        throw object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                object = this.c;
                ((oJ)object).g();
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
    public final File h(long l2, String object, long l3) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                int n3;
                Object object2;
                block5: {
                    try {
                        this.k();
                        object2 = this.c;
                        object = ((oJ)object2).c((String)object);
                        object.getClass();
                        n3 = ((nJ)object).a(l2, l3);
                        ct3.f(n3 != 0);
                        object2 = this.a;
                        n3 = ((File)object2).exists();
                        if (n3 != 0) break block5;
                        object2 = this.a;
                        androidx.media3.datasource.cache.c.l((File)object2);
                        this.q();
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                object2 = this.b;
                object2.c(this, l3);
                File file = this.a;
                Object object3 = this.f;
                n3 = 10;
                int n4 = ((Random)object3).nextInt(n3);
                object3 = Integer.toString(n4);
                File file2 = new File(file, (String)object3);
                boolean bl2 = file2.exists();
                if (!bl2) {
                    androidx.media3.datasource.cache.c.l(file2);
                }
                long l4 = System.currentTimeMillis();
                int n7 = ((nJ)object).a;
                return c53_0.c(file2, n7, l2, l4);
            }
            throw throwable2;
        }
    }

    public final void j(c53_0 c53_02) {
        Object object = this.c;
        String string2 = c53_02.a;
        ((oJ)object).d((String)string2).c.add(c53_02);
        object = (ArrayList)this.e.get(string2);
        if (object != null) {
            for (int i3 = ((ArrayList)object).size() + -1; i3 >= 0; i3 += -1) {
                Cache$a cache$a = (Cache$a)((ArrayList)object).get(i3);
                cache$a.b(this, c53_02);
            }
        }
        this.b.b(this, c53_02);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k() {
        synchronized (this) {
            Cache$CacheException cache$CacheException = this.i;
            if (cache$CacheException == null) {
                return;
            }
            throw cache$CacheException;
        }
    }

    public final c53_0 n(long l2, String string2, long l3) {
        long l4 = l3;
        Object object = this.c;
        Object object2 = string2;
        Object object3 = ((oJ)object).c(string2);
        if (object3 == null) {
            object = object3;
            long l7 = l2;
            long l8 = l3;
            object3 = new kJ(string2, l2, l3, -9223372036854775807L, null);
            return object3;
        }
        while (true) {
            boolean bl2;
            long l12;
            long l14;
            block9: {
                Object object4;
                c53_0 c53_02;
                long l15;
                block8: {
                    l15 = -9223372036854775807L;
                    object2 = ((nJ)object3).b;
                    l14 = -1;
                    object = c53_02;
                    l12 = l2;
                    object = ((nJ)object3).c;
                    c53_02 = new kJ((String)object2, l2, l14, l15, null);
                    if ((object2 = ((TreeSet)object).floor(c53_02)) == null) break block8;
                    l12 = ((kJ)object2).b;
                    l14 = ((kJ)object2).c;
                    long l16 = (l12 += l14) - l2;
                    object4 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                    if (object4 > 0) break block9;
                }
                if ((object = ((TreeSet)object).ceiling(c53_02)) != null) {
                    long l17 = ((kJ)object).b - l2;
                    l12 = -1;
                    long l18 = l4 - l12;
                    object4 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                    if (object4 != false) {
                        l17 = Math.min(l17, l4);
                    }
                    l14 = l17;
                } else {
                    l14 = l4;
                }
                l15 = -9223372036854775807L;
                object2 = ((nJ)object3).b;
                object = c53_02;
                l12 = l2;
                c53_02 = new kJ((String)object2, l2, l14, l15, null);
                object2 = c53_02;
            }
            if (!(bl2 = ((kJ)object2).d)) break;
            object = ((kJ)object2).e;
            object.getClass();
            l12 = ((File)object).length();
            l14 = ((kJ)object2).c;
            bl2 = l12 == l14 ? 0 : (l12 < l14 ? -1 : 1);
            if (!bl2) break;
            this.q();
        }
        return object2;
    }

    public final void o(File file, boolean bl2, File[] fileArray, HashMap hashMap) {
        int n3;
        if (fileArray != null && (n3 = fileArray.length) != 0) {
            int n4 = fileArray.length;
            n3 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                long l2;
                long l3;
                String string2;
                int n7;
                int n8;
                File file2 = fileArray[i3];
                Object object = file2.getName();
                if (bl2 && (n8 = object.indexOf(46)) == (n7 = -1)) {
                    object = file2.listFiles();
                    this.o(file2, false, (File[])object, hashMap);
                    continue;
                }
                if (bl2 && ((n8 = (int)(object.startsWith(string2 = "cached_content_index.exi") ? 1 : 0)) != 0 || (n8 = (int)(object.endsWith(string2 = ".uid") ? 1 : 0)) != 0)) continue;
                object = hashMap != null ? (ZI)hashMap.remove(object) : null;
                if (object != null) {
                    l3 = object.a;
                    l2 = object.b;
                } else {
                    long l4;
                    long l7 = -1;
                    l2 = l4 = -9223372036854775807L;
                    l3 = l7;
                }
                oJ oJ2 = this.c;
                object = file2;
                object = c53_0.b(file2, l3, l2, oJ2);
                if (object != null) {
                    this.j((c53_0)object);
                    continue;
                }
                file2.delete();
            }
            return;
        }
        if (!bl2) {
            file.delete();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void p(kJ kJ3) {
        Object object;
        boolean bl2;
        Object object2 = kJ3.a;
        Object object3 = this.c;
        if ((object2 = ((oJ)object3).c((String)object2)) != null && (bl2 = ((TreeSet)(object = ((nJ)object2).c)).remove(kJ3))) {
            block9: {
                Object object4;
                object = kJ3.e;
                if (object != null) {
                    ((File)object).delete();
                }
                if ((object4 = this.d) != null) {
                    object.getClass();
                    object = ((File)object).getName();
                    try {
                        Object object5 = ((aj_0)object4).b;
                        object5 = (String)object5;
                        object5.getClass();
                        try {
                            object5 = ((aj_0)object4).a;
                            object5 = (Ai0)object5;
                            object5 = object5.getWritableDatabase();
                            object4 = ((aj_0)object4).b;
                            object4 = (String)object4;
                            String string2 = "name = ?";
                            String[] stringArray = new String[]{object};
                            object5.delete((String)object4, string2, stringArray);
                            break block9;
                        }
                        catch (SQLException sQLException) {
                            object5 = new IOException(sQLException);
                            throw object5;
                        }
                    }
                    catch (IOException iOException) {}
                    object4 = "Failed to remove file index entry for: ";
                    KW.b((String)object4, (String)object);
                }
            }
            object2 = ((nJ)object2).b;
            ((oJ)object3).f((String)object2);
            object2 = this.e;
            object3 = kJ3.a;
            object2 = (ArrayList)((HashMap)object2).get(object3);
            if (object2 != null) {
                for (int i3 = ((ArrayList)object2).size() + -1; i3 >= 0; i3 += -1) {
                    object = (Cache$a)((ArrayList)object2).get(i3);
                    object.d(kJ3);
                }
            }
            object2 = this.b;
            object2.d(kJ3);
        }
    }

    public final void q() {
        Object object;
        int n3;
        ArrayList<kJ> arrayList = new ArrayList<kJ>();
        Iterator iterator = Collections.unmodifiableCollection(this.c.a.values()).iterator();
        while ((n3 = iterator.hasNext()) != 0) {
            boolean bl2;
            object = ((nJ)iterator.next()).c.iterator();
            while (bl2 = object.hasNext()) {
                long l2;
                kJ kJ3 = (kJ)object.next();
                File file = kJ3.e;
                file.getClass();
                long l3 = file.length();
                long l4 = l3 - (l2 = kJ3.c);
                Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object2 == false) continue;
                arrayList.add(kJ3);
            }
        }
        iterator = null;
        for (int i3 = 0; i3 < (n3 = arrayList.size()); ++i3) {
            object = (kJ)arrayList.get(i3);
            this.p((kJ)object);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final c53_0 r(String var1_1, c53_0 var2_2) {
        var3_3 = this;
        var4_4 = var2_2;
        var5_5 = this.g;
        if (!var5_5) {
            return var2_2;
        }
        var6_6 = var2_2.e;
        var6_6.getClass();
        var7_7 = var6_6.getName();
        var8_8 = var2_2.c;
        var10_9 = System.currentTimeMillis();
        var12_10 = this.d;
        if (var12_10 != null) {
            try {
                var12_10.d(var8_8, var7_7, var10_9);
            }
            catch (IOException v0) {
                var12_10 = "Failed to update index with new touch timestamp.";
                Cx.f((String)var12_10);
            }
            var13_11 = false;
            var12_10 = null;
        } else {
            var13_11 = true;
        }
        var14_12 = var3_3.c;
        var15_13 = var1_1;
        var14_12 = var14_12.c(var1_1);
        var14_12.getClass();
        var15_13 = var14_12.c;
        var16_14 = var15_13.remove(var4_4);
        ct3.f(var16_14);
        var6_6.getClass();
        if (!var13_11) ** GOTO lbl56
        var17_15 = var6_6.getParentFile();
        var17_15.getClass();
        var18_16 = var4_4.b;
        var20_17 = var14_12.a;
        var21_18 = var10_9;
        var12_10 = c53_0.c(var17_15, var20_17, var18_16, var10_9);
        var23_19 = var6_6.renameTo((File)var12_10);
        if (var23_19 != 0) {
            var24_20 = var12_10;
        } else {
            var14_12 = new StringBuilder("Failed to rename ");
            var14_12.append(var6_6);
            var7_7 = " to ";
            var14_12.append(var7_7);
            var14_12.append(var12_10);
            var12_10 = var14_12.toString();
            Cx.f((String)var12_10);
lbl56:
            // 2 sources

            var24_20 = var6_6;
        }
        var5_5 = var4_4.d;
        ct3.f(var5_5);
        var25_21 = var4_4.a;
        var18_16 = var4_4.b;
        var21_18 = var4_4.c;
        var17_15 = var6_6;
        var6_6 = new Comparable<File>(var25_21, var18_16, var21_18, var10_9, (File)var24_20);
        var15_13.add(var6_6);
        var12_10 = var3_3.e;
        var14_12 = var4_4.a;
        var12_10 = (ArrayList)var12_10.get(var14_12);
        if (var12_10 != null) {
            for (var23_19 = var12_10.size() + -1; var23_19 >= 0; var23_19 += -1) {
                var15_13 = (Cache$a)var12_10.get(var23_19);
                var15_13.a(var3_3, var4_4, (c53_0)var6_6);
            }
        }
        var3_3.b.a(var3_3, var4_4, (c53_0)var6_6);
        return var6_6;
    }
}

