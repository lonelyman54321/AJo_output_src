/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  android.view.View
 */
package com.ril.ajio;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.AjioCouponGiftCardBindingImpl;
import com.ril.ajio.databinding.AjioCouponGiftCardLuxeBindingImpl;
import com.ril.ajio.databinding.CancelRequestBottomSheetBindingImpl;
import com.ril.ajio.databinding.CartRemoveAllBottomSheetBindingImpl;
import com.ril.ajio.databinding.CartRemoveAllBottomSheetLuxeBindingImpl;
import com.ril.ajio.databinding.CodFeeAjioLayoutBindingImpl;
import com.ril.ajio.databinding.CodFeeLuxeLayoutBindingImpl;
import com.ril.ajio.databinding.ConvenienceFeeInfoBottomSheetLayoutBindingImpl;
import com.ril.ajio.databinding.ConvenienceFeeInfoBottomSheetLayoutLuxeBindingImpl;
import com.ril.ajio.databinding.FilterApplyDiscardBottomSheetBindingImpl;
import com.ril.ajio.databinding.ImageSearchBottomSheetBindingImpl;
import com.ril.ajio.databinding.ImageSearchLayoutBindingImpl;
import com.ril.ajio.databinding.ImageSearchOldBottomSheetBindingImpl;
import com.ril.ajio.databinding.ImageSearchUploadLayoutBindingImpl;
import com.ril.ajio.databinding.IncentivizeBottomSheetBindingImpl;
import com.ril.ajio.databinding.PaymentAccessibilityBottomSheetBindingImpl;
import com.ril.ajio.databinding.ReturnFormBottomSheetBindingImpl;
import com.ril.ajio.databinding.ReviewImageBottomSheetBindingImpl;
import com.ril.ajio.databinding.RowAjioGwpBottomSheetBindingImpl;
import com.ril.ajio.databinding.RowAjioGwpBottomSheetLuxeBindingImpl;
import com.ril.ajio.databinding.RowAwAjioGiftAmountCardBindingImpl;
import com.ril.ajio.databinding.RowAwAjioGiftBalanceBottomSheetBindingImpl;
import com.ril.ajio.databinding.RowAwAjioGiftBottomSheetBindingImpl;
import com.ril.ajio.databinding.RowAwAjioGiftBottomSheetLuxeBindingImpl;
import com.ril.ajio.databinding.RowAwAjioGiftCardBindingImpl;
import com.ril.ajio.databinding.RowAwAjioGiftSuccessBottomSheetBindingImpl;
import com.ril.ajio.databinding.RowPdpImageTrustMarkerNewBindingImpl;
import com.ril.ajio.databinding.RtoBottomSheetBindingImpl;
import com.ril.ajio.databinding.RtoBottomSheetLuxeBindingImpl;
import com.ril.ajio.databinding.RtoImageRowBindingImpl;
import com.ril.ajio.databinding.RtoReasonRowBindingImpl;
import com.ril.ajio.databinding.RtoReasonRowLuxeBindingImpl;
import com.ril.ajio.databinding.RvpBottomSheetLayoutBindingImpl;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl
extends Zh0 {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray;
        int n3 = 33;
        a = sparseIntArray = new SparseIntArray(n3);
        int n4 = R$layout.ajio_coupon_gift_card;
        sparseIntArray.put(n4, 1);
        n4 = R$layout.ajio_coupon_gift_card_luxe;
        sparseIntArray.put(n4, 2);
        n4 = R$layout.cancel_request_bottom_sheet;
        sparseIntArray.put(n4, 3);
        n4 = R$layout.cart_remove_all_bottom_sheet;
        sparseIntArray.put(n4, 4);
        n4 = R$layout.cart_remove_all_bottom_sheet_luxe;
        sparseIntArray.put(n4, 5);
        n4 = R$layout.cod_fee_ajio_layout;
        sparseIntArray.put(n4, 6);
        n4 = R$layout.cod_fee_luxe_layout;
        sparseIntArray.put(n4, 7);
        n4 = R$layout.convenience_fee_info_bottom_sheet_layout;
        sparseIntArray.put(n4, 8);
        n4 = R$layout.convenience_fee_info_bottom_sheet_layout_luxe;
        sparseIntArray.put(n4, 9);
        n4 = R$layout.filter_apply_discard_bottom_sheet;
        sparseIntArray.put(n4, 10);
        n4 = R$layout.image_search_bottom_sheet;
        sparseIntArray.put(n4, 11);
        n4 = R$layout.image_search_layout;
        sparseIntArray.put(n4, 12);
        n4 = R$layout.image_search_old_bottom_sheet;
        sparseIntArray.put(n4, 13);
        n4 = R$layout.image_search_upload_layout;
        sparseIntArray.put(n4, 14);
        n4 = R$layout.incentivize_bottom_sheet;
        sparseIntArray.put(n4, 15);
        n4 = R$layout.payment_accessibility_bottom_sheet;
        sparseIntArray.put(n4, 16);
        n4 = R$layout.return_form_bottom_sheet;
        sparseIntArray.put(n4, 17);
        n4 = R$layout.review_image_bottom_sheet;
        sparseIntArray.put(n4, 18);
        n4 = R$layout.row_ajio_gwp_bottom_sheet;
        sparseIntArray.put(n4, 19);
        n4 = R$layout.row_ajio_gwp_bottom_sheet_luxe;
        sparseIntArray.put(n4, 20);
        n4 = R$layout.row_aw_ajio_gift_amount_card;
        sparseIntArray.put(n4, 21);
        n4 = R$layout.row_aw_ajio_gift_balance_bottom_sheet;
        sparseIntArray.put(n4, 22);
        n4 = R$layout.row_aw_ajio_gift_bottom_sheet;
        sparseIntArray.put(n4, 23);
        n4 = R$layout.row_aw_ajio_gift_bottom_sheet_luxe;
        sparseIntArray.put(n4, 24);
        n4 = R$layout.row_aw_ajio_gift_card;
        sparseIntArray.put(n4, 25);
        n4 = R$layout.row_aw_ajio_gift_success_bottom_sheet;
        sparseIntArray.put(n4, 26);
        n4 = R$layout.row_pdp_image_trust_marker_new;
        sparseIntArray.put(n4, 27);
        n4 = R$layout.rto_bottom_sheet;
        sparseIntArray.put(n4, 28);
        n4 = R$layout.rto_bottom_sheet_luxe;
        sparseIntArray.put(n4, 29);
        n4 = R$layout.rto_image_row;
        sparseIntArray.put(n4, 30);
        n4 = R$layout.rto_reason_row;
        sparseIntArray.put(n4, 31);
        n4 = R$layout.rto_reason_row_luxe;
        sparseIntArray.put(n4, 32);
        n4 = R$layout.rvp_bottom_sheet_layout;
        sparseIntArray.put(n4, n3);
    }

    public final List a() {
        ArrayList<androidx.databinding.library.baseAdapters.DataBinderMapperImpl> arrayList = new ArrayList<androidx.databinding.library.baseAdapters.DataBinderMapperImpl>(3);
        Zh0 zh0 = new androidx.databinding.library.baseAdapters.DataBinderMapperImpl();
        arrayList.add((androidx.databinding.library.baseAdapters.DataBinderMapperImpl)zh0);
        zh0 = new com.jpl.crasdk.DataBinderMapperImpl();
        arrayList.add((androidx.databinding.library.baseAdapters.DataBinderMapperImpl)zh0);
        zh0 = new com.ril.ajio.remoteconfig.DataBinderMapperImpl();
        arrayList.add((androidx.databinding.library.baseAdapters.DataBinderMapperImpl)zh0);
        return arrayList;
    }

    public final ViewDataBinding b(ai0_0 object, View object2, int n3) {
        block68: {
            block69: {
                Object object3 = a;
                if ((n3 = object3.get(n3)) <= 0) break block68;
                object3 = object2.getTag();
                if (object3 == null) break block69;
                switch (n3) {
                    default: {
                        break block68;
                    }
                    case 33: {
                        Object object4 = "layout/rvp_bottom_sheet_layout_0";
                        n3 = (int)(((String)object4).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object4 = new RvpBottomSheetLayoutBindingImpl((ai0_0)object, (View)object2);
                            return object4;
                        }
                        object2 = jk0_0.a(object3, "The tag for rvp_bottom_sheet_layout is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 32: {
                        Object object5 = "layout/rto_reason_row_luxe_0";
                        n3 = (int)(((String)object5).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object5 = new RtoReasonRowLuxeBindingImpl((ai0_0)object, (View)object2);
                            return object5;
                        }
                        object2 = jk0_0.a(object3, "The tag for rto_reason_row_luxe is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 31: {
                        Object object6 = "layout/rto_reason_row_0";
                        n3 = (int)(((String)object6).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object6 = new RtoReasonRowBindingImpl((ai0_0)object, (View)object2);
                            return object6;
                        }
                        object2 = jk0_0.a(object3, "The tag for rto_reason_row is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 30: {
                        Object object7 = "layout/rto_image_row_0";
                        n3 = (int)(((String)object7).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object7 = new RtoImageRowBindingImpl((ai0_0)object, (View)object2);
                            return object7;
                        }
                        object2 = jk0_0.a(object3, "The tag for rto_image_row is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 29: {
                        Object object8 = "layout/rto_bottom_sheet_luxe_0";
                        n3 = (int)(((String)object8).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object8 = new RtoBottomSheetLuxeBindingImpl((ai0_0)object, (View)object2);
                            return object8;
                        }
                        object2 = jk0_0.a(object3, "The tag for rto_bottom_sheet_luxe is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 28: {
                        Object object9 = "layout/rto_bottom_sheet_0";
                        n3 = (int)(((String)object9).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object9 = new RtoBottomSheetBindingImpl((ai0_0)object, (View)object2);
                            return object9;
                        }
                        object2 = jk0_0.a(object3, "The tag for rto_bottom_sheet is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 27: {
                        Object object10 = "layout/row_pdp_image_trust_marker_new_0";
                        n3 = (int)(((String)object10).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object10 = new RowPdpImageTrustMarkerNewBindingImpl((ai0_0)object, (View)object2);
                            return object10;
                        }
                        object2 = jk0_0.a(object3, "The tag for row_pdp_image_trust_marker_new is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 26: {
                        Object object11 = "layout/row_aw_ajio_gift_success_bottom_sheet_0";
                        n3 = (int)(((String)object11).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object11 = new RowAwAjioGiftSuccessBottomSheetBindingImpl((ai0_0)object, (View)object2);
                            return object11;
                        }
                        object2 = jk0_0.a(object3, "The tag for row_aw_ajio_gift_success_bottom_sheet is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 25: {
                        Object object12 = "layout/row_aw_ajio_gift_card_0";
                        n3 = (int)(((String)object12).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object12 = new RowAwAjioGiftCardBindingImpl((ai0_0)object, (View)object2);
                            return object12;
                        }
                        object2 = jk0_0.a(object3, "The tag for row_aw_ajio_gift_card is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 24: {
                        Object object13 = "layout/row_aw_ajio_gift_bottom_sheet_luxe_0";
                        n3 = (int)(((String)object13).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object13 = new RowAwAjioGiftBottomSheetLuxeBindingImpl((ai0_0)object, (View)object2);
                            return object13;
                        }
                        object2 = jk0_0.a(object3, "The tag for row_aw_ajio_gift_bottom_sheet_luxe is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 23: {
                        Object object14 = "layout/row_aw_ajio_gift_bottom_sheet_0";
                        n3 = (int)(((String)object14).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object14 = new RowAwAjioGiftBottomSheetBindingImpl((ai0_0)object, (View)object2);
                            return object14;
                        }
                        object2 = jk0_0.a(object3, "The tag for row_aw_ajio_gift_bottom_sheet is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 22: {
                        Object object15 = "layout/row_aw_ajio_gift_balance_bottom_sheet_0";
                        n3 = (int)(((String)object15).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object15 = new RowAwAjioGiftBalanceBottomSheetBindingImpl((ai0_0)object, (View)object2);
                            return object15;
                        }
                        object2 = jk0_0.a(object3, "The tag for row_aw_ajio_gift_balance_bottom_sheet is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 21: {
                        Object object16 = "layout/row_aw_ajio_gift_amount_card_0";
                        n3 = (int)(((String)object16).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object16 = new RowAwAjioGiftAmountCardBindingImpl((ai0_0)object, (View)object2);
                            return object16;
                        }
                        object2 = jk0_0.a(object3, "The tag for row_aw_ajio_gift_amount_card is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 20: {
                        Object object17 = "layout/row_ajio_gwp_bottom_sheet_luxe_0";
                        n3 = (int)(((String)object17).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object17 = new RowAjioGwpBottomSheetLuxeBindingImpl((ai0_0)object, (View)object2);
                            return object17;
                        }
                        object2 = jk0_0.a(object3, "The tag for row_ajio_gwp_bottom_sheet_luxe is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 19: {
                        Object object18 = "layout/row_ajio_gwp_bottom_sheet_0";
                        n3 = (int)(((String)object18).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object18 = new RowAjioGwpBottomSheetBindingImpl((ai0_0)object, (View)object2);
                            return object18;
                        }
                        object2 = jk0_0.a(object3, "The tag for row_ajio_gwp_bottom_sheet is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 18: {
                        Object object19 = "layout/review_image_bottom_sheet_0";
                        n3 = (int)(((String)object19).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object19 = new ReviewImageBottomSheetBindingImpl((ai0_0)object, (View)object2);
                            return object19;
                        }
                        object2 = jk0_0.a(object3, "The tag for review_image_bottom_sheet is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 17: {
                        Object object20 = "layout/return_form_bottom_sheet_0";
                        n3 = (int)(((String)object20).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object20 = new ReturnFormBottomSheetBindingImpl((ai0_0)object, (View)object2);
                            return object20;
                        }
                        object2 = jk0_0.a(object3, "The tag for return_form_bottom_sheet is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 16: {
                        Object object21 = "layout/payment_accessibility_bottom_sheet_0";
                        n3 = (int)(((String)object21).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object21 = new PaymentAccessibilityBottomSheetBindingImpl((ai0_0)object, (View)object2);
                            return object21;
                        }
                        object2 = jk0_0.a(object3, "The tag for payment_accessibility_bottom_sheet is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 15: {
                        Object object22 = "layout/incentivize_bottom_sheet_0";
                        n3 = (int)(((String)object22).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object22 = new IncentivizeBottomSheetBindingImpl((ai0_0)object, (View)object2);
                            return object22;
                        }
                        object2 = jk0_0.a(object3, "The tag for incentivize_bottom_sheet is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 14: {
                        Object object23 = "layout/image_search_upload_layout_0";
                        n3 = (int)(((String)object23).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object23 = new ImageSearchUploadLayoutBindingImpl((ai0_0)object, (View)object2);
                            return object23;
                        }
                        object2 = jk0_0.a(object3, "The tag for image_search_upload_layout is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 13: {
                        Object object24 = "layout/image_search_old_bottom_sheet_0";
                        n3 = (int)(((String)object24).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object24 = new ImageSearchOldBottomSheetBindingImpl((ai0_0)object, (View)object2);
                            return object24;
                        }
                        object2 = jk0_0.a(object3, "The tag for image_search_old_bottom_sheet is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 12: {
                        Object object25 = "layout/image_search_layout_0";
                        n3 = (int)(((String)object25).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object25 = new ImageSearchLayoutBindingImpl((ai0_0)object, (View)object2);
                            return object25;
                        }
                        object2 = jk0_0.a(object3, "The tag for image_search_layout is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 11: {
                        Object object26 = "layout/image_search_bottom_sheet_0";
                        n3 = (int)(((String)object26).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object26 = new ImageSearchBottomSheetBindingImpl((ai0_0)object, (View)object2);
                            return object26;
                        }
                        object2 = jk0_0.a(object3, "The tag for image_search_bottom_sheet is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 10: {
                        Object object27 = "layout/filter_apply_discard_bottom_sheet_0";
                        n3 = (int)(((String)object27).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object27 = new FilterApplyDiscardBottomSheetBindingImpl((ai0_0)object, (View)object2);
                            return object27;
                        }
                        object2 = jk0_0.a(object3, "The tag for filter_apply_discard_bottom_sheet is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 9: {
                        Object object28 = "layout/convenience_fee_info_bottom_sheet_layout_luxe_0";
                        n3 = (int)(((String)object28).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object28 = new ConvenienceFeeInfoBottomSheetLayoutLuxeBindingImpl((ai0_0)object, (View)object2);
                            return object28;
                        }
                        object2 = jk0_0.a(object3, "The tag for convenience_fee_info_bottom_sheet_layout_luxe is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 8: {
                        Object object29 = "layout/convenience_fee_info_bottom_sheet_layout_0";
                        n3 = (int)(((String)object29).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object29 = new ConvenienceFeeInfoBottomSheetLayoutBindingImpl((ai0_0)object, (View)object2);
                            return object29;
                        }
                        object2 = jk0_0.a(object3, "The tag for convenience_fee_info_bottom_sheet_layout is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 7: {
                        Object object30 = "layout/cod_fee_luxe_layout_0";
                        n3 = (int)(((String)object30).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object30 = new CodFeeLuxeLayoutBindingImpl((ai0_0)object, (View)object2);
                            return object30;
                        }
                        object2 = jk0_0.a(object3, "The tag for cod_fee_luxe_layout is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 6: {
                        Object object31 = "layout/cod_fee_ajio_layout_0";
                        n3 = (int)(((String)object31).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object31 = new CodFeeAjioLayoutBindingImpl((ai0_0)object, (View)object2);
                            return object31;
                        }
                        object2 = jk0_0.a(object3, "The tag for cod_fee_ajio_layout is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 5: {
                        Object object32 = "layout/cart_remove_all_bottom_sheet_luxe_0";
                        n3 = (int)(((String)object32).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object32 = new CartRemoveAllBottomSheetLuxeBindingImpl((ai0_0)object, (View)object2);
                            return object32;
                        }
                        object2 = jk0_0.a(object3, "The tag for cart_remove_all_bottom_sheet_luxe is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 4: {
                        Object object33 = "layout/cart_remove_all_bottom_sheet_0";
                        n3 = (int)(((String)object33).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object33 = new CartRemoveAllBottomSheetBindingImpl((ai0_0)object, (View)object2);
                            return object33;
                        }
                        object2 = jk0_0.a(object3, "The tag for cart_remove_all_bottom_sheet is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 3: {
                        Object object34 = "layout/cancel_request_bottom_sheet_0";
                        n3 = (int)(((String)object34).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object34 = new CancelRequestBottomSheetBindingImpl((ai0_0)object, (View)object2);
                            return object34;
                        }
                        object2 = jk0_0.a(object3, "The tag for cancel_request_bottom_sheet is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 2: {
                        Object object35 = "layout/ajio_coupon_gift_card_luxe_0";
                        n3 = (int)(((String)object35).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object35 = new AjioCouponGiftCardLuxeBindingImpl((ai0_0)object, (View)object2);
                            return object35;
                        }
                        object2 = jk0_0.a(object3, "The tag for ajio_coupon_gift_card_luxe is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    case 1: {
                        Object object36 = "layout/ajio_coupon_gift_card_0";
                        n3 = (int)(((String)object36).equals(object3) ? 1 : 0);
                        if (n3 != 0) {
                            object36 = new AjioCouponGiftCardBindingImpl((ai0_0)object, (View)object2);
                            return object36;
                        }
                        object2 = jk0_0.a(object3, "The tag for ajio_coupon_gift_card is invalid. Received: ");
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                }
            }
            object = new RuntimeException("view must have a tag");
            throw object;
        }
        return null;
    }

    public final ViewDataBinding c(ai0_0 object, View[] viewArray, int n3) {
        int n4 = viewArray.length;
        if (n4 == 0) {
            return null;
        }
        object = a;
        n4 = object.get(n3);
        if (n4 > 0) {
            n4 = 0;
            object = viewArray[0].getTag();
            if (object == null) {
                object = new RuntimeException("view must have a tag");
                throw object;
            }
        }
        return null;
    }
}

