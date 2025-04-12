/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from e13$a
 */
public final class e13$a_0
extends rl2_2
implements Function2 {
    public Iterator b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e13_0 e;

    public e13$a_0(e13_0 e13_02, f80_0 f80_02) {
        this.e = e13_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        e13_0 e13_02 = this.e;
        e13$a_0 e13$a_0 = new e13$a_0(e13_02, f80_02);
        e13$a_0.d = object;
        return e13$a_0;
    }

    public final Object invoke(Object object, Object object2) {
        object = (xz2_2)object;
        object2 = (f80_0)object2;
        object = (e13$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((e13$a_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        Object object2;
        int n3;
        Object object3;
        j90_0 j90_02;
        block6: {
            int n4;
            block7: {
                block3: {
                    block4: {
                        block5: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.c;
                            object3 = this.e;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block3;
                            if (n7 == n4) break block4;
                            if (n7 != n3) break block5;
                            object2 = this.b;
                            object3 = (xz2_2)this.d;
                            vl2_2.b(object);
                            break block6;
                        }
                        object = new Object("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (xz2_2)this.d;
                    vl2_2.b(object);
                    break block7;
                }
                vl2_2.b(object);
                object = this.d;
                object2 = object;
                this.d = object2 = (xz2_2)object;
                this.c = n4;
                object = ((xz2_2)object2).a(this, object3);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = ((e13_0)object3).c;
            object3 = new ArrayList();
            object = ((ArrayList)object).iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                yz2_0 yz2_02 = ((e13_0)object.next()).d;
                cx_2.s((ArrayList)object3, yz2_02);
            }
            object = ((ArrayList)object3).iterator();
            object3 = object2;
            object2 = object;
        }
        while (bl2 = object2.hasNext()) {
            object = (e13_0)object2.next();
            this.d = object3;
            this.b = object2;
            this.c = n3;
            if ((object = ((xz2_2)object3).a(this, object)) != j90_02) continue;
            return j90_02;
        }
        return Unit.a;
    }
}

