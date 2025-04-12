/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class dp0
implements Zo0 {
    public wf3_0 a = null;
    public boolean b = false;
    public boolean c = false;
    public final wf3_0 d;
    public dp0$a e;
    public int f;
    public int g;
    public int h;
    public yq0_0 i;
    public boolean j;
    public final ArrayList k;
    public final ArrayList l;

    public dp0(wf3_0 wf3_02) {
        ArrayList arrayList;
        dp0$a dp0$a;
        this.e = dp0$a = dp0$a.UNKNOWN;
        this.h = 1;
        this.i = null;
        this.j = false;
        this.k = arrayList = new ArrayList();
        this.l = arrayList = new ArrayList();
        this.d = wf3_02;
    }

    public final void a(Zo0 object) {
        int n3;
        boolean bl2;
        Zo0 zo0;
        boolean bl3;
        object = this.l;
        Iterator iterator = ((ArrayList)object).iterator();
        while (bl3 = iterator.hasNext()) {
            zo0 = (dp0)iterator.next();
            bl3 = ((dp0)zo0).j;
            if (bl3) continue;
            return;
        }
        int n4 = 1;
        this.c = n4;
        zo0 = this.a;
        if (zo0 != null) {
            zo0.a(this);
        }
        if (bl3 = this.b) {
            this.d.a(this);
            return;
        }
        object = ((ArrayList)object).iterator();
        bl3 = false;
        zo0 = null;
        int n7 = 0;
        while (bl2 = object.hasNext()) {
            dp0 dp02 = (dp0)object.next();
            boolean bl4 = dp02 instanceof yq0_0;
            if (bl4) continue;
            ++n7;
            zo0 = dp02;
        }
        if (zo0 != null && n7 == n4 && (n3 = ((dp0)zo0).j) != 0) {
            object = this.i;
            if (object != null) {
                n4 = (int)(((dp0)object).j ? 1 : 0);
                if (n4 != 0) {
                    n4 = this.h;
                    n3 = ((dp0)object).g;
                    this.f = n4 *= n3;
                } else {
                    return;
                }
            }
            n3 = ((dp0)zo0).g;
            n4 = this.f;
            this.d(n3 += n4);
        }
        if ((object = this.a) != null) {
            object.a(this);
        }
    }

    public final void b(Zo0 zo0) {
        ArrayList arrayList = this.k;
        arrayList.add(zo0);
        boolean bl2 = this.j;
        if (bl2) {
            zo0.a(zo0);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int n3) {
        boolean bl2 = this.j;
        if (bl2) {
            return;
        }
        this.j = bl2 = true;
        this.g = n3;
        Iterator iterator = this.k.iterator();
        while (bl2 = iterator.hasNext()) {
            Zo0 zo0 = (Zo0)iterator.next();
            zo0.a(zo0);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.d.b.m0;
        stringBuilder.append((String)object);
        stringBuilder.append(":");
        object = this.e;
        stringBuilder.append(object);
        object = "(";
        stringBuilder.append((String)object);
        int n3 = this.j;
        if (n3 != 0) {
            n3 = this.g;
            object = n3;
        } else {
            object = "unresolved";
        }
        stringBuilder.append(object);
        stringBuilder.append(") <t=");
        n3 = this.l.size();
        stringBuilder.append(n3);
        stringBuilder.append(":d=");
        n3 = this.k.size();
        stringBuilder.append(n3);
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}

