/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteException
 */
package androidx.room;

import android.database.sqlite.SQLiteException;
import androidx.room.InvalidationTracker$refreshRunnable$1;
import androidx.room.c$a;
import androidx.room.c$b;
import androidx.room.c$c;
import androidx.room.c$d;
import androidx.room.e;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class c {
    public static final String[] o = new String[]{"UPDATE", "DELETE", "INSERT"};
    public final FP2 a;
    public final Map b;
    public final Map c;
    public final LinkedHashMap d;
    public final String[] e;
    public final AtomicBoolean f;
    public volatile boolean g;
    public volatile bg3_0 h;
    public final c$b i;
    public final ik1_0 j;
    public final CR2 k;
    public final Object l;
    public final Object m;
    public final InvalidationTracker$refreshRunnable$1 n;

    public c(FP2 object, HashMap object2, HashMap object3, String ... object4) {
        boolean bl2;
        Object object5;
        String string2;
        Intrinsics.checkNotNullParameter(object, "database");
        Intrinsics.checkNotNullParameter(object2, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(object3, "viewTables");
        String string3 = "tableNames";
        Intrinsics.checkNotNullParameter(object4, string3);
        this.a = object;
        this.b = object2;
        this.c = object3;
        int n3 = 0;
        object3 = null;
        super(false);
        this.f = object2;
        int n4 = ((String[])object4).length;
        this.i = object2 = new c$b(n4);
        this.j = object2 = new ik1_0((FP2)object);
        this.k = object = new CR2();
        this.l = object = new Object();
        this.m = object = new Object();
        object = new LinkedHashMap();
        this.d = object;
        int n7 = ((String[])object4).length;
        object2 = new String[n7];
        while (true) {
            string3 = "this as java.lang.String).toLowerCase(locale)";
            string2 = "US";
            if (n3 >= n7) break;
            object5 = object4[n3];
            Locale locale = Locale.US;
            object5 = zn0_1.a(locale, string2, (String)object5, locale, string3);
            Object object6 = n3;
            this.d.put(object5, object6);
            object6 = this.b;
            String string4 = object4[n3];
            object6 = (String)object6.get(string4);
            if (object6 != null) {
                string3 = zn0_1.a(locale, string2, (String)object6, locale, string3);
            } else {
                n4 = 0;
                string3 = null;
            }
            if (string3 != null) {
                object5 = string3;
            }
            object2[n3] = object5;
            ++n3;
        }
        this.e = object2;
        object = this.b.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            object3 = (String)object2.getValue();
            object5 = this.d;
            object4 = Locale.US;
            boolean bl3 = object5.containsKey(object3 = zn0_1.a((Locale)object4, string2, (String)object3, (Locale)object4, string3));
            if (!bl3) continue;
            object2 = (String)object2.getKey();
            object2 = zn0_1.a((Locale)object4, string2, (String)object2, (Locale)object4, string3);
            object4 = this.d;
            object3 = fh1_2.g(object3, (Map)object4);
            object4.put(object2, object3);
        }
        this.n = object = new InvalidationTracker$refreshRunnable$1(this);
    }

    public final void a(c$c object) {
        Intrinsics.checkNotNullParameter(object, "observer");
        Object object2 = ((c$c)object).a;
        object2 = this.e((String[])object2);
        int n3 = ((String[])object2).length;
        Object object3 = new ArrayList(n3);
        n3 = ((String[])object2).length;
        CR2 cR2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = object2[i3];
            Serializable serializable = this.d;
            Object object4 = Locale.US;
            String string3 = "US";
            String string4 = "this as java.lang.String).toLowerCase(locale)";
            if ((serializable = (Integer)serializable.get(object4 = zn0_1.a((Locale)object4, string3, string2, (Locale)object4, string4))) != null) {
                ((ArrayList)object3).add(serializable);
                continue;
            }
            object2 = "There is no table with name ".concat(string2);
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object3 = CollectionsKt.j0(object3);
        c$d c$d = new c$d((c$c)object, (int[])object3, (String[])object2);
        object2 = this.k;
        synchronized (object2) {
            int n4;
            boolean bl2;
            cR2 = this.k;
            object = cR2.c(object, c$d);
            object = (c$d)object;
            if (object == null && (bl2 = ((c$b)(object = this.i)).b((int[])(object2 = (Object)Arrays.copyOf((int[])object3, n4 = ((Object)object3).length)))) && (n4 = (int)(((FP2)(object = this.a)).isOpenInternal() ? 1 : 0)) != 0) {
                object = ((FP2)object).getOpenHelper().getWritableDatabase();
                this.g((xg3_1)object);
            }
            return;
            finally {
            }
        }
    }

    public final e b(String[] object, Callable object2) {
        Object object3 = "tableNames";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object4 = "computeFunction";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        object = this.e((String[])object);
        int n3 = ((String[])object).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = object[i3];
            LinkedHashMap linkedHashMap = this.d;
            Object object5 = Locale.US;
            String string3 = "US";
            String string4 = "this as java.lang.String).toLowerCase(locale)";
            boolean bl2 = linkedHashMap.containsKey(object5 = zn0_1.a((Locale)object5, string3, string2, (Locale)object5, string4));
            if (bl2) {
                continue;
            }
            object = "There is no table with name ".concat(string2);
            object = object.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        ik1_0 ik1_02 = this.j;
        ik1_02.getClass();
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        object4 = ik1_02.a;
        object3 = new e((FP2)object4, ik1_02, (Callable)object2, (String[])object);
        return object3;
    }

    public final boolean c() {
        Object object = this.a;
        boolean bl2 = ((FP2)object).isOpenInternal();
        if (!bl2) {
            return false;
        }
        bl2 = this.g;
        if (!bl2) {
            object = this.a.getOpenHelper();
            object.getWritableDatabase();
        }
        return bl2 = this.g;
    }

    public final void d(c$c object) {
        Intrinsics.checkNotNullParameter(object, "observer");
        Object object2 = this.k;
        synchronized (object2) {
            block7: {
                boolean bl2;
                CR2 cR2 = this.k;
                object = cR2.d(object);
                object = (c$d)object;
                if (object == null) break block7;
                object2 = this.i;
                object = ((c$d)object).b;
                int n3 = ((Object)object).length;
                boolean bl3 = ((c$b)object2).c((int[])(object = (Object)Arrays.copyOf((int[])object, n3)));
                if (bl3 && (bl2 = ((FP2)(object = this.a)).isOpenInternal())) {
                    object = ((FP2)object).getOpenHelper().getWritableDatabase();
                    this.g((xg3_1)object);
                }
            }
            return;
            finally {
            }
        }
    }

    public final String[] e(String[] object) {
        String[] stringArray = new k03_0();
        int n3 = ((String[])object).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            Map map2 = this.c;
            Locale locale = Locale.US;
            String string2 = "US";
            Object object2 = object[i3];
            String string3 = "this as java.lang.String).toLowerCase(locale)";
            String string4 = zn0_1.a(locale, string2, (String)object2, locale, string3);
            boolean bl2 = map2.containsKey(string4);
            if (bl2) {
                object2 = zn0_1.a(locale, string2, (String)object2, locale, string3);
                object2 = map2.get(object2);
                Intrinsics.checkNotNull(object2);
                object2 = (Collection)object2;
                stringArray.addAll((Collection)object2);
                continue;
            }
            stringArray.add(object2);
        }
        object = O03.a((k03_0)stringArray);
        stringArray = new String[]{};
        return ((AbstractCollection)object).toArray(stringArray);
    }

    public final void f(xg3_1 xg3_12, int n3) {
        int n4;
        CharSequence charSequence = new StringBuilder("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        charSequence.append(n3);
        charSequence.append(", 0)");
        charSequence = charSequence.toString();
        xg3_12.o((String)charSequence);
        charSequence = this.e[n3];
        String[] stringArray = o;
        for (int i3 = 0; i3 < (n4 = 3); ++i3) {
            String string2 = stringArray[i3];
            CharSequence charSequence2 = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS ");
            String string3 = c$a.a((String)charSequence, string2);
            charSequence2.append(string3);
            string3 = " AFTER ";
            charSequence2.append(string3);
            charSequence2.append(string2);
            charSequence2.append(" ON `");
            charSequence2.append((String)charSequence);
            charSequence2.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            charSequence2.append(n3);
            charSequence2.append(" AND invalidated = 0; END");
            string2 = charSequence2.toString();
            charSequence2 = "StringBuilder().apply(builderAction).toString()";
            Intrinsics.checkNotNullExpressionValue(string2, (String)charSequence2);
            xg3_12.o(string2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void g(xg3_1 object) {
        String string2;
        int n3;
        int n4;
        Object object2;
        Object object3;
        int n7;
        block27: {
            Throwable throwable2;
            block26: {
                block25: {
                    n7 = 1;
                    object3 = "database";
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    boolean bl2 = object.z0();
                    if (bl2) {
                        return;
                    }
                    object3 = this.a;
                    object3 = ((FP2)object3).getCloseLock$room_runtime_release();
                    object3.lock();
                    try {
                        Object object4 = this.l;
                        // MONITORENTER : object4
                    }
                    catch (Throwable throwable2) {}
                    object2 = this.i;
                    object2 = ((c$b)object2).a();
                    if (object2 != null) break block25;
                    object3.unlock();
                    return;
                }
                String string3 = "database";
                Intrinsics.checkNotNullParameter(object, string3);
                n4 = object.B0();
                if (n4 != 0) {
                    object.B();
                    break block26;
                }
                object.i();
            }
            try {
                n4 = ((Object)object2).length;
                n3 = 0;
                string2 = null;
                break block27;
            }
            catch (Throwable throwable3) {}
            object.F();
            throw throwable3;
            object3.unlock();
            throw throwable2;
        }
        for (int i3 = 0; i3 < n4; i3 += n7) {
            Object object5 = object2[i3];
            int n8 = n3 + 1;
            if (object5 != n7) {
                int n10 = 2;
                if (object5 == n10) {
                    int n14;
                    String[] stringArray = this.e;
                    string2 = stringArray[n3];
                    stringArray = o;
                    for (n10 = 0; n10 < (n14 = 3); n10 += n7) {
                        String string4 = stringArray[n10];
                        String string5 = "DROP TRIGGER IF EXISTS ";
                        CharSequence charSequence = new StringBuilder(string5);
                        string4 = c$a.a(string2, string4);
                        charSequence.append(string4);
                        string4 = charSequence.toString();
                        charSequence = "StringBuilder().apply(builderAction).toString()";
                        Intrinsics.checkNotNullExpressionValue(string4, (String)charSequence);
                        object.o(string4);
                    }
                }
            } else {
                this.f((xg3_1)object, n3);
            }
            n3 = n8;
        }
        object.y();
        try {
            object.F();
            object = Unit.a;
        }
        catch (Throwable throwable) {}
        try {
            object3.unlock();
            return;
        }
        catch (SQLiteException | IllegalStateException throwable) {
            return;
        }
        {
            throw throwable;
        }
    }
}

