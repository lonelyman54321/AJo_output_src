/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oC
 */
public final class oc_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oc_1(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Throwable)object;
                Object object2 = (ps_0)this.b;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                yn3_0.a.e((Throwable)object);
                object = ((ps_0)object2).f;
                Object object3 = DataCallback.Companion;
                object2 = (CartOrder)this.c;
                object3 = ((DataCallback$Companion)object3).onSuccess(object2);
                ((LiveData)object).k(object3);
                return Unit.a;
            }
            case 0: 
        }
        object = (zp1)object;
        Object object4 = (Configuration)this.b;
        Intrinsics.checkNotNullParameter(object4, "$configuration");
        dr0_0 dr0_02 = (dr0_0)this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        String string2 = "it";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = az3_0.a((zp1)object, object4);
        if (!bl2) {
            object = dr0_02.D0;
            object4 = Boolean.TRUE;
            ((h83_0)object).setValue(object4);
        } else {
            object = dr0_02.D0;
            object4 = Boolean.FALSE;
            ((h83_0)object).setValue(object4);
        }
        return Unit.a;
    }
}

