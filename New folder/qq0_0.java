/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Home.NavigationDataClass;
import com.ril.ajio.services.data.Home.NavigationParent;
import java.io.IOException;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qq0
 */
public final class qq0_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qq0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl2;
                object = (DataCallback)object;
                Object object2 = (ed3_2)this.b;
                Object object3 = "this$0";
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object2.getClass();
                if (object == null) return Unit.a;
                object3 = cp_1.Companion;
                int n4 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (n4 == 0) return Unit.a;
                n4 = ((DataCallback)object).getStatus();
                if (n4 != 0) return Unit.a;
                ((ed3_2)object2).n = object = (NavigationParent)((DataCallback)object).getData();
                object3 = "homeListener";
                Object object4 = null;
                if (object != null) {
                    Intrinsics.checkNotNull(object);
                    object = ((NavigationParent)object).getData();
                    if (object != null) {
                        object = ((NavigationDataClass)object).getChildDetails();
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    if (object != null) {
                        object = ((ed3_2)object2).n;
                        Intrinsics.checkNotNull(object);
                        object = ((NavigationParent)object).getData();
                        if (object != null) {
                            object = ((NavigationDataClass)object).getChildDetails();
                        } else {
                            bl2 = false;
                            object = null;
                        }
                        Intrinsics.checkNotNull(object);
                        object = (Collection)object;
                        bl2 = object.isEmpty() ^ true;
                        if (bl2) {
                            object = ((ed3_2)object2).g;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                bl2 = false;
                                object = null;
                            }
                            object3 = ((ed3_2)object2).n;
                            object2 = ((ed3_2)object2).j;
                            if (object2 == null) {
                                object2 = "mStoreLPViewModel";
                                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                            } else {
                                object4 = object2;
                            }
                            object2 = ((uc3_2)object4).c;
                            object.w((NavigationParent)object3, (String)object2);
                            return Unit.a;
                        }
                    }
                }
                if ((object = ((ed3_2)object2).g) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    bl2 = false;
                    object = null;
                }
                object.w(null, null);
                return Unit.a;
            }
            case 0: 
        }
        object = (IOException)object;
        ((Sq0)this.b).k = true;
        return Unit.a;
    }
}

