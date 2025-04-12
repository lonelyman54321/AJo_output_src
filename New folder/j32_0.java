/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from J32
 */
public final class j32_0
extends BottomSheetDialogFragment {
    public static final J32$a Companion;
    public int a;
    public final boolean b;
    public final e0_0 c;

    static {
        J32$a j32$a;
        Companion = j32$a = new Object();
    }

    public j32_0() {
        e0_0 e0_02;
        boolean bl2;
        this.b = bl2 = og1_1.c();
        this.c = e0_02 = new e0_0(this, 1);
    }

    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        context = this.getArguments();
        int n3 = 0;
        if (context != null) {
            String string2 = "TYPE";
            n3 = context.getInt(string2, 0);
        }
        this.a = n3;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = this.b;
        if (n3 != 0) {
            n3 = R$layout.luxe_no_address_layout;
            return layoutInflater.inflate(n3, viewGroup, false);
        }
        n3 = R$layout.dialog_no_address;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle object) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, (Bundle)object);
        int n3 = R$id.dnaTvTitle;
        object = (TextView)view.findViewById(n3);
        int n4 = R$id.dnaTvMessage;
        TextView textView = (TextView)view.findViewById(n4);
        int n7 = R$id.dnaTvAddAddress;
        view = (TextView)view.findViewById(n7);
        n7 = this.a;
        if (n7 == 0) {
            n7 = R$string.you_have_no_addresses;
            object.setText(n7);
            n3 = R$string.add_address_for_faster_checkout_experience;
            textView.setText(n3);
            Intrinsics.checkNotNull(view);
            ai0_2.B(view);
            object = this.c;
            view.setOnClickListener((View.OnClickListener)object);
        } else {
            int n8 = 1;
            if (n7 == n8) {
                n7 = R$string.address_cannot_be_fetched;
                object.setText(n7);
                n3 = R$string.close_this_page_and_try_again;
                textView.setText(n3);
                Intrinsics.checkNotNull(view);
                ai0_2.i(view);
            }
        }
        view = this.getDialog();
        if (view != null) {
            object = new Object();
            view.setOnShowListener((DialogInterface.OnShowListener)object);
        }
    }
}

