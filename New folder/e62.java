/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.RelativeLayout
 */
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.utility.b;

public class e62
extends DialogFragment
implements View.OnClickListener,
nr2_2 {
    public FragmentActivity a = null;
    public OnFragmentInteractionListener b = null;
    public b c;

    public final void c8(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            string2 = E1.a("OTP", string2);
            OnFragmentInteractionListener onFragmentInteractionListener = this.b;
            String string3 = "e62";
            onFragmentInteractionListener.onFragmentInteraction(string3, 0, (Bundle)string2);
        }
    }

    public final void onAttach(Context object) {
        super.onAttach((Context)object);
        object = this.getActivity();
        this.a = object;
        object = (OnFragmentInteractionListener)object;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3;
        int n4 = object.getId();
        if (n4 == (n3 = R$id.parent) || n4 == (n3 = R$id.close_otp_screen)) {
            object = ((AppCompatActivity)this.a).getSupportFragmentManager();
            ((FragmentManager)object).V();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int n3 = R$layout.otp_detecting_layout;
        layoutInflater = layoutInflater.inflate(n3, null);
        n3 = R$id.close_otp_screen;
        ((ImageButton)layoutInflater.findViewById(n3)).setOnClickListener((View.OnClickListener)this);
        n3 = R$id.parent;
        ((RelativeLayout)layoutInflater.findViewById(n3)).setOnClickListener((View.OnClickListener)this);
        return layoutInflater;
    }

    public final void onDetach() {
        super.onDetach();
        b b2 = this.c;
        if (b2 != null) {
            b2.a();
        }
        this.a = null;
        this.b = null;
    }

    public final void onViewCreated(View object, Bundle object2) {
        super.onViewCreated((View)object, (Bundle)object2);
        object = com.ril.ajio.utility.b.Companion;
        object2 = this.a;
        this.c = object = (b)((x63_0)object).a(object2);
        ((b)object).b(this);
    }
}

