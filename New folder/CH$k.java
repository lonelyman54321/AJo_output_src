/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;

public final class CH$k
implements CH$g {
    public List a;

    public final boolean a(CH$q cH$q, rR2$L rR2$L) {
        boolean bl2;
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            CH$s cH$s = (CH$s)iterator.next();
            bl2 = CH.g(cH$q, cH$s, rR2$L);
            if (!bl2) continue;
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("not(");
        List list = this.a;
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

