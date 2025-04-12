/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.services.data.Home.BottomNavigationData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from F81
 */
public final class f81_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f81_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (ArrayList)object;
                object2 = (q22_0)object2;
                Object object3 = "this$0";
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                if (object != null && (n3 = (int)(og1_1.c() ? 1 : 0)) == 0) {
                    object3 = h40_0.a;
                    object3 = ((q22_0)object2).cb();
                    n3 = (int)(h40_0.P0(((F12)object3).b()) ? 1 : 0);
                    if (n3 != 0 && (n3 = (int)(((q22_0)object2).y0 ? 1 : 0)) == 0) {
                        int n4;
                        n3 = (int)(((ArrayList)object).isEmpty() ? 1 : 0);
                        ((q22_0)object2).x0 = n3;
                        int n7 = 0;
                        if (n3 != 0) {
                            object3 = ((q22_0)object2).D;
                            if (object3 != null) {
                                n4 = 8;
                                object3.setVisibility(n4);
                            }
                        } else {
                            object3 = ((q22_0)object2).D;
                            if (object3 != null) {
                                object3.setVisibility(0);
                            }
                        }
                        n3 = (int)(((q22_0)object2).x0 ? 1 : 0);
                        n4 = 0;
                        xb3_2 xb3_22 = null;
                        if (n3 != 0) {
                            while (true) {
                                if ((object3 = ((q22_0)object2).B) != null) {
                                    n3 = ((RecyclerView)object3).getItemDecorationCount();
                                    object3 = n3;
                                } else {
                                    n3 = 0;
                                    object3 = null;
                                }
                                Intrinsics.checkNotNull(object3);
                                n3 = (Integer)object3;
                                if (n3 <= 0) break;
                                object3 = ((q22_0)object2).B;
                                if (object3 == null) continue;
                                ((RecyclerView)object3).removeItemDecorationAt(0);
                            }
                            object3 = ((q22_0)object2).B;
                            if (object3 != null) {
                                n7 = mz3_0.d(0);
                                xb3_22 = new xb3_2(n7);
                                ((RecyclerView)object3).addItemDecoration(xb3_22);
                            }
                        } else {
                            while (true) {
                                if ((object3 = ((q22_0)object2).B) != null) {
                                    n3 = ((RecyclerView)object3).getItemDecorationCount();
                                    object3 = n3;
                                } else {
                                    n3 = 0;
                                    object3 = null;
                                }
                                Intrinsics.checkNotNull(object3);
                                n3 = (Integer)object3;
                                if (n3 <= 0) break;
                                object3 = ((q22_0)object2).B;
                                if (object3 == null) continue;
                                ((RecyclerView)object3).removeItemDecorationAt(0);
                            }
                            object3 = ((q22_0)object2).B;
                            if (object3 != null) {
                                n7 = mz3_0.d(0);
                                xb3_22 = new xb3_2(n7);
                                ((RecyclerView)object3).addItemDecoration(xb3_22);
                            }
                        }
                        object3 = ((q22_0)object2).n;
                        ((ArrayList)object3).clear();
                        ((ArrayList)object3).addAll(object);
                        object2 = ((q22_0)object2).t;
                        if (object2 != null) {
                            ((hZ1)object2).g((ArrayList)object);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object2 = (zr1_1)object2;
        object = (BottomNavigationData)object;
        return HomeRepo.w((zr1_1)object2, (BottomNavigationData)object);
    }
}

