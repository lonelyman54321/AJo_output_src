/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class VF3 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        ArrayList arrayList2 = this.a;
        int n3 = arrayList2.size();
        int n4 = this.e;
        int n7 = -1;
        if (n4 != n7 && n3 > 0) {
            for (n4 = 0; n4 < (n7 = arrayList.size()); ++n4) {
                VF3 vF3 = (VF3)arrayList.get(n4);
                int n8 = this.e;
                int n10 = vF3.b;
                if (n8 != n10) continue;
                n8 = this.c;
                this.c(n8, vF3);
            }
        }
        if (n3 == 0) {
            arrayList.remove(this);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int b(Eu1 eu1, int n3) {
        int n4;
        Object object;
        Object object2;
        int n7;
        int n8;
        Object object3 = this.a;
        int n10 = ((ArrayList)object3).size();
        int n14 = 0;
        if (n10 == 0) {
            return 0;
        }
        Z50 z50 = (Z50)((Y50)((ArrayList)object3).get((int)0)).X;
        eu1.t();
        z50.f(eu1, false);
        Object object4 = null;
        for (n8 = 0; n8 < (n7 = ((ArrayList)object3).size()); ++n8) {
            object2 = (Y50)((ArrayList)object3).get(n8);
            ((Y50)object2).f(eu1, false);
        }
        if (n3 == 0 && (n8 = z50.G0) > 0) {
            pr_0.a(z50, eu1, (ArrayList)object3, 0);
        }
        if (n3 == (n8 = 1) && (n7 = z50.H0) > 0) {
            pr_0.a(z50, eu1, (ArrayList)object3, n8);
        }
        try {
            eu1.p();
        }
        catch (Exception exception) {
            object2 = System.err;
            object = new StringBuilder();
            String string2 = ((Object)exception).toString();
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append("\n");
            object4 = Arrays.toString(exception.getStackTrace()).replace("[", "   at ").replace(",", "\n   at");
            string2 = "]";
            String string3 = "";
            object4 = ((String)object4).replace(string2, string3);
            ((StringBuilder)object).append((String)object4);
            object4 = ((StringBuilder)object).toString();
            ((PrintStream)object2).println((String)object4);
        }
        object4 = new ArrayList();
        this.d = object4;
        while (n14 < (n8 = ((ArrayList)object3).size())) {
            object4 = (Y50)((ArrayList)object3).get(n14);
            object2 = new Object();
            new WeakReference<Object>(object4);
            Eu1.n(((Y50)object4).L);
            Eu1.n(((Y50)object4).M);
            Eu1.n(((Y50)object4).N);
            object = ((Y50)object4).O;
            Eu1.n(object);
            Eu1.n(((Y50)object4).P);
            object4 = this.d;
            ((ArrayList)object4).add(object2);
            ++n14;
        }
        if (n3 == 0) {
            v50_0 v50_02 = z50.L;
            n3 = Eu1.n(v50_02);
            object3 = z50.N;
            n4 = Eu1.n(object3);
            eu1.t();
            return n4 -= n3;
        } else {
            v50_0 v50_03 = z50.M;
            n3 = Eu1.n(v50_03);
            object3 = z50.O;
            n4 = Eu1.n(object3);
            eu1.t();
            return n4 -= n3;
        }
    }

    public final void c(int n3, VF3 vF3) {
        boolean bl2;
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            ArrayList arrayList = vF3.a;
            Y50 y50 = (Y50)iterator.next();
            boolean bl3 = arrayList.contains(y50);
            if (!bl3) {
                arrayList.add(y50);
            }
            int n4 = vF3.b;
            if (n3 == 0) {
                y50.v0 = n4;
                continue;
            }
            y50.w0 = n4;
        }
        this.e = n3 = vF3.b;
    }

    public final String toString() {
        int n3;
        CharSequence charSequence = new StringBuilder();
        int n4 = this.c;
        Object object = n4 == 0 ? "Horizontal" : (n4 == (n3 = 1) ? "Vertical" : (n4 == (n3 = 2) ? "Both" : "Unknown"));
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(" [");
        n4 = this.b;
        Object object2 = "] <";
        charSequence = g30.a(n4, (String)object2, (StringBuilder)charSequence);
        object = this.a.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (Y50)object.next();
            String string2 = " ";
            charSequence = nn_2.a((String)charSequence, string2);
            object2 = ((Y50)object2).m0;
            ((StringBuilder)charSequence).append((String)object2);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return Ft2.a((String)charSequence, " >");
    }
}

