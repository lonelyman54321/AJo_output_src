/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jv
 */
public final class jv_2
implements TextWatcher {
    public final AjioEditText a;
    public final zd0_2 b;
    public final ReturnOrderItemDetails c;

    public jv_2(AjioEditText ajioEditText, zd0_2 zd0_22, ReturnOrderItemDetails returnOrderItemDetails) {
        Intrinsics.checkNotNullParameter(ajioEditText, "currentField");
        Intrinsics.checkNotNullParameter(zd0_22, "exchangeReturnFooterViewHolder");
        Intrinsics.checkNotNullParameter(returnOrderItemDetails, "returnOrderItemDetails");
        this.a = ajioEditText;
        this.b = zd0_22;
        this.c = returnOrderItemDetails;
    }

    public final void afterTextChanged(Editable object) {
        int n3;
        int n4;
        Object object2 = "editable";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.toString();
        int n7 = ((String)object).length();
        int n8 = 1;
        n7 -= n8;
        int n10 = 0;
        int n14 = 0;
        ReturnOrderItemDetails returnOrderItemDetails = null;
        boolean bl2 = false;
        while (true) {
            n4 = 32;
            if (n14 > n7) break;
            n3 = !bl2 ? n14 : n7;
            n3 = Intrinsics.compare(((String)object).charAt(n3), n4);
            n3 = n3 <= 0 ? 1 : 0;
            if (!bl2) {
                if (n3 == 0) {
                    bl2 = true;
                    continue;
                }
                ++n14;
                continue;
            }
            if (n3 == 0) break;
            n7 += -1;
        }
        object = com.jio.jioads.adinterfaces.a.a(n7, n8, n14, (String)object);
        n7 = ((String)object).length() - n8;
        n14 = 0;
        returnOrderItemDetails = null;
        bl2 = false;
        while (n14 <= n7) {
            n3 = !bl2 ? n14 : n7;
            n3 = Intrinsics.compare(((String)object).charAt(n3), n4);
            n3 = n3 <= 0 ? 1 : 0;
            if (!bl2) {
                if (n3 == 0) {
                    bl2 = true;
                    continue;
                }
                ++n14;
                continue;
            }
            if (n3 == 0) break;
            n7 += -1;
        }
        object2 = ((Object)((String)object).subSequence(n14, n7 += n8)).toString();
        n7 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
        zd0_2 zd0_22 = this.b;
        if (n7 == 0) {
            object2 = zd0_22.q;
            n10 = 8;
            object2.setVisibility(n10);
            zd0_22.p.setVisibility(n10);
            object2 = zd0_22.r;
            object2.setVisibility(n10);
        }
        object2 = this.a;
        n7 = object2.getId();
        n10 = R$id.et_refund_accountnumber;
        returnOrderItemDetails = this.c;
        if (n7 == n10) {
            returnOrderItemDetails.setAccountNumber((String)object);
        } else {
            n10 = R$id.et_refund_confirmaccountnumber;
            if (n7 == n10) {
                returnOrderItemDetails.setConfirmAccountNumber((String)object);
            } else {
                n10 = R$id.et_refund_ifsccode;
                if (n7 == n10) {
                    returnOrderItemDetails.setIfscCode((String)object);
                    object = zd0_22.c;
                    object2 = returnOrderItemDetails.getIfscCode();
                    object.y1((String)object2);
                }
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }
}

