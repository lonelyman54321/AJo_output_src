/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from So0
 */
public final class so0_2
extends BottomSheetDialogFragment {
    public CartOrder a;
    public final hh3_2 b;

    public so0_2() {
        Object object = new kf_2(this, 1);
        this.b = object = yr1_2.b((Function0)object);
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = (CartOrder)((io2_1)this.b.getValue()).a.d();
        if (object != null) {
            this.a = object;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.fragment_delivery_address_bottom_sheet_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.fragment_delivery_address_bottom_sheet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View view, Bundle object) {
        Object object2;
        Object object3;
        boolean bl2;
        boolean bl3;
        Object object4;
        String string2;
        Object object5;
        int n3;
        block38: {
            block37: {
                CharSequence charSequence;
                Intrinsics.checkNotNullParameter(view, "view");
                super.onViewCreated(view, (Bundle)object);
                n3 = R$id.fdabsTvHeader;
                object = view.findViewById(n3);
                Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
                object = (TextView)object;
                object5 = this.a;
                string2 = "cartOrder";
                object4 = null;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl3 = false;
                    object5 = null;
                }
                object5 = ((CartOrder)object5).getDeliveryModeValue();
                String string3 = "store-pickup";
                bl3 = Intrinsics.areEqual(string3, object5);
                bl2 = true;
                if (bl3) {
                    object5 = "Store Pickup Address";
                    object.setText((CharSequence)object5);
                    bl3 = true;
                } else {
                    object.setText((CharSequence)"Home Delivery Address");
                    bl3 = false;
                    object5 = null;
                }
                object = object.getText();
                int n4 = R$id.fdabsLayoutContent;
                object3 = (LinearLayout)view.findViewById(n4);
                Object object6 = Looper.getMainLooper();
                object2 = new Handler((Looper)object6);
                int n7 = 1;
                object6 = new Vo(n7, object3, object);
                long l2 = 300L;
                object2.postDelayed((Runnable)object6, l2);
                n3 = R$id.fdabsTvName;
                object = (TextView)view.findViewById(n3);
                if (bl3) {
                    object5 = "Trends Store";
                    object.setText((CharSequence)object5);
                } else {
                    object5 = this.a;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl3 = false;
                        object5 = null;
                    }
                    if ((object5 = ((CartOrder)object5).getDeliveryAddress()) != null) {
                        object5 = ((CartDeliveryAddress)object5).getAddressPOC();
                    } else {
                        bl3 = false;
                        object5 = null;
                    }
                    bl3 = TextUtils.isEmpty((CharSequence)object5);
                    if (!bl3) {
                        object5 = this.a;
                        if (object5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            bl3 = false;
                            object5 = null;
                        }
                        object5 = ((CartOrder)object5).getDeliveryAddress().getAddressPOC();
                    } else {
                        object5 = this.a;
                        if (object5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            bl3 = false;
                            object5 = null;
                        }
                        if ((object5 = ((CartOrder)object5).getDeliveryAddress()) != null) {
                            object5 = ((CartDeliveryAddress)object5).getFirstName();
                        } else {
                            bl3 = false;
                            object5 = null;
                        }
                        object3 = this.a;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n4 = 0;
                            object3 = null;
                        }
                        if ((object3 = ((CartOrder)object3).getDeliveryAddress()) != null) {
                            object3 = ((CartDeliveryAddress)object3).getLastName();
                        } else {
                            n4 = 0;
                            object3 = null;
                        }
                        object2 = " ";
                        object5 = n1.a((String)object5, (String)object2, (String)object3);
                    }
                    object.setText((CharSequence)object5);
                }
                n3 = R$id.fdabsTvAddress;
                object = (TextView)view.findViewById(n3);
                object5 = this.a;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl3 = false;
                    object5 = null;
                }
                object5 = ((CartOrder)object5).getDeliveryAddress();
                object3 = "";
                if (object5 == null) break block37;
                object2 = new StringBuilder();
                object6 = ((CartDeliveryAddress)object5).getLine1();
                if (object6 != null) {
                    object6 = ((CartDeliveryAddress)object5).getLine1();
                    ((StringBuilder)object2).append((String)object6);
                }
                object6 = ((CartDeliveryAddress)object5).getLine2();
                CharSequence charSequence2 = ", ";
                if (object6 != null) {
                    object6 = ((CartDeliveryAddress)object5).getLine2();
                    charSequence = new StringBuilder((String)charSequence2);
                    charSequence.append((String)object6);
                    object6 = charSequence.toString();
                    ((StringBuilder)object2).append((String)object6);
                }
                if ((object6 = ((CartDeliveryAddress)object5).getTown()) != null) {
                    object6 = ((CartDeliveryAddress)object5).getTown();
                    String string4 = ",";
                    charSequence = new StringBuilder(string4);
                    charSequence.append((String)object6);
                    object6 = charSequence.toString();
                    ((StringBuilder)object2).append((String)object6);
                }
                if ((object6 = ((CartDeliveryAddress)object5).getDistrict()) != null) {
                    object6 = ((CartDeliveryAddress)object5).getDistrict();
                    charSequence = new StringBuilder((String)charSequence2);
                    charSequence.append((String)object6);
                    object6 = charSequence.toString();
                    ((StringBuilder)object2).append((String)object6);
                }
                if ((object6 = ((CartDeliveryAddress)object5).getState()) != null) {
                    object6 = ((CartDeliveryAddress)object5).getState();
                    charSequence = new StringBuilder((String)charSequence2);
                    charSequence.append((String)object6);
                    object6 = charSequence.toString();
                    ((StringBuilder)object2).append((String)object6);
                }
                if ((object6 = ((CartDeliveryAddress)object5).getCountry()) != null && (object6 = ((CartDeliveryAddress)object5).getCountry().getName()) != null) {
                    object6 = ((CartDeliveryAddress)object5).getCountry().getName();
                    charSequence = "\n";
                    charSequence2 = new StringBuilder((String)charSequence);
                    ((StringBuilder)charSequence2).append((String)object6);
                    object6 = ((StringBuilder)charSequence2).toString();
                    ((StringBuilder)object2).append((String)object6);
                }
                if ((object6 = ((CartDeliveryAddress)object5).getPostalCode()) != null) {
                    object6 = ((CartDeliveryAddress)object5).getPostalCode();
                    charSequence = " - ";
                    charSequence2 = new StringBuilder((String)charSequence);
                    ((StringBuilder)charSequence2).append((String)object6);
                    object6 = ((StringBuilder)charSequence2).toString();
                    ((StringBuilder)object2).append((String)object6);
                }
                if ((object6 = ((CartDeliveryAddress)object5).getLandmark()) != null) {
                    object5 = ((CartDeliveryAddress)object5).getLandmark();
                    charSequence2 = "\nLandmark: ";
                    object6 = new StringBuilder((String)charSequence2);
                    ((StringBuilder)object6).append((String)object5);
                    object5 = ((StringBuilder)object6).toString();
                    ((StringBuilder)object2).append((String)object5);
                }
                if ((object5 = ((StringBuilder)object2).toString()) != null) break block38;
            }
            object5 = object3;
        }
        object.setText((CharSequence)object5);
        n3 = R$id.fdabsTvPhone;
        object = (TextView)view.findViewById(n3);
        object5 = this.a;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl3 = false;
            object5 = null;
        }
        if ((object5 = ((CartOrder)object5).getDeliveryAddress()) == null || (object5 = ((CartDeliveryAddress)object5).getPhone()) == null) {
            object5 = object3;
        }
        object.setText((CharSequence)object5);
        n3 = R$id.fdabsTvCod;
        object = (TextView)view.findViewById(n3);
        object5 = this.a;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl3 = false;
            object5 = null;
        }
        object5 = (object5 = ((CartOrder)object5).getPaymentCode()) != null && (bl3 = StringsKt.F((CharSequence)object5, (CharSequence)(object2 = "cod"), bl2)) == bl2 ? "Cash on delivery available" : object3;
        object.setText((CharSequence)object5);
        n3 = R$id.fdabsTvDeliDate;
        object = (TextView)view.findViewById(n3);
        object5 = this.a;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl3 = false;
            object5 = null;
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(object5 = ((CartOrder)object5).getDeliveryAddress().getEstimateDeliveryDate())))) {
            object5 = this.a;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object4 = object5;
            }
            object5 = ((CartOrder)object4).getDeliveryAddress();
            object3 = ((CartDeliveryAddress)object5).getEstimateDeliveryDate();
        }
        object.setText((CharSequence)object3);
        n3 = R$id.fdabsClose;
        object = view.findViewById(n3);
        string2 = null;
        object5 = new po0_1(this, 0);
        object.setOnClickListener((View.OnClickListener)object5);
        n3 = R$id.fdabsIvClose;
        object = (ImageView)view.findViewById(n3);
        object5 = new qo0_1(this, 0);
        object.setOnClickListener((View.OnClickListener)object5);
        object = this.getDialog();
        if (object != null) {
            object5 = new Object();
            object.setOnShowListener((DialogInterface.OnShowListener)object5);
        }
        n3 = R$id.fdabsLayoutContent;
        view.findViewById(n3).bringToFront();
    }
}

