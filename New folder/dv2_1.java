/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.sis.SisStoreList;
import com.ril.ajio.services.data.sis.StoreInfo;
import com.ril.ajio.services.data.sis.StoreMetaData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dV2
 */
public final class dv2_1
implements F62 {
    public final /* synthetic */ vv2_2 a;

    public /* synthetic */ dv2_1(vv2_2 vv2_22) {
        this.a = vv2_22;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        vv2_2 vv2_22 = this.a;
        Intrinsics.checkNotNullParameter(vv2_22, "this$0");
        Intrinsics.checkNotNullParameter(object, "storeMetaDataDataCallback");
        Object object2 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n3 != 0) {
            n3 = ((DataCallback)object).getStatus();
            String string2 = "searchViewModel";
            Object object3 = null;
            if (n3 == 0) {
                object2 = (StoreMetaData)((DataCallback)object).getData();
                if (object2 != null) {
                    object2 = ((StoreMetaData)object2).getSisStoreList();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                if (object2 != null && (n3 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                    object2 = ((DataCallback)object).getData();
                    Intrinsics.checkNotNull(object2);
                    object2 = ((StoreMetaData)object2).getSisStoreList();
                    boolean bl2 = false;
                    Object object4 = null;
                    object2 = ((SisStoreList)((ArrayList)object2).get(0)).getStoreMetalistdto();
                    if (object2 != null && (n3 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                        boolean bl3;
                        Object object5;
                        object2 = vv2_22.t;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            object2 = null;
                        }
                        if ((object2 = ((yw2_0)object2).s) != null) {
                            object2 = g62_0.c;
                            object5 = vv2_22.t;
                            if (object5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                bl3 = false;
                                object5 = null;
                            }
                            object5 = ((yw2_0)object5).s;
                            StoreMetaData storeMetaData = (StoreMetaData)((DataCallback)object).getData();
                            ((g62_0)object2).a((String)object5, storeMetaData);
                        }
                        if ((object2 = vv2_22.t) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            object2 = null;
                        }
                        object = (StoreMetaData)((DataCallback)object).getData();
                        object5 = vv2_22.t;
                        if (object5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            bl3 = false;
                            object5 = null;
                        }
                        string2 = ((yw2_0)object5).s;
                        if (object != null && (object = ((StoreMetaData)object).getSisStoreList()) != null && (object = (SisStoreList)((ArrayList)object).get(0)) != null) {
                            object = ((SisStoreList)object).getStoreMetalistdto().iterator();
                            object4 = "iterator(...)";
                            Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                            while (bl2 = object.hasNext()) {
                                object4 = (StoreInfo)object.next();
                                object5 = ((StoreInfo)object4).storeId;
                                bl3 = Intrinsics.areEqual(object5, string2);
                                if (!bl3 || (bl3 = Intrinsics.areEqual(string2, object5 = ld3_2.STORE_AJIOGRAM.getStoreId()))) continue;
                                object3 = object4;
                                break;
                            }
                        }
                        ((yw2_0)object2).v = object3;
                        vv2_22.eb();
                    }
                }
            } else {
                int n4 = ((DataCallback)object).getStatus();
                if (n4 == (n3 = 1)) {
                    object = vv2_22.t;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n4 = 0;
                        object = null;
                    }
                    ((yw2_0)object).v = null;
                }
            }
        }
    }
}

