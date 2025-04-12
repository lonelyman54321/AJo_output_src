/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Offers.AllOffersItem;
import com.ril.ajio.services.data.Offers.AllOffersItem$Companion;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gc0
 */
public final class gc0_1
extends i {
    public final Context j;

    public gc0_1(Context context, FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        super(fragmentManager, 0);
        this.j = context;
    }

    public final int c() {
        return 3;
    }

    public final CharSequence e(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return hv3_0.K(R$string.bank_offers);
            }
            return hv3_0.K(R$string.coupons);
        }
        return hv3_0.K(R$string.all);
    }

    public final Fragment n(int n3) {
        dc0_2 dc0_22 = new dc0_2();
        Bundle bundle = new Bundle();
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                Object object = AllOffersItem.Companion;
                String string2 = ((AllOffersItem$Companion)object).getCOUPON_TYPE();
                object = ((AllOffersItem$Companion)object).getCOUPON_TYPE_BANK();
                bundle.putString(string2, (String)object);
                dc0_22.setArguments(bundle);
                return dc0_22;
            }
            Object object = AllOffersItem.Companion;
            String string3 = ((AllOffersItem$Companion)object).getCOUPON_TYPE();
            object = ((AllOffersItem$Companion)object).getCOUPON_TYPE_VOUCHER();
            bundle.putString(string3, (String)object);
            dc0_22.setArguments(bundle);
            return dc0_22;
        }
        Object object = AllOffersItem.Companion;
        String string4 = ((AllOffersItem$Companion)object).getCOUPON_TYPE();
        object = ((AllOffersItem$Companion)object).getCOUPON_TYPE_ALL();
        bundle.putString(string4, (String)object);
        dc0_22.setArguments(bundle);
        return dc0_22;
    }
}

