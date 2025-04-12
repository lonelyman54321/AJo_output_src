/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.payment.fragment.h;
import com.ril.ajio.payment.query.QueryLPBalance;
import com.ril.ajio.services.data.Payment.BinResponse;
import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.TenantResponse;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vr2
 */
public final class vr2_1
implements View.OnFocusChangeListener {
    public final /* synthetic */ h a;

    public /* synthetic */ vr2_1(h h3) {
        this.a = h3;
    }

    public final void onFocusChange(View view, boolean bl2) {
        Object object = this.a;
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        if (!bl2) {
            Object object3;
            boolean bl3;
            boolean bl4;
            object2 = ((h)object).m;
            Object object4 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("numberEt");
                bl4 = false;
                object2 = null;
            }
            if ((bl3 = ((h)object).Za((String)(object2 = h.Ra(object2.getText().toString())))) && (object3 = ((h)object).B) != null) {
                Object object5 = oo2_0.a;
                object3 = ((BinResponse)object3).isLRManaged();
                object5.getClass();
                bl3 = oo2_0.k((String)object3);
                if (bl3) {
                    object3 = z40_0.Companion;
                    object5 = ((Fragment)object).requireActivity().getApplication();
                    String string2 = "getApplication(...)";
                    Intrinsics.checkNotNullExpressionValue(object5, string2);
                    object3.getClass();
                    object3 = z40$a.a((Context)object5).a;
                    object5 = "loyaltyEnable";
                    bl3 = ((ao0_0)object3).a((String)object5);
                    if (bl3) {
                        object3 = ((h)object).C;
                        bl3 = TextUtils.isEmpty((CharSequence)object3);
                        if (bl3) {
                            int n3 = 4095;
                            string2 = null;
                            object5 = object2;
                            ((h)object).D = object2 = new LpStoredCardBalance(null, null, null, null, null, null, null, null, null, null, null, null, n3, null);
                            object3 = ((h)object).B;
                            if (object3 != null) {
                                object4 = ((BinResponse)object3).isLRManaged();
                            }
                            ((LpStoredCardBalance)object2).setLRManaged((String)object4);
                            object2 = ((h)object).D;
                            if (object2 != null) {
                                object4 = Boolean.FALSE;
                                ((LpStoredCardBalance)object2).setMobileNumberRegistered((Boolean)object4);
                            }
                            ((h)object).Va();
                        } else {
                            object3 = new QueryLPBalance();
                            object5 = ((h)object).B;
                            object5 = object5 != null ? ((BinResponse)object5).isLRManaged() : null;
                            ((QueryLPBalance)object3).setIsLRManaged((String)object5);
                            ((QueryLPBalance)object3).setCardNumber((String)object2);
                            object2 = ((h)object).C;
                            bl4 = TextUtils.isEmpty((CharSequence)object2);
                            if (bl4) {
                                object2 = ((h)object).Qa().E;
                                if (object2 != null && (object2 = ((TenantResponse)object2).getCustomer()) != null) {
                                    object4 = ((Customer)object2).getMobile();
                                }
                                ((QueryLPBalance)object3).setMobile((String)object4);
                            } else {
                                object2 = ((h)object).C;
                                ((QueryLPBalance)object3).setMobile((String)object2);
                            }
                            object2 = ((h)object).Pa();
                            object = ((h)object).Qa().E;
                            ((op2_2)object2).f((QueryLPBalance)object3, (TenantResponse)object);
                        }
                    }
                }
            }
        }
    }
}

