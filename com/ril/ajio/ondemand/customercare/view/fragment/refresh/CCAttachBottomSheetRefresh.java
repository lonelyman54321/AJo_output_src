/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.ondemand.customercare.view.fragment.refresh;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import kotlin.jvm.internal.Intrinsics;

public final class CCAttachBottomSheetRefresh
extends BottomSheetDialogFragment
implements View.OnClickListener {
    private LinearLayout cameraContainer;
    private ImageView cancelBtn;
    private LinearLayout fileContainer;

    public static /* synthetic */ void Oa(BottomSheetDialog bottomSheetDialog, DialogInterface dialogInterface) {
        CCAttachBottomSheetRefresh.onCreateDialog$lambda$0(bottomSheetDialog, dialogInterface);
    }

    private static final void onCreateDialog$lambda$0(BottomSheetDialog bottomSheetDialog, DialogInterface object) {
        object = "$dialog";
        Intrinsics.checkNotNullParameter(bottomSheetDialog, (String)object);
        int n3 = com.google.android.material.R$id.design_bottom_sheet;
        bottomSheetDialog = bottomSheetDialog.findViewById(n3);
        if (bottomSheetDialog != null) {
            n3 = 0;
            object = null;
            bottomSheetDialog.setBackgroundColor(0);
        }
    }

    public final LinearLayout getCameraContainer() {
        return this.cameraContainer;
    }

    public final LinearLayout getFileContainer() {
        return this.fileContainer;
    }

    public void onClick(View object) {
        int n3;
        int n4;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.file_container;
        int n8 = -1;
        String string2 = "CLICK_TYPE";
        Class<CCAttachBottomSheetRefresh> clazz = CCAttachBottomSheetRefresh.class;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            object = this.getTargetFragment();
            if (object != null) {
                Object object2 = this.getContext();
                object = new Intent((Context)object2, clazz);
                n7 = 201;
                object.putExtra(string2, n7);
                object2 = this.getTargetFragment();
                if (object2 != null) {
                    int n10 = this.getTargetRequestCode();
                    ((Fragment)object2).onActivityResult(n10, n8, (Intent)object);
                }
                this.dismiss();
            }
        } else {
            n7 = R$id.camera_container;
            if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
                object = this.getTargetFragment();
                if (object != null) {
                    Object object3 = this.getContext();
                    object = new Intent((Context)object3, clazz);
                    n7 = 202;
                    object.putExtra(string2, n7);
                    object3 = this.getTargetFragment();
                    if (object3 != null) {
                        int n14 = this.getTargetRequestCode();
                        ((Fragment)object3).onActivityResult(n14, n8, (Intent)object);
                    }
                    this.dismiss();
                }
            } else {
                n7 = R$id.cancelBtn;
                if (object != null && (n4 = ((Integer)object).intValue()) == n7) {
                    this.dismiss();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        qf_2 qf_22 = new qf_2((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)qf_22);
        return object;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.dialog_cc_attach_refresh;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(view, string2);
        super.onViewCreated(view, bundle);
        int n3 = R$id.file_container;
        bundle = (LinearLayout)view.findViewById(n3);
        this.fileContainer = bundle;
        n3 = R$id.camera_container;
        bundle = (LinearLayout)view.findViewById(n3);
        this.cameraContainer = bundle;
        n3 = R$id.cancelBtn;
        view = (ImageView)view.findViewById(n3);
        this.cancelBtn = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cancelBtn");
            view = null;
        }
        view.setOnClickListener((View.OnClickListener)this);
        view = this.fileContainer;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener)this);
        }
        if ((view = this.cameraContainer) != null) {
            view.setOnClickListener((View.OnClickListener)this);
        }
    }

    public final void setCameraContainer(LinearLayout linearLayout) {
        this.cameraContainer = linearLayout;
    }

    public final void setFileContainer(LinearLayout linearLayout) {
        this.fileContainer = linearLayout;
    }
}

