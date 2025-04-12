/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.DashPathEffect
 */
import android.graphics.DashPathEffect;
import androidx.work.c$a$a;
import androidx.work.c$a$c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from b4
 */
public final class b4_0
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ b4_0(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (Kt0)object;
                Intrinsics.checkNotNullParameter(object2, "$this$drawBehind");
                long l2 = xx_1.K;
                float[] fArray = new float[]{7.5f, 7.5f};
                Object object3 = new DashPathEffect(fArray, 10.0f);
                li li2 = new li((DashPathEffect)object3);
                object3 = object;
                object = new re3_1(2.0f, 0.0f, 0, 0, li2, 14);
                Jt0.l((Kt0)object2, l2, 0L, 0L, 0L, (Qt0)object, 238);
                return Unit.a;
            }
            case 0: 
        }
        object = (Boolean)object;
        Intrinsics.checkNotNullParameter(object, "response");
        boolean bl2 = (Boolean)object;
        n3 = 0;
        Object[] objectArray = null;
        String string2 = "AdIdWorker";
        if (bl2) {
            object = yn3_0.a;
            ((yn3$a)object).l(string2);
            string2 = "Ad Id successful";
            objectArray = new Object[]{};
            ((yn3$a)object).a(string2, objectArray);
            object = new c$a$c();
        } else {
            object = yn3_0.a;
            ((yn3$a)object).l(string2);
            string2 = "Ad Id failed : response is false";
            objectArray = new Object[]{};
            ((yn3$a)object).d(string2, objectArray);
            object = new c$a$a();
        }
        return object;
    }
}

