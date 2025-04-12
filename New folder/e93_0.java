/*
 * Decompiled with CFR 0.152.
 */
import com.bumptech.glide.load.engine.c$a;
import com.bumptech.glide.load.engine.i;

/*
 * Renamed from E93
 */
public final class e93_0
implements ei0$a {
    public final /* synthetic */ BP1$a a;
    public final /* synthetic */ i b;

    public e93_0(i i3, BP1$a bP1$a) {
        this.b = i3;
        this.a = bP1$a;
    }

    public final void c(Exception exception) {
        Object object = this.b;
        Object object2 = this.a;
        object = ((i)object).f;
        if (object != null && object == object2) {
            object = this.b;
            object2 = this.a;
            c$a c$a = ((i)object).b;
            object = ((i)object).g;
            object2 = ((BP1$a)object2).c;
            pi0_0 pi0_02 = object2.e();
            c$a.c((qn1_0)object, exception, (ei0_0)object2, pi0_02);
        }
    }

    public final void f(Object object) {
        Object object2 = this.b;
        Object object3 = this.a;
        object2 = ((i)object2).f;
        if (object2 != null && object2 == object3) {
            Object object4;
            boolean bl2;
            object2 = this.b;
            object3 = this.a;
            Object object5 = ((i)object2).a.p;
            if (object != null && (bl2 = ((Nq0)object5).c((pi0_0)((Object)(object4 = object3.c.e()))))) {
                ((i)object2).e = object;
                object = ((i)object2).b;
                object.d();
            } else {
                object5 = ((i)object2).b;
                object4 = object3.a;
                Object object6 = object3.c;
                Object object7 = object6.e();
                ci0 ci02 = ((i)object2).g;
                object2 = object5;
                object3 = object4;
                object5 = object;
                object4 = object6;
                object6 = object7;
                object7 = ci02;
                object2.a((qn1_0)object3, object, (ei0_0)object4, (pi0_0)((Object)object6), ci02);
            }
        }
    }
}

