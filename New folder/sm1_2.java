/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlinx.serialization.json.JsonElement;

/*
 * Renamed from Sm1
 */
public final class sm1_2
extends rl2_2
implements gx0_2 {
    public int b;
    public /* synthetic */ xj0_2 c;
    public final /* synthetic */ um1_1 d;

    public sm1_2(um1_1 um1_12, f80_0 f80_02) {
        this.d = um1_12;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (xj0_2)object;
        object2 = (Unit)object2;
        object3 = (f80_0)object3;
        um1_1 um1_12 = this.d;
        object2 = new sm1_2(um1_12, (f80_0)object3);
        ((sm1_2)object2).c = object;
        object = Unit.a;
        return ((sm1_2)object2).invokeSuspend(object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        byte by2;
        byte by4;
        um1_1 um1_12;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.b;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = this.c;
            um1_12 = this.d;
            q0_0 q0_02 = um1_12.a;
            by4 = q0_02.w();
            if (by4 == n4) {
                return um1_12.d(n4 != 0);
            }
            if (by4 == 0) {
                return um1_12.d(false);
            }
            by2 = 6;
            if (by4 == by2) {
                this.b = n4;
                if ((object = um1_1.a(um1_12, (xj0_2)object, this)) != j90_02) return (JsonElement)object;
                return j90_02;
            }
        } else {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
            return (JsonElement)object;
        }
        byte by5 = 8;
        if (by4 == by5) {
            return um1_12.c();
        }
        q0_0.r(um1_12.a, "Can't begin reading element, unexpected token", 0, null, by2);
        throw null;
    }
}

