/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/*
 * Renamed from Uv
 */
public abstract class uv_2
extends RecyclerView$B {
    public static final int $stable = 8;
    private Fragment mFragment;
    private i82_0 mOnCCClickListener;

    public uv_2(View view, i82_0 i82_02) {
        Intrinsics.checkNotNull(view);
        super(view);
        this.mOnCCClickListener = i82_02;
    }

    public static /* synthetic */ void loadImage$default(uv_2 object, String string2, ImageView imageView, String string3, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 4) != 0) {
                string3 = null;
            }
            ((uv_2)object).loadImage(string2, imageView, string3);
            return;
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadImage");
        throw object;
    }

    public final i82_0 getMOnCCClickListener() {
        return this.mOnCCClickListener;
    }

    public final void loadImage(String string2, ImageView imageView, String string3) {
        boolean bl2;
        boolean bl3;
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Object object = this.mFragment;
        if (object == null) {
            object = this.mOnCCClickListener;
            bl3 = object instanceof Fragment;
            if (bl3) {
                String string4 = "null cannot be cast to non-null type androidx.fragment.app.Fragment";
                Intrinsics.checkNotNull(object, string4);
                this.mFragment = object = (Fragment)object;
            } else {
                return;
            }
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            object = new da$a();
            ((da$a)object).k = bl3 = true;
            ((da$a)object).p = string3;
            ((da$a)object).r = bl3;
            int n3 = R$string.acc_banner;
            string3 = hv3_0.K(n3);
            ((da$a)object).b(string3);
            ((da$a)object).n = string2;
            ((da$a)object).u = imageView;
            ((da$a)object).i = bl3;
            ((da$a)object).a();
        } else {
            int n4 = R$drawable.item_dummy_noimg;
            imageView.setImageResource(n4);
        }
    }

    public abstract void setData(Object var1, int var2);

    public final void setMOnCCClickListener(i82_0 i82_02) {
        this.mOnCCClickListener = i82_02;
    }

    public final void setOrderStatus(String string2, TextView textView) {
        Object object = "orderStatus";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        if (textView == null) {
            return;
        }
        int n3 = TextUtils.isEmpty((CharSequence)string2);
        if (n3 == 0) {
            object = new Regex("_");
            String string3 = " ";
            object = ((Regex)object).replace(string2, string3);
            textView.setText((CharSequence)object);
            int n4 = cf_2.c(string2);
            n3 = -1;
            if (n4 != n3 && (string2 = hv3_0.r(n4)) != null) {
                n3 = 0;
                object = null;
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable)string2, null, null, null);
                n4 = 0;
                string2 = null;
                textView.setVisibility(0);
            }
        } else {
            int n7 = 4;
            textView.setVisibility(n7);
        }
    }

    public final void setOrderStatusRefresh(String string2, TextView textView) {
        Object object = "orderStatus";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        if (textView == null) {
            return;
        }
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            object = new Regex("_");
            String string3 = " ";
            string2 = ((Regex)object).replace(string2, string3);
            textView.setText((CharSequence)string2);
            boolean bl3 = false;
            string2 = null;
            textView.setVisibility(0);
        } else {
            int n3 = 4;
            textView.setVisibility(n3);
        }
    }
}

