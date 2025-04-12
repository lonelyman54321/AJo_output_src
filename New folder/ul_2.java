/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.navigation.e;
import androidx.navigation.o;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.SimilarProducts;
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

/*
 * Renamed from UL
 */
public final class ul_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ul_2(Object object, int n3) {
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
        String string3 = "this$0";
        Object object3 = this.b;
        int n8 = 1;
        int n10 = this.a;
        switch (n10) {
            default: {
                object = (Throwable)object;
                object3 = (w23_0)object3;
                Intrinsics.checkNotNullParameter(object3, string3);
                yn3_0.a.e((Throwable)object);
                object = new DataError();
                object2 = new ArrayList();
                DataError$ErrorMessage dataError$ErrorMessage = new DataError$ErrorMessage();
                dataError$ErrorMessage.setMessage("Unable to delete.");
                ((ArrayList)object2).add(dataError$ErrorMessage);
                ((DataError)object).errors = object2;
                object2 = ((w23_0)object3).j;
                object = DataCallback.Companion.onFailed((DataError)object);
                ((LiveData)object2).i(object);
                return Unit.a;
            }
            case 2: {
                object = (o)object;
                object3 = (yT1)object3;
                Intrinsics.checkNotNullParameter(object3, "$fleekAppNavigationController");
                Intrinsics.checkNotNullParameter(object, "$this$navigate");
                uo0_0.h((o)object, (e)object3);
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                object3 = (e00)object3;
                Intrinsics.checkNotNullParameter(object3, string3);
                Intrinsics.checkNotNullParameter(object, "similarProductsDataCallback");
                object2 = ((DataCallback)object).getExtraErrorData();
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Int");
                object2 = (Integer)object2;
                n7 = (Integer)object2;
                cp$a cp$a = cp_1.Companion;
                int n14 = nn_2.b(cp$a, (DataCallback)object);
                if (n14 == 0) return Unit.a;
                n14 = ((DataCallback)object).getStatus();
                if (n14 == 0) {
                    object = ((DataCallback)object).getData();
                    Intrinsics.checkNotNull(object);
                    object = (SimilarProducts)object;
                    oz_2 oz_22 = ((e00)object3).f();
                    oz_22.g((SimilarProducts)object, n7);
                    return Unit.a;
                }
                int n15 = ((DataCallback)object).getStatus();
                if (n15 != n8) return Unit.a;
                object = ((e00)object3).f();
                n14 = 0;
                Object var4_8 = null;
                ((oz_2)object).g(null, n7);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object3 = (lm_2)object3;
        Intrinsics.checkNotNullParameter(object3, string3);
        cp$a cp$a = cp_1.Companion;
        int n16 = nn_2.b(cp$a, (DataCallback)object);
        if (n16 == 0) return Unit.a;
        AjioLoaderView ajioLoaderView = ((lm_2)object3).u;
        if (ajioLoaderView != null) {
            ajioLoaderView.stopLoader();
        }
        Intrinsics.checkNotNull(object);
        n16 = ((DataCallback)object).getStatus();
        if (n16 != 0) {
            int n17 = ((DataCallback)object).getStatus();
            if (n17 != n8) return Unit.a;
            object = AnalyticsManager.Companion;
            Object[] objectArray = "AutoCorrect_localityfield_API_error";
            tj2_0.e((AnalyticsManager$Companion)object, (String)objectArray, (String)objectArray, "new address screen");
            object = StringCompanionObject.INSTANCE;
            n17 = R$string.acc_error_message;
            object = hv3_0.K(n17);
            n16 = R$string.no_details_for_postalcode;
            String string4 = hv3_0.K(n16);
            objectArray = new Object[n8];
            objectArray[0] = string4;
            object = xh2_0.a(objectArray, n8, (String)object, "format(...)");
            n7 = R$string.no_details_for_postalcode;
            object2 = hv3_0.K(n7);
            ((lm_2)object3).showNotification((String)object2, (String)object);
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
        n10 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
        String string5 = "";
        object4 = n10 == 0 ? ((Result)object).getName() : string5;
        String string6 = ((Result)object).getFormatted_address();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string6);
        if (!bl3) {
            string6 = ((Result)object).getFormatted_address();
            string2 = "getFormatted_address(...)";
            Intrinsics.checkNotNullExpressionValue(string6, string2);
            bl3 = StringsKt.F(string6, (CharSequence)object4, false);
            if (bl3) {
                object = ((Result)object).getFormatted_address();
                Intrinsics.checkNotNull(object);
            } else {
                object = ((Result)object).getFormatted_address();
                string6 = " ";
                object = n1.a((String)object4, string6, (String)object);
            }
            object4 = object;
        }
        object = arrayList2.iterator();
        String string7 = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(object, string7);
        string6 = string5;
        string2 = string5;
        String string8 = string5;
        String string9 = string5;
        while ((n4 = object.hasNext()) != 0) {
            boolean bl4;
            addressComponents = (AddressComponents)object.next();
            Iterator iterator = addressComponents.getTypes().iterator();
            Intrinsics.checkNotNullExpressionValue(iterator, string7);
            while (bl4 = iterator.hasNext()) {
                String string10 = "locality";
                String string11 = (String)iterator.next();
                boolean bl5 = string10.equalsIgnoreCase(string11);
                if (bl5) {
                    string6 = addressComponents.getLongName();
                }
                if (bl5 = (string10 = "administrative_area_level_1").equalsIgnoreCase(string11)) {
                    string8 = addressComponents.getLongName();
                }
                if (bl5 = (string10 = "country").equalsIgnoreCase(string11)) {
                    string2 = addressComponents.getLongName();
                }
                if (!(bl4 = (string10 = "postal_code").equalsIgnoreCase(string11))) continue;
                string9 = addressComponents.getLongName();
            }
        }
        int n18 = TextUtils.isEmpty((CharSequence)string6);
        if (n18 == 0) {
            object4 = kotlin.text.b.n((String)object4, string6, string5, false);
        }
        if ((n18 = TextUtils.isEmpty((CharSequence)string2)) == 0) {
            object4 = kotlin.text.b.n((String)object4, string2, string5, false);
        }
        if ((n18 = TextUtils.isEmpty((CharSequence)string8)) == 0) {
            object4 = kotlin.text.b.n((String)object4, string8, string5, false);
        }
        if ((n18 = TextUtils.isEmpty((CharSequence)string9)) == 0) {
            object4 = kotlin.text.b.n((String)object4, string9, string5, false);
        }
        while (true) {
            String string12;
            n18 = ((String)object4).length() - n8;
            n16 = 0;
            Object var4_16 = null;
            bl2 = false;
            string5 = null;
            while (true) {
                n3 = 32;
                if (n16 > n18) break;
                n4 = !bl2 ? n16 : n18;
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
                    n16 += n8;
                    continue;
                }
                if (n4 == 0) break;
                n18 += -1;
            }
            if ((n18 = (int)(kotlin.text.b.h((String)(object = com.jio.jioads.adinterfaces.a.a(n18, n8, n16, (String)object4)), string12 = ",", false) ? 1 : 0)) != 0) {
                n18 = ((String)object4).length() - n8;
                n16 = 0;
                Object var4_18 = null;
                bl2 = false;
                string5 = null;
            } else {
                n18 = ((String)object4).length() - n8;
                n16 = 0;
                Object var4_19 = null;
                bl2 = false;
                string5 = null;
                break;
            }
            while (n16 <= n18) {
                n4 = !bl2 ? n16 : n18;
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
                    n16 += n8;
                    continue;
                }
                if (n4 == 0) break;
                n18 += -1;
            }
            object = com.jio.jioads.adinterfaces.a.a(n18, n8, n16, (String)object4);
            n16 = ((String)object).length() - n8;
            object4 = ((String)object).substring(0, n16);
            object = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object);
        }
        while (n16 <= n18) {
            n4 = !bl2 ? n16 : n18;
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
                n16 += n8;
                continue;
            }
            if (n4 == 0) break;
            n18 += -1;
        }
        object = com.jio.jioads.adinterfaces.a.a(n18, n8, n16, (String)object4);
        object2 = ((lm_2)object3).k;
        Intrinsics.checkNotNull(object2);
        object2.setText((CharSequence)object);
        object = ((lm_2)object3).c;
        Intrinsics.checkNotNull(object);
        object.setText((CharSequence)string8);
        object = ((lm_2)object3).d;
        Intrinsics.checkNotNull(object);
        object.setText((CharSequence)string9);
        object = ((lm_2)object3).h;
        Intrinsics.checkNotNull(object);
        object.setText((CharSequence)string6);
        object = ((lm_2)object3).t;
        hv3_0.S((Activity)object);
        return Unit.a;
    }
}

