/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public final class CH$r {
    public ArrayList a = null;

    public final void a(CH$p cH$p) {
        Object object;
        int n3;
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            this.a = arrayList = new ArrayList();
        }
        arrayList = null;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.a)).size()); ++i3) {
            object = ((CH$p)this.a.get((int)i3)).a;
            n3 = ((CH$s)object).b;
            CH$s cH$s = cH$p.a;
            int n4 = cH$s.b;
            if (n3 <= n4) continue;
            this.a.add(i3, cH$p);
            return;
        }
        this.a.add(cH$p);
    }

    public final void b(CH$r object) {
        boolean bl2;
        ArrayList arrayList = ((CH$r)object).a;
        if (arrayList == null) {
            return;
        }
        arrayList = this.a;
        if (arrayList == null) {
            ArrayList arrayList2 = ((CH$r)object).a;
            int n3 = arrayList2.size();
            arrayList = new ArrayList(n3);
            this.a = arrayList;
        }
        object = ((CH$r)object).a.iterator();
        while (bl2 = object.hasNext()) {
            arrayList = (CH$p)object.next();
            this.a((CH$p)((Object)arrayList));
        }
    }

    public final String toString() {
        char c2;
        Serializable serializable = this.a;
        if (serializable == null) {
            return "";
        }
        serializable = new StringBuilder();
        Iterator iterator = this.a.iterator();
        while ((c2 = iterator.hasNext()) != '\u0000') {
            String string2 = ((CH$p)iterator.next()).toString();
            ((StringBuilder)serializable).append(string2);
            c2 = '\n';
            ((StringBuilder)serializable).append(c2);
        }
        return ((StringBuilder)serializable).toString();
    }
}

