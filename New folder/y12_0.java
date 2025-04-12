/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.payment.fragment.i$b;
import com.ril.ajio.payment.fragment.i$b$a;
import com.ril.ajio.payment.fragment.i$b$b;
import com.ril.ajio.services.data.Payment.PayNowRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from y12
 */
public final class y12_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y12_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl2;
                object = (i$b)object;
                g g3 = (g)this.b;
                Intrinsics.checkNotNullParameter(g3, "this$0");
                Intrinsics.checkNotNullParameter(object, "it");
                FragmentActivity fragmentActivity = g3.getActivity();
                if (fragmentActivity != null && !(bl2 = (fragmentActivity = g3.requireActivity()).isFinishing())) {
                    fragmentActivity = g3.requireActivity();
                    fragmentActivity.onBackPressed();
                }
                bl2 = object instanceof i$b$b;
                PayNowRequest payNowRequest = (PayNowRequest)this.c;
                if (bl2) {
                    g3.Pa(payNowRequest, false);
                } else {
                    boolean bl3 = object instanceof i$b$a;
                    if (bl3) {
                        bl3 = true;
                        g3.Pa(payNowRequest, bl3);
                    } else {
                        g3.Pa(payNowRequest, false);
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef)this.c;
        object = (dl2_2)object;
        return NewPlpRepo.c((Ref$ObjectRef)this.b, ref$ObjectRef, (dl2_2)object);
    }
}

