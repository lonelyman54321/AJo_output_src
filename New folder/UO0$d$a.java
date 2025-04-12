/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.NavigationDataClass;
import com.ril.ajio.services.data.Home.NavigationParent;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class UO0$d$a
implements fs0_2 {
    public final /* synthetic */ dr0_0 a;

    public UO0$d$a(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object emit(Object iterator, f80_0 f80_02) {
        Object object = iterator;
        object = (DataCallback)((Object)iterator);
        boolean bl2 = ((DataCallback)object).getStatus();
        dr0_0 dr0_02 = this.a;
        boolean bl3 = true;
        if (bl2) {
            if (bl2 == bl3) {
                object = h40_0.a;
                boolean bl4 = h40_0.c();
                if (bl4) {
                    dr0_02.Z(bl3);
                }
            }
        } else {
            object = (NavigationParent)((DataCallback)object).getData();
            dr0_02.getClass();
            p83_0 p83_02 = new p83_0();
            if (object != null) {
                boolean bl5;
                if ((object = ((NavigationParent)object).getData()) != null && (object = ((NavigationDataClass)object).getChildDetails()) != null) {
                    boolean bl6;
                    object = ((Iterable)object).iterator();
                    while (bl6 = object.hasNext()) {
                        yz_0 yz_02;
                        Object object2 = (CMSNavigation)object.next();
                        Object object3 = ((CMSNavigation)object2).getUrl();
                        Intrinsics.checkNotNull(object3);
                        String string2 = TQ1.e((String)object3);
                        Object object4 = ((CMSNavigation)object2).getAlternateData();
                        String string3 = null;
                        object4 = object4 != null ? ((CMSNavigation)object4).getInactiveImageUrl() : null;
                        Object object5 = ((CMSNavigation)object2).getAlternateData();
                        if (object5 != null) {
                            string3 = ((CMSNavigation)object5).getName();
                        }
                        object3 = new Object();
                        ((he_1)object3).a = object4;
                        ((he_1)object3).b = string3;
                        string3 = ((CMSNavigation)object2).getName();
                        Intrinsics.checkNotNull(string3);
                        object4 = ((CMSNavigation)object2).getInactiveImageUrl();
                        object5 = "";
                        Object object6 = object4 == null ? object5 : object4;
                        object4 = ((CMSNavigation)object2).getActiveImageUrl();
                        Object object7 = object4 == null ? object5 : object4;
                        object4 = ((CMSNavigation)object2).getActiveMediaType();
                        Object object8 = object4 == null ? object5 : object4;
                        object2 = ((CMSNavigation)object2).getInactiveMediaType();
                        if (object2 == null) {
                            object2 = object5;
                        }
                        int n3 = dr0_0.t(string2, false);
                        int n4 = dr0_0.t(string2, bl3);
                        object4 = yz_02;
                        object5 = object6;
                        object6 = object7;
                        object7 = object8;
                        object8 = object2;
                        object2 = yz_02;
                        yz_02 = new yz_0(string3, object5, object6, string2, (String)object7, (String)object8, n3, n4, (he_1)object3);
                        p83_02.add(yz_02);
                    }
                }
                if (bl5 = p83_02.isEmpty() ^ bl3) {
                    object = dr0_02.P;
                    ((h83_0)object).setValue(p83_02);
                }
            }
        }
        return Unit.a;
    }
}

