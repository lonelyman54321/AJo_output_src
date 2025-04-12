/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class dD3
extends rl2_2
implements Function2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ View d;

    public dD3(View view, f80_0 f80_02) {
        this.d = view;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        View view = this.d;
        dD3 dD32 = new dD3(view, f80_02);
        dD32.c = object;
        return dD32;
    }

    public final Object invoke(Object object, Object object2) {
        object = (xz2_2)object;
        object2 = (f80_0)object2;
        object = (dD3)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((dD3)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block7: {
            Object object2;
            int n3;
            Object object3;
            j90_0 j90_02;
            block8: {
                int n4;
                block4: {
                    block5: {
                        block6: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.b;
                            object3 = this.d;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block4;
                            if (n7 == n4) break block5;
                            if (n7 != n3) break block6;
                            vl2_2.b(object);
                            break block7;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (xz2_2)this.c;
                    vl2_2.b(object);
                    break block8;
                }
                vl2_2.b(object);
                object2 = object = this.c;
                this.c = object2 = (xz2_2)object;
                this.b = n4;
                object = ((xz2_2)object2).a(this, object3);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            boolean bl2 = object3 instanceof ViewGroup;
            if (bl2) {
                object3 = (ViewGroup)object3;
                bl2 = false;
                this.c = null;
                this.b = n3;
                object2.getClass();
                uc3_1 uc3_12 = new uc3_1((ViewGroup)object3);
                object3 = tc3_1.c;
                object = new cs3(uc3_12, (Function1)object3);
                object = ((xz2_2)object2).c((Iterator)object, this);
                if (object != j90_02) {
                    object = Unit.a;
                }
                if (object == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

