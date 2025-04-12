/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.c$a$a;
import androidx.work.c$a$c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from L40
 */
public final class l40_0
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ l40_0(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        object = (Boolean)object;
        switch (n3) {
            default: {
                return Unit.a;
            }
            case 0: 
        }
        Intrinsics.checkNotNullParameter(object, "response");
        boolean bl2 = (Boolean)object;
        n3 = 0;
        Object[] objectArray = null;
        String string2 = "ConfigWorker";
        if (bl2) {
            object = yn3_0.a;
            ((yn3$a)object).l(string2);
            objectArray = new Object[]{};
            string2 = "Remote config fetch successful";
            ((yn3$a)object).a(string2, objectArray);
            object = new c$a$c();
        } else {
            object = yn3_0.a;
            ((yn3$a)object).l(string2);
            objectArray = new Object[]{};
            string2 = "Remote config fetch failed : response is false";
            ((yn3$a)object).d(string2, objectArray);
            object = new c$a$a();
        }
        return object;
    }
}

