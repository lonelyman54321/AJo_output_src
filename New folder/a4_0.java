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
import io.reactivex.Scheduler;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from a4
 */
public final class a4_0
implements v53_0 {
    public final jo_2 a;
    public final Ko b;
    public l53_0 c;

    public a4_0() {
        sw_0 sw_02;
        AJIOApplication.Companion.getClass();
        AJIOApplication$a.a();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        this.a = sw_02 = new jo_2((Context)aJIOApplication);
        aJIOApplication = AJIOApplication$a.a();
        super((Context)aJIOApplication);
        this.b = sw_02;
    }

    public final h53_0 a() {
        String string2 = "prod";
        Object object = "qa";
        if (string2 == object || string2 == (object = "qaregression")) {
            int n3;
            object = cp_1.Companion;
            boolean bl2 = km_1.b((cp$a)object);
            string2 = "Fetching adId...";
            if (!bl2) {
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a();
                n3 = 1;
                object = Toast.makeText((Context)object, (CharSequence)string2, (int)n3);
                object.show();
            }
            object = yn3_0.a;
            ((yn3$a)object).l("AdIdWorker");
            n3 = 0;
            Object[] objectArray = new Object[]{};
            ((yn3$a)object).a(string2, objectArray);
        }
        object = g53_0.b(this);
        Intrinsics.checkNotNullExpressionValue(object, "create(...)");
        return object;
    }

    public final void b(H53$a h53$a) {
        FunctionReferenceImpl functionReferenceImpl;
        Intrinsics.checkNotNullParameter(h53$a, "emitter");
        this.c = h53$a;
        Object object = new Object();
        Object object2 = new o53_0((Callable)object);
        object = ti_2.a();
        object = ((g53_0)object2).e((Scheduler)object);
        object2 = functionReferenceImpl;
        functionReferenceImpl = new FunctionReferenceImpl(1, this, a4_0.class, "onSuccess", "onSuccess(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;)V", 0);
        v3_0 v3_02 = new v3_0((Function1)((Object)functionReferenceImpl));
        object2 = functionReferenceImpl;
        functionReferenceImpl = new FunctionReferenceImpl(1, this, a4_0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        object2 = new w3_0(functionReferenceImpl, 0);
        ((g53_0)object).f(v3_02, (o60_0)object2);
    }
}

