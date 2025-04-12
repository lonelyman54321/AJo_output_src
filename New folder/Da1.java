/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;

public final class Da1
implements BP1 {
    public static final U92 b = U92.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final AP1 a;

    public Da1(AP1 aP1) {
        this.a = aP1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final BP1$a a(Object object, int n3, int n4, Z92 object2) {
        object = (a01)object;
        Object object3 = this.a;
        if (object3 != null) {
            Object object4 = AP1$a.a(object);
            object3 = ((AP1)object3).a;
            Object object5 = ((VC1)object3).e(object4);
            ArrayDeque arrayDeque = AP1$a.d;
            synchronized (arrayDeque) {
                arrayDeque.offer(object4);
            }
            object5 = (a01)object5;
            if (object5 == null) {
                object4 = AP1$a.a(object);
                ((VC1)object3).h(object4, object);
            } else {
                object = object5;
            }
        }
        object3 = b;
        n3 = (Integer)((Z92)object2).c((U92)object3);
        object2 = new qb1_0((a01)object, n3);
        return new BP1$a((qn1_0)object, (ei0_0)object2);
    }
}

