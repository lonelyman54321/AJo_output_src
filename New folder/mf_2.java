/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from mF
 */
public final class mf_2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public final uf_1 a;
    private volatile /* synthetic */ Object content;

    static {
        b = AtomicReferenceFieldUpdater.newUpdater(mf_2.class, Object.class, "content");
    }

    public mf_2(uf_1 uf_12) {
        Intrinsics.checkNotNullParameter(uf_12, "origin");
        this.a = uf_12;
        this.content = null;
    }

    public final uf_1 a() {
        Serializable serializable = this.a.f();
        if (serializable == null) {
            Object object;
            Object object2;
            serializable = new Ref$ObjectRef();
            ((Ref$ObjectRef)serializable).element = object2 = this.content;
            if (object2 == null) {
                Object v4;
                ((Ref$ObjectRef)serializable).element = object2 = new mF$a(this);
                object = b;
                do {
                    boolean bl2;
                    if (!(bl2 = ((AtomicReferenceFieldUpdater)object).compareAndSet(this, null, object2))) continue;
                    return ((rj3_2)((mF$a)((Ref$ObjectRef)serializable).element).b.getValue()).a;
                } while ((v4 = ((AtomicReferenceFieldUpdater)object).get(this)) == null);
                object2 = this.content;
                Intrinsics.checkNotNull(object2);
                ((Ref$ObjectRef)serializable).element = object2;
            }
            object2 = e01_0.a;
            object = new mF$b((Ref$ObjectRef)serializable, null);
            return kf_1.e((i90_0)object2, null, (Function2)object, (int)3).a;
        }
        serializable = this.a.f();
        Intrinsics.checkNotNull(serializable);
        throw serializable;
    }
}

