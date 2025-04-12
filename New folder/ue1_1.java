/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.d;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.LpStoredCardBalanceList;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from uE1
 */
public final class ue1_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ue1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                String string2;
                int n4;
                LpStoredCardBalance lpStoredCardBalance;
                int n7;
                int n8;
                Object object2;
                int n10;
                object = (DataCallback)object;
                d d2 = (d)this.b;
                Intrinsics.checkNotNullParameter(d2, "this$0");
                Object object3 = d2.h;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressView");
                    n10 = 0;
                    object3 = null;
                }
                ((PEProgressView)((Object)object3)).dismiss();
                n10 = ((DataCallback)object).getStatus();
                if (n10 != 0) return Unit.a;
                object = (LpStoredCardBalanceList)((DataCallback)object).getData();
                object3 = d2.Pa();
                if (object != null) {
                    object2 = ((LpStoredCardBalanceList)object).getResponseList();
                } else {
                    n8 = 0;
                    object2 = null;
                }
                ((kj2_1)object3).i = object2;
                object = object != null ? ((LpStoredCardBalanceList)object).getResponseList() : null;
                if (object == null) return Unit.a;
                object3 = d2.s;
                object2 = "";
                if (object3 == null || (object3 = ((LpStoredCardBalance)object3).getPayId()) == null) {
                    object3 = object2;
                }
                int n14 = object.size();
                int n15 = 0;
                while (true) {
                    n7 = 1;
                    if (n15 >= n14) break;
                    lpStoredCardBalance = (LpStoredCardBalance)((ArrayList)object).get(n15);
                    Object object4 = lpStoredCardBalance != null ? lpStoredCardBalance.getPayId() : object2;
                    n4 = kotlin.text.b.i((String)object4, (String)object3, n7 != 0);
                    if (n4 != 0) {
                        if (lpStoredCardBalance == null || (object3 = lpStoredCardBalance.getError()) == null) break;
                        object2 = ((Error)object3).getCode();
                        object3 = ((Error)object3).getDescription();
                        string2 = "ERR.LOY.704";
                        n8 = (int)(string2.equalsIgnoreCase((String)object2) ? 1 : 0);
                        if (n8 == 0 && (object3 == null || (n8 = (int)(StringsKt.F((CharSequence)object3, (CharSequence)(object2 = "mobile number is not registered"), false) ? 1 : 0)) == 0)) break;
                        d2.Ta((String)object3);
                        d2.s = lpStoredCardBalance;
                        return Unit.a;
                    }
                    ++n15;
                }
                object3 = d2.Pa();
                ((kj2_1)object3).i = object;
                object = d2.q;
                if (object != null) {
                    object3 = d2.d;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mobileNumberEt");
                        n10 = 0;
                        object3 = null;
                    }
                    object3 = object3.getText().toString();
                    n8 = ((String)object3).length() - n7;
                    n14 = 0;
                    string2 = null;
                    n15 = 0;
                    while (n14 <= n8) {
                        int n16 = n15 == 0 ? n14 : n8;
                        n16 = ((String)object3).charAt(n16);
                        n4 = 32;
                        if ((n16 = Intrinsics.compare(n16, n4)) <= 0) {
                            n16 = 1;
                        } else {
                            n16 = 0;
                            lpStoredCardBalance = null;
                        }
                        if (n15 == 0) {
                            if (n16 == 0) {
                                n15 = 1;
                                continue;
                            }
                            ++n14;
                            continue;
                        }
                        if (n16 == 0) break;
                        n8 += -1;
                    }
                    object3 = com.jio.jioads.adinterfaces.a.a(n8, n7, n14, (String)object3);
                    object.Z0(null, (String)object3);
                }
                d2.dismiss();
                return Unit.a;
            }
            case 0: 
        }
        object = (UY2)object;
        Intrinsics.checkNotNullParameter(object, "$this$semantics");
        Object object5 = (CMSNavigation)this.b;
        if (object5 != null) {
            object5 = ((CMSNavigation)object5).getName();
        } else {
            n3 = 0;
            object5 = null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object5);
        stringBuilder.append(" category screen");
        object5 = stringBuilder.toString();
        RY2.e((UY2)object, (String)object5);
        return Unit.a;
    }
}

