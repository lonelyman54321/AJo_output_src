/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Va1$b
extends qg3_2
implements gx0_2 {
    public /* synthetic */ db1_2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Charset d;

    public Va1$b(String string2, Charset charset, f80_0 f80_02) {
        this.c = string2;
        this.d = charset;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (db1_2)object;
        object3 = (f80_0)object3;
        String string2 = this.c;
        Charset charset = this.d;
        Va1$b va1$b = new Va1$b(string2, charset, (f80_0)object3);
        va1$b.a = object;
        va1$b.b = object2;
        object = Unit.a;
        return va1$b.invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        String string2;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = this.b;
        Object object3 = va1_0.a;
        object3 = ((db1_2)object).c;
        Object object4 = ja1_1.a;
        object4 = "Accept-Charset";
        object3 = ((xe3_2)object3).e((String)object4);
        eu3_0 eu3_02 = ((db1_2)object).a;
        if (object3 == null) {
            object3 = new StringBuilder("Adding Accept-Charset=");
            string2 = this.c;
            ((StringBuilder)object3).append(string2);
            ((StringBuilder)object3).append(" to ");
            ((StringBuilder)object3).append(eu3_02);
            object3 = ((StringBuilder)object3).toString();
            va1_0.a.g((String)object3);
            object3 = ((db1_2)object).c;
            object3.getClass();
            Intrinsics.checkNotNullParameter(object4, "name");
            String string3 = "value";
            Intrinsics.checkNotNullParameter(string2, string3);
            ((p41_0)object3).h(string2);
            object3 = ((xe3_2)object3).d((String)object4);
            object3.clear();
            object3.add(string2);
        }
        boolean bl2 = object2 instanceof String;
        object4 = null;
        if (!bl2) {
            return null;
        }
        if ((object = oa1_0.c((na1_0)object)) != null && !(bl2 = Intrinsics.areEqual(string2 = ((k70_0)object).c, object3 = k70$d.a.c))) {
            return null;
        }
        object2 = (String)object2;
        object3 = object == null ? k70$d.a : object;
        if (object == null || (object = m70_0.a((b41_0)object)) == null) {
            object = this.d;
        }
        object4 = new StringBuilder("Sending request body to ");
        ((StringBuilder)object4).append(eu3_02);
        ((StringBuilder)object4).append(" as text/plain with charset ");
        ((StringBuilder)object4).append(object);
        object4 = ((StringBuilder)object4).toString();
        va1_0.a.g((String)object4);
        Intrinsics.checkNotNullParameter(object3, "<this>");
        Intrinsics.checkNotNullParameter(object, "charset");
        object = os_2.b((Charset)object);
        object = ((k70_0)object3).c((String)object);
        object4 = new hj3_1((String)object2, (k70_0)object);
        return object4;
    }
}

