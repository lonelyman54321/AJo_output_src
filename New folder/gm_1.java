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
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gM
 */
public final class gm_1
implements View.OnFocusChangeListener {
    public final /* synthetic */ lm_2 a;

    public /* synthetic */ gm_1(lm_2 lm_22) {
        this.a = lm_22;
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
            int n4 = ((lm_2)object2).P;
            if (n4 == 0) {
                n4 = 1;
                ((lm_2)object2).P = n4;
                object5 = ((lm_2)object2).H;
                object4 = ((NewCustomEventsRevamp)object5).getEC_FORM();
                String string2 = ((lm_2)object2).M;
                String string3 = ((lm_2)object2).K;
                String string4 = "initiate";
                String string5 = "form_initiate";
                String string6 = "address management screen";
                String string7 = ((lm_2)object2).I;
                String string8 = ((lm_2)object2).J;
                int n7 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, (String)object4, string4, string2, string5, string3, string6, string7, null, string8, false, null, n7, null);
            }
            n4 = view.getId();
            object5 = ((lm_2)object2).z;
            object4 = "";
            if (object5 != null && n4 == (n3 = object5.getId())) {
                n4 = (int)(((lm_2)object2).m ? 1 : 0);
                if (n4 == 0) {
                    object3 = ((lm_2)object2).n;
                    object4 = lm_2.Sa((CartDeliveryAddress)object3);
                }
                ((lm_2)object2).Y = object4;
            } else {
                object5 = ((lm_2)object2).c;
                if (object5 != null && n4 == (n3 = object5.getId())) {
                    n4 = (int)(((lm_2)object2).m ? 1 : 0);
                    if (n4 == 0 && (object3 = ((lm_2)object2).n) != null && (object3 = ((CartDeliveryAddress)object3).getState()) != null) {
                        object4 = object3;
                    }
                    ((lm_2)object2).Y = object4;
                } else {
                    object5 = ((lm_2)object2).e;
                    if (object5 != null && n4 == (n3 = object5.getId())) {
                        n4 = (int)(((lm_2)object2).m ? 1 : 0);
                        if (n4 == 0 && (object3 = ((lm_2)object2).n) != null && (object3 = ((CartDeliveryAddress)object3).getPhone()) != null) {
                            object4 = object3;
                        }
                        ((lm_2)object2).Y = object4;
                    } else {
                        object5 = ((lm_2)object2).f;
                        if (object5 != null && n4 == (n3 = object5.getId())) {
                            n4 = (int)(((lm_2)object2).m ? 1 : 0);
                            if (n4 == 0 && (object3 = ((lm_2)object2).n) != null && (object3 = ((CartDeliveryAddress)object3).getLine1()) != null) {
                                object4 = object3;
                            }
                            ((lm_2)object2).Y = object4;
                        } else {
                            object5 = ((lm_2)object2).g;
                            if (object5 != null && n4 == (n3 = object5.getId())) {
                                n4 = (int)(((lm_2)object2).m ? 1 : 0);
                                if (n4 == 0 && (object3 = ((lm_2)object2).n) != null) {
                                    Intrinsics.checkNotNull(object3);
                                    object3 = ((CartDeliveryAddress)object3).getLandmark();
                                    n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                                    if (n4 == 0) {
                                        object3 = ((lm_2)object2).n;
                                        Intrinsics.checkNotNull(object3);
                                        object4 = ((CartDeliveryAddress)object3).getLandmark();
                                        Intrinsics.checkNotNull(object4);
                                    }
                                }
                                ((lm_2)object2).Y = object4;
                            } else {
                                object5 = ((lm_2)object2).k;
                                if (object5 != null && n4 == (n3 = object5.getId())) {
                                    n4 = (int)(((lm_2)object2).m ? 1 : 0);
                                    if (n4 == 0) {
                                        object3 = ((lm_2)object2).n;
                                        object4 = lm_2.Qa((CartDeliveryAddress)object3);
                                    }
                                    ((lm_2)object2).Y = object4;
                                } else {
                                    object5 = ((lm_2)object2).h;
                                    if (object5 != null && n4 == (n3 = object5.getId())) {
                                        n4 = (int)(((lm_2)object2).m ? 1 : 0);
                                        if (n4 == 0 && (object3 = ((lm_2)object2).n) != null) {
                                            Intrinsics.checkNotNull(object3);
                                            object3 = ((CartDeliveryAddress)object3).getDistrict();
                                            n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                                            if (n4 == 0) {
                                                object3 = ((lm_2)object2).n;
                                                Intrinsics.checkNotNull(object3);
                                                object4 = ((CartDeliveryAddress)object3).getDistrict();
                                                Intrinsics.checkNotNull(object4);
                                            }
                                        }
                                        ((lm_2)object2).Y = object4;
                                    } else {
                                        object5 = ((lm_2)object2).d;
                                        if (object5 != null && n4 == (n3 = object5.getId())) {
                                            n4 = (int)(((lm_2)object2).m ? 1 : 0);
                                            if (n4 == 0 && (object3 = ((lm_2)object2).n) != null) {
                                                Intrinsics.checkNotNull(object3);
                                                object3 = ((CartDeliveryAddress)object3).getPostalCode();
                                                n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                                                if (n4 == 0) {
                                                    object3 = ((lm_2)object2).n;
                                                    Intrinsics.checkNotNull(object3);
                                                    object4 = ((CartDeliveryAddress)object3).getPostalCode();
                                                    Intrinsics.checkNotNull(object4);
                                                }
                                            }
                                            ((lm_2)object2).Y = object4;
                                        } else {
                                            ((lm_2)object2).Y = object4;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            n4 = object instanceof EditText;
            object2 = ((lm_2)object2).k0;
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

