/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.EddResult;
import com.ril.ajio.services.data.Product.FraudEngineEddResponse;
import com.ril.ajio.services.data.Product.Status;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class e12$a$b
extends qg3_2
implements Function2 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ e12_0 d;
    public final /* synthetic */ String e;

    public e12$a$b(Ref$ObjectRef ref$ObjectRef, boolean bl2, Ref$ObjectRef ref$ObjectRef2, e12_0 e12_02, String string2, f80_0 f80_02) {
        this.a = ref$ObjectRef;
        this.b = bl2;
        this.c = ref$ObjectRef2;
        this.d = e12_02;
        this.e = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        e12_0 e12_02 = this.d;
        String string2 = this.e;
        Ref$ObjectRef ref$ObjectRef = this.a;
        boolean bl2 = this.b;
        Ref$ObjectRef ref$ObjectRef2 = this.c;
        object = new e12$a$b(ref$ObjectRef, bl2, ref$ObjectRef2, e12_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (e12$a$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((e12$a$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        Object object2;
        boolean bl2;
        Object object3 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object3 = (EddResult)((Ref$ObjectRef)object).element;
        if (object3 != null) {
            bl2 = this.b;
            ((EddResult)object3).setFirstTimeCalled(bl2);
        }
        object3 = (EddResult)((Ref$ObjectRef)object).element;
        Ref$ObjectRef ref$ObjectRef = this.c;
        if (object3 != null) {
            object2 = (FraudEngineEddResponse)ref$ObjectRef.element;
            ((EddResult)object3).setFraudEngineResponse((FraudEngineEddResponse)object2);
        }
        object = ((Ref$ObjectRef)object).element;
        Intrinsics.checkNotNull(object);
        Object object4 = object;
        object4 = (EddResult)object;
        object = this.d;
        ((e12_0)object).c((EddResult)object4);
        object3 = ref$ObjectRef.element;
        if (object3 != null && ((object3 = ((EddResult)object4).getStatus()) == null || (n3 = ((Status)(object3 = ((EddResult)object4).getStatus())).getStatusCode()) != 0)) {
            object3 = this.e;
            ((EddResult)object4).setPinCode((String)object3);
            object3 = new Status();
            ((EddResult)object4).setStatus((Status)object3);
            object3 = ((EddResult)object4).getStatus();
            bl2 = false;
            ref$ObjectRef = null;
            ((Status)object3).setStatusCode(0);
        }
        object = ((e12_0)object).P0;
        object2 = object3;
        object3 = new DataCallback(0, object4, null, null, 12, null);
        ((LiveData)object).k(object3);
        return Unit.a;
    }
}

