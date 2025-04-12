/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineData;
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineModel;
import com.ril.ajio.services.data.fleek.feedModel.Layout;
import com.ril.ajio.services.data.fleek.feedModel.PaginationInfo;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class DR0$g$a
implements fs0_2 {
    public final /* synthetic */ dr0_0 a;

    public DR0$g$a(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object emit(Object object, f80_0 object2) {
        int n3;
        int n4;
        Object object3;
        dr0_0 dr0_02;
        block39: {
            void var1_17;
            Layout layout2;
            void var1_11;
            Layout layout3;
            Object object4;
            String string2;
            Object object5;
            zr1_1 zr1_12;
            Object object6;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState;
            Object object7;
            int n7;
            Object object8;
            void var1_6;
            block37: {
                block38: {
                    boolean bl2;
                    kk2_1 kk2_12;
                    block35: {
                        p83_0 p83_02;
                        Component component;
                        p83_0 p83_03;
                        Layout layout4;
                        block36: {
                            int n8;
                            int n10;
                            kk2_12 = (kk2_1)object;
                            bl2 = kk2_12 instanceof KK2$c;
                            dr0_02 = this.a;
                            if (!bl2) break block35;
                            FeedEngineModel feedEngineModel = (FeedEngineModel)((KK2$c)kk2_12).a;
                            bl2 = false;
                            object3 = null;
                            if (feedEngineModel != null) {
                                FeedEngineData feedEngineData = feedEngineModel.getData();
                            } else {
                                n4 = 0;
                                Object var1_5 = null;
                            }
                            if (var1_6 != null && (object8 = var1_6.getPaginationInfo()) != null) {
                                object8 = ((PaginationInfo)object8).getTotalPages();
                            } else {
                                n10 = 0;
                                object8 = null;
                            }
                            n3 = 1;
                            n7 = 0;
                            object7 = null;
                            if (object8 == null || var1_6 != null && (object8 = var1_6.getPaginationInfo()) != null && (object8 = ((PaginationInfo)object8).getTotalPages()) != null && (n8 = dr0_02.C()) == (n10 = (Integer)object8 - n3)) {
                                n10 = 0;
                                object8 = null;
                            } else {
                                n10 = 1;
                            }
                            object8 = n10 != 0;
                            dr0_02.g.setValue(object8);
                            object8 = new p83_0();
                            parcelableSnapshotMutableState = dr0_02.z;
                            object6 = parcelableSnapshotMutableState.getValue();
                            boolean bl3 = object6 instanceof HK0$d;
                            object6 = bl3 ? (HK0$d)object6 : null;
                            object6 = object6 != null ? ((HK0$d)object6).a : null;
                            zr1_12 = dr0_02.t;
                            if (object6 == null) break block36;
                            object5 = ((FeedEngineData)object6).getLayout();
                            string2 = "TOP-STORIES";
                            if (object5 == null || (object5 = ((Layout)object5).getComponents()) == null) break block37;
                            break block38;
                        }
                        dr0_02.D = var1_6;
                        if (var1_6 != null && (layout4 = var1_6.getLayout()) != null && (p83_03 = layout4.getComponents()) != null && (component = (Component)CollectionsKt.firstOrNull(p83_03)) != null && (p83_02 = component.getSubcomponent()) != null) {
                            zr1_12.k(p83_02);
                            p83_0 p83_04 = new p83_0();
                            zr1_12.k(p83_04);
                        }
                        break block39;
                    }
                    bl2 = kk2_12 instanceof KK2$a;
                    if (bl2) {
                        void var1_34;
                        int n14 = dr0_02.C();
                        if (n14 == 0) {
                            hv1_1 hv1_12 = hv1_1.ERROR;
                        } else {
                            hv1_1 hv1_13 = hv1_1.PAGINATION_ERROR;
                        }
                        dr0_02.b0((hv1_1)var1_34);
                        zr1_1 zr1_13 = dr0_02.u;
                        object3 = Boolean.TRUE;
                        zr1_13.k(object3);
                        return Unit.a;
                    }
                    boolean bl4 = kk2_12 instanceof KK2$b;
                    if (bl4) {
                        return Unit.a;
                    }
                    NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                    throw noWhenBranchMatchedException;
                }
                object5 = ((p83_0)object5).listIterator();
                int n15 = 0;
                object4 = null;
                while (true) {
                    Object object9 = object5;
                    object9 = (ob3_2)object5;
                    int n16 = ((ob3_2)object9).hasNext();
                    if (n16 == 0) break;
                    object9 = ((ob3_2)object9).next();
                    n16 = n15 + 1;
                    if (n15 < 0) {
                        xx_2.n();
                        throw null;
                    }
                    if ((object9 = (Component)object9) != null) {
                        object4 = ((Component)object9).getSubType();
                    } else {
                        n15 = 0;
                        object4 = null;
                    }
                    n15 = (int)(Intrinsics.areEqual(object4, string2) ? 1 : 0);
                    if (n15 != 0 && (object4 = ((Component)object9).getSubcomponent()) != null) {
                        object8 = object4;
                    }
                    n15 = n16;
                }
            }
            if (var1_6 != null && (layout3 = var1_6.getLayout()) != null) {
                p83_0 p83_05 = layout3.getComponents();
            } else {
                n4 = 0;
                Object var1_10 = null;
            }
            object5 = new p83_0();
            if (var1_11 != null) {
                ListIterator listIterator = var1_11.listIterator();
                while (true) {
                    object4 = listIterator;
                    object4 = (ob3_2)listIterator;
                    int n17 = ((ob3_2)object4).hasNext();
                    if (n17 == 0) break;
                    object4 = ((ob3_2)object4).next();
                    n17 = n7 + 1;
                    if (n7 < 0) {
                        xx_2.n();
                        throw null;
                    }
                    if ((object4 = (Component)object4) != null) {
                        object7 = ((Component)object4).getSubType();
                    } else {
                        n7 = 0;
                        object7 = null;
                    }
                    n7 = (int)(Intrinsics.areEqual(object7, string2) ? 1 : 0);
                    if (n7 != 0 && (object7 = ((Component)object4).getSubcomponent()) != null) {
                        ((p83_0)object5).addAll((Collection)object7);
                    }
                    n7 = n17;
                }
            }
            if ((n4 = ((p83_0)object5).isEmpty() ^ n3) != 0) {
                ((p83_0)object8).addAll((Collection)object5);
            }
            if ((layout2 = ((FeedEngineData)object6).getLayout()) != null) {
                p83_0 p83_06 = layout2.getComponents();
            } else {
                n4 = 0;
                Object var1_16 = null;
            }
            if (var1_17 != null) {
                ListIterator listIterator = var1_17.listIterator();
                while (true) {
                    object7 = listIterator;
                    object7 = (ob3_2)listIterator;
                    boolean bl5 = ((ob3_2)object7).hasNext();
                    if (!bl5) break;
                    if ((object7 = (Component)((ob3_2)object7).next()) != null) {
                        object5 = ((Component)object7).getSubType();
                    } else {
                        bl5 = false;
                        object5 = null;
                    }
                    bl5 = Intrinsics.areEqual(object5, string2);
                    if (!bl5) {
                        if (object7 != null) {
                            object5 = ((Component)object7).getSubType();
                        } else {
                            bl5 = false;
                            object5 = null;
                        }
                        if (!(bl5 = Intrinsics.areEqual(object5, object4 = "INTERNAL_SCROLL-STORIES"))) continue;
                    }
                    ((Component)object7).setSubcomponent((p83_0)object8);
                }
            }
            dr0_0.b(dr0_02, (FeedEngineData)object6);
            HK0$d hK0$d = new HK0$d((FeedEngineData)object6);
            parcelableSnapshotMutableState.setValue(hK0$d);
            dr0_02.D = null;
            zr1_12.k(object8);
            p83_0 p83_07 = new p83_0();
            zr1_12.k(p83_07);
            n4 = dr0_02.C();
            if (n4 == 0) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = dr0_02.Y;
                object3 = Boolean.TRUE;
                parcelableSnapshotMutableState2.setValue(object3);
            }
        }
        hv1_1 hv1_14 = hv1_1.IDLE;
        dr0_02.b0(hv1_14);
        Boolean bl6 = (Boolean)dr0_02.g.getValue();
        n4 = bl6.booleanValue();
        if (n4 == 0) return Unit.a;
        n4 = dr0_02.C() + n3;
        Integer n18 = n4;
        object3 = dr0_02.f;
        ((h83_0)object3).setValue(n18);
        return Unit.a;
    }
}

