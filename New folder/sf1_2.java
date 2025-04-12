/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.animation.Animation
 *  android.view.animation.TranslateAnimation
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$integer;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.e;
import com.ril.ajio.payment.fragment.f;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from sf1
 */
public final class sf1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sf1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = null;
        Object object3 = this.b;
        Object object4 = "this$0";
        int n3 = 1;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (DataCallback)object;
                object3 = (hy3_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                ((hy3_0)object3).j.k(object);
                return Unit.a;
            }
            case 2: {
                object = (DataCallback)object;
                object3 = (f)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                Intrinsics.checkNotNullParameter(object, "responseData");
                object4 = cp_1.Companion;
                int n7 = nn_2.b((cp$a)object4, (DataCallback)object);
                if (n7 != 0) {
                    object4 = ((f)object3).o;
                    if (object4 != null) {
                        ((AjioLoaderView)((Object)object4)).stopLoader();
                    }
                    n7 = ((DataCallback)object).getStatus();
                    n4 = 0;
                    float f5 = 0.0f;
                    Object object5 = null;
                    if (n7 == 0) {
                        int n8;
                        object = ((f)object3).s;
                        if (object != null && (n8 = ((Fragment)object).isVisible()) == n3) {
                            object = ((f)object3).s;
                            if (object != null) {
                                object4 = ((e)object).a;
                                if (object4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("frNps");
                                    n7 = 0;
                                    object4 = null;
                                }
                                ai0_2.i((View)object4);
                                object4 = ((e)object).f;
                                if (object4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("frVPostRating");
                                    n7 = 0;
                                    object4 = null;
                                }
                                ai0_2.B((View)object4);
                                object = ((e)object).d;
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("frTvSubmit");
                                    n8 = 0;
                                    object = null;
                                }
                                n7 = R$string.continue_shopping;
                                object4 = hv3_0.K(n7);
                                object.setText((CharSequence)object4);
                            }
                            if ((object = ((f)object3).k) == null) {
                                object = "npsRatingView";
                                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                            } else {
                                object5 = object;
                            }
                            n8 = 8;
                            object5.setVisibility(n8);
                        }
                        object = z40_0.Companion;
                        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                        object4 = "in_app_rating_dialog";
                        n8 = (int)(((ao0_0)object).a((String)object4) ? 1 : 0);
                        if (n8 == 0 && (n8 = (int)(((ao0_0)(object = z40$a.a((Context)AJIOApplication$a.a()).a)).a((String)(object4 = "enable_rating_dialog")) ? 1 : 0)) != 0 && (n8 = (int)(((sw_0)(object4 = ((ew_2)object3).a)).getPreference((String)(object = "DISABLE_RATING_DIALOG"), false) ? 1 : 0)) == 0) {
                            object = z40$a.a((Context)AJIOApplication$a.a()).a;
                            object5 = "rating_later_count";
                            long l2 = ((ao0_0)object).h((String)object5);
                            long l3 = ((sw_0)object4).getPreference("CLICK_RATING_LATER_COUNT", 0L);
                            object = z40$a.a((Context)AJIOApplication$a.a()).a;
                            object4 = "android_nps_rating_threshold";
                            n8 = ((ao0_0)object).g((String)object4);
                            n7 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                            if (n7 > 0 && (n7 = ((f)object3).q) >= n8) {
                                object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                object4 = "AppRating_popup";
                                object5 = "RateUs_Shown";
                                String string2 = "order confirmation screen";
                                ((GTMEvents)object).pushPageInteractionEvent((String)object4, (String)object5, string2);
                                object = ((b61_0)object3).getContext();
                                if (object != null) {
                                    object4 = new BottomSheetDialog((Context)object);
                                    object4.requestWindowFeature(n3);
                                    n4 = R$layout.bottom_sheet_rating;
                                    ((BottomSheetDialog)object4).setContentView(n4);
                                    object5 = new ba2_2((BottomSheetDialog)object4);
                                    object4.setOnShowListener((DialogInterface.OnShowListener)object5);
                                    object5 = new ca2_0((f)object3, l3);
                                    object4.setOnDismissListener((DialogInterface.OnDismissListener)object5);
                                    n4 = R$id.rating_later_tv;
                                    object5 = (TextView)((on)object4).findViewById(n4);
                                    int n10 = R$id.rating_rate_us_tv;
                                    string2 = (TextView)((on)object4).findViewById(n10);
                                    int n14 = R$id.rating_cancel_layout;
                                    View view = ((on)object4).findViewById(n14);
                                    int n15 = R$id.rating_cancel_iv;
                                    View view2 = ((on)object4).findViewById(n15);
                                    if (object5 != null && string2 != null && view != null && view2 != null) {
                                        object = (gc3_2)((Object)object);
                                        dw_1 dw_12 = new dw_1((ew_2)object3, object, n3);
                                        string2.setOnClickListener((View.OnClickListener)dw_12);
                                        object = new da2_1(object4, 0);
                                        object5.setOnClickListener((View.OnClickListener)object);
                                        object = new ay1_0(object4, n3);
                                        view.setOnClickListener((View.OnClickListener)object);
                                        object = new by1_0((BottomSheetDialog)object4, n3);
                                        view2.setOnClickListener((View.OnClickListener)object);
                                        object4.show();
                                    }
                                }
                            }
                        }
                    } else {
                        n7 = ((DataCallback)object).getStatus();
                        if (n7 == n3 && (object4 = ((DataCallback)object).getError()) != null && (object4 = ((DataError)object4).getErrors()) != null && (n7 = (object4 = (Collection)object4).isEmpty() ^ n3) == n3) {
                            boolean bl2;
                            int n16;
                            object4 = StringCompanionObject.INSTANCE;
                            n7 = R$string.acc_error_message;
                            object4 = hv3_0.K(n7);
                            Object object6 = ((DataCallback)object).getError();
                            if (object6 != null && (object6 = ((DataError)object6).getErrors()) != null && (object6 = (DataError$ErrorMessage)object6.get(0)) != null) {
                                object6 = ((DataError$ErrorMessage)object6).getMessage();
                            } else {
                                n16 = 0;
                                object6 = null;
                            }
                            Object[] objectArray = new Object[n3];
                            objectArray[0] = object6;
                            object6 = "format(...)";
                            object4 = xh2_0.a(objectArray, n3, (String)object4, (String)object6);
                            object3 = ((f)object3).n;
                            if (object3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("orderConfirmationActivity");
                                object3 = null;
                            }
                            if ((object = ((DataCallback)object).getError()) != null && (object = ((DataError)object).getErrors()) != null && (object = (DataError$ErrorMessage)object.get(0)) != null) {
                                object5 = ((DataError$ErrorMessage)object).getMessage();
                            }
                            int n17 = R$id.payment_notification;
                            object = ((AppCompatActivity)object3).findViewById(n17);
                            n3 = R$id.payment_notification_text;
                            object3 = (TextView)((AppCompatActivity)object3).findViewById(n3);
                            cp_1 cp_12 = cp$a.e();
                            cp_12.getClass();
                            n3 = (int)(cp_1.f() ? 1 : 0);
                            n3 = n3 != 0 ? hv3_0.w(R$integer.notification_anim_delay_accesibility) : hv3_0.w(R$integer.notification_anim_delay);
                            object6 = cp$a.e();
                            object6.getClass();
                            n16 = cp_1.f();
                            n16 = n16 != 0 ? hv3_0.w(R$integer.notification_anim_post_release_delay_accesibility) : hv3_0.w(R$integer.notification_anim_post_release_delay);
                            if (object5 != null && !(bl2 = kotlin.text.b.k((CharSequence)object5))) {
                                object3.setText((CharSequence)object5);
                            } else {
                                object5 = "";
                                object3.setText((CharSequence)object5);
                            }
                            n4 = -1027080192;
                            f5 = -100.0f;
                            bl2 = false;
                            objectArray = null;
                            object3 = new TranslateAnimation(0.0f, 0.0f, f5, 0.0f);
                            long l4 = n3;
                            object3.setDuration(l4);
                            object.setVisibility(0);
                            object5 = Looper.getMainLooper();
                            object2 = new Handler((Looper)object5);
                            object5 = new va2((View)object, (String)object4);
                            l4 = 100;
                            object2.postDelayed((Runnable)object5, l4);
                            object2 = new wa2(n3, (View)object);
                            long l7 = n16;
                            object.postDelayed((Runnable)object2, l7);
                            object.startAnimation((Animation)object3);
                        }
                    }
                }
                return Unit.a;
            }
            case 1: {
                object = (HashMap)object;
                object3 = (oy1_1)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                object2 = ((oy1_1)object3).Qa();
                object2.getClass();
                Intrinsics.checkNotNullParameter(object, "<set-?>");
                ((ky1_0)object2).E = object;
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object3 = (wf1_2)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        ((wf1_2)object3).d.k(object);
        return Unit.a;
    }
}

