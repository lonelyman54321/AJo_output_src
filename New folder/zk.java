/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.animation.a;
import androidx.compose.ui.layout.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class zk
extends Lambda
implements Function2 {
    public final /* synthetic */ gr3 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Hk f;
    public final /* synthetic */ p83_0 g;
    public final /* synthetic */ hx0_2 h;

    public zk(gr3 gr32, Object object, Function1 function1, Hk hk, p83_0 p83_02, u10 u102) {
        this.c = gr32;
        this.d = object;
        this.e = function1;
        this.f = hk;
        this.g = p83_02;
        this.h = u102;
        super(2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
            return Unit.a;
        }
        object = object3.v();
        object2 = b30$a.a;
        Object object4 = this.e;
        Object object5 = this.f;
        if (object == object2) {
            object = (j70_0)object4.invoke(object5);
            object3.o(object);
        }
        object = (j70_0)object;
        Object object6 = this.c;
        Object object7 = ((gr3)object6).f().a();
        Object object8 = this.d;
        boolean bl2 = Intrinsics.areEqual(object7, object8);
        bl2 = object3.a(bl2);
        Object object9 = object3.v();
        if (bl2 || object9 == object2) {
            object7 = ((gr3)object6).f().a();
            bl2 = Intrinsics.areEqual(object7, object8);
            object4 = bl2 ? JE0.a : ((j70_0)object4.invoke((Object)object5)).b;
            object9 = object4;
            object3.o(object4);
        }
        object9 = (JE0)object9;
        object4 = object3.v();
        object6 = ((gr3)object6).d;
        if (object4 == object2) {
            object7 = ((h83_0)object6).getValue();
            bl2 = Intrinsics.areEqual(object8, object7);
            object4 = new Hk$a(bl2);
            object3.o(object4);
        }
        object4 = (Hk$a)object4;
        object7 = ((j70_0)object).a;
        Object object10 = LP1$a.b;
        int n7 = object3.x(object);
        Object object11 = object3.v();
        if (n7 != 0 || object11 == object2) {
            object11 = new tk_1((j70_0)object);
            object3.o(object11);
        }
        object11 = (gx0_2)object11;
        object = b.a((LP1)object10, (gx0_2)object11);
        object6 = ((h83_0)object6).getValue();
        boolean bl3 = Intrinsics.areEqual(object8, object6);
        object10 = ((Hk$a)object4).b;
        object6 = bl3;
        ((h83_0)object10).setValue(object6);
        object6 = object.then((LP1)object4);
        n4 = (int)(object3.x(object8) ? 1 : 0);
        object4 = object3.v();
        if (n4 != 0 || object4 == object2) {
            object4 = new uk_1(object8);
            object3.o(object4);
        }
        object = object4;
        object = (Function1)object4;
        boolean bl4 = object3.J(object9);
        object10 = object3.v();
        if (bl4 || object10 == object2) {
            object10 = new vk_1((JE0)object9);
            object3.o(object10);
        }
        object2 = object10;
        object2 = (Function2)object10;
        object10 = (u10)this.h;
        p83_0 p83_02 = this.g;
        object4 = new yk_1(p83_02, object8, (Hk)object5, (u10)object10);
        int n8 = -616195562;
        object10 = v10.c(n8, (fx0_2)object4, (b30_0)object3);
        object4 = this.c;
        n7 = 0xC00000;
        object5 = object;
        object8 = object9;
        object9 = object2;
        a.a((gr3)object4, (Function1)object, (LP1)object6, (yA0)object7, (JE0)object8, (Function2)object2, (u10)object10, (b30_0)object3, n7);
        return Unit.a;
    }
}

