/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  android.widget.Toast
 */
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from i43
 */
public final class i43_0
extends BottomSheetDialogFragment {
    public static final i43$a Companion;
    public TextView a;
    public TextView b;
    public TextView c;

    static {
        i43$a i43$a;
        Companion = i43$a = new Object();
    }

    public final void Oa(String string2) {
        Object object = this.requireActivity().getSystemService("clipboard");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.content.ClipboardManager");
        object = (ClipboardManager)object;
        string2 = ClipData.newPlainText((CharSequence)"helpline", (CharSequence)string2);
        object.setPrimaryClip((ClipData)string2);
        object = this.requireContext();
        string2 = new Toast((Context)object);
        object = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Intrinsics.checkNotNullParameter(object, "activity");
        LayoutInflater layoutInflater = object.getLayoutInflater();
        int n3 = R$layout.custom_toast_layout;
        int n4 = R$id.toast_container;
        object = (ViewGroup)object.findViewById(n4);
        object = layoutInflater.inflate(n3, (ViewGroup)object);
        string2.setGravity(80, 0, 13);
        string2.setDuration(0);
        string2.setView((View)object);
        string2.show();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$style.CustomBottomSheetDialogTheme;
        this.setStyle(0, n3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_shopping_assistnat_bottom_sheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onViewCreated(View view, Bundle object) {
        CharSequence charSequence;
        Object object2;
        boolean bl2;
        Object object3;
        boolean bl3;
        int n3;
        int n4 = 1;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, (Bundle)object);
        int n7 = R$id.view15;
        object = view.findViewById(n7);
        Object object4 = Looper.getMainLooper();
        Object object5 = new Handler((Looper)object4);
        object4 = new f43_0((View)object);
        long l2 = 100;
        object5.postDelayed((Runnable)object4, l2);
        n7 = R$id.helpline_cancel_iv;
        object = (ImageView)view.findViewById(n7);
        int n8 = R$id.helpline_no_1;
        object5 = (TextView)view.findViewById(n8);
        this.c = object5;
        n8 = R$id.helpline_no_2;
        object5 = (TextView)view.findViewById(n8);
        this.b = object5;
        n8 = R$id.time_text;
        object5 = (TextView)view.findViewById(n8);
        this.a = object5;
        int n10 = 2;
        object5 = new oz2(this, n10);
        object.setOnClickListener((View.OnClickListener)object5);
        object = h40_0.a;
        object = h40_0.A0();
        n7 = ((String)object).length();
        object5 = "";
        if (n7 != 0 && (object = JsonParser.parseString(h40_0.A0()).getAsJsonObject()) != null && (n3 = ((JsonObject)object).has((String)(object4 = "showHelplineNo1"))) != 0) {
            object = ((JsonObject)object).get((String)object4).getAsString();
            Intrinsics.checkNotNull(object);
        } else {
            object = object5;
        }
        object4 = h40_0.A0();
        n10 = ((String)object4).length();
        if (n10 != 0 && (object4 = JsonParser.parseString(h40_0.A0()).getAsJsonObject()) != null && (bl3 = ((JsonObject)object4).has((String)(object3 = "showHelplineNo2")))) {
            object4 = ((JsonObject)object4).get((String)object3).getAsString();
            Intrinsics.checkNotNull(object4);
        } else {
            object4 = object5;
        }
        object3 = h40_0.A0();
        n3 = ((String)object3).length();
        if (n3 != 0 && (object3 = JsonParser.parseString(h40_0.A0()).getAsJsonObject()) != null && (bl2 = ((JsonObject)object3).has((String)(object2 = "time")))) {
            object5 = ((JsonObject)object3).get((String)object2).getAsString();
            Intrinsics.checkNotNull(object5);
        }
        n3 = ((String)object5).length();
        bl3 = false;
        object2 = null;
        if (n3 > 0) {
            object3 = this.a;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("timeText");
                n3 = 0;
                object3 = null;
            }
            String string2 = "(";
            charSequence = new StringBuilder(string2);
            ((StringBuilder)charSequence).append((String)object5);
            ((StringBuilder)charSequence).append(")");
            object5 = ((StringBuilder)charSequence).toString();
            object3.setText((CharSequence)object5);
        }
        n8 = ((String)object).length();
        n3 = 8;
        charSequence = "helplineNo1";
        if (n8 > 0) {
            object5 = this.c;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                n8 = 0;
                object5 = null;
            }
            object5.setPaintFlags(n3);
            object5 = this.c;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                n8 = 0;
                object5 = null;
            }
            object5.setText((CharSequence)object);
        } else {
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                n7 = 0;
                object = null;
            }
            object.setVisibility(n3);
        }
        n7 = ((String)object4).length();
        object5 = "helplineNo2";
        if (n7 > 0) {
            object = this.b;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n7 = 0;
                object = null;
            }
            object.setPaintFlags(n3);
            object = this.b;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n7 = 0;
                object = null;
            }
            object.setText((CharSequence)object4);
        } else {
            object = this.b;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n7 = 0;
                object = null;
            }
            object.setVisibility(n3);
        }
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
            n7 = 0;
            object = null;
        }
        object4 = new g43(this, view);
        object.setOnLongClickListener((View.OnLongClickListener)object4);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
            n7 = 0;
            object = null;
        }
        object4 = new vn2_0(this, n4);
        object.setOnClickListener((View.OnClickListener)object4);
        object = this.b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n7 = 0;
            object = null;
        }
        object4 = new wn2_0(this, n4);
        object.setOnClickListener((View.OnClickListener)object4);
        object = this.b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
        } else {
            object2 = object;
        }
        object = new h43_0(this, view);
        object2.setOnLongClickListener((View.OnLongClickListener)object);
    }
}

