/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.user.GPSResponse;
import com.ril.ajio.services.data.user.LocationResponse;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZL
 */
public final class zl_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zl_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        int n3;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (Throwable)object;
                w23_0 w23_02 = (w23_0)this.b;
                Intrinsics.checkNotNullParameter(w23_02, "this$0");
                Object object2 = yn3_0.a;
                StringBuilder stringBuilder = new StringBuilder("SharedWithMeViewModel prepareSharedWithMe: throwable: ");
                stringBuilder.append(object);
                String string2 = stringBuilder.toString();
                Object[] objectArray = new Object[]{};
                ((yn3$a)object2).d(string2, objectArray);
                ((yn3$a)object2).e((Throwable)object);
                object2 = new DataError();
                boolean bl2 = object instanceof NullPointerException;
                String string3 = "Unable to fetch the shared closet.";
                if (bl2) {
                    object = new DataError$ErrorMessage();
                    ((DataError$ErrorMessage)object).setMessage(string3);
                } else {
                    object = new DataError$ErrorMessage();
                    ((DataError$ErrorMessage)object).setMessage(string3);
                }
                ((DataError)object2).errors = object = kotlin.collections.a.b(object);
                object = w23_02.f;
                object2 = DataCallback.Companion.onFailed((DataError)object2);
                ((LiveData)object).k(object2);
                return Unit.a;
            }
            case 3: {
                object = (pq$a$d)object;
                tr1_0 tr1_02 = (tr1_0)this.b;
                Intrinsics.checkNotNullParameter(tr1_02, "$showShimmer");
                Intrinsics.checkNotNullParameter(object, "it");
                object = Boolean.FALSE;
                tr1_02.setValue(object);
                return Unit.a;
            }
            case 2: {
                object = (DataCallback)object;
                wx1_1 wx1_12 = (wx1_1)this.b;
                Intrinsics.checkNotNullParameter(wx1_12, "this$0");
                wx1_12.B.k(object);
                return Unit.a;
            }
            case 1: {
                object = (Integer)object;
                lw0_1 lw0_12 = (lw0_1)this.b;
                Intrinsics.checkNotNullParameter(lw0_12, "this$0");
                object.getClass();
                lw0_12.getClass();
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        lm_2 lm_22 = (lm_2)this.b;
        Intrinsics.checkNotNullParameter(lm_22, "this$0");
        Object object3 = cp_1.Companion;
        int n7 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n7 == 0) return Unit.a;
        n7 = ((DataCallback)object).getStatus();
        Object var5_13 = null;
        if (n7 == 0) {
            object3 = (LocationResponse)((DataCallback)object).getData();
            if (object3 != null) {
                object3 = ((LocationResponse)object3).getData();
            } else {
                n7 = 0;
                object3 = null;
            }
            if (object3 != null) {
                object3 = lm_22.X;
                if ((object = (LocationResponse)((DataCallback)object).getData()) == null || (object = ((LocationResponse)object).getData()) == null || (object = ((GPSResponse)object).getPincodeGroup()) == null) {
                    object = "";
                }
                ((jo_2)object3).z((String)object);
                lm_22.Oa();
                return Unit.a;
            }
        }
        if ((object = (LocationResponse)((DataCallback)object).getData()) != null) {
            object = ((LocationResponse)object).getData();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) return Unit.a;
        n3 = R$string.ajio_something_went_wrong;
        object = lm_22.getString(n3);
        object3 = "getString(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        n7 = 1;
        hv3_0.o0(n7, (String)object, null);
        lm_22.dismissAllowingStateLoss();
        return Unit.a;
    }
}

