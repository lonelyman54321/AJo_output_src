/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 *  android.view.View
 */
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.gson.JsonObject;
import com.ril.ajio.R$color;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.myaccount.order.imps.d;
import com.ril.ajio.services.data.Order.AjioCash;
import com.ril.ajio.services.data.Order.Moneys;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from if1
 */
public final class if1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ if1_2() {
        this.a = 1;
        this.b = "single page checkout";
    }

    public /* synthetic */ if1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        int n3 = 0;
        Object object2 = null;
        int n4 = 1;
        String string2 = "this$0";
        Object[] objectArray = this.b;
        int n7 = this.a;
        switch (n7) {
            default: {
                object = (DataCallback)object;
                objectArray = (hy3_0)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, string2);
                objectArray.k.k(object);
                return Unit.a;
            }
            case 1: {
                Iterator iterator = object;
                iterator = (dl2_2)object;
                Object[] objectArray2 = objectArray;
                objectArray2 = (String)objectArray;
                Intrinsics.checkNotNullParameter(objectArray2, "$screenName");
                Intrinsics.checkNotNullParameter(iterator, "getPETokenResp");
                object = (JsonObject)((dl2_2)((Object)iterator)).b;
                object2 = ((dl2_2)((Object)iterator)).a;
                n3 = ((cl2_2)object2).d();
                if (n3 != 0 && object != null) {
                    object2 = DataCallback.Companion;
                    return ((DataCallback$Companion)object2).onSuccess(object);
                }
                object2 = ApiErrorRepo.INSTANCE;
                String string3 = "PETokenRequest";
                boolean bl2 = true;
                String string4 = "Forward";
                return ((ApiErrorRepo)object2).handleApiError((dl2_2)((Object)iterator), string3, bl2, (String)objectArray2, string4);
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object object3 = d.Companion;
        objectArray = (d)objectArray;
        Intrinsics.checkNotNullParameter(objectArray, string2);
        cp$a cp$a = cp_1.Companion;
        int n8 = nn_2.b(cp$a, (DataCallback)object);
        if (n8 == 0) return Unit.a;
        n8 = objectArray.O;
        if (n8 != 0) return Unit.a;
        n8 = objectArray.P;
        if (n8 != 0) return Unit.a;
        AjioLoaderView ajioLoaderView = objectArray.y;
        if (ajioLoaderView != null) {
            ajioLoaderView.stopLoader();
        }
        if (object == null) return Unit.a;
        n8 = ((DataCallback)object).getStatus();
        if (n8 == 0) {
            if ((object = (AjioCash)((DataCallback)object).getData()) == null) return Unit.a;
            object = ((AjioCash)object).getMoney().iterator();
            while ((n8 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                AjioTextView ajioTextView;
                float f5;
                String string5;
                Moneys moneys = (Moneys)object.next();
                if (moneys == null || (n7 = (int)(kotlin.text.b.i((String)(object3 = moneys.getMoneyType()), string5 = "RCS_TRANSFERABLE", n4 != 0) ? 1 : 0)) == 0) continue;
                float f6 = objectArray.C;
                int n10 = -1082130432;
                float f7 = -1.0f;
                int n14 = 8;
                n7 = (int)(f6 == f7 ? 0 : (f6 < f7 ? -1 : 1));
                if (n7 == 0) {
                    View view;
                    AjioTextView ajioTextView2 = objectArray.s;
                    if (ajioTextView2 != null) {
                        ajioTextView2.setVisibility(n14);
                    }
                    if ((view = objectArray.z) == null) continue;
                    view.setVisibility(n14);
                    continue;
                }
                objectArray.B = f5 = moneys.getAmount();
                f6 = objectArray.C;
                n10 = -1;
                f7 = 0.0f / 0.0f;
                String string6 = "getString(...)";
                n8 = (int)(f5 == f6 ? 0 : (f5 < f6 ? -1 : 1));
                if (n8 <= 0) {
                    View view;
                    AjioTextView ajioTextView3 = objectArray.t;
                    if (ajioTextView3 != null) {
                        ajioTextView3.setVisibility(n14);
                    }
                    if ((view = objectArray.z) != null) {
                        view.setVisibility(0);
                    }
                    f5 = objectArray.C;
                    String string7 = qz2_0.x(Float.valueOf(f5));
                    n7 = R$string.transferable_cash;
                    object3 = objectArray.getString(n7);
                    Intrinsics.checkNotNullExpressionValue(object3, string6);
                    SpannableStringBuilder spannableStringBuilder = d.Sa(n10, string7, (String)object3);
                    object3 = objectArray.s;
                    if (object3 != null) {
                        object3.setText((CharSequence)spannableStringBuilder);
                    }
                    f5 = objectArray.B;
                    String string8 = qz2_0.x(Float.valueOf(f5));
                    n7 = R$string.ajio_cash_available;
                    object3 = objectArray.getString(n7);
                    Intrinsics.checkNotNullExpressionValue(object3, string6);
                    n10 = hv3_0.m(R$color.color_f55536);
                    SpannableStringBuilder spannableStringBuilder2 = d.Sa(n10, string8, (String)object3);
                    object3 = objectArray.r;
                    if (object3 != null) {
                        object3.setText((CharSequence)spannableStringBuilder2);
                    }
                    n8 = 0x3F000000;
                    f5 = 0.5f;
                    objectArray.Qa(f5, false);
                    continue;
                }
                View view = objectArray.z;
                if (view != null) {
                    view.setVisibility(n14);
                }
                if ((ajioTextView = objectArray.t) != null) {
                    ajioTextView.setVisibility(0);
                }
                f5 = objectArray.C;
                String string9 = qz2_0.x(Float.valueOf(f5));
                n7 = R$string.imps_amount;
                object3 = objectArray.getString(n7);
                Intrinsics.checkNotNullExpressionValue(object3, string6);
                SpannableStringBuilder spannableStringBuilder = d.Sa(n10, string9, (String)object3);
                object3 = objectArray.t;
                if (object3 != null) {
                    object3.setText((CharSequence)spannableStringBuilder);
                }
                n8 = 1065353216;
                f5 = 1.0f;
                objectArray.Qa(f5, n4 != 0);
            }
            return Unit.a;
        }
        int n15 = ((DataCallback)object).getStatus();
        if (n15 != n4) return Unit.a;
        ab0_0.Companion.getClass();
        object = StringCompanionObject.INSTANCE;
        n15 = R$string.acc_error_message;
        object = hv3_0.K(n15);
        n8 = R$string.something_wrong_msg;
        String string10 = hv3_0.K(n8);
        objectArray = new Object[n4];
        objectArray[0] = string10;
        object2 = "format(...)";
        object = xh2_0.a(objectArray, n4, (String)object, (String)object2);
        n3 = R$string.something_wrong_msg;
        mq0_2.a(n3, (String)object);
        return Unit.a;
    }
}

