/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.gson.Gson;
import com.ril.ajio.bonanza.model.ICoupon;
import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfoRequest;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tt
 */
public final class tt_2
implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ob0_1 b;
    public final /* synthetic */ i90_0 c;

    public /* synthetic */ tt_2(boolean bl2, ob0_1 ob0_12, c80 c802) {
        this.a = bl2;
        this.b = ob0_12;
        this.c = c802;
    }

    public final Object invoke() {
        ob0_1 ob0_12 = this.b;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        i90_0 i90_02 = this.c;
        String string2 = "$coroutineScope";
        Intrinsics.checkNotNullParameter(i90_02, string2);
        int n3 = 3;
        int n4 = this.a;
        if (n4 != 0) {
            Object object;
            int n7;
            Object object2 = Boolean.FALSE;
            ob0_12.i.setValue(object2);
            object2 = new ArrayList();
            Object object3 = ((Iterable)ob0_12.f.getValue()).iterator();
            while ((n7 = object3.hasNext()) != 0) {
                object = ((ICoupon)object3.next()).getOfferId();
                if (object == null) continue;
                n7 = object.intValue();
                object = n7;
                ((ArrayList)object2).add(object);
            }
            String string3 = ob0_12.o();
            String string4 = String.valueOf(50);
            String string5 = ob0_12.n();
            object3 = new Gson();
            n7 = 0;
            object = new Integer[]{};
            object2 = ((ArrayList)object2).toArray((T[])object);
            String string6 = ((Gson)object3).toJson(object2);
            String string7 = "";
            String string8 = ob0_12.C;
            Object object4 = object2;
            object2 = new CouponBonanzaInfoRequest(string3, string7, 0, string4, string8, string6, string5);
            Intrinsics.checkNotNullParameter(object2, "couponInfoRequest");
            boolean bl2 = true;
            ob0_12.w(bl2);
            object3 = md3_0.c(ob0_12);
            object = new yb0_2(ob0_12);
            object4 = new zb0_1(ob0_12, (CouponBonanzaInfoRequest)object2, null);
            n4 = 2;
            Ae3.d((i90_0)object3, (CoroutineContext)object, null, (Function2)object4, n4);
            object2 = new vt_2(ob0_12, null);
            Ae3.d(i90_02, null, null, (Function2)object2, n3);
        } else {
            Serializable serializable = Boolean.TRUE;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = ob0_12.i;
            parcelableSnapshotMutableState.setValue(serializable);
            serializable = new wt_2(ob0_12, null);
            Ae3.d(i90_02, null, null, (Function2)((Object)serializable), n3);
        }
        return Unit.a;
    }
}

