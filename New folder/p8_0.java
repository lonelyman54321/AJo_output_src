/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Closet.ClosetComponentModel;
import com.ril.ajio.services.data.Home.HomePageRatingResponse;
import com.ril.ajio.services.data.Home.UserUnratedItem;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from P8
 */
public final class p8_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p8_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        Object[] objectArray = null;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n4 = this.a;
        object = (DataCallback)object;
        switch (n4) {
            default: {
                object3 = (GD2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                hv3_0.s0(((GD2)object3).g);
                object2 = cp_1.Companion;
                int n7 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n7 != 0) {
                    int n8;
                    n7 = 8;
                    n4 = 0;
                    if (object != null && (n8 = ((DataCallback)object).getStatus()) == 0) {
                        if ((object = (object = (HomePageRatingResponse)((DataCallback)object).getData()) != null ? ((HomePageRatingResponse)object).getUserUnratedItems() : null) != null && (n8 = (int)(object.isEmpty() ? 1 : 0)) == 0) {
                            boolean bl2;
                            object2 = ((GD2)object3).h;
                            if (object2 != null) {
                                object2.setVisibility(0);
                            }
                            Object object4 = ((Fragment)object3).requireActivity();
                            object2 = new LinearLayoutManager((Context)object4, n3, false);
                            ArrayList arrayList = new ArrayList();
                            object = object.iterator();
                            while (bl2 = object.hasNext()) {
                                Object object5 = object.next();
                                int n10 = n4 + 1;
                                if (n4 >= 0) {
                                    object5 = (UserUnratedItem)object5;
                                    int n14 = 2;
                                    if (n4 < n14) {
                                        arrayList.add(object5);
                                    }
                                    n4 = n10;
                                    continue;
                                }
                                xx_2.n();
                                throw null;
                            }
                            object4 = new sk0_0(arrayList);
                            object = ((GD2)object3).e;
                            if (object != null) {
                                ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
                            }
                            if ((object = ((GD2)object3).e) != null) {
                                ((RecyclerView)object).setAdapter((RecyclerView$f)object4);
                            }
                            ((sk0_0)object4).b = object = new ID2((GD2)object3);
                        } else {
                            object = ((GD2)object3).b;
                            if (object != null) {
                                object.setVisibility(0);
                            }
                            if ((object = ((GD2)object3).c) != null) {
                                object.setVisibility(n7);
                            }
                        }
                    } else {
                        n8 = ((DataCallback)object).getStatus();
                        if (n8 == n3) {
                            yn3$a yn3$a = yn3_0.a;
                            if ((object = ((DataCallback)object).getError()) != null) {
                                objectArray = ((DataError)object).getErrorMessage();
                            }
                            String string2 = "Error is :";
                            object = new StringBuilder(string2);
                            ((StringBuilder)object).append(objectArray);
                            object = ((StringBuilder)object).toString();
                            objectArray = new Object[]{};
                            yn3$a.a((String)object, objectArray);
                            object = ((GD2)object3).b;
                            if (object != null) {
                                object.setVisibility(0);
                            }
                            if ((object = ((GD2)object3).c) != null) {
                                object.setVisibility(n7);
                            }
                        }
                    }
                }
                return Unit.a;
            }
            case 1: {
                object3 = (op2_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                ((op2_2)object3).w.k(object);
                return Unit.a;
            }
            case 0: 
        }
        Object object6 = q9_0.Companion;
        object3 = (q9_0)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object6 = cp_1.Companion;
        n3 = nn_2.b((cp$a)object6, (DataCallback)object);
        if (n3 != 0) {
            object6 = ((q9_0)object3).X;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ajiohomeViewModel");
                n3 = 0;
                object6 = null;
            }
            if ((n3 = w61_0.b((String)(object6 = object6.r))) != 0) {
                object6 = ((q9_0)object3).Z;
                if (object6 == null) {
                    object6 = "commonCmsViewDelegate";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                } else {
                    objectArray = object6;
                }
                object6 = ((q9_0)object3).m;
                object = (ClosetComponentModel)((DataCallback)object).getData();
                objectArray.c((ArrayList)object6, (ClosetComponentModel)object);
            }
        }
        return Unit.a;
    }
}

