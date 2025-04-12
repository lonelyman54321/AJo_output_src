/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.TextView
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pc1
 */
public final class pc1_2
extends B51 {
    public static final pc1$a Companion;
    public String f;

    static {
        pc1$a pc1$a;
        Companion = pc1$a = new Object();
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            object = this.getArguments();
            Intrinsics.checkNotNull(object);
            String string2 = "ifscCode";
            object = object.getString(string2);
            this.f = object;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.ifsc_confirm_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.close_button;
        object2 = (ImageButton)object.findViewById(n3);
        int n4 = R$id.tv_ifsc_code;
        Object object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, "findViewById(...)");
        object3 = (TextView)object3;
        int n7 = R$id.tv_submit;
        TextView textView = (TextView)object.findViewById(n7);
        int n8 = R$id.tv_cancel;
        object = (TextView)object.findViewById(n8);
        String string2 = this.f;
        object3.setText((CharSequence)string2);
        if (object2 != null) {
            n8 = 2;
            object3 = new ok_1(this, n8);
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        if (object != null) {
            object2 = new oc1_2(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if (textView != null) {
            n3 = 1;
            object = new qk_2(this, n3);
            textView.setOnClickListener((View.OnClickListener)object);
        }
    }
}

