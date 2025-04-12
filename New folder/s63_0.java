/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.internal.functions.Functions$a;

/*
 * Renamed from s63
 */
public final class s63_0
extends g53_0 {
    public final q63_0[] a;
    public final bx0_2 b;

    public s63_0(q63_0[] q63_0Array, Functions$a functions$a) {
        this.a = q63_0Array;
        this.b = functions$a;
    }

    public final void g(t53_0 object) {
        Object object2 = this.a;
        int n3 = ((q63_0[])object2).length;
        int n4 = 1;
        if (n3 == n4) {
            object2 = object2[0];
            s63$a s63$a = new s63$a(this);
            S53$a s53$a = new S53$a((t53_0)object, s63$a);
            object2.a(s53$a);
            return;
        }
        Object object3 = this.b;
        s63$b s63$b = new s63$b((t53_0)object, n3, (bx0_2)object3);
        object.a(s63$b);
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2 = s63$b.isDisposed();
            if (bl2) {
                return;
            }
            object = object2[i3];
            if (object == null) {
                object = new NullPointerException("One of the sources is null");
                s63$b.a((Throwable)object, i3);
                return;
            }
            object3 = s63$b.c[i3];
            object.a((t53_0)object3);
        }
    }
}

