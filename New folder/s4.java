/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import com.ril.ajio.services.data.addressplacedetail.AddressComponents;
import com.ril.ajio.services.data.addressplacedetail.AddressPlaceDetail;
import com.ril.ajio.services.data.addressplacedetail.Result;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class s4
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s4(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        int n3;
        boolean bl2;
        AddressComponents addressComponents;
        int n4;
        String string2;
        int n7 = 0;
        Object object2 = null;
        Object object3 = this.b;
        int n8 = 1;
        int n10 = this.a;
        switch (n10) {
            default: {
                object = (UY2)object;
                Intrinsics.checkNotNullParameter(object, "$this$semantics");
                object2 = ((he1_2)object3).b;
                RY2.e((UY2)object, (String)object2);
                RY2.f((UY2)object, 5);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object3 = (AddAddressFragment)object3;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        cp$a cp$a = cp_1.Companion;
        n10 = (int)(nn_2.b(cp$a, (DataCallback)object) ? 1 : 0);
        if (n10 == 0) return Unit.a;
        AjioLoaderView ajioLoaderView = ((AddAddressFragment)object3).v;
        if (ajioLoaderView != null) {
            ajioLoaderView.stopLoader();
        }
        Intrinsics.checkNotNull(object);
        n10 = ((DataCallback)object).getStatus();
        if (n10 != 0) {
            int n14 = ((DataCallback)object).getStatus();
            if (n14 != n8) return Unit.a;
            object = AnalyticsManager.Companion;
            Object[] objectArray = "AutoCorrect_localityfield_API_error";
            tj2_0.e((AnalyticsManager$Companion)object, (String)objectArray, (String)objectArray, "new address screen");
            object = StringCompanionObject.INSTANCE;
            n14 = R$string.acc_error_message;
            object = hv3_0.K(n14);
            n10 = R$string.no_details_for_postalcode;
            String string3 = hv3_0.K(n10);
            objectArray = new Object[n8];
            objectArray[0] = string3;
            object = xh2_0.a(objectArray, n8, (String)object, "format(...)");
            n7 = R$string.no_details_for_postalcode;
            object2 = hv3_0.K(n7);
            ((AddAddressFragment)object3).showNotification((String)object2, (String)object);
            return Unit.a;
        }
        if ((object = (AddressPlaceDetail)((DataCallback)object).getData()) == null) return Unit.a;
        Result result2 = ((AddressPlaceDetail)object).getResult();
        if (result2 == null) return Unit.a;
        if ((object = ((AddressPlaceDetail)object).getResult()) == null) return Unit.a;
        ArrayList arrayList = ((Result)object).getAddressComponents();
        if (arrayList == null) {
            return Unit.a;
        }
        ArrayList arrayList2 = ((Result)object).getAddressComponents();
        Object object4 = ((Result)object).getName();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object4);
        String string4 = "";
        object4 = !bl3 ? ((Result)object).getName() : string4;
        String string5 = ((Result)object).getFormatted_address();
        boolean bl4 = TextUtils.isEmpty((CharSequence)string5);
        if (!bl4) {
            string5 = ((Result)object).getFormatted_address();
            string2 = "getFormatted_address(...)";
            Intrinsics.checkNotNullExpressionValue(string5, string2);
            bl4 = StringsKt.F(string5, (CharSequence)object4, false);
            if (bl4) {
                object = ((Result)object).getFormatted_address();
                Intrinsics.checkNotNull(object);
            } else {
                object = ((Result)object).getFormatted_address();
                string5 = " ";
                object = n1.a((String)object4, string5, (String)object);
            }
            object4 = object;
        }
        object = arrayList2.iterator();
        String string6 = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(object, string6);
        string5 = string4;
        string2 = string4;
        String string7 = string4;
        String string8 = string4;
        while ((n4 = object.hasNext()) != 0) {
            boolean bl5;
            addressComponents = (AddressComponents)object.next();
            Iterator iterator = addressComponents.getTypes().iterator();
            Intrinsics.checkNotNullExpressionValue(iterator, string6);
            while (bl5 = iterator.hasNext()) {
                String string9 = "locality";
                String string10 = (String)iterator.next();
                boolean bl6 = string9.equalsIgnoreCase(string10);
                if (bl6) {
                    string5 = addressComponents.getLongName();
                }
                if (bl6 = (string9 = "administrative_area_level_1").equalsIgnoreCase(string10)) {
                    string7 = addressComponents.getLongName();
                }
                if (bl6 = (string9 = "country").equalsIgnoreCase(string10)) {
                    string2 = addressComponents.getLongName();
                }
                if (!(bl5 = (string9 = "postal_code").equalsIgnoreCase(string10))) continue;
                string8 = addressComponents.getLongName();
            }
        }
        int n15 = TextUtils.isEmpty((CharSequence)string5);
        if (n15 == 0) {
            object4 = kotlin.text.b.n((String)object4, string5, string4, false);
        }
        if ((n15 = TextUtils.isEmpty((CharSequence)string2)) == 0) {
            object4 = kotlin.text.b.n((String)object4, string2, string4, false);
        }
        if ((n15 = TextUtils.isEmpty((CharSequence)string7)) == 0) {
            object4 = kotlin.text.b.n((String)object4, string7, string4, false);
        }
        if ((n15 = TextUtils.isEmpty((CharSequence)string8)) == 0) {
            object4 = kotlin.text.b.n((String)object4, string8, string4, false);
        }
        while (true) {
            String string11;
            n15 = ((String)object4).length() - n8;
            n10 = 0;
            Object var7_14 = null;
            bl2 = false;
            string4 = null;
            while (true) {
                n3 = 32;
                if (n10 > n15) break;
                n4 = !bl2 ? n10 : n15;
                if ((n4 = Intrinsics.compare(((String)object4).charAt(n4), n3)) <= 0) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    addressComponents = null;
                }
                if (!bl2) {
                    if (n4 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n10 += n8;
                    continue;
                }
                if (n4 == 0) break;
                n15 += -1;
            }
            if ((n15 = (int)(kotlin.text.b.h((String)(object = com.jio.jioads.adinterfaces.a.a(n15, n8, n10, (String)object4)), string11 = ",", false) ? 1 : 0)) != 0) {
                n15 = ((String)object4).length() - n8;
                n10 = 0;
                Object var7_16 = null;
                bl2 = false;
                string4 = null;
            } else {
                n15 = ((String)object4).length() - n8;
                n10 = 0;
                Object var7_17 = null;
                bl2 = false;
                string4 = null;
                break;
            }
            while (n10 <= n15) {
                n4 = !bl2 ? n10 : n15;
                if ((n4 = Intrinsics.compare(((String)object4).charAt(n4), n3)) <= 0) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    addressComponents = null;
                }
                if (!bl2) {
                    if (n4 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n10 += n8;
                    continue;
                }
                if (n4 == 0) break;
                n15 += -1;
            }
            object = com.jio.jioads.adinterfaces.a.a(n15, n8, n10, (String)object4);
            n10 = ((String)object).length() - n8;
            object4 = ((String)object).substring(0, n10);
            object = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object);
        }
        while (n10 <= n15) {
            n4 = !bl2 ? n10 : n15;
            if ((n4 = Intrinsics.compare(((String)object4).charAt(n4), n3)) <= 0) {
                n4 = 1;
            } else {
                n4 = 0;
                addressComponents = null;
            }
            if (!bl2) {
                if (n4 == 0) {
                    bl2 = true;
                    continue;
                }
                n10 += n8;
                continue;
            }
            if (n4 == 0) break;
            n15 += -1;
        }
        object = com.jio.jioads.adinterfaces.a.a(n15, n8, n10, (String)object4);
        object2 = ((AddAddressFragment)object3).k;
        Intrinsics.checkNotNull(object2);
        object2.setText((CharSequence)object);
        object = ((AddAddressFragment)object3).c;
        Intrinsics.checkNotNull(object);
        object.setText((CharSequence)string7);
        object = ((AddAddressFragment)object3).d;
        Intrinsics.checkNotNull(object);
        object.setText((CharSequence)string8);
        object = ((AddAddressFragment)object3).h;
        Intrinsics.checkNotNull(object);
        object.setText((CharSequence)string5);
        object = ((AddAddressFragment)object3).u;
        hv3_0.S((Activity)object);
        return Unit.a;
    }
}

