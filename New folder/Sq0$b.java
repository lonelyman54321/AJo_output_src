/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.ArrayList;

public final class Sq0$b {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public Sq0$a g;
    public int h;
    public final /* synthetic */ Sq0 i;

    public Sq0$b(Sq0 sq0, String string2) {
        this.i = sq0;
        this.a = string2;
        sq0.getClass();
        int n3 = 2;
        Object object = new long[n3];
        this.b = object;
        object = new ArrayList;
        sq0.getClass();
        super(n3);
        this.c = object;
        object = new ArrayList;
        sq0.getClass();
        super(n3);
        this.d = object;
        object = new StringBuilder;
        super(string2);
        ((StringBuilder)object).append('.');
        int n4 = ((StringBuilder)object).length();
        sq0.getClass();
        sq0 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            ((StringBuilder)object).append(i3);
            ArrayList arrayList = this.c;
            hn2_2 hn2_22 = this.i.a;
            String string3 = ((StringBuilder)object).toString();
            hn2_22 = hn2_22.d(string3);
            arrayList.add(hn2_22);
            ((StringBuilder)object).append(".tmp");
            arrayList = this.d;
            hn2_22 = this.i.a;
            string3 = ((StringBuilder)object).toString();
            hn2_22 = hn2_22.d(string3);
            arrayList.add(hn2_22);
            ((StringBuilder)object).setLength(n4);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Sq0$c a() {
        int n3 = this.e;
        if (n3 == 0) {
            return null;
        }
        Object object = this.g;
        if (object != null) return null;
        n3 = this.f;
        if (n3 != 0) {
            return null;
        }
        object = this.c;
        int n4 = ((ArrayList)object).size();
        int n7 = 0;
        while (true) {
            Sq0 sq0 = this.i;
            if (n7 >= n4) {
                this.h = n3 = this.h + 1;
                return new Sq0$c(sq0, this);
            }
            vq0_0 vq0_02 = sq0.p;
            hn2_2 hn2_22 = (hn2_2)((ArrayList)object).get(n7);
            boolean bl2 = vq0_02.f(hn2_22);
            if (!bl2) {
                try {
                    sq0.z(this);
                    return null;
                }
                catch (IOException iOException) {
                    return null;
                }
            }
            ++n7;
        }
    }
}

