/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vq
 */
public final class vq_2
extends c51_0
implements View.OnClickListener {
    public static final Vq$a Companion;
    public TextView f;
    public TextView g;
    public TextView h;

    static {
        Vq$a vq$a;
        Companion = vq$a = new Object();
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.cancel_tv;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            this.dismiss();
        } else {
            int n8;
            n7 = R$id.photos_tv;
            n3 = -1;
            String string2 = "CLICK_TYPE";
            Class<vq_2> clazz = vq_2.class;
            if (object != null && (n8 = ((Integer)object).intValue()) == n7) {
                object = this.getTargetFragment();
                if (object != null) {
                    Object object2 = this.getContext();
                    object = new Intent((Context)object2, clazz);
                    n7 = 201;
                    object.putExtra(string2, n7);
                    object2 = this.getTargetFragment();
                    if (object2 != null) {
                        int n10 = this.getTargetRequestCode();
                        ((Fragment)object2).onActivityResult(n10, n3, (Intent)object);
                    }
                    this.dismiss();
                }
            } else {
                n7 = R$id.camera_tv;
                if (object != null && (n4 = ((Integer)object).intValue()) == n7 && (object = this.getTargetFragment()) != null) {
                    Object object3 = this.getContext();
                    object = new Intent((Context)object3, clazz);
                    n7 = 202;
                    object.putExtra(string2, n7);
                    object3 = this.getTargetFragment();
                    if (object3 != null) {
                        int n14 = this.getTargetRequestCode();
                        ((Fragment)object3).onActivityResult(n14, n3, (Intent)object);
                    }
                    this.dismiss();
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$style.PinCodeBottomSheetFragment;
        this.setStyle(0, n3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_attach_bottom_sheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(view, string2);
        super.onViewCreated(view, bundle);
        int n3 = R$id.cancel_tv;
        bundle = (TextView)view.findViewById(n3);
        this.f = bundle;
        n3 = R$id.camera_tv;
        bundle = (TextView)view.findViewById(n3);
        this.h = bundle;
        n3 = R$id.photos_tv;
        view = (TextView)view.findViewById(n3);
        this.g = view;
        view = this.f;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener)this);
        }
        if ((view = this.h) != null) {
            view.setOnClickListener((View.OnClickListener)this);
        }
        if ((view = this.g) != null) {
            view.setOnClickListener((View.OnClickListener)this);
        }
    }
}

