/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.view.KeyEvent$Callback
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.LinearLayout
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.IfscResponse;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class ExchangeReturnVerifyActivity$a
implements View.OnClickListener {
    public final /* synthetic */ ExchangeReturnVerifyActivity a;

    public ExchangeReturnVerifyActivity$a(ExchangeReturnVerifyActivity exchangeReturnVerifyActivity) {
        this.a = exchangeReturnVerifyActivity;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View view) {
        Object object;
        String string2;
        String string3;
        Object object2;
        String string4;
        String string5;
        Object object3;
        int n3;
        Object object4;
        int n4;
        Object object5;
        block58: {
            int n7;
            block66: {
                int n8;
                block67: {
                    AjioButton ajioButton;
                    AjioButton ajioButton2;
                    AjioButton ajioButton3;
                    AjioCircularImageView ajioCircularImageView;
                    AjioCircularImageView ajioCircularImageView2;
                    block59: {
                        block60: {
                            ae0_2 ae0_22;
                            ReturnOrderItemDetails returnOrderItemDetails;
                            AjioTextView ajioTextView;
                            LinearLayout linearLayout;
                            block61: {
                                block62: {
                                    block63: {
                                        block64: {
                                            block65: {
                                                ae0_2 ae0_23;
                                                String string6 = "view";
                                                object5 = view;
                                                Intrinsics.checkNotNullParameter(view, string6);
                                                n7 = view.getId();
                                                n8 = R$id.selected_icon_exchange;
                                                n4 = 0;
                                                object4 = null;
                                                n3 = 1;
                                                object3 = this.a;
                                                if (n7 == n8 || n7 == (n8 = R$id.selected_tv)) break block59;
                                                n8 = R$id.exchange_items_list_cancel;
                                                if (n7 == n8) {
                                                    object3.finish();
                                                    return;
                                                }
                                                n8 = R$id.btnSaveFullWidth;
                                                string5 = null;
                                                string4 = "Please enter valid IFSC code";
                                                object2 = "mismatch : account numbers don't match";
                                                string3 = "confirm account : ";
                                                string2 = "account number : ";
                                                object = "";
                                                if (n7 != n8) break block60;
                                                ReturnOrderItemDetails returnOrderItemDetails2 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails2);
                                                n7 = (int)(returnOrderItemDetails2.isRefundToBankSelected() ? 1 : 0);
                                                if (n7 == 0) break block61;
                                                ReturnOrderItemDetails returnOrderItemDetails3 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails3);
                                                returnOrderItemDetails3.setAccountNumberInvalid(false);
                                                ReturnOrderItemDetails returnOrderItemDetails4 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails4);
                                                returnOrderItemDetails4.setConfirmAccountNumberInvalid(false);
                                                ReturnOrderItemDetails returnOrderItemDetails5 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails5);
                                                returnOrderItemDetails5.setIFSCCodeInvalid(false);
                                                ReturnOrderItemDetails returnOrderItemDetails6 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails6);
                                                String string7 = returnOrderItemDetails6.getAccountNumber();
                                                n7 = (int)(TextUtils.isEmpty((CharSequence)string7) ? 1 : 0);
                                                if (n7 != 0) {
                                                    ReturnOrderItemDetails returnOrderItemDetails7 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                    Intrinsics.checkNotNull(returnOrderItemDetails7);
                                                    returnOrderItemDetails7.setAccountNumberInvalid(n3 != 0);
                                                    n7 = R$string.account_number_blank;
                                                    String string8 = hv3_0.K(n7);
                                                    object5 = new StringBuilder(string2);
                                                    ((StringBuilder)object5).append(string8);
                                                    String string9 = ((StringBuilder)object5).toString();
                                                    ((ExchangeReturnVerifyActivity)object3).U(string9, (String)object);
                                                }
                                                ReturnOrderItemDetails returnOrderItemDetails8 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails8);
                                                String string10 = returnOrderItemDetails8.getConfirmAccountNumber();
                                                n7 = (int)(TextUtils.isEmpty((CharSequence)string10) ? 1 : 0);
                                                if (n7 != 0) {
                                                    ReturnOrderItemDetails returnOrderItemDetails9 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                    Intrinsics.checkNotNull(returnOrderItemDetails9);
                                                    returnOrderItemDetails9.setConfirmAccountNumberInvalid(n3 != 0);
                                                    n7 = R$string.account_number_blank;
                                                    String string11 = hv3_0.K(n7);
                                                    object5 = new StringBuilder(string3);
                                                    ((StringBuilder)object5).append(string11);
                                                    String string12 = ((StringBuilder)object5).toString();
                                                    ((ExchangeReturnVerifyActivity)object3).U(string12, (String)object);
                                                }
                                                ReturnOrderItemDetails returnOrderItemDetails10 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails10);
                                                String string13 = returnOrderItemDetails10.getAccountNumber();
                                                n7 = (int)(TextUtils.isEmpty((CharSequence)string13) ? 1 : 0);
                                                if (n7 == 0) {
                                                    ReturnOrderItemDetails returnOrderItemDetails11 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                    Intrinsics.checkNotNull(returnOrderItemDetails11);
                                                    String string14 = returnOrderItemDetails11.getConfirmAccountNumber();
                                                    n7 = (int)(TextUtils.isEmpty((CharSequence)string14) ? 1 : 0);
                                                    if (n7 == 0) {
                                                        ReturnOrderItemDetails returnOrderItemDetails12 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                        Intrinsics.checkNotNull(returnOrderItemDetails12);
                                                        String string15 = returnOrderItemDetails12.getAccountNumber();
                                                        object5 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                        Intrinsics.checkNotNull(object5);
                                                        object5 = ((ReturnOrderItemDetails)object5).getConfirmAccountNumber();
                                                        n7 = (int)(b.i(string15, (String)object5, n3 != 0) ? 1 : 0);
                                                        if (n7 == 0) {
                                                            ReturnOrderItemDetails returnOrderItemDetails13 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                            Intrinsics.checkNotNull(returnOrderItemDetails13);
                                                            returnOrderItemDetails13.setAccountNumberInvalid(n3 != 0);
                                                            ReturnOrderItemDetails returnOrderItemDetails14 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                            Intrinsics.checkNotNull(returnOrderItemDetails14);
                                                            returnOrderItemDetails14.setConfirmAccountNumberInvalid(n3 != 0);
                                                            ((ExchangeReturnVerifyActivity)object3).U((String)object2, (String)object);
                                                        }
                                                    }
                                                }
                                                if ((ae0_23 = ((ExchangeReturnVerifyActivity)object3).C0) != null) {
                                                    Intrinsics.checkNotNull(ae0_23);
                                                    n4 = (int)(ae0_23.g() ? 1 : 0);
                                                    ReturnOrderItemDetails returnOrderItemDetails15 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                    Intrinsics.checkNotNull(returnOrderItemDetails15);
                                                    n8 = n4 ^ 1;
                                                    returnOrderItemDetails15.setIFSCCodeInvalid(n8 != 0);
                                                }
                                                ReturnOrderItemDetails returnOrderItemDetails16 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails16);
                                                String string16 = returnOrderItemDetails16.getIfscCode();
                                                n7 = (int)(TextUtils.isEmpty((CharSequence)string16) ? 1 : 0);
                                                if (n7 != 0 || n4 == 0) {
                                                    ReturnOrderItemDetails returnOrderItemDetails17 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                    Intrinsics.checkNotNull(returnOrderItemDetails17);
                                                    returnOrderItemDetails17.setIFSCCodeInvalid(n3 != 0);
                                                }
                                                ReturnOrderItemDetails returnOrderItemDetails18 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails18);
                                                n7 = (int)(returnOrderItemDetails18.isAccountNumberInvalid() ? 1 : 0);
                                                if (n7 != 0) break block62;
                                                ReturnOrderItemDetails returnOrderItemDetails19 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails19);
                                                n7 = (int)(returnOrderItemDetails19.isConfirmAccountNumberInvalid() ? 1 : 0);
                                                if (n7 != 0) break block62;
                                                ReturnOrderItemDetails returnOrderItemDetails20 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails20);
                                                n7 = (int)(returnOrderItemDetails20.isIFSCCodeInvalid() ? 1 : 0);
                                                if (n7 != 0) break block62;
                                                n7 = (int)(((ExchangeReturnVerifyActivity)object3).H0 ? 1 : 0);
                                                if (n7 == 0 || (n8 = ((ExchangeReturnVerifyActivity)object3).I0) == 0) break block63;
                                                if (n8 == 0 || n7 == 0) break block64;
                                                IfscResponse ifscResponse = ((ExchangeReturnVerifyActivity)object3).A0;
                                                if (ifscResponse == null) break block65;
                                                Intrinsics.checkNotNull(ifscResponse);
                                                Boolean bl2 = ifscResponse.getImps();
                                                n7 = (int)(bl2.booleanValue() ? 1 : 0);
                                                if (n7 != 0) break block64;
                                            }
                                            IfscResponse ifscResponse = new IfscResponse();
                                            ifscResponse.setErrorMessage(string4);
                                            object5 = ((ExchangeReturnVerifyActivity)object3).D0;
                                            if (object5 != null) {
                                                Intrinsics.checkNotNull(object5);
                                                ((ae0_2)object5).h(ifscResponse);
                                            }
                                            if ((object5 = ((ExchangeReturnVerifyActivity)object3).C0) == null) return;
                                            Intrinsics.checkNotNull(object5);
                                            ((ae0_2)object5).h(ifscResponse);
                                            return;
                                        }
                                        ((ExchangeReturnVerifyActivity)object3).s2();
                                        return;
                                    }
                                    pc1$a pc1$a = pc1_2.Companion;
                                    object5 = ((ExchangeReturnVerifyActivity)object3).s0;
                                    Intrinsics.checkNotNull(object5);
                                    object5 = ((ReturnOrderItemDetails)object5).getIfscCode();
                                    Intrinsics.checkNotNullExpressionValue(object5, "getIfscCode(...)");
                                    pc1$a.getClass();
                                    String string17 = "ifscCode";
                                    Intrinsics.checkNotNullParameter(object5, string17);
                                    Bundle bundle = E1.a(string17, (String)object5);
                                    object5 = new pc1_2();
                                    ((Fragment)object5).setArguments(bundle);
                                    FragmentManager fragmentManager = ((FragmentActivity)object3).getSupportFragmentManager();
                                    object4 = "IFSCConfirmBottomSheetFragment";
                                    ((DialogFragment)object5).show(fragmentManager, (String)object4);
                                    return;
                                }
                                RecyclerView recyclerView = ((ExchangeReturnVerifyActivity)object3).r0;
                                Intrinsics.checkNotNull(recyclerView);
                                RecyclerView$f recyclerView$f = recyclerView.getAdapter();
                                Intrinsics.checkNotNull(recyclerView$f);
                                recyclerView$f.notifyDataSetChanged();
                                return;
                            }
                            ReturnOrderItemDetails returnOrderItemDetails21 = ((ExchangeReturnVerifyActivity)object3).s0;
                            Intrinsics.checkNotNull(returnOrderItemDetails21);
                            n7 = (int)(returnOrderItemDetails21.isAjioStoreCreditsSelected() ? 1 : 0);
                            if (n7 == 0) return;
                            LinearLayout linearLayout2 = ((ExchangeReturnVerifyActivity)object3).S0;
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                            if ((linearLayout = ((ExchangeReturnVerifyActivity)object3).Q0) != null) {
                                linearLayout.setVisibility(0);
                            }
                            if ((ajioTextView = ((ExchangeReturnVerifyActivity)object3).R0) != null) {
                                n8 = 8;
                                ajioTextView.setVisibility(n8);
                            }
                            if ((returnOrderItemDetails = ((ExchangeReturnVerifyActivity)object3).s0) != null) {
                                returnOrderItemDetails.setRefundOptions(null);
                            }
                            if ((ae0_22 = ((ExchangeReturnVerifyActivity)object3).C0) == null) return;
                            ae0_22.notifyDataSetChanged();
                            return;
                        }
                        n8 = R$id.exchange_items_list_requestexchange;
                        if (n7 != n8) return;
                        n7 = (int)(((ExchangeReturnVerifyActivity)object3).u0 ? 1 : 0);
                        if (n7 != 0) {
                            return;
                        }
                        ((ExchangeReturnVerifyActivity)object3).u0 = n3;
                        ReturnOrderItemDetails returnOrderItemDetails = ((ExchangeReturnVerifyActivity)object3).s0;
                        if (returnOrderItemDetails == null) break block66;
                        Intrinsics.checkNotNull(returnOrderItemDetails);
                        Consignment consignment = returnOrderItemDetails.getConsignment();
                        if (consignment == null) break block66;
                        ReturnOrderItemDetails returnOrderItemDetails22 = ((ExchangeReturnVerifyActivity)object3).s0;
                        Intrinsics.checkNotNull(returnOrderItemDetails22);
                        List list = returnOrderItemDetails22.getConsignment().getEntries();
                        if (list == null) break block66;
                        break block67;
                    }
                    n7 = (int)(((ExchangeReturnVerifyActivity)object3).K0 ? 1 : 0);
                    n8 = 23;
                    if (n7 == 0) {
                        AjioButton ajioButton4;
                        AjioButton ajioButton5;
                        AjioButton ajioButton6;
                        AjioCircularImageView ajioCircularImageView3;
                        AjioCircularImageView ajioCircularImageView4;
                        ((ExchangeReturnVerifyActivity)object3).K0 = n3;
                        AjioCircularImageView ajioCircularImageView5 = ((ExchangeReturnVerifyActivity)object3).B0;
                        if (ajioCircularImageView5 != null) {
                            n4 = R$drawable.rounded_rect_black_bg;
                            ajioCircularImageView5.setBackgroundResource(n4);
                        }
                        if ((ajioCircularImageView4 = ((ExchangeReturnVerifyActivity)object3).B0) != null) {
                            n4 = R$drawable.ic_done;
                            ajioCircularImageView4.setImageResource(n4);
                        }
                        if ((ajioCircularImageView3 = ((ExchangeReturnVerifyActivity)object3).B0) != null) {
                            n4 = R$string.acc_checkbox_selected;
                            object4 = hv3_0.K(n4);
                            ajioCircularImageView3.setContentDescription((CharSequence)object4);
                        }
                        if ((ajioButton6 = ((ExchangeReturnVerifyActivity)object3).v0) != null) {
                            ajioButton6.setEnabled(n3 != 0);
                        }
                        if ((ajioButton5 = ((ExchangeReturnVerifyActivity)object3).v0) != null) {
                            ajioButton5.setClickable(n3 != 0);
                        }
                        if ((ajioButton4 = ((ExchangeReturnVerifyActivity)object3).v0) != null) {
                            n4 = R$drawable.rounded_rect_8_black_bg;
                            object4 = hv3_0.r(n4);
                            ajioButton4.setBackground((Drawable)object4);
                        }
                        if ((n7 = Build.VERSION.SDK_INT) < n8) {
                            AjioButton ajioButton7 = ((ExchangeReturnVerifyActivity)object3).v0;
                            if (ajioButton7 == null) return;
                            AJIOApplication.Companion.getClass();
                            object5 = AJIOApplication$a.a();
                            n4 = R$style.muli_bold_14_accent_11;
                            ajioButton7.setTextAppearance((Context)object5, n4);
                            return;
                        }
                        AjioButton ajioButton8 = ((ExchangeReturnVerifyActivity)object3).v0;
                        if (ajioButton8 == null) return;
                        n8 = R$style.muli_bold_14_accent_11;
                        xd0_1.a(ajioButton8, n8);
                        return;
                    }
                    ((ExchangeReturnVerifyActivity)object3).K0 = false;
                    AjioCircularImageView ajioCircularImageView6 = ((ExchangeReturnVerifyActivity)object3).B0;
                    if (ajioCircularImageView6 != null) {
                        n3 = R$drawable.rounded_rect_4_black_stroke;
                        ajioCircularImageView6.setBackgroundResource(n3);
                    }
                    if ((ajioCircularImageView2 = ((ExchangeReturnVerifyActivity)object3).B0) != null) {
                        n3 = R$color.accent_color_11;
                        ajioCircularImageView2.setImageResource(n3);
                    }
                    if ((ajioCircularImageView = ((ExchangeReturnVerifyActivity)object3).B0) != null) {
                        n3 = R$string.acc_checkbox_unselected;
                        String string18 = hv3_0.K(n3);
                        ajioCircularImageView.setContentDescription(string18);
                    }
                    if ((ajioButton3 = ((ExchangeReturnVerifyActivity)object3).v0) != null) {
                        ajioButton3.setEnabled(false);
                    }
                    if ((ajioButton2 = ((ExchangeReturnVerifyActivity)object3).v0) != null) {
                        ajioButton2.setClickable(false);
                    }
                    if ((ajioButton = ((ExchangeReturnVerifyActivity)object3).v0) != null) {
                        n4 = R$drawable.rounded_rect_disable;
                        object4 = hv3_0.r(n4);
                        ajioButton.setBackground((Drawable)object4);
                    }
                    if ((n7 = Build.VERSION.SDK_INT) < n8) {
                        AjioButton ajioButton9 = ((ExchangeReturnVerifyActivity)object3).v0;
                        if (ajioButton9 == null) return;
                        AJIOApplication.Companion.getClass();
                        object5 = AJIOApplication$a.a();
                        n4 = R$style.muli_bold_14_accent_12;
                        ajioButton9.setTextAppearance((Context)object5, n4);
                        return;
                    }
                    AjioButton ajioButton10 = ((ExchangeReturnVerifyActivity)object3).v0;
                    if (ajioButton10 == null) return;
                    n8 = R$style.muli_bold_14_accent_12;
                    xd0_1.a(ajioButton10, n8);
                    return;
                }
                n7 = 0;
                Object var2_59 = null;
                while (true) {
                    block68: {
                        block69: {
                            block70: {
                                block71: {
                                    ReturnOrderItemDetails returnOrderItemDetails;
                                    block72: {
                                        block73: {
                                            ae0_2 ae0_24;
                                            object5 = ((ExchangeReturnVerifyActivity)object3).s0;
                                            Intrinsics.checkNotNull(object5);
                                            object5 = ((ReturnOrderItemDetails)object5).getConsignment().getEntries();
                                            n8 = object5.size();
                                            if (n7 >= n8) break;
                                            object5 = ((CartEntry)ho_0.a(((ExchangeReturnVerifyActivity)object3).s0, n7)).getOrderEntry();
                                            n8 = (int)(((CartEntry)object5).getIsReturnItem() ? 1 : 0);
                                            if (n8 == 0) break block68;
                                            ReturnOrderItemDetails returnOrderItemDetails23 = ((ExchangeReturnVerifyActivity)object3).s0;
                                            Intrinsics.checkNotNull(returnOrderItemDetails23);
                                            n7 = (int)(returnOrderItemDetails23.isRefundToBankSelected() ? 1 : 0);
                                            if (n7 == 0) {
                                                ReturnOrderItemDetails returnOrderItemDetails24 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails24);
                                                n7 = (int)(returnOrderItemDetails24.isAjioStoreCreditsSelected() ? 1 : 0);
                                                if (n7 == 0) {
                                                    ReturnOrderItemDetails returnOrderItemDetails25 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                    Intrinsics.checkNotNull(returnOrderItemDetails25);
                                                    ArrayList arrayList = returnOrderItemDetails25.getRefundOptions();
                                                    if (arrayList != null) {
                                                        n7 = R$string.please_select_refund_option;
                                                        String string19 = hv3_0.K(n7);
                                                        ((ExchangeReturnVerifyActivity)object3).v2(string19);
                                                        Handler handler = new Handler();
                                                        object5 = new yd0_1((KeyEvent.Callback)object3, 0);
                                                        long l2 = 200L;
                                                        handler.postDelayed((Runnable)object5, l2);
                                                        break block58;
                                                    }
                                                    n7 = (int)(((ExchangeReturnVerifyActivity)object3).K0 ? 1 : 0);
                                                    if (n7 != 0) {
                                                        ((ExchangeReturnVerifyActivity)object3).r2();
                                                        break block58;
                                                    } else {
                                                        n7 = R$string.please_select_disclamer;
                                                        String string20 = hv3_0.K(n7);
                                                        ((ExchangeReturnVerifyActivity)object3).v2(string20);
                                                    }
                                                    break block58;
                                                }
                                            }
                                            ReturnOrderItemDetails returnOrderItemDetails26 = ((ExchangeReturnVerifyActivity)object3).s0;
                                            Intrinsics.checkNotNull(returnOrderItemDetails26);
                                            n7 = (int)(returnOrderItemDetails26.isRefundToBankSelected() ? 1 : 0);
                                            if (n7 == 0) break block69;
                                            ReturnOrderItemDetails returnOrderItemDetails27 = ((ExchangeReturnVerifyActivity)object3).s0;
                                            Intrinsics.checkNotNull(returnOrderItemDetails27);
                                            returnOrderItemDetails27.setAccountNumberInvalid(false);
                                            ReturnOrderItemDetails returnOrderItemDetails28 = ((ExchangeReturnVerifyActivity)object3).s0;
                                            Intrinsics.checkNotNull(returnOrderItemDetails28);
                                            returnOrderItemDetails28.setConfirmAccountNumberInvalid(false);
                                            ReturnOrderItemDetails returnOrderItemDetails29 = ((ExchangeReturnVerifyActivity)object3).s0;
                                            Intrinsics.checkNotNull(returnOrderItemDetails29);
                                            returnOrderItemDetails29.setIFSCCodeInvalid(false);
                                            ReturnOrderItemDetails returnOrderItemDetails30 = ((ExchangeReturnVerifyActivity)object3).s0;
                                            Intrinsics.checkNotNull(returnOrderItemDetails30);
                                            String string21 = returnOrderItemDetails30.getAccountNumber();
                                            n7 = (int)(TextUtils.isEmpty((CharSequence)string21) ? 1 : 0);
                                            if (n7 != 0) {
                                                ReturnOrderItemDetails returnOrderItemDetails31 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails31);
                                                returnOrderItemDetails31.setAccountNumberInvalid(n3 != 0);
                                                n7 = R$string.account_number_blank;
                                                String string22 = hv3_0.K(n7);
                                                object5 = new StringBuilder(string2);
                                                ((StringBuilder)object5).append(string22);
                                                String string23 = ((StringBuilder)object5).toString();
                                                ((ExchangeReturnVerifyActivity)object3).U(string23, (String)object);
                                            }
                                            ReturnOrderItemDetails returnOrderItemDetails32 = ((ExchangeReturnVerifyActivity)object3).s0;
                                            Intrinsics.checkNotNull(returnOrderItemDetails32);
                                            String string24 = returnOrderItemDetails32.getConfirmAccountNumber();
                                            n7 = (int)(TextUtils.isEmpty((CharSequence)string24) ? 1 : 0);
                                            if (n7 != 0) {
                                                ReturnOrderItemDetails returnOrderItemDetails33 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails33);
                                                returnOrderItemDetails33.setConfirmAccountNumberInvalid(n3 != 0);
                                                n7 = R$string.account_number_blank;
                                                String string25 = hv3_0.K(n7);
                                                object5 = new StringBuilder(string3);
                                                ((StringBuilder)object5).append(string25);
                                                String string26 = ((StringBuilder)object5).toString();
                                                ((ExchangeReturnVerifyActivity)object3).U(string26, (String)object);
                                            }
                                            ReturnOrderItemDetails returnOrderItemDetails34 = ((ExchangeReturnVerifyActivity)object3).s0;
                                            Intrinsics.checkNotNull(returnOrderItemDetails34);
                                            String string27 = returnOrderItemDetails34.getAccountNumber();
                                            n7 = (int)(TextUtils.isEmpty((CharSequence)string27) ? 1 : 0);
                                            if (n7 == 0) {
                                                ReturnOrderItemDetails returnOrderItemDetails35 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails35);
                                                String string28 = returnOrderItemDetails35.getConfirmAccountNumber();
                                                n7 = (int)(TextUtils.isEmpty((CharSequence)string28) ? 1 : 0);
                                                if (n7 == 0) {
                                                    ReturnOrderItemDetails returnOrderItemDetails36 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                    Intrinsics.checkNotNull(returnOrderItemDetails36);
                                                    String string29 = returnOrderItemDetails36.getAccountNumber();
                                                    object5 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                    Intrinsics.checkNotNull(object5);
                                                    object5 = ((ReturnOrderItemDetails)object5).getConfirmAccountNumber();
                                                    n7 = (int)(b.i(string29, (String)object5, n3 != 0) ? 1 : 0);
                                                    if (n7 == 0) {
                                                        ReturnOrderItemDetails returnOrderItemDetails37 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                        Intrinsics.checkNotNull(returnOrderItemDetails37);
                                                        returnOrderItemDetails37.setAccountNumberInvalid(n3 != 0);
                                                        ReturnOrderItemDetails returnOrderItemDetails38 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                        Intrinsics.checkNotNull(returnOrderItemDetails38);
                                                        returnOrderItemDetails38.setConfirmAccountNumberInvalid(n3 != 0);
                                                        ((ExchangeReturnVerifyActivity)object3).U((String)object2, (String)object);
                                                    }
                                                }
                                            }
                                            if ((ae0_24 = ((ExchangeReturnVerifyActivity)object3).C0) != null) {
                                                Intrinsics.checkNotNull(ae0_24);
                                                n4 = (int)(ae0_24.g() ? 1 : 0);
                                                ReturnOrderItemDetails returnOrderItemDetails39 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails39);
                                                n8 = n4 ^ 1;
                                                returnOrderItemDetails39.setIFSCCodeInvalid(n8 != 0);
                                            }
                                            ReturnOrderItemDetails returnOrderItemDetails40 = ((ExchangeReturnVerifyActivity)object3).s0;
                                            Intrinsics.checkNotNull(returnOrderItemDetails40);
                                            String string30 = returnOrderItemDetails40.getIfscCode();
                                            n7 = (int)(TextUtils.isEmpty((CharSequence)string30) ? 1 : 0);
                                            if (n7 != 0 || n4 == 0) {
                                                ReturnOrderItemDetails returnOrderItemDetails41 = ((ExchangeReturnVerifyActivity)object3).s0;
                                                Intrinsics.checkNotNull(returnOrderItemDetails41);
                                                returnOrderItemDetails41.setIFSCCodeInvalid(n3 != 0);
                                            }
                                            ReturnOrderItemDetails returnOrderItemDetails42 = ((ExchangeReturnVerifyActivity)object3).s0;
                                            Intrinsics.checkNotNull(returnOrderItemDetails42);
                                            n7 = (int)(returnOrderItemDetails42.isAccountNumberInvalid() ? 1 : 0);
                                            if (n7 != 0) break block70;
                                            ReturnOrderItemDetails returnOrderItemDetails43 = ((ExchangeReturnVerifyActivity)object3).s0;
                                            Intrinsics.checkNotNull(returnOrderItemDetails43);
                                            n7 = (int)(returnOrderItemDetails43.isConfirmAccountNumberInvalid() ? 1 : 0);
                                            if (n7 != 0) break block70;
                                            ReturnOrderItemDetails returnOrderItemDetails44 = ((ExchangeReturnVerifyActivity)object3).s0;
                                            Intrinsics.checkNotNull(returnOrderItemDetails44);
                                            n7 = (int)(returnOrderItemDetails44.isIFSCCodeInvalid() ? 1 : 0);
                                            if (n7 != 0) break block70;
                                            n7 = (int)(((ExchangeReturnVerifyActivity)object3).K0 ? 1 : 0);
                                            if (n7 == 0) break block71;
                                            n7 = (int)(((ExchangeReturnVerifyActivity)object3).I0 ? 1 : 0);
                                            if (n7 == 0 || (n7 = (int)(((ExchangeReturnVerifyActivity)object3).H0 ? 1 : 0)) == 0) break block72;
                                            IfscResponse ifscResponse = ((ExchangeReturnVerifyActivity)object3).A0;
                                            if (ifscResponse == null) break block73;
                                            Intrinsics.checkNotNull(ifscResponse);
                                            Boolean bl3 = ifscResponse.getImps();
                                            n7 = (int)(bl3.booleanValue() ? 1 : 0);
                                            if (n7 != 0) break block72;
                                        }
                                        IfscResponse ifscResponse = new IfscResponse();
                                        ifscResponse.setErrorMessage(string4);
                                        object5 = ((ExchangeReturnVerifyActivity)object3).D0;
                                        if (object5 != null) {
                                            Intrinsics.checkNotNull(object5);
                                            ((ae0_2)object5).h(ifscResponse);
                                        }
                                        if ((object5 = ((ExchangeReturnVerifyActivity)object3).C0) != null) {
                                            Intrinsics.checkNotNull(object5);
                                            ((ae0_2)object5).h(ifscResponse);
                                        }
                                        break block58;
                                    }
                                    if ((n7 = (int)(((ExchangeReturnVerifyActivity)object3).J0 ? 1 : 0)) != 0 && (returnOrderItemDetails = ((ExchangeReturnVerifyActivity)object3).s0) != null && (n7 = (int)(returnOrderItemDetails.isOtpVerificationRequired() ? 1 : 0)) == n3) {
                                        ((ExchangeReturnVerifyActivity)object3).t2();
                                        break block58;
                                    } else {
                                        ((ExchangeReturnVerifyActivity)object3).r2();
                                    }
                                    break block58;
                                }
                                n7 = R$string.please_select_disclamer;
                                String string31 = hv3_0.K(n7);
                                ((ExchangeReturnVerifyActivity)object3).v2(string31);
                                break block58;
                            }
                            RecyclerView recyclerView = ((ExchangeReturnVerifyActivity)object3).r0;
                            Intrinsics.checkNotNull(recyclerView);
                            RecyclerView$f recyclerView$f = recyclerView.getAdapter();
                            Intrinsics.checkNotNull(recyclerView$f);
                            recyclerView$f.notifyDataSetChanged();
                            break block58;
                        }
                        ReturnOrderItemDetails returnOrderItemDetails = ((ExchangeReturnVerifyActivity)object3).s0;
                        Intrinsics.checkNotNull(returnOrderItemDetails);
                        n7 = (int)(returnOrderItemDetails.isAjioStoreCreditsSelected() ? 1 : 0);
                        if (n7 == 0) break block58;
                        n7 = (int)(((ExchangeReturnVerifyActivity)object3).K0 ? 1 : 0);
                        if (n7 != 0) {
                            ((ExchangeReturnVerifyActivity)object3).r2();
                            break block58;
                        } else {
                            n7 = R$string.please_select_disclamer;
                            String string32 = hv3_0.K(n7);
                            ((ExchangeReturnVerifyActivity)object3).v2(string32);
                        }
                        break block58;
                    }
                    n7 += n3;
                }
            }
            if ((n7 = (int)(((ExchangeReturnVerifyActivity)object3).K0 ? 1 : 0)) != 0) {
                ((ExchangeReturnVerifyActivity)object3).r2();
            } else {
                n7 = R$string.please_select_disclamer;
                String string33 = hv3_0.K(n7);
                ((ExchangeReturnVerifyActivity)object3).v2(string33);
            }
        }
        ReturnOrderItemDetails returnOrderItemDetails = ((ExchangeReturnVerifyActivity)object3).s0;
        if (returnOrderItemDetails == null) return;
        object5 = zE2.a;
        Intrinsics.checkNotNull(returnOrderItemDetails);
        String string34 = returnOrderItemDetails.getOrderCode();
        object5 = ((ExchangeReturnVerifyActivity)object3).s0;
        if (object5 != null && (object5 = ((ReturnOrderItemDetails)object5).getSelectedControllerConfirmedList()) != null && (object5 = (CartEntry)CollectionsKt.firstOrNull((List)object5)) != null && (object5 = ((CartEntry)object5).getOrderEntry()) != null && (object5 = ((CartEntry)object5).getProduct()) != null) {
            string5 = ((Product)object5).getCode();
        }
        object5 = ((ExchangeReturnVerifyActivity)object3).V0;
        object4 = ((ExchangeReturnVerifyActivity)object3).s0;
        Intrinsics.checkNotNull(object4);
        n4 = (int)(((ReturnOrderItemDetails)object4).isRefundToBankSelected() ? 1 : 0);
        string4 = "product_id";
        Bundle bundle = px1_2.b("order_id", string34, string4, string5);
        object3 = "order_status";
        bundle.putString((String)object3, (String)object5);
        object5 = "isrefundfail";
        bundle.putInt((String)object5, n3);
        object5 = n4 != 0 ? "IMPS" : "Wallet";
        object = object5;
        object5 = AnalyticsManager.Companion;
        String string35 = av_0.a((AnalyticsManager$Companion)object5);
        String string36 = av_0.a((AnalyticsManager$Companion)object5);
        String string37 = bv_0.a((AnalyticsManager$Companion)object5);
        String string38 = cv_0.a((AnalyticsManager$Companion)object5);
        object2 = zE2.a;
        int n10 = 1536;
        string3 = "bank refund interaction";
        string2 = "Submit Refund Request";
        String string39 = "bank_refund_interactions";
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string3, string2, (String)object, string39, string35, string36, string37, bundle, string38, false, null, n10, null);
    }
}

