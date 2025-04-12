/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.media3.exoplayer.e;
import com.ril.ajio.customviews.widgets.ImageSearchCategoryWidget;
import com.ril.ajio.fleek.stories.customview.StoriesProgressView;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from k4
 */
public final class k4_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnClickListener b;

    public /* synthetic */ k4_0(int n3, View.OnClickListener onClickListener) {
        this.a = n3;
        this.b = onClickListener;
    }

    public final void onClick(View object) {
        String string2 = "this$0";
        View.OnClickListener onClickListener = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                ImageSearchCategoryWidget.b((ImageSearchCategoryWidget)onClickListener, (View)object);
                return;
            }
            case 1: {
                object = pj0_2.Companion;
                onClickListener = (pj0_2)onClickListener;
                Intrinsics.checkNotNullParameter(onClickListener, string2);
                onClickListener.getClass();
                object = pj0_2.U;
                string2 = null;
                object.put(0, 0);
                object = onClickListener.D;
                if (object != null) {
                    ((StoriesProgressView)((Object)object)).b();
                }
                if ((object = onClickListener.n) != null) {
                    ((e)object).stop();
                }
                if ((object = onClickListener.n) != null) {
                    ((e)object).release();
                }
                object = onClickListener.h;
                String string3 = "fleekViewModel";
                Object object2 = null;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    object = null;
                }
                ((dr0_0)object).O.setValue(null);
                object = onClickListener.h;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    object2 = object;
                }
                ((dr0_0)object2).N = false;
                object = onClickListener.o;
                if (object != null) {
                    object.z1();
                }
                return;
            }
            case 0: 
        }
        onClickListener = (AddAddressFragment)onClickListener;
        Intrinsics.checkNotNullParameter(onClickListener, string2);
        object = onClickListener.getActivity();
        if (object != null) {
            ((ComponentActivity)object).onBackPressed();
        }
    }
}

