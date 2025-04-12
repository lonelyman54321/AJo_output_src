/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
import android.os.Handler;
import android.os.Looper;
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
import com.ril.ajio.payment.fragment.d;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import com.ril.ajio.services.utils.JsonUtils;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from K9
 */
public final class k9_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k9_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        Object[] objectArray = null;
        Object object2 = "this$0";
        int n4 = 1;
        Object object3 = this.b;
        int n7 = this.a;
        switch (n7) {
            default: {
                object = (uu_1)object;
                Intrinsics.checkNotNullParameter(object, "$this$buildClassSerialDescriptor");
                object3 = (ys3_0)object3;
                objectArray = ((ys3_0)object3).a.getDescriptor();
                uu_1.a((uu_1)object, "first", (SerialDescriptor)objectArray);
                objectArray = ((ys3_0)object3).b.getDescriptor();
                uu_1.a((uu_1)object, "second", (SerialDescriptor)objectArray);
                objectArray = ((ys3_0)object3).c.getDescriptor();
                uu_1.a((uu_1)object, "third", (SerialDescriptor)objectArray);
                return Unit.a;
            }
            case 4: {
                object = (rz2_0)object;
                object3 = (g)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = ((rz2_0)object).b;
                Object object4 = cp_1.Companion;
                n7 = (int)(nn_2.b((cp$a)object4, (DataCallback)object2) ? 1 : 0);
                if (n7 != 0) {
                    float f5;
                    Object object5;
                    object4 = ((g)object3).c;
                    if (object4 != null) {
                        object4.h();
                    }
                    if ((object4 = (PriceValidation)((DataCallback)object2).getData()) != null && (object4 = ((PriceValidation)object4).getPriceSplitup()) != null) {
                        object5 = ((g)object3).Wa();
                        if ((object4 = ((PriceSplitUp)object4).getNetPayableAmount()) != null) {
                            f5 = ((Float)object4).floatValue();
                        } else {
                            n7 = 0;
                            f5 = 0.0f;
                            object4 = null;
                        }
                        ((kj2_1)object5).o = f5;
                    }
                    if ((n7 = ((DataCallback)object2).getStatus()) == 0) {
                        object4 = (PriceValidation)((DataCallback)object2).getData();
                        int n8 = 0;
                        object5 = null;
                        if (object4 != null && (object4 = ((PriceValidation)object4).getError()) != null) {
                            object4 = ((Error)object4).getCode();
                        } else {
                            n7 = 0;
                            object4 = null;
                            f5 = 0.0f;
                        }
                        if (object4 != null && (n7 = ((String)object4).length()) != 0) {
                            object = ((g)object3).Va();
                            object4 = (PriceValidation)((DataCallback)object2).getData();
                            if (object4 != null) {
                                object4 = ((PriceValidation)object4).getError();
                            } else {
                                n7 = 0;
                                object4 = null;
                                f5 = 0.0f;
                            }
                            TenantResponse tenantResponse = ((g)object3).Wa().E;
                            kj2_1 kj2_12 = ((g)object3).Wa();
                            float f6 = kj2_12.o;
                            ((op2_2)object).b((Error)object4, tenantResponse, f6);
                            object = (PriceValidation)((DataCallback)object2).getData();
                            if (object != null) {
                                object5 = ((PriceValidation)object).getError();
                            }
                            object = JsonUtils.toJson(object5);
                            object2 = ((g)object3).Wa();
                            n8 = 9;
                            object4 = new hj2_0((String)object, n8, false, n4 != 0);
                            ((kj2_1)object2).c((hj2_0)object4);
                            ((g)object3).eb();
                        } else {
                            objectArray = (PriceValidation)((DataCallback)object2).getData();
                            object = ((rz2_0)object).a;
                            ((g)object3).cb((PriceValidation)objectArray, (hj_1)((Object)object), n4 != 0);
                        }
                    } else {
                        ((g)object3).eb();
                    }
                }
                ((g)object3).Qa();
                return Unit.a;
            }
            case 3: {
                object = (DataCallback)object;
                object3 = (d)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = cp_1.Companion;
                int n10 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n10 != 0) {
                    n10 = ((DataCallback)object).getStatus();
                    if (n10 == 0) {
                        ((d)object3).Sa();
                    } else {
                        int n14 = ((DataCallback)object).getStatus();
                        if (n14 == n4) {
                            object = yn3_0.a;
                            objectArray = new Object[]{};
                            object2 = "LP resend OTP failure";
                            ((yn3$a)object).d((String)object2, objectArray);
                        }
                    }
                }
                return Unit.a;
            }
            case 2: {
                object = (UY2)object;
                object3 = (CMSNavigation)object3;
                Intrinsics.checkNotNullParameter(object3, "$item");
                Intrinsics.checkNotNullParameter(object, "$this$semantics");
                objectArray = ((CMSNavigation)object3).getName();
                if (objectArray == null || (n3 = objectArray.length()) == 0) {
                    RY2.d((UY2)object);
                }
                return Unit.a;
            }
            case 1: {
                object = (Boolean)object;
                boolean bl2 = (Boolean)object;
                object3 = (i71_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                if (!bl2) {
                    object = FeedbackRatingSnackbar.Companion;
                    object2 = ((Fragment)object3).getView();
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type android.view.ViewGroup");
                    object2 = (ViewGroup)object2;
                    object = ((FeedbackRatingSnackbar$Companion)object).make((View)object2);
                    ((BaseTransientBottomBar)object).setDuration(-2);
                    object2 = StringCompanionObject.INSTANCE;
                    object2 = hv3_0.K(R$string.acc_error_message);
                    int n15 = R$string.feedback_submission_failed;
                    object3 = hv3_0.K(n15);
                    Object[] objectArray2 = new Object[n4];
                    objectArray2[0] = object3;
                    objectArray = xh2_0.a(objectArray2, n4, (String)object2, "format(...)");
                    object3 = Looper.getMainLooper();
                    object2 = new Handler((Looper)object3);
                    object3 = new mn_0(object, (Serializable)objectArray, n4);
                    long l2 = 100;
                    object2.postDelayed((Runnable)object3, l2);
                    ((BaseTransientBottomBar)object).show();
                    objectArray = ((BaseTransientBottomBar)object).getView();
                    int n16 = R$id.img_close;
                    objectArray = (ImageView)objectArray.findViewById(n16);
                    object2 = new G71((FeedbackRatingSnackbar)object);
                    objectArray.setOnClickListener((View.OnClickListener)object2);
                }
                return Unit.a;
            }
            case 0: 
        }
        object2 = object;
        object2 = (dl2_2)object;
        Object object6 = object3;
        object6 = (String)object3;
        Intrinsics.checkNotNullParameter(object6, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "response");
        object = (RecentlyViewedProducts)((dl2_2)object2).b;
        objectArray = ((dl2_2)object2).a;
        n3 = (int)(objectArray.d() ? 1 : 0);
        if (n3 != 0 && object != null) {
            objectArray = DataCallback.Companion;
            object = objectArray.onSuccess(object);
        } else {
            objectArray = ApiErrorRepo.INSTANCE;
            int n17 = 24;
            float f7 = 0.0f;
            Object var13_19 = null;
            boolean bl3 = false;
            object3 = null;
            n7 = 0;
            float f8 = 0.0f;
            Object var8_10 = null;
            boolean bl4 = false;
            Object var9_12 = null;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)objectArray, (dl2_2)object2, (String)object6, false, null, null, n17, null);
        }
        return object;
    }
}

