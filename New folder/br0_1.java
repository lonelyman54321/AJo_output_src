/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.DataCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BR0
 */
public final class br0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ br0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        object = (DataCallback)object;
        switch (n3) {
            default: {
                object3 = (vv2_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = cp_1.Companion;
                boolean bl2 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (!bl2) return Unit.a;
                if ((object = (List)((DataCallback)object).getData()) == null) return Unit.a;
                object = (Collection)object;
                object2 = new ArrayList(object);
                ((vv2_2)object3).D0 = object2;
                int n4 = ((vv2_2)object3).w0;
                object2 = ((vv2_2)object3).t;
                n3 = 0;
                Object object4 = null;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchViewModel");
                    bl2 = false;
                    object2 = null;
                }
                object2 = ((yw2_0)object2).t;
                int n7 = 1;
                if (n4 == 0 && (object = KU2.d) != null && (n4 = ((Integer)object).intValue()) == n7 && (object2 == null || (n4 = ((String)object2).length()) == 0) || (n4 = ((vv2_2)object3).w0) != 0 && (object = KU2.c) != null && (n4 = ((Integer)object).intValue()) == n7) {
                    object = ((vv2_2)object3).D0;
                    if (object != null) {
                        n4 = ((ArrayList)object).size();
                        object = n4;
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    Intrinsics.checkNotNull(object);
                    n4 = (Integer)object;
                    object2 = "recentSearchTvRefresh";
                    n7 = 8;
                    if (n4 > 0) {
                        object = ((vv2_2)object3).B;
                        if (object != null) {
                            object.setVisibility(0);
                        }
                        if ((object = ((vv2_2)object3).D) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        } else {
                            object4 = object;
                        }
                        object4.setVisibility(0);
                        object = ((vv2_2)object3).h;
                        if (object != null) {
                            object.setVisibility(0);
                        }
                        object = z40_0.Companion;
                        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                        object2 = "recentSearchNewUIEnabled";
                        n4 = (int)(((ao0_0)object).a((String)object2) ? 1 : 0);
                        if (n4 != 0) {
                            object = ((vv2_2)object3).G;
                            if (object != null) {
                                object.setVisibility(0);
                            }
                        } else {
                            object = ((vv2_2)object3).G;
                            if (object != null) {
                                object.setVisibility(n7);
                            }
                        }
                        object2 = ((vv2_2)object3).D0;
                        ((vv2_2)object3).j = object = new zv2_2((ArrayList)object2, (AV2)object3);
                        ((zv2_2)object).c = bl2 = ((vv2_2)object3).i;
                        object2 = ((vv2_2)object3).B;
                        if (object2 == null) return Unit.a;
                        ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
                        return Unit.a;
                    }
                    object = ((vv2_2)object3).B;
                    if (object != null) {
                        object.setVisibility(n7);
                    }
                    if ((object = ((vv2_2)object3).D) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object4 = object;
                    }
                    object4.setVisibility(n7);
                    object = ((vv2_2)object3).G;
                    if (object != null) {
                        object.setVisibility(n7);
                    }
                    if ((object = ((vv2_2)object3).h) == null) return Unit.a;
                    object.setVisibility(n7);
                    return Unit.a;
                }
                object = ((vv2_2)object3).D0;
                if (object != null) {
                    n4 = ((ArrayList)object).size();
                    object2 = n4;
                    Intrinsics.checkNotNull(object2);
                    if (n4 > 0) {
                        object = ((vv2_2)object3).I0;
                        if (object == null) return Unit.a;
                        object2 = ((vv2_2)object3).D0;
                        ((e00)object).t((ArrayList)object2);
                        return Unit.a;
                    }
                }
                if ((object = ((vv2_2)object3).I0) == null) return Unit.a;
                object2 = new ArrayList();
                ((e00)object).t((ArrayList)object2);
                return Unit.a;
            }
            case 0: 
        }
        DR0$a dR0$a = dr0_0.Companion;
        object3 = (dr0_0)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        ((dr0_0)object3).E0.k(object);
        return Unit.a;
    }
}

