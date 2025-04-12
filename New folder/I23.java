/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class I23
implements F62 {
    public final /* synthetic */ J23 a;

    public /* synthetic */ I23(J23 j23) {
        this.a = j23;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        Object object2 = J23.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object2.getClass();
        Object object3 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n3 != 0) {
            Intrinsics.checkNotNull(object);
            n3 = ((DataCallback)object).getStatus();
            if (n3 != 0) {
                int n4 = 1;
                if (n3 == n4) {
                    ((J23)object2).Oa();
                }
            } else {
                object3 = ((DataCallback)object).getData();
                if (object3 != null) {
                    object3 = ((DataCallback)object).getData();
                    Intrinsics.checkNotNull(object3);
                    object3 = (List)object3;
                    n3 = (int)(object3.isEmpty() ? 1 : 0);
                    Object object4 = null;
                    if (n3 != 0) {
                        boolean bl2 = ((J23)object2).f;
                        if (bl2) {
                            object = ((J23)object2).e;
                            if (object == null) {
                                object = "swmlFragmentListener";
                                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                            } else {
                                object4 = object;
                            }
                            object4.G0();
                        } else {
                            ((J23)object2).Oa();
                        }
                    } else {
                        object = ((DataCallback)object).getData();
                        Intrinsics.checkNotNull(object);
                        object = (List)object;
                        ((J23)object2).d = object3 = new g23_0((List)object, (e23_0)object2);
                        object = ((J23)object2).b;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("sharedWithMeViewModel");
                            boolean bl3 = false;
                            object = null;
                        }
                        object = UserInformation.getInstance((Context)((Hj)object).getApplication()).getEncryptedUuid();
                        Intrinsics.checkNotNullExpressionValue(object, "getEncryptedUuid(...)");
                        String string2 = "uu";
                        Intrinsics.checkNotNullParameter(object, string2);
                        ((g23_0)object3).c = object;
                        object = ((J23)object2).Pa().fswmlRvList;
                        Intrinsics.checkNotNullExpressionValue(object, "fswmlRvList");
                        ai0_2.B((View)object);
                        object = ((J23)object2).Pa().fswmlRvList;
                        object3 = ((J23)object2).d;
                        if (object3 == null) {
                            object3 = "sharedWithMeListAdapter";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        } else {
                            object4 = object3;
                        }
                        ((RecyclerView)object).setAdapter((RecyclerView$f)object4);
                        object = ((J23)object2).Pa().fswmlProgressBar;
                        object3 = "fswmlProgressBar";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                        ai0_2.i((View)object);
                        object = ((J23)object2).Pa().sharedWithMeState.fswmdLayoutState;
                        object2 = "fswmdLayoutState";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                        ai0_2.i((View)object);
                    }
                }
            }
        }
    }
}

