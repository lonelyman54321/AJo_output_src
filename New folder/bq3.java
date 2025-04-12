/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;

public final class bq3 {
    public static final bq3 b;
    public final ImmutableList a;

    static {
        bq3 bq32;
        ImmutableList immutableList = ImmutableList.of();
        b = bq32 = new bq3(immutableList);
        gz3.D(0);
    }

    public bq3(ImmutableList immutableList) {
        this.a = immutableList = ImmutableList.copyOf((Collection)immutableList);
    }

    public final ImmutableList a() {
        return this.a;
    }

    public final boolean b(int n3) {
        Object object;
        int n4;
        for (int i3 = 0; i3 < (n4 = ((AbstractCollection)(object = this.a)).size()); ++i3) {
            int n7;
            n4 = (int)(((bq3$a)(object = (bq3$a)object.get(i3))).b() ? 1 : 0);
            if (n4 == 0 || (n7 = ((bq3$a)object).a()) != n3) continue;
            return true;
        }
        return false;
    }

    public final boolean c() {
        Object object;
        int n3;
        boolean bl2 = false;
        for (int i3 = 0; i3 < (n3 = ((AbstractCollection)(object = this.a)).size()); ++i3) {
            boolean bl3;
            int n4;
            bq3$a bq3$a = (bq3$a)object.get(i3);
            n3 = bq3$a.a();
            if (n3 != (n4 = 2) || !(bl3 = ((bq3$a)(object = (bq3$a)object.get(i3))).c())) continue;
            bl2 = true;
            break;
        }
        return bl2;
    }

    public final boolean equals(Object object) {
        Serializable serializable;
        Class<bq3> clazz;
        if (this == object) {
            return true;
        }
        if (object != null && (clazz = bq3.class) == (serializable = object.getClass())) {
            object = (bq3)object;
            serializable = this.a;
            object = ((bq3)object).a;
            return ((ImmutableList)serializable).equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

