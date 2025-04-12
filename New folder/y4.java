/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.widget.EditText
 */
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioAutoCompleteTextView;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.jvm.internal.Intrinsics;

public final class y4
implements View.OnFocusChangeListener {
    public final /* synthetic */ AddAddressFragment a;

    public /* synthetic */ y4(AddAddressFragment addAddressFragment) {
        this.a = addAddressFragment;
    }

    public final void onFocusChange(View view, boolean bl2) {
        Object object = view;
        Object object2 = this.a;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        if (bl2) {
            int n3;
            Object object4;
            Object object5;
            int n4 = ((AddAddressFragment)object2).S;
            if (n4 == 0) {
                n4 = 1;
                ((AddAddressFragment)object2).S = n4;
                object5 = ((AddAddressFragment)object2).K;
                object4 = ((NewCustomEventsRevamp)object5).getEC_FORM();
                String string2 = ((AddAddressFragment)object2).P;
                String string3 = ((AddAddressFragment)object2).N;
                String string4 = "initiate";
                String string5 = "form_initiate";
                String string6 = "address management screen";
                String string7 = ((AddAddressFragment)object2).L;
                String string8 = ((AddAddressFragment)object2).M;
                int n7 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, (String)object4, string4, string2, string5, string3, string6, string7, null, string8, false, null, n7, null);
            }
            n4 = view.getId();
            object5 = ((AddAddressFragment)object2).C;
            object4 = "";
            if (object5 != null && n4 == (n3 = object5.getId())) {
                n4 = (int)(((AddAddressFragment)object2).m ? 1 : 0);
                if (n4 == 0) {
                    object3 = ((AddAddressFragment)object2).n;
                    object4 = AddAddressFragment.Sa((CartDeliveryAddress)object3);
                }
                ((AddAddressFragment)object2).Y = object4;
            } else {
                object5 = ((AddAddressFragment)object2).c;
                if (object5 != null && n4 == (n3 = object5.getId())) {
                    n4 = (int)(((AddAddressFragment)object2).m ? 1 : 0);
                    if (n4 == 0 && (object3 = ((AddAddressFragment)object2).n) != null && (object3 = ((CartDeliveryAddress)object3).getState()) != null) {
                        object4 = object3;
                    }
                    ((AddAddressFragment)object2).Y = object4;
                } else {
                    object5 = ((AddAddressFragment)object2).e;
                    if (object5 != null && n4 == (n3 = object5.getId())) {
                        n4 = (int)(((AddAddressFragment)object2).m ? 1 : 0);
                        if (n4 == 0 && (object3 = ((AddAddressFragment)object2).n) != null && (object3 = ((CartDeliveryAddress)object3).getPhone()) != null) {
                            object4 = object3;
                        }
                        ((AddAddressFragment)object2).Y = object4;
                    } else {
                        object5 = ((AddAddressFragment)object2).f;
                        if (object5 != null && n4 == (n3 = object5.getId())) {
                            n4 = (int)(((AddAddressFragment)object2).m ? 1 : 0);
                            if (n4 == 0 && (object3 = ((AddAddressFragment)object2).n) != null && (object3 = ((CartDeliveryAddress)object3).getLine1()) != null) {
                                object4 = object3;
                            }
                            ((AddAddressFragment)object2).Y = object4;
                        } else {
                            object5 = ((AddAddressFragment)object2).g;
                            if (object5 != null && n4 == (n3 = object5.getId())) {
                                n4 = (int)(((AddAddressFragment)object2).m ? 1 : 0);
                                if (n4 == 0 && (object3 = ((AddAddressFragment)object2).n) != null) {
                                    Intrinsics.checkNotNull(object3);
                                    object3 = ((CartDeliveryAddress)object3).getLandmark();
                                    n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                                    if (n4 == 0) {
                                        object3 = ((AddAddressFragment)object2).n;
                                        Intrinsics.checkNotNull(object3);
                                        object4 = ((CartDeliveryAddress)object3).getLandmark();
                                        Intrinsics.checkNotNull(object4);
                                    }
                                }
                                ((AddAddressFragment)object2).Y = object4;
                            } else {
                                object5 = ((AddAddressFragment)object2).k;
                                if (object5 != null && n4 == (n3 = object5.getId())) {
                                    n4 = (int)(((AddAddressFragment)object2).m ? 1 : 0);
                                    if (n4 == 0) {
                                        object3 = ((AddAddressFragment)object2).n;
                                        object4 = AddAddressFragment.Pa((CartDeliveryAddress)object3);
                                    }
                                    ((AddAddressFragment)object2).Y = object4;
                                } else {
                                    object5 = ((AddAddressFragment)object2).h;
                                    if (object5 != null && n4 == (n3 = object5.getId())) {
                                        n4 = (int)(((AddAddressFragment)object2).m ? 1 : 0);
                                        if (n4 == 0 && (object3 = ((AddAddressFragment)object2).n) != null) {
                                            Intrinsics.checkNotNull(object3);
                                            object3 = ((CartDeliveryAddress)object3).getDistrict();
                                            n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                                            if (n4 == 0) {
                                                object3 = ((AddAddressFragment)object2).n;
                                                Intrinsics.checkNotNull(object3);
                                                object4 = ((CartDeliveryAddress)object3).getDistrict();
                                                Intrinsics.checkNotNull(object4);
                                            }
                                        }
                                        ((AddAddressFragment)object2).Y = object4;
                                    } else {
                                        object5 = ((AddAddressFragment)object2).d;
                                        if (object5 != null && n4 == (n3 = object5.getId())) {
                                            n4 = (int)(((AddAddressFragment)object2).m ? 1 : 0);
                                            if (n4 == 0 && (object3 = ((AddAddressFragment)object2).n) != null) {
                                                Intrinsics.checkNotNull(object3);
                                                object3 = ((CartDeliveryAddress)object3).getPostalCode();
                                                n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                                                if (n4 == 0) {
                                                    object3 = ((AddAddressFragment)object2).n;
                                                    Intrinsics.checkNotNull(object3);
                                                    object4 = ((CartDeliveryAddress)object3).getPostalCode();
                                                    Intrinsics.checkNotNull(object4);
                                                }
                                            }
                                            ((AddAddressFragment)object2).Y = object4;
                                        } else {
                                            ((AddAddressFragment)object2).Y = object4;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            n4 = object instanceof EditText;
            object2 = ((AddAddressFragment)object2).k0;
            if (n4 != 0) {
                object = (EditText)object;
                object.addTextChangedListener((TextWatcher)object2);
            } else {
                n4 = object instanceof AjioAutoCompleteTextView;
                if (n4 != 0) {
                    object = (AjioAutoCompleteTextView)object;
                    object.addTextChangedListener((TextWatcher)object2);
                }
            }
        }
    }
}

