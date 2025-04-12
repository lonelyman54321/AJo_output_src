/*
 * Decompiled with CFR 0.152.
 */
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class NQ1$a
implements ei0_0,
ei0$a {
    public final List a;
    public final yw2 b;
    public int c;
    public Az2 d;
    public ei0$a e;
    public List f;
    public boolean g;

    public NQ1$a(ArrayList serializable, yw2 yw22) {
        this.b = yw22;
        boolean bl2 = serializable.isEmpty();
        if (!bl2) {
            this.a = serializable;
            this.c = 0;
            return;
        }
        super("Must not be empty.");
        throw serializable;
    }

    public final Class a() {
        return ((ei0_0)this.a.get(0)).a();
    }

    public final void b() {
        boolean bl2;
        Object object;
        Object object2 = this.f;
        if (object2 != null) {
            object = this.b;
            object.a(object2);
        }
        this.f = null;
        object2 = this.a.iterator();
        while (bl2 = object2.hasNext()) {
            object = (ei0_0)object2.next();
            object.b();
        }
    }

    public final void c(Exception exception) {
        List list = this.f;
        dV0.c(list, "Argument must not be null");
        list.add(exception);
        this.g();
    }

    public final void cancel() {
        boolean bl2;
        boolean bl3;
        this.g = bl3 = true;
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            ei0_0 ei0_02 = (ei0_0)iterator.next();
            ei0_02.cancel();
        }
    }

    public final void d(Az2 az2, ei0$a object) {
        this.d = az2;
        this.e = object;
        this.f = object = (List)this.b.b();
        object = this.a;
        int n3 = this.c;
        object = (ei0_0)object.get(n3);
        object.d(az2, this);
        boolean bl2 = this.g;
        if (bl2) {
            this.cancel();
        }
    }

    public final pi0_0 e() {
        return ((ei0_0)this.a.get(0)).e();
    }

    public final void f(Object object) {
        if (object != null) {
            ei0$a ei0$a = this.e;
            ei0$a.f(object);
        } else {
            this.g();
        }
    }

    public final void g() {
        int n3 = this.g;
        if (n3 != 0) {
            return;
        }
        n3 = this.c;
        Object object = this.a;
        int n4 = object.size() + -1;
        if (n3 < n4) {
            this.c = n3 = this.c + 1;
            Az2 az2 = this.d;
            object = this.e;
            this.d(az2, (ei0$a)object);
        } else {
            dV0.b(this.f);
            ei0$a ei0$a = this.e;
            Object object2 = this.f;
            ArrayList arrayList = new ArrayList(object2);
            object2 = "Fetch failed";
            object = new GlideException((String)object2, arrayList);
            ei0$a.c((Exception)object);
        }
    }
}

