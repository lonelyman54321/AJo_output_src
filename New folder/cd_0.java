/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cd
 */
public final class cd_0
implements gx0_2 {
    public final /* synthetic */ ib3_0 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ ft1_2 d;
    public final /* synthetic */ yT1 e;
    public final /* synthetic */ Activity f;

    public cd_0(tr1_0 tr1_02, dr0_0 dr0_02, p83_0 p83_02, ft1_2 ft1_22, yT1 yT12, Activity activity) {
        this.a = tr1_02;
        this.b = dr0_02;
        this.c = p83_02;
        this.d = ft1_22;
        this.e = yT12;
        this.f = activity;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block9: {
            block8: {
                int n3;
                Object object4;
                block7: {
                    object = (mk2_0)object;
                    object2 = (b30_0)object2;
                    object3 = (Number)object3;
                    int n4 = ((Number)object3).intValue();
                    object4 = "padding";
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    n3 = n4 & 0xE;
                    if (n3 == 0) {
                        n3 = (int)(object2.J(object) ? 1 : 0);
                        n3 = n3 != 0 ? 4 : 2;
                        n4 |= n3;
                    }
                    if ((n4 &= 0x5B) != (n3 = 18) || (n4 = (int)(object2.h() ? 1 : 0)) == 0) break block7;
                    object2.D();
                    break block8;
                }
                object = h.d(LP1$a.b, (mk2_0)object);
                object3 = j.c;
                object = object.then((LP1)object3);
                object3 = Nc$a.a;
                object4 = null;
                object3 = HA.e((Nc)object3, false);
                n3 = object2.F();
                Object object5 = object2.m();
                object = a30_0.c((b30_0)object2, (LP1)object);
                N20.W.getClass();
                Object object6 = N20$a.b;
                Object object7 = object2.i();
                boolean bl2 = object7 instanceof mp;
                ft1_2 ft1_22 = null;
                if (!bl2) break block9;
                object2.A();
                bl2 = object2.e();
                if (bl2) {
                    object2.C((Function0)object6);
                } else {
                    object2.n();
                }
                object6 = N20$a.e;
                Ow3.a((b30_0)object2, object3, (Function2)object6);
                object3 = N20$a.d;
                Ow3.a((b30_0)object2, object5, (Function2)object3);
                object3 = N20$a.f;
                boolean bl3 = object2.e();
                if (bl3 || !(bl3 = Intrinsics.areEqual(object5 = object2.v(), object6 = Integer.valueOf(n3)))) {
                    re0_0.a(n3, (b30_0)object2, n3, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object2, object, (Function2)object3);
                object = Og2.a.c(null);
                ft1_22 = this.d;
                object5 = object4 = this.a;
                object5 = (tr1_0)object4;
                object6 = this.b;
                object7 = this.c;
                yT1 yT12 = this.e;
                Activity activity = this.f;
                object4 = object3;
                object3 = new bd_0((tr1_0)object5, (dr0_0)object6, (p83_0)object7, ft1_22, yT12, activity);
                object3 = v10.c(-487940406, (fx0_2)object3, (b30_0)object2);
                n3 = 56;
                L30.a((MB2)object, (Function2)object3, (b30_0)object2, n3);
                object2.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

