/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Iy2
 */
public final class iy2_2
extends Lambda
implements gx0_2 {
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object[] e;
    public final /* synthetic */ vr1_1 f;

    public iy2_2(String string2, String string3, Object[] objectArray, vr1_1 vr1_12) {
        this.c = string2;
        this.d = string3;
        this.e = objectArray;
        this.f = vr1_12;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object objectArray) {
        block9: {
            block8: {
                int n3;
                int n4;
                String string2;
                block7: {
                    string2 = null;
                    object = (mk2_0)object;
                    object2 = (b30_0)object2;
                    n4 = (objectArray = (Number)objectArray).intValue();
                    n3 = n4 & 6;
                    if (n3 == 0) {
                        n3 = (int)(object2.J(object) ? 1 : 0);
                        n3 = n3 != 0 ? 4 : 2;
                        n4 |= n3;
                    }
                    if ((n4 &= 0x13) != (n3 = 18) || (n4 = (int)(object2.h() ? 1 : 0)) == 0) break block7;
                    object2.D();
                    break block8;
                }
                object = h.d(LP1$a.b, (mk2_0)object);
                objectArray = HA.e(Nc$a.a, false);
                n3 = object2.F();
                Object object3 = object2.m();
                object = a30_0.c((b30_0)object2, (LP1)object);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = object2.i();
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block9;
                object2.A();
                bl2 = object2.e();
                if (bl2) {
                    object2.C((Function0)((Object)serializable));
                } else {
                    object2.n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object2, objectArray, (Function2)((Object)serializable));
                objectArray = N20$a.d;
                Ow3.a((b30_0)object2, object3, (Function2)objectArray);
                objectArray = N20$a.f;
                boolean bl3 = object2.e();
                if (bl3 || !(bl3 = Intrinsics.areEqual(object3 = object2.v(), serializable = Integer.valueOf(n3)))) {
                    re0_0.a(n3, (b30_0)object2, n3, (N20$a$a)objectArray);
                }
                objectArray = N20$a.c;
                Ow3.a((b30_0)object2, object, (Function2)objectArray);
                int n7 = this.f.o();
                object = this.e[n7];
                n4 = 1;
                objectArray = new Object[n4];
                objectArray[0] = object;
                object = this.c;
                string2 = this.d;
                t10.b((String)object, string2, (b30_0)object2, objectArray);
                object2.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

