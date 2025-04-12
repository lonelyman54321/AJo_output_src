/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class Sy2 {
    public final Function0 a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final LinkedHashSet g;
    public final LinkedHashSet h;
    public final Object i;

    public Sy2() {
        ly2_2 ly2_22 = ly2_2.c;
        this(ly2_22);
    }

    public Sy2(Function0 object) {
        this.a = object;
        object = new LinkedHashMap();
        this.b = object;
        object = new LinkedHashMap();
        this.c = object;
        object = new LinkedHashMap();
        this.d = object;
        object = new LinkedHashMap();
        this.e = object;
        object = new LinkedHashMap();
        this.f = object;
        this.g = object;
        super();
        this.h = object;
        this.i = object = new Object();
    }

    public static final /* synthetic */ void a(Sy2 sy2) {
        sy2.b();
    }

    public final void b() {
        pw3 pw32 = pw3$a.a();
        if (pw32 != null) {
            LinkedHashSet linkedHashSet = this.g;
            ((AbstractCollection)linkedHashSet).add(pw32);
            pw32 = pw32;
        }
    }

    public final LinkedHashMap c() {
        return this.d;
    }

    public final LinkedHashMap d() {
        return this.f;
    }

    public final LinkedHashMap e() {
        return this.c;
    }

    public final LinkedHashMap f() {
        return this.e;
    }

    public final LinkedHashMap g() {
        return this.b;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(Function1 function1, Object object) {
        void var2_2;
        Object object2 = this.i;
        synchronized (object2) {
            LinkedHashSet linkedHashSet = this.h;
            boolean bl2 = ((AbstractCollection)linkedHashSet).contains(var2_2);
            if (bl2) {
                return;
            }
            linkedHashSet = this.h;
            ((AbstractCollection)linkedHashSet).add(var2_2);
        }
        function1.invoke(var2_2);
    }
}

