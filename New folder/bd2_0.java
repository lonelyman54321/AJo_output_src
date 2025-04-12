/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.ratings.UploadImageAttributes;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BD2
 */
public final class bd2_0
implements HO2 {
    public final /* synthetic */ wd2_0 a;

    public bd2_0(wd2_0 wd2_02) {
        this.a = wd2_02;
    }

    public final void a(int n3, String object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "id");
        object = this.a;
        Object object2 = ((Fragment)object).getView();
        if (object2 != null) {
            ai0_2.j((View)object2);
        }
        object2 = ((wd2_0)object).N.get(n3);
        Intrinsics.checkNotNullExpressionValue(object2, "get(...)");
        object2 = (UploadImageAttributes)object2;
        AjioTextView ajioTextView = null;
        ((UploadImageAttributes)object2).setImageUploadProgressPercent(0);
        ((UploadImageAttributes)object2).setImageUploadStatus("IN_PROGRESS");
        ((wd2_0)object).N.set(n3, object2);
        Object object3 = ((wd2_0)object).M;
        if (object3 != null) {
            ((RecyclerView$f)object3).notifyItemChanged(n3);
        }
        object3 = ((wd2_0)object).N.iterator();
        int n4 = 0;
        String string2 = null;
        while (bl2 = object3.hasNext()) {
            String string3;
            Object object4 = (UploadImageAttributes)object3.next();
            String string4 = ((UploadImageAttributes)object4).getViewType();
            boolean bl3 = Intrinsics.areEqual(string4, string3 = "REVIEW_IMAGE");
            if (!bl3 || !(bl2 = Intrinsics.areEqual(object4 = ((UploadImageAttributes)object4).getImageUploadStatus(), string4 = "ERROR"))) continue;
            n4 = 1;
        }
        if (n4 != 0) {
            object3 = ((wd2_0)object).T;
            if (object3 != null) {
                n4 = R$string.image_upload_error;
                string2 = ((Fragment)object).getString(n4);
                object3.setText((CharSequence)string2);
            }
            if ((object3 = ((wd2_0)object).T) != null) {
                object3.setVisibility(0);
            }
            if ((ajioTextView = ((wd2_0)object).T) != null) {
                ai0_2.a((View)ajioTextView);
            }
        } else {
            ajioTextView = ((wd2_0)object).T;
            if (ajioTextView != null) {
                int n7 = 8;
                ajioTextView.setVisibility(n7);
            }
        }
        ((wd2_0)object).jb(n3, (UploadImageAttributes)object2);
    }
}

