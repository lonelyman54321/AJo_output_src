/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class FP2$a {
    public final Context a;
    public final Class b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public Executor g;
    public Executor h;
    public yg3$c i;
    public boolean j;
    public final FP2$d k;
    public boolean l;
    public boolean m;
    public final long n;
    public final FP2$e o;
    public final LinkedHashSet p;
    public HashSet q;

    public FP2$a(Context object, Class clazz, String string2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(clazz, "klass");
        this.a = object;
        this.b = clazz;
        this.c = string2;
        this.d = object;
        super();
        this.e = object;
        super();
        this.f = object;
        object = FP2$d.AUTOMATIC;
        this.k = object;
        this.l = true;
        this.n = -1;
        super();
        this.o = object;
        super();
        this.p = object;
    }

    public final void a(XO1 ... xO1Array) {
        Intrinsics.checkNotNullParameter(xO1Array, "migrations");
        HashSet hashSet = this.q;
        if (hashSet == null) {
            this.q = hashSet = new HashSet();
        }
        for (XO1 xO1 : xO1Array) {
            HashSet hashSet2 = this.q;
            Intrinsics.checkNotNull(hashSet2);
            int n3 = xO1.startVersion;
            Integer n4 = n3;
            hashSet2.add(n4);
            hashSet2 = this.q;
            Intrinsics.checkNotNull(hashSet2);
            int n7 = xO1.endVersion;
            Integer object = n7;
            hashSet2.add(object);
        }
        int n8 = xO1Array.length;
        xO1Array = Arrays.copyOf(xO1Array, n8);
        this.o.a(xO1Array);
    }

    public final FP2 b() {
        Object object;
        Object object2;
        FP2$a fP2$a = this;
        Object object3 = this.g;
        if (object3 == null && (object2 = this.h) == null) {
            this.h = object3 = xp_0.c;
            this.g = object3;
        } else if (object3 != null && (object2 = fP2$a.h) == null) {
            fP2$a.h = object3;
        } else if (object3 == null) {
            fP2$a.g = object3 = fP2$a.h;
        }
        object3 = fP2$a.q;
        LinkedHashSet linkedHashSet = fP2$a.p;
        boolean bl2 = true;
        if (object3 != null) {
            int n3;
            Intrinsics.checkNotNull(object3);
            object3 = ((HashSet)object3).iterator();
            while ((n3 = object3.hasNext()) != 0) {
                object2 = (Number)object3.next();
                n3 = ((Number)object2).intValue();
                object = n3;
                boolean bl3 = linkedHashSet.contains(object) ^ bl2;
                if (bl3) continue;
                object3 = hj0_0.a(n3, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ");
                object3 = object3.toString();
                object2 = new IllegalArgumentException((String)object3);
                throw object2;
            }
        }
        if ((object3 = fP2$a.i) == null) {
            object3 = new Object();
        }
        Object object4 = object3;
        long l2 = fP2$a.n;
        long l3 = 0L;
        Object object5 = "Required value was null.";
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            object3 = fP2$a.c;
            if (object3 != null) {
                object2 = object5.toString();
                object3 = new IllegalArgumentException((String)object2);
                throw object3;
            }
            object2 = "Cannot create auto-closing database for an in-memory database.".toString();
            object3 = new IllegalArgumentException((String)object2);
            throw object3;
        }
        ArrayList arrayList = fP2$a.d;
        int c2 = fP2$a.j;
        object2 = fP2$a.k;
        object = fP2$a.a;
        FP2$d fP2$d = ((FP2$d)((Object)object2)).resolve$room_runtime_release((Context)object);
        Executor executor = fP2$a.g;
        if (executor != null) {
            Executor executor2 = fP2$a.h;
            if (executor2 != null) {
                int n4;
                Class<?> clazz;
                Object object6;
                block27: {
                    boolean bl4 = fP2$a.l;
                    boolean bl5 = fP2$a.m;
                    object5 = fP2$a.e;
                    object6 = fP2$a.f;
                    object2 = fP2$a.c;
                    Object object7 = fP2$a.o;
                    Object object8 = object2;
                    object2 = object3;
                    ArrayList arrayList2 = object6;
                    object6 = object8;
                    object8 = object5;
                    object5 = object7;
                    clazz = object3;
                    n4 = 1;
                    object7 = object8;
                    object3 = new yi0_0((Context)object, (String)object6, (yg3$c)object4, (FP2$e)object5, arrayList, c2 != 0, fP2$d, executor, executor2, bl4, bl5, linkedHashSet, (List)object8, arrayList2);
                    object2 = fP2$a.b;
                    Intrinsics.checkNotNullParameter(object2, "klass");
                    object = "_Impl";
                    Intrinsics.checkNotNullParameter(object, "suffix");
                    object6 = ((Class)object2).getPackage();
                    Intrinsics.checkNotNull(object6);
                    object6 = ((Package)object6).getName();
                    object4 = ((Class)object2).getCanonicalName();
                    Intrinsics.checkNotNull(object4);
                    object5 = "fullPackage";
                    Intrinsics.checkNotNullExpressionValue(object6, (String)object5);
                    int n7 = ((String)object6).length();
                    if (n7 != 0) {
                        n7 = ((String)object6).length() + n4;
                        object4 = ((String)object4).substring(n7);
                        object5 = "this as java.lang.String).substring(startIndex)";
                        Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                    }
                    object5 = new StringBuilder();
                    l4 = 95;
                    c2 = 46;
                    object4 = kotlin.text.b.o((String)object4, c2, (char)l4);
                    ((StringBuilder)object5).append((String)object4);
                    ((StringBuilder)object5).append((String)object);
                    object = ((StringBuilder)object5).toString();
                    int n8 = ((String)object6).length();
                    if (n8 != 0) break block27;
                    object6 = object;
                }
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((String)object6);
                ((StringBuilder)object4).append((char)c2);
                ((StringBuilder)object4).append((String)object);
                object6 = ((StringBuilder)object4).toString();
                object4 = ((Class)object2).getClassLoader();
                object3 = Class.forName((String)object6, n4 != 0, (ClassLoader)object4);
                object6 = "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>";
                Intrinsics.checkNotNull(object3, (String)object6);
                object6 = null;
                object3 = ((Class)object3).getDeclaredConstructor(null);
                try {
                    object3 = (FP2)((Constructor)object3).newInstance(null);
                    object2 = clazz;
                    ((FP2)object3).init((yi0_0)((Object)clazz));
                    return object3;
                }
                catch (InstantiationException instantiationException) {
                    object = new StringBuilder("Failed to create an instance of ");
                    object2 = ((Class)object2).getCanonicalName();
                    ((StringBuilder)object).append((String)object2);
                    object2 = ((StringBuilder)object).toString();
                    object3 = new RuntimeException((String)object2);
                    throw object3;
                }
                catch (IllegalAccessException illegalAccessException) {
                    object = new StringBuilder("Cannot access the constructor ");
                    object2 = ((Class)object2).getCanonicalName();
                    ((StringBuilder)object).append((String)object2);
                    object2 = ((StringBuilder)object).toString();
                    object3 = new RuntimeException((String)object2);
                    throw object3;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    object6 = new StringBuilder("Cannot find implementation for ");
                    object2 = ((Class)object2).getCanonicalName();
                    ((StringBuilder)object6).append((String)object2);
                    ((StringBuilder)object6).append(". ");
                    ((StringBuilder)object6).append((String)object);
                    ((StringBuilder)object6).append(" does not exist");
                    object2 = ((StringBuilder)object6).toString();
                    object3 = new RuntimeException((String)object2);
                    throw object3;
                }
            }
            object2 = object5.toString();
            object3 = new IllegalArgumentException((String)object2);
            throw object3;
        }
        object2 = object5.toString();
        object3 = new IllegalArgumentException((String)object2);
        throw object3;
    }

    public final void c() {
        this.l = false;
        this.m = true;
    }
}

