/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.data.repo.DataCallback;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class V8
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ V8(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3;
        long l2;
        Object object2 = this.b;
        Object object3 = "this$0";
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (DataCallback)object;
                object2 = (op2_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                ((op2_2)object2).i.k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (Long)object;
        Object object4 = q9_0.Companion;
        object2 = (q9_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = ((q9_0)object2).h1;
        if (object3 != null) {
            object4 = eb_2.a;
            Intrinsics.checkNotNull(object);
            l2 = (Long)object;
            object4 = eb_2.a(l2);
            object3.setText((CharSequence)object4);
        }
        object3 = h40_0.a;
        object3 = "autoDismissDuration";
        Intrinsics.checkNotNullParameter(object3, "key");
        object4 = h40_0.z();
        boolean bl2 = object4.has((String)object3);
        if (bl2) {
            n3 = object4.getInt((String)object3);
        } else {
            n3 = 0;
            object3 = null;
        }
        object4 = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNull(object);
        long l3 = (Long)object;
        l2 = ((TimeUnit)((Object)object4)).toSeconds(l3);
        int n7 = (int)l2;
        if (n3 == n7 && (n7 = (int)(h40_0.A() ? 1 : 0)) != 0) {
            ((q9_0)object2).Db();
            object = ((q9_0)object2).b1;
            if (object != null) {
                ai0_2.i((View)object);
            }
        }
        return Unit.a;
    }
}

