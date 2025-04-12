/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.sis.StoreInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class hU$a
extends RecyclerView$B {
    public final View a;
    public final lc3_1 b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final ImageView g;
    public final TextView h;
    public final ImageView i;
    public final View j;
    public final View k;
    public final View l;
    public final ImageView m;

    public hU$a(View view, lc3_1 lc3_12, boolean bl2, int n3, boolean bl3, boolean bl4) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(lc3_12, "listner");
        super(view);
        this.a = view;
        this.b = lc3_12;
        this.c = bl2;
        this.d = n3;
        this.e = bl3;
        this.f = bl4;
        int n4 = R$id.fcsIvStoreLogo;
        lc3_12 = (ImageView)view.findViewById(n4);
        this.g = lc3_12;
        n4 = R$id.fcsTvStoreText;
        lc3_12 = (TextView)view.findViewById(n4);
        this.h = lc3_12;
        n4 = R$id.fcsIvStoreSelected;
        lc3_12 = (ImageView)view.findViewById(n4);
        this.i = lc3_12;
        n4 = R$id.item_separator;
        lc3_12 = view.findViewById(n4);
        this.j = lc3_12;
        n4 = R$id.fcsLayoutStore;
        lc3_12 = view.findViewById(n4);
        this.k = lc3_12;
        n4 = R$id.fcsTvStoreLyt;
        lc3_12 = view.findViewById(n4);
        this.l = lc3_12;
        n4 = R$id.revamp_store_banner;
        view = (ImageView)view.findViewById(n4);
        this.m = view;
    }

    public final void w(StoreInfo storeInfo, boolean bl2) {
        Object object = "storeInfo";
        Intrinsics.checkNotNullParameter(storeInfo, (String)object);
        int n3 = this.c;
        Object object2 = this.l;
        View view = this.k;
        int n4 = 8;
        Object object3 = this.m;
        int n7 = 1;
        if (n3 == 0 && (n3 = this.f) == 0) {
            Object[] objectArray;
            float f5;
            int n8;
            int n10;
            object3.setVisibility(n4);
            object2.setVisibility(0);
            object = new da$a();
            ((da$a)object).k = n7;
            ((da$a)object).g = n7;
            ((da$a)object).s = n7;
            object2 = storeInfo.storeId;
            if (object2 != null && (n10 = ((String)object2).equals(object3 = ld3_2.STORE_AJIO.getStoreId())) == n7) {
                n8 = R$string.acc_ajio_logo;
                object2 = hv3_0.K(n8);
            } else if (object2 != null && (n8 = ((String)object2).equals(object3 = ld3_2.STORE_AJIOGRAM.getStoreId())) == n7) {
                n8 = R$string.acc_ajiogram_logo;
                object2 = hv3_0.K(n8);
            } else {
                object2 = "";
            }
            ((da$a)object).b((String)object2);
            object2 = storeInfo.storeId;
            if (object2 != null && (n10 = ((String)object2).equals(object3 = ld3_2.STORE_AJIO.getStoreId())) == n7) {
                n8 = R$drawable.ajio_logo;
            } else if (object2 != null && (n10 = ((String)object2).equals(object3 = ld3_2.STORE_LUXE.getStoreId())) == n7) {
                n8 = R$drawable.luxe_toolbar_ic;
            } else if (object2 != null && (n8 = (int)(((String)object2).equals(object3 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) == n7) {
                n8 = R$drawable.ajiogram_chevron_logo;
            } else {
                n8 = 0;
                f5 = 0.0f;
                object2 = null;
            }
            ((da$a)object).b = n8;
            Intrinsics.checkNotNullParameter(storeInfo, "it");
            object2 = storeInfo.getAppPopupLogo();
            n8 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
            if (n8 == 0) {
                object2 = storeInfo.getAppPopupLogo();
            } else {
                object2 = storeInfo.biggerLogo;
                n8 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                if (n8 == 0) {
                    object2 = storeInfo.biggerLogo;
                } else {
                    n8 = 0;
                    f5 = 0.0f;
                    object2 = null;
                }
            }
            ((da$a)object).n = object2;
            object2 = this.g;
            ((da$a)object).u = object2;
            ((da$a)object).i = n7;
            ((da$a)object).a();
            object = this.h;
            object2 = storeInfo.getStoreSubTitle();
            object.setText((CharSequence)object2);
            object = storeInfo.storeId;
            object2 = ". ";
            object3 = "format(...)";
            String string2 = "getString(...)";
            if (object != null && (n3 = (int)(((String)object).equals(objectArray = od3_2.a()) ? 1 : 0)) == n7) {
                object = StringCompanionObject.INSTANCE;
                object = view.getContext();
                int n14 = R$string.acc_store_selected;
                object = object.getString(n14);
                Intrinsics.checkNotNullExpressionValue(object, string2);
                string2 = storeInfo.storeId;
                objectArray = new Object[n7];
                objectArray[0] = string2;
                object = xh2_0.a(objectArray, n7, (String)object, (String)object3);
                object3 = storeInfo.getStoreSubTitle();
                object = n1.a((String)object, (String)object2, (String)object3);
                object2 = storeInfo.getActiveAltText();
                if (object2 != null) {
                    object = object2;
                }
                view.setContentDescription((CharSequence)object);
                n3 = R$drawable.ic_green_circle_white_tick;
            } else {
                object = StringCompanionObject.INSTANCE;
                object = view.getContext();
                int n15 = R$string.acc_store_unselected;
                object = object.getString(n15);
                Intrinsics.checkNotNullExpressionValue(object, string2);
                string2 = storeInfo.storeId;
                objectArray = new Object[n7];
                objectArray[0] = string2;
                object = xh2_0.a(objectArray, n7, (String)object, (String)object3);
                object3 = storeInfo.getStoreSubTitle();
                object = n1.a((String)object, (String)object2, (String)object3);
                object2 = storeInfo.getInactiveAltText();
                if (object2 != null) {
                    object = object2;
                }
                view.setContentDescription((CharSequence)object);
                n3 = R$drawable.ic_arrow_black_right;
            }
            object2 = this.i;
            object2.setImageResource(n3);
            object = this.j;
            if (bl2) {
                object.setVisibility(n4);
            } else {
                object.setVisibility(0);
            }
            gu_1 gu_12 = new gu_1(this, storeInfo);
            view.setOnClickListener((View.OnClickListener)gu_12);
        } else {
            object3.setVisibility(0);
            object2.setVisibility(n4);
            Object object4 = storeInfo.aspectRatio;
            object = object3.getResources();
            int n16 = R$dimen.dp40;
            float f6 = object.getDimension(n16);
            n16 = this.d;
            float f7 = (float)n16 - f6;
            n3 = 1059648963;
            f6 = 0.66f * f7;
            if (object4 != null && (n4 = ((String)object4).length()) > 0) {
                object = new String[]{":"};
                n4 = 6;
                object4 = StringsKt.a0((CharSequence)object4, (String[])object, false, 0, n4);
                object = (String)object4.get(0);
                f6 = Float.parseFloat((String)object);
                object4 = (String)object4.get(n7);
                float f8 = Float.parseFloat((String)object4) * f7;
                f6 = f8 / f6;
            }
            object4 = object3.getLayoutParams();
            ((ViewGroup.LayoutParams)object4).height = n3 = (int)f6;
            object4 = this.x(storeInfo);
            if (object4 != null) {
                object4 = new da$a();
                ((da$a)object4).k = n7;
                ((da$a)object4).g = n7;
                ((da$a)object4).n = object = this.x(storeInfo);
                ((da$a)object4).u = object3;
                ((da$a)object4).a();
                object4 = new fu_1(this, storeInfo);
                view.setOnClickListener((View.OnClickListener)object4);
            }
        }
    }

    public final String x(StoreInfo object) {
        Object[] objectArray;
        int n3;
        Intrinsics.checkNotNullParameter(object, "store");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        stringCompanionObject = this.k;
        Object object2 = stringCompanionObject.getContext();
        int n4 = R$string.acc_store_unselected;
        object2 = object2.getString(n4);
        String string2 = "getString(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        String string3 = ((StoreInfo)object).storeId;
        int n7 = 1;
        Object object3 = new Object[n7];
        object3[0] = string3;
        string3 = "format(...)";
        object2 = xh2_0.a((Object[])object3, n7, (String)object2, string3);
        object3 = ((StoreInfo)object).getStoreSubTitle();
        String string4 = ". ";
        object2 = n1.a((String)object2, string4, (String)object3);
        object3 = ((StoreInfo)object).storeId;
        if (object3 != null && (n3 = ((String)object3).equals(objectArray = od3_2.a())) == n7) {
            n3 = (int)(this.e ? 1 : 0);
            if (n3 != 0) {
                string2 = ((StoreInfo)object).getInactiveAltText();
                if (string2 != null) {
                    object2 = string2;
                }
                stringCompanionObject.setContentDescription((CharSequence)object2);
            } else {
                object2 = stringCompanionObject.getContext();
                int n8 = R$string.acc_store_selected;
                object2 = object2.getString(n8);
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                string2 = ((StoreInfo)object).storeId;
                objectArray = new Object[n7];
                objectArray[0] = string2;
                object2 = xh2_0.a(objectArray, n7, (String)object2, string3);
                string2 = ((StoreInfo)object).getStoreSubTitle();
                object2 = n1.a((String)object2, string4, string2);
                string2 = ((StoreInfo)object).getActiveAltText();
                if (string2 != null) {
                    object2 = string2;
                }
                stringCompanionObject.setContentDescription((CharSequence)object2);
            }
            object = n3 != 0 ? ((StoreInfo)object).inactiveImageUrl : ((StoreInfo)object).activeImageUrl;
        } else {
            string2 = ((StoreInfo)object).getInactiveAltText();
            if (string2 != null) {
                object2 = string2;
            }
            stringCompanionObject.setContentDescription((CharSequence)object2);
            object = ((StoreInfo)object).inactiveImageUrl;
        }
        return object;
    }
}

