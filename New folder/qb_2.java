/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.database.entity.SearchRv;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from qb
 */
public final class qb_2
implements F62 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ qb_2(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onChanged(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                int n4;
                object = (List)object;
                Object object2 = (vv2_2)this.b;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                Intrinsics.checkNotNullParameter(object, "productsListDataCallback");
                ((vv2_2)object2).q0.clear();
                ((vv2_2)object2).p0.clear();
                Object object3 = ((vv2_2)object2).q0;
                Object object4 = ((vv2_2)object2).t;
                String string2 = "searchViewModel";
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object4 = null;
                }
                object4 = ((yw2_0)object4).y;
                ((ArrayList)object3).addAll(object4);
                int n7 = ((ArrayList)object3).size();
                n4 = 1;
                if (n7 > n4) {
                    int n8;
                    boolean bl2;
                    object3 = new StringBuilder();
                    object = object.iterator();
                    while (bl2 = object.hasNext()) {
                        String string3 = ((SearchRv)object.next()).getProductCode();
                        ((StringBuilder)object3).append(string3);
                        string3 = ",";
                        ((StringBuilder)object3).append(string3);
                    }
                    object = ((vv2_2)object2).t;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n8 = 0;
                        object = null;
                    }
                    object2 = ((StringBuilder)object3).toString();
                    string2 = "toString(...)";
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                    n7 = ((StringBuilder)object3).length() - n4;
                    n4 = 0;
                    object4 = null;
                    object2 = ((String)object2).substring(0, n7);
                    Intrinsics.checkNotNullExpressionValue(object2, "substring(...)");
                    object.getClass();
                    object3 = "queryString";
                    Intrinsics.checkNotNullParameter(object2, (String)object3);
                    if (object2 != null && (n7 = ((String)(object3 = ((Object)StringsKt.m0((CharSequence)object2)).toString())).length()) != 0) {
                        object3 = md3_0.c((jD3)object);
                        object4 = new tw2_0(null, (yw2_0)object, (String)object2);
                        n8 = 3;
                        Ae3.d((i90_0)object3, null, null, (Function2)object4, n8);
                    }
                }
                return;
            }
            case 0: 
        }
        object = (Integer)object;
        AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment = (AjioVideoPlayerFullScreenFragment)this.b;
        String string4 = "this$0";
        Intrinsics.checkNotNullParameter(ajioVideoPlayerFullScreenFragment, string4);
        ajioVideoPlayerFullScreenFragment = ajioVideoPlayerFullScreenFragment.h;
        if (ajioVideoPlayerFullScreenFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekbar");
            n3 = 0;
            ajioVideoPlayerFullScreenFragment = null;
        }
        int n10 = (Integer)object;
        ajioVideoPlayerFullScreenFragment.setProgress(n10);
    }
}

