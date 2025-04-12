/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/*
 * Renamed from KO1
 */
public final class ko1_1 {
    public static final CopyOnWriteArraySet d;
    public final String a;
    public final String b;
    public final List c;

    static {
        CopyOnWriteArraySet copyOnWriteArraySet;
        d = copyOnWriteArraySet = new CopyOnWriteArraySet();
    }

    public ko1_1() {
        throw null;
    }

    public ko1_1(String string2, String string3, List list) {
        this.a = string2;
        this.b = string3;
        this.c = list;
    }

    public static final /* synthetic */ CopyOnWriteArraySet a() {
        Class<ko1_1> clazz = ko1_1.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return null;
        }
        try {
            return d;
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return null;
        }
    }

    public final ArrayList b() {
        Collection collection;
        boolean bl2 = td0.b(this);
        if (bl2) {
            return null;
        }
        try {
            collection = this.c;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return null;
        }
        collection = collection;
        ArrayList arrayList = new ArrayList(collection);
        return arrayList;
    }

    public final String c() {
        boolean bl2 = td0.b(this);
        if (bl2) {
            return null;
        }
        try {
            return this.a;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return null;
        }
    }
}

