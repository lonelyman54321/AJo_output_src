/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Zi
 */
public final class zi_1
extends Lambda
implements Function2 {
    public final /* synthetic */ k72 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ uk2_0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ long g;
    public final /* synthetic */ LP1 h;
    public final /* synthetic */ int i;

    public zi_1(k72 k722, boolean bl2, uk2_0 uk2_02, boolean bl3, long l2, SuspendPointerInputElement suspendPointerInputElement, int n3) {
        this.c = k722;
        this.d = bl2;
        this.e = uk2_02;
        this.f = bl3;
        this.g = l2;
        this.h = suspendPointerInputElement;
        this.i = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.i | 1);
        boolean bl2 = this.f;
        Object object4 = object = this.h;
        object4 = (SuspendPointerInputElement)object;
        k72 k722 = this.c;
        boolean bl3 = this.d;
        uk2_0 uk2_02 = this.e;
        long l2 = this.g;
        bj_0.b(k722, bl3, uk2_02, bl2, l2, (SuspendPointerInputElement)object4, (b30_0)object3, n3);
        return Unit.a;
    }
}

