/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class S83$c
extends Lambda
implements Function1 {
    public final /* synthetic */ S83 c;

    public S83$c(S83 s83) {
        this.c = s83;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        Object object2 = this.c;
        boolean bl2 = ((S83)object2).h;
        if (bl2) return Unit.a;
        WR1 wR1 = ((S83)object2).f;
        synchronized (wR1) {
            object2 = ((S83)object2).i;
            Intrinsics.checkNotNull(object2);
            Object object3 = ((S83$a)object2).b;
            Intrinsics.checkNotNull(object3);
            int n3 = ((S83$a)object2).d;
            gr1_1 gr1_12 = ((S83$a)object2).c;
            if (gr1_12 == null) {
                Object object4 = null;
                ((S83$a)object2).c = gr1_12 = new gr1_1(null);
                object4 = ((S83$a)object2).f;
                ((nr1_1)object4).i(object3, gr1_12);
                object4 = Unit.a;
            }
            ((S83$a)object2).c(object, n3, object3, gr1_12);
            object = Unit.a;
            return Unit.a;
        }
    }
}

