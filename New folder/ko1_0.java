/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.Path$Op
 */
import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * Renamed from kO1
 */
public final class ko1_0
implements ln2,
F11 {
    public final Path a;
    public final Path b;
    public final Path c;
    public final ArrayList d;
    public final jo1_0 e;

    public ko1_0(jo1_0 jo1_02) {
        Object object;
        this.a = object = new Path();
        this.b = object = new Path();
        this.c = object = new Path();
        this.d = object;
        jo1_02.getClass();
        this.e = jo1_02;
    }

    public final void a(Path.Op op2) {
        Object object;
        int n3;
        Object object2;
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        Object object3 = this.d;
        int n4 = ((ArrayList)object3).size();
        int n7 = 1;
        n4 -= n7;
        while (n4 >= n7) {
            object2 = (ln2)((ArrayList)object3).get(n4);
            n3 = object2 instanceof f60_0;
            if (n3 != 0) {
                object2 = (f60_0)object2;
                object = (ArrayList)((f60_0)object2).g();
                for (int i3 = ((ArrayList)object).size() - n7; i3 >= 0; i3 += -1) {
                    Path path3 = ((ln2)((ArrayList)object).get(i3)).getPath();
                    Nq3 nq3 = ((f60_0)object2).l;
                    if (nq3 != null) {
                        nq3 = nq3.e();
                    } else {
                        nq3 = ((f60_0)object2).d;
                        nq3.reset();
                    }
                    path3.transform((Matrix)nq3);
                    path.addPath(path3);
                }
            } else {
                object2 = object2.getPath();
                path.addPath((Path)object2);
            }
            n4 += -1;
        }
        n4 = 0;
        n7 = (object3 = (ln2)((ArrayList)object3).get(0)) instanceof f60_0;
        if (n7 != 0) {
            object3 = (f60_0)object3;
            List list = ((f60_0)object3).g();
            while (true) {
                object2 = list;
                object2 = (ArrayList)list;
                n3 = ((ArrayList)object2).size();
                if (n4 < n3) {
                    object2 = ((ln2)((ArrayList)object2).get(n4)).getPath();
                    object = ((f60_0)object3).l;
                    if (object != null) {
                        object = ((Nq3)object).e();
                    } else {
                        object = ((f60_0)object3).d;
                        object.reset();
                    }
                    object2.transform((Matrix)object);
                    path2.addPath((Path)object2);
                    ++n4;
                    continue;
                }
                break;
            }
        } else {
            object3 = object3.getPath();
            path2.set((Path)object3);
        }
        this.c.op(path2, path, op2);
    }

    public final void b(List list, List list2) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.d)).size()); ++i3) {
            object = (ln2)((ArrayList)object).get(i3);
            object.b(list, list2);
        }
    }

    public final void g(ListIterator listIterator) {
        Object object;
        boolean bl2;
        while ((bl2 = listIterator.hasPrevious()) && (object = listIterator.previous()) != this) {
        }
        while (bl2 = listIterator.hasPrevious()) {
            object = (r60_0)listIterator.previous();
            boolean bl3 = object instanceof ln2;
            if (!bl3) continue;
            ArrayList arrayList = this.d;
            object = (ln2)object;
            arrayList.add(object);
            listIterator.remove();
        }
    }

    public final Path getPath() {
        Path path = this.c;
        path.reset();
        Object object = this.e;
        int n3 = ((jo1_0)object).b;
        if (n3 != 0) {
            return path;
        }
        Object object2 = kO1$a.a;
        object = ((jo1_0)object).a;
        int n4 = ((Enum)object).ordinal();
        n3 = 1;
        if ((n4 = object2[n4]) != n3) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    n3 = 4;
                    if (n4 != n3) {
                        n3 = 5;
                        if (n4 == n3) {
                            object = Path.Op.XOR;
                            this.a((Path.Op)object);
                        }
                    } else {
                        object = Path.Op.INTERSECT;
                        this.a((Path.Op)object);
                    }
                } else {
                    object = Path.Op.REVERSE_DIFFERENCE;
                    this.a((Path.Op)object);
                }
            } else {
                object = Path.Op.UNION;
                this.a((Path.Op)object);
            }
        } else {
            int n7;
            object = null;
            for (n4 = 0; n4 < (n7 = ((ArrayList)(object2 = (Object)this.d)).size()); ++n4) {
                object2 = ((ln2)((ArrayList)object2).get(n4)).getPath();
                path.addPath((Path)object2);
            }
        }
        return path;
    }
}

