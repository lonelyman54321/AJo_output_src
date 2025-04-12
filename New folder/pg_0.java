/*
 * Decompiled with CFR 0.152.
 */
import androidx.constraintlayout.core.parser.CLParsingException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/*
 * Renamed from PG
 */
public class pg_0
extends QG {
    public ArrayList e;

    public pg_0(char[] object) {
        super((char[])object);
        object = new ArrayList;
        super();
        this.e = object;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof pg_0;
        if (!bl2) {
            return false;
        }
        ArrayList arrayList = this.e;
        object = ((pg_0)object).e;
        return arrayList.equals(object);
    }

    public final float getFloat(int n3) {
        Object object = this.o(n3);
        if (object != null) {
            return ((QG)object).f();
        }
        String string2 = hj0_0.a(n3, "no float at index ");
        object = new CLParsingException(string2, this);
        throw object;
    }

    public final int getInt(int n3) {
        Object object = this.o(n3);
        if (object != null) {
            return ((QG)object).g();
        }
        String string2 = hj0_0.a(n3, "no int at index ");
        object = new CLParsingException(string2, this);
        throw object;
    }

    public int hashCode() {
        ArrayList arrayList = this.e;
        Integer n3 = super.hashCode();
        Object[] objectArray = new Object[]{arrayList, n3};
        return Objects.hash(objectArray);
    }

    public final void l(QG qG) {
        this.e.add(qG);
    }

    public pg_0 m() {
        boolean bl2;
        pg_0 pg_02 = (pg_0)super.d();
        int n3 = this.e.size();
        ArrayList<QG> arrayList = new ArrayList<QG>(n3);
        Iterator iterator = this.e.iterator();
        while (bl2 = iterator.hasNext()) {
            QG qG = ((QG)iterator.next()).d();
            qG.d = pg_02;
            arrayList.add(qG);
        }
        pg_02.e = arrayList;
        return pg_02;
    }

    public final QG o(int n3) {
        Serializable serializable;
        int n4;
        if (n3 >= 0 && n3 < (n4 = ((ArrayList)(serializable = this.e)).size())) {
            return (QG)this.e.get(n3);
        }
        String string2 = hj0_0.a(n3, "no element at index ");
        serializable = new CLParsingException(string2, this);
        throw serializable;
    }

    public final QG q(String string2) {
        boolean bl2;
        Object object = this.e.iterator();
        while (bl2 = object.hasNext()) {
            rg_1 rg_12 = (rg_1)((QG)object.next());
            String string3 = rg_12.e();
            boolean bl3 = string3.equals(string2);
            if (!bl3) continue;
            return rg_12.B();
        }
        string2 = cP.a("no element for key <", string2, ">");
        object = new CLParsingException(string2, this);
        throw object;
    }

    public final float r(String charSequence) {
        QG qG = this.q((String)charSequence);
        if (qG != null) {
            return qG.f();
        }
        charSequence = Gn.a("no float found for key <", (String)charSequence, ">, found [");
        String string2 = qG.i();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append("] : ");
        ((StringBuilder)charSequence).append(qG);
        charSequence = ((StringBuilder)charSequence).toString();
        CLParsingException cLParsingException = new CLParsingException((String)charSequence, this);
        throw cLParsingException;
    }

    public final QG s(int n3) {
        ArrayList arrayList;
        int n4;
        if (n3 >= 0 && n3 < (n4 = (arrayList = this.e).size())) {
            return (QG)this.e.get(n3);
        }
        return null;
    }

    public final QG t(String string2) {
        boolean bl2;
        Iterator iterator = this.e.iterator();
        while (bl2 = iterator.hasNext()) {
            rg_1 rg_12 = (rg_1)((QG)iterator.next());
            String string3 = rg_12.e();
            boolean bl3 = string3.equals(string2);
            if (!bl3) continue;
            return rg_12.B();
        }
        return null;
    }

    public final String toString() {
        Object object;
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder();
        Object object2 = this.e.iterator();
        while (bl2 = object2.hasNext()) {
            object = (QG)object2.next();
            int n3 = stringBuilder.length();
            if (n3 > 0) {
                String string2 = "; ";
                stringBuilder.append(string2);
            }
            stringBuilder.append(object);
        }
        object2 = new StringBuilder();
        object = super.toString();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(" = <");
        ((StringBuilder)object2).append((Object)stringBuilder);
        ((StringBuilder)object2).append(" >");
        return ((StringBuilder)object2).toString();
    }

    public final String u(int n3) {
        Object object = this.o(n3);
        boolean bl2 = object instanceof ug_1;
        if (bl2) {
            return ((QG)object).e();
        }
        String string2 = hj0_0.a(n3, "no string at index ");
        object = new CLParsingException(string2, this);
        throw object;
    }

    public final String v(String charSequence) {
        String string2;
        QG qG = this.q((String)charSequence);
        boolean bl2 = qG instanceof ug_1;
        if (bl2) {
            return qG.e();
        }
        if (qG != null) {
            string2 = qG.i();
        } else {
            bl2 = false;
            string2 = null;
        }
        charSequence = og_1.a("no string found for key <", (String)charSequence, ">, found [", string2, "] : ");
        ((StringBuilder)charSequence).append(qG);
        charSequence = ((StringBuilder)charSequence).toString();
        CLParsingException cLParsingException = new CLParsingException((String)charSequence, this);
        throw cLParsingException;
    }

    public final String w(String object) {
        boolean bl2 = (object = this.t((String)object)) instanceof ug_1;
        if (bl2) {
            return ((QG)object).e();
        }
        return null;
    }

    public final boolean x(String string2) {
        boolean bl2;
        Iterator iterator = this.e.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (QG)iterator.next();
            boolean bl3 = object instanceof rg_1;
            if (!bl3 || !(bl2 = ((String)(object = ((rg_1)object).e())).equals(string2))) continue;
            return true;
        }
        return false;
    }

    public final ArrayList y() {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Iterator iterator = this.e.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (QG)iterator.next();
            boolean bl3 = object instanceof rg_1;
            if (!bl3) continue;
            object = ((rg_1)object).e();
            arrayList.add(object);
        }
        return arrayList;
    }

    public final void z(String object, QG qG) {
        Object object2;
        boolean bl2;
        Object object3 = this.e.iterator();
        while (bl2 = object3.hasNext()) {
            object2 = (rg_1)((QG)object3.next());
            String string2 = ((QG)object2).e();
            boolean bl3 = string2.equals(object);
            if (!bl3) continue;
            object = ((pg_0)object2).e;
            int n3 = ((ArrayList)object).size();
            if (n3 > 0) {
                object = ((pg_0)object2).e;
                ((ArrayList)object).set(0, qG);
            } else {
                object = ((pg_0)object2).e;
                ((ArrayList)object).add(qG);
            }
            return;
        }
        object2 = ((String)object).toCharArray();
        object3 = new pg_0((char[])object2);
        ((QG)object3).b = 0L;
        long l2 = ((String)object).length() + -1;
        ((QG)object3).j(l2);
        object = ((pg_0)object3).e;
        int n4 = ((ArrayList)object).size();
        if (n4 > 0) {
            object = ((pg_0)object3).e;
            ((ArrayList)object).set(0, qG);
        } else {
            object = ((pg_0)object3).e;
            ((ArrayList)object).add(qG);
        }
        this.e.add(object3);
    }
}

