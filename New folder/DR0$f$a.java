/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineData;
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineModel;
import com.ril.ajio.services.data.fleek.feedModel.Layout;
import com.ril.ajio.services.data.fleek.feedModel.PaginationInfo;
import com.ril.ajio.services.data.fleek.feedModel.SeenPost;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class DR0$f$a
implements fs0_2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ Ref$BooleanRef b;

    public DR0$f$a(dr0_0 dr0_02, Ref$BooleanRef ref$BooleanRef) {
        this.a = dr0_02;
        this.b = ref$BooleanRef;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object emit(Object object, f80_0 f80_02) {
        boolean bl2;
        p83_0 p83_02;
        Object object2;
        ArrayList<Object> arrayList;
        Object object3;
        Object object4;
        int n3;
        int n4;
        Object object5;
        int n7;
        pb3_0 pb3_02;
        DR0$f$a dR0$f$a = this;
        Object object6 = object;
        object6 = (kk2_1)object;
        boolean bl3 = object6 instanceof KK2$c;
        Object object7 = this.a;
        if (bl3) {
            int n8;
            int n10;
            pb3_02 = new p83_0();
            object6 = (FeedEngineModel)((KK2$c)object6).a;
            if (object6 != null) {
                object6 = ((FeedEngineModel)object6).getData();
            } else {
                n7 = 0;
                object6 = null;
            }
            if (object6 != null && (object5 = ((FeedEngineData)object6).getPaginationInfo()) != null) {
                object5 = ((PaginationInfo)object5).getTotalPages();
            } else {
                n10 = 0;
                object5 = null;
            }
            n4 = 1;
            n3 = 0;
            object4 = null;
            if (object5 == null || object6 != null && (object5 = ((FeedEngineData)object6).getPaginationInfo()) != null && (object5 = ((PaginationInfo)object5).getTotalPages()) != null && (n8 = ((dr0_0)object7).v()) == (n10 = (Integer)object5 - n4)) {
                n10 = 0;
                object5 = null;
            } else {
                n10 = 1;
            }
            object5 = n10 != 0;
            ((dr0_0)object7).d.setValue(object5);
            object5 = ((dr0_0)object7).z;
            object3 = ((h83_0)object5).getValue();
            boolean bl4 = object3 instanceof HK0$d;
            if (bl4) {
                object3 = (HK0$d)object3;
            } else {
                n8 = 0;
                object3 = null;
            }
            if (object3 != null) {
                object3 = ((HK0$d)object3).a;
            } else {
                n8 = 0;
                object3 = null;
            }
            arrayList = new ArrayList<Object>();
            int n14 = ((dr0_0)object7).v();
            object2 = n14 == 0 || object3 == null ? object6 : object3;
            p83_02 = new p83_0();
            if (object3 != null && (object3 = ((FeedEngineData)object3).getLayout()) != null) {
                object3 = ((Layout)object3).getComponents();
            } else {
                n8 = 0;
                object3 = null;
            }
            if (object6 != null && (object6 = ((FeedEngineData)object6).getLayout()) != null) {
                object6 = ((Layout)object6).getComponents();
            } else {
                n7 = 0;
                object6 = null;
            }
            if (object3 != null && !(bl2 = ((p83_0)object3).isEmpty())) {
                p83_02.addAll((Collection)object3);
            }
            if (object6 != null && (n8 = (int)(((p83_0)object6).isEmpty() ? 1 : 0)) == 0) {
                p83_02.addAll((Collection)object6);
            }
        } else {
            bl3 = object6 instanceof KK2$a;
            if (bl3) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((dr0_0)object7).z;
                object6 = ((KK2$a)object6).b;
                if (object6 == null) {
                    object6 = "";
                }
                object7 = new HK0$a((String)object6);
                parcelableSnapshotMutableState.setValue(object7);
                return Unit.a;
            }
            boolean bl5 = object6 instanceof KK2$b;
            if (bl5) {
                object6 = ((dr0_0)object7).z;
                HK0$b hK0$b = HK0$b.a;
                ((h83_0)object6).setValue(hK0$b);
                return Unit.a;
            }
            object6 = new NoWhenBranchMatchedException();
            throw object6;
        }
        object6 = p83_02.listIterator();
        while (true) {
            int n15;
            block64: {
                String string2;
                Object object8;
                Object object9;
                Object object10;
                String string3;
                Object object11;
                int n16;
                boolean bl6;
                boolean bl7;
                Object object12;
                Object object13;
                Object object14;
                Object object15;
                block58: {
                    block63: {
                        block59: {
                            block62: {
                                block60: {
                                    block61: {
                                        object3 = object6;
                                        object3 = (ob3_2)object6;
                                        n15 = ((ob3_2)object3).hasNext();
                                        object15 = dR0$f$a.b;
                                        if (n15 == 0) break block59;
                                        object3 = ((ob3_2)object3).next();
                                        n15 = n3 + 1;
                                        if (n3 < 0) {
                                            xx_2.n();
                                            throw null;
                                        }
                                        object3 = (Component)object3;
                                        object4 = ((dr0_0)object7).D;
                                        object14 = "INTERNAL_SCROLL-STORIES";
                                        object13 = "TOP-STORIES";
                                        if (object4 == null) break block60;
                                        if (object3 != null) {
                                            object4 = ((Component)object3).getSubType();
                                        } else {
                                            n3 = 0;
                                            object4 = null;
                                        }
                                        n3 = (int)(Intrinsics.areEqual(object4, object13) ? 1 : 0);
                                        if (n3 != 0) break block61;
                                        if (object3 != null) {
                                            object4 = ((Component)object3).getSubType();
                                        } else {
                                            n3 = 0;
                                            object4 = null;
                                        }
                                        n3 = (int)(Intrinsics.areEqual(object4, object14) ? 1 : 0);
                                        if (n3 == 0) break block60;
                                    }
                                    object4 = new p83_0();
                                    object12 = ((Component)object3).getSubcomponent();
                                    if (object12 != null && (bl7 = ((p83_0)object12).isEmpty() ^ true)) {
                                        ((p83_0)object4).addAll((Collection)object12);
                                    }
                                    if ((object12 = ((dr0_0)object7).D) != null && (object12 = ((FeedEngineData)object12).getLayout()) != null && (object12 = ((Layout)object12).getComponents()) != null && (object12 = (Component)CollectionsKt.firstOrNull((List)object12)) != null && (object12 = ((Component)object12).getSubcomponent()) != null) {
                                        ((p83_0)object4).addAll((Collection)object12);
                                    }
                                    ((Component)object3).setSubcomponent((p83_0)object4);
                                    ((Ref$BooleanRef)object15).element = n4;
                                }
                                if (object3 != null) {
                                    object4 = ((Component)object3).getSubType();
                                } else {
                                    n3 = 0;
                                    object4 = null;
                                }
                                n3 = (int)(Intrinsics.areEqual(object4, object13) ? 1 : 0);
                                if (n3 != 0) {
                                    if (object3 != null) {
                                        object4 = ((Component)object3).getSubcomponent();
                                    } else {
                                        n3 = 0;
                                        object4 = null;
                                    }
                                    if (object4 != null) {
                                        pb3_02 = ((Component)object3).getSubcomponent();
                                        Intrinsics.checkNotNull(pb3_02);
                                    }
                                }
                                if ((object4 = ((dr0_0)object7).D) == null) {
                                    if (object3 != null) {
                                        object4 = ((Component)object3).getSubType();
                                    } else {
                                        n3 = 0;
                                        object4 = null;
                                    }
                                    n3 = (int)(Intrinsics.areEqual(object4, object14) ? 1 : 0);
                                    if (n3 != 0) {
                                        if (object3 != null) {
                                            object4 = ((Component)object3).getSubcomponent();
                                        } else {
                                            n3 = 0;
                                            object4 = null;
                                        }
                                        if (object4 == null || object3 != null && (object4 = ((Component)object3).getSubcomponent()) != null && (n3 = (int)(((p83_0)object4).isEmpty() ? 1 : 0)) == n4) {
                                            ((Component)object3).setSubcomponent((p83_0)pb3_02);
                                        }
                                    }
                                }
                                if (object3 != null) {
                                    object4 = ((Component)object3).getSubType();
                                } else {
                                    n3 = 0;
                                    object4 = null;
                                }
                                object15 = "SEEN-POSTS";
                                n3 = (int)(Intrinsics.areEqual(object4, object15) ? 1 : 0);
                                if (n3 == 0 || (object4 = ((Component)object3).getSeenPosts()) == null || (n3 = (int)(((p83_0)object4).isEmpty() ? 1 : 0)) != 0) break block62;
                                object4 = arrayList.iterator();
                                break block63;
                            }
                            if (object3 != null) {
                                arrayList.add(object3);
                            }
                            break block64;
                        }
                        n7 = ((Ref$BooleanRef)object15).element;
                        if (n7 != 0) {
                            ((dr0_0)object7).D = null;
                        }
                        if (object2 != null && (object6 = ((FeedEngineData)object2).getLayout()) != null) {
                            Intrinsics.checkNotNullParameter(arrayList, "<this>");
                            pb3_02 = new p83_0();
                            ((p83_0)pb3_02).addAll(arrayList);
                            ((Layout)object6).setComponents((p83_0)pb3_02);
                        }
                        dr0_0.b((dr0_0)object7, (FeedEngineData)object2);
                        object6 = new HK0$d((FeedEngineData)object2);
                        ((h83_0)object5).setValue(object6);
                        object6 = hv1_1.IDLE;
                        Intrinsics.checkNotNullParameter(object6, "<set-?>");
                        pb3_02 = ((dr0_0)object7).e;
                        ((h83_0)pb3_02).setValue(object6);
                        object6 = (Boolean)((dr0_0)object7).d.getValue();
                        n7 = ((Boolean)object6).booleanValue();
                        if (n7 == 0) return Unit.a;
                        n7 = ((dr0_0)object7).v() + n4;
                        object6 = n7;
                        pb3_02 = ((dr0_0)object7).c;
                        ((h83_0)pb3_02).setValue(object6);
                        return Unit.a;
                    }
                    while (bl2 = object4.hasNext()) {
                        object14 = object15 = object4.next();
                        object14 = (Component)object15;
                        if (object14 != null) {
                            object14 = ((Component)object14).getType();
                        } else {
                            bl6 = false;
                            object14 = null;
                        }
                        if (!(bl6 = Intrinsics.areEqual(object14, object13 = "SEEN_POSTS_DIVIDER"))) continue;
                        break block58;
                    }
                    bl2 = false;
                    object15 = null;
                }
                object15 = (Component)object15;
                if (object15 == null) {
                    object14 = object4;
                    n16 = 114687;
                    object13 = null;
                    object12 = null;
                    bl7 = false;
                    object11 = null;
                    string3 = null;
                    object10 = null;
                    object9 = null;
                    object8 = null;
                    string2 = "SEEN_POSTS_DIVIDER";
                    object4 = new Component(null, null, null, null, null, null, null, null, null, null, null, null, null, null, string2, false, null, n16, null);
                    arrayList.add(object4);
                }
                if ((object4 = ((Component)object3).getSeenPosts()) != null) {
                    object4 = ((p83_0)object4).listIterator();
                    while (true) {
                        object15 = object4;
                        object15 = (ob3_2)object4;
                        bl6 = ((ob3_2)object15).hasNext();
                        if (!bl6) break;
                        object15 = (SeenPost)((ob3_2)object15).next();
                        string3 = ((Component)object3).getSubType();
                        object13 = object15 != null ? (object14 = ((SeenPost)object15).getContentType()) : null;
                        object8 = object15 != null ? (object14 = ((SeenPost)object15).getTemplate()) : null;
                        string2 = ((Component)object3).getType();
                        object10 = object15 != null ? (object14 = ((SeenPost)object15).getSubcomponent()) : null;
                        object11 = object15 != null ? (object14 = ((SeenPost)object15).getPostId()) : null;
                        object9 = object15 != null ? (object15 = ((SeenPost)object15).getSubComponentsOwner()) : null;
                        object14 = object15;
                        n16 = 100830;
                        object12 = null;
                        bl7 = false;
                        object15 = new Component((String)object13, null, null, null, null, (String)object11, null, null, null, string3, (p83_0)object10, null, (SubcomponentsOwner)object9, (String)object8, string2, false, null, n16, null);
                        arrayList.add(object15);
                    }
                }
            }
            n3 = n15;
        }
    }
}

