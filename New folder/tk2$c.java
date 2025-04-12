/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.util.Log
 */
import android.os.Build;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class tk2$c
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;

    public tk2$c() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tk2$c tk2$c = new qg3_2(2, f80_02);
        tk2$c.a = object;
        return tk2$c;
    }

    public final Object invoke(Object object, Object object2) {
        object = (rk2_0)object;
        object2 = (f80_0)object2;
        object = (tk2$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((tk2$c)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        boolean bl2;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (rk2_0)this.a;
        object2 = Build.ID;
        if (object2 != null && (bl2 = Log.isLoggable((String)(object2 = "Paging"), (int)(n3 = 2)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (bl2) {
            String string2 = "Sent ";
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append(object);
            object = ((StringBuilder)object2).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
        }
        return Unit.a;
    }
}

