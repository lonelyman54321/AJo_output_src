/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from ul$a
 */
public final class ul$a_0
extends ul$j {
    public final void a(Collection iterator) {
        boolean bl2;
        Object object;
        Object object2;
        boolean bl3;
        iterator = (Iterable)((Object)iterator);
        Object object3 = new ArrayList();
        iterator = iterator.iterator();
        while (bl3 = iterator.hasNext()) {
            object = object2 = iterator.next();
            object = ((M11)object2).a();
            boolean bl4 = object.isEmpty() ^ true;
            if (!bl4) continue;
            ((ArrayList)object3).add(object2);
        }
        iterator = ((ArrayList)object3).iterator();
        while (bl2 = iterator.hasNext()) {
            object3 = ((Iterable)((M11)iterator.next()).a()).iterator();
            while (bl3 = object3.hasNext()) {
                object2 = ((NP1)object3.next()).a;
                object = new ul$a$a_0(this);
                object2.any((Function1)object);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b(M11 iterator) {
        ul$a$b ul$a$b;
        Object object = ((M11)((Object)iterator)).a();
        boolean bl2 = object.isEmpty();
        boolean bl3 = true;
        if (!(bl2 ^= bl3)) return false;
        bl2 = (iterator = (Iterable)((M11)((Object)iterator)).a()) instanceof Collection;
        if (bl2) {
            object = iterator;
            object = (Collection)((Object)iterator);
            bl2 = object.isEmpty();
            if (bl2) return false;
        }
        iterator = ((Iterable)((Object)iterator)).iterator();
        do {
            if (!(bl2 = iterator.hasNext())) return false;
        } while (!(bl2 = (object = ((NP1)iterator.next()).a).any(ul$a$b = ul$a$b.c)));
        return bl3;
    }
}

