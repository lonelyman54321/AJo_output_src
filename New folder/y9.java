/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.view.View
 *  android.widget.ImageView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import kotlin.jvm.internal.Intrinsics;

public final class y9
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y9(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = 1;
        Object object = "this$0";
        Object object2 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object2 = (p71_0)object2;
                Intrinsics.checkNotNullParameter(object2, object);
                object2.getClass();
                object = new hn0_0(object2, n3);
                ((p71_0)object2).k.post((Runnable)object);
                return;
            }
            case 0: 
        }
        object2 = (q9_0)object2;
        Intrinsics.checkNotNullParameter(object2, object);
        object = ((q9_0)object2).D1;
        if (object != null) {
            n4 = 8;
            object.setVisibility(n4);
        }
        int n7 = 0;
        object = null;
        ((q9_0)object2).P1 = false;
        n4 = 0;
        Object object3 = null;
        ((q9_0)object2).J2 = null;
        Object object4 = h40_0.a;
        boolean bl2 = h40_0.i1();
        if (bl2) {
            object4 = cp_1.Companion;
            object4.getClass();
            bl2 = cp$a.h();
            if (!bl2) {
                Object object5;
                object4 = ((q9_0)object2).X;
                String string2 = "ajiohomeViewModel";
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object4 = null;
                }
                if (!((bl2 = ((x9_0)object4).i((String)(object5 = od3_2.a()))) || (bl2 = Intrinsics.areEqual(object4 = od3_2.a(), object5 = ld3_2.STORE_LUXE.getStoreId())) || (bl2 = hu1_2.b))) {
                    ImageView imageView = ((q9_0)object2).W1;
                    object4 = ((q9_0)object2).X;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object3 = object4;
                    }
                    object3 = ((x9_0)object3).b;
                    object4 = "image_search_coachmark";
                    n7 = ((sw_0)object3).getPreference((String)object4, 0);
                    if (n7 < n3 && imageView != null) {
                        ((q9_0)object2).Y0 = n3;
                        object5 = ((Fragment)object2).getActivity();
                        int n8 = R$color.color_2c4152;
                        int n10 = R$string.closet_image_search;
                        int n14 = R$string.closet_image_search_desc;
                        FontsManager fontsManager = FontsManager.getInstance();
                        AJIOApplication.Companion.getClass();
                        object = AJIOApplication$a.a();
                        Typeface typeface = fontsManager.getTypefaceWithFont((Context)object, 10);
                        fontsManager = FontsManager.getInstance();
                        object = AJIOApplication$a.a();
                        n4 = 9;
                        Typeface typeface2 = fontsManager.getTypefaceWithFont((Context)object, n4);
                        x9 x93 = new x9((q9_0)object2);
                        int n15 = 50;
                        iw_2.a((FragmentActivity)object5, (View)imageView, n8, n10, n14, n15, typeface, typeface2, x93);
                    }
                }
            }
        }
    }
}

