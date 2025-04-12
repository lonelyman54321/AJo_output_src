/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LocationHeaderLayoutBinding
implements BC3 {
    public final AjioTextView idAddressChange;
    public final AjioTextView idAddressDetails;
    public final ConstraintLayout idAddressDetailsConstraint;
    public final AjioTextView idAddressName;
    public final AjioTextView idAddressPincode;
    public final AjioTextView idCheckPincode;
    public final ConstraintLayout idEnterPincodeConstraint;
    public final AjioImageView idLocImage;
    public final ConstraintLayout idNameAddress;
    public final ConstraintLayout parentLayout;
    public final RelativeLayout relativeAddressChange;
    private final ConstraintLayout rootView;

    private LocationHeaderLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, ConstraintLayout constraintLayout2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, ConstraintLayout constraintLayout3, AjioImageView ajioImageView, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, RelativeLayout relativeLayout) {
        this.rootView = constraintLayout;
        this.idAddressChange = ajioTextView;
        this.idAddressDetails = ajioTextView2;
        this.idAddressDetailsConstraint = constraintLayout2;
        this.idAddressName = ajioTextView3;
        this.idAddressPincode = ajioTextView4;
        this.idCheckPincode = ajioTextView5;
        this.idEnterPincodeConstraint = constraintLayout3;
        this.idLocImage = ajioImageView;
        this.idNameAddress = constraintLayout4;
        this.parentLayout = constraintLayout5;
        this.relativeAddressChange = relativeLayout;
    }

    public static LocationHeaderLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.id_address_change;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.id_address_details;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.id_address_details_constraint;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (ConstraintLayout)view;
                if (object4 != null) {
                    n3 = R$id.id_address_name;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.id_address_pincode;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.id_check_pincode;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                n3 = R$id.id_enter_pincode_constraint;
                                Object object8 = view = dd2_2.a(n3, object);
                                object8 = (ConstraintLayout)view;
                                if (object8 != null) {
                                    n3 = R$id.id_loc_image;
                                    Object object9 = view = dd2_2.a(n3, object);
                                    object9 = (AjioImageView)view;
                                    if (object9 != null) {
                                        n3 = R$id.id_name_address;
                                        Object object10 = view = dd2_2.a(n3, object);
                                        object10 = (ConstraintLayout)view;
                                        if (object10 != null) {
                                            Object object11 = object;
                                            object11 = (ConstraintLayout)((Object)object);
                                            n3 = R$id.relative_address_change;
                                            View view2 = view = dd2_2.a(n3, object);
                                            view2 = (RelativeLayout)view;
                                            if (view2 != null) {
                                                object = new LocationHeaderLayoutBinding((ConstraintLayout)((Object)object11), (AjioTextView)object2, (AjioTextView)object3, (ConstraintLayout)((Object)object4), (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (ConstraintLayout)((Object)object8), (AjioImageView)((Object)object9), (ConstraintLayout)((Object)object10), (ConstraintLayout)((Object)object11), (RelativeLayout)view2);
                                                return object;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LocationHeaderLayoutBinding inflate(LayoutInflater layoutInflater) {
        return LocationHeaderLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static LocationHeaderLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.location_header_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LocationHeaderLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

