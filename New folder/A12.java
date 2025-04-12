/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.data.Payment.PayNowRequest;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.Payment.UPI;
import com.ril.ajio.services.data.Payment.VerifyVpaResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.JsonElement;

public final class A12
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ A12(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                g g3 = (g)this.b;
                Intrinsics.checkNotNullParameter(g3, "this$0");
                Intrinsics.checkNotNullParameter(object, "verifyVpaDataCallback");
                Object object2 = cp_1.Companion;
                int n4 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n4 != 0) {
                    object2 = g3.c;
                    if (object2 != null) {
                        object2.h();
                    }
                    if ((n4 = ((DataCallback)object).getStatus()) == 0) {
                        boolean bl2;
                        if ((object = (VerifyVpaResponse)((DataCallback)object).getData()) != null) {
                            object = ((VerifyVpaResponse)object).getValid();
                            object2 = Boolean.TRUE;
                            bl2 = Intrinsics.areEqual(object, object2);
                        } else {
                            bl2 = false;
                            object = null;
                        }
                        if (bl2) {
                            object = g3.Va().I;
                            object2 = g3.Wa().E;
                            if (object2 != null) {
                                oo2_0 oo2_02 = oo2_0.a;
                                float f5 = g3.Wa().o;
                                Float f6 = Float.valueOf(f5);
                                oo2_02.getClass();
                                object2 = oo2_0.q((UPI)object, (TenantResponse)object2, f6);
                                g3.I2((UPI)object, (PayNowRequest)object2);
                            }
                        } else {
                            object = g3.c;
                            if (object != null) {
                                object.T6();
                            }
                        }
                    } else {
                        int n7 = ((DataCallback)object).getStatus();
                        if (n7 == (n4 = 1)) {
                            object = g3.Va().I;
                            object2 = g3.Wa().E;
                            if (object2 != null) {
                                oo2_0 oo2_03 = oo2_0.a;
                                float f7 = g3.Wa().o;
                                Float f8 = Float.valueOf(f7);
                                oo2_03.getClass();
                                object2 = oo2_0.q((UPI)object, (TenantResponse)object2, f8);
                                g3.I2((UPI)object, (PayNowRequest)object2);
                            }
                        }
                    }
                }
                return Unit.a;
            }
            case 1: {
                object = (JsonElement)object;
                Intrinsics.checkNotNullParameter(object, "it");
                ((Ref$ObjectRef)this.b).element = object;
                return Unit.a;
            }
            case 0: 
        }
        object = (dl2_2)object;
        return NewPlpRepo.k((Ref$ObjectRef)this.b, (dl2_2)object);
    }
}

