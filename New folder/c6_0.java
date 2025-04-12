/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.FeedbackRatingSnackbar;
import com.ril.ajio.customviews.FeedbackRatingSnackbar$Companion;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.ajiocash.AjioCashTransferStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from c6
 */
public final class c6_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c6_0() {
        this.a = 0;
        this.b = "AJIO_STATUS";
    }

    public /* synthetic */ c6_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (DataCallback)object;
                object3 = (hy3_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                zr1_1 object6 = ((hy3_0)object3).t;
                object6.k(object);
                int n7 = ((DataCallback)object).getStatus();
                if (n7 == 0) {
                    ((hy3_0)object3).n();
                }
                return Unit.a;
            }
            case 2: {
                object = (Boolean)object;
                boolean bl2 = (Boolean)object;
                object3 = (yn2_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                if (!bl2) {
                    object = FeedbackRatingSnackbar.Companion;
                    object2 = ((Fragment)object3).getView();
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type android.view.ViewGroup");
                    object2 = (ViewGroup)object2;
                    object = ((FeedbackRatingSnackbar$Companion)object).make((View)object2);
                    ((BaseTransientBottomBar)object).setDuration(-2);
                    ((BaseTransientBottomBar)object).show();
                    object2 = StringCompanionObject.INSTANCE;
                    object2 = hv3_0.K(R$string.acc_error_message);
                    int n8 = R$string.feedback_submission_failed;
                    object3 = hv3_0.K(n8);
                    Object[] objectArray = new Object[n3];
                    Object var10_18 = null;
                    objectArray[0] = object3;
                    String string2 = xh2_0.a(objectArray, n3, (String)object2, "format(...)");
                    object3 = Looper.getMainLooper();
                    object2 = new Handler((Looper)object3);
                    object3 = new rn2_0((FeedbackRatingSnackbar)object, string2);
                    long l2 = 100;
                    object2.postDelayed((Runnable)object3, l2);
                    string2 = ((BaseTransientBottomBar)object).getView();
                    int n10 = R$id.img_close;
                    string2 = (ImageView)string2.findViewById(n10);
                    object2 = new sn2_0((FeedbackRatingSnackbar)object);
                    string2.setOnClickListener((View.OnClickListener)object2);
                }
                return Unit.a;
            }
            case 1: {
                int n14;
                object = (DataCallback)object;
                Object object4 = qn_2.Companion;
                object3 = (qn_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object4 = cp_1.Companion;
                boolean bl3 = nn_2.b((cp$a)object4, (DataCallback)object);
                if (bl3 && (n14 = ((DataCallback)object).getStatus()) == 0) {
                    object = ((qn_2)object3).s;
                    object4 = ((qn_2)object3).Ra().f;
                    ((qN$b)((Object)object)).handleMessage((Message)object4);
                }
                return Unit.a;
            }
            case 0: 
        }
        object2 = object;
        object2 = (dl2_2)object;
        Object object5 = object3;
        object5 = (String)object3;
        Intrinsics.checkNotNullParameter(object5, "$screenName");
        Intrinsics.checkNotNullParameter(object2, "walletResp");
        object = (AjioCashTransferStatus)((dl2_2)object2).b;
        Object object6 = ((dl2_2)object2).a;
        boolean bl4 = ((cl2_2)object6).d();
        if (bl4 && object != null) {
            object6 = DataCallback.Companion;
            object = ((DataCallback$Companion)object6).onSuccess(object);
        } else {
            object6 = ApiErrorRepo.INSTANCE;
            object3 = "ajioCashWalletToBankTransferStatus";
            boolean bl5 = true;
            String string3 = "Forward";
            object = ((ApiErrorRepo)object6).handleApiError((dl2_2)object2, (String)object3, bl5, (String)object5, string3);
        }
        return object;
    }
}

