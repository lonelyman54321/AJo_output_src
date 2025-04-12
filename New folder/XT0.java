/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.platform.AndroidComposeView$h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class XT0 {
    public final Function1 a;
    public final Function0 b;
    public final pr1_1 c;
    public final pr1_1 d;
    public final pr1_1 e;
    public final pr1_1 f;

    public XT0(AndroidComposeView$h object, du0_1 du0_12) {
        this.a = object;
        this.b = du0_12;
        this.c = object = gt2_1.a();
        this.d = object = gt2_1.a();
        this.e = object = gt2_1.a();
        this.f = object = gt2_1.a();
    }

    public final boolean a() {
        pr1_1 pr1_12 = this.c;
        boolean bl2 = pr1_12.c();
        if (!(bl2 || (bl2 = (pr1_12 = this.e).c()) || (bl2 = (pr1_12 = this.d).c()))) {
            bl2 = false;
            pr1_12 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final void b(pr1_1 object, Object object2) {
        boolean n3 = ((pr1_1)object).d(object2);
        if (n3) {
            object = this.c;
            int n4 = ((ft2_0)object).d;
            int n7 = this.d.d;
            int n8 = n4 + n7;
            object2 = this.e;
            n7 = ((ft2_0)object2).d;
            int n10 = n8 + n7;
            if (n10 == (n7 = 1)) {
                String string2 = "invalidateNodes()V";
                Class<XT0> clazz = XT0.class;
                String string3 = "invalidateNodes";
                object = new FunctionReferenceImpl(0, this, clazz, string3, string2, 0);
                object2 = this.a;
                object2.invoke(object);
            }
        }
    }
}

