/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class iK2 {
    public final Set a;
    public final HashSet b;
    public boolean c;

    public iK2() {
        HashSet hashSet = new HashSet();
        hashSet = Collections.newSetFromMap(hashSet);
        this.a = hashSet;
        this.b = hashSet = new HashSet();
    }

    public final boolean a(LJ2 lJ2) {
        boolean bl2 = true;
        if (lJ2 == null) {
            return bl2;
        }
        Set set = this.a;
        boolean bl3 = set.remove(lJ2);
        HashSet hashSet = this.b;
        boolean bl4 = hashSet.remove(lJ2);
        if (!bl4 && !bl3) {
            bl2 = false;
        }
        if (bl2) {
            lJ2.clear();
        }
        return bl2;
    }

    public final void b() {
        boolean bl2;
        Iterator iterator = dz3.e(this.a).iterator();
        while (bl2 = iterator.hasNext()) {
            LJ2 lJ2 = (LJ2)iterator.next();
            boolean bl3 = lJ2.d();
            if (bl3 || (bl3 = lJ2.c())) continue;
            lJ2.clear();
            bl3 = this.c;
            if (!bl3) {
                lJ2.j();
                continue;
            }
            HashSet hashSet = this.b;
            hashSet.add(lJ2);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = super.toString();
        stringBuilder.append(string2);
        stringBuilder.append("{numRequests=");
        int bl2 = this.a.size();
        stringBuilder.append(bl2);
        stringBuilder.append(", isPaused=");
        boolean bl3 = this.c;
        return Vm.a("}", bl3, stringBuilder);
    }
}

