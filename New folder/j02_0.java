/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from j02
 */
public final class j02_0
extends Fragment {
    public static final j02$a Companion;
    public String a;
    public String b;
    public String c;
    public Integer d;
    public ImageView e;
    public yi2_1 f;

    static {
        j02$a j02$a;
        Companion = j02$a = new Object();
    }

    public final void onCreate(Bundle object) {
        int n3;
        int n4;
        String string2;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        Integer n7 = null;
        if (object != null) {
            string2 = "IMAGE_URL";
            object = object.getString(string2);
        } else {
            n4 = 0;
            object = null;
        }
        this.a = object;
        object = this.getArguments();
        if (object != null && (n4 = object.containsKey(string2 = "IMAGE_URL_ALT_TXT")) == (n3 = 1)) {
            object = this.getArguments();
            if (object != null) {
                object = object.getString(string2);
            } else {
                n4 = 0;
                object = null;
            }
            this.b = object;
        }
        if ((object = this.b) == null || (n4 = object.length()) == 0) {
            n4 = R$string.product_image;
            this.b = object = hv3_0.K(n4);
        }
        if ((object = this.getArguments()) != null) {
            string2 = "IMAGE_URL_HR";
            object = object.getString(string2);
        } else {
            n4 = 0;
            object = null;
        }
        this.c = object;
        object = this.getArguments();
        if (object != null) {
            n4 = object.getInt("IMAGE_POSITION");
            n7 = n4;
        }
        this.d = n7;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.new_pdp_main_product_img;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        StringBuilder stringBuilder;
        Object object3;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.product_img;
        object = (ImageView)object.findViewById(n3);
        this.e = object;
        object2 = this.b;
        Object object4 = null;
        String string2 = "productImg";
        if (object2 != null) {
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object = null;
            }
            object2 = this.b;
            object3 = this.d;
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)object2);
            stringBuilder.append(" index ");
            stringBuilder.append(object3);
            object2 = stringBuilder.toString();
            object.setContentDescription((CharSequence)object2);
        }
        object = this.c;
        bl2 = TextUtils.isEmpty((CharSequence)object);
        n3 = 1;
        if (!bl2) {
            int n4;
            object = new da$a();
            ((da$a)object).a = n4 = R$drawable.item_dummy_noimg;
            ((da$a)object).b = n4;
            ((da$a)object).s = n3;
            ((da$a)object).m = object3 = new k02(this);
            object3 = this.a;
            stringBuilder = this.e;
            if (stringBuilder == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                stringBuilder = null;
            }
            ((da$a)object).n = object3;
            ((da$a)object).u = stringBuilder;
            ((da$a)object).i = n3;
            ((da$a)object).a();
        } else {
            int n7;
            object = new da$a();
            ((da$a)object).a = n7 = R$drawable.item_dummy_noimg;
            ((da$a)object).b = n7;
            ((da$a)object).s = n3;
            object3 = this.a;
            stringBuilder = this.e;
            if (stringBuilder == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                stringBuilder = null;
            }
            ((da$a)object).n = object3;
            ((da$a)object).u = stringBuilder;
            ((da$a)object).i = n3;
            ((da$a)object).a();
        }
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object4 = object;
        }
        object = new i02(this);
        object4.setOnClickListener((View.OnClickListener)object);
    }
}

