/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.jvm.functions.Function2;

public final class UX2
implements ti2_0 {
    public final long a;
    public final ry2_0 b;
    public final long c;
    public wc3_1 d;
    public final LP1 e;

    public UX2(long l2, ry2_0 ry2_02, long l3) {
        Object object = wc3_1.c;
        this.a = l2;
        this.b = ry2_02;
        this.c = l3;
        this.d = object;
        tx2_0 tx2_02 = new tx2_0(this);
        vx2_0 vx2_02 = new vx2_0(tx2_02, ry2_02, l2);
        object = new wx2_0(tx2_02, ry2_02, l2);
        Object object2 = new ay2_1((sQ1)object, vx2_02, null);
        Object object3 = tg3_0.a;
        object3 = new SuspendPointerInputElement(object, vx2_02, (Function2)object2, 4);
        object2 = wu1_2.a;
        this.e = object2 = zn0_2.d((LP1)object3, (wi)object2);
    }

    public final void onAbandoned() {
    }

    public final void onForgotten() {
    }

    public final void onRemembered() {
        new UX2$a(this);
        new UX2$b(this);
        this.b.e();
    }
}

