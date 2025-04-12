/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;
import java.io.Serializable;

public final class sp3 {
    public static final sp3 d;
    public final int a;
    public final ImmutableList b;
    public int c;

    static {
        sp3 sp32;
        qp3[] qp3Array = new qp3[]{};
        d = sp32 = new sp3(qp3Array);
        gz3.D(0);
    }

    public sp3(qp3 ... qp3Array) {
        int n3;
        int n4;
        ImmutableList immutableList;
        this.b = immutableList = ImmutableList.copyOf(qp3Array);
        this.a = n4 = qp3Array.length;
        n4 = 0;
        qp3Array = null;
        while (n4 < (n3 = (immutableList = this.b).size())) {
            int n7;
            for (int i3 = n3 = n4 + 1; i3 < (n7 = immutableList.size()); ++i3) {
                Object object;
                Object object2 = (qp3)immutableList.get(n4);
                n7 = (int)(((qp3)object2).equals(object = immutableList.get(i3)) ? 1 : 0);
                if (n7 == 0) continue;
                object2 = new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray.");
                object = "";
                Cx.d(object, (Throwable)object2);
            }
            n4 = n3;
        }
    }

    public final qp3 a(int n3) {
        return (qp3)this.b.get(n3);
    }

    public final boolean equals(Object object) {
        Serializable serializable;
        Class<sp3> clazz;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz = sp3.class) == (serializable = object.getClass())) {
            boolean bl3;
            object = (sp3)object;
            int n3 = this.a;
            int n4 = ((sp3)object).a;
            if (n3 != n4 || !(bl3 = ((ImmutableList)(serializable = this.b)).equals(object = ((sp3)object).b))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.c;
        if (n3 == 0) {
            ImmutableList immutableList = this.b;
            this.c = n3 = immutableList.hashCode();
        }
        return this.c;
    }
}

