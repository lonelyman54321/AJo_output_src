/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.Toast
 */
import android.content.Context;
import android.widget.Toast;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Z3
 */
public final class z3_0
extends FunctionReferenceImpl
implements Function1 {
    public final Object invoke(Object object) {
        object = (Throwable)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        Object object2 = (a4_0)this.receiver;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, "throwable");
        Object object3 = yn3_0.a;
        ((yn3$a)object3).e((Throwable)object);
        Object object4 = "qa";
        Object[] objectArray = "prod";
        if (objectArray == object4 || objectArray == (object4 = "qaregression")) {
            AJIOApplication.Companion.getClass();
            object4 = AJIOApplication$a.a();
            objectArray = String.valueOf(object);
            int n3 = 1;
            Toast.makeText((Context)object4, (CharSequence)objectArray, (int)n3).show();
            ((yn3$a)object3).l("AdIdWorker");
            object4 = String.valueOf(object);
            objectArray = new Object[]{};
            ((yn3$a)object3).a((String)object4, objectArray);
        }
        if ((object2 = ((a4_0)object2).c) != null) {
            object = String.valueOf(object);
            object3 = new Exception((String)object);
            object2 = (H53$a)object2;
            ((H53$a)object2).b((Throwable)object3);
        }
        return Unit.a;
    }
}

