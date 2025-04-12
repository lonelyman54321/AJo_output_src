/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ob0$a
 */
public final class ob0$a_0
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Function0 i;

    public ob0$a_0(String string2, int n3, String string3, String string4, Function0 function0, String string5, Function0 function02, String string6, Function0 function03) {
        this.a = string2;
        this.b = n3;
        this.c = string3;
        this.d = string4;
        this.e = function0;
        this.f = string5;
        this.g = function02;
        this.h = string6;
        this.i = function03;
    }

    public final Object invoke(Object object, Object object2) {
        block8: {
            block7: {
                float f5;
                int n3;
                int n4;
                block6: {
                    object = (b30_0)object;
                    object2 = (Number)object2;
                    n4 = ((Number)object2).intValue() & 0xB;
                    n3 = 2;
                    f5 = 2.8E-45f;
                    if (n4 != n3 || (n4 = (int)(object.h() ? 1 : 0)) == 0) break block6;
                    object.D();
                    break block7;
                }
                object2 = LP1$a.b;
                n3 = 1065353216;
                f5 = 1.0f;
                Object object3 = j.c((LP1)object2, f5);
                n4 = 10;
                float f6 = n4;
                int n7 = 13;
                object2 = androidx.compose.foundation.layout.h.i((LP1)object3, 0.0f, f6, 0.0f, 0.0f, n7);
                Object object4 = zp.c;
                object3 = Nc$a.m;
                String string2 = null;
                object4 = oZ.a((zp$l)object4, (Gx$a)object3, (b30_0)object, 0);
                int n8 = object.F();
                Object object5 = object.m();
                object2 = a30_0.c((b30_0)object, (LP1)object2);
                N20.W.getClass();
                Object object6 = N20$a.b;
                Object object7 = object.i();
                boolean bl2 = object7 instanceof mp;
                if (!bl2) break block8;
                object.A();
                bl2 = object.e();
                if (bl2) {
                    object.C((Function0)object6);
                } else {
                    object.n();
                }
                object6 = N20$a.e;
                Ow3.a((b30_0)object, object4, (Function2)object6);
                object4 = N20$a.d;
                Ow3.a((b30_0)object, object5, (Function2)object4);
                object4 = N20$a.f;
                boolean bl3 = object.e();
                if (bl3 || !(bl3 = Intrinsics.areEqual(object5 = object.v(), object6 = Integer.valueOf(n8)))) {
                    re0_0.a(n8, (b30_0)object, n8, (N20$a$a)object4);
                }
                object4 = N20$a.c;
                Ow3.a((b30_0)object, object2, (Function2)object4);
                object2 = this.a;
                n3 = this.b;
                ob0_0.d((String)object2, n3, (b30_0)object, 0);
                object2 = this.c;
                ob0_0.c((String)object2, (b30_0)object, 0);
                object5 = this.g;
                object4 = this.d;
                object3 = this.e;
                string2 = this.f;
                object6 = this.h;
                object7 = this.i;
                ob0_0.b((String)object4, (Function0)object3, string2, (Function0)object5, (String)object6, (Function0)object7, (b30_0)object, 0);
                object.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

