/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GoogleAnalyticsEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.StoredPaymentInstrument;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from R8
 */
public final class r8_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r8_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3;
        int n4 = 0;
        Object object2 = null;
        Object object3 = "this$0";
        Object object4 = this.b;
        int n7 = this.a;
        switch (n7) {
            default: {
                Object object5;
                String string2;
                int n8;
                object = (DataCallback)object;
                object4 = (ms2_2)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                object3 = ((ms2_2)object4).f;
                if (object3 != null) {
                    object3.b1();
                }
                int n10 = ((DataCallback)object).getStatus();
                n7 = 0;
                Integer n14 = null;
                if (n10 == 0) {
                    ((ms2_2)object4).e = object = (StoredPaymentInstrument)((DataCallback)object).getData();
                    if (object != null && (object = ((StoredPaymentInstrument)object).getStoredPaymentInstruments()) != null) {
                        n8 = ((ArrayList)object).size();
                    } else {
                        n8 = 0;
                        object = null;
                    }
                    object3 = "noSavedCard";
                    int n15 = 8;
                    String string3 = "recyclerView";
                    if (n8 == 0) {
                        object = ((ms2_2)object4).c;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            n8 = 0;
                            object = null;
                        }
                        object.setVisibility(n15);
                        object = ((ms2_2)object4).d;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            n8 = 0;
                            object = null;
                        }
                        object.setVisibility(0);
                    } else {
                        Object object6;
                        boolean bl2;
                        object = ((ms2_2)object4).e;
                        if (object != null) {
                            object = ((StoredPaymentInstrument)object).getStoredPaymentInstruments();
                        } else {
                            n8 = 0;
                            object = null;
                        }
                        if (object != null) {
                            object = object.iterator();
                            while (bl2 = object.hasNext()) {
                                boolean bl3;
                                boolean bl4;
                                object6 = (PaymentInstrumentType)object.next();
                                if (object6 != null) {
                                    string2 = ((PaymentInstrumentType)object6).getPaymentInstrumentCode();
                                } else {
                                    bl4 = false;
                                    string2 = null;
                                }
                                if (!(bl4 = kotlin.text.b.i(string2, (String)(object5 = "SAVED_CARD"), bl3 = true))) continue;
                                if (object6 == null) break;
                                object = ((PaymentInstrumentType)object6).getPaymentInstrumentsInfo();
                                break;
                            }
                        } else {
                            n8 = 0;
                            object = null;
                        }
                        if (object != null && !(bl2 = object.isEmpty())) {
                            string2 = ((Fragment)object4).getContext();
                            object6 = new RecyclerView$f();
                            ((ns2_1)object6).a = object;
                            ((ns2_1)object6).b = string2;
                            ((ns2_1)object6).c = object4;
                            object = ((ms2_2)object4).c;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                                n8 = 0;
                                object = null;
                            }
                            ((RecyclerView)object).setAdapter((RecyclerView$f)object6);
                            object = ((ms2_2)object4).c;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                                n8 = 0;
                                object = null;
                            }
                            object.setVisibility(0);
                            object = ((ms2_2)object4).d;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                n8 = 0;
                                object = null;
                            }
                            object.setVisibility(n15);
                            object = AnalyticsManager.Companion.getInstance().getGa();
                            object3 = "Savedcards_seen";
                            String string4 = "Saved cards shown";
                            ((GoogleAnalyticsEvents)object).trackBannerImpressionEvent((String)object3, string4);
                        } else {
                            object = ((ms2_2)object4).c;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                                n8 = 0;
                                object = null;
                            }
                            object.setVisibility(n15);
                            object = ((ms2_2)object4).d;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                n8 = 0;
                                object = null;
                            }
                            object.setVisibility(0);
                        }
                    }
                }
                object5 = new Bundle();
                object = ((ms2_2)object4).e;
                if (object != null) {
                    object = ((StoredPaymentInstrument)object).getStoredPaymentInstruments();
                } else {
                    n8 = 0;
                    object = null;
                }
                object3 = ((ms2_2)object4).h;
                if (object != null && (n8 = (int)(object.isEmpty() ? 1 : 0)) == 0) {
                    object = ((NewCustomEventsRevamp)object3).getNUMBER_OF_CARDS();
                    object2 = ((ms2_2)object4).e;
                    if (object2 != null && (object2 = ((StoredPaymentInstrument)object2).getStoredPaymentInstruments()) != null) {
                        n4 = ((ArrayList)object2).size();
                        n14 = n4;
                    }
                    Intrinsics.checkNotNull(n14);
                    n4 = n14;
                    object5.putInt(object, n4);
                } else {
                    object = ((NewCustomEventsRevamp)object3).getNUMBER_OF_CARDS();
                    object5.putInt((String)object, 0);
                }
                object = ((ms2_2)object4).g;
                string2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
                String string5 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
                ((ms2_2)object4).h.newPushCustomScreenView("saved cards screen", "payment management screen", string2, (Bundle)object5, string5);
                return Unit.a;
            }
            case 1: {
                object = (Throwable)object;
                object4 = (op2_2)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                zr1_1 zr1_12 = ((op2_2)object4).w;
                object2 = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object);
                object3 = object;
                object = ((ApiErrorRepo)object2).handleApiException((Throwable)object, "PAYMENT_DeletePaymentInstrument", true, "single page checkout", "Forward");
                zr1_12.k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        q9$a q9$a = q9_0.Companion;
        object4 = (q9_0)object4;
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        Intrinsics.checkNotNullParameter(object, "userDataCallback");
        object3 = cp_1.Companion;
        boolean bl5 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (bl5 && (n3 = ((DataCallback)object).getStatus()) == 0 && (n3 = (int)(((q9_0)object4).C2 ? 1 : 0)) != 0) {
            object = ((q9_0)object4).db();
            object3 = "<get-userInformation>(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            object = ServiceUtil.getToken((UserInformation)object);
            n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n3 == 0 || (n3 = (int)(TextUtils.isEmpty((CharSequence)(object = ((q9_0)object4).db().getGuestAccessToken())) ? 1 : 0)) == 0) {
                object = ((q9_0)object4).gb();
                ((hy3_0)object).i();
            }
            ((q9_0)object4).C2 = false;
        }
        return Unit.a;
    }
}

